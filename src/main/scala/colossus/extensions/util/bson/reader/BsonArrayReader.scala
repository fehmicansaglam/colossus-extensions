package colossus.extensions.util.bson.reader

import java.nio.ByteBuffer

import colossus.extensions.util.bson.element.BsonArray

case class BsonArrayReader(buffer: ByteBuffer) extends Reader[BsonArray] {

  def read: Option[BsonArray] = {
    val name = readCString()
    BsonDocumentReader(buffer).read.map(BsonArray(name, _))
  }
}
