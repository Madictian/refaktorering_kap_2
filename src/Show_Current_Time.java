public class Show_Current_Time {
    public static void main(String[] args) {
        long antal_millisekunder = System.currentTimeMillis();
/*
        long sekunder_i_alt   = antal_millisekunder / 1000;
        long acktuelle_sekund  = sekunder_i_alt % 60;
        long antal_minutter   = sekunder_i_alt / 60;
        long aktuelle_minut  = antal_minutter % 60;
        long antal_timer     = antal_minutter / 60;
        long aktualle_time    = antal_timer % 24;

        System.out.println("Klokken er specifikt " + aktualle_time + ":" + aktuelle_minut + ":" + acktuelle_sekund + "GMT");*/
        Klokken(antal_millisekunder);
    }

    public static void Klokken(long antal_millisekunder) {
        long sekunder_i_alt   = antal_millisekunder / 1000;
        long acktuelle_sekund  = sekunder_i_alt % 60;
        long antal_minutter   = sekunder_i_alt / 60;
        long aktuelle_minut  = antal_minutter % 60;
        long antal_timer     = antal_minutter / 60;
        long aktualle_time    = antal_timer % 24;

        System.out.println("Klokken er specifikt " + aktualle_time + ":" + aktuelle_minut + ":" + acktuelle_sekund + "GMT");
    }
}
