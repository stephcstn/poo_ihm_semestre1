package exo1;

public class SecretCodeDoor extends AutoLockDoor{
    public int secret_code;
    private final int DEFAULT_CODE = 1234;

    public SecretCodeDoor(){
        super();
        this.secret_code = DEFAULT_CODE;
    }

    public SecretCodeDoor(int secretCode){
        super();
        this.secret_code = secretCode;
    }

    public void open(int secretCode) {
            if (secretCode == this.secret_code) {
                this.isLocked = true;
                System.out.println("la porte est deverrouillee grace au code.");
            }else{
                System.out.println("impossible de deverrouillee la porte : code faux.");
            }
    }
    public void open(){
        super();
    }
}



