package tw.org.iii;

public class ClassAndClass {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//add3 a1 = new add3();
		add3 a2 = new add3();//�H�����O�Фl���O,�����i�H�l�Ф�,�B�ܼƦW��a1.a2���i�̼�
		//�p�W�ҥ�,�غc�l�H�����O���D,�Y���l��k�W�٬ۦP�h�Τl��k(�ŧi���D),�Y�L�ۦP��k�h�L�k�Τl��k
		//�H�ŧi�����O���D,���ݤ���l���ܼ�,���i�Τ�k�ݨ�
		myf1(a2);
		//a2.m1();
	}
	static void myf1(add1 a){
		a.m1();//�H�ѼƬ��D�h�ϥΤ�k,�Y���l��k�W�٬ۦP�h�Τl��k(�ŧi���D),�Y�L�ۦP��k�h�L�k�Τl��k
	}
}
class add1{
	int a;
	static {System.out.println("a1");}
	add1(int b){
	System.out.println("1");
		a++;
	}
	 void m3(){//�Y�����O��k�[static�h�l�����঳�ۦP�W�٤���k
		 int c=0;
		System.out.println("m3");
	}
	 void m1(){//�Y�����O��k�[static�h�l�����঳�ۦP�W�٤���k
		 int c=0;
		System.out.println("add1");
	}
}
class add2 extends add1{
	
	static {System.out.println("a2");}
	add2(){//�Y�����O�غc�l���Ѽ�,�h�l���O���X�غc�l�ɴ�,�l���O����super	
		
		this(0);//�Y��super�N�����this,�ۤϤ]�O,this�N�����O
		a++;
		System.out.println("23");
	}
	add2(int b){
		
		super(0);//�Y�����O�غc�l���Ѽ�,�h�l���O���X�غc�l�ɴ�	
		a++;
		System.out.println("20");
	}
	 void m1(){//�Y���P�l���ۦP�W�٤���k,�h�����static,�]static�������O�M��
		 	
			System.out.println("add2");
		}
}
class add3 extends add2{
	int b;
	
	static {System.out.println("a3");}//static�|�����̮ڷ��A�̧ǧ��l���O
	
	add3(){	
		
		super();//�ϥΤ����O(int a),�Y�S�gsuper�h�εL�Ѽ�
		a++;
		System.out.println("3");
		System.out.println(a);
	}
    void m1(){
    	super.m1();
    	a++;
    	System.out.println(a);
		System.out.println("add3");
	}
}