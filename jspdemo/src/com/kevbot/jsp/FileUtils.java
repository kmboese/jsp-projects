package com.kevbot.jsp;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class FileUtils {
	public static void writeListToFile(List<String> lst, String path) {
		
		if (lst == null) {
			return;
		}
		
		try {
			FileWriter writer = new FileWriter(path);
			for (String item : lst) {
				writer.write(item + "\n");
			}
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static List<String> loadListFromFile(String path) {
		List<String> list = new ArrayList<String>();
		
		try {
			File file = new File(path);
			Scanner sc = new Scanner(file);
			
			while (sc.hasNextLine()) {
				String line = sc.nextLine();
				list.add(line);
			}
			
			sc.close();
			
		}
		catch (FileNotFoundException e) {
			System.out.println("User list file " + path + " does not exist.");
			return list;
		}
		catch (Exception e) {
			e.printStackTrace();
			return list;
		}
		
		System.out.println("Loaded list from file " + path);
		return list;
	}
}
