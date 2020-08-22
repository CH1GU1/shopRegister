package model;

import static org.junit.Assert.assertEquals;
import java.time.LocalDate;
import org.junit.jupiter.api.Test;
import exceptions.IdNumberException;
import exceptions.IdTypeException;

class ShopTest {
	private Shop shop;

	public void setupScenary1() throws IdNumberException, IdTypeException {
		shop = new Shop(0);
		if(LocalDate.now().getDayOfMonth()%2 != 0) {
			shop.register(1, "1007778208");
		} else {
			shop.register(1, "1007778218");
		}

	}

	public void setupScenary2() throws IdNumberException, IdTypeException {
		shop = new Shop(0);
		shop.register(4, "1007775674");
	}

	public void setupScenary3() throws IdNumberException, IdTypeException {
		shop = new Shop(0);	
		if(LocalDate.now().getDayOfMonth()%2 != 0) {
			shop.register(2, "1005125634");
		} else {
			shop.register(3, "1215075624");
		}
	}

	@Test
	public void testRegister_1() throws IdNumberException, IdTypeException{
		setupScenary1();
		assertEquals("The client was not added!", 1, shop.getClients().size());
	}
	@Test
	public void testRegister_2() throws IdNumberException, IdTypeException{
		try  {
			setupScenary2();		
		} catch ( IdTypeException e) {
			assertEquals("Test TI fault", 0,shop.getClients().size());
		}
	}

	@Test
	public void testRegister_3() throws IdNumberException, IdTypeException{
		try  {
			setupScenary3();		
		} catch (IdNumberException t) {
			assertEquals("Test TI fault", 0,shop.getClients().size());
		}
	}
}
