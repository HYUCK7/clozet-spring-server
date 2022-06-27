package kr.co.clozet.colors.controllers;

import kr.co.clozet.colors.services.ColorService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * packageName:kr.co.clozet.clothes.controllers
 * fileName        :ColorController.java
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
@RequestMapping("/colors")
public class ColorController {

    private final ColorService service;


}
