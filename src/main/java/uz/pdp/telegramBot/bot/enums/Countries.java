package uz.pdp.telegramBot.bot.enums;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.Map;

@AllArgsConstructor
@NoArgsConstructor
public enum Countries {
    SAUDI_ARABIA(Map.of(CitiesAndRegions.MADINA, "Prince Mohammed bin Abdulaziz international Airport", CitiesAndRegions.MAKKAH, "King Abdulaziz International Airport")),
    TURKEY(Map.of(CitiesAndRegions.ISTANBUL, "Istanbul Sabiha Gökçen Airport", CitiesAndRegions.IZMIR, "İzmir Adnan Menderes Airport", CitiesAndRegions.KARS, "Kars Harakani Airport")),
    THE_UNITED_STATES(Map.of(CitiesAndRegions.NEW_YORK, "Albany International Airport",
            CitiesAndRegions.NEW_JERSEY, "Atlantic City International Airport", CitiesAndRegions.NEW_MEXICO, "Santa Fe Municipal Airport")),
    UNITED_KINGDOM(Map.of(CitiesAndRegions.LONDON, "London Biggin Hill Airport", CitiesAndRegions.NORTH_EAST_ENGLAND, "Teesside International Airport")),
    UZBEKISTAN(Map.of(CitiesAndRegions.TASHKENT, "Tashkent International Airport", CitiesAndRegions.SAMARKAND, "Samarkand International Airport", CitiesAndRegions.ANDIJAN, "Andijan Airport"));

    private Map<CitiesAndRegions, String> regions;

}
