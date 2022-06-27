package kr.co.clozet.colors.domains;

import kr.co.clozet.clothes.domains.Clothes;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import javax.persistence.*;

/**
 * packageName:kr.co.clozet.clothes.domains
 * fileName        :Colors.java
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
@Table(name="colors")
public class Color {
    @Id
    @Column(name = "color_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY) private long colorId;
    @Column private String black;
    @Column private String white;
    @Column private String pink;
    @Column private String green;
    @Column private String grey;
    @Column private String orange;
    @Column private String blue;

    @OneToOne
    @JoinColumn(name = "clothes_id")
    private Clothes clothes;

}
