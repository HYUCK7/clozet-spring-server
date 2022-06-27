package kr.co.clozet.styles.domains;

import kr.co.clozet.clothes.domains.Clothes;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import javax.persistence.*;

/**
 * packageName:kr.co.clozet.clothes.domains
 * fileName        :Styles.java
 * author          : sungsuhan
 * date            :2022-06-05
 * desc            :
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-06-05           sungsuhan      최초 생성
 **/
@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Component
@Entity
@Table(name = "styles")
public class Style {
    @Id
    @Column(name = "style_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY) private long style_id;
    @Column private String fit;
    @Column private String print;

    @OneToOne
    @JoinColumn(name = "clothes_id")
    private Clothes clothes;
}
