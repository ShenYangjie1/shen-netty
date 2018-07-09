package com.shen.kafka;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerRecord;

import java.util.Properties;

public class ProducerApi {

    public static void main(String[] args) {
        Properties props = new Properties();
        props.put("bootstrap.servers", "kafka-01:9092");
        props.put("acks", "all");//只有当所有参与复制的节点全部收到消息时，生产者才会收到一个来自服务器的成功响应
        props.put("retries", 0);
        props.put("batch.size", 16384);
        props.put("linger.ms", 1);
        props.put("buffer.memory", 33554432);
        props.put("key.serializer",
                  "org.apache.kafka.common.serialization.StringSerializer");
        props.put("value.serializer",
                  "org.apache.kafka.common.serialization.StringSerializer");

        Producer<String, String> producer = new KafkaProducer<>(props);
        for (int i = 0; i < 100; i++) {
            producer.send(new ProducerRecord<String, String>(
                      "t1", Integer.toString(i), Integer.toString(i)));
        }
        producer.close();
    }
}