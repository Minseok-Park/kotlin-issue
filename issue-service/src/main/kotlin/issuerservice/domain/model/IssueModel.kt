package issuerservice.domain.model

import com.fasterxml.jackson.annotation.JsonFormat
import issuerservice.domain.Issue
import issuerservice.domain.enums.IssuePriority
import issuerservice.domain.enums.IssueStatus
import issuerservice.domain.enums.IssueType
import java.time.LocalDateTime

data class IssueRequest(
    val summary: String,
    val description: String,
    val type: IssueType,
    val priority: IssuePriority,
    val status: IssueStatus
)

data class IssueResponse(
    val id: Long,
    val summary: String,
    val description: String,
    val type: IssueType,
    val priority: IssuePriority,
    val status: IssueStatus,
    val userId: Long,
    @JsonFormat(pattern = "YYYY-MM-DD HH:mm:ss")
    val createdAt: LocalDateTime?,
    @JsonFormat(pattern = "YYYY-MM-DD HH:mm:ss")
    val updatedAt: LocalDateTime?
) {
    companion object {
        operator fun invoke(issue: Issue) =
            with(issue) {
                IssueResponse(
                    id = id!!,
                    summary = summary,
                    description = description,
                    userId = userId,
                    type = type,
                    priority = priority,
                    status = issueStatus,
                    createdAt = createdAt,
                    updatedAt = updatedAt
                )
            }
    }
}