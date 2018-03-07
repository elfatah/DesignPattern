package factoryPattern.abstractFactory.factory

import factoryPattern.abstractFactory.engine.Engine
import factoryPattern.abstractFactory.engine.JetEngine
import factoryPattern.abstractFactory.weapon.HomingMisile
import factoryPattern.abstractFactory.weapon.Weapon

class ChineseFactory : AirCraftFactory {
    override fun createEngine(): Engine = JetEngine()

    override fun createWeapon(): ArrayList<Weapon> =
            arrayListOf(HomingMisile(), HomingMisile(), HomingMisile())
}