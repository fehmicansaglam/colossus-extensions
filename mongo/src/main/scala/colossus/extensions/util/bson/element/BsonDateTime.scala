package colossus.extensions.util.bson.element

import colossus.extensions.util.bson.Implicits.BsonValueDateTime

case class BsonDateTime(name: String, value: BsonValueDateTime) extends BsonElement {
  val code: Byte = 0x09
}
