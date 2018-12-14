import lombok.Data;

public class LombokDemo {

    @Data
    static class JavaUser {
        private String name;
        private int age;
    }

    public static void main(String[] args) {

        JavaUser user = new JavaUser();

    }


}
