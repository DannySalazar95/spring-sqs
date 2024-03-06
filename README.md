# Spring Boot 3 with SQS

### Steps

1. Crear archivo environment.yml
2. Crear queue SQS en AWS con nombre *reviewTravelRequest*
2. Agregar credenciales AWS en el archivo environment.yml
3. Agregar Policy a credenciales AWS
   - Cambiar ARN_SQS
    ```
   {
    "Version": "2012-10-17",
    "Statement": [
        {
            "Sid": "VisualEditor0",
            "Effect": "Allow",
            "Action": [
                "sqs:DeleteMessage",
                "sqs:ReceiveMessage",
                "sqs:SendMessage",
                "sqs:createqueue"
            ],
            "Resource": "[ARN_SQS]"
          }
      ]
     }
   ```

