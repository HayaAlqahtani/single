public class main {
    public static void main(String[] args) {
        IphoneSettings iphoneset = IphoneSettings.getInstance();
        iphoneset.setBrightness(70);
        iphoneset.setDisWifi(false);
        iphoneset.setVolume(9);

        System.out.println(iphoneset.getBrightness());
        System.out.println(iphoneset.getVolume());
        System.out.println(iphoneset.getdisWifi());
    }

}