import java.awt.*;
public class Calculator extends Frame
{
private Label lb1,lb2;TextField txt,t1;Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15;
public Calculator()
{
lb2 = new Label("Enter a Number:         ");
t1 = new TextField(10);
b0 = new Button("7");
b1 = new Button("8");
b2 = new Button("9");
b3 = new Button("Clear    ");
b4 = new Button("4");
b5 = new Button("5");
b6 = new Button("6");
b7 = new Button("/       ");
b8 = new Button("1");
b9 = new Button("2");
b10 = new Button("3");
b11 = new Button("+     ");
b12 = new Button("00");
b13 = new Button("0");
b14 = new Button(".");
b15 = new Button("=");
}
public void launchFrame()
{
add(lb2);add(t1);add(b0);add(b1);add(b2);add(b3);add(b4);add(b5);
add(b6);add(b7);add(b8);add(b9);add(b10);add(b11);add(b12);add(b13);add(b14);add(b15);
setLayout(new FlowLayout());
setSize(220,200);
setVisible(true);}
public static void main(String args[])
{
Calculator lp = new Calculator();
lp.launchFrame();
}
}

