import java.util.Scanner;
class Person{
    String name;
    int age;
    String gender;
    Person(){
        name = "Sachi ";
        age = 9;
        gender = "F";
    }
    Person(String name, int age, String gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    Person(Person person){
        this.name = person.name;
        this.age = person.age;
        this.gender = person.gender;
    }
    void show(){
        System.out.println("\nPerson Name: "+ name);
        System.out.println("Person Age: "+ age);
        System.out.println("Person Gender: "+ gender);
    }

    public static void main(String []args){
        Scanner scan = new Scanner(System.in);
        String name;
        int age;
        String gender;

        System.out.print("Input name of person: ");
        name = scan.nextLine();
        
        System.out.print("Input age of person: ");
        age = scan.nextInt();
        
        System.out.print("Input gender of person: ");
        gender = scan.next();
        
        Person person1 = new Person();
        person1.show();

        Person person2 = new Person(name, age, gender);
        person2.show();

        Person person3 = new Person(person2);
        person2.show();

    }
}