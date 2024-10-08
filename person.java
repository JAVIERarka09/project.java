package Projek;

public class person{
    String name;
    int age;

    public person(String n, int a) {
        name = n;
        age = a;

    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void print() {
        System.out.println("name: " + this.name);
        System.out.println("umur: " + this.age);
    }

    

}

