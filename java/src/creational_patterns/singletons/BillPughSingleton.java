package creational_patterns.singletons;

public class BillPughSingleton {
    private BillPughSingleton() {}
    private static class InstanceHolder {
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }

    public static BillPughSingleton getInstance() {
        return InstanceHolder.INSTANCE;
    }
}
