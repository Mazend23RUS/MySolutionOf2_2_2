package hiber.DAO;

import hiber.models.Car;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Component;

import javax.persistence.TypedQuery;

import java.util.ArrayList;
import java.util.List;

@Component
public class ImpCarDAO implements CarDAO {
//    @Autowired
    private final SessionFactory sessionFactory;
    public ImpCarDAO(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    private List<Car> listCars;
    private Integer result;



    @Override
    public void addCar(Car car) {
    sessionFactory.getCurrentSession().save(car);
    }

    @SuppressWarnings("unchecked")
    @Override
    public Integer recieveQuantityOfCars(List<Car> listCars) {
        String quary = "select count(id) from Car";
        TypedQuery <Car> carsTypedQuery =sessionFactory.getCurrentSession().createQuery(quary);
        return carsTypedQuery.getResultList().size();
    }

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



}
