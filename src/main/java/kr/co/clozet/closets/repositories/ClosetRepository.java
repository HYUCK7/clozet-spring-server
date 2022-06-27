package kr.co.clozet.closets.repositories;

import kr.co.clozet.closets.domains.Closet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * packageName:kr.co.clozet.closet.repositories
 * fileName        :ClosetRepository.java
 * author          : sungsuhan
 * date            :2022-05-29
 * desc            :
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-05-29           sungsuhan      최초 생성
 **/
interface ClosetCustomRepository{

}


@Repository
public interface ClosetRepository extends JpaRepository<Closet, Long> {
}
