package colossus.extensions.protocols.mongo

import colossus.extensions.protocols.mongo.message.{Message, Reply}
import colossus.service.CodecDSL

trait Mongo extends CodecDSL {
  type Input = Message
  type Output = Reply
}
