package nutritious.prog.system.repositories;

import nutritious.prog.system.model.Client;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<Client, Long> {
}
