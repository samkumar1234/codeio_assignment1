interface Playable{
    void play();
    void pause();
}

class AudioPlayer implements Playable{

    public void play()
    {
        System.out.println("AudiPlayer turned on");
    }

    public void pause()
    {
        System.out.println("Song is Paused");
    }
}

class VideoPlayer implements Playable{

    public void play()
    {
        System.out.println("VideoPlayer turned on");
    }

    public void pause()
    {
        System.out.println("Song is paused");
    }
}

public class Playable_Media  {
    public static void main(String[] args) {
        
        Playable c = new AudioPlayer();
        c.play();
        c.pause();

        Playable u = new VideoPlayer();
        u.play();
        u.pause();

    }
}