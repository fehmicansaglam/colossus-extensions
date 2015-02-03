package colossus.extensions.protocols.mongo

import colossus.core.{DataBuffer, DataReader}
import colossus.extensions.protocols.mongo.message.{Message, Reply}
import colossus.service.Codec.ClientCodec
import colossus.service.DecodedResult

class MongoClientCodec extends ClientCodec[Message, Reply] {

  override def encode(out: Message): DataReader = DataBuffer(out.encode().asByteBuffer)

  override def decode(data: DataBuffer): Option[DecodedResult[Reply]] = {
    Reply.decode(data.data).map(data => DecodedResult.Static(data))
  }

  override def reset(): Unit = {}
}
