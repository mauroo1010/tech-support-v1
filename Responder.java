import java.util.ArrayList;
import java.util.Random;
import java.util.HashMap;
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
    private HashMap<String, String> responses;
    private ArrayList<String> respuestas;
    /**
     * Construct a Responder - nothing to do
     */
    public Responder()
    {
        random = new Random();
        respuestas = new ArrayList<>();
        responses = new HashMap<>();
        respuestas.add("Hola me llamo Mauro");
        respuestas.add("Estoy en clase de programacion con Miguel Bayón");
        respuestas.add("Me gusta jugar a futbol");
        respuestas.add("Tambien me gusta comer pizza");
        respuestas.add("Mi jugador favorito es Messi");

        responses.put("irascible", "Propenso a la ira.");
        responses.put("Messi","Mejor jugador de la historia del futbol");
        responses.put("Programacion", "Modulo mas dificil del grado de DAM");
        responses.put("HP", "Marca de ordenador muy famoso en todo el mundo");
    }

    /**
     * Generate a response.
     * @return  A string that should be displayed as the response
     */
    public String generateResponse(String userInput)
    {
        String respuesta = "";
        if(responses.containsKey(userInput)) {
            respuesta = responses.get(userInput);
        }
        else {
            int index = random.nextInt(respuestas.size());
            respuesta = respuestas.get(index);
        }
        return respuesta;
    }
}
