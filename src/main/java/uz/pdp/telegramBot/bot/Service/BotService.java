package uz.pdp.telegramBot.bot.Service;

import org.telegram.telegrambots.meta.api.methods.send.SendMessage;

public class BotService {
    private static BotService instance = new BotService();

    @SuppressWarnings("unchecked")
    public static BotService getInstance() {
        return instance;
    }

    MurkUps murkUps = new MurkUps();

    public SendMessage shareContact(String chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Welcome to Avia_Sales bot. \uD83D\uDCDE\nSend your phone number");
        sendMessage.setReplyMarkup(murkUps.contactButton());

        return sendMessage;
    }
}
