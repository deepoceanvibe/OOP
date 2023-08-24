package chap01_04enum.adv;


public class AdvancedEnumExampleMain {
    public static void main(String[] args) {
            CalculateCommand calculateCommand = new CalculateCommand(
                    CalculateType.ADD,      // enum타입 ADD로 설정
                    100,                    // num1 = 100
                    3                       // num2 = 3
            );

            Client client = new Client();
            int result = client.someMethod(calculateCommand);

            System.out.println(result);
    }
}
