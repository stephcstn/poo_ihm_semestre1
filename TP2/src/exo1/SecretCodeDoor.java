package exo1;

public class SecretCodeDoor extends AutoLockDoor {
    public int secret_code;
    private final int DEFAULT_CODE = 1234;

    public SecretCodeDoor() {
        super();
        this.secret_code = DEFAULT_CODE;
    }

    public SecretCodeDoor(int secretCode) {
        super();
        this.secret_code = secretCode;
    }

    public void unlock() {
        System.out.println("Elle reste verouillee !");
    }

    public void unlock(int code) {
        if (this.secret_code == code) {
            super.unlock();
        } else {
            System.out.println("Code incorrect !");
        }
    }

    @Override
    public void open() {
        super.open();
    }

    @Override
    public void close() {
        super.close();
    }

}



