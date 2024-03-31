public class PersonApp {
    public static void main(String[] args) {
        Person person = new Person("Fairuz", "Bekasi"); // membuat object
//        person.name = "Fairuz";
//        person.address = "Bekasi";
////      person.country = "Jepang"; // Erro karena final
        System.out.println(person.name);
        System.out.println(person.address);
        System.out.println(person.country);

        person.sayHello("Aulia");

        Person person2 = new Person("Fairuz");
        Person person3 = new Person();
        person3.name = "Fairuz";
        person3.address = "Jakarta";
        System.out.println(person2.name);
        System.out.println(person2.address);
        System.out.println(person3.name);
        System.out.println(person3.address);
    }
}
