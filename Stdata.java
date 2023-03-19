class Stdata
{
int roll;
String name;
Stdata(int roll, String name)
{
this.roll=roll;
this.name=name;
}
Stdata(Stdata stud)
{
this.roll = stud.roll;
this.name = stud.name;
}
public static void main(String[] arg)
{
int roll = 24;
String name = "Deepak";
Stdata student = new Stdata(roll, name);
Stdata topper = new Stdata(student);
System.out.println("Student:"+ student.roll +" : "+ student.name);
System.out.println("topper:"+ topper.roll +" : "+ topper.name);
}
}