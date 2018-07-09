package com.shen.kafka01;

import java.util.Properties;

public class ProducerKa {
    public static void main(String[] args) {
        Properties props = new Properties();
        props.put("bootstrap.server", "kafka-01:9092");
        props.put("key.serializer", "io.confluent.kafka.serializers.KafkaAvroSerializer");
        
        
    }

}
