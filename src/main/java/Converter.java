import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;
import org.codehaus.jackson.map.ObjectMapper;


import java.io.*;

public class Converter {

    public static void main(String[] args) {

        ObjectMapper mapper = new ObjectMapper();

        CsvMapper csvMapper = new CsvMapper();
        CsvSchema schema = csvMapper.schemaFor(DataPojo.class);

        String bathPath="/home/jupiter/Downloads/aqicn_data/2017_01_02";

        File folder = new File(bathPath);
        File[] listOfFiles = folder.listFiles();

        for (int i = 0; i < listOfFiles.length; i++) {
            if (listOfFiles[i].isFile()) {
                System.out.println("File " + listOfFiles[i].getName());

                try (BufferedReader br = new BufferedReader(new FileReader(bathPath+"/"+listOfFiles[i].getName()))) {

                    Writer output = new BufferedWriter(new FileWriter("result.csv", true));
                    String sCurrentLine;

                    while ((sCurrentLine = br.readLine()) != null) {
                        System.out.println(sCurrentLine);
                        if(!sCurrentLine.contains("N/A"))
                        {
                            DataPojo pojo=mapper.readValue(sCurrentLine, DataPojo.class);
                            String csv = csvMapper.writer(schema).writeValueAsString(pojo);
                            System.out.println(csv);
                            output.append(csv);

                        }
                    }

                    output.close();


                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        }




    }


}
