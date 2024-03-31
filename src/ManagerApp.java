public class ManagerApp {
    public static void main(String[] args) {
        Manager manager = new Manager();
        manager.name = "Fairuz";
        manager.sayHello("Aulia");

        vicePresident vicePresident = new vicePresident();
        vicePresident.name = "Aulia";
        vicePresident.sayHello("Fairuz");
    }
}
