package base;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

class test {

	@Test
	void test() {
		assertEquals(false, Principal.solicitarPermiso(20));
		asserrTrue(true, Principal.solicitarPermiso(90));
	}
}
