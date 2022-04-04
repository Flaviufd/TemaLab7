package ro.fasttrackit.Lab7Tema;

public class Person {
    public String name;
    public int age;
    public String married;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        //System.out.println("Name: " + name);
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        //System.out.println("Age: " + age);
        return age;
    }

    public String isMarried(String married) {
        return married;
    }

    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setName("John");
        person1.setAge(23);
        System.out.println("Person1 name is: " + person1.getName() + ", age is: " + person1.getAge() + " and " + person1.isMarried("is married"));

        Person person2 = new Person();
        person1.setName("Mary");
        person1.setAge(44);
        System.out.println("Person2 name is: " + person1.getName() + ", age is: " + person1.getAge() + " and " + person1.isMarried("is not married"));

        Person person3 = new Person();
        person1.setName("Hans");
        person1.setAge(12);
        System.out.println("Person3 name is: " + person1.getName() + ", age is: " + person1.getAge() + " and " + person1.isMarried("is not married"));
    }
}
