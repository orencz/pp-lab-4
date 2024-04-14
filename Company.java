public class Company {
    public static void main(String[] args) {
       
        Employee[] employees = new Employee[5];

        
        employees[0] = new Employee("Marek Mostowiak", 2500);
        employees[1] = new Employee("Piotr Skowyrski", 3000);
        employees[2] = new Employee("Pawel Kolenda", 4200);
        employees[3] = new Employee("Katarzyna Jablonska", 5300);
        employees[4] = new Employee("Pawel Pawlik", 4000);

        System.out.println(employees[3]);
        
        employees[3].setSalary(5000);

        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
