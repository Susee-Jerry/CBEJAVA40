public class Employee {
    String name;
    int id;

    Employee(String name,int id){
        this.name = name;
        this.id = id;
    }
    public static void main(String[] args) {
        Employee e1 = new Employee("Suseendar",101);
        System.out.println(e1);
    }
}
