///import java.util.Locale.Category;
import java.util.ArrayList;
import java.util.List;

public class Category implements java.io.Serializable
{
    public final String categoryID;
    public String categoryName;

    public Category(String categoryID, String categoryName)
    {
        this.categoryID = categoryID;
        this.categoryName = categoryName;
    }

    //Note: json parser requires get fields even if field is public
    public String getCategoryID() { return categoryID; }
    public String getCategoryName() { return categoryName; }

}
