package kr.co.clozet.events.domains;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * packageName:kr.co.clozet.events.domains
 * fileName        :EventDTO.java
 * author          : sungsuhan
 * date            :2022-06-15
 * desc            :
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-06-15           sungsuhan      최초 생성
 **/
@Component @Data
public class EventDTO {
    @ApiModelProperty(position = 1) private long eventId;
    @ApiModelProperty(position = 2) String funeral;
    @ApiModelProperty(position = 3) String wedding;
    @ApiModelProperty(position = 4) String clothesId;
}
