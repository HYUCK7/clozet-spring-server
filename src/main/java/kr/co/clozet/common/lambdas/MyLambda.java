package kr.co.clozet.common.lambdas;

/**
 * packageName:kr.co.clozet.common.lambda
 * fileName        :MyLambda.java
 * author          : sungsuhan
 * date            :2022-05-13
 * desc            :
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-05-13           sungsuhan      최초 생성
 **/
public class MyLambda {
    // 4가지 기본 형태
    @FunctionalInterface interface MyFunction{
        int execute(String arg);
    }

    @FunctionalInterface interface MyConsumer{
        void execute(String arg);
    }

    @FunctionalInterface interface MySupplier{
        int execute();
    }

    @FunctionalInterface interface MyPredicate{
        boolean execute(String arg);
    }



    @FunctionalInterface interface MyInterface{
            String myMethod();
    }

    @FunctionalInterface interface MyUnaryOp{
        int operator(Integer a);
    }

    @FunctionalInterface interface LengthOfString{
        int execute(String arg);
    }

    @FunctionalInterface interface MathOperation{
        int execute(int a, int b);
    }









}
