package main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		Map<String, String> block = Map.of("int", "", "String", "", "double",
				"", "float", "", "boolean", "", "char", "", "{", ":", "}", "");
		String filePath = "D:\\input.txt";

		try {
			BufferedReader brr = new BufferedReader(new FileReader(filePath));
			System.out.println(false);
			File output = new File("Output.txt");
			FileWriter fw = new FileWriter(output);

			String line = brr.readLine();
			while (line != null) {
				String[] splitedLine = line.split(" ");

				for (int i = 0; i < splitedLine.length; i++) {
					if (block.containsKey(splitedLine[i])) {
						splitedLine[i] = block.get(splitedLine[i]);
					}
				}

				String a = Arrays.toString(splitedLine);
				System.out.println(a);
				fw.write(a);
				line = brr.readLine();
			}

			fw.close();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.print(false);
		}

	}
}
