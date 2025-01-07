// João Victor de Jesus Augusto
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TesteUsuarioDecorator {

    @Test
    public void testPublicacaoLivro() {
        UsuarioDecorator usuario = new UsuarioDecorator("Alice", 30);
        usuario.setEstrategiaPublicacao(new EstrategiaPublicacaoLivro());
        usuario.publicar(); // Deve imprimir "Publicando um livro..."
    }

    @Test
    public void testPublicacaoArtigo() {
        UsuarioDecorator usuario = new UsuarioDecorator("Bob", 40);
        usuario.setEstrategiaPublicacao(new EstrategiaPublicacaoArtigo());
        usuario.publicar(); // Deve imprimir "Publicando um artigo..."
    }

    @Test
    public void testSemEstrategia() {
        UsuarioDecorator usuario = new UsuarioDecorator("Carlos", 25);
        usuario.publicar(); // Deve imprimir "Nenhuma estratégia de publicação definida."
    }
}
