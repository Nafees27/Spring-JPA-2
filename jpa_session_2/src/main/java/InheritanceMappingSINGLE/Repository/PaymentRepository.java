package InheritanceMappingSINGLE.Repository;

import InheritanceMappingSINGLE.Entity.Payment;
import org.springframework.data.repository.CrudRepository;

public interface PaymentRepository extends CrudRepository<Payment,Integer>
{

}
