package Assesment;

import java.util.function.Predicate;

public class PhoneNumberValidator implements Predicate<String> {

    @Override
    public boolean test(String phoneNumber) {
        if (phoneNumber.startsWith("+234") && phoneNumber.length() == 13){
        return true;
        }
        return false;
    }
}
