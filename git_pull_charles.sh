#!/bin/bash

# Entra na branch do charles
git checkout master_aline;

# Atualiza ela
git pull;

# Entra na branch da aline
git checkout master;

# Faz o merge com a do charles
git merge master_aline;