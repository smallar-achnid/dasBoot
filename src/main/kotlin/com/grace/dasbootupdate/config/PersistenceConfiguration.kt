package com.grace.dasbootupdate.config

import org.springframework.boot.autoconfigure.flyway.FlywayDataSource
import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.boot.jdbc.DataSourceBuilder
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Primary
import javax.sql.DataSource

@Configuration
class PersistenceConfiguration {
    @Bean
    @ConfigurationProperties( prefix = "spring.datasource")
    @Primary
    fun dataSource() : DataSource{
        return DataSourceBuilder.create().build()
    }

    @Bean
    @ConfigurationProperties( prefix = "datasource.flyway")
    @FlywayDataSource
    fun flywayDataSource(): DataSource{
        return DataSourceBuilder.create().build()
    }
}