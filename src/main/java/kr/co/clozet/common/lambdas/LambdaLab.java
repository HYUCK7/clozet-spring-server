package kr.co.clozet.common.lambdas;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.Date;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * packageName:kr.co.clozet.common.lambdas
 * fileName        :LambdaLab.java
 * author          : sungsuhan
 * date            :2022-05-26
 * desc            :
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-05-26           sungsuhan      최초 생성
 **/
public class LambdaLab {
    public static String date(){
        Supplier<String> s = () -> string(LocalDate.now());
        return s.get();
    }
    public static String string(Object o){
        Function<Object, String> s = String::valueOf;
        return s.apply(o);
    }



    public static String date2(){
        Supplier<Date> s = Date::new;
        return String.valueOf(s.get());
    }

    public static String date3(){
        Supplier<String> s = () -> string(new Date());
        return s.get();
    }






    @Test
    void lambdaTest() {
        System.out.println(date());
        System.out.println(date2());
        System.out.println(date3());
    }
}
