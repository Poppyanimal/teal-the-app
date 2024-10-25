import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main
{
    public static void main(String[] args)
    {
        testDatabaseReadWrite();

        TealAppDashboard.main(args);
    }


    //TEST
    static void testDatabaseReadWrite()
    {
        Database d = new Database();
        d.categories = new LinkedList<Category>(Arrays.asList
        (
                new Category("test_food","Food (Test)"),
                new Category("test_bills","Bills (Test)")
        ));
        d.replaceAllTransactions(new LinkedList<Transaction>(Arrays.asList
        (
            new Transaction(2024, 10, 20, 45.32, "Pete's", "test_food"),
            new Transaction(2024, 10, 17, 18.21, "Water", "test_bills")
        )));
        JsonReadWriter.writeDatabasesToFile(d);
        d = JsonReadWriter.readDatabasesFromFile();
        System.out.println(d);
    }
}