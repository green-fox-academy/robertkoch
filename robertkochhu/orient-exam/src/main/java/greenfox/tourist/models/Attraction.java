package greenfox.tourist.models;

import javax.persistence.*;

@Entity
@Table(name = "attractions")
public class Attraction {

    @Column(name ="attrName")
    private String name;
    private String city;
    private String category;
    private int price;
    private float longitude;
    private float latitude;
    private float recommandedAge;
    private int duration;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    public Attraction() {
    }


    public Attraction(String name, String city, String category, int price, float longitude, float latitude, float recommandedAge, int duration) {
        this.name = name;
        this.city = city;
        this.category = category;
        this.price = price;
        this.longitude = longitude;
        this.latitude = latitude;
        this.recommandedAge = recommandedAge;
        this.duration = duration;
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

    public float getLongitude() {
        return longitude;
    }

    public void setLongitude(float longitude) {
        this.longitude = longitude;
    }

    public float getLatitude() {
        return latitude;
    }

    public void setLatitude(float latitude) {
        this.latitude = latitude;
    }

    public float getRecommandedAge() {
        return recommandedAge;
    }

    public void setRecommandedAge(float recommandedAge) {
        this.recommandedAge = recommandedAge;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
