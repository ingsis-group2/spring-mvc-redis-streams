package spring.mvc.redis.events

data class LintResult(
    val snippetId: Long,
    val reportList: List<String>,
    val errorList: List<String>,
)