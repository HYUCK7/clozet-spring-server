package kr.co.clozet.weathers.domains;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * packageName:kr.co.clozet.weathers.domains
 * fileName        :WeatherDTO.java
 * author          : sungsuhan
 * date            :2022-06-15
 * desc            :
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-06-15           sungsuhan      최초 생성
 **/
@Component @Data
public class WeatherDTO {
    @ApiModelProperty(position = 1) private long weatherId;
    @ApiModelProperty(position = 2) String temperature;
    @ApiModelProperty(position = 3) String clothesId;
}
