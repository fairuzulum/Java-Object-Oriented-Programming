class vicePresident extends Manager{

    vicePresident(String name){
        super(name);
    }

    void sayHello(String name){
        System.out.println("Hello " + name + " nama saya Vp " + this.name);
    }
}
