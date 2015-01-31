package colossus.extensions.protocols.mongodb.command

import colossus.extensions.util.bson.BsonDocument
import colossus.extensions.util.bson.BsonDsl._
import colossus.extensions.util.bson.Implicits._

case class Insert(databaseName: String,
                  collectionName: String,
                  documents: Seq[BsonDocument],
                  ordered: Boolean = true,
                  writeConcern: Option[BsonDocument] = None) extends Command {

  override val command: BsonDocument = {
    ("insert" := collectionName) +
      ("documents" := array(documents: _*)) +
      ("ordered" := ordered) +
      writeConcern.map("writeConcern" := _)
  }
}
