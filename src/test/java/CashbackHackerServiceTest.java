import org.junit.Assert;
import org.junit.Test;


public class CashbackHackerServiceTest {
    CashbackHackerService service = new CashbackHackerService();

    @Test
    public void shouldAdviceHundred() {
        Assert.assertEquals(100, service.remain(900));
    }


    @Test
    public void shouldnotAdvice() {
        Assert.assertEquals(0, service.remain(1000));
    }
}
