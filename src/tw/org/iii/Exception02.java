package tw.org.iii;

public class Exception02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10,b=0;
		int[] c={1,2,3,4};
		try{//�̭��i�H����,�u�n�@�ˬd����~�h���ܾA�X���ҥ~�B�z(���|������~����,��������catch)
			
			
			try{//�Y�e����catch�ϥ�RuntimeException or �����O �h"����"�l�����L�k�ϥ�
				System.out.println(a/b);
				System.out.println(c[4]);				
			}catch(Exception ee){//�Y������B�D�|��~����catch
				System.out.println("8787");
			}
			
		}
		catch(ArithmeticException ce){//ArithmeticException��N�ҥ~,catch:�ҥ~����
			b=1;
			System.out.println(a/b);
			
		}
		//ArrayIndexOutOfBoundsException,ArithmeticException����RuntimeException���l���O
			//�l���i�H����,���P�l,�l�����b�����W,�H�l�ҥ~�u���B�z
			
		catch(RuntimeException ee){//�u�n�O������~�����榹�ҥ~
			System.out.println("ok");
		}
		System.out.println("qq");
	}

}