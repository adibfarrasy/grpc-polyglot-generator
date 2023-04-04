# grpc-payloads

## Requirements
1. Install 'protoc'
'sudo apt install protobuf-compiler'
2. Install protoc-gen-go' and 'protoc-gen-go-grpc' protoc plugins.
'''
go install google.golang.org/protobuf/cmd/protoc-gen-go@latest
go install google.golang.org/grpc/cmd/protoc-gen-go-grpc@latest
'''

## Notes
- To clone this repository with the submodules in it, run 'git submodule init' after cloning it.

## Generate Language-specific Protobufs and gRPC Methods
_Note: refer to protos/hello for example._
1. Create a subdirectory in the protos/ directory.
2. Create .proto files in the protos/ subdirectory
3. Specify the target package for each language on the proto files (Kotlin uses java_package option).
4. (not in this repository) Create a git repository to store the compiled protocol buffers. The repository name suffix must be the same as the target package name specified on the proto files, e.g. the generated code for directory `protos/test-app` should be called `X-test-app`. Use the `grpc-go-template` and `grpc-kotlin-template` to initialize your module repositories.
6. Add the created repository as a git submodule in the correct directory (divided by target language), e.g. for Go, the submodules should be put at generated/go directory. Hence do:
```shell
cd generated/go
git submodule add GIT_URL
```
7. Run `generate-payloads.sh SUBDIRECTORY_NAME` in the root directory of this project. example: `generate-payloads.sh test-app`
8. cd to the submodule/s and commit the changes.
9. Go to the root directory of this project and run `git push --recurse-submodules=on-demand`

## Usage
### Go
- If you use SSH, add this line to your `$HOME/.gitconfig`
```shell
[url "ssh://git@github.com/"]
        insteadOf = https://github.com/
```
- Add this setting to enable downloading the generated gRPC repository that is also a private repository
```shell
go env -w GOPRIVATE="github.com/YOUR_PRIVATE_REPO_NAME*"
```
- Import the module to your project
```shell
go get github.com/Agriaku/{YOUR_GRPC_REPO_NAME}
```
### Kotlin
- Publish the generated code to your own library repository (the author recommends using Nexus Repository Manager)
- Import the module as a Gradle dependency to your project
```
implementation("me.adibfarrasy:{YOUR_GRPC_REPO_NAME}:0.0.1-SNAPSHOT")
```
