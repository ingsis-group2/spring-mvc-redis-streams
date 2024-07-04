package spring.mvc.redis.events

data class FormaterRequest(
    val snippetId: Long,
    val writerId: String,
    val snippetContent: String,
    val formatterRules: Map<String, Any>,
)