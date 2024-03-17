package hiber.models;

import hiber.config.AppConfig;
import hiber.service.ImpCarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


//    AnnotationConfigApplicationContext context =
//            new AnnotationConfigApplicationContext(AppConfig.class);
//    @Autowired
//    ImpCarService impCarService ;

//@ComponentScan
//@Component
@Entity
@Table(name = "Cars")
public class Car {


    private String model;

    private String yearOfProduction;

    private int enginePower;
    @Id
    private Long id;

    public Car() {
    }

    ;

    public Car(String model, String yearOfProduction, int enginePower, Long id) {
        this.model = model;
        this.yearOfProduction = yearOfProduction;
        this.enginePower = enginePower;
        this.id = id;
    }

    public int getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(int enginePower) {
        this.enginePower = enginePower;
    }


    public String getModel() {
        return model;
    }

    public String getYearOfProduction() {
        return yearOfProduction;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYearOfProduction(String yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    @Override
    public String toString() {
        return "Cars{" +
                "model = '" + model + '\'' +
                ", yearOfProduction= '" + yearOfProduction + '\'' +
                ", enginePower= " + enginePower +
                '}' + '\n';
    }


    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

//    @Bean
    public List<Car> creatingListCars() {
        List<Car> listCars = new ArrayList<>();

        Car car1 = new Car("Mersedes", "2003", 150, 1L);
        Car car2 = new Car("BMW", "2023", 177, 2L);
        Car car3 = new Car("Audi", "1988", 136, 3L);
        Car car4 = new Car("Alfa-Rameo", "2008", 112, 4L);
        Car car5 = new Car("Porsche", "1977", 203, 5L);

        listCars.add(car1);
        listCars.add(car2);
        listCars.add(car3);
        listCars.add(car4);
        listCars.add(car5);

        return listCars;
    }

    @Bean
    public List<Car> getListbyID(int id) {
        List<Car> newList = new ArrayList<>();

        Car car1 = new Car("Mersedes", "2003", 150, 1L);
        Car car2 = new Car("BMW", "2023", 177, 2L);
        Car car3 = new Car("Audi", "1988", 136, 3L);
        Car car4 = new Car("Alfa-Rameo", "2008", 112, 4L);
        Car car5 = new Car("Porsche", "1977", 203, 5L);

        newList.add(car1);
        newList.add(car2);
        newList.add(car3);
        newList.add(car4);
        newList.add(car5);

        List<Car> resultList = newList.stream()
                .filter(p -> p.getId() <= (long) id)
                .collect(Collectors.toList());


        if (id >= 5) {
            return newList;
        } else {
            return resultList;
        }
    }
}
