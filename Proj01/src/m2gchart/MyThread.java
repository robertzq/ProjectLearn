package m2gchart;

public class MyThread extends  Thread{
    private  Runnable runa;
    public MyThread(Runnable rua){
        this.runa=rua;
    }
    @Override
    public void run() {
        this.runa.run();

    }
}
