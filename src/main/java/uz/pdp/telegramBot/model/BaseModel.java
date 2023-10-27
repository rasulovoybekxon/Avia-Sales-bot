package uz.pdp.telegramBot.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Data

public abstract class BaseModel {
    protected UUID id;
    protected String name;
    protected Date createdDate;
    protected Date updateDate;

    {
        this.id = UUID.randomUUID();
        this.createdDate = new Date();
        this.updateDate = new Date();
    }
}
