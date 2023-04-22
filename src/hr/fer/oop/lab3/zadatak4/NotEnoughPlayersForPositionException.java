package hr.fer.oop.lab3.zadatak4;

public class NotEnoughPlayersForPositionException extends RuntimeException {

    public NotEnoughPlayersForPositionException(String message) {
        super(message);
    }
}
