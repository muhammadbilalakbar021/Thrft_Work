import org.apache.thrift.server.TServer;
import org.apache.thrift.server.TSimpleServer;
import org.apache.thrift.transport.TServerSocket;
import org.apache.thrift.transport.TServerTransport;
import org.cs.helloworldservice.HelloWorldService;
import org.cs.helloworldservice.hello;

public class HelloWorldServerApp
{
    public static void main(String[] args)
    {
        try
        {
            HelloWorldServer helloWorldServer = new HelloWorldServer();
            HelloWorldService.Processor processor = new HelloWorldService.Processor(helloWorldServer);
            TServerTransport serverTransport = new TServerSocket(9090);
            TServer server = new TSimpleServer(new TServer.Args(serverTransport).processor(processor) );
            System.out.println("Starting Server ...");
            server.serve();



        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }

        System.out.println("Done ...");
    }
}
