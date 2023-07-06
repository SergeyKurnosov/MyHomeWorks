package task1;

import java.sql.Array;
import java.util.*;

public class UserListTwo {
    public void GamerInGame(User e, LinkedList yourGame) {
        Scanner s = new Scanner(System.in);
        System.out.println("В какую игру вы хотите поиграть ");
        String choseGame = s.nextLine();
        if (choseGame.equals(e.getGame()) || choseGame.equals(e.getGame2()) || choseGame.equals(e.getGame3()) || choseGame.equals(e.getGame4()) || choseGame.equals(e.getGame5())) {
            for (int i = 0; i < yourGame.size(); i++) {
                if (choseGame.equals(yourGame.get(i))) {
                    if (yourGame.get(i).equals("Minecraft")) {
                        e.RatingForMinecraft += 1;
                        System.out.println("Вы выиграли , ваш рейтинг по выбранной игре увеличен на 1 балл");
                    } else if (yourGame.get(i).equals("Pubg")) {
                        e.RatingForPubg += 1;
                        System.out.println("Вы выиграли , ваш рейтинг по выбранной игре увеличен на 1 балл");
                    } else if (yourGame.get(i).equals("Ks go")) {
                        e.RatingForKsGo += 1;
                        System.out.println("Вы выиграли , ваш рейтинг по выбранной игре увеличен на 1 балл");
                    } else if (yourGame.get(i).equals("Fortnite")) {
                        e.RatingForFortnite += 1;
                        System.out.println("Вы выиграли , ваш рейтинг по выбранной игре увеличен на 1 балл");
                    } else if (yourGame.get(i).equals("Brawl stars")) {
                        e.RatingForBrawlStars += 1;
                        System.out.println("Вы выиграли , ваш рейтинг по выбранной игре увеличен на 1 балл");
                    }
                }
            }
        } else {
            System.out.println("Игра введена неверно");
        }
    }

    public void yourRating(LinkedList yourGame, User e) {
        for (int i = 0; i < yourGame.size(); i++) {
            if (yourGame.get(i).equals("Minecraft")) {
                System.out.println(" RatingForMinecraft - " + e.RatingForMinecraft);
            } else if (yourGame.get(i).equals("Pubg")) {
                System.out.println(" RatingForPubg - " + e.RatingForPubg);
            } else if (yourGame.get(i).equals("Ks go")) {
                System.out.println(" RatingForKsGo - " + e.RatingForKsGo);
            } else if (yourGame.get(i).equals("Fortnite")) {
                System.out.println(" RatingForFortnite - " + e.RatingForFortnite);
            } else if (yourGame.get(i).equals("Brawl stars")) {
                System.out.println(" RatingForBrawlStars - " + e.RatingForBrawlStars);
            }else {
                System.out.println("Вы незарегестрированный пользователь");
            }
        }
    }

    public LinkedList GetGamersNames(User e1, User e2, User e3, User e4, User e5, User e6, User e7, User e8, User e9, User e10, User e11, User e12, User e13, User e14, User e15) {
        LinkedList<String> GamersNames = new LinkedList<>();
        GamersNames.add(e1.getName());
        GamersNames.add(e2.getName());
        GamersNames.add(e3.getName());
        GamersNames.add(e4.getName());
        GamersNames.add(e5.getName());
        GamersNames.add(e6.getName());
        GamersNames.add(e7.getName());
        GamersNames.add(e8.getName());
        GamersNames.add(e9.getName());
        GamersNames.add(e10.getName());
        GamersNames.add(e11.getName());
        GamersNames.add(e12.getName());
        GamersNames.add(e13.getName());
        GamersNames.add(e14.getName());
        GamersNames.add(e15.getName());
        return GamersNames;
    }

    public void GetListRatingAll(User e1, User e2, User e3, User e4, User e5, User e6, User e7, User e8, User e9, User e10, User e11, User e12, User e13, User e14, User e15, User e16) {
        String[] arrayNames = {e1.getName(), e2.getName(), e3.getName(), e4.getName(), e5.getName(), e6.getName(), e7.getName(), e8.getName(), e9.getName(), e10.getName(), e11.getName(), e12.getName(), e13.getName(), e14.getName(), e15.getName(), e16.getName()};
        Integer[] arrayGameRating = {e1.getResult(e1), e2.getResult(e2), e3.getResult(e3), e4.getResult(e4), e5.getResult(e5), e6.getResult(e6), e7.getResult(e7), e8.getResult(e8), e9.getResult(e9), e10.getResult(e10), e11.getResult(e11), e12.getResult(e12), e13.getResult(e13), e14.getResult(e14), e15.getResult(e15), e16.getResult(e16)};
        int temp;
        String tempString;
        for (int i = 1; i <= arrayGameRating.length - 1; i++) {
            for (int j = arrayGameRating.length - 1; j >= i; j--) {
                if (arrayGameRating[j] > arrayGameRating[j - 1]) {
                    temp = arrayGameRating[j];
                    arrayGameRating[j] = arrayGameRating[j - 1];
                    arrayGameRating[j - 1] = temp;
                    tempString = arrayNames[j];
                    arrayNames[j] = arrayNames[j - 1];
                    arrayNames[j - 1] = tempString;
                }
            }
        }
        for (int i = 0; i <= 10; i++) {
            System.out.println(arrayGameRating[i] + " - " + arrayNames[i]);
        }
    }

}