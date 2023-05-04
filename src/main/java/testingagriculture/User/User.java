package testingagriculture.User;


import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "userr")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String surname;
    private String password;
    private String category;
    private String type;
    private Integer task_amount;
    private LocalDate hire_date;
    private String pesel;
    private String email;
    private String phone_number;
    private String qualifications;
    private String address;
    private String zip_code;

    public User() {
    }

    public User(Long id, String name, String surname, String password, String category, String type, Integer task_amount, LocalDate hire_date, String pesel, String email, String phone_number, String qualifications, String address, String zip_code) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.password = password;
        this.category = category;
        this.type = type;
        this.task_amount = task_amount;
        this.hire_date = hire_date;
        this.pesel = pesel;
        this.email = email;
        this.phone_number = phone_number;
        this.qualifications = qualifications;
        this.address = address;
        this.zip_code = zip_code;
    }

    public User(String category, String type, Integer task_amount, LocalDate hire_date, String pesel, String email, String phone_number, String qualifications, String address, String zip_code) {
        this.name = name;
        this.surname = surname;
        this.password = password;
        this.category = category;
        this.type = type;
        this.task_amount = task_amount;
        this.hire_date = hire_date;
        this.pesel = pesel;
        this.email = email;
        this.phone_number = phone_number;
        this.qualifications = qualifications;
        this.address = address;
        this.zip_code = zip_code;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getTaskAmount() {
        return task_amount;
    }

    public void setTaskAmount(Integer task_amount) {
        this.task_amount = task_amount;
    }

    public LocalDate getHireDate() {
        return hire_date;
    }

    public void setHireDate(LocalDate hire_date) {
        this.hire_date = hire_date;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phone_number;
    }

    public void setPhoneNumber(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getQualifications() {
        return qualifications;
    }

    public void setQualifications(String qualifications) {
        this.qualifications = qualifications;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getZipCode() {
        return zip_code;
    }

    public void setZipCode(String zip_code) {
        this.zip_code = zip_code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", category='" + category + '\'' +
                ", type='" + type + '\'' +
                ", task_amount=" + task_amount +
                ", hire_date=" + hire_date +
                ", pesel='" + pesel + '\'' +
                ", email='" + email + '\'' +
                ", phone_number='" + phone_number + '\'' +
                ", qualifications='" + qualifications + '\'' +
                ", address='" + address + '\'' +
                ", zip_code='" + zip_code + '\'' +
                '}';
    }
}
