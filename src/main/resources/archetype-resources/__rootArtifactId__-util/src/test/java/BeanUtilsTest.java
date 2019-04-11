package ${package}.util.beanutils;

import org.apache.commons.beanutils.BeanUtils;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.util.Date;

public class BeanUtilsTest {

    @Test
    public void testCopy() throws InvocationTargetException, IllegalAccessException {
        PersonDTO personDTO = PersonDTO.PersonDTOBuilder.aPersonDTO().withName("张三").
                withAge(66).withSex("femal").withBirthday(new Date()).build();
        PersonBO bo = new PersonBO();
        BeanUtils.copyProperties(bo,personDTO);
        System.out.println(bo);
    }

}
