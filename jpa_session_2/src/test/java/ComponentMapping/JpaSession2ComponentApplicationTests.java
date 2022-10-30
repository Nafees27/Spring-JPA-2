package ComponentMapping;

import ComponentMapping.Entity.Address;
import ComponentMapping.Entity.Employees;
import ComponentMapping.Repository.EmployeesRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.junit.runner.Runner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@RunWith(Runner.class)
class JpaSession2ComponentApplicationTests
{
	@Autowired
	EmployeesRepository employeesRepository;

	@Test
	void contextLoads()
	{
	}

	@Test
	public void createEmployee()
	{
		Employees employees = new Employees();
		employees.setId(1);
		employees.setName("Nafees");

		Address address = new Address();
		address.setCity("Muzaffarpur");
		address.setCountry("India");
		address.setState("Bihar");
		address.setZipcode("842001");
		address.setStreetaddress("MDM LANE");

		employees.setAddress(address);
		employeesRepository.save(employees);
	}
}
