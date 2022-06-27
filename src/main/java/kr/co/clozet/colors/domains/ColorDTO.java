package kr.co.clozet.colors.domains;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * packageName:kr.co.clozet.colors.domains
 * fileName        :ColorDTO.java
 * author          : sungsuhan
 * date            :2022-06-15
 * desc            :
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-06-15           sungsuhan      최초 생성
 **/
@Component @Data
public class ColorDTO {
    @ApiModelProperty(position = 1) private long colorId;
    @ApiModelProperty(position = 2) String black;
    @ApiModelProperty(position = 3) String white;
    @ApiModelProperty(position = 4) String pink;
    @ApiModelProperty(position = 5) String green;
    @ApiModelProperty(position = 6) String grey;
    @ApiModelProperty(position = 7) String orange;
    @ApiModelProperty(position = 8) String blue;
    @ApiModelProperty(position = 9) String clothesId;
}
