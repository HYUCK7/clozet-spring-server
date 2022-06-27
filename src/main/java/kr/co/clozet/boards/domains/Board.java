package kr.co.clozet.boards.domains;

import com.sun.istack.NotNull;
import kr.co.clozet.articles.domains.Article;
import kr.co.clozet.closets.domains.Closet;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * packageName:kr.co.clozet.auth.domains
 * fileName        :Board.java
 * author          : sungsuhan
 * date            :2022-05-18
 * desc            :
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-05-18           sungsuhan      최초 생성
 **/
@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Component
@Entity
@Table(name="boards")
public class Board {

    @Id
    @Column(name = "board_id")
    @GeneratedValue private long boardId;
    @Column(name = "created_date") private String createdDate;
    @Column private String qna;

    @OneToMany(mappedBy = "board")
    List<Article> articles = new ArrayList<>();

    @OneToMany(mappedBy = "board")
    List<Closet> closets = new ArrayList<>();








}
