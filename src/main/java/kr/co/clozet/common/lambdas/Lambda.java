package kr.co.clozet.common.lambdas;

import org.junit.jupiter.api.Test;

import static kr.co.clozet.common.dataStructure.AppleList.Apple;

import java.io.File;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.function.*;

/**
 * packageName:kr.co.clozet.common.lambda
 * fileName        :LambdaUtil.java
 * author          : sungsuhan
 * date            :2022-05-11
 * desc            :
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-05-11           sungsuhan      최초 생성
 **/
public class Lambda {

    // int i = Integer.parseInt("900");
    public static int integer(String arg){
        Function<String, Integer> f = Integer::parseInt;
        return f.apply(arg);
    }
    public static String date(){
        Supplier<String> s = () -> string(LocalDate.now());
        return s.get();
    }
    public static long longParse(String s){
        Function<String, Long> f = Long::parseLong;
        return f.apply(s);
    }
    public static float floatParse(String s){
        Function<String, Float> f = Float::parseFloat;
        return f.apply(s);
    }
    // String s = String.valueOf(o)
    public static String string(Object o){
        Function<Object, String> s = String::valueOf;
        return s.apply(o);
    }
    public static boolean equals(String s1, String s2){
        BiPredicate<String, String> f = String::equals;
        return f.test(s1, s2);
    }
    // int[] arr = new int[8];
    public static int[] array(int i){
        Function<Integer, int[]> a = int[]::new;
        return a.apply(i);
    }
    // int r = random(1, 6)
    public static int random(int min, int max){
        BiFunction<Integer, Integer, Integer> r = (t, u) -> (int)(Math.random()*u)+t;
        return r.apply(min, max);
    }
    // File file = new File("d:\\example\\new_directory");
    public static File makeFile(String s){
        Function<String, File> f = File::new;
        return f.apply(s);
    }

    @Test
    void lambdaTest() {
        System.out.println(Lambda.integer("900"));
        System.out.println(Lambda.string(1200));
        System.out.println(string(new Apple.Builder().origin("영동").color("RED").price(3000).build()));
        System.out.println(
                string(
                        Arrays.asList(
                                new Apple.Builder().origin("영동").color("RED").price(1000).build(),
                                new Apple.Builder().origin("영동").color("BLUE").price(2000).build(),
                                new Apple.Builder().origin("풍기").color("RED").price(3000).build()
                        ))
        );
        System.out.println(Lambda.equals("1", "3"));
        System.out.println(array(7).length);
        System.out.println(random(1,6));
    }










}
