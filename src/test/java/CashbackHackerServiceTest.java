import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class CashbackHackerServiceTest {
    CashbackHackerService service = new CashbackHackerService();

@Test
public void shouldAdviceHundred() {
    assertEquals(service.remain(900),100);
}


    @Test
    public void shouldnotAdvice() {

    assertEquals(service.remain(1000),0);
    }
}
