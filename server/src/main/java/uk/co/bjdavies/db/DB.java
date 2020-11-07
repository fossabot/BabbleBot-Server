package uk.co.bjdavies.db;

import lombok.SneakyThrows;
import lombok.experimental.UtilityClass;
import lombok.extern.slf4j.Slf4j;
import uk.co.bjdavies.api.config.IDatabaseConfig;
import uk.co.bjdavies.db.language.connection.IConnection;
import uk.co.bjdavies.db.language.connection.SQLiteConnection;
import uk.co.bjdavies.db.language.object.SQLiteQueryObject;
import uk.co.bjdavies.db.object.QueryObject;
import uk.co.bjdavies.db.object.SQLObject;

import java.lang.reflect.InvocationTargetException;
import java.util.*;
import java.util.stream.Collectors;

/**
 * Edit me
 *
 * @author me@bdavies (Ben Davies)
 * @since 3.0.0
 */
@Slf4j
@UtilityClass
public final class DB {
    private static IConnection DB_CONNECTION = null;
    private static final Map<Class<? extends SQLObject>, Class<? extends SQLObject>> objectMap = new HashMap<>();

    public static void init(IDatabaseConfig databaseConfig) {
        if (assertInitialisedDB()) {
            switch (databaseConfig.getType().toLowerCase()) {
                case "sqlite":
                    DB_CONNECTION = new SQLiteConnection(databaseConfig);
                    objectMap.put(QueryObject.class, SQLiteQueryObject.class);
                    break;
                default:
                    log.error("DB not found please use sqlite");
            }

        }
        else {
            log.warn("Trying to initialise the DB twice, this will be ignored!");
        }
    }

    private static boolean assertInitialisedDB() {
        return DB_CONNECTION == null;
    }

    @SneakyThrows
    public static QueryBuilder table(String tblName) {
        if (assertInitialisedDB()) {
            log.error("Trying to use the DB before initialising it first");
            throw new DBError("Trying to use the DB before initialising it first");
        }

        return new QueryBuilder(tblName);
    }

    public static <T extends SQLObject> T buildObject(Class<T> clazz, Object... args) {
        if (!objectMap.containsKey(clazz)) {
            log.error("Cannot find map for class : {}", clazz.getSimpleName());
            return null;
        }
        List<Class<?>> argClasses = Arrays.stream(args).map(Object::getClass).collect(Collectors.toList());
        argClasses.add(IConnection.class); // TODO: change for connection
        List<Object> argOverride = new LinkedList<>(Arrays.asList(args));
        argOverride.add(DB_CONNECTION); //TODO: Change for connection
        try {
            //noinspection unchecked
            return (T) objectMap.get(clazz).getConstructor(argClasses.toArray(Class[]::new))
              .newInstance(argOverride.toArray());
        } catch (NoSuchMethodException | IllegalAccessException | InstantiationException | InvocationTargetException e) {
            e.printStackTrace();
            return null;
        }
    }

    @SneakyThrows
    public static void rawSQL(String tblName) {
        if (assertInitialisedDB()) {
            log.error("Trying to use the DB before initialising it first");
            throw new DBError("Trying to use the DB before initialising it first");
        }
        log.warn("Running raw sql, this can be a security risk please considering using the query builder.");

        //TODO:
    }
}
