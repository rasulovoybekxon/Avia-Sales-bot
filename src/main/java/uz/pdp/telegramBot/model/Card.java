package uz.pdp.telegramBot.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import uz.pdp.telegramBot.bot.enums.CardType;

import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class Card {
    private String cardName;
    private UUID ownerId;
    private CardType cardType;
    private Double balance;
}
