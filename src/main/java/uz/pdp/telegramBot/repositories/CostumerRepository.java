package uz.pdp.telegramBot.repositories;

import uz.pdp.telegramBot.model.User;

import java.util.List;

public abstract class CostumerRepository implements BaseRepository<User, String, List<User>> {
    protected abstract User getByChatId(String chatId);

    protected abstract String editByChatId(String chatId, User etideUser);
}
