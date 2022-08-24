package HTPPS_Methods;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Test implements Serializable
{
	
	int i=10;
	int j=12;
	
	
	
	
}


public class Get_Method {

	public static void main(String[] args) throws Throwable {
		Test  obj = new Test ();
	FileOutputStream  fio= new FileOutputStream ("test.txt");
	
	ObjectOutputStream  OBjstream= new ObjectOutputStream(fio);
	
	 OBjstream.writeObject(obj);
	

	}

}
