package academy.devdojo.javaoneforall.javacore.ZZIjdbc.repository;

import academy.devdojo.javaoneforall.javacore.ZZIjdbc.conn.ConnectionFactory;
import academy.devdojo.javaoneforall.javacore.ZZIjdbc.domain.Producer;
import lombok.extern.log4j.Log4j2;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Log4j2
public class ProducerRepository {
    public static void save(Producer producer) {
        String sql = "INSERT INTO `anime_store`.`producer` (`name`) VALUES ('%s');".formatted(producer.getName());
        try (Connection conn = ConnectionFactory.getConnection();
             Statement stmt = conn.createStatement()) {
            int rowsAffected = stmt.executeUpdate(sql);
            log.info("Inserted  producer '{}'. Affected rows in the database '{}'", producer.getName(), rowsAffected);
        } catch (SQLException e) {
            log.error("Error trying to insert producer '{}'", producer.getName(), e);
        }
    }

    public static void delete(int id) {
        String sql = "DELETE FROM `anime_store`.`producer` WHERE (`id` = '%d');".formatted(id);
        try (Connection conn = ConnectionFactory.getConnection();
             Statement stmt = conn.createStatement()) {
            int rowsAffected = stmt.executeUpdate(sql);
            log.info("Deleted  producer with id '{}'. Affected rows in the database '{}'", id, rowsAffected);
        } catch (SQLException e) {
            log.error("Error trying to delete producer '{}'", id, e);
        }
    }

    public static void update(Producer producer) {
        String sql = "UPDATE `anime_store`.`producer` SET `name` = '%s' WHERE (`id` = '%d');"
                .formatted(producer.getName(), producer.getId());
        try (Connection conn = ConnectionFactory.getConnection();
             Statement stmt = conn.createStatement()) {
            int rowsAffected = stmt.executeUpdate(sql);
            log.info("Updated producer with id '{}'. Affected rows in the database '{}'", producer.getId(), rowsAffected);
        } catch (SQLException e) {
            log.error("Error trying to update producer '{}'", producer.getId(), e);
        }
    }

    public static List<Producer> findAll() {
        return findByName("");
    }

    public static List<Producer> findByName(String name) {
        String sql = "SELECT * FROM anime_store.producer where name like '%%%s%%';"
                .formatted(name);
        List<Producer> producers = new ArrayList<>();
        try (Connection conn = ConnectionFactory.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                Producer producer = Producer
                        .builder()
                        .id(rs.getInt("id"))
                        .name(rs.getString("name"))
                        .build();
                producers.add(producer);
            }
        } catch (SQLException e) {
            log.error("Error trying to find all producers", e);
        }
        return producers;
    }

    public static void showResultSetMetaData() {
        String sql = "SELECT * FROM anime_store.producer;";
        try (Connection conn = ConnectionFactory.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            ResultSetMetaData rsMetaData = rs.getMetaData();
            int columnCount = rsMetaData.getColumnCount();
            log.info("Column count '{}'", columnCount);
            for (int i = 1; i <= columnCount ; i++) {
                log.info("Table name '{}'", rsMetaData.getTableName(i));
                log.info("Column name '{}'", rsMetaData.getColumnName(i));
                log.info("Column size '{}'", rsMetaData.getColumnDisplaySize(i));
                log.info("Column type '{}'", rsMetaData.getColumnTypeName(i));
            }
        } catch (SQLException e) {
            log.error("Error trying to find all producers", e);
        }
    }

    public static void showDriverMetaData() {
        try (Connection conn = ConnectionFactory.getConnection()) {
            DatabaseMetaData dbMetaData = conn.getMetaData();
            if(dbMetaData.supportsResultSetType(ResultSet.TYPE_FORWARD_ONLY)){
                log.info("Supports TYPE_FORWARD_ONLY");
                if(dbMetaData.supportsResultSetConcurrency(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_UPDATABLE)){
                    log.info("Supports CONCUR_UPDATABLE");
                }
            }
            if(dbMetaData.supportsResultSetType(ResultSet.TYPE_SCROLL_INSENSITIVE)){
                log.info("Supports TYPE_SCROLL_INSENSITIVE");
                if(dbMetaData.supportsResultSetConcurrency(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE)){
                    log.info("Supports CONCUR_UPDATABLE");
                }
            }
            if(dbMetaData.supportsResultSetType(ResultSet.TYPE_SCROLL_SENSITIVE)){
                log.info("Supports TYPE_SCROLL_SENSITIVE");
                if(dbMetaData.supportsResultSetConcurrency(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE)){
                    log.info("Supports CONCUR_UPDATABLE");
                }
            }
        } catch (SQLException e) {
            log.error("Error trying to find all producers", e);
        }
    }

    public static void showTypeScrollWorking() {
        String sql = "SELECT * FROM anime_store.producer;";
        try (Connection conn = ConnectionFactory.getConnection();
             Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
             ResultSet rs = stmt.executeQuery(sql)) {
            log.info("Last row? '{}'", rs.last());
            log.info("Row number? '{}'", rs.getRow());
            log.info(Producer.builder().id(rs.getInt("id")).name(rs.getString("name")).build());
            log.info("------------");

            log.info("First row? '{}'", rs.first());
            log.info("Row number? '{}'", rs.getRow());
            log.info(Producer.builder().id(rs.getInt("id")).name(rs.getString("name")).build());
            log.info("------------");

            log.info("Absolute row? '{}'", rs.absolute(2));
            log.info("Row number? '{}'", rs.getRow());
            log.info(Producer.builder().id(rs.getInt("id")).name(rs.getString("name")).build());
            log.info("------------");

            log.info("Relative row? '{}'", rs.relative(-1));
            log.info("Row number? '{}'", rs.getRow());
            log.info(Producer.builder().id(rs.getInt("id")).name(rs.getString("name")).build());
            log.info("------------");

            log.info("Is Last row? '{}'", rs.isLast());
            log.info("Row number? '{}'", rs.getRow());
            log.info("------------");

            log.info("Is First row? '{}'", rs.isFirst());
            log.info("Row number? '{}'", rs.getRow());
            log.info("------------");

            log.info("Last row? '{}'", rs.last());
            log.info("Row number? '{}'", rs.getRow());
            rs.afterLast();
            while(rs.previous()){
                log.info(Producer.builder().id(rs.getInt("id")).name(rs.getString("name")).build());
            }

        } catch (SQLException e) {
            log.error("Error trying to find all producers", e);
        }
    }
}
