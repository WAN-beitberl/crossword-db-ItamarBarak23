package itamar;
import java.util.*;

public class tableRun 
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Table table = new Table();
		table.insertColumnNames("name", "last_name");
		table.insertRow("Israel", "Israeli");
		String name = table.getValue("name", 1);
		System.out.println(name);
	}
}
