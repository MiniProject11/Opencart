package excellRead;

import java.io.FileReader;

import com.opencsv.CSVReader;

public class excellFileRead {

	public static void main(String args[]) throws Exception {

		String csvfile="D:\\LoginData.csv";
		CSVReader reader=new CSVReader(new FileReader(csvfile));
		String[] cell=reader.readNext();
		String loginData[][]=new String[10][2];
		int k=0;
		while((cell=reader.readNext())!=null) {
			
			for(int i=0;i<cell.length;i++)
			{
				loginData[k][i]=cell[i];
			}
			System.out.println("89");
			k++;
		}
		for(int i=0;i<loginData.length;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.print(loginData[i][j]+" ");
			}
			System.out.println();
		}
	}
}

