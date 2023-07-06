package task1;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        //Minecraft,Pubg,Ks go,Fortnite,Brawl stars
        User gamer1 = new User("Иван", "Minecraft", "Brawl stars");
        gamer1.RatingForMinecraft = 43;
        gamer1.RatingForBrawlStars = 24;
        User gamer2 = new User("Саша", "Pubg", "Minecraft");
        gamer2.RatingForPubg = 23;
        gamer2.RatingForMinecraft = 53;
        User gamer3 = new User("Антон", "Ks go", "Pubg");
        gamer3.RatingForKsGo = 24;
        gamer3.RatingForPubg = 35;
        User gamer4 = new User("Виталий", "Fortnite", "Ks go");
        gamer4.RatingForFortnite = 83;
        gamer4.RatingForKsGo = 24;
        User gamer5 = new User("Юрий", "Brawl stars", "Fortnite");
        gamer5.RatingForBrawlStars = 33;
        gamer5.RatingForFortnite = 22;
        User gamer6 = new User("Юлия", "Minecraft", "Brawl stars", "Fortnite");
        gamer6.RatingForMinecraft = 10;
        gamer6.RatingForBrawlStars = 70;
        gamer6.RatingForFortnite = 27;
        User gamer7 = new User("Наташа", "Pubg", "Minecraft", "Brawl stars");
        gamer7.RatingForPubg = 28;
        gamer7.RatingForMinecraft = 72;
        gamer7.RatingForBrawlStars = 75;
        User gamer8 = new User("Виктор", "Ks go", "Pubg", "Minecraft");
        gamer8.RatingForKsGo = 93;
        gamer8.RatingForPubg = 28;
        gamer8.RatingForMinecraft = 27;
        User gamer9 = new User("Артем", "Fortnite", "Ks go", "Pubg");
        gamer9.RatingForFortnite = 31;
        gamer9.RatingForKsGo = 83;
        gamer9.RatingForPubg = 28;
        User gamer10 = new User("Артур", "Brawl stars", "Fortnite", "Ks go");
        gamer10.RatingForBrawlStars = 75;
        gamer10.RatingForFortnite = 31;
        gamer10.RatingForKsGo = 90;
        User gamer11 = new User("Евгений", "Minecraft", "Brawl stars", "Fortnite", "Ks go");
        gamer11.RatingForMinecraft = 20;
        gamer11.RatingForBrawlStars = 83;
        gamer11.RatingForFortnite = 78;
        gamer11.RatingForKsGo = 19;
        User gamer12 = new User("Евгения", "Pubg", "Minecraft", "Brawl stars", "Fortnite");
        gamer12.RatingForPubg = 13;
        gamer12.RatingForMinecraft = 45;
        gamer12.RatingForBrawlStars = 73;
        gamer12.RatingForFortnite = 23;
        User gamer13 = new User("Владимир", "Ks go", "Pubg", "Minecraft", "Brawl stars");
        gamer13.RatingForKsGo = 43;
        gamer13.RatingForPubg = 13;
        gamer13.RatingForMinecraft = 26;
        gamer13.RatingForBrawlStars = 95;
        User gamer14 = new User("Борис", "Fortnite", "Ks go", "Pubg", "Brawl stars");
        gamer14.RatingForFortnite = 40;
        gamer14.RatingForKsGo = 43;
        gamer14.RatingForPubg = 13;
        gamer14.RatingForBrawlStars = 45;
        User gamer15 = new User("Алена", "Brawl stars", "Fortnite", "Ks go", "Pubg ");
        gamer15.RatingForBrawlStars = 42;
        gamer15.RatingForFortnite = 43;
        gamer15.RatingForKsGo = 94;
        gamer15.RatingForPubg = 23;
        LinkedList<String> yourGame = new LinkedList<>();
        UserList userList = new UserList();
        UserListTwo userListTwo = new UserListTwo();
        UserListThree userListThree = new UserListThree();
        LinkedList<String> GamersNames = userListTwo.GetGamersNames(gamer1, gamer2, gamer3, gamer4, gamer5, gamer6, gamer7, gamer8, gamer9, gamer10, gamer11, gamer12, gamer13, gamer14, gamer15);
        LinkedList<Object> hhh = userList.GetListGamers(gamer1, gamer2, gamer3, gamer4, gamer5, gamer6, gamer7, gamer8, gamer9, gamer10, gamer11, gamer12, gamer13, gamer14, gamer15);
        int all = 0;
        User gamer16 = new User();
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Ваш выбор вход(1) или выход(2)");
            switch (scanner.nextInt()) {
                case 1:
                  userList.mainMenu();
                    switch (scanner.nextInt()) {
                        case 1: // Регистрация
                            if (all == 0) {
                                gamer16 = userList.NewGamer(GamersNames, yourGame, hhh, gamer16);
                                all = 1;
                                System.out.println(all);
                            }
                            break;
                        case 2:
                            System.out.println("Minecraft , Pubg , Ks go , Fortnite , Brawl stars");
                            System.out.println("Список ваших игр - " + yourGame);
                            for (Object s : hhh) {
                                System.out.println(s);
                            }
                            break;
                        case 3:
                            userListTwo.yourRating(yourGame , gamer16);
                            break;
                        case 4:
                            Scanner scannerRating = new Scanner(System.in);
                           System.out.println("Введите игру");
                            String u = scannerRating.nextLine();
                            switch (u){
                                case "Minecraft":
                                    userListThree.GetListRatingMinecraft(gamer1, gamer2, gamer3, gamer4, gamer5, gamer6, gamer7, gamer8, gamer9, gamer10, gamer11, gamer12, gamer13, gamer14, gamer15 , gamer16);
                                    break;
                                case "Pubg":
                                    userListThree.GetListRatingPubg(gamer1, gamer2, gamer3, gamer4, gamer5, gamer6, gamer7, gamer8, gamer9, gamer10, gamer11, gamer12, gamer13, gamer14, gamer15 , gamer16);
                                    break;
                                case "Ks go":
                                    userListThree.GetListRatingKsgo(gamer1, gamer2, gamer3, gamer4, gamer5, gamer6, gamer7, gamer8, gamer9, gamer10, gamer11, gamer12, gamer13, gamer14, gamer15 , gamer16);
                                    break;
                                case "Fortnite":
                                    userListThree.GetListRatingFortnite(gamer1, gamer2, gamer3, gamer4, gamer5, gamer6, gamer7, gamer8, gamer9, gamer10, gamer11, gamer12, gamer13, gamer14, gamer15 , gamer16);
                                    break;
                                case "Brawl stars":
                                    userListThree.GetListRatingBrawlStars(gamer1, gamer2, gamer3, gamer4, gamer5, gamer6, gamer7, gamer8, gamer9, gamer10, gamer11, gamer12, gamer13, gamer14, gamer15 , gamer16);
                                    break;
                                default:
                                    System.out.println("Игра введена неверно , или отсутствует в списке");
                            }
                            break;
                        case 5:
                            userListTwo.GetListRatingAll(gamer1, gamer2, gamer3, gamer4, gamer5, gamer6, gamer7, gamer8, gamer9, gamer10, gamer11, gamer12, gamer13, gamer14, gamer15 , gamer16);
                            break;
                        case 6:
                            userList.GetNamesAndGameRating(GamersNames, hhh);
                            break;
                        case 7:
                            if (all == 1) {
                                userListTwo.GamerInGame(gamer16 , yourGame);
                            } else {
                                System.out.println("Вы незарегестрированный пользователь и играть не можете");
                            }
                            break;
                    }
                    break;
                case 2:
                    System.out.println("Программа завершена");
                    System.exit(0);
            }
        }
    }
}
