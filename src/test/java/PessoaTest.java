import org.example.Pessoa;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PessoaTest {
    @Test
    public void testPessoaValida() {
        Pessoa pessoa = new Pessoa(1,"Fulano");
        assertTrue(pessoa.valido());
    }
    @Test
    public void testIdInvalido(){
        Pessoa pessoa = new Pessoa(-1,"Fulano");
        assertFalse(pessoa.valido());
    }
    @Test
    public void testNomeVazio(){
        Pessoa pessoa = new Pessoa(1,"");
        assertFalse(pessoa.valido());
    }
    @Test
    public void testIdZero(){
        Pessoa pessoa = new Pessoa(0,"Fulano");
        assertFalse(pessoa.valido());
    }
}
