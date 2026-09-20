package DesignPatterns.StrategyPattern.UsingStrategy;

public class Main {

    public static void main(String[] args) {

        Notification email = new Email(new AESEncryption(), new ZipCompression());
        email.send();
        email.encrypt();
        email.compress();

        Notification push = new Push(new AESEncryption(), new GZipCompression());
        push.send();
        push.encrypt();
        push.compress();

        Notification Sms = new Sms(new RSAEncryption(), new ZipCompression());
        Sms.send();
        Sms.encrypt();
        Sms.compress();

    }

}

// strategy pattern means to remove the dupication and code complexity
// if there ans interface and child classes have diffenrent behavior fo each and
// evey child we cannot create so many classes that we can instead we create the
// strategy and use it thats it.
