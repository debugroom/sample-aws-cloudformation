#!/usr/bin/env bash

#stack_name="sample-cloudformation-ecs-service-1"
#stack_name="sample-cloudformation-ecs-task-1"
#stack_name="sample-cloudformation-ecs-cluster-1"
#stack_name="sample-cloudformation-ngw-1"
#stack_name="sample-cloudformation-alb-1"
#stack_name="sample-cloudformation-sg-1"
stack_name="sample-cloudformation-vpc-1"

aws cloudformation delete-stack --stack-name ${stack_name}
