package maison;

import java.util.ArrayList;
import java.util.List;

public class Maison {
    private List<Piece> pieces;

    public Maison() {
        this.pieces = new ArrayList<>();
    }

    public void ajouterPiece(Piece piece) {
        if (piece != null) {
            pieces.add(piece);
        }
    }

    public double getSuperficieTotale() {
        return pieces.stream().mapToDouble(Piece::getSuperficie).sum();
    }

    public double getSuperficieParEtage(int etage) {
        return pieces.stream()
                .filter(p -> p.getEtage() == etage)
                .mapToDouble(Piece::getSuperficie)
                .sum();
    }

    public double getSuperficieParTypePiece(Class<? extends Piece> type) {
        return pieces.stream()
                .filter(type::isInstance)
                .mapToDouble(Piece::getSuperficie)
                .sum();
    }

    public int getNbPiecesParTypePiece(Class<? extends Piece> type) {
        return (int) pieces.stream()
                .filter(type::isInstance)
                .count();
    }
}