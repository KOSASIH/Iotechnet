package com.kosasih.iotechnet;

import com.kosasih.iotechnet.IotechnetApp;
import com.kosasih.iotechnet.config.AsyncSyncConfiguration;
import com.kosasih.iotechnet.config.EmbeddedElasticsearch;
import com.kosasih.iotechnet.config.EmbeddedKafka;
import com.kosasih.iotechnet.config.EmbeddedSQL;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;

/**
 * Base composite annotation for integration tests.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@SpringBootTest(classes = { IotechnetApp.class, AsyncSyncConfiguration.class })
@EmbeddedElasticsearch
@EmbeddedSQL
@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_CLASS)
@EmbeddedKafka
public @interface IntegrationTest {
}
