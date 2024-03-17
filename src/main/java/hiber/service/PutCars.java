//package hiber.service;
//
//import hiber.models.Car;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.stereotype.Component;
//
//import java.util.List;
//
//@Component
//public class PutCars {
//
//    private Car car;
//    @Autowired
//    ImpCarService impCarService;
//
//    public Car getCar() {
//        return car;
//    }
//
//    public void setCar(Car car) {
//        this.car = car;
//    }
//
//    @Bean
//    public void putCarInDB(){
//        List<Car> carList = car.creatingListCars();
//
//        for (int i = 1; i <carList.size() ; i++) {
//            impCarService.addCar(carList.get(i));
//        }
//
//
//    }
//
//}
