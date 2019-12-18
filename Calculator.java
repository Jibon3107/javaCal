import java.lang.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Calculator extends JFrame implements ActionListener
{
	private JLabel   title;
	private JPanel panel;
	private JButton off, back, b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, bd, be, bdiv, bmulti, bsub, badd, bc, bbs, bac;
	private JTextField screen, userTF;
	private String x="", s;
	private double d, d1, d2;
	private boolean repeat=false, equal=false, checkdot=false;
	
	public Calculator()
	{
		super("This Is My Calculator");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(380,565);
		
		panel = new JPanel();
		panel.setLayout(null);
		

		title = new JLabel(x);
		title.setBounds(30,40,300,50);
		title.setBackground(Color.GRAY);
		title.setForeground(Color.black);
		title.setFont(new Font("Nirmala UI",Font.ITALIC+Font.BOLD,30));
		title.setOpaque(true);
		panel.add(title);

		b7 = new JButton("7");
		b7.setBounds(50,135,50,50);
		b7.addActionListener(this);
		b7.setFont(new Font("Nirmala UI",Font.ITALIC+Font.BOLD,20));
		panel.add(b7);
		
		b8= new JButton("8");
		b8.setBounds(120,135,50,50);
		b8.addActionListener(this);
		b8.setFont(new Font("Nirmala UI",Font.ITALIC+Font.BOLD,20));
		panel.add(b8);
		
		b9 = new JButton("9");
		b9.setBounds(190,135,50,50);
		b9.addActionListener(this);
		b9.setFont(new Font("Nirmala UI",Font.ITALIC+Font.BOLD,20));
		panel.add(b9);

		bdiv = new JButton("/");
		bdiv.setBounds(260,135,50,50);
		bdiv.setBackground(Color.ORANGE);
		bdiv.addActionListener(this);
		bdiv.setFont(new Font("Nirmala UI",Font.ITALIC+Font.BOLD,20));
		panel.add(bdiv);

		b4 = new JButton("4");
		b4.setBounds(50,205,50,50);
		b4.addActionListener(this);
		b4.setFont(new Font("Nirmala UI",Font.ITALIC+Font.BOLD,20));
		panel.add(b4);
		
		b5 = new JButton("5");
		b5.setBounds(120,205,50,50);
		b5.addActionListener(this);
		b5.setFont(new Font("Nirmala UI",Font.ITALIC+Font.BOLD,20));
		panel.add(b5);
		
		b6 = new JButton("6");
		b6.setBounds(190,205,50,50);
		b6.addActionListener(this);
		b6.setFont(new Font("Nirmala UI",Font.ITALIC+Font.BOLD,20));
		panel.add(b6);
		
		bmulti = new JButton("*");
		bmulti.setBounds(260,205,50,50);
		bmulti.setBackground(Color.ORANGE);
		bmulti.addActionListener(this);
		bmulti.setFont(new Font("Nirmala UI",Font.ITALIC+Font.BOLD,20));
		panel.add(bmulti);
		
		b1 = new JButton("1");
		b1.setBounds(50,275,50,50);
		b1.addActionListener(this);
		b1.setFont(new Font("Nirmala UI",Font.ITALIC+Font.BOLD,20));
		panel.add(b1);
		
		b2 = new JButton("2");
		b2.setBounds(120,275,50,50);
		b2.addActionListener(this);
		b2.setFont(new Font("Nirmala UI",Font.ITALIC+Font.BOLD,20));
		panel.add(b2);
		
		b3 = new JButton("3");
		b3.setBounds(190,275,50,50);
		b3.addActionListener(this);
		b3.setFont(new Font("Nirmala UI",Font.ITALIC+Font.BOLD,20));
		panel.add(b3);
		
		bsub = new JButton("-");
		bsub.setBounds(260,275,50,50);
		bsub.setBackground(Color.ORANGE);
		bsub.addActionListener(this);
		bsub.setFont(new Font("Nirmala UI",Font.ITALIC+Font.BOLD,20));
		panel.add(bsub);

		bd = new JButton(".");
		bd.setBounds(120,345,50,50);
		bd.addActionListener(this);
		bd.setFont(new Font("Nirmala UI",Font.ITALIC+ Font.BOLD,20));
		panel.add(bd);

		b0 = new JButton("0");
		b0.setBounds(50,345,50,50);
		b0.addActionListener(this);
		b0.setFont(new Font("Nirmala UI",Font.ITALIC+ Font.BOLD,20));
		panel.add(b0);

		be = new JButton("=");
		be.setBounds(190,345,50,50);
		be.addActionListener(this);
		be.setFont(new Font("Nirmala UI",Font.ITALIC+Font.BOLD,20));
		panel.add(be);
		
		badd= new JButton("+");
		badd.setBounds(260,345,50,50);
		badd.setBackground(Color.ORANGE);
		badd.addActionListener(this);
		badd.setFont(new Font("Nirmala UI",Font.ITALIC+Font.BOLD,20));
		panel.add(badd);

		bc = new JButton("C");
		bc.setBounds(50,420,50,50);
		bc.addActionListener(this);
		bc.setFont(new Font("Consolas",Font.BOLD,20));
		panel.add(bc);

		off = new JButton("OFF");
		off.setBounds(200, 420, 110, 50);
		off.setBackground(Color.RED);

		off.addActionListener(this);
		off.setFont(new Font("Nirmala UI",Font.BOLD,20));
		panel.add(off);

		bbs = new JButton("BS");
		bbs.setBounds(120,420,60,50);
		bbs.addActionListener(this);
		bbs.setFont(new Font("Nirmala UI",Font.BOLD,20));
		panel.add(bbs);
		
		

		this.add(panel);
	}

	public void actionPerformed(ActionEvent ae)
	{
		String ss = ae.getActionCommand();
		
		
		if(ss.equals(b0.getText()))
			{
				if(equal==true)
					{
						x="";
						x=x+"0";
						title.setText(x);
						equal=false;
					}
				else
					{
						if(x=="")
							{
								x=x+"0"; title.setText(x);
							}
						else
							{
								x=x+"0"; title.setText(x);
							}
					}
			}

		else if(ss.equals(bd.getText()))
			{
				if(equal==true)
					{
						x="";
						x="0.";
						title.setText(x);
						equal=false;
						checkdot=false;
					}
				else
					{
						if(title.getText()=="")
							{
								x="0.";
								title.setText(x);
								checkdot=true;
							}
						else
							{
								if(checkdot==true)
								{
									
									title.setText(x);
								}
								else
								{
									x=x+"."; title.setText(x);
									checkdot=true;
								}
							}
					}
				
			}

			else if(ss.equals(be.getText()))
			{
				
				if(repeat==true)
				{
					if(s=="+")
						{
							d=d+d2;
						}
					else if(s=="-")
						{
							d=d-d2;
						}
					else if(s=="*")
						{
							d=d*d2;
						}
					else if(s=="/")
						{

							d=d1/d2;
							/* 
							try
							{
								d=d1/d2;
							}
							catch(ArithmeticException aa)
							{
								System.out.println("Math Error");
							} */
						}
				}
				else
				{
					d2=Double.parseDouble(x);
					if(s=="+")
						{
							d=d1+d2;
							repeat=true;
						}
					else if(s=="-")
						{
							d=d1-d2;
							repeat=true;
						}
					else if(s=="*")
						{
							d=d1*d2;
							repeat=true;
						}
					else if(s=="/")
						{

							d=d1/d2;
								repeat=true;
							/* try
							{
								d=d1/d2;
								repeat=true;
							}
							catch(ArithmeticException aa)
							{									
								System.out.println("Math Error");
							} */
						}
				}
				
				x=Double.toString(d);
				title.setText(x);
				equal=true;
				x="";
			}

		else if(ss.equals(b1.getText()))
			{
				if(equal==true)
					{
						x=""; x=x+"1"; title.setText(x); equal=false;
					}
				else
					{
						x=x+"1";title.setText(x);
					}
			}
		else if(ss.equals(b2.getText()))
			{
				if(equal==true)
					{
						x=""; x=x+"2"; title.setText(x); equal=false;
					}
				else
					{
						x=x+"2"; title.setText(x);
					}
			}
		else if(ss.equals(b3.getText()))
			{
				if(equal==true)
					{
						x=""; x=x+"3"; title.setText(x); equal=false;
					}
				else
					{
						x=x+"3"; title.setText(x);
					}
			}
		else if(ss.equals(b4.getText()))
			{
				if(equal==true)
					
                    {
                    	x=""; x=x+"4"; title.setText(x); equal=false;
                    }
				else
					{
						x=x+"4"; title.setText(x);
					}
			}
		else if(ss.equals(b5.getText()))
			{
				if(equal==true)
					{
						x=""; x=x+"5"; title.setText(x); equal=false;
					}
				else
					{
						x=x+"5"; title.setText(x);
					}
			}
		else if(ss.equals(b6.getText()))
			{
				if(equal==true)
					{
						x=""; x=x+"6"; title.setText(x); equal=false;
					}
				else
					{
						x=x+"6"; title.setText(x);
					}
			}
		else if(ss.equals(b7.getText()))
			{
				if(equal==true)
					{
						x=""; x=x+"7"; title.setText(x); equal=false;
					}
				else
					{
						x=x+"7"; title.setText(x);
					}
			}

		else if(ss.equals(b8.getText()))
			{
				if(equal==true)
					{
						x=""; x=x+"8"; title.setText(x); equal=false;
					}
				else
					{
						x=x+"8"; title.setText(x);
					}
			}
		else if(ss.equals(b9.getText()))
			{
				if(equal==true)
					{
						x=""; x=x+"9"; title.setText(x); equal=false;
					}
				else
					{
						x=x+"9"; title.setText(x);
					}
			}
		
		
		
		else if(ss.equals(badd.getText()))
			{
				if(x==""){}
				else
				{
					repeat=false; 
					s=""; 
					d1=Double.parseDouble(x);
					x=""; 
					s="+"; 
					title.setText(s);
					checkdot=false;
				}
			}
		else if(ss.equals(bsub.getText()))
			{
				if(x==""){}
				else
				{
					repeat=false; 
					s=""; 
					d1=Double.parseDouble(x); 
					x=""; 
					s="-"; 
					title.setText(s);
					checkdot=false;
				}
			}
		else if(ss.equals(bmulti.getText()))
			{
				if(x==""){}
				else
				{
					repeat=false;
					s=""; 
					d1=Double.parseDouble(x);
					x="";
					s="*"; 
					title.setText(s);
					checkdot=false;
				}
			}
		else if(ss.equals(bdiv.getText()))
			{
				if(x==""){}
				else
				{
					repeat=false; 
					s=""; 
					d1=Double.parseDouble(x); 
					x=""; 
					s="/"; 
					title.setText(s);
					checkdot=false;
				}
			}
			
		else if(ss.equals(bbs.getText()))
			{
				x=x.replaceFirst(".$","");
		        title.setText(x);
		    }
		
		else if(ss.equals(bc.getText()))
			{
				x="";
				title.setText(x);
				checkdot=false;
			}

		else if(ss.equals(off.getText()))
		{
			System.exit(0);
		}
		else{}
	}	


}