package demo.springboot.domain;

import demo.springboot.entity.City;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Book 数据持久层操作接口
 *
 * Created by bysocket on 09/10/2017.
 */
public interface CityRepository extends JpaRepository<City, Long> {
}
