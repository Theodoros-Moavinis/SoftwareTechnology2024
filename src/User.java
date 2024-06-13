import java.util.ArrayList;

public class User {

    private String name;
    private String password;
    private ArrayList<TouristPackage> tourPackages = new ArrayList<TouristPackage>();

    public User(String name, String password) {
        this.name = name;
        this.password = password;
        tourPackages = null;
    }

    public ArrayList<TouristPackage> getTourpack() {
        return tourPackages;
    }

    public void setTourpack(ArrayList<TouristPackage> tourpackages) {
        this.tourPackages = tourpackages;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}