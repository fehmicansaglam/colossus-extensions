package colossus.extensions.util.bson.element

import colossus.extensions.util.bson.Implicits.BsonValueDouble

case class BsonDouble(name: String, value: BsonValueDouble) extends BsonElement {
  val code: Byte = 0x01
}
