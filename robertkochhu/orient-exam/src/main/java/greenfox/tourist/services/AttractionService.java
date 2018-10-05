package greenfox.tourist.services;

import greenfox.tourist.models.Attraction;

public interface AttractionService {
    Iterable<Attraction> findAll();
    void create(String nameInput,String cityInput,String priceInput,String longitudeInput,String latitudeInput,String categoryInput,String durationInput,String recommandedAgeInput );
}
