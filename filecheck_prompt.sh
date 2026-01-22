#!/bin/bash
read -p "Enter name: " name

if [ -f "$name" ]; then
  echo "Regular file"
elif [ -d "$name" ]; then
  echo "Directory"
else
  echo "Other type"
fi
