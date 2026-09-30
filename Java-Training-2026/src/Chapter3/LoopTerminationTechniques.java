package Chapter3;

/**
 * @author : themb
 * Project : Java-Training-2026
 * Date : 9/30/2026
 **/
public class LoopTerminationTechniques {
    public static void main(String[] args){
        //break
        System.out.println("=====break========");
        for(int i=1; i<=10; i++){
            if(i==5) break;
            System.out.print(i +" | ");//4

        }
        System.out.println("=====continue========");
        for(int i=1; i<=15; i++) {
            if (i %3 ==0) continue;
            System.out.print(i + " | ");
        }
        System.out.println("=====continue + break========");
        for(int i=0; i<=15; i++) {
            if (i == 5) break;
            if (i == 3) continue;
            System.out.print(i + " | ");
        }
    }
}
