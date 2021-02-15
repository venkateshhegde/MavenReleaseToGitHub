package org.ven;

import com.example.tutorial.AddressBookProtos;
import com.google.protobuf.TextFormat;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main
{

    static Logger logger = LoggerFactory.getLogger(Main.class);
    public static void main(String[] args) {

        logger.info("hello!");
        AddressBookProtos.Person john =
                AddressBookProtos.Person.newBuilder().build().newBuilder()
                        .setId(1234)
                        .setName("John Doe")
                        .setEmail("jdoe@example.com")
                        .addPhones(
                                AddressBookProtos.Person.PhoneNumber.newBuilder()
                                        .setNumber("555-4321")
                                        .setType(AddressBookProtos.Person.PhoneType.HOME))
                        .build();

        logger.info(TextFormat.shortDebugString(john));

    }
}