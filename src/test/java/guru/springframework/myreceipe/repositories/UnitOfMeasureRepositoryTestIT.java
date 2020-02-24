package guru.springframework.myreceipe.repositories;

import guru.springframework.myreceipe.domain.UnitOfMeasure;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(SpringExtension.class)
@DataJpaTest
class UnitOfMeasureRepositoryTestIT {
    @Autowired
    public UnitOfMeasureRepository unitOfMeasureRepository;

    @BeforeEach
    void setUp() {
    }

    @Test
    void findByUomIT() {

        assertEquals("Tablespoon", unitOfMeasureRepository.findByUom("Tablespoon").get().getUom());


    }

    @Test
    void findByUomAndIdIT() {
        Optional<UnitOfMeasure> unitOfMeasure = unitOfMeasureRepository.findByUomAndId("Pinch", 4L);
        assertEquals("Pinch", unitOfMeasure.get().getUom());
    }

}