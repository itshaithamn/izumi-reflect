import scala.quoted.*

package izumi.reflect.macrortti

import scala.collection.mutable.WeakHashMap

object LightTypeTagMacro {
    private lazy val cache = WeakHashMap(AnyRef, AbstractRefrence)
    //duplicate caching enabled?

    transparent inline def makeRef
}