
import org.example.HesapMakinesi;
import org.junit.jupiter.api.*;

public class HesapMakinesiTests {


    @BeforeAll
     public static void setupClass(){
        System.out.println("setup class metodu calıştırıldı");
    }

    HesapMakinesi hesapMakinesi;

    @BeforeEach
    public void setUp() {
        hesapMakinesi =new HesapMakinesi();
        System.out.println("setup metodu calışıyor");

    }

    @Test
    public void toplamaTesti(){
        double toplamaSonucu = hesapMakinesi.toplama(1.5,3.6);
        Assertions.assertEquals(5.1,toplamaSonucu);

    }
    @Disabled("sonra kosacak")
    @Test
    public void cıkarmaTesti(){
        double cıkarmaSonucu = hesapMakinesi.cıkarma(5,3);
        Assertions.assertEquals(3,cıkarmaSonucu);
    }

    @Test
    public void carpmaTesti(){
        double carpmaSonucu = hesapMakinesi.carpma(8,9);
        Assertions.assertEquals(72,carpmaSonucu);
    }

    @AfterEach
    public void tearDown(){
        System.out.println("Tear down çalıştı");
    }

    @AfterAll

    public static void tearDownClass(){
        System.out.println("Tear down class çalıtı");
    }

}
