package colossus.extensions.protocols

import colossus.service.ClientCodecProvider

package object mongo {

  implicit object MongoClientProvider extends ClientCodecProvider[Mongo] {
    def clientCodec = new MongoClientCodec

    def name = "mongo"
  }

}
