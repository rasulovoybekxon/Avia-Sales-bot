package uz.pdp.telegramBot.repositories;

public interface ResponseRepository {
    String SUCCESS = "SUCCESSFULLY COMPLETED";
    String ALREADY_REGISTERED = "You already registered for this ticket";
    String ERROR_EXIST_CARD = "CARD ALREADY EXIST";
    String WRON_CARD_NUMBER = "CARD NUMBER SHOULD CONTAIN ONLY 16 (SIXTEEN) NUMBERS";
}
