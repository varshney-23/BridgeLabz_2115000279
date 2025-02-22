public class ValidateIPAddress {
	
    public static void main(String[] args) {
        String ip = "192.168.0.1";
        System.out.println(validateIPAddress(ip));
    }

    public static boolean validateIPAddress(String ip) {
        String regex = "^((25[0-5]|2[0-4][0-9]|[0-1]?[0-9][0-9]?)\\.){3}(25[0-5]|2[0-4][0-9]|[0-1]?[0-9][0-9]?)$";
        return ip.matches(regex);
    }
}