package netology.ru.NOSQL_HW.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

@org.springframework.stereotype.Repository
public interface Repository extends MongoRepository<User, String> {

}
