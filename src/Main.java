public class Main {
    public static void main(String[] args) {
        Time t[] = new Time[6];

        t[0] = new Time("CEARÁ", 11, 10, 3, 1);
        t[1] = new Time("PALMEIRAS", 11, 8, 3, 3);
        t[2] = new Time("FORTALEZA", 11, 5, 6, 3);
        t[3] = new Time("BAHIA", 11, 5, 7, 2);
        t[4] = new Time("REMO", 11, 2, 9, 3);
        t[5] = new Time("PARANÁ", 11,  2, 11, 1);

        Jogo BR22 = new Jogo();
        BR22.marcarJogo(t[1], t[0]);
        BR22.Jogar();
        BR22.marcarJogo(t[3], t[2]);
        BR22.Jogar();
        BR22.marcarJogo(t[4], t[5]);
        BR22.Jogar();
    }
}

