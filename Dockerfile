FROM quay.io/fedora/fedora:38

RUN dnf install -y liburing-devel zip unzip git \
    && dnf group install -y "C Development Tools and Libraries"

RUN curl -s "https://get.sdkman.io" | bash
RUN bash -c "source $HOME/.sdkman/bin/sdkman-init.sh && sdk install java 19-open"

ENV JAVA_HOME=/root/.sdkman/candidates/java/current