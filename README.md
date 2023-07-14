# Iotechnet - IoT Microservice Platform

Welcome to the readme file for Iotechnet, an IoT microservice platform. This document provides an overview of the platform, installation instructions, usage guidelines, and other important information to help you get started.

## Table of Contents

1. [Introduction](#introduction)
2. [Features](#features)
3. [Installation](#installation)
4. [Usage](#usage)
5. [API Documentation](#api-documentation)
6. [Configuration](#configuration)
7. [Contributing](#contributing)
8. [License](#license)

## Introduction

Iotechnet is a powerful microservice platform designed specifically for Internet of Things (IoT) applications. It provides a scalable and flexible infrastructure for managing and interacting with IoT devices, collecting and analyzing data, and integrating with other systems. With Iotechnet, you can build robust and reliable IoT solutions with ease.

## Features

- **Device Management**: Iotechnet offers comprehensive device management capabilities, allowing you to easily register, track, and control your IoT devices. You can manage device metadata, configure device settings, and monitor device status.

- **Data Ingestion**: The platform enables seamless data ingestion from a wide range of IoT devices. It supports various protocols such as MQTT, CoAP, and HTTP, allowing you to collect sensor data, events, and other types of telemetry.

- **Real-time Data Processing**: Iotechnet provides powerful data processing capabilities to handle real-time data streams. You can define rules and triggers to perform actions based on incoming data, such as data validation, filtering, aggregation, and transformation.

- **Data Storage**: The platform offers reliable and scalable data storage options for your IoT data. You can choose between time-series databases, relational databases, or cloud storage solutions, depending on your specific requirements.

- **Device Communication**: Iotechnet facilitates bidirectional communication between your applications and IoT devices. You can send commands and configurations to devices, as well as receive telemetry and control data from them.

- **Security**: Security is a top priority in IoT applications. Iotechnet provides robust security features such as authentication, authorization, and encryption to protect your data and devices from unauthorized access.

- **Integration**: The platform supports seamless integration with other systems and services. You can easily connect Iotechnet with cloud platforms, analytics tools, business applications, and more to create end-to-end IoT solutions.

## Installation

To install Iotechnet, follow these steps:

1. Download the latest release of Iotechnet from the official website or GitHub repository.

2. Extract the downloaded package to a directory of your choice.

3. Install the required dependencies. Refer to the documentation for specific instructions based on your operating system and environment.

4. Configure the platform by editing the configuration files. See the next section for more details on configuration options.

5. Start the Iotechnet server by running the appropriate command for your environment. The server will start listening for incoming connections.

6. Access the Iotechnet web interface or API endpoints to start managing your devices, processing data, and integrating with other systems.

For detailed installation instructions and troubleshooting tips, please refer to the installation guide provided in the documentation.

## Usage

Once Iotechnet is installed and running, you can start using the platform to build your IoT applications. Here are some common tasks and workflows:

1. **Device Registration**: Register your IoT devices with Iotechnet by providing device metadata and credentials. This will enable the platform to communicate with your devices securely.

2. **Data Ingestion**: Configure data ingestion pipelines to collect data from your devices. Define the protocols, topics, and data formats to be used for data ingestion. Verify that data is being received and stored correctly.

3. **Real-time Data Processing**: Set up rules and triggers to process incoming data in real-time. Define actions to be taken based on specific conditions or events. For example, you can trigger an alert when a temperature sensor exceeds a certain threshold.

4. **Data Storage and Analytics**: Choose the appropriate storage solution for your IoT data. Configure data retention policies and access controls. Use analytics tools to gain insights from your data and generate meaningful visualizations.

5. **Device Communication**: Communicate with your devices by sending commands and configurations. Monitor device status and receive telemetry data. Implement bidirectional communication channels to enable remote control and monitoring.

6. **Integration**: Integrate Iotechnet with other systems and services as needed. Connect with cloud platforms, data analytics tools, business applications, or any other components in your IoT ecosystem. Leverage APIs and webhooks to exchange data and trigger actions.

Please refer to the official documentation for detailed usage instructions, tutorials, and examples.

## API Documentation

For developers who wish to interact with Iotechnet programmatically, a comprehensive API documentation is available. The documentation outlines the available endpoints, request/response formats, authentication methods, and example use cases. You can use the API documentation to integrate Iotechnet with your own applications or to automate various tasks.

## Configuration

Iotechnet provides various configuration options to customize the platform according to your needs. The configuration files are typically located in the installation directory and allow you to modify settings related to network connectivity, security, data storage, and more. Make sure to review the documentation for detailed information on each configuration option and its impact.

## Contributing

We welcome contributions from the community to help improve Iotechnet. If you encounter bugs, have feature requests, or want to contribute code enhancements, please follow the guidelines outlined in the contribution guide. Your contributions will be greatly appreciated!

## License

Iotechnet is released under the [MIT License](https://opensource.org/licenses/MIT). You are free to use, modify, and distribute the platform in accordance with the terms of the license. Please review the license file for more details.

---

Thank you for choosing Iotechnet! If you have any questions or need further assistance, please refer to the official documentation or reach out to our support team. Happy IoT development!

# Iotechnet

This application was generated using JHipster 8.0.0-beta.2, you can find documentation and help at [https://www.jhipster.tech/documentation-archive/v8.0.0-beta.2](https://www.jhipster.tech/documentation-archive/v8.0.0-beta.2).

This is a "microservice" application intended to be part of a microservice architecture, please refer to the [Doing microservices with JHipster][] page of the documentation for more information.
This application is configured for Service Discovery and Configuration with the JHipster-Registry. On launch, it will refuse to start if it is not able to connect to the JHipster-Registry at [http://localhost:8761](http://localhost:8761). For more information, read our documentation on [Service Discovery and Configuration with the JHipster-Registry][].

## Project Structure

Node is required for generation and recommended for development. `package.json` is always generated for a better development experience with prettier, commit hooks, scripts and so on.

In the project root, JHipster generates configuration files for tools like git, prettier, eslint, husky, and others that are well known and you can find references in the web.

`/src/*` structure follows default Java structure.

- `.yo-rc.json` - Yeoman configuration file
  JHipster configuration is stored in this file at `generator-jhipster` key. You may find `generator-jhipster-*` for specific blueprints configuration.
- `.yo-resolve` (optional) - Yeoman conflict resolver
  Allows to use a specific action when conflicts are found skipping prompts for files that matches a pattern. Each line should match `[pattern] [action]` with pattern been a [Minimatch](https://github.com/isaacs/minimatch#minimatch) pattern and action been one of skip (default if ommited) or force. Lines starting with `#` are considered comments and are ignored.
- `.jhipster/*.json` - JHipster entity configuration files

- `npmw` - wrapper to use locally installed npm.
  JHipster installs Node and npm locally using the build tool by default. This wrapper makes sure npm is installed locally and uses it avoiding some differences different versions can cause. By using `./npmw` instead of the traditional `npm` you can configure a Node-less environment to develop or test your application.
- `/src/main/docker` - Docker configurations for the application and services that the application depends on

## Development

Before you can build this project, you must install and configure the following dependencies on your machine:

1. [Node.js][]: We use Node to run a development web server and build the project.
   Depending on your system, you can install Node either from source or as a pre-packaged bundle.

After installing Node, you should be able to run the following command to install development tools.
You will only need to run this command when dependencies change in [package.json](package.json).

```
npm install
```

We use npm scripts and [Angular CLI][] with [Webpack][] as our build system.

If you are using hazelcast as a cache, you will have to launch a cache server.
To start your cache server, run:

```
docker compose -f src/main/docker/hazelcast-management-center.yml up -d
```

Run the following commands in two separate terminals to create a blissful development experience where your browser
auto-refreshes when files change on your hard drive.

```
./mvnw
npm start
```

Npm is also used to manage CSS and JavaScript dependencies used in this application. You can upgrade dependencies by
specifying a newer version in [package.json](package.json). You can also run `npm update` and `npm install` to manage dependencies.
Add the `help` flag on any command to see how you can use it. For example, `npm help update`.

The `npm run` command will list all of the scripts available to run for this project.

### PWA Support

JHipster ships with PWA (Progressive Web App) support, and it's turned off by default. One of the main components of a PWA is a service worker.

The service worker initialization code is disabled by default. To enable it, uncomment the following code in `src/main/webapp/app/app.module.ts`:

```typescript
ServiceWorkerModule.register('ngsw-worker.js', { enabled: false }),
```

### Managing dependencies

For example, to add [Leaflet][] library as a runtime dependency of your application, you would run following command:

```
npm install --save --save-exact leaflet
```

To benefit from TypeScript type definitions from [DefinitelyTyped][] repository in development, you would run following command:

```
npm install --save-dev --save-exact @types/leaflet
```

Then you would import the JS and CSS files specified in library's installation instructions so that [Webpack][] knows about them:
Edit [src/main/webapp/app/app.module.ts](src/main/webapp/app/app.module.ts) file:

```
import 'leaflet/dist/leaflet.js';
```

Edit [src/main/webapp/content/scss/vendor.scss](src/main/webapp/content/scss/vendor.scss) file:

```
@import 'leaflet/dist/leaflet.css';
```

Note: There are still a few other things remaining to do for Leaflet that we won't detail here.

For further instructions on how to develop with JHipster, have a look at [Using JHipster in development][].

### Developing Microfrontend

Microservices doesn't contain every required backend feature to allow microfrontends to run alone.
You must start a pre-built gateway version or from source.

Start gateway from source:

```
cd gateway
npm run docker:db:up # start database if necessary
npm run docker:others:up # start service discovery and authentication service if necessary
npm run app:start # alias for ./(mvnw|gradlew)
```

Microfrontend's `build-watch` script is configured to watch and compile microfrontend's sources and synchronizes with gateway's frontend.
Start it using:

```
cd microfrontend
npm run docker:db:up # start database if necessary
npm run build-watch
```

It's possible to run microfrontend's frontend standalone using:

```
cd microfrontend
npm run docker:db:up # start database if necessary
npm watch # alias for `npm start` and `npm run backend:start` in parallel
```

### Using Angular CLI

You can also use [Angular CLI][] to generate some custom client code.

For example, the following command:

```
ng generate component my-component
```

will generate few files:

```
create src/main/webapp/app/my-component/my-component.component.html
create src/main/webapp/app/my-component/my-component.component.ts
update src/main/webapp/app/app.module.ts
```

### JHipster Control Center

JHipster Control Center can help you manage and control your application(s). You can start a local control center server (accessible on http://localhost:7419) with:

```
docker compose -f src/main/docker/jhipster-control-center.yml up
```

### Doing API-First development using openapi-generator-cli

[OpenAPI-Generator]() is configured for this application. You can generate API code from the `src/main/resources/swagger/api.yml` definition file by running:

```bash
./mvnw generate-sources
```

Then implements the generated delegate classes with `@Service` classes.

To edit the `api.yml` definition file, you can use a tool such as [Swagger-Editor](). Start a local instance of the swagger-editor using docker by running: `docker compose -f src/main/docker/swagger-editor.yml up -d`. The editor will then be reachable at [http://localhost:7742](http://localhost:7742).

Refer to [Doing API-First development][] for more details.

## Building for production

### Packaging as jar

To build the final jar and optimize the Iotechnet application for production, run:

```
./mvnw -Pprod clean verify
```

This will concatenate and minify the client CSS and JavaScript files. It will also modify `index.html` so it references these new files.
To ensure everything worked, run:

```
java -jar target/*.jar
```

Then navigate to [http://localhost:8081](http://localhost:8081) in your browser.

Refer to [Using JHipster in production][] for more details.

### Packaging as war

To package your application as a war in order to deploy it to an application server, run:

```
./mvnw -Pprod,war clean verify
```

## Testing

To launch your application's tests, run:

```
./mvnw verify
```

### Client tests

Unit tests are run by [Jest][]. They're located in [src/test/javascript/](src/test/javascript/) and can be run with:

```
npm test
```

### Other tests

Performance tests are run by [Gatling][] and written in Scala. They're located in [src/test/java/gatling/simulations](src/test/java/gatling/simulations).

You can execute all Gatling tests with

```
./mvnw gatling:test
```

For more information, refer to the [Running tests page][].

### Code quality

Sonar is used to analyse code quality. You can start a local Sonar server (accessible on http://localhost:9001) with:

```
docker compose -f src/main/docker/sonar.yml up -d
```

Note: we have turned off forced authentication redirect for UI in [src/main/docker/sonar.yml](src/main/docker/sonar.yml) for out of the box experience while trying out SonarQube, for real use cases turn it back on.

You can run a Sonar analysis with using the [sonar-scanner](https://docs.sonarqube.org/display/SCAN/Analyzing+with+SonarQube+Scanner) or by using the maven plugin.

Then, run a Sonar analysis:

```
./mvnw -Pprod clean verify sonar:sonar -Dsonar.login=admin -Dsonar.password=admin
```

If you need to re-run the Sonar phase, please be sure to specify at least the `initialize` phase since Sonar properties are loaded from the sonar-project.properties file.

```
./mvnw initialize sonar:sonar -Dsonar.login=admin -Dsonar.password=admin
```

Additionally, Instead of passing `sonar.password` and `sonar.login` as CLI arguments, these parameters can be configured from [sonar-project.properties](sonar-project.properties) as shown below:

```
sonar.login=admin
sonar.password=admin
```

For more information, refer to the [Code quality page][].

## Using Docker to simplify development (optional)

You can use Docker to improve your JHipster development experience. A number of docker-compose configuration are available in the [src/main/docker](src/main/docker) folder to launch required third party services.

For example, to start a postgresql database in a docker container, run:

```
docker compose -f src/main/docker/postgresql.yml up -d
```

To stop it and remove the container, run:

```
docker compose -f src/main/docker/postgresql.yml down
```

You can also fully dockerize your application and all the services that it depends on.
To achieve this, first build a docker image of your app by running:

```
npm run java:docker
```

Or build a arm64 docker image when using an arm64 processor os like MacOS with M1 processor family running:

```
npm run java:docker:arm64
```

Then run:

```
docker compose -f src/main/docker/app.yml up -d
```

When running Docker Desktop on MacOS Big Sur or later, consider enabling experimental `Use the new Virtualization framework` for better processing performance ([disk access performance is worse](https://github.com/docker/roadmap/issues/7)).

For more information refer to [Using Docker and Docker-Compose][], this page also contains information on the docker-compose sub-generator (`jhipster docker-compose`), which is able to generate docker configurations for one or several JHipster applications.

## Continuous Integration (optional)

To configure CI for your project, run the ci-cd sub-generator (`jhipster ci-cd`), this will let you generate configuration files for a number of Continuous Integration systems. Consult the [Setting up Continuous Integration][] page for more information.

[JHipster Homepage and latest documentation]: https://www.jhipster.tech
[JHipster 8.0.0-beta.2 archive]: https://www.jhipster.tech/documentation-archive/v8.0.0-beta.2
[Doing microservices with JHipster]: https://www.jhipster.tech/documentation-archive/v8.0.0-beta.2/microservices-architecture/
[Using JHipster in development]: https://www.jhipster.tech/documentation-archive/v8.0.0-beta.2/development/
[Service Discovery and Configuration with the JHipster-Registry]: https://www.jhipster.tech/documentation-archive/v8.0.0-beta.2/microservices-architecture/#jhipster-registry
[Using Docker and Docker-Compose]: https://www.jhipster.tech/documentation-archive/v8.0.0-beta.2/docker-compose
[Using JHipster in production]: https://www.jhipster.tech/documentation-archive/v8.0.0-beta.2/production/
[Running tests page]: https://www.jhipster.tech/documentation-archive/v8.0.0-beta.2/running-tests/
[Code quality page]: https://www.jhipster.tech/documentation-archive/v8.0.0-beta.2/code-quality/
[Setting up Continuous Integration]: https://www.jhipster.tech/documentation-archive/v8.0.0-beta.2/setting-up-ci/
[Node.js]: https://nodejs.org/
[NPM]: https://www.npmjs.com/
[Webpack]: https://webpack.github.io/
[BrowserSync]: https://www.browsersync.io/
[Jest]: https://facebook.github.io/jest/
[Leaflet]: https://leafletjs.com/
[DefinitelyTyped]: https://definitelytyped.org/
[Angular CLI]: https://cli.angular.io/
[Gatling]: https://gatling.io/
[OpenAPI-Generator]: https://openapi-generator.tech
[Swagger-Editor]: https://editor.swagger.io
[Doing API-First development]: https://www.jhipster.tech/documentation-archive/v8.0.0-beta.2/doing-api-first-development/
