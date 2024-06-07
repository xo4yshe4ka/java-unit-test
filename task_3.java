@RunWith(Parameterized.class)// Напиши аннотацию для параметризованных тестов
public class CheckIsAdultTest {
	
  private final int age;
  private final boolean result;

  public CheckIsAdultTest(int age, boolean result) {
	this.age = age;
        this.result = result; // Инициализируй поля класса в конструкторе
  }

  @Parameterized.Parameters // Пометь метод аннотацией для параметров
  public static Object[][] getTextData() {
        return new Object[][] {
                {-5, false},
                {9, false},
                {20, true},
                {25, true}
        };
  }

  @Test
  public void checkIsAdultWhenAgeThenResult() {
	Program program = new Program();
	//... // Передай сюда возраст пользователя
    boolean isAdult = program.checkIsAdult(age);
	// Сравни полученный и ожидаемый результаты, не забудь про сообщение об ошибке
    assertEquals("Age: " + age, result, isAdult);
	}
}
