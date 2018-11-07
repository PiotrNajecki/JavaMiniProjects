public class UsersRepository {
    private static int instance=0;
    private int instanceNumber = instance++;

    public static int getInstance() {
        return instance;
    }

    public static void setInstance(int instance) {
        UsersRepository.instance = instance;
    }

    public int getInstanceNumber() {
        return instanceNumber;
    }

    public void setInstanceNumber(int instanceNumber) {
        this.instanceNumber = instanceNumber;
    }
}
