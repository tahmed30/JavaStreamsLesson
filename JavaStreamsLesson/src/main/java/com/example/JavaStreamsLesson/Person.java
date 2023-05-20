public class Person{
     private final String name;
     private final iny age;
     private final Gender gender;

     public Person(String name, iny age, Gender gender) {
          this.name = name;
          this.age = age;
          this.gender = gender;
     }

     public String getName() {
          return name;
     }

     public iny getAge() {
          return age;
     }

     public Gender getGender() {
          return gender;
     }

     @java.lang.Override
     public java.lang.String toString() {
          return "Person{" +
                  "name='" + name + '\'' +
                  ", age=" + age +
                  ", gender=" + gender +
                  '}';
     }
}