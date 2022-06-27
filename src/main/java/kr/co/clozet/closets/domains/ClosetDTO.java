package kr.co.clozet.closets.domains;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * packageName:kr.co.clozet.closets.domains
 * fileName        :ClosetDTO.java
 * author          : sungsuhan
 * date            :2022-06-15
 * desc            :
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-06-15           sungsuhan      최초 생성
 **/
@Component @Data
public class ClosetDTO {
    @ApiModelProperty(position = 1) private long closetId;
    @ApiModelProperty(position = 2) String clothesClassification;
    @ApiModelProperty(position = 3) String boardId;
    @ApiModelProperty(position = 4) private String clothesRegister;
}
