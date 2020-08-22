package model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertTrue;

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
		shop.register(2, "1007775634");

	}

	@Test
	public void testRegister_1() throws IdNumberException, IdTypeException{
		setupScenary1();
		assertEquals("The client was note added!", "1007778208", shop.getClients().get(0).getIdNum());


		try  {
			setupScenary2();
			System.out.println("Caution, error on test ID type");			
		} catch ( IdTypeException e) {
			assertEquals("Test TI incorrect","The person has TI No valid ID to entry",e.getMessage().toString());
		}


		try  {
			setupScenary3();
			System.out.println("Caution, error on test ID number by date");			
		} catch (IdNumberException t) {
			assertEquals("Test ID number incorrect","You can not entry today, penultimate number is 3",t.getMessage().toString());
		}

	}
}
