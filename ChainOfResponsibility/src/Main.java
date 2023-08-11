public class Main {
    public static void main(String[] args) {

       AuthenticationHandler auth = new AuthenticationHandler("12345");
       ContentTypeHandler typeHandler = new ContentTypeHandler("json");
       PayloadHandler payloadHandler = new PayloadHandler("Body: {\"username\" = \"john\"}");

       auth.next = typeHandler;
       typeHandler.next = payloadHandler;

       String withAuthentication = auth.addHandler("Headers with authentication");
       System.out.println(withAuthentication);

        System.out.println("");
        String withoutAuthentication = typeHandler.addHandler("Headers without authentication");
        System.out.println(withoutAuthentication);
    }
}