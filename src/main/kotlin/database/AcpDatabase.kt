package database

import com.intellij.openapi.components.Service
import com.intellij.openapi.project.Project
import com.intellij.util.containers.OrderedSet
import dev.pushpavel.autocp.database.Problem


@Service
class AcpDatabase(project: Project) : AbstractAcpDatabase(project) {

    override fun associateSolutionToProblem(solutionPath: String, problem: Problem) = runCatching {
        relateQ.associateSolutionToProblem(
            solutionPath,
            problem.name,
            problem.groupName
        )
    }

    override fun updateProblemState(problem: Problem, selectedIndex: Long): Result<Unit> = runCatching {
        problemQ.updateProblemState(selectedIndex, problem.name, problem.groupName)
    }

    override fun updateTestcases(problem: Problem, testcases: OrderedSet<database.models.Testcase>) = runCatching {
        problemQ.updateTestcases(testcases, problem.name, problem.groupName)
    }

    override fun insertProblems(problems: List<Problem>) = runCatching {
        db.transaction {
            for (problem in problems)
                problemQ.insertProblem(problem)
        }
    }

    override fun getProblem(solutionPath: String) = runCatching {
        val relation = relateQ.getProblemSolution(solutionPath).executeAsOne()
        problemQ.getProblem(relation.problemName, relation.problemGroup).executeAsOne()
    }
}