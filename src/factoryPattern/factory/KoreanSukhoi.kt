package factoryPattern.factory

class KoreanSukhoi : AirCraft(
        modelName = "Sukhoi Su-35 Korean Edition",
        engine = "3 Jet engine",
        seat = 2,
        weapon = arrayListOf("Homing missile", "Short range missile", "Bomb", "Flare", "Machine gun")
)
