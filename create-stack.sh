#!/usr/bin/env bash

stack_name="sample-cloudformation-elasticache-1"
template_path="sample-elasticache-cfn.yml"
#stack_name="sample-cloudformation-dynamodb-1"
#template_path="sample-dynamodb-cfn.yml"
#stack_name="sample-cloudformation-rds-1"
#template_path="sample-rds-cfn.yml"
#stack_name="sample-cloudformation-ecs-service-1"
#template_path="sample-ecs-service-cfn.yml"
#stack_name="sample-cloudformation-ecs-task-1"
#template_path="sample-ecs-task-cfn.yml"
#stack_name="sample-cloudformation-ecs-cluster-1"
#template_path="sample-ecs-cluster-cfn.yml"
#stack_name="sample-cloudformation-alb-1"
#template_path="sample-alb-cfn.yml"
#stack_name="sample-cloudformation-sg-1"
#template_path="sample-sg-cfn.yml"
#stack_name="sample-cloudformation-ngw-1"
#template_path="sample-ngw-cfn.yml"
#stack_name="sample-cloudformation-vpc-1"
#template_path="sample-vpc-cfn.yaml"
#stack_name=$1
#template_path=$2
if [ "$stack_name" == "" -a "$template_path" == "" ]; then
    echo "$0 stack-name template-path"
    exit 1
fi

aws cloudformation create-stack --stack-name ${stack_name} --template-body file://${template_path} --capabilities CAPABILITY_IAM
