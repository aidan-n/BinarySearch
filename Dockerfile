# Build Stage
FROM openjdk:17-alpine AS build
WORKDIR /app
COPY . .
RUN javac BinarySearch.java

# Runtime Stage
FROM openjdk:17-alpine
WORKDIR /app
COPY --from=build /app/BinarySearch.class .
CMD ["java", "BinarySearch"]