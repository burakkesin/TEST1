
import org.example.HesapMakinesi;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HesapMakinesiTests {

    @Test
    public void toplamaTesti(){
        HesapMakinesi hesapMakinesi = new HesapMakinesi();
        double toplamaSonucu = hesapMakinesi.toplama(1.5,3.6);
        Assertions.assertEquals(5.1,toplamaSonucu);

    }
    @Test
    public void cıkarmaTesti(){
        HesapMakinesi hesapMakinesi = new HesapMakinesi();
        double cıkarmaSonucu = hesapMakinesi.cıkarma(5,3);
        Assertions.assertEquals(3,cıkarmaSonucu);
    }

    @Test
    public void carpmaTesti(){
        HesapMakinesi hesapMakinesi = new HesapMakinesi();
        double carpmaSonucu = hesapMakinesi.carpma(8,9);
        Assertions.assertEquals(72,carpmaSonucu);
    }
}
