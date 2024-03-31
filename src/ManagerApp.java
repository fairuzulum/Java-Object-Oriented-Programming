public class ManagerApp {
    public static void main(String[] args) {
        Manager manager = new Manager("Fairuz");
//        manager.name = "Fairuz";
        manager.sayHello("Aulia");

        vicePresident vp = new vicePresident("Aulia");
//        vp.name = "Aulia";
        vp.sayHello("Fairuz");
    }
}
