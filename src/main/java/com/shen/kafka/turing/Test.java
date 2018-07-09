package com.shen.kafka.turing;

import org.apache.kafka.clients.producer.ProducerRecord;

public class Test {

    public static void main(String[] args) {
        ProducerRecord<String, String> record = new ProducerRecord<String, String>("CustomerCounty",
                "Precision Products", "France");
    }

}
