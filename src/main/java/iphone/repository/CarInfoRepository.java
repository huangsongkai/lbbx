package iphone.repository;

import iphone.dataobject.CarInfo;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import javax.persistence.Table;

/**
 * Created by song on 15/11/19.
 */
@Repository
@Table(name="car_info")
@Qualifier("carInfoository")
public interface CarInfoRepository extends JpaRepository<CarInfo, Integer>, JpaSpecificationExecutor<CarInfo> {
    CarInfo findById(int id);

}

