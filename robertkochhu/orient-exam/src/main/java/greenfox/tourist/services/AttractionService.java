package greenfox.tourist.services;

import greenfox.tourist.models.Attraction;

public interface AttractionService {
    Iterable<Attraction> findAll();
}
