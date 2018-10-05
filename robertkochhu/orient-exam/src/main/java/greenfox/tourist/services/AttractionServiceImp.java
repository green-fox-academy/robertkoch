package greenfox.tourist.services;

import greenfox.tourist.models.Attraction;
import greenfox.tourist.repositories.AttractionRepository;
import org.springframework.stereotype.Service;

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
}