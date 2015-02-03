package colossus.extensions.protocols.mongo.command

import colossus.extensions.util.bson.BsonDocument
import colossus.extensions.util.bson.BsonDsl._
import colossus.extensions.util.bson.Implicits._

case class Count(databaseName: String,
                 collectionName: String,
                 query: Option[BsonDocument] = None,
                 limit: Option[Int] = None,
                 skip: Option[Int] = None) extends Command {
  override val command: BsonDocument = {
    ("count" := collectionName) ~
      ("query" := query) ~
      ("limit" := limit) ~
      ("skip" := skip)
  }
}
