import UniverseModel.Universe;
import org.mortbay.jetty.Server;
import org.mortbay.jetty.webapp.WebAppContext;

/**
 * Created with IntelliJ IDEA.
 * User: dmitry
 * Date: 01.12.13
 * Time: 20:34
 * To change this template use File | Settings | File Templates.
 */
public class MyServer {
    public static void main(String[] args) throws Exception {
        Universe.Initialize();
        Server server = new Server(9090);
        WebAppContext webAppContext = new WebAppContext();
        webAppContext.setContextPath("/");
        webAppContext.setDescriptor("web/WEB-INF/web.xml");
        webAppContext.setResourceBase("web");
        webAppContext.setContextPath("/");
        webAppContext.setParentLoaderPriority(true);
        server.setHandler(webAppContext);
        server.start();
        server.join();
    }
}
