package kr.co.clozet.weathers.domains;

import kr.co.clozet.clothes.domains.Clothes;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import javax.persistence.*;

/**
 * packageName:kr.co.clozet.clothes.domains
 * fileName        :Weather.java
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
@Table(name="weathers")
public class Weather {
    @Id
    @Column(name = "weather_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY) private long weatherId;
    @Column private String temperature;

    @OneToOne
    @JoinColumn(name = "clothes_id")
    private Clothes clothes;









}
