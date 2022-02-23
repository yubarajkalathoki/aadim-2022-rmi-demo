import java.rmi.*;
import java.rmi.server.*;
public class MyServer{
	public static void main(String[] args){
		try{
			Adder adder = new AdderImpl();
			Naming.rebind("rmi://localhost:5000/radhakrishnan", adder);
		}catch(Exception re){
			re.printStackTrace();
		}
	}
}