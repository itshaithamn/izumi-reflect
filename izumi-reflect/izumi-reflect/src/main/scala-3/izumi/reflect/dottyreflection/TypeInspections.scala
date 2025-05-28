package izumi.reflect.dottyreflection

import izumi.reflect.macrortti.LightTypeTagRef.{AbstractReference, NameReference}
import scala.quoted.{Quotes, Type}
import scala.collection.mutable.WeakHashMap


object TypeInspections {

  private val refCache: WeakHashMap[Any, AbstractReference] = new WeakHashMap[Any, AbstractReference]()
  private val nameDbCache: WeakHashMap[Any, Map[NameReference, Set[NameReference]]] =  new WeakHashMap[Any, Map[NameReference, Set[NameReference]]]()
  private val dbCache: WeakHashMap[Any, Map[AbstractReference, Set[AbstractReference]]] = new WeakHashMap[Any, Map[AbstractReference, Set[AbstractReference]]]()

  def apply[T <: AnyKind: Type](using qctx0: Quotes): AbstractReference = {
//    import qctx0.reflect.*
//    val key = TypeRepr.of[T]
//    refCache.getOrElseUpdate(key, Inspector.make(qctx0).buildTypeRef[T])

    Inspector.make(qctx0).buildTypeRef[T]
  }

  def unappliedDb[T <: AnyKind: Type](using qctx0: Quotes): Map[NameReference, Set[NameReference]] = {
//    import qctx0.reflect.*
//    val key = TypeRepr.of[T]
//    nameDbCache.getOrElseUpdate(key, InheritanceDbInspector.make(qctx0).makeUnappliedInheritanceDb[T])

    InheritanceDbInspector.make(qctx0).makeUnappliedInheritanceDb[T]
  }

  def fullDb[T <: AnyKind: Type](using qctx0: Quotes): Map[AbstractReference, Set[AbstractReference]] = {
//    import qctx0.reflect.*
//    val key = TypeRepr.of[T]
//    dbCache.getOrElseUpdate(key, FullDbInspector.make(qctx0).buildFullDb[T])

    FullDbInspector.make(qctx0).buildFullDb[T]
  }
}
