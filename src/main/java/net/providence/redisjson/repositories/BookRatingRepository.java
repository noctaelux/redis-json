package net.providence.redisjson.repositories;

import net.providence.redisjson.models.BookRating;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRatingRepository extends CrudRepository<BookRating,String> {
}
