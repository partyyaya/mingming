package tw.org.iii;

import javax.swing.JOptionPane;

public class pratice01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String str ="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
		//�ϥΪ̿�J
		int mis=0;
		while(true){
		String str= JOptionPane.showInputDialog("�п�J�K�X");		
			if(str.matches("[a-zA-Z0-9*@_$]{6,20}")){
				System.out.println("��J���T");
				JOptionPane.showMessageDialog(null,"��J���T" );
				break;
			}else{
				System.out.println("��J���~��,���s��J");
				JOptionPane.showMessageDialog(null,"��J���~,�Э��s��J" );
				mis++;
			}
			if(mis==3){
				System.out.println("�|���|�Ӳ�");
				JOptionPane.showMessageDialog(null,"�|���|�Ӳ�" );
				mis=0;
			}
		}
	}
}
