import java.util.ArrayList;
import java.util.Random;

/**
 * The responder class represents a response generator object.
 * It is used to generate an automatic response to an input string.
 * 
 * @author     Michael KÃ¶lling and David J. Barnes
 * @version    0.1 (2011.07.31)
 */
public class Responder
{
    private Random random;
    private ArrayList<String> respuestas;
    /**
     * Construct a Responder - nothing to do
     */
    public Responder()
    {
        random = new Random();
        respuestas = new ArrayList<>();
        respuestas.add("Hola me llamo Mauro");
        respuestas.add("Estoy en clase de programacion con Miguel Bayón");
        respuestas.add("Me gusta jugar a futbol");
        respuestas.add("Tambien me gusta comer pizza");
        respuestas.add("Mi jugador favorito es Messi");
    }

    /**
     * Generate a response.
     * @return   A string that should be displayed as the response
     */
    public String generateResponse()
    {
        int index = random.nextInt(respuestas.size());
        return respuestas.get(index);
    }
}
