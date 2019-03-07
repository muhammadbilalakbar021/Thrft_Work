import org.apache.thrift.TException;
import org.cs.helloworldservice.hello;

public class HelloWorldServer implements org.cs.helloworldservice.HelloWorldService.Iface
{

    public String hello(int number, String first_Name, String last_Name, int age) throws TException {
        return number + first_Name  + last_Name + age + "Hello Bilal......";
    }

    int number = 32;
    String first="BIlal";
    String last="Akbar";
    int age=20;



    @Override
    public hello geHello() throws TException {
        hello h = null;

        h.setNumber(number);
        h.setFirst_Name(first);
        h.setLast_Name(last);
        h.setAge(age);

        return h;
    }


}
