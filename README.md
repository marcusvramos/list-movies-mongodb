# 🎬 Movie Manager

This project is a RESTful API built with Spring Boot to manage a movie database in MongoDB. The API provides an endpoint that allows searching for movies based on a keyword, returning movies that match the search term in the title, cast, or synopsis. This project was developed for educational purposes and to practice backend development and integration with NoSQL databases.

## 📁 Project Structure

- **Controllers**: Contains the `MovieController`, which defines the API endpoints.
- **Entities**: Contains the `Movie` data model, representing the structure of movies in MongoDB.
- **Repositories**: Contains the `MovieRepository`, which defines the search operations in MongoDB.
- **Services**: Contains the `MovieService`, which implements the business logic for searching movies by keyword.

## ✨ Features

- 🔍 **Search Movies**: The API allows searching for movies based on a keyword, returning those that contain the keyword in the title, cast, or synopsis.
- 📜 **Movie Listing**: Returns basic details of the movie, including title, year, cast, genres, and a brief synopsis.

## ⚙️ Prerequisites

- ☕ **Java 11+**: Make sure you have JDK 11 or higher installed.
- 🍃 **MongoDB**: A local or remote MongoDB server, configured and populated with movie data.
- 🌐 **Postman**: To test the API endpoints, you can use Postman or another HTTP client tool.

## 🛠 Project Setup

1. Clone the repository to your local machine:
```bash
git clone git@github.com:marcusvramos/list-movies-mongodb.git
```


2. Configure MongoDB:
- Ensure MongoDB is running on `localhost:27017` or configure the correct MongoDB URI in the `application.properties` file.

3. Import the movie data into MongoDB using the `movies2020.json` file:
```bash
mongoimport --uri="mongodb://localhost:27017/moviesdb" --collection=movies --file=/path/to/movies2020.json --jsonArray
```

4. Compile and run the project:


## 🚀 API Endpoints

- **GET /api/movies/search?keyword={keyword}**: Searches for movies by the provided keyword, returning those that match in the title, cast, or synopsis.

## 💻 Example Usage with Postman

1. Open Postman.
2. Make a GET request to:
```bash
http://localhost:8080/api/movies/search?keyword=Adventure
```

3. View the JSON response with the list of movies matching the search term.

## 🗂 Project Structure

The directory structure is organized as follows:

- **src/main/java/org/example/movie_manager**
  - **Controllers**
    - MovieController.java
  - **Entities**
    - Movie.java
  - **Repositories**
    - MovieRepository.java
  - **Services**
    - MovieService.java
  - MovieManagerApplication.java
