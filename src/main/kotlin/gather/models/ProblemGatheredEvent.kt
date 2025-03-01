package gather.models

import com.github.pushpavel.autocp.database.Problem

/**
 * Data class containing status information while gathering problems
 */
data class ProblemGatheredEvent(
    val problem: Problem,
    val gathered: Int,
    val total: Int,
)