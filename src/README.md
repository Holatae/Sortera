# Documentation of code
## Svenska
Denna kod innehåller 2 olika sorteringsmetoder, *Bubble Sort* samt *Bogo Sort*.
Du kan hitta algoritmen i filen `src/SortingAlgorithm.java` där finns funktionerna `BubbleSort` och `BogoSort`.

### Bubble Sort
Bubble Sort fungerar genom att gå igenom en lista 2 tal i taget för att kolla vilket som är större.
Om den anser att de 2 talen är på fel plats i Arrayen så blir en flagga till true.
Om flaggan är true så ska kör den om sorteringen igen tills att ingen tal har bytt plats.
När det är klart så vet programmet att listan är sorterad.

### Bogo Sort
Bogo Sort är en mycket enklare och dummare sorterings algoritm. Det går ut genom att Generera en lista
och sedan kolla om alla talen är i rätt ordning. Om det är så att talen inte är i rätt ordning så ska den göra om processen.
Den kör denna process tills den generar en lista av nummer som är i rätt ordning.

## Gränssnittet
Gränssnittet är inte så komplicerat. Jag skapade det eftersom jag ville kunna ändra alla siffror
ganska snabbt. Detta eftersom jag vill kunna köra programmet snabbt och testa det
