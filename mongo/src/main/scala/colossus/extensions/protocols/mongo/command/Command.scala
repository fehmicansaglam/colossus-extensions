package colossus.extensions.protocols.mongo.command

import akka.util.ByteString
import colossus.extensions.protocols.mongo.message.Message
import colossus.extensions.util.bson.BsonDocument

trait Command extends Message {

  override val responseTo: Int = 0

  override val opCode: Int = 2004

  def databaseName: String

  def command: BsonDocument

  override def encodeBody(): ByteString = {
    val flags: Int = 0

    ByteString.newBuilder
      .putInt(flags)
      .putBytes((databaseName + ".$cmd").getBytes("utf-8"))
      .putByte(0)
      .putInt(0) // numberToSkip
      .putInt(1) // numberToReturn
      .append(command.encode())
      .result()
  }

}
