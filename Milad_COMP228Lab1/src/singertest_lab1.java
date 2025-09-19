class Singers {
    // instance variables
    private int singerId;
    private String singerName;
    private String singerAddress;
    private String dateOfBirth;
    private int numAlbumsPublished;

    // no-argument constructor
    public Singers() {
        singerId = 0;
        singerName = "";
        singerAddress = "";
        dateOfBirth = "";
        numAlbumsPublished = 0;
    }

    // constructor with arguments
    public Singers(int id, String name, String address, String dob, int albums) {
        singerId = id;
        singerName = name;
        singerAddress = address;
        dateOfBirth = dob;
        numAlbumsPublished = albums;
    }

    // setters
    public void setSingerId(int id) { singerId = id; }
    public void setSingerName(String name) { singerName = name; }
    public void setSingerAddress(String address) { singerAddress = address; }
    public void setDateOfBirth(String dob) { dateOfBirth = dob; }
    public void setNumAlbumsPublished(int albums) { numAlbumsPublished = albums; }

    // getters
    public int getSingerId() { return singerId; }
    public String getSingerName() { return singerName; }
    public String getSingerAddress() { return singerAddress; }
    public String getDateOfBirth() { return dateOfBirth; }
    public int getNumAlbumsPublished() { return numAlbumsPublished; }
}

public class singertest_lab1 {
    public static void main(String[] args) {
        // object with no-argument constructor
        Singers s1 = new Singers();
        System.out.println("Default values:");
        System.out.println("ID: " + s1.getSingerId());
        System.out.println("Name: " + s1.getSingerName());
        System.out.println("Address: " + s1.getSingerAddress());
        System.out.println("DOB: " + s1.getDateOfBirth());
        System.out.println("Albums: " + s1.getNumAlbumsPublished());

        // set values using individual setters
        s1.setSingerId(101);
        s1.setSingerName("Mahsa Amini");
        s1.setSingerAddress("123 North York, Ont");
        s1.setDateOfBirth("1985-04-12");
        s1.setNumAlbumsPublished(4);

        System.out.println("\nAfter setting values:");
        System.out.println("ID: " + s1.getSingerId());
        System.out.println("Name: " + s1.getSingerName());
        System.out.println("Address: " + s1.getSingerAddress());
        System.out.println("DOB: " + s1.getDateOfBirth());
        System.out.println("Albums: " + s1.getNumAlbumsPublished());

        // change values individually again
        s1.setSingerId(202);
        s1.setSingerName("Hamid Rohi");
        s1.setSingerAddress("456 Steels Avenue, Toronto");
        s1.setDateOfBirth("1992-08-30");
        s1.setNumAlbumsPublished(7);

        System.out.println("\nAfter updating values:");
        System.out.println("ID: " + s1.getSingerId());
        System.out.println("Name: " + s1.getSingerName());
        System.out.println("Address: " + s1.getSingerAddress());
        System.out.println("DOB: " + s1.getDateOfBirth());
        System.out.println("Albums: " + s1.getNumAlbumsPublished());
    }
}
