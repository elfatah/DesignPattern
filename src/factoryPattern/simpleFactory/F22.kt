package factoryPattern.simpleFactory

class F22 : AirCraft(
        modelName = "F22-Raptor",
        engine = "2 Jet engine",
        seat = 1,
        weapon = arrayListOf("Homing missile", "Short range missile", "Bomb")
)