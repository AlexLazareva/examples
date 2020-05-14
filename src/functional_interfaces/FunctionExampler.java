package functional_interfaces;

import java.util.function.Function;

public class FunctionExampler {
    public static void main(String[] args) {
        Function<String, Integer> function = new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return s.length();
            }
        };

        System.out.println(function.apply("Привет"));
    }
}
