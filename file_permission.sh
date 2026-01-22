#!/bin/bash
file_path=$1

if [ ! -e "$file_path" ]; then
  echo "File does not exist"
  exit 1
fi

echo "$file_path passwords are enabled."

if [ -w "$file_path" ]; then
  echo "You have permissions to edit $file_path"
else
  echo "You do NOT have permissions to edit $file_path"
fi
