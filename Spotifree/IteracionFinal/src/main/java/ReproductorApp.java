
import dominio.ReproductorFichero;
/**
 *
 */
public class ReproductorApp
{
    public static void main( String[] args )
    {
    	if (args.length < 1) {
    		System.out.println("Uso: sfplayer (ruta fichero audio)");
    	}
    	try {
    		  ReproductorFichero mi_reproductor = new ReproductorFichero();
    		  mi_reproductor.AbrirFichero(args[0]);
    		  mi_reproductor.Play();
    		} catch (Exception ex) {
    		  System.out.println("Error: " + ex.toString());
    		}
    }
}
