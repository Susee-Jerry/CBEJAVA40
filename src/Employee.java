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

        Employee e2 = new Employee("Kannan",102);
        System.out.println(e2);

        Employee e3 = new Employee("Rebii",103);
        System.out.println(e3);
    }
}
