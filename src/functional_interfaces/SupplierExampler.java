package functional_interfaces;

import java.util.function.Supplier;

public class SupplierExampler {
    public static void main(String[] args) {
        Supplier<String> supplier = new Supplier<String>() {
            @Override
            public String get() {
                return "Hello";
            }
        };
        for (int i = 0; i < 10; i++) {
            System.out.println(supplier.get());
        }
    }
}
