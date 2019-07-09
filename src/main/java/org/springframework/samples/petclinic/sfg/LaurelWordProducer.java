package org.springframework.samples.petclinic.sfg;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

/**
 * Created by Adrian Rusinek on 09.07.2019
 **/
@Component
@Profile("Laurel")
public class LaurelWordProducer implements WordProducer {

    @Override
    public String getWord() {
        return "Laurel";
    }
}
