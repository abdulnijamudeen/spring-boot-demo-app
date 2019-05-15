package com.example.demo.flyway;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.flywaydb.core.Flyway;
import org.springframework.boot.autoconfigure.flyway.FlywayMigrationStrategy;

public class DataCleanMigration implements FlywayMigrationStrategy {

    private final Logger LOG = LogManager.getLogger(DataCleanMigration.class);

    @Override
    public void migrate(Flyway flyway) {
        flyway.clean();
        flyway.migrate();
        flyway.validate();
    }
}
