package task1;

public class UserListThree {
    public void GetListRatingMinecraft(User e1, User e2, User e3, User e4, User e5, User e6, User e7, User e8, User e9, User e10, User e11, User e12, User e13, User e14, User e15, User e16) {
        String[] arrayNames = {e1.getName(), e2.getName(), e3.getName(), e4.getName(), e5.getName(), e6.getName(), e7.getName(), e8.getName(), e9.getName(), e10.getName(), e11.getName(), e12.getName(), e13.getName(), e14.getName(), e15.getName(), e16.getName()};
        Integer[] arrayGameRating = {e1.RatingForMinecraft, e2.RatingForMinecraft, e3.RatingForMinecraft, e4.RatingForMinecraft, e5.RatingForMinecraft, e6.RatingForMinecraft, e7.RatingForMinecraft, e8.RatingForMinecraft, e9.RatingForMinecraft, e10.RatingForMinecraft, e11.RatingForMinecraft, e12.RatingForMinecraft, e13.RatingForMinecraft, e14.RatingForMinecraft, e15.RatingForMinecraft, e16.RatingForMinecraft};
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
            if (arrayGameRating[i] > 0) {
                System.out.println(arrayGameRating[i] + " - " + arrayNames[i]);
            }
        }
    }
    public void GetListRatingKsgo(User e1, User e2, User e3, User e4, User e5, User e6, User e7, User e8, User e9, User e10, User e11, User e12, User e13, User e14, User e15, User e16) {
        String[] arrayNames = {e1.getName(), e2.getName(), e3.getName(), e4.getName(), e5.getName(), e6.getName(), e7.getName(), e8.getName(), e9.getName(), e10.getName(), e11.getName(), e12.getName(), e13.getName(), e14.getName(), e15.getName(), e16.getName()};
        Integer[] arrayGameRating = {e1.RatingForKsGo, e2.RatingForKsGo, e3.RatingForKsGo, e4.RatingForKsGo, e5.RatingForKsGo, e6.RatingForKsGo, e7.RatingForKsGo, e8.RatingForKsGo, e9.RatingForKsGo, e10.RatingForKsGo, e11.RatingForKsGo, e12.RatingForKsGo, e13.RatingForKsGo, e14.RatingForKsGo, e15.RatingForKsGo, e16.RatingForKsGo};
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
            if (arrayGameRating[i] > 0) {
                System.out.println(arrayGameRating[i] + " - " + arrayNames[i]);
            }
        }
    }
    public void GetListRatingPubg(User e1, User e2, User e3, User e4, User e5, User e6, User e7, User e8, User e9, User e10, User e11, User e12, User e13, User e14, User e15, User e16) {
        String[] arrayNames = {e1.getName(), e2.getName(), e3.getName(), e4.getName(), e5.getName(), e6.getName(), e7.getName(), e8.getName(), e9.getName(), e10.getName(), e11.getName(), e12.getName(), e13.getName(), e14.getName(), e15.getName(), e16.getName()};
        Integer[] arrayGameRating = {e1.RatingForPubg, e2.RatingForPubg, e3.RatingForPubg, e4.RatingForPubg, e5.RatingForPubg, e6.RatingForPubg, e7.RatingForPubg, e8.RatingForPubg, e9.RatingForPubg, e10.RatingForPubg, e11.RatingForPubg, e12.RatingForPubg, e13.RatingForPubg, e14.RatingForPubg, e15.RatingForPubg, e16.RatingForPubg};
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
            if (arrayGameRating[i] > 0) {
                System.out.println(arrayGameRating[i] + " - " + arrayNames[i]);
            }
        }
    }
    public void GetListRatingFortnite(User e1, User e2, User e3, User e4, User e5, User e6, User e7, User e8, User e9, User e10, User e11, User e12, User e13, User e14, User e15, User e16) {
        String[] arrayNames = {e1.getName(), e2.getName(), e3.getName(), e4.getName(), e5.getName(), e6.getName(), e7.getName(), e8.getName(), e9.getName(), e10.getName(), e11.getName(), e12.getName(), e13.getName(), e14.getName(), e15.getName(), e16.getName()};
        Integer[] arrayGameRating = {e1.RatingForFortnite, e2.RatingForFortnite, e3.RatingForFortnite, e4.RatingForFortnite, e5.RatingForFortnite, e6.RatingForFortnite, e7.RatingForFortnite, e8.RatingForFortnite, e9.RatingForFortnite, e10.RatingForFortnite, e11.RatingForFortnite, e12.RatingForFortnite, e13.RatingForFortnite, e14.RatingForFortnite, e15.RatingForFortnite, e16.RatingForFortnite};
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
            if (arrayGameRating[i] > 0) {
                System.out.println(arrayGameRating[i] + " - " + arrayNames[i]);
            }
        }
    }
    public void GetListRatingBrawlStars(User e1, User e2, User e3, User e4, User e5, User e6, User e7, User e8, User e9, User e10, User e11, User e12, User e13, User e14, User e15, User e16) {
        String[] arrayNames = {e1.getName(), e2.getName(), e3.getName(), e4.getName(), e5.getName(), e6.getName(), e7.getName(), e8.getName(), e9.getName(), e10.getName(), e11.getName(), e12.getName(), e13.getName(), e14.getName(), e15.getName(), e16.getName()};
        Integer[] arrayGameRating = {e1.RatingForBrawlStars, e2.RatingForBrawlStars, e3.RatingForBrawlStars, e4.RatingForBrawlStars, e5.RatingForBrawlStars, e6.RatingForBrawlStars, e7.RatingForBrawlStars, e8.RatingForBrawlStars, e9.RatingForBrawlStars, e10.RatingForBrawlStars, e11.RatingForBrawlStars, e12.RatingForBrawlStars, e13.RatingForBrawlStars, e14.RatingForBrawlStars, e15.RatingForBrawlStars, e16.RatingForBrawlStars};
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
            if (arrayGameRating[i] > 0) {
                System.out.println(arrayGameRating[i] + " - " + arrayNames[i]);
            }
        }
    }
}
