package kr.co.clozet.boards.services;

import kr.co.clozet.boards.domains.Board;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;
import java.util.Optional;

/**
 * packageName:kr.co.clozet.services
 * fileName        :BoardService.java
 * author          : sungsuhan
 * date            :2022-05-04
 * desc            :
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-05-04           sungsuhan      최초 생성
 **/
public interface BoardService {
    List<Board> findAll();

    List<Board> findAll(Sort sort);

    Page<Board> findAll(Pageable pageable);

    long count();

    String delete(Board board);

    String save(Board board);

    Optional<Board> findById(String board);

    boolean existsById(String board);
}
