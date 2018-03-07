package factoryPattern.abstractFactory.product

import factoryPattern.abstractFactory.factory.AirCraftFactory

class F22(factory: AirCraftFactory) : AirCraft(
        modelName = "F22-Raptor",
        engine = factory.createEngine(),
        seat = 1,
        weapon = factory.createWeapon()
)