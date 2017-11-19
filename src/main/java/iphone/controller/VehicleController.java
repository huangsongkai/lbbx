package iphone.controller;

import iphone.dataobject.CarInfo;
import iphone.service.VehicleService;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

/**
 * Created by huang on 2017/3/25.
 */
@Controller  //声明是controller
@EnableAutoConfiguration  //按照默认配置启动
@RequestMapping("/iphone") // 路由名
public class VehicleController extends BaseController{
    @Resource
    VehicleService vehicleService;
    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String redirectAdd(){
        return "/iphonePages/vehicleInformation/add";
    }
    @RequestMapping(value = "/ok", method = RequestMethod.GET)
    public String rediok(){
        return "/ok";
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    @ResponseBody
    public String redirectSaveAdd(@RequestBody CarInfo carInfo){
        System.out.println("姓名"+carInfo.getName());
        System.out.println("时间"+carInfo.getPurchasedate());
        vehicleService.save(carInfo);
        return "OK";

    }
    //查询全部信息带分页
    @RequestMapping(value = "/query/{pageNum}", method = RequestMethod.GET)
    @ResponseBody
    public Map<String, Object>redirectquery(@RequestParam(name = "page", defaultValue = "1") int page, @RequestParam(name = "rows", defaultValue = "10") int rows){
        return vehicleService.query1(page,rows);

    }

    //跳转查询页
    @RequestMapping(value = "/query", method = RequestMethod.GET)
    public String redirectquerytiao(){
        return "/computerPages/query";
    }

    //图片打包下载
    @RequestMapping(value = "/downImgs/{carId}", method = RequestMethod.POST)
    public void downImgs(HttpServletResponse res, @PathVariable Integer carId, HttpServletResponse response){
        vehicleService.downImgs(res, carId, response);
    }
    //删除
    @RequestMapping(value = "/delete/{carId}", method = RequestMethod.POST)
    public void delete( @PathVariable Integer carId){
        vehicleService.delete(carId);
    }



}
