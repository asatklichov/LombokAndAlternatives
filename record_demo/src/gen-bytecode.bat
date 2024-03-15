javac AdamRec.java
echo "Generating bytecode with javap"
javap -v -p AdamRec.class
javap -v -p AdamRec.class > rec-bytecode.txt