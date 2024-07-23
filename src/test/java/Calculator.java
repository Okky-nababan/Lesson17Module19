import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Calculator {

    public int opsTambah(Integer a, Integer b) {
        return a + b;
    }

    public int opsPengurangan(Integer a, Integer b) {
        return a - b;
    }

    public int opsPembagian(Integer a, Integer b) {
        return a / b;
    }

    @Test
    public void testPertambahan() {
        Integer hasil = opsTambah(10, 3);
        assertThat(hasil).isEqualTo(13);
    }

    @Test
    public void testPengurangan() {
        Integer hasil = opsPengurangan(10, 3);
        assertThat(hasil).isEqualTo(7);
    }

    @Test
    public void testPembagian() {
        Integer hasil = opsPembagian(10, 2);
        assertThat(hasil).isEqualTo(5);
    }
}
