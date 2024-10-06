package System_Design;

public class VLC_MediaPlayer extends Thread{
    boolean isopen;
//    public boolean open_VLC(){
//        isopen=true;
//        return true;
//    }
//    public boolean close_VLC(){
//        isopen=false;
//        return false;
//    }

    @Override
    public void run() {
        if(isopen==false){
            isopen=true;
        }
        System.out.println("Try to Open VLC");
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Open VLC");
    }
}
