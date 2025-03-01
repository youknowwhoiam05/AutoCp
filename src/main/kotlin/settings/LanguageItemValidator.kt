package settings

import com.intellij.ui.CollectionListModel

/**
 * Validation logic for UI TextFields in [LanguageItemPanel]
 */
class LanguageItemValidator(val listModel: CollectionListModel<SolutionLanguage>) : LanguageItemModel.Validator {

    override fun validateName(name: String): String? {
        return if (listModel.items.count { it.name == name } == 1) null else "Language Name already exists"
    }

    override fun validateExtension(extension: String): String? {
        return if (extension.isNotEmpty()) null else "Extension should not empty"
    }

    override fun validateBuildCommand(buildCommand: String): String? {
        val input = buildCommand.contains(AutoCpSettings.INPUT_PATH_KEY)
        val output = buildCommand.contains(AutoCpSettings.OUTPUT_PATH_KEY)
        // TODO: check if single quotes are useful so that we can just hardcode double quotes directly on the path
        val inputDoubleQuotes = buildCommand.contains("\"" + AutoCpSettings.INPUT_PATH_KEY + "\"")
        val inputSingleQuotes = buildCommand.contains("'" + AutoCpSettings.INPUT_PATH_KEY + "'")
        val outputDoubleQuotes = buildCommand.contains("\"" + AutoCpSettings.OUTPUT_PATH_KEY + "\"")
        val outputSingleQuotes = buildCommand.contains("'" + AutoCpSettings.OUTPUT_PATH_KEY + "'")

        return if (!input)
            "buildCommand: ${AutoCpSettings.INPUT_PATH_KEY} missing"
        else if (!output)
            "buildCommand: ${AutoCpSettings.OUTPUT_PATH_KEY} missing"
        else if (!inputSingleQuotes && !inputDoubleQuotes)
            "buildCommand: ${AutoCpSettings.INPUT_PATH_KEY} should be wrapped with single or double quotes"
        else if (!outputSingleQuotes && !outputDoubleQuotes)
            "buildCommand: ${AutoCpSettings.INPUT_PATH_KEY} should be wrapped with single or double quotes"
        else
            null
    }
}