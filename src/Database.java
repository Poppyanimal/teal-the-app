import java.util.LinkedList;
import java.util.List;

public class Database
{

    public List<Category> categories = new LinkedList<Category>();
    //private List<Transaction> transactions = new LinkedList<transaction>();

    public Category getCategory(String id)
    {
        for(Category c : categories)
            if(c.categoryID.equals(id))
                return c;
        return null;
    }

    //TODO: get all transactions

    //TODO: get transactions for a given date range

    //TODO: get index of x transaction

    //TODO: remove transaction at index x

    //TODO: add x transaction, inserting it so the list remains sorted by recency of date

    //TODO: edit transaction at index y and move it so list stays sorted

}

