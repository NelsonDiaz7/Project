package co.edu.unbosque.demo.jpa.repositories;

import co.edu.unbosque.demo.jpa.entities.Collection;

import java.util.Optional;

public interface CollectionRepository {

    Optional<Collection> save(Collection collection);

}
