import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Main
{
    public static void main(String[] args)
    {
        //System.out.println("Hello World");
        //Datetime dt=new Datetime();
        //String datetime=dt.gettime();
        //System.out.println(datetime);

        Scanner input=new Scanner(System.in);
        System.out.println("username:");
        String username=input.next();
        System.out.println("password:");
        String password=input.next();
        System.out.println("hostname:");
        String email=input.next();
        Input sys=new Input(username,password,email);
        String result=sys.register();
        System.out.println(result);

    }
}


//show time.now
class Datetime
{
    //Field
    String datetime;
    //方法
    String gettime()
    {
        SimpleDateFormat fm=new SimpleDateFormat("HH:mm:ss");
        Date dt=new Date();
        this.datetime=fm.format(dt);
        return this.datetime;
    }
}


class Input
{
    //Field
    String username;
    String password;
    String email;
    //
    Input(String username,String password,String email)
    {
        this.username=username;
        this.password=password;
        this.email=email;
    }
    //
    String register()
    {
        return "user "+this.username+" register sucess";
    }

}