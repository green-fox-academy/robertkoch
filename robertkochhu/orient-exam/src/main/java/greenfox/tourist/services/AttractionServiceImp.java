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
}
