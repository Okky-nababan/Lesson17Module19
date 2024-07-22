# Lesson17Module19
import org.junit.jupiter.api.*;

public class TestJayjay {

       @BeforeAll
       public static void BeforeAll () {
           System.out.println("Dieksekusi ketika before all");
       }
       @AfterAll
       public static void AfterAll () {
           System.out.println("Dieksekusi ketika after all");
       }
       @BeforeEach
       public void BeforeEach () {
           System.out.println("Dieksekusi ketika beforeeach");
       }
       @AfterEach
       public void AfterEach () {
           System.out.println("Dieksekusi ketika AfterEach");
       }
        @Test
        public void testPenjumlahan () {
            System.out.println("Dieksekusi didalam test");
            Assertions.assertEquals(7, 4 + 3);
        }
        @Test
        public void testPengurangan () {
            System.out.println("Akan ditest");
            Assertions.assertEquals(9,20-11);
        }
        @Test
        public void testPerkalian (){
            System.out.println("Hasil yang benar");
            Assertions.assertEquals(6,3*2);
        }
}
