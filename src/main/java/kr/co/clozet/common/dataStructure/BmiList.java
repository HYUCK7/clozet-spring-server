package kr.co.clozet.common.dataStructure;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * packageName:kr.co.clozet.common.dataStructure
 * fileName        :BmiList.java
 * author          : sungsuhan
 * date            :2022-05-11
 * desc            :
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-05-11           sungsuhan      최초 생성
 **/
// 키(height) 몸무게(weight) 생년월일(ssn)(940731-1)
public class BmiList {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        BmiService service = new BmiServiceImpl();

    }

    @Data @NoArgsConstructor
    static class Bmi{
        private double height, weight;
        private String ssn;

        public Bmi(Builder builder) {
            this.ssn = builder.ssn;
            this.height = builder.height;
            this.weight = builder.weight;
        }
        static class Builder{
            private String ssn; private double height, weight;
            public Builder ssn(String ssn){this.ssn=ssn;return this;}
            public Builder height(double height){this.height=height;return this;}
            public Builder weight(double weight){this.weight=weight;return this;}
            Bmi build(){return new Bmi(this);}
        }
    }

    interface BmiService{
        void save (Bmi bmi);
        void update (int i, Bmi bmi);
        void delete (Bmi bmi);
        List<Bmi> findAll();
        List<Bmi> findByGender(String gender);
        Bmi findById (int i);
        int count();
        void clear();

    }

    static class BmiServiceImpl implements BmiService{
        private final List<Bmi> list;

        public BmiServiceImpl() {
            this.list = new ArrayList<>();
        }


        @Override
        public void save(Bmi bmi) {
            list.add(bmi);
        }

        @Override
        public void update(int i, Bmi bmi) {
            list.set(i, bmi);
        }

        @Override
        public void delete(Bmi bmi) {
            list.remove(bmi);
        }

        @Override
        public List<Bmi> findAll() {
            return list;
        }

        @Override
        public List<Bmi> findByGender(String gender) {
            return null;
        }

        @Override
        public Bmi findById(int i) {
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
