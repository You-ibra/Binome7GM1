import java.io.*;

 

public class testP {
    public static void main(String[] args) {
        FileInputStream fis; BufferedInputStream bis;
        try {
            fis = new FileInputStream(new File("test.txt"));
            bis = new BufferedInputStream(new FileInputStream(new File("c:\\temp\\test.txt")));
            byte[] buf = new byte[8];
            long startTime = System.currentTimeMillis();
            while(fis.read(buf) != -1);
            System.out.println("Temps de lecture avec FileInputStream : " +
                    (System.currentTimeMillis() - startTime));
            startTime = System.currentTimeMillis();
            while(bis.read(buf) != -1);
            System.out.println("Temps de lecture avec BufferedInputStream : " +
                    (System.currentTimeMillis() - startTime));
            fis.close();
            bis.close();
        }
        catch (FileNotFoundException e) { 
        	e.printStackTrace(); 
        	}
        catch (IOException e) { 
        	e.printStackTrace();
        	}
    }
}

