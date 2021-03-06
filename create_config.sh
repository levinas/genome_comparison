#!/bin/bash
if (( $# != 2 ))
then
    echo "Usage: create_config <service_dir> <threadpool_size>"
    exit
fi
if [ ! -d $1/blast ]
then
cp -r ./blast $1
fi
mkdir $1/temp
if [ ! -f $1/deploy.cfg ]
then
cat > $1/deploy.cfg <<EOF
[genome_comparison]
thread.count=$2
temp.dir=/scratch/genome_comparison
blast.dir=$1/blast/linux
ws.url=https://kbase.us/services/ws/
ujs.url=https://kbase.us/services/userandjobstate/
EOF
fi
