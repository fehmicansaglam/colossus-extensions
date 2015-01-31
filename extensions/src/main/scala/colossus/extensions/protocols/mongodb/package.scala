package colossus.extensions.protocols

import colossus.service.ClientCodecProvider

package object mongodb {

  implicit object MongoClientProvider extends ClientCodecProvider[Mongo] {
    def clientCodec = new MongoClientCodec

    def name = "mongo"
  }

}
