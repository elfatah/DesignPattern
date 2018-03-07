package factoryPattern.abstractFactory.product

import factoryPattern.abstractFactory.factory.AirCraftFactory

class Sukhoi(factory: AirCraftFactory) : AirCraft(
        modelName = "Sukhoi Su-35",
        engine = factory.createEngine(),
        seat = 1,
        weapon = factory.createWeapon()
)
