public class odev2 {
    public static void main(String[] args) {
    int limit=1000;
    int basval;
    for(int number=1;number<=limit;number++){
        int tnumber=number;
        int uslu,result=0,bassay=0;

        while(tnumber!=0){
            tnumber/=10;
            bassay++;
        }
        tnumber=number;
        while(tnumber!=0){
            basval=tnumber%10;
            uslu=1;
            for(int i=1;i<=bassay;i++){
                uslu*=basval;
            }
            result+=uslu;
            tnumber/=10;
        }
        if(result==number){
            System.out.println(number+ " Sayilari Armstrong Sayilaridir!");
        }


    }


    }
}
