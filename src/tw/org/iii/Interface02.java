package tw.org.iii;

public class Interface02 {
/*�p������interface
 * ������@�P�\���X��interface
 * �@�ӭ� �� ��Himplements �@�P�\��
 * �A�� ��H�i��y�z
 * */
	public static void main(String[] args) {
		sw(new flyerfish(""));
		
	}
	static void sw(swim a){
		a.m1();
	}
}
interface flying{
	void fly();
}
interface swim{//�i�Q�֦�����k�Φ欰
	void m1();//interface�̤��g�s���׹��r=public abstract
	abstract void m2();//interface���i��{},�]�����O��H��k,abstract�i�[�i���[
					   //interface�ݭn��@
}

 class fish implements swim{//�Yabstract�n��public�ݦs���t�@�Ӹ�Ƨ�
	private String name;
	fish(String name){
		this.name=name;
	}
	public void m1(){};//�]interface�Ҭ�public�h���b��k�e�[public
	public void m2(){}
}

class flyerfish extends fish implements flying{
	 //�]�i�H�Nextends fish implements flying �令 implements flying,swim
	flyerfish(String na){
		super(na);
	}
	public void m1(){//�]�����O��public�h���b��k�e�[public
		System.out.println("mmm");
	}
	public void m2(){}
	public void fly(){
		System.out.println("���_�ӤF");
	}
}
 class dock implements flying,swim{
	 public void m1(){}
	 public void m2(){}
	 public void fly(){}
 }