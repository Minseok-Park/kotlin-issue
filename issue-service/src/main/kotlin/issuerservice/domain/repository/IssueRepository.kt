package issuerservice.domain.repository

import issuerservice.domain.Issue
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface IssueRepository: JpaRepository<Issue, Long> {
}