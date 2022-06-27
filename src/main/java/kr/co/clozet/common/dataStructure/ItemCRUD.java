package kr.co.clozet.common.dataStructure;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * packageName:kr.co.clozet.common.dataStructure
 * fileName        :ItemCRUD.java
 * author          : sungsuhan
 * date            :2022-05-10
 * desc            :
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-05-10           sungsuhan      최초 생성
 **/
public class ItemCRUD {

    //domain
    @Data @AllArgsConstructor
    static class Item{
        private int id;
        private String name;
        private int price;


    }

    //controller
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ItemService service = new ItemServiceImpl();

    }

    //service
    interface ItemService{

    }

    static class ItemServiceImpl implements ItemService{
        private final Map<String, Item> map;

        ItemServiceImpl() {this.map = new HashMap<>();}

    }

}
