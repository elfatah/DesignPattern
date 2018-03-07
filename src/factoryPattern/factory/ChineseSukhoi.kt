package factoryPattern.factory

class ChineseSukhoi : AirCraft(
        modelName = "Sukhoi Su-35 Chinese Edition",
        engine = "2 Jet engine",
        seat = 1,
        weapon = arrayListOf("Homing missile", "Short range missile", "Bomb", "Flare", "Machine gun")
)
