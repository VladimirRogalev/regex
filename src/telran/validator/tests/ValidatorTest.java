package telran.validator.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import telran.validator.tools.Validator;

class ValidatorTest {

	@Test
	void testCheckCreditCard() {
		assertTrue(Validator.checkCreditCard("123456781234567")); // 16
		assertTrue(Validator.checkCreditCard("12345678")); // 8
		assertTrue(Validator.checkCreditCard("123124436665"));
		assertFalse(Validator.checkCreditCard("123124"));
		assertFalse(Validator.checkCreditCard("12345678123456789"));
		assertFalse(Validator.checkCreditCard("12a31241111"));

	}

	@Test
	void testCheckDateFormatEU() {
		assertTrue(Validator.checkDateFormatEU("31.12.2023"));
		assertTrue(Validator.checkDateFormatEU("12/12/2021"));
		assertTrue(Validator.checkDateFormatEU("01,01,2021"));
		assertFalse(Validator.checkDateFormatEU("13.32.2021"));
		assertFalse(Validator.checkDateFormatEU("35.13.2021"));
		assertFalse(Validator.checkDateFormatEU("30a12a2022"));

	}

	@Test
	void testCheckDateFormatUS() {
		assertTrue(Validator.checkDateFormatUS("12/31/2023"));
		assertTrue(Validator.checkDateFormatUS("10.10.2023"));
		assertTrue(Validator.checkDateFormatUS("01.02.2023"));
		assertFalse(Validator.checkDateFormatUS("31,10,2023"));
		assertFalse(Validator.checkDateFormatUS("01a32,2023"));
		assertFalse(Validator.checkDateFormatUS("05282023"));

	}

	@Test
	void testCheckPhoneNumber() {
		assertTrue(Validator.checkPhoneNumber("+99(99)9999-9999"));
		assertTrue(Validator.checkPhoneNumber("+01(01)0001-1000"));
		assertFalse(Validator.checkPhoneNumber("-01(01)0001-1000"));
		assertFalse(Validator.checkPhoneNumber("+01220001-1000"));
		assertFalse(Validator.checkPhoneNumber("+01(22)00011000"));

	}

	@Test
	void testCheckLessEquals255() {
		assertTrue(Validator.checkLessEquals255("040"));
		assertTrue(Validator.checkLessEquals255("145"));
		assertTrue(Validator.checkLessEquals255("255"));
		assertFalse(Validator.checkLessEquals255("256"));
		assertFalse(Validator.checkLessEquals255("-145"));
		assertFalse(Validator.checkLessEquals255("-1"));
	}

}
