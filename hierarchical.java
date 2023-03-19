import java.util.*;
class mamal
{
 void show()
 {
System.out.println("Mamal");
 }
}
class man extends mamal
{
 String name;
 man(){name="Man";}
 man(String n){name=n;}
 void show()
 {
 System.out.println("Name of Man : "+name);
 }
}
class dog extends mamal
{
 String name;
 dog(){name="Dog";}
 dog(String n){name=n;}
 void show()
 {
System.out.println("Name of Dog : "+name);
 }
}
class elephant extends mamal
{
 String name;
 elephant(){name="Elephant";}
 elephant(String n){name=n;}
 void show()
 {
 System.out.println("Name of Elephant : "+name);
 }
}
class rabbit extends mamal
{
 String name;
 rabbit(){name="Rabbit";}
 rabbit(String n){name=n;}
 void show()
 {
 System.out.println("Name of Rabbit : "+name);
}
}
class hierarchical
{
 public static void main(String args[])
 {
 Scanner sc = new Scanner(System.in);
 System.out.print("Enter name of Man : ");
 String man = sc.next();
 System.out.print("Enter name of Dog : ");
 String dog = sc.next();
 System.out.print("Enter name of Elephant : ");
 String ele = sc.next();
 System.out.print("Enter name of Rabbit : ");
 String rab = sc.next();
 man m = new man(man);
 dog d = new dog(dog);
 elephant e = new elephant(ele);
 rabbit r = new rabbit(rab); 
 System.out.println();
 m.show();
 d.show();
 e.show();
 r.show();
 }
}