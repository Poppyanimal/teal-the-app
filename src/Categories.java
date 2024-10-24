///import java.util.Locale.Category;
import java.util.ArrayList;
import java.util.List;

public class Categories {
    private String categoryName;
    private static List<Categories> categoryList = new ArrayList<>();

    public Categories(String name) {
        categoryName = name;
    }
    public String getName(){
        return categoryName;
    }
    public void setName(String name) {
        categoryName = name;
    }
    public String toString() {
        return "- " + categoryName;
    }
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Categories otherCategory = (Categories) o;
        return categoryName.equals(otherCategory.categoryName);
    }
    public static boolean addCategory(String name) {
        for (Categories category : categoryList) {
            if (category.getName().equals(name)) {
                return false;
            }
        } 
        Categories newCategory = new Categories(name);
        categoryList.add(newCategory);
        return true;
    }
    public static void displayCategories() {
        for (Categories list : categoryList) {
            System.out.println(list);
        }
    }

    public static void main(String[] args) throws Exception {
        Categories foodCategory = new Categories("Food");
        Categories transportCategory = new Categories("Transport");
        Categories anotherFoodCategory = new Categories("Food");
        // Test cases
        System.out.println("Category Name: " + foodCategory.getName());
        System.out.println("Category toString: " + foodCategory.toString());
        System.out.println("foodCategory equals anotherFoodCategory: " + foodCategory.equals(anotherFoodCategory));
        System.out.println("foodCategory equals transportCategory: " + foodCategory.equals(transportCategory));
        transportCategory.setName("Public Transport");
        System.out.println("Updates Transport Category: " + transportCategory.getName());
        System.out.println("");
        System.out.println("Adding Food Category: " + Categories.addCategory("Food"));
        System.out.println("Adding Transport Catergory: " + Categories.addCategory("Transport"));
        System.out.println("Adding Food Category again: : " + Categories.addCategory("Food"));
        System.out.println("Current Categories"); 
        Categories.displayCategories();
    }
}
