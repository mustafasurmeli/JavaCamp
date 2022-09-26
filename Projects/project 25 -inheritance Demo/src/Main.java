public class Main {
    public static void main(String[] args) {
        CreditUI creditUI = new CreditUI();
        creditUI.CreditCalculate(new TeacherCreditManager());
        creditUI.CreditCalculate(new DoctorCreditManager());
        creditUI.CreditCalculate(new SoldierCreditManager());

    }
}