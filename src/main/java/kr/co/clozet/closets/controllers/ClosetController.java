package kr.co.clozet.closets.controllers;

import kr.co.clozet.closets.domains.Closet;
import kr.co.clozet.closets.services.ClosetService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * packageName:kr.co.clozet.closet.controllers
 * fileName        :ClosetController.java
 * author          : sungsuhan
 * date            :2022-05-29
 * desc            :
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-05-29           sungsuhan      최초 생성
 **/
@RestController
@RequiredArgsConstructor
@RequestMapping("/closets")
public class ClosetController {

    private final ClosetService service;

    @DeleteMapping("/delete")
    public String delete(@RequestBody Closet closet) {
        return service.delete(closet);
    }


}
