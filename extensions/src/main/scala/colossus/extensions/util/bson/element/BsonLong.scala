package colossus.extensions.util.bson.element

import colossus.extensions.util.bson.Implicits.BsonValueLong

case class BsonLong(name: String, value: BsonValueLong) extends BsonElement {
  val code: Byte = 0x12
}
