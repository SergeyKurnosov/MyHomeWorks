package task1;

import java.util.LinkedList;
import java.util.Scanner;

public class UserList {
    public LinkedList GetListGamers(Object e1, Object e2, Object e3, Object e4, Object e5, Object e6, Object e7, Object e8, Object e9, Object e10, Object e11, Object e12, Object e13, Object e14, Object e15) {
        LinkedList<Object> hhh = new LinkedList<>();
        hhh.add(e1);
        hhh.add(e2);
        hhh.add(e3);
        hhh.add(e4);
        hhh.add(e5);
        hhh.add(e6);
        hhh.add(e7);
        hhh.add(e8);
        hhh.add(e9);
        hhh.add(e10);
        hhh.add(e11);
        hhh.add(e12);
        hhh.add(e13);
        hhh.add(e14);
        hhh.add(e15);
        return hhh;
    }
    public void GetNamesAndGameRating(LinkedList names, LinkedList gamers) {
        Scanner scanner3 = new Scanner(System.in);
        System.out.println("Введите ник игрока");
        String gamerName = scanner3.nextLine();
        System.out.println("Введите игру");
        String gamerGame = scanner3.nextLine();
        User resultSearch = null;
        int index = 99;
        for (int i = 0; i < names.size(); i++) {
            if (gamerName.equals(names.get(i))) {
                index = i;
            }
        }
        if (index == 99) {
            System.out.println("Такого пользователя нет в списке");
            return;
        } else {
            resultSearch = (User) gamers.get(index);
        }
        switch (gamerGame) {
            case "Minecraft":
                if (resultSearch.RatingForMinecraft > 0) {
                    System.out.println("Nickname - " + resultSearch.getName() + " RatingForMinecraft - " + resultSearch.RatingForMinecraft);
                } else {
                    System.out.println("Игрок не играет в эту игру");
                    return;
                }
                break;
            case "Pubg":
                if (resultSearch.RatingForPubg > 0) {
                    System.out.println("Nickname - " + resultSearch.getName() + " RatingForPubg - " + resultSearch.RatingForPubg);
                } else {
                    System.out.println("Игрок не играет в эту игру");
                    return;
                }
                break;
            case "Ks go":
                if (resultSearch.RatingForKsGo > 0) {
                    System.out.println("Nickname - " + resultSearch.getName() + " RatingForKsGo - " + resultSearch.RatingForKsGo);
                } else {
                    System.out.println("Игрок не играет в эту игру");
                    return;
                }
                break;
            case "Fortnite":
                if (resultSearch.RatingForFortnite > 0) {
                    System.out.println("Nickname - " + resultSearch.getName() + " RatingForFortnite - " + resultSearch.RatingForFortnite);
                } else {
                    System.out.println("Игрок не играет в эту игру");
                    return;
                }
                break;
            case "Brawl stars":
                if (resultSearch.RatingForBrawlStars > 0) {
                    System.out.println("Nickname - " + resultSearch.getName() + " RatingForBrawlStars - " + resultSearch.RatingForBrawlStars);
                } else {
                    System.out.println("Игрок не играет в эту игру");
                    return;
                }
                break;
            default:
                System.out.println("Игра введена не верно , или отсутствует в списке");
                return;
        }
    }
    public User NewGamer( LinkedList GamersNames , LinkedList yourGame , LinkedList hhh , User gamer16 ){

            System.out.println("Введите ваш новый ник");
            Scanner scanner = new Scanner(System.in);
            String yourNewNickname = scanner.nextLine();
            for (int i = 0; i < GamersNames.size(); i++) {
                if (yourNewNickname.equals(GamersNames.get(i))) {
                    System.out.println("Ник занят");
                    System.exit(0);
                }
            }
            System.out.println("Список игр в которые вы играете");
            boolean check = true;
            while (check) {
                System.out.println("Продолжить список ваших игр -1- Выйти из списка игр -2-");

                switch (scanner.nextInt()) {
                    case 1:
                        System.out.println("Ваша игра :");
                        Scanner scanner2 = new Scanner(System.in);
                        String yourgameR = scanner2.nextLine();
                        yourGame.add(yourgameR);
                        System.out.println(yourGame);
                        break;
                    case 2:
                        switch (yourGame.size()) {
                            case 1:
                                gamer16 = new User(yourNewNickname, (String) yourGame.get(0));
                                break;
                            case 2:
                                gamer16 = new User(yourNewNickname, (String) yourGame.get(0), (String) yourGame.get(1));
                                break;
                            case 3:
                                gamer16 = new User(yourNewNickname, (String) yourGame.get(0), (String) yourGame.get(1), (String) yourGame.get(2));
                                break;
                            case 4:
                                gamer16 = new User(yourNewNickname, (String) yourGame.get(0), (String) yourGame.get(1), (String) yourGame.get(2), (String) yourGame.get(3));
                                break;
                            case 5:
                                gamer16 = new User(yourNewNickname, (String) yourGame.get(0), (String) yourGame.get(1), (String) yourGame.get(2), (String) yourGame.get(3), (String) yourGame.get(4));
                                break;
                        }
                        hhh.add(gamer16);
                        GamersNames.add(gamer16.getName());
                        check = false;
                        break;
                }
            }
        return gamer16;
    }
    public void mainMenu(){
        System.out.println("Выберите действие");
        System.out.println("-1- Регистрация");
        System.out.println("-2- Список игр , в которые играют игроки на сайте");
        System.out.println("-3- Ваш рейтинг");
        System.out.println("-4- 10-лучших игроков в определенной игре");
        System.out.println("-5- 10-лучших игроков с учетом всех игр");
        System.out.println("-6- Рейтинг по имени игрока и игре");
        System.out.println("-7- Поиграть");
    }
}
