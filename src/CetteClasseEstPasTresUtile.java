public class CetteClasseEstPasTresUtile {
    public static boolean imagineTuComprendsPas(int tkt) {
        if(tkt < 0){
            return false;
        } else if (tkt > 100) {
            return false;
        }
        return true;
    }
}
