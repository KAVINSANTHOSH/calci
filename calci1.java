import java.awt.event.*;
import java.awt.*;
class cal extends Frame implements ActionListener
{
TextField t1;
Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17;
String s1,s2,s3,s4,s5,s6,s7,s8,s9,s10;
int a,b,c,d,add,sub,mul,adds,muls;
int ac=0,sc=0,mc=0,ec=0,scc=0,mcc=0,acc=0;
int x,y,z,m,exp;
int c1=0,c2=0,c3=0,c4=0;
int i1,i2,i3,i4,i5;
int a1,a2,av;
cal()
{
setLayout(new FlowLayout());
t1=new TextField(20);
b1=new Button("1");b6=new Button("6");b11=new Button("+");
b2=new Button("2");b7=new Button("7");b12=new Button("-");
b3=new Button("3");b8=new Button("8");b13=new Button("*");
b4=new Button("4");b9=new Button("9");b14=new Button("=");
b5=new Button("5");b10=new Button("0");b15=new Button("CLEAR");
b1.addActionListener(this);b8.addActionListener(this);
b2.addActionListener(this);b9.addActionListener(this);
b3.addActionListener(this);b10.addActionListener(this);
b4.addActionListener(this);b11.addActionListener(this);
b5.addActionListener(this);b12.addActionListener(this);
b6.addActionListener(this);b13.addActionListener(this);
b7.addActionListener(this);b14.addActionListener(this);b15.addActionListener(this);
add(t1);add(b1);add(b2);add(b3);add(b4);add(b5);add(b6);add(b7);add(b8);add(b9);add(b10);add(b11);add(b12);add(b13);add(b14);add(b15);
setVisible(true);
setSize(400,400);
setTitle("CALCI");
s1="";
s2="";
s9="";
s10="";
}
public void actionPerformed(ActionEvent ae)
{
if(ae.getSource()==b1)
{
t1.setText("1");
s1=t1.getText();
s2+=s1;
t1.setText(s2);
}
if(ae.getSource()==b2)
{
t1.setText("2");
s1=t1.getText();
s2+=s1;
t1.setText(s2);
}
if(ae.getSource()==b3)
{
t1.setText("3");
s1=t1.getText();
s2+=s1;
t1.setText(s2);
}
if(ae.getSource()==b4)
{
t1.setText("4");
s1=t1.getText();
s2+=s1;
t1.setText(s2);
}
if(ae.getSource()==b5)
{
t1.setText("5");
s1=t1.getText();
s2+=s1;
t1.setText(s2);
}
if(ae.getSource()==b6)
{
t1.setText("6");
s1=t1.getText();
s2+=s1;
t1.setText(s2);
}
if(ae.getSource()==b7)
{
t1.setText("7");
s1=t1.getText();
s2+=s1;
t1.setText(s2);
}
if(ae.getSource()==b8)
{
t1.setText("8");
s1=t1.getText();
s2+=s1;
t1.setText(s2);
}
if(ae.getSource()==b9)
{
t1.setText("9");
s1=t1.getText();
s2+=s1;
t1.setText(s2);
}
if(ae.getSource()==b10)
{
t1.setText("0");
s1=t1.getText();
s2+=s1;
t1.setText(s2);
}
if(ae.getSource()==b11)//ADD BUTTON
{
c1=1;
ac=1;
s3=t1.getText();
t1.setText("");
s10=t1.getText();
s2="";
}
if(ae.getSource()==b12)//SUB BUTTON
{
c2=1;
sc=1;
scc++;
s5=t1.getText();
t1.setText("");
s9=t1.getText();
s2="";
}
if(ae.getSource()==b13)//MUL BUTTON
{
mcc=1;
c3=1;
mc=1;
s6=t1.getText();
t1.setText("");
s2="";
}
if(ae.getSource()==b14)//EQUAL BUTTON
{
c4=1;
ec=1;
s4=t1.getText();
t1.setText("=");
}
if(mc==1&&ec==1&&sc==1)//-INPUT MUL
{
s7="-";
s8=s7+s6;
c=Integer.parseInt(s8);
d=Integer.parseInt(s4);
adds=c*d;
t1.setText(""+adds);
}
else if(sc==1&&ac==1&&ec==1)//-INPUT ADD
{
s7="-";
s8=s7+s3;
c=Integer.parseInt(s8);
d=Integer.parseInt(s4);
adds=c+d;
t1.setText(""+adds);
}
else if(scc>0&&ec==1)//-INPUT SUB
{
s7="-";
s8=s7+s5;
c=Integer.parseInt(s8);
d=Integer.parseInt(s4);
adds=c-d;
t1.setText(""+adds);
}
else if(ac==1&&ec==1)//ADD
{
acc=1;
a=Integer.parseInt(s3);
b=Integer.parseInt(s4);
add=a+b;
t1.setText(""+add);
s9=t1.getText();
}
else if(sc==1&&ec==1)//SUB
{
a=Integer.parseInt(s5);
b=Integer.parseInt(s4);
sub=a-b;
t1.setText(""+sub);
}
else if(mc==1&&ec==1)//MUL
{
a=Integer.parseInt(s6);
b=Integer.parseInt(s4);
mul=a*b;
t1.setText(""+mul);
}
if(acc==1&&ec==1)
{
s4="";
s3="";
}
if(c1==1&&c2==1&&c3==1&&c4==1)//EXPRESSION
{
x=Integer.parseInt(s3);
y=Integer.parseInt(s5);
z=Integer.parseInt(s6);
m=Integer.parseInt(s4);
exp=x+y-z*m;
t1.setText(""+exp);
}
if(ae.getSource()==b15)//CLEAR BUTTON
{
t1.setText("");
s1="";
s2="";
s3="";
s4="";
s5="";
s6="";
s7="";
c1=0;
c2=0;
c3=0;
c4=0;
ac=0;
sc=0;
mc=0;
ec=0;
}
}
}
public class calci1
{
public static void main(String str[])
{
cal o1=new cal();
}
}




























