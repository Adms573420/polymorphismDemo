public class CustomerManager {

    private BaseLogger logger;

    public CustomerManager(BaseLogger logger) {
        this.logger = logger;
    }


    public void Add() {
        System.out.println("Musteri Eklendi.");
        this.logger.Log("log eklendi.");
    }


}
