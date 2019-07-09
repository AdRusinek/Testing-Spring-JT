package org.springframework.samples.petclinic.sfg;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

/**
 * Created by Adrian Rusinek on 10.07.2019
 **/
@Profile("externalized")
@Component
public class PropertyWordProducer implements WordProducer {

    private String word;

    @Override
    public String getWord() {
        return word;
    }

    @Value("${say.word}")
    public void setWord(String word) {
        this.word = word;
    }
}
