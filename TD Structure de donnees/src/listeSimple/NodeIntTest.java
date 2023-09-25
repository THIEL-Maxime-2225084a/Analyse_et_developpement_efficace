package listeSimple;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class NodeIntTest {

	@Test
	void testNodeInt() {
		fail("Not yet implemented");
	}

	@Test
	void testNodeIntIntNodeInt() {
		fail("Not yet implemented");
	}

	@Test
	void testGetElement() {
		fail("Not yet implemented");
	}

	@Test
	void testSetElement() {
		fail("Not yet implemented");
	}

	@Test
	void testGetNext() {
		fail("Not yet implemented");
	}

	@Test
	void testSetNext() {
		//fail("Not yet implemented");
		NodeInt node = new NodeInt(13, null);
		NodeInt node2 = new NodeInt(14, null);
		node.setNext(node2);
		assertEquals(node.getNext(), node.setNext(node2));
	}

	@Test
	void testToStringRecurs() {
		fail("Not yet implemented");
	}

	@Test
	void testToString() {
		fail("Not yet implemented");
	}

	@Test
	void testObject() {
		fail("Not yet implemented");
	}

	@Test
	void testGetClass() {
		fail("Not yet implemented");
	}

	@Test
	void testHashCode() {
		fail("Not yet implemented");
	}

	@Test
	void testEquals() {
		fail("Not yet implemented");
	}

	@Test
	void testClone() {
		fail("Not yet implemented");
	}

	@Test
	void testToString1() {
		fail("Not yet implemented");
	}

	@Test
	void testNotify() {
		fail("Not yet implemented");
	}

	@Test
	void testNotifyAll() {
		fail("Not yet implemented");
	}

	@Test
	void testWait() {
		fail("Not yet implemented");
	}

	@Test
	void testWaitLong() {
		fail("Not yet implemented");
	}

	@Test
	void testWaitLongInt() {
		fail("Not yet implemented");
	}

	@Test
	void testFinalize() {
		fail("Not yet implemented");
	}

}
