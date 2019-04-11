package ${package}.util.beanutils;

import java.util.Date;

public class PersonDTO {
    private String name;
    private String sex;
    private int age;
    private Date birthday;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }



    @Override
    public String toString() {
        return "PersonDTO{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", birthday=" + birthday +
                '}';
    }


    public static final class PersonDTOBuilder {
        private String name;
        private String sex;
        private int age;
        private Date birthday;

        private PersonDTOBuilder() {
        }

        public static PersonDTOBuilder aPersonDTO() {
            return new PersonDTOBuilder();
        }

        public PersonDTOBuilder withName(String name) {
            this.name = name;
            return this;
        }

        public PersonDTOBuilder withSex(String sex) {
            this.sex = sex;
            return this;
        }

        public PersonDTOBuilder withAge(int age) {
            this.age = age;
            return this;
        }

        public PersonDTOBuilder withBirthday(Date birthday) {
            this.birthday = birthday;
            return this;
        }

        public PersonDTO build() {
            PersonDTO personDTO = new PersonDTO();
            personDTO.setName(name);
            personDTO.setSex(sex);
            personDTO.setAge(age);
            personDTO.setBirthday(birthday);
            return personDTO;
        }
    }
}
