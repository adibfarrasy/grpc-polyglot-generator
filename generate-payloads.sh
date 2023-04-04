#!/usr/bin/env sh

SUBDIR=$1
echo "Generating code files from protos/$SUBDIR..."

echo "Generate Go gRPC..."
# protoc --proto_path=protos/$SUBDIR/ \
#     --go_out=generated --go-grpc_out=generated \
#     protos/$SUBDIR/*

echo "Generate Java gRPC (required for Kotlin gRPC)..."
protoc --proto_path=protos/$SUBDIR/ \
    --plugin=protoc-gen-grpc-java=protoc-gen-grpc-java-1.52.1-linux-x86_64.exe \
    --java_out=generated/kotlin/grpc-kotlin-$SUBDIR/src/main/java \
    --grpc-java_out=generated/kotlin/grpc-kotlin-$SUBDIR/src/main/java \
    protos/$SUBDIR/*

echo "Generate Kotlin gRPC..."
protoc --proto_path=protos/$SUBDIR/ \
    --plugin=protoc-gen-grpckt=protoc-gen-grpc-kotlin.sh \
    --kotlin_out=generated/kotlin/grpc-kotlin-$SUBDIR/src/main/kotlin \
    --grpckt_out=generated/kotlin/grpc-kotlin-$SUBDIR/src/main/kotlin \
    protos/$SUBDIR/*
