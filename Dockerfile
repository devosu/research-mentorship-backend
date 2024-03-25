# Path: <rootDir>/Dockerfile
#
# Muti-stage build instructions for Java SpringBoot backend.

# Stage 1. Create user and group, test and build the application.
FROM bellsoft/liberica-runtime-container:jdk-17-glibc as build
WORKDIR /app

USER root
RUN set -e; addgroup --system spring; \
  adduser --system spring --ingroup spring
RUN chown spring:spring /app
USER spring

COPY mvnw .
COPY --chown=spring:spring .mvn .mvn
COPY --chown=spring:spring pom.xml .
COPY --chown=spring:spring src src

RUN ./mvnw package -DskipTests
RUN  set -e; mkdir -p target/dependency; \
  cd target/dependency; jar -xf ../*.jar

# Stage 2. Create a minimal image and run the application.
FROM bellsoft/liberica-runtime-container:jre-17-slim-glibc as run
VOLUME /tmp
ARG DEP=/app/target/dependency
COPY --chown=spring:spring --from=build ${DEP}/BOOT-INF/lib /app/lib
COPY --chown=spring:spring --from=build ${DEP}/META-INF /app/META-INF
COPY --chown=spring:spring --from=build ${DEP}/BOOT-INF/classes /app

ARG PORT=8080
EXPOSE $PORT
ENTRYPOINT [ \
  "java", "-cp", "app:app/lib/*", \
  "com.dev.peerMentorResearch.PeerMentorApplication" \
  ]
