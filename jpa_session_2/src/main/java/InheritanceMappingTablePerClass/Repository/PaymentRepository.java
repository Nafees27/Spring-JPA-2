package InheritanceMappingTablePerClass.Repository;

import InheritanceMappingTablePerClass.Entity.Payment;
import org.springframework.data.repository.CrudRepository;

public interface PaymentRepository extends CrudRepository<Payment,Integer>
{

}
