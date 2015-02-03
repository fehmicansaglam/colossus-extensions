package colossus.extensions.util.bson.element

import colossus.extensions.util.bson.Implicits.BsonValueString

case class BsonString(name: String, value: BsonValueString) extends BsonElement {
  val code: Byte = 0x02
}
