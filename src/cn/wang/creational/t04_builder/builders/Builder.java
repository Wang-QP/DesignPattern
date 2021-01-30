package cn.wang.creational.t04_builder.builders;

import cn.wang.creational.t04_builder.cars.CarType;
import cn.wang.creational.t04_builder.components.Engine;
import cn.wang.creational.t04_builder.components.GPSNavigator;
import cn.wang.creational.t04_builder.components.Transmission;
import cn.wang.creational.t04_builder.components.TripComputer;

public interface Builder {
    void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}
