package latihan;

public class StackClass {
    int stack[] = new int[20];//isi Stack harus dalam bentuk Tipe Array
    int top; //deklarasi variabel top
    
    public void push (int angka) {
        stack[top]=angka;//itu yang tadi dari Classs utama saya ambilki baru saya taro' diposisi paling atas yang disebut top 
        top= top+1;// bertambah mi topnya 12     
    }
    public int pop (){
        int data;//sediakan 1 variabel untuk menampung data yang dikeluarkan dari Stack
        top--;// kurangi top
        data = stack[top];//keluarkan isi top dan masukkan ke dalam variabel data
        System.out.print("   data yang akan dikeluarkan : "+data);
        return data;
    }
    
    public void tampil()
    {       
       for(int i = top-1;i>=0;i--)
       {
           System.out.print(stack[i]+" ");
       }
    }
    
    
}   
