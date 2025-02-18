import com.google.common.annotations.VisibleForTesting;
import org.junit.Test;
import org.junit.Assert;

public class TestVypoctu {

    @Test
    public void testcalcdph(){}
    //Assert.fail("Not implemented method");
    double kc = 150;
    double procdph = 20;
    vypocty mojeVypocty = new vypocty();
    double vysl = mojeVypocty.calcdph(kc, procdph);

    Assert.assertEquals(vysl, 30, )
}