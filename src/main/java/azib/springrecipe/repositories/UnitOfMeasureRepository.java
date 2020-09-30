package azib.springrecipe.repositories;

import azib.springrecipe.recipe.domain.UnitOfMeasure;
import org.springframework.data.repository.CrudRepository;

public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure,Long> {
}
