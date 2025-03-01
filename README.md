<!--suppress HtmlDeprecatedAttribute -->
<div  align="center">

![plugin Icon](src/main/resources/META-INF/pluginIcon.svg)

# AutoCp

_Automates Competitive Programming Stuff, so you can focus on solving the problem and improving your skills_

![Build](https://github.com/Pushpavel/autoCP/workflows/Build/badge.svg)
[![Version](https://img.shields.io/jetbrains/plugin/v/17061.svg)](https://plugins.jetbrains.com/plugin/17061-autocp)
[![Downloads](https://img.shields.io/jetbrains/plugin/d/17061.svg)](https://plugins.jetbrains.com/plugin/17061-autocp)

</div>

> [Competitive Companion](https://github.com/jmerle/competitive-companion) browser extension is required to parse the problems

<!-- Plugin description -->

Generate and judge your solution files in Programming Contests 😀. [See Docs](https://github.com/Pushpavel/AutoCp)

- Go to <kbd>tools</kbd> > <kbd>Gather Problems</kbd> to generate solution files
  using [Competitive Companion](https://github.com/jmerle/competitive-companion).
- Open <kbd>View</kbd> > <kbd>Tool Windows</kbd> > <kbd>AutoCp</kbd> to edit testcases.

### Features

- Create solution Files using [Competitive Companion](https://github.com/jmerle/competitive-companion)
- Build and run any programming language by customizing the build command in <kbd>Settings/Preferences</kbd>
- Test your solutions against sample testcases, or your own testcases
- Test results are presented in Test Runner UI built in the IDE.

<!-- Plugin description end -->

### Installation

- Using IDE built-in plugin system:

  <kbd>Settings/Preferences</kbd> > <kbd>Plugins</kbd> > <kbd>Marketplace</kbd> > <kbd>Search for "AutoCp"</kbd> >
  <kbd>Install Plugin</kbd>

- Manually:

  Download the [latest release](https://github.com/Pushpavel/autoCP/releases/latest) and install it manually using
  <kbd>Settings/Preferences</kbd> > <kbd>Plugins</kbd> > <kbd>⚙️</kbd> > <kbd>Install plugin from disk...</kbd>

### Quick Start

- Create solution files by <kbd>Tools</kbd> > <kbd>Gather Problems</kbd> and parsing the problem or contest
  using [Competitive Companion](https://github.com/jmerle/competitive-companion)
- Program your solution 😎
- Right-click your solution and run it
- Open <kbd>View</kbd> > <kbd>Tool Windows</kbd> > <kbd>AutoCp</kbd> to view and edit your testcases
- Customize Build commands or add new Programming Languages through <kbd>Settings / Preferences</kbd> > <kbd>AutoCp</kbd>

### Screenshot

![CLION Screenshot](Screenshot.png)

### Why is there a ```.autocp``` file at the root of my project ?

This file stores the problems and testcases you gathered using <kbd>Gather Problems</kbd> Action. It is very crucial to
this plugin and should not be touched.

### File Structure

<kbd>Gather Problems</kbd> Action generates solution files inside a folder named by
the [group](https://github.com/jmerle/competitive-companion#explanation) that the problem belows to.
> Moving or renaming files will unlink the solution file to its problem

### Limitations

- Memory Limit is ignored.
- Strict File Structure
- No Debugging through AutoCp

### Help? 😀

- If you've noticed a bug or have a feature request,
  consider [opening a new issue](https://github.com/Pushpavel/AutoCp/issues/new).
- Use [discussions](https://github.com/Pushpavel/AutoCp/discussions) for questions.

### Contributing

See something that's wrong or unclear?, Pull requests are welcome 😀

Read the [contributing guide](CONTRIBUTING.md) to learn how you can take part in improving ```AutoCp```

### License

The scripts and documentation in this project are released under the [Apache License 2.0](LICENSE.md)

---
Plugin based on the [IntelliJ Platform Plugin Template][template].

[template]: https://github.com/JetBrains/intellij-platform-plugin-template
