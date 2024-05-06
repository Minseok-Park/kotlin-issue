package issuerservice.domain.service

import issuerservice.domain.Issue
import issuerservice.domain.model.IssueRequest
import issuerservice.domain.model.IssueResponse
import issuerservice.domain.repository.IssueRepository
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class IssueService(
    private val issueRepository: IssueRepository
) {

    @Transactional
    fun create(userId: Long, request: IssueRequest): IssueResponse {
        val issue = Issue(
            summary = request.summary,
            description = request.description,
            userId = userId,
            type = request.type,
            priority = request.priority,
            issueStatus = request.status
        )

//        issueRepository.save(issue)
        return IssueResponse(issue)
    }
}