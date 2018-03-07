package factoryPattern.simpleFactory

class Sukhoi : AirCraft(
        modelName = "Sukhoi Su-35",
        engine = "2 Jet engine",
        seat = 1,
        weapon = arrayListOf("Homing missile", "Short range missile", "Bomb", "Flare", "Machine gun")
)
