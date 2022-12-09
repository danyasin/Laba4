import com.opencsv.CSVReader;

import java.io.FileReader;
import java.io.IOException;
import java.util.*;

/**
 * @author Sinitsin Danila
 */

public class Main {
    public static  void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("C:\\Users\\User\\IdeaProjects\\foreign_names.csv");
        CSVReader reader = new CSVReader(fileReader, ';');
        String[] nextLine;
        List<Man> list = new ArrayList<>();
        while ((nextLine = reader.readNext()) != null) {
            Random rand = new Random();
            int num = rand.nextInt(50000);
            list.add(new Man(nextLine[0], nextLine[1], nextLine[2], nextLine[5], nextLine[3], nextLine[4], num));

        }
        for (int i=1; i< list.size(); i++)
        {
            System.out.print(list.get(i).getId()+"; ");
            System.out.print(list.get(i).getName()+"; ");
            System.out.print(list.get(i).getGender()+"; ");
            System.out.print(list.get(i).getBirthday()+"; ");
            System.out.print(list.get(i).getUnitTitle()+"; ");
            System.out.print(list.get(i).getUnitId()+"; ");
            System.out.print(list.get(i).getSalary()+"; ");
            System.out.println();
        }

    }
}