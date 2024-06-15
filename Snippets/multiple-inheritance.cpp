#include <iostream>

class LandVehicle {
  public:
    int wheels;
    float speed;
    
    void drive() {
      std::cout << "Driving on land at " << speed << "km/h." << std::endl;
    }
  };

class SeaVehicle {
  public: 
    bool hasRudder;
    float buoyancy;
    
    void sail() {
      std::cout << "Sailing on water with buoyancy of " << buoyancy << std::endl;
    }
  };

class AmphibiousVehicle : public LandVehicle, public SeaVehicle {
  public:
    // Inherit properties from both LandVehicle and SeaVehicle
    void displayInfo() {
      std::cout << "This amphibious vehicle has " << wheels << "wheels and " << buoyancy << "buoyancy." << std::endl;
    }
  };

int main() {
  AmphibiousVehicle amphiVehicle;
  amphiVehicle.wheels = 4;
  amphiVehicle.buoyancy = 8.5;
  
  amphiVehicle.displayInfo();   // Inherited from both superclasses
  amphiVehicle.drive();         // Inherited from LandVehicle
  amphiVehicle.sail();          // Inherited from SeaVehicle
  
  return 0;
}
    
  
      
