class College{
protected String name,city;
void display(){
System.out.println("College name::" +name);
System.out.println("Location::" +city);
}
void setdata(String str1,String str2)
{
name = str1;
city = str2;
}
}
class Department extends College 
{
protected String deptname;
void setdata(String s1,String s2,String s3)
{
super.setdata(s1,s2);
deptname=s3;
}
void display()
{
super.display();
System.out.println("Department name::" +deptname);
}
}
class Professor extends Department
{
String profname, qualifications;
void setdata(String s1,String s2,String s3,String s4,String s5)
{
super.setdata(s1,s2,s3);
profname = s4;
qualifications = s5;
}
void display()
{
super.display();
System.out.println("Professor name is::" +profname);
System.out.println("Qualification is::" +qualifications);
}
public static void main(String args[])
{
Professor p1=new Professor();
p1.setdata("Nist","Bam","CSE","Deepak","B.tech 2nd year");
p1.display();
}
}
