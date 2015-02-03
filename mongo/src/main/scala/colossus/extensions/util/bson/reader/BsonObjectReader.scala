package colossus.extensions.util.bson.reader

import java.nio.ByteBuffer

import colossus.extensions.util.bson.element.BsonObject

case class BsonObjectReader(buffer: ByteBuffer) extends Reader[BsonObject] {

  def read: Option[BsonObject] = {
    val name = readCString()
    BsonDocumentReader(buffer).read.map(BsonObject(name, _))
  }
}
