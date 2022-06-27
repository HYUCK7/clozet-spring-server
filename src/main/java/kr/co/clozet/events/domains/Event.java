package kr.co.clozet.events.domains;

import kr.co.clozet.clothes.domains.Clothes;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import javax.persistence.*;

/**
 * packageName:kr.co.clozet.clothes.domains
 * fileName        :Events.java
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
@Table(name = "events")
public class Event {
    @Id
    @Column(name = "event_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY) private long event_id;
    @Column private String funeral;
    @Column private String wedding;

    @OneToOne
    @JoinColumn(name = "clothes_id")
    private Clothes clothes;




}
