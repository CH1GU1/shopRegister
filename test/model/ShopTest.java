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
		shop.register(1, "1007778208");

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
			shop.register(2, "1215075624");
		}
	}

	@Test
	public void testRegister_1() throws IdNumberException, IdTypeException{
		setupScenary1();
		assertEquals("The client was note added!", "1007778208", shop.getClients().get(0).getIdNum());
	}
	@Test
	public void testRegister_2() throws IdNumberException, IdTypeException{
		try  {
			setupScenary2();		
		} catch ( IdTypeException e) {
			assertEquals("Test TI incorrect","The person has TI No valid ID to entry",e.getMessage().toString());
		}
	}

	@Test
	public void testRegister_3() throws IdNumberException, IdTypeException{
		try  {
			setupScenary3();		
		} catch (IdNumberException t) {
				assertEquals("You can not entry today, please check your penultimate digit of id and the today's date",t.getMessage().toString());
		}
	}
}
