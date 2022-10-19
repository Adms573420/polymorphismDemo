public class Main {

    public static void main(String[] args) {
       /* BaseLogger[] baseLoggers = new BaseLogger[]{new DatabaseLogger(), new FileLogger(), new EmailLogger()};
        for (BaseLogger logger : baseLoggers) {
            logger.Log("log message");*/

        CustomerManager customerManager=new CustomerManager(new EmailLogger());
        customerManager.Add();


    }
}
