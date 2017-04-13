package tw.org.iii;

import javax.swing.JOptionPane;

public class numberToChinese {

	public static void main(String[] args) {
		String number = JOptionPane.showInputDialog("�п�J�����");
		int money=Integer.parseInt(number);	
		int c=0;
		if(digit(money)>=8){
			int b=money/big(8);
			check(b);
			System.out.print("�� ");
			c=money-b*big(8);			
		}
		if(digit(money)>=4||digit(c)>=4){
			int b=money/big(4);
			int d=c/big(4);
			if(c>0)
			thousand(d);
			else
				check(b);
			System.out.print("�U ");
			int e=money-b*big(4);
			c=c-d*big(4);
			if(c>0)
				thousand(c);
				else
				thousand(e);
			System.out.print("��");
		}
		if(digit(money)<4){
		check(money);
		System.out.print("��");
		}
	}	 
	static void check(int a){
		if(a/1000>0){
			thousand(a);
		}else if(a/100>0){
			hundred(a);
		}
		else if(a/10>0){
			ten(a);
		}
		else if(a>0){
			one(a);
		}
	}
	static int digit(int a){
		int b=0;
		while(a>=10){
			a /= 10;
			b++;
		}
		return b;
	}
	static int big(int a){
		int b=1;
		for(int i=0;i<a;i++){
			b*=10;
		}
		return b;
	}
	static void thousand(int a){
			chinese(a,1000);
			System.out.print("�a ");
			if(a>1000)
			a=a-(a/big(digit(a)))*big(digit(a));
			chinese(a,100);
			System.out.print("�� ");
			if(a>100)
			a=a-(a/big(digit(a)))*big(digit(a));
			chinese(a,10);
			System.out.print("�B ");
			if(a>10)
			a=a-(a/big(digit(a)))*big(digit(a));
			chinese(a,1);
	}
	static void hundred(int a){
		chinese(a,100);
		System.out.print("�� ");
		if(a>100)
		a=a-(a/big(digit(a)))*big(digit(a));
		chinese(a,10);
		System.out.print("�B ");
		if(a>10)
		a=a-(a/big(digit(a)))*big(digit(a));
		chinese(a,1);
	}
	static void ten(int a){
		chinese(a,10);
		System.out.print("�B ");
		if(a>10)
		a=a-(a/big(digit(a)))*big(digit(a));
		chinese(a,1);
	}
	static void one(int a){
		chinese(a,1);
	}
	static void chinese(int a,int b){
		switch(a/b){
			case 1:
				System.out.print("��");
				break;
			case 2:
				System.out.print("�L");
				break;
			case 3:
				System.out.print("��");
				break;
			case 4:
				System.out.print("�v");
				break;
			case 5:
				System.out.print("��");
				break;
			case 6:
				System.out.print("��");
				break;
			case 7:
				System.out.print("�m");
				break;
			case 8:
				System.out.print("��");
				break;
			case 9:
				System.out.print("�h");
				break;
			case 0:
				System.out.print("�s");
				break;
		}
	}
}
