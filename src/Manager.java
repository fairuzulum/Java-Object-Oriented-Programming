class Manager extends Employee {
    String Company;

    Manager(String name) {
        super(name);
    }

    Manager(String name, String Company) {
        super(name);
        this.Company = Company;
    }

    void sayHello(String name) {
        System.out.println("Hello " + name + " nama saya manager " + this.name);
    }
}
