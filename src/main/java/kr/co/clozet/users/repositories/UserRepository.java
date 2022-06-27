package kr.co.clozet.users.repositories;

import kr.co.clozet.users.domains.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

/**
 * packageName:kr.co.clozet.repositories
 * fileName        :UserRepository.java
 * author          : sungsuhan
 * date            :2022-05-03
 * desc            :
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-05-03           sungsuhan      최초 생성
 **/

interface UserCustomRepository{
    // 000. 사용자의 비밀번호를 수정하시오
    @Modifying(clearAutomatically = true)
    @Query(value = "update user u set u.password where u.userId",
            nativeQuery = true)
    List<User> update();


}


@Repository
public interface UserRepository extends JpaRepository<User, Long>, UserCustomRepository {
    Optional<User> findByUsername(String username);

    @Override
    List<User> update();

}

