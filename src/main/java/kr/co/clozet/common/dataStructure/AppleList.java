package kr.co.clozet.common.dataStructure;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import static kr.co.clozet.common.lambdas.Lambda.*;

/**
 * packageName:kr.co.clozet.common.dataStructure
 * fileName        :AppleList.java
 * author          : sungsuhan
 * date            :2022-05-11
 * desc            :
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-05-11           sungsuhan      최초 생성
 **/
// Apple color price origin
public class AppleList {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        AppleService service = new AppleServiceImpl();
        while(true){
            System.out.println("0.exit 1.save 2.update 3.delete 4.findAll 5.findByOrigin 6.findByColor 7.findById 8.count 9.clear 10.lambda");
            switch (s.next()){
                case "0":return;
                case "1":
                    Apple yd = new Apple.Builder()
                            .origin("영동")
                            .color("RED")
                            .price(1000)
                            .build();
                    service.save(yd);
                    Apple yd2 = new Apple.Builder()
                            .origin("영동")
                            .color("BLUE")
                            .price(1500)
                            .build();
                    service.save(yd2);
                    Apple pg = new Apple.Builder()
                            .origin("풍기")
                            .color("RED")
                            .price(2000)
                            .build();
                    service.save(pg);
                    break;
                case "2":

                    break;
                case "3":

                    break;
                case "4":
                    System.out.println("모든 사과 스펙: "+service.findAll());
                    break;
                case "5":
                    System.out.println("영동 지역 사과");
                    System.out.println(service.findByOrigin("영동"));
                    break;
                case "6":
                    System.out.println("파란색 사과");
                    System.out.println(service.findByColor("BLUE"));
                    break;
                case "7":
                    System.out.println(service.findById(0));
                    break;
                case "8":
                    System.out.println("총 사과 수: "+service.count()+" 개");
                    break;
                case "9":
                    service.clear();
                    break;
                case "10":
                    System.out.println("사과 가격은 "+ integer("1000"));
                    System.out.println("내가 만든 배열의 사이즈는 "+ array(7));
                    break;
                default:break;
            }
        }
    }
    @Data public static class Apple{
        private String color, origin;
        private int price;

        public Apple(Builder builder) {
            this.color = builder.color;
            this.origin = builder.origin;
            this.price = builder.price;
        }
        @NoArgsConstructor static public class Builder{
            private String color, origin;
            private int price;
            public Builder color(String color){this.color=color; return this;}
            public Builder origin(String origin){this.origin=origin; return this;}
            public Builder price(int price){this.price=price; return this;}
            public Apple build(){ return new Apple(this);}
        }
        @Override public String toString(){
            return String.format("[사과 스펙] origin: %s, color: %s, price: %d",
                    origin, color, price);
        }
    }
    interface AppleService{
        void save(Apple apple);
        void update(int i, Apple apple);
        void delete(Apple apple);
        List<Apple> findAll();
        List<Apple> findByOrigin(String origin);
        List<Apple> findByColor(String color);
        Apple findById(int i);
        int count();
        void clear();
    }
    static class AppleServiceImpl implements AppleService{
        private final List<Apple> list;

        public AppleServiceImpl() {
            this.list = new ArrayList<>();
        }

        @Override
        public void save(Apple apple) {
            list.add(apple);
        }

        @Override
        public void update(int i, Apple apple) {
            list.set(i, apple);
        }

        @Override
        public void delete(Apple apple) {
            list.remove(apple);
        }

        @Override
        public List<Apple> findAll() {
            return list;
        }

        @Override
        public List<Apple> findByOrigin(String origin) {
            return list.stream()
                    .filter(apple -> apple.getOrigin().equals(origin))
                    .collect(Collectors.toList());
        }

        @Override
        public List<Apple> findByColor(String color) {
            return list.stream()
                    .filter(apple -> apple.getColor().equals(color))
                    .collect(Collectors.toList());
        }

        @Override
        public Apple findById(int i) {
            return list.get(i);
        }

        @Override
        public int count() {
            return list.size();
        }

        @Override
        public void clear() {
            list.clear();
        }
    }








}
