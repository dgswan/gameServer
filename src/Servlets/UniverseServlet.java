package Servlets;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import UniverseModel.Universe;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import java.util.logging.Logger;

/**
 * Created with IntelliJ IDEA.
 * User: dmitry
 * Date: 01.12.13
 * Time: 23:39
 * To change this template use File | Settings | File Templates.
 */

@Path("/universe")
public class UniverseServlet {

    private static Logger log = Logger.getLogger(Universe.class.getName());

    @GET
    public String getMessage() {
        String result = null;
        try {
           result = (new ObjectMapper()).writeValueAsString(Universe.Instance());
        }
        catch (JsonProcessingException ex) {
            log.info(ex.getMessage());
        }
        return result;
    }

}
