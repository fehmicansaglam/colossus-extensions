package colossus.extensions.util.bson.element

import colossus.extensions.util.bson.Implicits.BsonValueBoolean

case class BsonBoolean(name: String, value: BsonValueBoolean) extends BsonElement {
  val code: Byte = 0x08
}
