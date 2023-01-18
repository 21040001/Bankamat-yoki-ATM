public class atmclass {
    int toplam=100;
    public int bakiye(){
        return toplam;
    }
    public void yuklash(int a){
        toplam=toplam+a;
    }
    public void chekmek(int a){
        toplam=toplam-a;
    }
}
