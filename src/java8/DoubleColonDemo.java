package java8;

// x -> sout(x);
// System.out::println

interface Calculator {
    void add();
}

public class DoubleColonDemo {
    public static void show(){
        int a = 10;
        int b = 20;
        System.out.println("Result : " + (a+b));
    }
    public void display(){
        int a = 100;
        int b = 200;
        System.out.println("Result : " + (a+b));
    }
    public static void main(String[] args) {
        Calculator c = DoubleColonDemo::show; // () -> DoubleColonDemo.show();
        c.add();

        DoubleColonDemo ob = new DoubleColonDemo();

        Calculator c1 = ob::display;
        c1.add();
    }
}

interface StudentFactory {
    Student create();
}

class Student {
    Student(){
        System.out.println("Student Created");
    }

    public static void main(String[] args) {
        StudentFactory sf = Student::new; // () -> new Student();
        sf.create();
    }
}