package greenfox.tourist.models;

import javax.persistence.*;

@Entity
@Table(name ="attractions")
public class Attraction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "attrName")
    private String name;
    private String city;
    private String category;
    private int price;
    private String longitude;
    private String latitude;
    private int recommandedAge;
    private int duration;

    public Attraction() {
    }

    public Attraction(String name, String city, String category, int price, String longitude, String latitude, int recommandedAge, int duration) {
        this.name = name;
        this.city = city;
        this.category = category;
        this.price = price;
        this.longitude = longitude;
        this.latitude = latitude;
        this.recommandedAge = recommandedAge;
        this.duration = duration;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public int getRecommandedAge() {
        return recommandedAge;
    }

    public void setRecommandedAge(int recommandedAge) {
        this.recommandedAge = recommandedAge;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}
