package ivprep;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.Collections;


public class CheatSheet {
	
	public void csMethod() {
		
		// Declare char array
		char[] ca = new char[10];
		
		// Initialise char array
		// if you initialise the char array with int vale then
		// it will become ascii value and store char equal to the ascii value
		char[] ica = {'a', 't', 'f', 'o', 6, 9, '9'}; 
		
		System.out.println("Char arrary length: "+ica.length);
		
		System.out.println("Char arrary initialised: "+ new String(ica));
		
		for(int i=0; i<ica.length; i++) {
			int ch = ica[i];
			System.out.println("ASCII value of char ["+ica[i]+"] is ["+ch+"]");
		}
		
		System.out.println("Is 9 == '9': "+(9=='9'));
		
		
		List<String> arl = new ArrayList<String>();
		arl.add("tst");
		arl.add("mystr");
		arl.add("name");
		
		arl.forEach(e -> {
			System.out.println("Elements: "+e);
		});
		
		Person joe = new Person("Joe", "Portman");
		Person joeAgain = new Person("Joe", "Portman");
		Person natalie = new Person("Natalie", "Portman");
		
		System.out.println("is joe == joeAgain by first name: "+joe.equals(joeAgain));
		System.out.println("is joe == natalie by first name: "+joe.equals(natalie));
		
		LinkedList<String> cars = new LinkedList<String>();
		
//		public class Employee implements Comparable<Employee> {
//		    
//		    // ...
//
//		    @Override
//		    public boolean equals(Object obj) {
//		        return ((Employee) obj).getName().equals(getName());
//		    }
//
//		    @Override
//		    public int compareTo(Employee employee) {
//		        return getJoiningDate().compareTo(employee.getJoiningDate());
//		    }
//		}
//		
//		@Test
//		public void givenEmpList_SortEmpList_thenSortedListinNaturalOrder() {
//		    Collections.sort(employees);
//		    assertEquals(employees, employeesSortedByDateAsc);
//		}
//		
//		@Test
//		public void givenEmpList_SortEmpList_thenSortedListinDescOrder() {
//		    Collections.sort(employees, Collections.reverseOrder());
//		    assertEquals(employees, employeesSortedByDateDesc);
//		}
		
//		@Test
//		public void givenEmpList_SortEmpList_thenCheckSortedList() {
//
//		    Collections.sort(employees, new Comparator<Employee>() {
//		        public int compare(Employee o1, Employee o2) {
//		            return o1.getJoiningDate().compareTo(o2.getJoiningDate());
//		        }
//		    });
//
//		    assertEquals(employees, employeesSortedByDateAsc);
//		}
//		
//		@Test
//		public void givenEmpList_SortEmpList_thenCheckSortedListAscLambda() {
//
//		    Collections.sort(employees, Comparator.comparing(Employee::getJoiningDate));
//
//		    assertEquals(employees, employeesSortedByDateAsc);
//		}
//		
//		@Test
//		public void givenEmpList_SortEmpList_thenCheckSortedListDescV1() {
//
//		    Collections.sort(employees, new Comparator<Employee>() {
//		        public int compare(Employee emp1, Employee emp2) {
//		            return emp2.getJoiningDate().compareTo(emp1.getJoiningDate());
//		        }
//		    });
//
//		    assertEquals(employees, employeesSortedByDateDesc);
//		}
//		
//		@Test
//		public void givenEmpList_SortEmpList_thenCheckSortedListDescLambda() {
//
//		    Collections.sort(employees, (emp1, emp2) -> emp2.getJoiningDate().compareTo(emp1.getJoiningDate()));
//		    assertEquals(employees, employeesSortedByDateDesc);
//		}
		
		
//		int[] ar = {1, 4, 23, 56, 10, 9, 45, 67, 21, 34, 39, 29, 19, 5, 8 };
		
//		int[] na = IntStream.of(ar).filter(e ->( e > 5 && e < 24)).sorted().toArray();
//		
//		for(int i : na) System.out.println(i);
//		
//		try {
//			Stream<String> rows = Files.lines(Paths.get("data.txt"));
//		} catch (IOException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
		
//		int[] ar = {1, 4, 23, 56, 10, 9, 45, 67, 21, 34, 39, 29, 19, 5, 8 };
//		
//		int rot = 15;
//		int[] ta = new int[ar.length];
//		
//		for(int i=0, j=rot, k=(ar.length-rot); i<ar.length; i++, j++, k++) {
//			if(i<ar.length-rot)
//				ta[i]=ar[j];
//			if(k<ar.length)
//				ta[k]=ar[i];
//		}
//		
//		System.out.println(Arrays.toString(ar)+" / "+ar.length);
//		System.out.println(Arrays.toString(ta)+" / "+ta.length);
		
		ratio(124*(100-63)/100, 108);
		
	}
	
	private void ratio(int a, int b) {
		System.out.println(a+"/"+b);
		final int gcd = gcd(a, b);
		System.out.println(a/gcd+":"+b/gcd);
	}

	private int gcd(int a, int b) {
		if(b==0) return a;
		else return gcd(b, a%b);
	}


	
}
