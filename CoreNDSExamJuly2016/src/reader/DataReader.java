package reader;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
/*
		 * User API to read the below textFile and print to console.
		 * Use BufferedReader class.
		 * Use try....catch block to handle Exception.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 *
		 */
public class DataReader {

		public static void main(String[] args)throws IOException {
			String textFile = System.getProperty("user.dir") + "/src/data/self-driving-car.txt";
			try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Zaqc\\CoreNDSExamJuly2016\\src\\data\\self-driving-car")))
			{

				String sCurrentLine;

				while ((sCurrentLine = br.readLine()) != null) {
					System.out.println(sCurrentLine);
				}

			} catch (IOException e) {
				e.printStackTrace();
			}

		}



	}

