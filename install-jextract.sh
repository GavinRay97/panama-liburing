#! /usr/bin/env bash

set -eoux pipefail

curl -L --output jextract.tar.gz https://download.java.net/java/early_access/jextract/2/openjdk-19-jextract+2-3_linux-x64_bin.tar.gz
tar -xzf jextract.tar.gz
mv jextract-19 $HOME/jextract
# Add jextract to PATH
echo "export PATH=$HOME/jextract/bin:$PATH" >> $HOME/.bashrc
