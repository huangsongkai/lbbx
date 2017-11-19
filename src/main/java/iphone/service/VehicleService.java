package iphone.service;

import iphone.controller.BaseController;
import iphone.dataobject.CarInfo;
import iphone.dataobject.Picture;
import iphone.repository.CarInfoRepository;
import iphone.repository.PictureRepository;
import iphone.util.PageDecorator;
import iphone.util.PageUtil;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static iphone.util.Base64ToImg.GenerateImage;
import static iphone.util.FileToZip.downLoadFiles;
import static iphone.util.UumericalUtil.TruncateHeadString;

/**
 * Created by huang on 2017/4/3.
 */
@Service
public class VehicleService extends BaseController{
    @Resource
    CarInfoRepository carInfoRepository;
    @Resource
    PictureRepository pictureRepository;

    public void save(CarInfo carInfo) {
        carInfoRepository.save(carInfo);

    }

    public PageDecorator<CarInfo> query(int pageNum) {
        final PageRequest pageRequest = new PageRequest(pageNum-1, PageUtil.PAGE_SIZE);
        Page<CarInfo> pageData;
        pageData = carInfoRepository.findAll(pageRequest);
        PageDecorator pageDecorator = PageUtil.pageWrap(pageData);
        return pageDecorator;
    }

    public Map<String, Object> query1(int page, int rows) {
        // 按照id降序
        Sort sort = new Sort(Sort.Direction.DESC, "id");
        // 封装分页查询条件
        Pageable pageable = new PageRequest(page - 1, rows, sort);
        return findEasyUIData(carInfoRepository.findAll(pageable));
    }

    public void downImgs(HttpServletResponse res, int carId, HttpServletResponse response) {
        List<File> files = new ArrayList<File>();
        CarInfo carInfo = carInfoRepository.findById(carId);
        List<Picture> picture = carInfo.getPicturesList();
        int index = 0;
        String imgName = "";
        imgName+=""+carInfo.getName()+""+carInfo.getIphone();
        if (picture.size() != 0){
            for ( Picture pic: picture) {
                String base64pic=TruncateHeadString(pic.getBase(),22);
                String picAddress = GenerateImage(base64pic,index+imgName);
                File file=new File(picAddress);
                files.add(file);
                index++;
                pic.setFileaddres(picAddress);
                pictureRepository.save(pic);
            }
            try {
                downLoadFiles(files, response, imgName );
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

    public void delete(Integer carId) {
        carInfoRepository.delete(carId);
    }
}
