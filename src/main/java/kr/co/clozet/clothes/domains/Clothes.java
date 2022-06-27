package kr.co.clozet.clothes.domains;

import kr.co.clozet.closets.domains.Closet;
import kr.co.clozet.colors.domains.Color;
import kr.co.clozet.events.domains.Event;
import kr.co.clozet.styles.domains.Style;
import kr.co.clozet.users.domains.User;
import kr.co.clozet.weathers.domains.Weather;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import javax.persistence.*;

/**
 * packageName:kr.co.clozet.closet.domains
 * fileName        :Clothes.java
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
@Table(name="clothes")
public class Clothes {

    @Id
    @Column(name = "clothes_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY) private long clothesId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "closet_id")
    private Closet closet;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    @OneToOne(mappedBy = "clothes")
    private Color color;

    @OneToOne(mappedBy = "clothes")
    private Weather weather;

    @OneToOne(mappedBy = "clothes")
    private Style style;

    @OneToOne(mappedBy = "clothes")
    private Event event;



}
