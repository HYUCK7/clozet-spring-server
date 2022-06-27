package kr.co.clozet.weathers.controllers;

import kr.co.clozet.weathers.services.WeatherService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * packageName:kr.co.clozet.clothes.controllers
 * fileName        :WeatherController.java
 * author          : sungsuhan
 * date            :2022-06-07
 * desc            :
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-06-07           sungsuhan      최초 생성
 **/
@RestController
@RequiredArgsConstructor
@RequestMapping("/weathers")
public class WeatherController {
    private final WeatherService service;


}
