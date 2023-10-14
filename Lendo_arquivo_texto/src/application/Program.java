package application;

import java.io.File;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
	/*	File file = new File("C:\\Curso Udemy\\in.txt");
		Scanner sc = null;
		
		try {
			sc = new Scanner(file);
			
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		} catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		finally {
			if(sc != null) {
				sc.close();
			}
		}*/

	   // FileReader and BufferedReader
		
	/*	String path = "C:\\Curso Udemy\\in.txt";
		
	//	FileReader fr = null;
	//	BufferedReader br = null;
		
		// -> Try with resources
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))){
		//	fr = new FileReader(path);
		//	br = new BufferedReader(fr);
			
			String line = br.readLine();
			
			while (line != null) {
				System.out.println(line);
				line = br.readLine();
			}
		} catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		/*finally {
			
			try {
				if(br != null) {
					br.close();
				}
				if(fr != null) {
					fr.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		} */
		
		// -> FileWriter e BufferWriter
		
	/*	String[] lines = new String[] { "Good morning", "Good Afternoon", "Good night"};
		
		String path = "C:\\Curso Udemy\\out.txt";
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))){
			
			for (String line : lines) {
				bw.write(line);
				bw.newLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		} */
		
		/// Manipulando pastas com o file
		
	/*	Scanner sc = new Scanner(System.in);
		
		// Lista de pastas
		System.out.println("Enter a folder path: ");
		String strPath = sc.nextLine();
		
		File path = new File(strPath);
		
		File[] folders = path.listFiles(File::isDirectory);
		System.out.println("FOLDERS: ");
		
		for (File folder : folders) {
			System.out.println(folder);
		}
		
		// Lista de arquivos
		
		File[] files = path.listFiles(File::isFile);
		System.out.println("FILES: ");
		
		for (File file : files) {
			System.out.println(file);
		}
		
		// Criando a sub Pasta
		
		boolean success = new File(strPath + "\\subdir").mkdir();
		System.out.println("Directory created with successfully: " + success);
		
		sc.close(); */
		
		// Informações do caminho do arquivo
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a file path: ");
		String strPath = sc.nextLine();
		
		File path = new File(strPath);
		
		System.out.println("getName: " + path.getName());
		System.out.println("getParent: " + path.getParent());
		System.out.println("getPath: " + path.getPath());
		
		sc.close();
	}

}
