package issuerservice.domain

import issuerservice.domain.enums.IssuePriority
import issuerservice.domain.enums.IssueStatus
import issuerservice.domain.enums.IssueType
import jakarta.persistence.*

@Entity
@Table
class Issue(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,

    @Column(nullable = false)
    val userId: Long,

    @Column
    val summary: String,

    @Column
    val description: String,

    @Column
    @Enumerated(EnumType.STRING)
    val type: IssueType,

    @Column
    @Enumerated(EnumType.STRING)
    val priority: IssuePriority,

    @Column
    @Enumerated(EnumType.STRING)
    val issueStatus: IssueStatus
): BaseEntity()