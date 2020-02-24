package com.luv2code.springdemo;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class RandomFileFortuneService implements FortuneService {
	
	// create an empty list
	private List<String> list;
	// create a random number generator 
	private Random random = new Random();
	private String filePath = "src/fortuneFile.txt";
	
	// create fortune variables read from file
	/*@Value("${foo.fortune1}")
	private String fortune1;
	
	@Value("${foo.fortune2}")
	private String fortune2;
	
	@Value("${foo.fortune3}")
	private String fortune3;
	*/
	
	public RandomFileFortuneService() {
		System.out.println("Inside RandomFileFortuneService constructor");
	}
	
	// without @PostConstruct - readFortuneFromFile method won't be performed and as a result list will be empty - exception will be thrown
	@PostConstruct
	public void readFortuneFromFile() {
	File file = new File(filePath);
	
	System.out.println("Reading fortunes from file: " + file);
	System.out.println("File exists: " + file.exists());
	
	// initializing empty array list
	list = new ArrayList<>();
	
	// reading strings from file using Scanner class
	try (Scanner scanner = new Scanner(file)) {
		while (scanner.hasNextLine()) {
			String tempLine = scanner.nextLine();
			list.add(tempLine);
		}
	} catch(IOException e) {
		e.printStackTrace();
	}
	
	// reading strings from file using BufferedReader class
	/*
	try (BufferedReader br = new BufferedReader(
				new FileReader(theFile))) {

			String tempLine;

			while ((tempLine = br.readLine()) != null) {
				theFortunes.add(tempLine);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	 */
	}
	
	@Override
	public String getDailyFortune() {
		/*
		list.add(fortune1);
		list.add(fortune2);
		list.add(fortune3);
		*/
		
		// picks a random int from the range = to list size
		int index = random.nextInt(list.size());
		
		String theFortune = list.get(index);
		
		return theFortune;
	}

}
