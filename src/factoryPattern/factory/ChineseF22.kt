package factoryPattern.factory

class ChineseF22 : AirCraft(
        modelName = "F22-Raptor Chinese Edition",
        engine = "2 Jet engine",
        seat = 1,
        weapon = arrayListOf("Homing missile", "Short range missile", "Bomb")
)