package tw.org.iii;

import javax.swing.JOptionPane;

public class tenthousand {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input=JOptionPane.showInputDialog("�п�J�~��");
		int year=Integer.parseInt(input);
		input=JOptionPane.showInputDialog("�п�J���");
		int month =Integer.parseInt(input); 
		input=JOptionPane.showInputDialog("�п�J���");
		int days = Integer.parseInt(input);
		if(days>0&&days<=31&&month>0&&month<=12&&year>=1900){
			date(year,month,days);}
		else if(month>0&&month<=12&&year>=1900)
			month(year,month);
		else if(year>=1900)
			year(year);
		else
			System.out.println("��J���~");
	}
	static void date(int year,int month,int dat){
		System.out.print(year+"/"+month+"/"+dat);
		int[] M={31,0,31,30,31,30,31,31,30,31,30,31};
		if ((year%400==0)||(year%4==0)&&(year%100!=0)){
			    M[1]=29;
			 }else{
			    M[1]=28;
		}
		int y = (year-1900)*365;		
		for(int i=1900;i<year;i++){
			if ((i%400==0)||(i%4==0)&&(i%100!=0)){
			    y++;}		
		}
		for(int j=1;j<month;j++){
			y=y+M[j-1];
		}
		int a=(y%7)+dat;
		switch(a%7){
			case 1:
				System.out.println("��§���@");
				break;
			case 2:
				System.out.println("��§���G");
				break;
			case 3:
				System.out.println("��§���T");
				break;
			case 4:
				System.out.println("��§���|");
				break;
			case 5:
				System.out.println("��§����");
				break;
			case 6:
				System.out.println("��§����");
				break;
			case 7:
				System.out.println("��§����");
				break;			
		}		
	}
	static void month(int year ,int month){
		System.out.println(year+"/"+month);
		System.out.println("��\t�@\t�G\t�T\t�|\t��\t��");	
		int[] M={31,0,31,30,31,30,31,31,30,31,30,31};
		if ((year%400==0)||(year%4==0)&&(year%100!=0)){
			    M[1]=29;
			 }else{
			    M[1]=28;
		}
		int y = (year-1900)*365;		
		for(int i=1900;i<year;i++){
			if ((i%400==0)||(i%4==0)&&(i%100!=0)){
			    y++;}		
		}
		for(int j=1;j<month;j++){
			y=y+M[j-1];
		}
		for(int k=1;k<=y%7+1;k++){
			System.out.print(" \t");
		}
		for(int l=1;l<=M[month-1];l++){
			System.out.print(l+"\t");
			if((l+(y+1))%7==0)
				System.out.println();
		}		
	}
	static void year(int year){
		int[] M={31,0,31,30,31,30,31,31,30,31,30,31};
		if ((year%400==0)||(year%4==0)&&(year%100!=0)){
			    M[1]=29;
			 }else{
			    M[1]=28;
		}
		int y = (year-1900)*365;		
		for(int i=1900;i<year;i++){
			if ((i%400==0)||(i%4==0)&&(i%100!=0)){
			    y++;}		
		}
		for(int month=1;month<=12;month++){
			System.out.println(year+"/"+month+"��");
			System.out.println("��\t�@\t�G\t�T\t�|\t��\t��");
			for(int j=1;j<month;j++){
				y=y+M[j-1];
			}
			for(int k=1;k<=((y+1)%7);k++){
				System.out.print(" \t");
			}
			for(int l=1;l<=M[month-1];l++){
				System.out.print(l+"\t");
				if((l+(y+1))%7==0)
					System.out.println();
			}
			System.out.println();
			System.out.println();
			y = (year-1900)*365;		
			for(int i=1900;i<year;i++){
				if ((i%400==0)||(i%4==0)&&(i%100!=0)){
				    y++;}		
			}
		}
		
	} 
}
