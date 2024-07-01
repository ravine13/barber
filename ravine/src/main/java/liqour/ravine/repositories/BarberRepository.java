package liqour.ravine.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import liqour.ravine.entities.Barber;
import java.util.Optional;


public interface BarberRepository extends JpaRepository<Barber, Integer> {
    @Query("SELECT b FROM Barber b WHERE b.id = :id")
    Optional<Barber> findBarberById(@Param("id") Integer id);
}

