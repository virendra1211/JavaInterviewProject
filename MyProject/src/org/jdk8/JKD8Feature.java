package org.jdk8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class JKD8Feature {
	public static void main(String[] args) {
/*
		List<String> names = Arrays.asList("Reflection", "Collection", "Stream");
		List<String> result = names.stream().filter(s -> s.startsWith("S")).collect(Collectors.toList());
		
		result.forEach(x -> System.out.println(x) );
		
		List<String> list = Arrays.asList("ac", "ba", "ab","ca","cd","cc");
			
		List<String> l = list.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
		l.forEach(x -> System.out.println(x) );
	*/
		List<Employee> le = new ArrayList<Employee>();
		le.add(new Employee(300)); le.add(new Employee(783));le.add(new Employee(349));le.add(new Employee(366));
		le.add(new Employee(420));

			System.out.println(" ======================================== ");
		le.stream().filter(s ->s.getSalary() >350).forEach(System.out::println);
		
		
		Map<String,Integer> map = new HashMap<String,Integer>();
		map.put("A3", 9);
		map.put("A5", 4);
		map.put("A8", 5);
		map.put("A2", 6);
		map.put("A9", 8);
		map.put("A1", 7);
		
		Map<String,Integer> result = map.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,(oldvalue,newvalue) -> oldvalue,
						LinkedHashMap::new));
	
		
		result.forEach((k,v) -> System.out.println("Key = "+ k + ", Value = " + v));
	
	}
}
class Employee {
	int salary;

	public Employee(int i) {
		salary =i;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	  @Override
	    public String toString() {
	 
	        return " | salary: "+this.salary;
	    }
}