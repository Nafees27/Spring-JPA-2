package ComponentMapping.Repository;

import ComponentMapping.Entity.Employees;
import org.springframework.data.repository.CrudRepository;

public interface EmployeesRepository extends CrudRepository<Employees,Integer>
{

}
