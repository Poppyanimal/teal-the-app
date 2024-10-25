import org.json.JSONArray;
import org.json.JSONObject;
import java.io.*;
import java.util.Scanner;

public class JsonReadWriter
{
    public static final String filename = "Database.json";

    public static boolean writeDatabasesToFile(Database data)
    {
        JSONObject obj = new JSONObject();

        JSONArray catArr = new JSONArray(data.categories);

        JSONArray transArr = new JSONArray(data.getAllTransactions());

        obj.put("categories", catArr);
        obj.put("transactions", transArr);

        try
        {
            File output = new File(filename);
            if (output.createNewFile())
                System.out.println("Database file does not exist, making one.");

            FileWriter writer = new FileWriter(filename);
            writer.write(obj.toString(1));
            writer.close();

        }
        catch (Exception e)
        {
            System.err.println("Error writing to file.");
            e.printStackTrace();
        }

        //TODO write to file

        return false;
    }

    public static Database readDatabasesFromFile()
    {
        try
        {
            Scanner file = new Scanner(new File(filename));
            StringBuilder contentsBuilder = new StringBuilder();

            while(file.hasNext())
                contentsBuilder.append(file.next());

            String input = contentsBuilder.toString();

            JSONObject obj = new JSONObject(input);

            //TODO: parse categories and transactions

            Database data = new Database();
            //data.categories = categories;
            //data.replaceAllTransactions(transactions);
            return data;
        }
        catch (Exception e)
        {
            System.err.println("Failed to read database file, making new database");
            e.printStackTrace();
            //TODO: pop up asking if user wants to format the database before formatting database
            return new Database();
        }

    }
}
