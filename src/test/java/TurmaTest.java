import org.example.Pessoa;
import org.example.Turma;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class TurmaTest {
    private Turma turma;

    @BeforeEach
    public void setUp(){
        turma = new Turma();

    }
    @Test
    public void testAdicionarPessoas() throws Exception{
        Pessoa pessoa1 = new Pessoa(1, "Fulano");
        Pessoa pessoa2 = new Pessoa(2, "Beltrano");
        turma.adicionarPessoa(pessoa1);
        turma.adicionarPessoa(pessoa2);
        List<Pessoa> pessoas = turma.getPessoas();

        assertEquals(2,pessoas.size());
        assertTrue(pessoas.contains(pessoa1));
        assertTrue(pessoas.contains(pessoa2));
    }
    @Test
    public void testAdicionarPessoaInvalida(){
        Pessoa pessoa = new Pessoa();
        assertThrows(Exception.class, () -> turma.adicionarPessoa(pessoa));
    }
    @Test
    public void testAdicionarPessoaComIdDuplicado() throws Exception{
        Pessoa pessoa1 = new Pessoa(1, "Fulano");
        Pessoa pessoa2 = new Pessoa(1, "Beltrano");
        turma.adicionarPessoa(pessoa1);
        assertThrows(Exception.class, () -> turma.adicionarPessoa(pessoa2));
    }
    @Test
    public void testRemoverTodasPessoas() throws Exception{
        Pessoa pessoa1 = new Pessoa(1, "Fulano");
        Pessoa pessoa2 = new Pessoa(2, "Beltrano");
        turma.adicionarPessoa(pessoa1);
        turma.adicionarPessoa(pessoa2);

        turma.removerTodasPessoas();
        List<Pessoa> pessoas = turma.getPessoas();
        assertTrue(pessoas.isEmpty());
    }
    @Test
    public void testRemoverTurmaVazia() throws Exception {
        turma.removerTodasPessoas();
        List<Pessoa> pessoas = turma.getPessoas();
        assertTrue(pessoas.isEmpty());
    }


}
