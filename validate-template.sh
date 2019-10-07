#!/usr/bin/env bash

template_path="sample-vpc-cfn.yaml"
#template_path=$1

aws cloudformation validate-template --template-body file://${template_path}