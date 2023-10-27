package uz.pdp.telegramBot.bot.Service;

import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.ChatMemberUpdated;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;
import uz.pdp.telegramBot.repositories.ResponseRepository;

@Slf4j
public class UserBot extends TelegramLongPollingBot implements UserBotInterface, ResponseRepository {
    private static final BotService botService = BotService.getInstance();

    @Override
    public String getBotToken() {
        return BOT_TOKEN;
    }

    @Override
    public String getBotUsername() {
        return BOT_USERNAME;
    }


    @SneakyThrows
    @Override
    public void onUpdateReceived(Update update) {
        Message message = update.getMessage();
        ChatMemberUpdated chatMember = update.getChatMember();
        Long chatId = message.getChatId();
        String text = message.getText();
        log.info("requesting contact from : " + chatId);

        execute(botService.shareContact(chatId.toString()));

    }

}
