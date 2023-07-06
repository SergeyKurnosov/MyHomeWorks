package task1;

import java.util.Comparator;
import java.util.LinkedList;

public class User  {
    private String name;
    private String game;
    private String game2;
    private String game3;
    private String game4;
    private String game5;
     int RatingForPubg;
     int RatingForKsGo;
     int RatingForFortnite;
     int RatingForMinecraft;
     int RatingForBrawlStars;
    public User(String name, String game) {
        this.name = name;
        this.game = game;
    }

    public User(String name, String game, String game2) {
        this.name = name;
        this.game = game;
        this.game2 = game2;
    }

    public User(String name, String game, String game2, String game3) {
        this.name = name;
        this.game = game;
        this.game2 = game2;
        this.game3 = game3;
    }

    public User(String name, String game, String game2, String game3, String game4) {
        this.name = name;
        this.game = game;
        this.game2 = game2;
        this.game3 = game3;
        this.game4 = game4;
    }

    public User(String name, String game, String game2, String game3, String game4, String game5) {
        this.name = name;
        this.game = game;
        this.game2 = game2;
        this.game3 = game3;
        this.game4 = game4;
        this.game5 = game5;
    }

    public User(int result, String name) {

    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", game='" + game + '\'' +
                ", game2='" + game2 + '\'' +
                ", game3='" + game3 + '\'' +
                ", game4='" + game4 + '\'' +
                ", game5='" + game5 + '\'' +
                '}';

    }

    public User() {
    }
    public User(String name ) {
        this.name = name;
    }


    public String getName() {
        return name;
    }
    public int getResult(User e){
        e = new User();
        return RatingForBrawlStars + RatingForFortnite + RatingForMinecraft + RatingForPubg + RatingForKsGo;
    }

    public String getGame() {
        return game;
    }

    public String getGame2() {
        return game2;
    }

    public String getGame3() {
        return game3;
    }

    public String getGame4() {
        return game4;
    }

    public String getGame5() {
        return game5;
    }
}




