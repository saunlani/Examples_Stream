package demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class P_Filter_Sort_Collect_List_HashMap {

	public static void main(String[] args) {
		
		//This Stream streams a list of people, filters based on age,
		//maps the name to a new memberNamesOver40 list, then collects the names to a list.
		
		//The second Stream streams members to a Map<String,Integer>.
		//members is filtered based on age greater than 40
		//collect(Collectors.toMap) uses a lamba to assign the name of each person to the key(Name) &
		//the age of each person to the value(Integer)
		
		Person person1 = new Person("George", 41, Gender.Male);
		Person person2 = new Person("Stanley", 39, Gender.Male);
		Person person3 = new Person("Solange", 34, Gender.Female);
		Person person4 = new Person("Rachel", 50, Gender.Female);
		
		List<Person> members = new ArrayList<>();
		
		members.add(person1);
		members.add(person2);
		members.add(person3);
		members.add(person4); 	
		
		List<String> memberNamesOver40 =
				members.stream()
				.filter(person -> person.getAge() > 40)
				.map(person -> person.name)
				.collect(Collectors.toList());
		
		System.out.println(memberNamesOver40);
		
		
		Map<String, Integer> memberNamesAndAgesOver40 = 
				members.stream()
				.filter(person -> person.getAge() > 40)
				.collect(Collectors.toMap(
						person -> person.getName(), 
						person -> person.getAge()));
		
		
		System.out.println(memberNamesAndAgesOver40);
	}



}
