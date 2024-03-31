public class PersonApp {
    public static void main(String[] args) {
        Person person = new Person(); // membuat object
        person.name = "Fairuz";
        person.address = "Bekasi";
//        person.country = "Jepang"; // Erro karena final
        System.out.println(person.name);
        System.out.println(person.address);
        System.out.println(person.country);

        person.sayHello("Aulia");
    }
}
