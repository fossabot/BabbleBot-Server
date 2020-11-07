package uk.co.bjdavies.core;

import lombok.Getter;
import lombok.Setter;
import uk.co.bjdavies.api.db.Model;
import uk.co.bjdavies.api.db.fields.PrimaryField;
import uk.co.bjdavies.api.db.fields.Unique;

/**
 * @author ben.davies99@outlook.com (Ben Davies)
 * @since 1.2.7
 */
public class AnnouncementChannel extends Model {
    @PrimaryField
    @Getter
    private int id;

    @Getter
    @Setter
    @Unique
    private String guildId;

    @Unique
    @Getter
    @Setter
    private String channelId;

    @Override
    public String toString() {
        return "AnnouncementChannel{" +
                "id=" + id +
                ", guildId='" + guildId + '\'' +
                ", channelId='" + channelId + '\'' +
                '}';
    }
}
