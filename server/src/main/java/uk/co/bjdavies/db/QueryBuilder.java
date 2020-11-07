package uk.co.bjdavies.db;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import uk.co.bjdavies.db.object.IQueryObject;
import uk.co.bjdavies.db.object.QueryObject;

import java.util.Map;
import java.util.Set;

/**
 * Edit me
 *
 * @author me@bdavies (Ben Davies)
 * @since 1.0.0
 */
@Slf4j
@RequiredArgsConstructor
public class QueryBuilder implements IQueryObject {

    private final QueryObject object;

    public QueryBuilder(String table) {
        this.object = DB.buildObject(QueryObject.class, table);
        log.info("{}", object);
    }

    public QueryBuilder columns(String... cols) {
        object.columns(cols);
        return this;
    }

    public <T> Set<T> get(Class<T> clazz) {
        return object.get(clazz);
    }

    public Set<Map<String, String>> get() {
        log.info(object.toSQLString());
        return object.get();
    }
}
