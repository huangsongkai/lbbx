package iphone.repository;

import iphone.dataobject.Picture;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.Table;

/**
 * Created by song on 15/11/19.
 */
@Repository
@Table(name="picture")
@Qualifier("pictureRepository")
public interface PictureRepository extends CrudRepository<Picture, Integer> {
//    List<Invoice> findByNumber(String number);
}
