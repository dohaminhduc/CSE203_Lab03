import java.util.Scanner;

public class CD {
    public CD(String title, String type, String id, double price, int yearOfRelease, String collection) {
        this.title = title;
        this.type = type;
        this.id = id;
        this.price = price;
        this.yearOfRelease = yearOfRelease;
        this.collection = collection;
    }

    public CD(){}

    public String getTitle() {
        return title;
    }

    public String getType() {
        return type;
    }

    public String getId() {
        return id;
    }

    public double getPrice() {
        return price;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public String getCollection() {
        return collection;
    }

    public void setCollection(String collection) {
        this.collection = collection;
    }

    private String collection;
    private String title;
    private String type;
    private String id;
    private double price;
    private int yearOfRelease;

    public void setCD(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter title: ");
        title = sc.nextLine();
        System.out.print("Enter type: ");
        type = sc.nextLine();
        System.out.print("Enter id: ");
        id = sc.nextLine();
        System.out.print("Enter price: ");
        price = sc.nextDouble();
        System.out.print("Enter year of release: ");
        yearOfRelease = sc.nextInt();
    }

    public void Display(){
        System.out.println("Title: " + title);
        System.out.println("Type: " + type);
        System.out.println("ID: " + id);
        System.out.println("Price: " + price);
        System.out.println("Year of release: " + yearOfRelease);
    }
}
