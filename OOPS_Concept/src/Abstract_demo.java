abstract class Operation{
	abstract void add();
	int num,num2;
	public Operation(int a,int b) {
		this.num=a;
		this.num2=b;
		int result=a+b;
		System.out.println(result);
	}
}
class Display extends Operation{
	public Display() {
		super(12,12);
	
	}
	void add() {
		
		int a=10,b=20,result;
		result=a+b;
		System.out.println("addition:"+result);
	}
}
public class Abstract_demo {
public static void main(String args[]) {
	Display d=new Display();
	//d.add();
}
}
