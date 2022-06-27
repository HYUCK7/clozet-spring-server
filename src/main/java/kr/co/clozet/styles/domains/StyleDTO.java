package kr.co.clozet.styles.domains;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * packageName:kr.co.clozet.styles.domains
 * fileName        :StyleDTO.java
 * author          : sungsuhan
 * date            :2022-06-15
 * desc            :
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-06-15           sungsuhan      최초 생성
 **/
@Component @Data
public class StyleDTO {
    @ApiModelProperty(position = 1) private long styleId;
    @ApiModelProperty(position = 2) String fit;
    @ApiModelProperty(position = 3) String print;
    @ApiModelProperty(position = 4) String clothesId;
}
