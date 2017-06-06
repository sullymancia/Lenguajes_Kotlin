import spark.Spark.*
import spark*
import com.google.maps.PlacesApi
import com.google.maps.model.*
import com.google.maps.*
import com.google.maps.GeoApiContext
import com.google.maps.DirectionsApi
import com.google.maps.model.TravelMode
import com.beust.klaxon.*
import com.sun.xml.internal.messaging.saaj.util.ByteOutputStream
import org.w3c.dom.css.RGBColor

import java.util.Base64
import java.util.UUID
import java.io.UnsupportedEncodingException
import java.awt.image.BufferedImage;
import sun.security.krb5.Confounder.bytes
import java.awt.Color
import java.awt.image.DataBufferByte
import java.awt.image.BufferedImage.TYPE_INT_BGR
import java.io.ByteArrayInputStream
import javax.imageio.ImageIO
import java.io.File


public class server{

	public static void main(string[] args){
            get(new Route("/tarea1"){

        @Override

	public Object handle(Request request, Response response){

        return "/tarea1";
            }

        })
        get(new Route("/tarea2"){
            @Override

            public Object handle(Request request, Response responde){
                return "/tarea2";
            }
        })

        get(new Route("/tarea3"){
            @Override

            public Object handle(Request request, Response responde){
                return "/tarea3";
            }
        })
        get(new Route("/tarea4"){
            @Override

            public Object handle(Request request, Response responde){
                return "/tarea4";
            }
        })
    }
}

fun run() {
    port(9091)

    get("/tarea1", { req, res -> "Welcome!!!"})
}