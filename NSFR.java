
import javax.swing.*;
public class NSFR{
    public static void main(String[] args) {
    boolean [] a=new boolean[11];
    boolean [] b=new boolean[21];
    boolean [] c=new boolean[29];      
    boolean [] key=new boolean[10];
    boolean [] iv=new boolean[10];
   boolean [] e=new boolean[10];
    int []e1=new int[10];
        init(iv);        
        init(key);
    for(int j=0;j<key.length;j++){
        a[j]=iv[j];
        b[j]=key[j];
        c[j]=iv[j]^key[j];
        System.out.println(a[j]+" "+b[j]+" "+c[j]+" "+j);
    }
        
    for (int d=0;d<e.length;d++){
            e[d]=a[7]^b[4]^c[3];
            shift(a);
            shift(b);
            shift(c);
            boolean and1=b[2]&&c[7];
            boolean and2=a[5]&&c[20];
            boolean and3=a[3]&&b[12];
            boolean xor1=a[5]^b[20]^c[8];
            boolean xor2=a[4]^c[13];
            boolean xor3=a[10]^b[14];
            boolean xor4=a[7]^c[23];
            boolean xor5=b[17]^a[0]^xor3;
            boolean xor6=b[7]^a[1]^and1;
            boolean xor7=a[9]^c[4]^and2;
            boolean xor8=a[6]^b[18]^c[28]^and3;
            a[0]=e[d];
            System.out.println(a[0]);
            b[0]=e[d];
            c[0]=e[d];  
            b[18]=xor1;
            c[24]=xor4&&and1;
            a[10]=xor8;
            a[4]=xor7^xor5;
            b[13]=xor6;
            c[16]=xor2;
            if(e[d]==true){
                e1[d]=1;
            }
            else if(e[d]==false){
                e1[d]=0;
            }
            System.out.println("Enkriptimi ne binar "+e1[d]+" "+d);
    }
    }
public static boolean []init(boolean []k){   
    for(int i=0;i<k.length;i++){
    int count=0;        
    String s=JOptionPane.showInputDialog("Shtyp 1 ose 0");
    int s1=Integer.valueOf(s);
    if(s1==1){
        k[i]=true;
    }else if(s1==0){
        k[i]=false;
    }
    count=i+1;
    System.out.print(k[i]+" "+count+" ");
         }    

    return k;

}

public static boolean[] shift(boolean []a){
    for(int s=a.length-2;s>=0;s--){
        a[s+1]=a[s];
    }
        for (int p=0;p<a.length;p++){
            //System.out.print(a[p]+" "+p+" ");
    }
    return a;
    }
}
