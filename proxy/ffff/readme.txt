1. WSZYSTKIE PLIKI MUSZĄ BYĆ SKOMPILOWANE (javac MyRemote.java)
2. otwórz terminal#1 w folderze ze skompilowanymi plikami:
	rmic MyRemoteServer
	rmiregistry
3. otwórz terminal#2 w folderze ze skompilowanymi plikami:
	java MyRemoteServer
4. otwórz terminal#3 w folderze ze skompilowanymi plikami:
	java MyRemoteClient


KOMENDA DO ZWOLNIENIA PORTU 1099
lsof -P | grep ':1099' | awk '{print $2}' | xargs kill -9   


