import javax.swing.*;
public class NSFR{
    public static void main(String[] args) {
    boolean [] a=new boolean[11];
    boolean [] b=new boolean[21];
    boolean [] c=new boolean[29];      
    boolean [] key=new boolean[10];
    boolean [] iv=new boolean[10]; 
        init(iv);        
        //init(key);
    for(int j=0;j<10;j++){
        a[j]=iv[j];
        b[j]=key[j];
        c[j]=iv[j]^key[j];
        //System.out.println(a[j]+" "+b[j]+" "+c[j]);
    }
        shift(a);
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
    boolean last=a[a.length-1];
    for(int s=a.length-2;s>=0;s--){
    a[s+1]=a[s];
    }
    a[0]=last;
    for (int p=0;p<a.length;p++){
        System.out.print(a[p]+" "+ p +" ");
    }
    return a;
    }
}
