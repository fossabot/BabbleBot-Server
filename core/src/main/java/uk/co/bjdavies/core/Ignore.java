package uk.co.bjdavies.core;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;
import uk.co.bjdavies.api.db.Model;
import uk.co.bjdavies.api.db.fields.PrimaryField;
import uk.co.bjdavies.api.db.fields.Property;
import uk.co.bjdavies.api.db.fields.Unique;

/**
 * @author ben.davies99@outlook.com (Ben Davies)
 * @since 1.0.0
 */
@Getter
@Setter
@ToString
@Slf4j
public class Ignore extends Model {

    @PrimaryField
    @Property
    private int id;

    @Property
    private String guildId;

    @Property
    @Unique
    private String channelId;

    @Property
    private String ignoredBy;

}
