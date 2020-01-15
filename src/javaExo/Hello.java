package javaExo;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hi");
		//I'm feature 2
		
		Stream.of("a1", "a2", "a3")
		.map(s -> s.substring(1))
		.collect(Collectors.toList())
		.forEach(System.out::println);
		
		// More of feature 2
		
		Arrays.asList("a1", "a2", "a3")
			.stream()
			.filter(s -> s.startsWith("a"))
			.map(s -> s.toUpperCase())
			.forEach(System.out::println);
		
		try {
			
		}
		catch(Exception e) {
			System.out.println();
		}
	}

}
