import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class testPalindromo {
    Palindromo verificador = new Palindromo();

    @Test
    public void testaSeEhPalindromo() {
        for (String testStr : Arrays.asList("Rotator", "bob", "madam", "mAlAyAlam", "1", "Able was I, ere I saw Elba", "Madam I’m Adam", "Step on no pets.", "Top spot!", "02/02/2020")) {
            boolean resposta = verificador.ehPalindromo(testStr);
            Assert.assertTrue("O texto " + testStr + " inserido é um palindrmo? " + resposta, resposta);
        }
    }

    @Test
    public void testaSeNaoEhPalindromo() {
        for (String testStr : Arrays.asList("elephant", "elephant", "elephant", "Top . post!", "Wonderful-fool", "Wild imagination!")) {
            boolean resposta = verificador.ehPalindromo(testStr);
            Assert.assertFalse("O texto " + testStr + " inserido é um palindrmo? " + resposta, resposta);
        }
    }
}

