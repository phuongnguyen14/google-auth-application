package com.google.myapp;

import com.google.myapp.config.AsyncSyncConfiguration;
import com.google.myapp.config.EmbeddedElasticsearch;
import com.google.myapp.config.EmbeddedSQL;
import com.google.myapp.config.JacksonConfiguration;
import com.google.myapp.config.TestSecurityConfiguration;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Base composite annotation for integration tests.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@SpringBootTest(
    classes = { GoogleAuthApplicationApp.class, JacksonConfiguration.class, AsyncSyncConfiguration.class, TestSecurityConfiguration.class }
)
@EmbeddedElasticsearch
@EmbeddedSQL
public @interface IntegrationTest {
}
