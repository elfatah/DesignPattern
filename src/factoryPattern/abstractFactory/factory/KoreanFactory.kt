package factoryPattern.abstractFactory.factory

import factoryPattern.abstractFactory.engine.Engine
import factoryPattern.abstractFactory.engine.TurboEngine
import factoryPattern.abstractFactory.weapon.HomingMisile
import factoryPattern.abstractFactory.weapon.MachineGun
import factoryPattern.abstractFactory.weapon.Weapon

class KoreanFactory : AirCraftFactory {
    override fun createWeapon(): ArrayList<Weapon> =
            arrayListOf(HomingMisile(), MachineGun(), MachineGun())

    override fun createEngine(): Engine = TurboEngine()
}