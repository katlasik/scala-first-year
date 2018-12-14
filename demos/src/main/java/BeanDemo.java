import java.util.Objects;

public class BeanDemo {

    class JavaUser {

        public String name;
        public int age;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }


        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            JavaUser javaUser = (JavaUser) o;
            return age == javaUser.age &&
                    Objects.equals(name, javaUser.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, age);
        }

        @Override
        public String toString() {
            return "JavaUser{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }

    public static void main(String[] args) {

        ScalaUser scalaUser = new ScalaUser("Andrzej", 33);

    }



}
