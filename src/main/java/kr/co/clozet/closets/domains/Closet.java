package kr.co.clozet.closets.domains;

import kr.co.clozet.boards.domains.Board;
import kr.co.clozet.clothes.domains.Clothes;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * packageName:kr.co.clozet.closet.domains
 * fileName        :Closet.java
 * author          : sungsuhan
 * date            :2022-05-29
 * desc            :
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-05-29           sungsuhan      최초 생성
 **/
@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Component
@Entity
@Table(name="closets")
public class Closet {
    @Id
    @Column(name = "closet_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY) private long closetId;
    @Column private String clothesClassification;
    @Column private String clothesRegister;

    @OneToMany(mappedBy = "closet")
    List<Clothes> clothes = new ArrayList<>();

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "board_id")
    private Board board;


}
