public class PolymorphismApp {
    public static void main(String[] args) {
        Employee employee = new Employee("Fairuz");
        employee.sayHello("Aulia");

        employee = new Manager("Faruz");
        employee.sayHello("Aulia");

        employee = new vicePresident("Faruz");
        employee.sayHello("Aulia");

        sayHello(new Employee("Fairuz"));
        sayHello(new Manager("Fairuz"));
        sayHello(new vicePresident("Fairuz"));
    }

    static void sayHello(Employee employee) {
        System.out.println("Hello " + employee.name);
    }
}
