package com.kafka.guide.springboot_kafka.common;

public enum KafkaTopicName {
    TEST_TOPIC("testTopic");

    private final String topicName;

    // Constructor to initialize the value
    KafkaTopicName(String topicName) {
        this.topicName = topicName;
    }

    @Override
    public String toString() {
        return this.topicName;
    }

    public static String valueOf(KafkaTopicName topic) {
        return topic.topicName;
    }
}
