package algorithm;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TestConnection {
public static void main(String []args) throws Exception {
	
	@SuppressWarnings("unused")
	ConnectDB connectDB = new ConnectDB();
	//connectDB.connectToDatabase();
	List<String> list = new ArrayList<String>();
	list = connectDB.readDataBase("test" , "Database"); 
	for(String st: list){
		System.out.println(st);
	}
	
	
	
	
	
	
	
	
	
	}
}