package test.calculate;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CalculateTest extends JFrame implements ActionListener {
	JLabel lbl;
	JButton[] btn;
	JPanel pan;
	double num1,num2,num3; // 사칙 연산에 쓸 변수들
	int num_st = 1; // 초기화면 모드
	int op= 0; //사칙 연산 구분
	
	public CalculateTest() {
		setLayout(new BorderLayout());
		//라벨 설정
		lbl = new JLabel("0",JLabel.RIGHT);
		
		//패널 설정
		pan = new JPanel();
		
		pan.setLayout(new GridLayout(4,4));
		
		//버튼 기본 설정
		String[] btns = {"1","2","3","+","4","5","6","-","7","8","9","*","0","=","C","/"};
		btn = new JButton[btns.length];		
		
		for(int i = 0; i< btns.length; i++)
		{
			btn[i] = new JButton(btns[i]);
			btn[i].addActionListener(this);
			pan.add(btn[i]);
		}
		
		add("North",lbl);
		add("Center",pan);
				
		
		int w = 250;
		int h = 250;
		setTitle("단순 계산기");
		CenterLocation.location(w, h);
		setBounds(CenterLocation.getX(),CenterLocation.getY(),w,h);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
}
	//버튼 이벤트  설정
	@Override
	public void actionPerformed(ActionEvent e) {
		String s = lbl.getText();
		String ebtn = e.getActionCommand();
		/*
		if(ebtn == btn[12])
		{
			if(num_st>0)
			{
				num_st = 1;
				lbl.setText("0");
			}
			else
			{
				lbl.setText(s+"0");
			}	
		}
		if(ebtn == btn[0])
		{
			if(num_st>0)
			{
				num_st = 0;
				lbl.setText("1");
			}
			else
			{
				lbl.setText(s+"1");
			}		
		}
		if(ebtn == btn[1])
		{
			if(num_st>0)
			{
				num_st = 0;
				lbl.setText("2");
			}
			else
			{
				lbl.setText(s+"2");
			}		
		}
		if(ebtn == btn[2])
		{
			if(num_st>0)
			{
				num_st = 0;
				lbl.setText("3");
			}
			else
			{
				lbl.setText(s+"3");
			}		
		}
		if(ebtn == btn[4])
		{
			if(num_st>0)
			{
				num_st = 0;
				lbl.setText("4");
			}
			else
			{
				lbl.setText(s+"4");
			}		
		}
		if(ebtn == btn[5])
		{
			if(num_st>0)
			{
				num_st = 0;
				lbl.setText("5");
			}
			else
			{
				lbl.setText(s+"5");
			}		
		}
		
		if(ebtn == btn[6])
		{
			if(num_st>0)
			{
				num_st = 0;
				lbl.setText("6");
			}
			else
			{
				lbl.setText(s+"6");
			}		
		}if(ebtn == btn[8])
		{
			if(num_st>0)
			{
				num_st = 0;
				lbl.setText("7");
			}
			else
			{
				lbl.setText(s+"7");
			}		
		}
		if(ebtn == btn[9])
		{
			if(num_st>0)
			{
				num_st = 0;
				lbl.setText("8");
			}
			else
			{
				lbl.setText(s+"8");
			}		
		}
		if(ebtn == btn[10])
		{
			if(num_st>0)
			{
				num_st = 0;
				lbl.setText("9");
			}
			else
			{
				lbl.setText(s+"9");
			}		
		}
		if(ebtn == btn[14]) //클리어
		{
			lbl.setText("0");
			num_st = 1;
			op = 0;
					
		}
		if(ebtn == btn[3]) //더하기
		{
			num2 = Double.parseDouble(lbl.getText());
			if(op > 0)			
			{
				
				if(op == 1)
					num3 = num1 + num2;
				else if(op == 2)
					num3 = num1 - num2;
				else if(op == 3)
					num3 = num1 * num2;
				else if(op == 4)
					num3 = num1 / num2;
				lbl.setText(""+num3);
			}
			num_st = 1;
			op = 1;
			num1 = Double.parseDouble(lbl.getText());					
		}
		if(ebtn == btn[7]) //빼기
		{
			num2 = Double.parseDouble(lbl.getText());
			if(op > 0)
			{
			
				if(op == 1)
					num3 = num1 + num2;
				else if(op == 2)
					num3 = num1 - num2;
				else if(op == 3)
					num3 = num1 * num2;
				else if(op == 4)
					num3 = num1 / num2;
				lbl.setText(""+num3);
			}
			num_st = 1;
			op = 2;
			num1 = Double.parseDouble(lbl.getText());	
		}
		if(ebtn == btn[11]) //곱하기
		{
			num2 = Double.parseDouble(lbl.getText());
			if(op > 0)
			{
				num2 = Double.parseDouble(lbl.getText());
				if(op == 1)
					num3 = num1 + num2;
				else if(op == 2)
					num3 = num1 - num2;
				else if(op == 3)
					num3 = num1 * num2;
				else if(op == 4)
					num3 = num1 / num2;
				lbl.setText(""+num3);
			}
			num_st = 1;
			op = 3;
			num1 = Double.parseDouble(lbl.getText());
					
		}
		
		if(ebtn == btn[15]) //나누기
		{
			num2 = Double.parseDouble(lbl.getText());
			if(op > 0)
			{
				num2 = Double.parseDouble(lbl.getText());
				if(op == 1)
					num3 = num1 + num2;
				else if(op == 2)
					num3 = num1 - num2;
				else if(op == 3)
					num3 = num1 * num2;
				else if(op == 4)
					num3 = num1 / num2;
				lbl.setText(""+num3);
			}
			num_st = 1;
			op = 4;
			num1 = Double.parseDouble(lbl.getText());
					
		}
		if(ebtn == btn[13]) //결과
		{
			num_st = 1;
			num3 = Double.parseDouble(lbl.getText());
			if(op == 1)
				num3 = num1 + num2;
			else if(op == 2)
				num3 = num1 - num2;
			else if(op == 3)
				num3 = num1 * num2;
			else if(op == 4)
				num3 = num1 / num2;
			
			lbl.setText(""+num3);				
			op = 0;
					
		}
		*/
		switch (ebtn) {
		case "0":
		{
			if(num_st>0)
			{
				num_st = 1;
				lbl.setText("0");
			}
			else
			{
				lbl.setText(s+"0");
			}	
		}
			break;
		case "1":
		{
			if(num_st>0)
			{
				num_st = 0;
				lbl.setText("1");
			}
			else
			{
				lbl.setText(s+"1");
			}	
		}		
		break;
		case "2":
		{
			if(num_st>0)
			{
				num_st = 0;
				lbl.setText("2");
			}
			else
			{
				lbl.setText(s+"2");
			}	
		}		
		break;
		case "3":
		{
			if(num_st>0)
			{
				num_st = 0;
				lbl.setText("3");
			}
			else
			{
				lbl.setText(s+"3");
			}	
		}		
		break;
		case "4":
		{
			if(num_st>0)
			{
				num_st = 0;
				lbl.setText("4");
			}
			else
			{
				lbl.setText(s+"4");
			}	
		}		
		break;
		case "5":
		{
			if(num_st>0)
			{
				num_st = 0;
				lbl.setText("5");
			}
			else
			{
				lbl.setText(s+"5");
			}	
		}		
		break;
		case "6":
		{
			if(num_st>0)
			{
				num_st = 0;
				lbl.setText("6");
			}
			else
			{
				lbl.setText(s+"6");
			}	
		}		
		break;
		case "7":
		{
			if(num_st>0)
			{
				num_st = 0;
				lbl.setText("7");
			}
			else
			{
				lbl.setText(s+"7");
			}	
		}		
		break;
		case "8":
		{
			if(num_st>0)
			{
				num_st = 0;
				lbl.setText("8");
			}
			else
			{
				lbl.setText(s+"8");
			}	
		}		
		break;
		case "9":
		{
			if(num_st>0)
			{
				num_st = 9;
				lbl.setText("9");
			}
			else
			{
				lbl.setText(s+"9");
			}	
		}		
		break;
		case "C":
		{			
			lbl.setText("0");
			num_st = 1;
			op = 0;
				
		}		
		break;
		case "+":
		{						
			num_st = 1;
			op = 1;
			num1 = Double.parseDouble(lbl.getText());
		}		
		break;
		case "-":
		{						
			num_st = 1;
			op = 2;
			num1 = Double.parseDouble(lbl.getText());	
		}		
		break;
		case "*":
		{						
			num_st = 1;
			op = 3;
			num1 = Double.parseDouble(lbl.getText());
		}		
		break;
		case "/":
		{						
			num_st = 1;
			op = 4;
			num1 = Double.parseDouble(lbl.getText());
		}		
		break;
		case "=":
		{				
			num_st = 1;
			num2 = Double.parseDouble(lbl.getText());
			if(op == 1)
				num3 = num1 + num2;
			else if(op == 2)
				num3 = num1 - num2;
			else if(op == 3)
				num3 = num1 * num2;
			else if(op == 4)
				num3 = num1 / num2;
			
			lbl.setText(""+num3);				
			
		}		
		break;
		
		}
		
		
	}
	
	
	public static void main(String[] args) {
		new CalculateTest();

	}



	

}
