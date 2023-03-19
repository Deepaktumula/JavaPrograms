import java.awt.*;
public class LoginPage extends Frame
{
private Label lb1,lb2,lb3;TextField txt,t1,t2;Button b1,b2;
public LoginPage()
{
lb1 = new Label("        LoginPage         ");
lb2 =  new Label("User ID:     ");
lb3 =  new Label("Password:     ");
t1 = new TextField(10);
t2 = new TextField(10);
b1 = new Button("Login");
b2 = new Button("Cancel");
}
public void launchFrame()
{
add(lb1);add(lb2);add(t1);add(lb3);add(t2);add(b1);add(b2);
setLayout(new FlowLayout());
setSize(220,200);
setVisible(true);}
public static void main(String args[])
{
LoginPage lp = new LoginPage();
lp.launchFrame();
}
}

