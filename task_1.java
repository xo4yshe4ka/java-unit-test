@Test
public void checkIsAdultWhenAgeIsMoreThan18True() {
    Program program = new Program();
    boolean isAdult = program.checkIsAdult(19);
    boolean expected = true;
	assertEquals("Должно вернуться true", expected, isAdult);// Напиши код здесь
}
