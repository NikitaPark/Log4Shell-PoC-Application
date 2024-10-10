# ☕ Log4Shell PoC Application
Spring framework based web application for proof of concept for log4shell vulnerabilities

## Install & Launch
> [!Important]
> JDK 1.8(8u131 in development) is required to launch this project

Use the provided `Dockerfile` to build and run the Docker image for poc application.
```shell
docker build --tag log4shell-poc-application .
docker run -d -p 8080:8000 --name Log4shell-PoC-Application log4shell-poc-application
```

## Proof of Concept 
To test for vulnerabilities in this application, you must send a GET request by inserting the payload into the `X-Api-Key header` in the `/vuln` path.
![poc-screenshot](./screenshot/poc.png)