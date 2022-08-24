package Rest_Assured_Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class test implements Serializable {
	int i = 12;
	String st = "hii";
}

public class Serialization_DeSerilization {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// serlization

		test obj = new test();

		FileOutputStream fo = new FileOutputStream("rushii.txt");

		ObjectOutputStream ip = new ObjectOutputStream(fo);
		ip.writeObject(obj);

	// DeSerilization
		FileInputStream fi = new FileInputStream("rushii.txt");
		
		ObjectInputStream ob = new ObjectInputStream(fi);
		
		test t= (test)ob.readObject();
		System.out.println(t.i+" "+t.st);
	}

}
