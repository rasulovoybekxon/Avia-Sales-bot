package uz.pdp.telegramBot;

import lombok.SneakyThrows;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;
import uz.pdp.telegramBot.bot.Service.UserBot;

import java.io.IOException;

public class Main {

    static String videosPath = "";

    @SneakyThrows
    public static void main(String[] args) throws IOException {
        TelegramBotsApi telegramBotsApi = new TelegramBotsApi(DefaultBotSession.class);
        telegramBotsApi.registerBot(new UserBot());
        System.out.println("Bot started");


    }
}