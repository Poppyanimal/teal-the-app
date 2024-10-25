import java.util.LinkedList;
import java.util.List;
import org.json.*;

public class Database implements java.io.Serializable
{

    public List<Category> categories = new LinkedList<Category>();
    private List<Transaction> transactions = new LinkedList<Transaction>();

    public Category getCategory(String id)
    {
        for(Category c : categories)
            if(c.categoryID.equals(id))
                return c;
        return null;
    }

    public List<Transaction> getAllTransactions() { return transactions; }

    public void replaceAllTransactions(List<Transaction> t)
    {
        if(!isTransactionsValid(t))
            return;
        transactions = t;
        sortTransactions();
    }

    public boolean isTransactionsValid(List<Transaction> list)
    {
        //TODO: code and err message on fail
        return true;
    }

    public boolean isTransactionValid(Transaction trans)
    {
        //TODO: code and err message on fail
        return true;
    }

    public void sortTransactions()
    {
        //TODO
    }

    //TODO: get transactions for a given date range

    //TODO: get index of x transaction

    //TODO: remove transaction at index x

    //TODO: add x transaction, inserting it so the list remains sorted by recency of date

    //TODO: edit transaction at index y and move it so list stays sorted

}

