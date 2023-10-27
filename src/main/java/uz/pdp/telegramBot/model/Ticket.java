package uz.pdp.telegramBot.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import uz.pdp.telegramBot.bot.enums.ClassOfAirPlane;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Ticket {
    private Double price;
    private ClassOfAirPlane classOfAirPlane;
}
