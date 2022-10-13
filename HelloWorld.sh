#!/usr/bin/env bash
# This is a practice script for the Husky Coding Project's Git
# and Command Line workshop. 

NAME="HELLO WORLD" # Change This Variable to Your Name

validate_name() {
    if [ "$NAME" = "HELLO WORLD" ]; then
        echo "You Haven't Changed the NAME Variable on Line 5. Please Change it!"
    else
        echo "Good Job! You set your name to $NAME"
    fi
}

echo $(validate_name)