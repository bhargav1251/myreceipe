package guru.springframework.myreceipe.repositories;

import guru.springframework.myreceipe.domain.UnitOfMeasure;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure, Long> {

    Optional<UnitOfMeasure> findByUomAndId(String uom, Long id);

    Optional<UnitOfMeasure> findByUom(String uom);
}
