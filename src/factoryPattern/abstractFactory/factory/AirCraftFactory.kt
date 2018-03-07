package factoryPattern.abstractFactory.factory

import factoryPattern.abstractFactory.engine.Engine
import factoryPattern.abstractFactory.weapon.Weapon

interface AirCraftFactory {
    fun createWeapon(): ArrayList<Weapon>
    fun createEngine(): Engine
}