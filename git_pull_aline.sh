#!/bin/bash

# Entra na branch do charles
git checkout master;

# Atualiza ela
git pull charles master;

# Entra na branch da aline
git checkout master_aline;

# Faz o merge com a do charles
git merge master;
