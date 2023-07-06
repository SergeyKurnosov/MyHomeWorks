package task3;

public class Help <T> {
    public int ReturnMaxValue( int t1 , int t2 , int t3 , int t4){
        int [] array = {t1, t2, t3, t4};
        int result = array[0];
        for (int i : array) {
            if (i > result){
                result = i ;
            }
        }
        return result;
    }

    public String ReturnMaxValue( String t1 , String t2 , String t3 , String t4){
        String [] array = {t1, t2, t3, t4};
        String result = array[0];
        for (String i : array) {
            if (i.length() > result.length()){
                result = i ;
            }
        }
        return result;
    }

    public double ReturnMaxValue( double t1 , double t2 , double t3 , double t4){
        double [] array = {t1, t2, t3, t4};
        double result = array[0];
        for (double i : array) {
            if (i > result){
                result = i ;
            }
        }
        return result;
    }
    //-----------------------------------------------------------------------------------------------

    public int ReturnMinValue( int t1 , int t2 , int t3 , int t4){
        int [] array = {t1, t2, t3, t4};
        int result = array[0];
        for (int i : array) {
            if (i < result){
                result = i ;
            }
        }
        return result;
    }

    public String ReturnMinValue( String t1 , String t2 , String t3 , String t4){
        String [] array = {t1, t2, t3, t4};
        String result = array[0];
        for (String i : array) {
            if (i.length() < result.length()){
                result = i ;
            }
        }
        return result;
    }

    public double ReturnMinValue( double t1 , double t2 , double t3 , double t4){
        double [] array = {t1, t2, t3, t4};
        double result = array[0];
        for (double i : array) {
            if (i < result){
                result = i ;
            }
        }
        return result;
    }
}
