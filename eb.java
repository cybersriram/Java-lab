import java.util.Scanner;
class eb{
    public static void main(String[] arg){
        int cno;
        String cname;
        float pre_reading,cur_reading,amont = 0;
        int type_of_eb;
        Scanner get = new Scanner(System.in);
        System.out.println("Enter the consumer Number");
        cno = get.nextInt();
        Scanner get1 = new Scanner(System.in);
        System.out.println("Enter the consumer Name");
        cname = get1.nextLine();
        Scanner get2 = new Scanner(System.in);
        System.out.println("Enter the previous year reading");
        pre_reading = get2.nextFloat();
        Scanner get3 = new Scanner(System.in);
        System.out.println("Enter the current year reading");
        cur_reading = get3.nextFloat();
        Scanner get4 = new Scanner(System.in);
        System.out.println("For domestic connection press 1\nFor commercial connection press 2");
        type_of_eb = get4.nextInt();
        if (type_of_eb == 1)
        {
            amont = domestic(cur_reading);
        }
        else 
        if (type_of_eb == 2)
        {
            amont = commercial(cur_reading);
        }
        else{
            throw new java.lang.Error("TRY AGAIN,ENTER PROPER DETAILS");
        }
        System.out.println("Hello "+cname+" your number is "+cno+" your usage of this month is "+cur_reading+" the bill need to be paid is "+ amont);
        System.out.println("Thanks You");
        
    }
    public static Float domestic(float a)
    {
        Float amt;
        amt =(float) 0;
        if (a<101){
            amt =(float) (1*a);
        }
        else
        if (a<201 && a>100){
            amt =(float) ((100*1)+((a-100)*2.50));
        }
        else
        if(a<501 && a>200){
            amt =(float) ((100*1)+(100*2.50)+((a-200)*4));
        }
        else
        if (a>500){
            amt = (float)((100*1)+(100*2.50)+(300*4)+((a-500)*6));
        }
        return amt;
    }
    public static Float commercial(float b){
        Float amt;
        amt =(float) 0;
        if (b<101){
            amt = (float)(2*b);
        }
        else
        if (b<201 && b>100){
            amt = (float)((100*2)+((b-100)*4.50));
        }
        else
        if(b<501 && b>200){
            amt =(float)((100*2)+(100*4.50)+((b-200)*6));
        }
        else
        if (b>500){
            amt =(float) ((100*2)+(100*4.50)+(300*6)+((b-500)*7));
        }
        return amt;
    }
}
