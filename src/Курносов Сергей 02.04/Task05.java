package homework;

public class Task05 {
    public static void main(String[] args) {
        Mystery05 puzzle = new Mystery05();
        puzzle.step = 3; // У нас 3 попытки ;
        puzzle.numberOFattemps = puzzle.step; // При неправильном ответе кол-во попыток уменьшается ;
        puzzle.condition = "Что это такое: синий, большой, с усами и полностью набит зайцами?";
        puzzle.pravotvet = "Троллейбус";
        puzzle.pravotvettwo = "троллейбус";
        puzzle.stopword = "Сдаюсь";
        puzzle.stopwordtwo = "сдаюсь";
        puzzle.riDDle();

    }
}


