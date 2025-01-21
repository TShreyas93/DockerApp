![image](https://github.com/user-attachments/assets/1c638164-9d0d-4575-be88-6b1bb3171fce)


About this Project:
1. It uses Github action which calls docker file to build docker image using the java code given and also uses the SSL certificates.
2. A Github action workflow that renews the self signed certificate to be used to enable the HTTPS connections.
3. The image is pushed to dockerhub to repository tshrey/shreyaswebsite. { docker pull tshrey/shreyaswebsite:latest }
4. The workflow then connects to EC2 instance and pulls this image and runs as the docker container that exposes the port 8080 which can be accessed externally by passing https://EC2-Public-DND:8080.
5. If the certificate needs renewal then first run "Generate Keystore JKS" Github action workflow and next "Build and Deploy" workflow.

Pending Actions:

1. Learn how to avoid hardcoding the certificate password in the code and instead use encrypted or other secure methods.

Topics Leant by doing this project:
1. How to create a Dockerfile.
2. How to pass certificates inside a docker image.
3. How to grant permissions to hithub action bot account to push code to repository.
4. How to package a docker container and use dockerhub.
