package kr.co.clozet.events.repositories;

import kr.co.clozet.events.domains.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * packageName:kr.co.clozet.clothes.repositories
 * fileName        :EventRepository.java
 * author          : sungsuhan
 * date            :2022-06-07
 * desc            :
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-06-07           sungsuhan      최초 생성
 **/
interface EventCustomRepository{

}

@Repository
public interface EventRepository extends JpaRepository<Event, Long> {
}
