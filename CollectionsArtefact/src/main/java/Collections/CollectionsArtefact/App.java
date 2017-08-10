package Collections.CollectionsArtefact;
import static java.util.Comparator.comparing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;

import javax.management.Query;



public class App 
{
    public static void main( String[] args )
    {

    	Queue<Student> coada = new LinkedList<Student>();
    	coada= new PriorityQueue<Student>();
    	
    	
    	
    	ArrayList<Student> listOfStudents = new ArrayList();
    	listOfStudents.add(new Student("gina", 33, 4));
    	listOfStudents.add(new Student("ana", 22, 10));
    	listOfStudents.add(new Student("mere", 11, 7));
    	listOfStudents.add(new Student("mere", 22, 3));
    	
    	System.out.println(listOfStudents);
    	
    	HashSet<Student> setList = new HashSet<Student>();
    	
    	//setList.addAll(listOfStudents);
    	
    	setList.add(new Student("mere", 11, 7));
    	setList.add(new Student("mere", 11, 7));
    	
    
    	
    	System.out.println(setList);

    	/*Collections.sort(listOfStudents, new Comparator<Student>(){
    	    public int compare(Student s1, Student s2) {
    	        return s1.getName().compareToIgnoreCase(s2.getName());
    	    }
    	});*/
    	Collections.sort(listOfStudents, comparing(Student::getName));
    
    	
    	 // Create a hash map
        Hashtable balance = new Hashtable();
        Enumeration names;
        String str;
        double bal;
        
        Iterator<Student> iter = listOfStudents.listIterator();
        
        while(iter.hasNext()) {
        	
        	System.out.println(iter.next());
        }
        
      
        String name = null;
   
        System.out.println(name.length()); 
    	
    }
}
