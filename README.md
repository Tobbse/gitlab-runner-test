# Gitlab Runner Test

This repo was created to familiarize myself with the gitlab CI and gitlab-runner. Imported to GitHub just for completeness.

It uses a docker-based gitlab-runner to run a very basic java ant build that creates some testing file.
gitlab-runner variables are used to store an SSH key that allows the runner to push that file to the repo again.

Since I was lazy and didn't setup a fitting docker image, git has to be installed freshly every time.
