public class CetteClasseEstPeutEtreUtile {
    public static boolean alorsPeutEtre(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
