package spring.mvc.redis.events

data class FormatResult(
    val snippetId: Long,
    val userId: String,
    val formattedSnippet: String,
)