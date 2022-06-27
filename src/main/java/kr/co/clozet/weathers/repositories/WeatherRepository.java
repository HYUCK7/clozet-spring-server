package kr.co.clozet.weathers.repositories;

import kr.co.clozet.weathers.domains.Weather;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * packageName:kr.co.clozet.clothes.repositories
 * fileName        :WeatherRepository.java
 * author          : sungsuhan
 * date            :2022-06-07
 * desc            :
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-06-07           sungsuhan      최초 생성
 **/
interface WeatherCustomRepository{

}






@Repository
public interface WeatherRepository extends JpaRepository<Weather, Long> {
}
