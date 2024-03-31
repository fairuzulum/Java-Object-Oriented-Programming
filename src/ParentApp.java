public class ParentApp {
    public static void main(String[] args) {
        Child child = new Child();
        child.name = "Fairuz";
        System.out.println(child.name);

        Parent parent = (Parent) child;
        System.out.println(parent.name);
    }
}
