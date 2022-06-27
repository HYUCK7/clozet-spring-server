package kr.co.clozet.common.json;


import com.fasterxml.jackson.databind.ObjectMapper;


import java.io.File;
import java.net.URL;
import java.util.Map;

/**
 * packageName:kr.co.clozet.json
 * fileName        :JsonFileToObject.java
 * author          : sungsuhan
 * date            :2022-06-07
 * desc            :
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-06-07           sungsuhan      최초 생성
 **/
public class JsonFileToObject {
    public static void main(String[] args) throws Exception {

        URL path = JsonFileToObject.class.getResource("/clothes/user.json");

        File jsonFile = new File(path.getFile());

        ObjectMapper mapper = new ObjectMapper();

        Map<String, Object> jsonMap = mapper.readValue(jsonFile, Map.class);

        System.out.println("JSON File --> Map");

        System.out.println(jsonMap.toString());
    }

}
