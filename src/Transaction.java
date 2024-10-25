public class Transaction implements java.io.Serializable {
    private int year;
    private int month;
    private int day;
    private double amount;
    private String payee;
    private String category;

    public Transaction(int year, int month, int day, double amount, String payee, String category) {
        this.year = year;
        this.month = month;
        this.day = day;
        this.amount = amount;
        this.payee = payee;
        this.category = category;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getPayee() {
        return payee;
    }

    public void setPayee(String payee) {
        this.payee = payee;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String toString() {
        return "Transaction{" +
                "date=" + year + "-" + month + "-" + day +
                ", amount=" + amount +
                ", payee='" + payee + '\'' +
                ", category='" + category + '\'' +
                '}';
    }
}
