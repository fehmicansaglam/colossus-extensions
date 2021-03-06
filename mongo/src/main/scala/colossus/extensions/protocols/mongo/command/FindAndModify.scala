package colossus.extensions.protocols.mongo.command

import colossus.extensions.protocols.mongo.command.FindAndModify.RemoveOrUpdate
import colossus.extensions.util.bson.BsonDocument
import colossus.extensions.util.bson.BsonDsl._
import colossus.extensions.util.bson.Implicits._

case class FindAndModify(databaseName: String,
                         collectionName: String,
                         query: Option[BsonDocument],
                         sort: Option[BsonDocument] = None,
                         removeOrUpdate: RemoveOrUpdate,
                         returnNew: Boolean = false,
                         fields: Option[Seq[String]] = None,
                         upsert: Boolean = false) extends Command {

  override val command: BsonDocument = {
    ("findAndModify" := collectionName) ~
      ("query" := query) ~
      ("sort" := sort) ~
      (removeOrUpdate match {
        case Left(remove) => "remove" := remove
        case Right(update) => "update" := update
      }) ~
      ("new" := returnNew) ~
      fields.map(fields => "fields" := document(fields.map(_ := 1): _*)) ~
      ("upsert" := upsert)
  }
}

object FindAndModify {
  type RemoveOrUpdate = Either[Boolean, BsonDocument]
}
