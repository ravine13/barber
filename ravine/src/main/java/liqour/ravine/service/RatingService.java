package liqour.ravine.service;

import liqour.ravine.entities.Rating;
import liqour.ravine.repositories.RatingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RatingService {

    private final RatingRepository ratingRepository;

    @Autowired
    public RatingService(RatingRepository ratingRepository) {
        this.ratingRepository = ratingRepository;
    }

    // Create
    public Rating saveRating(Rating rating) {
        return ratingRepository.save(rating);
    }

    // Read
    public Iterable<Rating> getAllRatings() {
        return ratingRepository.findAll();
    }

    public Rating getRatingById(Integer id) {
        return ratingRepository.findById(id).orElse(null);
    }

    // Update
    public Rating updateRating(Rating rating) {
        return ratingRepository.save(rating);
    }

    // Delete
    public void deleteRating(Integer id) {
        ratingRepository.deleteById(id);
    }
}
