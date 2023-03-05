public class Switch{
    public static void main(String args[]){
        int instrument=6;
        
        String musicInstrument;
        //switch statement with int data type
        switch(instrument){
            case 1:musicInstrument="guitar";
            break;
            case 2:musicInstrument="Drum";
            break;
            case 3:musicInstrument="Piano";
            break;
            case 4:musicInstrument="flute";
            break;
            case 5:musicInstrument="trumpet";
            break;
            case 6:musicInstrument="violin";
            break;
            default:musicInstrument="invalid";
            break;
        }
        System.out.println(musicInstrument);
    }
}