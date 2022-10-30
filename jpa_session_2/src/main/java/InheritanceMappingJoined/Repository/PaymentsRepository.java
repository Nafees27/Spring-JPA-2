package InheritanceMappingJoined.Repository;

import InheritanceMappingJoined.Entity.Payments;
import org.springframework.data.repository.CrudRepository;

public interface PaymentsRepository extends CrudRepository<Payments,Integer>
{

}
