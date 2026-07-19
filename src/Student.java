public class Student {

//    Laptop lap = new Laptop();
//    Desktop des = new Desktop();

    private Computer com;

//    Student(Computer com){
//        this.com = com;
//    }

    public void setCom(Computer com){
        this.com = com;
    }

    public void study(){
        System.out.println("Student started studying..");
        com.compile();
    }

}
