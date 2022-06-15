public class IfTestAnd {
    public static void main(String[] args) {
        int myAge = 20;
        char myBloodType = 'O';
        if(myAge == 35 && myBloodType == 'B') {  //両方が条件成立する場合
            System.out.println("私の年齢は３５歳で血液型はB型です！");
        } else if(myAge == 35 && myBloodType == 'A') {
            System.out.println("私の年齢は３５歳で血液型はA型です!");
        } else if(myAge == 40 && myBloodType == 'A') {
            System.out.println("私の年齢は４０歳で血液型はA型です!");
        } else {
            // System.out.println("私の年齢は３５歳ではないです!");
            System.out.println("私の年齢と血液型は内緒です！");
        }
        System.out.println("私の出身地は・・・");
    }
}
