## Blueberry Environment
## Introduction

A local environment deployed by docker compose or setting up on physical machine, which contains:
- PostgreSQL 10.6, with plugin TimescaleDB@1.2.1
- Pulsar 2.4.0

## Usage
Firstly, make sure you have installed Docker and keep it running.

> If not, see the details to install Docker. [Install Docker](https://docs.docker.com/install/)

Use the commands below to deploy a local environment:

```shell
# Enter the deployment directory.
cd blueberry-env;

# Run the scripts to build docker images
chmod +x build.sh && ./build.sh

# Deploy images
docker-compose up
```