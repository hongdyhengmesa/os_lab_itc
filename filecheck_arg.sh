#!/bin/bash
name=$1

if [ -z "$name" ]; then
  echo "Usage: ./filecheck_arg.sh name"
  exit 1
fi

if [ -f "$name" ]; then
  echo "Regular file"
elif [ -d "$name" ]; then
  echo "Directory"
else
  echo "Other type"
fi
