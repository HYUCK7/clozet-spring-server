package kr.co.clozet.common.streams;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * packageName:kr.co.clozet.common.streams
 * fileName        :HelloStream.java
 * author          : sungsuhan
 * date            :2022-05-16
 * desc            :
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-05-16           sungsuhan      최초 생성
 **/
// 한국어로 안녕, 영어로 Hello
public class HelloStream {
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    @Getter
    public static class Hello{
        private String greeting, inLanguage;

        @Override
        public String toString() {
            return String.format("인사 : %s, %s", inLanguage,greeting);
        }
    }
    interface HelloService{
        List<Hello> greet(List<Hello> arr);
    }
    static class HelloServiceImpl implements HelloService{
        @Override
        public List<Hello> greet(List<Hello> arr) {
            return arr
                    .stream()
                    .filter(e -> e.getInLanguage().equals("영어"))
                    .collect(Collectors.toList());
        }
    }
    @Test
    void helloTest(){
        List<Hello> arr = Arrays.asList(
                Hello.builder().inLanguage("영어").greeting("Hello").build(),
                Hello.builder().inLanguage("한국어").greeting("안녕").build()
        );
        new HelloServiceImpl()
                .greet(arr)
                .forEach(System.out::print);
    }
}
