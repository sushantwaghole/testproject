package java8_tutorial;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class selfTest {

	public static void main(String[] args) {
		
	
   List <String> name=new ArrayList<String>();
   name.add("ram");
   name.add("guru");
   
   
   selfTest s=new selfTest();
   s.sortUsingJava7(name);
   System.out.println(name);
   
	
	   List <String> name1=new ArrayList<String>();
	   name1.add("sushant");
	   name1.add("waghole");
	   s.sortUsingJava8(name1);
	   System.out.println(name1);
   
 
	}

	private void sortUsingJava8(List<String> names) {
		// TODO Auto-generated method stub
		 Collections.sort(names, (s1, s2) -> s1.compareTo(s2));
	}

	private void sortUsingJava7(List<String> name) {
		Collections.sort(name,new Comparator<String>()
		
		{

			@Override
			public int compare(String s1, String s2) {
				// TODO Auto-generated method stub
				return s1.compareTo(s2);
			}
			
			
		});
		
		
	}

}
