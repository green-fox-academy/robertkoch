package greenfox.tourist.services;

import greenfox.tourist.models.Attraction;

public interface AttractionService {
    Iterable<Attraction> findAll();
    void create(String nameInput,String cityInput,String priceInput,String longitudeInput,
                String latitudeInput,String categoryInput,String durationInput,String recommandedAgeInput );
    void editName(long id,String nameInput);
    void editcity(long id,String cityInput);
    void editLongitude(long id,String longitudeInput);
    void editLatitude(long id,String latitudeInput);
    void editCategory(long id,String categoryInput);
    void editDuration(long id,String durationInput);
    void editRecommandedAge(long id,String recommandedAgeInput);
    void editPrice(long id,String priceInput);
}
