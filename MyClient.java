import java.rmi.*;

public class MyClient{
	public static void main(String[] args){
		try{
			Adder adder = (Adder)Naming.lookup("rmi://localhost:5000/radhakrishnan");
			int sum = adder.add(100, 200);
			System.out.println(sum);
		}catch(Exception re){
			re.printStackTrace();
		}
	}
}