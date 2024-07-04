package spring.mvc.redis.events

data class LintRequest(
    val snippetId: Long,
    val snippetContent: String,
    val lintRules: Map<String, Any>,
)