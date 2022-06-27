package kr.co.clozet.styles.repositories;

import kr.co.clozet.styles.domains.Style;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * packageName:kr.co.clozet.clothes.repositories
 * fileName        :StyleRepository.java
 * author          : sungsuhan
 * date            :2022-06-07
 * desc            :
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-06-07           sungsuhan      최초 생성
 **/
interface StyleCustomRepository{

}



@Repository
public interface StyleRepository extends JpaRepository<Style, Long> {
}
