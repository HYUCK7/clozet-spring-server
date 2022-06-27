package kr.co.clozet.colors.repositories;

import kr.co.clozet.colors.domains.Color;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * packageName:kr.co.clozet.clothes.repositories
 * fileName        :ColorRepository.java
 * author          : sungsuhan
 * date            :2022-06-07
 * desc            :
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-06-07           sungsuhan      최초 생성
 **/
interface ColorCustomRepository{

}



@Repository
public interface ColorRepository extends JpaRepository<Color, Long> {
}
