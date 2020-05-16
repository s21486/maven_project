package pl.pjatk;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        User user = new User();
        user.setAge(26);
        user.setName("Some name");
        System.out.println(user.getName());
        Validator validator = Validation.buildDefaultValidatorFactory().getValidator();
        Set<ConstraintViolation<User>> validate = validator.validate(user);
        System.out.println(validate);

    }
}
