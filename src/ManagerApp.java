public class ManagerApp {
    public static void main(String[] args) {
        Manager manager = new Manager();
        manager.name = "Fairuz";
        manager.sayHello("Aulia");

        vicePresident vp = new vicePresident();
        vp.name = "Aulia";
        vp.sayHello("Fairuz");
    }
}
