public class Interface_class {
    public static void main(String[] args) {
        // Queen queen=new Queen();
        // queen.moves();
        // King king=new King();
        // king.moves();
        // Rook rook=new Rook();
        // rook.moves();
        bear bear=new bear();
        bear.grass();
        bear.meat();
        
    }
    
}

interface chessPlayer{
    void moves();
}
class Queen implements chessPlayer{
    public void moves(){
        System.out.println(" Queen up down left right");
    }

}

class Rook implements chessPlayer{
    public void moves(){
        System.out.println(" Rook up down left right diagonal");
    }

}

class King implements chessPlayer{
    public void moves(){
        System.out.println(" king up down left right");
    }

}


interface cornivore{
    void grass();
}

interface harvicvore{
    void meat();
}

class bear implements cornivore,harvicvore{
    public void grass(){
        System.out.println("Eat grass");
    }
    public void meat(){
        System.out.println("eat meat");
    }
}