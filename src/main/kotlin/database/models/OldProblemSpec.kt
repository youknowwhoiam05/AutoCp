package database.models

@Deprecated("new Types generated by sqldelight not used")
data class OldProblemSpec(
    val info: ProblemInfo,
    val state: ProblemState,
    val testcases: List<TestcaseSpec>
)