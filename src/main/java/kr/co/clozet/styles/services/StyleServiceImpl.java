package kr.co.clozet.styles.services;

import kr.co.clozet.styles.repositories.StyleRepository;
import kr.co.clozet.styles.services.StyleService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * packageName:kr.co.clozet.clothes.services
 * fileName        :StyleServiceImpl.java
 * author          : sungsuhan
 * date            :2022-06-07
 * desc            :
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-06-07           sungsuhan      최초 생성
 **/
@Service
@RequiredArgsConstructor
public class StyleServiceImpl implements StyleService {

    private final StyleRepository repository;
}
