package textFileTest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TextFileTest {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		File f = new File("C:\\SeleniumWorkspace\\FileHandlingTest\\file\\test.txt");
		if (!f.exists()) {
			f.createNewFile();
		}
		FileWriter fw = new FileWriter(f); //(f,true)
		BufferedWriter bw = new BufferedWriter(fw);
		/*bw.write("Vmetry 1");
		bw.newLine();
		bw.write("Vmetry 2");
		bw.newLine();
		bw.write("Vmetry 3");
		bw.close();*///similar to Save.To tell buffer writer that it is completed with operation
		for(int i = 1; i<=10;i++) {
			bw.write("Vmetry"+i);
			bw.newLine();
			bw.newLine();
		}
		bw.close();
		
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		String x = "";
		while((x = br.readLine())!=null)
		{
		System.out.println(x);
		}
	}

}