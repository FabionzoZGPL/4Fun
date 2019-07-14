 class SwitchInstruction {

    void SwitchInstruction(int wyborOperacji, int num1, int num2) {
        switch ( wyborOperacji){
            case 1:
                System.out.println(num1 + num2);
                break;

            case 2:
                System.out.println(num1 - num2);
                break;

            case 3:
                System.out.println(num1 * num2);
                break;

            case 4:
                System.out.println(num1 / num2);
                break;

            default:
                System.out.println("Coś poszło źle, sprawdź podstawione argumenty.");
        }

    }
}
