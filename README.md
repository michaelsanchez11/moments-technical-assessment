# Moments Technologies Inc. Android Engineer Code Check Assignment


## Summary

This project is the base project for assignments that Moments Technologies Inc. (hereinafter referred to as "our company") gives to those who wish to become Android engineers at our company. If you are given this assignment, please read the following outline in detail before working on the assignment.

## App Specification

This app searches GitHub repositories.

<img src="docs/app.gif" width="320">

### Environment

- IDE：Android Studio Flamingo | 2022.2.1 Patch 2
- Kotlin：1.6.21
- Java：17
- Gradle：8.0
- minSdk：23
- targetSdk：31

※ Use of libraries must be open source.
※ Please update the environment accordingly.

### Operation

1. Enter some keywords
2. Search repositories with GitHub API (`search/repositories`) and display a list of results with a summary (repository name)
3. Selecting a particular result will display details of the repository (repository name, owner icon, project language, number of stars, number of watchers, number of forks, number of issues).

## How to address the assignment

Please check Issues and [**Duplicate**](https://help.github.com/en/github/creating-cloning-and-archiving-repositories/duplicating-a-repository) this project.(Please do not Fork. (You can make it a private repository if you want.) All future commits should be made in your own repository.

All code-checking issues have an Assignment [`Assignment`](https://github.com/7days/android-engineer-codecheck/milestone/1).
The issues are labeled Beginner, Intermediate, and Bonus according to difficulty.
This time, issues with the [`required`](https://github.com/7days/android-engineer-codecheck/issues?q=is%3Aopen+is%3Aissue+label%3Arequired+milestone%3AAssignment) label are required. Also, issues without that label are not required for this time.

We will provide GitHub Actions to copy the issue to your own repository.  
Please use this [Workflow](./.github/workflows/copy-issues.yml), which can be copied by [triggering it manually](https://docs.github.com/en/actions/using-workflows/manually-running-a-workflow).

When you have completed the assignment, please let us know the address of the repository.

