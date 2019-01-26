
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;



public class Cal extends JFrame{
    JLabel value1;
    //JLabel value2;
  //  JLabel ans;
    JButton add;
    JButton sub;
    JButton mul;
    JButton div;
    JButton eql;

    JButton num1;
    JButton num2;
    JButton num3;
    JButton num4;
    JButton num5;
    JButton num6;
    JButton num7;
    JButton num8;
    JButton num9;
    JButton num0;
    JButton numNull;
    
    int previousNum;
    String operator;
    JTextField val1;
//    JTextField val2;
  //  JTextField ansr;
    
    public Cal(){
        super("Calculator");
        this.setSize(350,500);
        this.setLocation(300, 200);
        this.setLayout(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    

    public void addComponents(){
        value1=new JLabel("INPUT");
        //value2=new JLabel("Number 2:");
      //  ans=new JLabel("Answer:");
        
        val1=new JTextField();
    //    val2=new JTextField();
     //   ansr=new JTextField();
    
        add=new JButton(" + ");
        sub=new JButton(" - ");
        mul=new JButton(" * ");
        div=new JButton(" / ");
        eql=new JButton(" = ");
        
        num1=new JButton(" 1 ");
        num2=new JButton(" 2 ");
        num3=new JButton(" 3 ");
        num4=new JButton(" 4 ");  
        num5=new JButton(" 5 ");
        num6=new JButton(" 6 ");
        num7=new JButton(" 7 ");
        num8=new JButton(" 8 ");
        num9=new JButton(" 9 ");
        num0=new JButton(" 0 ");
        numNull=new JButton(" . ");
        
        this.value1.setBounds(10,40,50,20);
        this.val1.setBounds(10,60,300,50);
       //this.value2.setBounds(150,40,70,20);
        //this.val2.setBounds(150,60,50,20);
       // this.ans.setBounds(280,40,70,20);
      //  this.ansr.setBounds(280,60,50,20);
       this.add.setBounds(200,300,50,50);
       this.sub.setBounds(250,300,50,50);
       this.mul.setBounds(200,350,50,50);
       this.div.setBounds(250,350,50,50);       
       this.eql.setBounds(230,400,50,50);
       
       this.num1.setBounds(10,250,50,50);
       this.num2.setBounds(50,250,50,50);
       this.num3.setBounds(100,250,50,50);
       this.num4.setBounds(10,300,50,50);
       this.num5.setBounds(50,300,50,50);
       this.num6.setBounds(100,300,50,50);
       this.num7.setBounds(10,350,50,50);
       this.num8.setBounds(50,350,50,50);
       this.num9.setBounds(100,350,50,50);       
       this.num0.setBounds(50, 400,50,50);
       this.numNull.setBounds(100,400,50,50);
       
       this.add(value1);
//	this.add(value2);
        this.add(add);
        this.add(sub);
	this.add(mul); 
        this.add(div);
	this.add(eql);
        this.add(val1);
      //  this.add(val2);
  //      this.add(ans);
      //  this.add(ansr);
       
        this.add(num1);
        this.add(num2);
        this.add(num3);
        this.add(num4);
        this.add(num5);
        this.add(num6);
        this.add(num7);
        this.add(num8);
        this.add(num9);
        this.add(num0);        
        this.add(numNull);
    }
   public void addFunctionality(){
       //for number button
               ActionListener btn = new ActionListener(){
               public void actionPerformed(ActionEvent btn) {
                  
                 String num;
                    num=((JButton)btn.getSource()).getText();
                    val1.setText(val1.getText().trim()+num.trim());
   
               }
         };
       
       
       
       
      
      
       
       
                
         ActionListener oprt=new ActionListener() {
          
             public void actionPerformed(ActionEvent oprt) {
                 if( val1.getText()!=null  && !"".equals(val1.getText()))
                    previousNum=Integer.parseInt(val1.getText());
                 
                 String blank=("");
                 
                 operator=((JButton)oprt.getSource()).getText();
               val1.setText(blank);
             }
         };

       
       
       
       
       
       //for oprator eqal
     ActionListener el=new ActionListener(){

         public void actionPerformed(ActionEvent e) {
            String valu1,valu2,an;
      // valu1=eNew.getSource().getText() 
               valu1=val1.getText();
               
  //         valu2=val2.getText();
           
            int b=Integer.parseInt(valu1);
            int a=previousNum;
           
           int c=0;
           System.out.println("Operator["+operator+"]");
           if(operator.trim().equals("+")){
               c=a+b;
           }
           else if(operator.trim().equals("-")){
               c=a-b;
           }
           else if(operator.trim().equals("*")){
               c=a*b;
           }
           else if(operator.trim().equals("/")){
               c=a/b;
           }
           val1.setText(String.valueOf(c));
        }
     };
         
     
             
     
    num1.addActionListener(btn);
    num2.addActionListener(btn);
    num3.addActionListener(btn);
    num4.addActionListener(btn);
    num5.addActionListener(btn); 
    num6.addActionListener(btn);
    num7.addActionListener(btn);    
    num8.addActionListener(btn);
    num9.addActionListener(btn);
    num0.addActionListener(btn);
    
    add.addActionListener(oprt);
    sub.addActionListener(oprt);
    mul.addActionListener(oprt);
    div.addActionListener(oprt);
    eql.addActionListener(el);   
   }
}

