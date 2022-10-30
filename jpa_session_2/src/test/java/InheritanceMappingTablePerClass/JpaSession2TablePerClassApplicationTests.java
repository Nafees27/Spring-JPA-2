package InheritanceMappingTablePerClass;

import InheritanceMappingTablePerClass.Entity.Check;
import InheritanceMappingTablePerClass.Entity.CreditCard;
import InheritanceMappingTablePerClass.Repository.PaymentRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JpaSession2TablePerClassApplicationTests
{
	@Autowired
	PaymentRepository paymentRepository;
	@Test
	void contextLoads()
	{
	}

	@Test
	public void createPaymentCheck()
	{
		Check checkPayment = new Check();
		checkPayment.setId(1);
		checkPayment.setAmount(19000);
		checkPayment.setChecknumber("D3580");
		paymentRepository.save(checkPayment);
	}

	@Test
	public void createPaymentCreditCard()
	{
		CreditCard creditCardPayment = new CreditCard();
		creditCardPayment.setId(1);
		creditCardPayment.setAmount(18000);
		creditCardPayment.setCardnumber("P8880");
		paymentRepository.save(creditCardPayment);

	}

}
