package org.example.builder;
public class Person {
    private String firstName;
    private String middleName;
    private String lastName;
    private String birthDate;
    private boolean isMale;
    private double height;
    public static PersonBuilder builder(){
        return new PersonBuilder();
    }
    public Person(String firstName, String middleName, String lastName, String birthDate, boolean isMale, double height) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.isMale = isMale;
        this.height = height;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public boolean isMale() {
        return isMale;
    }

    public void setMale(boolean male) {
        isMale = male;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", isMale=" + isMale +
                ", height=" + height +
                '}';
    }

    public static class PersonBuilder{
        private String firstName;
        private String middleName;
        private String lastName;
        private String birthDate;
        private boolean isMale;
        private double height;

        public Person build(){
            return new Person(firstName, middleName, lastName, birthDate, isMale, height);
        }

        public PersonBuilder firstName(String firstName){
            this.firstName = firstName;
            return this;
        }
        public PersonBuilder middleName(String middleName){
            this.middleName = middleName;
            return this;
        }

        public PersonBuilder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public PersonBuilder BirthDate(String birthDate) {
            this.birthDate = birthDate;
            return this;
        }

        public PersonBuilder Male(boolean male) {
            isMale = male;
            return this;
        }

        public PersonBuilder Height(double height) {
            this.height = height;
            return this;
        }
    }
}
