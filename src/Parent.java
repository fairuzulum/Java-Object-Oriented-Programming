class Parent {
    String name = "Aulia";
    void doIt(){
        System.out.println("Parent do it");
    }
}

class Child extends Parent {
    String name;
    void doIt(){
        System.out.println("Child do it");
    }
}
