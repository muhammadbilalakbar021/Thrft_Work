import org.apache.thrift.TException;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransport;
import org.apache.thrift.transport.TTransportException;
import org.cs.helloworldservice.HelloWorldService;

public class HelloWorldClient
{
    public static void main(String[] args) throws TException
    {
        TTransport transport=new TSocket("localhost", 9090);
        transport.open();
        TProtocol protocol=new TBinaryProtocol(transport);
        org.cs.helloworldservice.HelloWorldService.Client client=new HelloWorldService.Client(protocol);
        //System.out.println(client.geHello());
        if(client.geHello()==null)
        {
            System.out.println("REcieved Null");
        }
        else
        {
            System.out.println(client.geHello());
        }

    }
}
