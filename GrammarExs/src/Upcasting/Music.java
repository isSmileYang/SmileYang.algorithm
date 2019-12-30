package Upcasting;

public class Music {
    public static void tune(Instruments i){i.play(Note.A_SHARP);}
    public static void main(String[] args) {
       Instruments ins = new Piano();
      ins.play(Note.E_FLAT);
       //tune(ins);
    }
}
