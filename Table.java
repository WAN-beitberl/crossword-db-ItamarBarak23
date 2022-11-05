package itamar;
import java.util.*;

public class Table {

	public String[][] table = new String[200][2];
	int i = 1;
	
	public void insertColumnNames(String name1, String name2)
	{
		table[0][0] = name1;
		table[0][1] = name2;
	}
	
	public void insertRow(String name, String lastName)
	{
		table[i][0] = name;
		table[i][1] = lastName;
		i++;
	}
	
	public String getValue(String name, int i)
	{
		if(name.equals(table[0][1]))
			return table[i][1];
		else
			return table[i][0];
	}
   
    
}