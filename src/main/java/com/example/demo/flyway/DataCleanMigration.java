/*
 *
 *    Copyright (c) 2017 Makinus Pvt Ltd - All Rights Reserved
 *
 *    Unauthorized copying of this file, via any medium is strictly prohibited
 *    Proprietary and confidential
 *    Written by Makinus Pvt Ltd
 *
 */
package com.example.demo.flyway;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.flywaydb.core.Flyway;
import org.springframework.boot.autoconfigure.flyway.FlywayMigrationStrategy;

/**
 * Created by abuabdul
 */
public class DataCleanMigration implements FlywayMigrationStrategy {

    private final Logger LOG = LogManager.getLogger(DataCleanMigration.class);

    @Override
    public void migrate(Flyway flyway) {
        flyway.clean();
        flyway.migrate();
        flyway.validate();
    }
}
