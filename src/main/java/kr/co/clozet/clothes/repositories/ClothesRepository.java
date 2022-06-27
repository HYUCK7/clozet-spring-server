package kr.co.clozet.clothes.repositories;

import kr.co.clozet.clothes.domains.Clothes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * packageName:kr.co.clozet.closet.repositories
 * fileName        :ClothesRepository.java
 * author          : sungsuhan
 * date            :2022-05-29
 * desc            :
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-05-29           sungsuhan      최초 생성
 **/
interface ClothesCustomRepository{

}


@Repository
public interface ClothesRepository extends JpaRepository<Clothes, Long> {
}
