
class Content{
    String title;
    float duration;
    public Content(String t, float d ){
        title = t;
        duration = d;
    }
    void title(){
        System.out.println("Title Is : "+ title);
    }
    void Duration(){
        System.out.println("Duration : "+ duration);
    }
}

class Movie extends Content{
    Movie(String a, float b){
        super(a, b);
    }
}

class TvShow extends Content{
    TvShow(String a, float b){
        super(a, b);
    }
}

class Documentary extends Content{
    Documentary(String a, float b){
        super(a, b);
    }
}

public class NetflixContent {
    public static void main(String[] args) {
        Movie m = new Movie("IronMan", 122.45f);
        TvShow tv = new TvShow("Friends", 45);
        Documentary doc = new Documentary("Alone", 152.5f);
        m.title();
        m.Duration();
        tv.title();
        tv.Duration();
        doc.title();
        doc.Duration();

    }
}
