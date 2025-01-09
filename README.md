# Software Design - Group assignment

## Project Members

- Niilo Hautamäki
- Joni Hämäläinen
- Max Jauhiainen
- Tenho Laakkio

## My responsibilities

- Backend:
  - Handling of Nominatim API
  - Creation of Place-objects
  - Managing & caching of coordinates and sending them to frontend
- Frontend:
  - Filter by school type
  - Functionality for favourite marking and storing favourites as cookies
  - Search bar for schools
  - Miscellaneous improvements for the UI and user experience

## Progress

- Final submission finished as of 1.12.2024
- Mid-term submission finished as of 27.10.2024
- Prototype finished as of 29.9.2024


## Overview

This program visualizes data for the Finnish universities and universities

## Prerequisites

- **Java JDK 17+**
- **Maven 3.6.0+**
- **Node.js 14.x+ (includes npm)**
- **Git**

# Windows installation:

## Frontend installation:
- Navigate to frontend folder
- Use the command ```npm install``` in the terminal
## Backend installation:
- Please use a programming environment that has Maven support to get all the dependancies.<br />
  This program was created with IntelliJ so that is our recommendation.
- You may need to call ```mvn clean package``` from the terminal. <br />

# Linux/Remote Desktop installation
- Navigate to frontend folder
- Update npm node with ```npm install node```
- Use the command npm install in the terminal
- Install the correct version of Leaflet with ```npm install -i leaflet```

Backend installation is identical

# How to use?

## Frontend usage:
- Use the command ```npm run dev``` to start the frontend
- Frontend is avaible on the http://localhost:5173/

## Backend usage:
- Run ```./mvnw spring-boot:run``` from the terminal on the project root folder
- The backend will be available to access from [localhost:8080](http://localhost:8080/)
    -  Please note that the homepage does not have all the API endpoints, some of them need parameters so they are not listed.

# Instructions for use

To start using this software, start the software from IDE and go to
http://localhost:5173/ in your browser. Now you should see our landing
page. From the landing page you can choose to explore either high schools 
or universities/colleges. After choosing either option a map view opens
up.
Note: Unfortunately many school names and field names are in finnish, because
we used finnish sources to get the data. Translating everything would have 
been very time-consuming.

## Things you can do in map view
  - You can see where schools (high schools or universities) are located in
    Finland. (Loading school locations takes quite a long time without the
    cache, complete coordinate cache is provided in Git)
  - You can see more information related to chosen school by clicking its name 
    after clicking the corresponding marker on the map.
  - You can add a school to your favourites after clicking its marker and 
    clicking the empty star besides the name of the school. Your favourite 
    schools show up besides the map, and you can open the chosen school's side
    panel by clicking the name of the school in favourites list. There can be
    max. 5 schools added as favourite for both high schools and universities/
    colleges. You can remove a school from your favourites by clicking the star
    icon again.
  - You can search schools by using the search bar. Side panel opens up for the chosen
    school by clicking its name from the search results.
  - For universities/colleges you can see list of fields of chosen school in the
    side panel.
  - In side panel, you can see graphs representing either matriculation exam grade stats for
    chosen school and year (high schools), or required points to get in from the last 5 (or 
    less depending on provided data) years to the chosen field (universities/colleges).

## Exclusive features for universities/colleges
  - You can filter schools by type using checkbox filters under the search bar. In this
    case, colleges mean basically universities of applied sciences.
  - You can also filter schools by choosing a field from "Select field" select component.
    This filters away all the schools that do not have the chosen field. After selecting
    a field and opening a school side panel, only the school's field that match the selected
    field, show up.
  - You can also filter fields using the Grade Filter. In Grade Filter, you insert your own
    matriculation examination results or hypothetical results. After submitting the grades, 
    you can see the points you would have to apply for either universities of applied sciences
    or a university program of the chosen field. Switching field can therefore change the points.
  - In the side panel, you can search fields that the chosen school has using the search bar.


