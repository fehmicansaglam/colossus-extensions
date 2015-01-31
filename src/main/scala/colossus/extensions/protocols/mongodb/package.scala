package colossus.extensions.protocols

import colossus.extensions.protocols.mongodb.message.{Message, Reply}
import colossus.service.{ClientCodecProvider, CodecDSL}

package object mongodb {

  trait Mongo extends CodecDSL {
    type Input = Message
    type Output = Reply
  }

  implicit object MongoClientProvider extends ClientCodecProvider[Mongo] {
    def clientCodec = new MongoClientCodec

    def name = "mongo"
  }

}
