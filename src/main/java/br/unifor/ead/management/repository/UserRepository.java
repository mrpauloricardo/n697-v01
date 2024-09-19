package br.unifor.ead.management.repository;

import br.unifor.ead.management.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String > {
}
