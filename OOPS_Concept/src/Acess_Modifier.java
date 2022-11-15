class ADD{
	protected void opertion() {
		int a=10,b=20;
		int c=a+b;
		System.out.println("result:"+c);
	}
}
public class Acess_Modifier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			ADD a=new ADD();
			a.opertion();
	}

}
