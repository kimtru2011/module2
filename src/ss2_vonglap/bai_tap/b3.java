package ss2_vonglap.bai_tap;

public class b3 {
    public static void main(String[] args) {

        int number=2,counter;
        System.out.println("các số nguyên tố nhỏ hơn 100: ");
        while (number < 100){
            counter = 1;
            for(int i=2 ; i < number ; i++){
                if(number%i==0){
                    counter++;
                }
            }
            if(counter == 1){
                System.out.print(number +" ");
            }

            number++;
        }
    }
}
