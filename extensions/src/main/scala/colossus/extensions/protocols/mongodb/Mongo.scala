package colossus.extensions.protocols.mongodb

import colossus.extensions.protocols.mongodb.message.{Message, Reply}
import colossus.service.CodecDSL

trait Mongo extends CodecDSL {
  type Input = Message
  type Output = Reply
}
