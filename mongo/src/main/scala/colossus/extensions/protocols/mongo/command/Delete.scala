package colossus.extensions.protocols.mongo.command

import colossus.extensions.util.bson.BsonDocument
import colossus.extensions.util.bson.BsonDsl._
import colossus.extensions.util.bson.Implicits._

case class Delete(databaseName: String, collectionName: String, deletes: Seq[BsonDocument]) extends Command {
  override val command: BsonDocument = ("delete" := collectionName) ~ ("deletes" := array(deletes: _*))
}
