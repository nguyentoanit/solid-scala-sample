trait Post {
  def createPost(db: Database, postMessage: String) {
    db.add(postMessage)
  }
}

class TagPost extends Post {
  override def createPost(db: Database, postMessage: String) {
    db.addAsTag(postMessage)
  }
}

class MentionPost extends Post {
  override def createPost(db: Database, postMessage: String) {
    db.addAsMention(db, postMessage)
  }
}

class PostHandler {
  private val database = new Database();

  def handleNewPosts() {
    val newPosts: List[String] = database.getUnhandledPostsMessages();

    newPosts.foreach(postMessage => {
        val post = if (postMessage.head == '#') new TagPost()
        else if (postMessage.head == '@') new MentionPost()
        else new Post();

        post.createPost(database, postMessage);
      }
    })  
    }
}