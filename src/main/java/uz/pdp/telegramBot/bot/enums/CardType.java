package uz.pdp.telegramBot.bot.enums;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum CardType {
    Uz_CARD("uz_card"),
    HUMO("humo"),
    VISA("visa"),
    MASTER("master");
    private String cardName;

}
