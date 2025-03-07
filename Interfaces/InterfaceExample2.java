package Interfaces;

class Phone{
    public void call(){
        System.out.println("Phone Call");
    }
    public void sms(){
        System.out.println("Message");
    }
}

interface ICamera{
    void click();
    void record();
}

interface IMusicPlayer{
    void play();
    void stop();
}

class SmartPhone extends Phone implements ICamera, IMusicPlayer{
    public void videoCall(){
        System.out.println("Video Call");
    }
    public void click(){
        System.out.println("Photo");
    }
    public void record(){
        System.out.println("Video Recording");
    }
    public void play(){
        System.out.println("Playing Music");
    }
    public void stop(){
        System.out.println("Stopped Playing Music");
    }
}

public class InterfaceExample2 {
    public static void main(String args[]){
        SmartPhone sp = new SmartPhone();
        sp.call();
        sp.click();
        sp.play();
        sp.record();
        sp.videoCall();
        sp.stop();
    }
    
}
