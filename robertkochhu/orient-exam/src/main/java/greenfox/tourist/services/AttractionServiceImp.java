package greenfox.tourist.services;

import greenfox.tourist.models.Attraction;
import greenfox.tourist.repositories.AttractionRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AttractionServiceImp implements AttractionService {
    AttractionRepository attractionRepository;

    public AttractionServiceImp(AttractionRepository attractionRepository) {
        this.attractionRepository = attractionRepository;
    }

    @Override
    public Iterable<Attraction> findAll() {
        return attractionRepository.findAll();
    }

    @Override
    public void create(String nameInput, String cityInput, String priceInput, String longitudeInput, String latitudeInput, String categoryInput, String durationInput, String recommandedAgeInput) {
        attractionRepository.save(new Attraction(nameInput, cityInput, categoryInput, Integer.parseInt(priceInput),
                Float.parseFloat(longitudeInput), Float.parseFloat(latitudeInput), Float.parseFloat(recommandedAgeInput), Integer.parseInt(durationInput)));
    }
    @Override
    public Attraction attractionFinder(long id) {
       return  attractionRepository.findById(id).orElse(null);
    }

    @Override
    public Attraction cheapestRestaurantFinder(Iterable<Attraction> list) {
        return null;
    }

    @Override
    public void editName(long id, String nameInput) {
        Optional<Attraction> attraction = attractionRepository.findById(id);
        attraction.get().setName(nameInput);
    }

    @Override
    public void editcity(long id, String cityInput) {
        Optional<Attraction> attraction = attractionRepository.findById(id);
        attraction.get().setCity(cityInput);
    }

    @Override
    public void editLongitude(long id, String longitudeInput) {
        Optional<Attraction> attraction = attractionRepository.findById(id);
        attraction.get().setLongitude(Float.parseFloat(longitudeInput));
    }

    @Override
    public void editLatitude(long id, String latitudeInput) {
        Optional<Attraction> attraction = attractionRepository.findById(id);
        attraction.get().setLatitude(Float.parseFloat(latitudeInput));

    }

    @Override
    public void editCategory(long id, String categoryInput) {
        Optional<Attraction> attraction = attractionRepository.findById(id);
        attraction.get().setCategory(categoryInput);
    }

    @Override
    public void editDuration(long id, String durationInput) {
        Optional<Attraction> attraction = attractionRepository.findById(id);
        attraction.get().setDuration(Integer.parseInt(durationInput));
    }

    @Override
    public void editRecommandedAge(long id, String recommandedAgeInput) {
        Optional<Attraction> attraction = attractionRepository.findById(id);
        attraction.get().setRecommandedAge(Float.parseFloat(recommandedAgeInput));
    }

    @Override
    public void editPrice(long id, String priceInput) {
        Optional<Attraction> attraction = attractionRepository.findById(id);
        attraction.get().setPrice(Integer.parseInt(priceInput));
    }


}