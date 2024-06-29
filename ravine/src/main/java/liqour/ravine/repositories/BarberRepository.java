package liqour.ravine.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import liqour.ravine.entities.Barber;


@Repository
public interface BarberRepository extends JpaRepository<Barber,Integer> {
    @Query("SELECT r FROM barber r WHERE r.id = :id")
    Optional<Barber> findBarberById(@Param("id")Integer id);
    

    
}
