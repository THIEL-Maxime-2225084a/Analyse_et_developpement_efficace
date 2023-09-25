package listeSimple;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ListeSimpleStringTest {

	@Test
	void testListeSimpleStringConstructeur() {
		ListeSimpleString l = new ListeSimpleString("13");
		assertNotEquals(null, l);
	}
		
