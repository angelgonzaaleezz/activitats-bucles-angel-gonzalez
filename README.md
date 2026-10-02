# ACT-BUCLES — Activitats de Programació amb Bucles

Cada activitat és un programa Java amb un `main`. La majoria llegeixen dades del teclat
(amb `Scanner`) i repeteixen una acció amb bucles `for`, `while` o `do-while`. Els fitxers
són a `src/main/java/`.

Algunes activitats **no tenen una sortida fixa** perquè depenen de números generats a
l'atzar amb `Random` (02, 11, 12, 14, 20, 28, 29 i 30). En aquestes, el professor revisarà que la **lògica** sigui
correcta llegint el codi, no que la sortida coincideixi exactament amb cap exemple.

## Com treballar

1. Obre la carpeta a **VS Code** (accepta instal·lar les extensions recomanades).
2. Implementa cada programa.
3. Prova'l:
   - **A VS Code** (més fàcil): prem ▶ *Run* just a sobre del mètode `main` de la classe.
   - **Per consola** (no cal tenir Maven instal·lat, només el JDK):
     - Només la classe que estiguis provant (més ràpid):
       ```
       javac -d target/classes src/main/java/NomClasse.java
       java -cp target/classes NomClasse
       ```
     - Totes les classes de cop:
       ```
       javac -d target/classes src/main/java/*.java
       java -cp target/classes NomClasse
       ```
     (substitueix `NomClasse` pel nom de la classe que vulguis provar).
4. Fes `commit` i `push` quan vulguis desar la teva feina (pots fer-ho tantes vegades
   com vulguis). No hi ha cap correcció automàtica: el professor revisarà el teu codi
   més endavant. Abans d'entregar, comprova tu mateix cada programa (▶ *Run* a VS Code)
   amb diferents valors d'entrada, no només amb l'exemple de l'enunciat.

## Categories

Les activitats es reparteixen en 6 categories, però es numeren seqüencialment des de la
01 (la numeració **no torna a començar** a cada categoria nova).

1. Comptadors
2. Condicions d'acabament simples
3. For
4. Acumuladors
5. Condicions d'acabament complexes
6. Bucles encaixats

## Activitats (10 punts cadascuna · total 380)

### Categoria 1 — Comptadors

| #  | Classe | Puntuació |
|----|--------|-----------|
| 01 | `TemperaturaBucle` | 10 |
| 02 | `NumerosAleatoris` | 10 |
| 03 | `PositiuNegatiuZeroBucle` | 10 |
| 04 | `TemperaturaBucleN` | 10 |
| 05 | `HoresMinutsSegons` | 10 |
| 06 | `NumerosDe1aN` | 10 |
| 07 | `TaulaDel6` | 10 |
| 08 | `TaulaMultiplicar` | 10 |
| 09 | `MajusculaMinuscula` | 10 |
| 10 | `NumerosDeNa1` | 10 |
| 11 | `CaraCreu` | 10 |
| 12 | `ParellsISenarsAleatoris` | 10 |
| 13 | `TaulaMultiplicarErrors` | 10 |

### Categoria 2 — Condicions d'acabament simples

| #  | Classe | Puntuació |
|----|--------|-----------|
| 14 | `GeneraFinsAl12` | 10 |
| 15 | `SequenciaDe3en3` | 10 |
| 16 | `PositiuNegatiuFinsZero` | 10 |
| 17 | `GranIPetit` | 10 |
| 18 | `NombreDeXifres` | 10 |

### Categoria 3 — For

| #  | Classe | Puntuació |
|----|--------|-----------|
| 19 | `TaulaMultiplicarErrorsFor` | 10 |
| 20 | `CaraCreuFor` | 10 |

### Categoria 4 — Acumuladors

| #  | Classe | Puntuació |
|----|--------|-----------|
| 21 | `SumaFinsZero` | 10 |
| 22 | `MitjanaNotes` | 10 |
| 23 | `SumaMesDe21` | 10 |
| 24 | `MultiplicarAmbSumes` | 10 |
| 25 | `MesGranIMesPetit` | 10 |
| 26 | `NotesMitjanaMaxMin` | 10 |

### Categoria 5 — Condicions d'acabament complexes

| #  | Classe | Puntuació |
|----|--------|-----------|
| 27 | `LoginTresIntents` | 10 |
| 28 | `EndevinaNumero10Intents` | 10 |
| 29 | `SetIMig` | 10 |
| 30 | `PedraPaperTisoraA3` | 10 |
| 31 | `TresIgualsSeguits` | 10 |

### Categoria 6 — Bucles encaixats

| #  | Classe | Puntuació |
|----|--------|-----------|
| 32 | `GraellaFiles` | 10 |
| 33 | `TriangleNumeros` | 10 |
| 34 | `TriangleAsteriscs` | 10 |
| 35 | `DiagonalAmbE` | 10 |
| 36 | `TriangleInvertit` | 10 |
| 37 | `TaulaDivisors` | 10 |
| 38 | `GeneradorTaulaHTML` | 10 |

## Enunciats

### Categoria 1 — Comptadors

#### 01 — Temperatures en bucle (`TemperaturaBucle`)
Escriu un programa que demani a l'usuari, per teclat, el valor de 5 temperatures en
graus Fahrenheit (una per una, amb un bucle) i mostri per cadascuna l'equivalent en
graus Celsius:

```java
temperatureC = ((temperatureF - 32) * 5) / 9;
```

```
Introdueix la temperatura en Fahrenheit (1/5):
212
212.0 °F equivalen a 100.0 °C
Introdueix la temperatura en Fahrenheit (2/5):
32
32.0 °F equivalen a 0.0 °C
Introdueix la temperatura en Fahrenheit (3/5):
-40
-40.0 °F equivalen a -40.0 °C
Introdueix la temperatura en Fahrenheit (4/5):
68
68.0 °F equivalen a 20.0 °C
Introdueix la temperatura en Fahrenheit (5/5):
176
176.0 °F equivalen a 80.0 °C
```

#### 02 — Números aleatoris (`NumerosAleatoris`)
Genera 50 números aleatoris entre 1 i 15 (tots dos inclosos) i mostra'ls per pantalla,
un per línia.

> Aquesta activitat fa servir `Random`, no té una sortida fixa per provar.

```
6
14
1
9
...
```
(50 línies en total — sortida diferent cada vegada que s'executa.)

#### 03 — Positiu, negatiu o zero, en bucle (`PositiuNegatiuZeroBucle`)
Entra per teclat 8 números i, per cadascun, mostra si és positiu, negatiu o zero.

```
Entra el número 1: 6
és positiu
Entra el número 2: -5
és negatiu
Entra el número 3: 0
és un zero
Entra el número 4: 4
és positiu
Entra el número 5: 0
és un zero
Entra el número 6: -1
és negatiu
Entra el número 7: 10
és positiu
Entra el número 8: -3
és negatiu
```

#### 04 — Temperatures en bucle, quantitat per teclat (`TemperaturaBucleN`)
Escriu un programa que demani a l'usuari quantes temperatures vol convertir (N) i,
amb un bucle, li demani N temperatures en graus Fahrenheit i mostri per cadascuna
l'equivalent en graus Celsius:

```java
temperatureC = ((temperatureF - 32) * 5) / 9;
```

```
Quantes temperatures vols convertir?
3
Entra la temperatura:
212
212.0 °F equivalen a 100.0 °C
Entra la temperatura:
32
32.0 °F equivalen a 0.0 °C
Entra la temperatura:
68
68.0 °F equivalen a 20.0 °C
```

#### 05 — Hores, minuts i segons, en bucle (`HoresMinutsSegons`)
Repeteix 4 vegades: demana per teclat un número de segons i mostra les hores, els
minuts i els segons restants que representa.

```
Entra els segons:
41668
Hores: 11
Minuts: 34
Segons: 28
Entra els segons:
3661
Hores: 1
Minuts: 1
Segons: 1
Entra els segons:
7325
Hores: 2
Minuts: 2
Segons: 5
Entra els segons:
90000
Hores: 25
Minuts: 0
Segons: 0
```

#### 06 — Números d'1 fins a N (`NumerosDe1aN`)
Entra un número enter per teclat i mostra tots els valors que van d'1 fins al número
entrat, un per línia.

```
Entra un número:
15
1
2
3
4
5
6
7
8
9
10
11
12
13
14
15
```

#### 07 — Taula de multiplicar del 6 (`TaulaDel6`)
Imprimeix la taula de multiplicar del 6, de l'1 al 10, amb el format següent:

```
6 × 1 = 6
6 × 2 = 12
6 × 3 = 18
6 × 4 = 24
6 × 5 = 30
6 × 6 = 36
6 × 7 = 42
6 × 8 = 48
6 × 9 = 54
6 × 10 = 60
```

#### 08 — Taula de multiplicar d'un número, per teclat (`TaulaMultiplicar`)
Imprimeix la taula de multiplicar d'un número introduït per teclat, de l'1 al 10.

```
Entra un número:
7
7 × 1 = 7
7 × 2 = 14
7 × 3 = 21
7 × 4 = 28
7 × 5 = 35
7 × 6 = 42
7 × 7 = 49
7 × 8 = 56
7 × 9 = 63
7 × 10 = 70
```

#### 09 — Majúscula, minúscula o no és una lletra (`MajusculaMinuscula`)
Escriu un programa que demani 10 cops a l'usuari, per teclat, un caràcter, i
determini si el caràcter entrat és una lletra majúscula, una lletra minúscula, o no
és una lletra.

Recorda: els caràcters (`char`) tenen assignat un codi numèric i, per tant, es poden
comparar amb els operadors `<`, `>`, `==`... Per exemple:
```java
char lletra = 'd';
if (lletra > 'a') { ... }
```

```
Entra un caràcter: D
és una lletra majúscula
Entra un caràcter: x
és una lletra minúscula
Entra un caràcter: 5
no és una lletra
Entra un caràcter: ?
no és una lletra
Entra un caràcter: M
és una lletra majúscula
Entra un caràcter: z
és una lletra minúscula
Entra un caràcter: @
no és una lletra
Entra un caràcter: a
és una lletra minúscula
Entra un caràcter: Z
és una lletra majúscula
Entra un caràcter: 1
no és una lletra
```

#### 10 — Números de N fins a 1 (`NumerosDeNa1`)
Entra un número enter per teclat i mostra els valors que van des del número entrat
fins a l'1, un per línia.

```
Entra un número:
15
15
14
13
12
11
10
9
8
7
6
5
4
3
2
1
```

#### 11 — Cara o creu, 100 llançaments (`CaraCreu`)
Simula el llançament d'una moneda 100 vegades (cara = 0, creu = 1) i compta quantes
cares i quantes creus han sortit (n'hi ha prou amb una variable que compti les cares
o les creus i s'incrementi ella mateixa d'un en un).

> Aquesta activitat fa servir `Random`, no té una sortida fixa per provar.

```
Cares: 46
Creus: 54
```
(el total sempre suma 100 — la sortida concreta varia cada execució.)

#### 12 — Parells i senars, aleatoris (`ParellsISenarsAleatoris`)
Genera un número de números aleatoris (entre 1 i 100) segons indiqui l'usuari per
teclat, i compta quants són parells i quants són senars.

> Aquesta activitat fa servir `Random`, no té una sortida fixa per provar.

```
Quants números vols generar?
15
Han sortit 7 números parells i 8 senars
```
(el total de parells + senars sempre suma N — la sortida concreta varia cada execució.)

#### 13 — Taula de multiplicar, amb comptador d'errors (`TaulaMultiplicarErrors`)
Demana la taula de multiplicar (de l'1 al 10) d'un número entrat per teclat: per
cada multiplicació, l'usuari escriu el resultat i el programa diu si és correcte o
incorrecte. Compta els errors comesos.

```
Entra un número:
6
6 × 1 = 6
correcte!
6 × 2 = 10
incorrecte!
6 × 3 = 18
correcte!
6 × 4 = 24
correcte!
6 × 5 = 30
correcte!
6 × 6 = 30
incorrecte!
6 × 7 = 42
correcte!
6 × 8 = 48
correcte!
6 × 9 = 54
correcte!
6 × 10 = 60
correcte!
Has comès 2 errors!
```

### Categoria 2 — Condicions d'acabament simples

#### 14 — Genera fins al 12 (`GeneraFinsAl12`)
Genera un número aleatori entre 0 i 15. Repeteix-ho fins que aquest número sigui el
12: per cada número generat (que no sigui el 12), imprimeix-lo, així com la
distància (en valor absolut) respecte al 12. Quan finalment surti el 12 (sense
imprimir-lo), el programa acaba mostrant quantes iteracions s'han necessitat per
assolir l'objectiu.

> Aquesta activitat fa servir `Random`, no té una sortida fixa per provar.

```
El número generat és: 5, falten 7 per assolir l'objectiu.
El número generat és: 4, falten 8 per assolir l'objectiu.
El número generat és: 4, falten 8 per assolir l'objectiu.
El número generat és: 7, falten 5 per assolir l'objectiu.
El número generat és: 8, falten 4 per assolir l'objectiu.
Objectiu assolit en: 6 iteracions
```
(sortida diferent cada vegada que s'executa; el nombre de línies sempre és
`iteracions - 1`, ja que el 12 que tanca el bucle no s'imprimeix.)

#### 15 — Seqüència de 3 en 3, amb final per teclat (`SequenciaDe3en3`)
Mostra per pantalla la seqüència 2, 5, 8, 11, 14, 17, 20... (de 3 en 3), fins a un
final que marca l'usuari per teclat (sense superar-lo).

```
Quin ha de ser el final de la seqüència?
30
2, 5, 8, 11, 14, 17, 20, 23, 26, 29
```

#### 16 — Positiu o negatiu, fins al 0 (`PositiuNegatiuFinsZero`)
Entra per teclat una seqüència de números acabada en 0 i, per cadascun (excepte el
0 final), mostra si és positiu o negatiu. Quan s'entri el 0, acomiada't de
l'usuari.

```
Introdueix un número: 11
És positiu
Introdueix un número: -2
És negatiu
Introdueix un número: 7
És positiu
Introdueix un número: 0
Adeu!
```

#### 17 — Gran i petit, apropant-se (`GranIPetit`)
Entra per teclat dos números: un de gran (`gran`) i un de petit (`petit`). Amb un
bucle `while`, mentre `gran` sigui més gran que `petit`, imprimeix els dos valors;
a cada iteració, divideix `gran` entre 2 i multiplica `petit` per 2.

```
Entra el número gran:
2345
Entra el número petit:
2
Gran = 2345   Petit = 2
Gran = 1172   Petit = 4
Gran = 586   Petit = 8
Gran = 293   Petit = 16
Gran = 146   Petit = 32
Gran = 73   Petit = 64
```

#### 18 — Nombre de xifres (`NombreDeXifres`)
Entra un número enter positiu i mostra quantes xifres té. Per saber-ho, dividim el
número successivament entre 10 (prenent la part sencera) i repetim el procés fins
obtenir un quocient 0; el nombre de divisions fetes és el nombre de xifres.

Per exemple, amb `1234`:
```
1234/10 = 123
123/10 = 12
12/10 = 1
1/10 = 0
```
S'han fet 4 divisions fins obtenir un quocient 0, per tant el número té 4 xifres.

```
Entra un número enter positiu:
1234
El número 1234 té 4 xifres.
```

### Categoria 3 — For

#### 19 — Taula de multiplicar amb comptador d'errors, amb for (`TaulaMultiplicarErrorsFor`)
Igual que l'activitat 13 (demanar la taula de multiplicar d'un número entrat per
teclat i comptar els errors), però implementat fent servir un bucle `for`.

```
Entra un número:
6
6 × 1 = 6
correcte!
6 × 2 = 10
incorrecte!
6 × 3 = 18
correcte!
6 × 4 = 24
correcte!
6 × 5 = 30
correcte!
6 × 6 = 30
incorrecte!
6 × 7 = 42
correcte!
6 × 8 = 48
correcte!
6 × 9 = 54
correcte!
6 × 10 = 60
correcte!
Has comès 2 errors!
```

#### 20 — Cara o creu, 100 llançaments, amb for (`CaraCreuFor`)
Igual que l'activitat 11 (simula 100 llançaments d'una moneda i compta cares i
creus), però implementat fent servir un bucle `for`.

> Aquesta activitat fa servir `Random`, no té una sortida fixa per provar.

```
Cares: 53
Creus: 47
```
(el total sempre suma 100 — la sortida concreta varia cada execució.)

### Categoria 4 — Acumuladors

#### 21 — Suma acumulada, fins al 0 (`SumaFinsZero`)
Entra per teclat una seqüència de números acabada en 0 i vés-los sumant. Per cada
número (que no sigui el 0), mostra la suma acumulada fins ara. Quan s'entri el 0,
mostra la suma total.

```
Introdueix un número: 5
La suma fins ara és 5
Introdueix un número: 2
La suma fins ara és 7
Introdueix un número: 3
La suma fins ara és 10
Introdueix un número: 0
La suma total dels números introduïts és: 10
```

#### 22 — Mitjana de notes (`MitjanaNotes`)
Demana per teclat el número d'alumnes del grup i, per a cadascun, la seva nota.
Acumula les notes en una variable `suma` i, en acabar, calcula i mostra la mitjana
(la suma dividida entre el nombre d'alumnes).

```
Quants alumnes hi ha al grup?
4
Entra la nota de l'alumne 1:
5
Entra la nota de l'alumne 2:
7
Entra la nota de l'alumne 3:
8
Entra la nota de l'alumne 4:
6
La mitjana de les notes és: 6.5
```

#### 23 — Suma fins a més de 21 (`SumaMesDe21`)
L'usuari ha d'introduir enters positius entre 1 i 5. El programa avisa quan la suma
dels números introduïts passi de 21, mostrant la suma i el missatge "més de 21".
Si el número introduït no està entre 1 i 5, no se suma i es mostra "El número no
és correcte!".

```
Entra número: 3
Entra número: 5
Entra número: 2
Entra número: 8
El número no és correcte!
Entra número: 5
Entra número: 4
Entra número: 3
Més de 21! La suma dels números entrats és 22
```

#### 24 — Multiplicar amb sumes successives (`MultiplicarAmbSumes`)
Multiplica dos números enters positius entrats per teclat mitjançant sumes
successives (sumant el primer operand tantes vegades com indiqui el segon).

```
Operand 1:
5
Operand 2:
4
5 + 5 + 5 + 5 = 20
```

#### 25 — Més gran i més petit (`MesGranIMesPetit`)
Entra per teclat 20 números i troba'n el valor més gran i el més petit, comparant
cada número llegit amb els valors trobats fins ara.

```
Introdueix un número:
5
Introdueix un número:
2
Introdueix un número:
3
...
El número més gran és: 15 i el més petit: 2
```

#### 26 — Mitjana, nota més gran i nota més petita (`NotesMitjanaMaxMin`)
Demana per teclat el número d'alumnes del grup i, per a cadascun, la seva nota.
Calcula i mostra la mitjana de les notes, la nota més gran i la nota més petita
(combinant l'acumulador de la suma amb la comparació de màxim i mínim).

```
Quants alumnes hi ha al grup?
4
Entra la nota de l'alumne 1:
5
Entra la nota de l'alumne 2:
7
Entra la nota de l'alumne 3:
8
Entra la nota de l'alumne 4:
6
La mitjana de les notes és: 6.5
La nota més gran és: 8.0
La nota més petita és: 5.0
```

### Categoria 5 — Condicions d'acabament complexes

#### 27 — Login amb 3 intents (`LoginTresIntents`)
En dues variables del programa es guarden el `username` i el `password` d'un
usuari (`cponts` / `qw34T1234`). Simula una aplicació que demani per teclat el nom
d'usuari i la contrasenya, i digui si són correctes. El programa permet 3 intents;
si no s'encerta en cap, mostra "Usuari bloquejat!".

⛔ No es pot fer servir `break` (ni similar), ni alterar el comptador d'intents per
forçar la sortida del bucle: la condició de sortida del `while` ha de combinar
"encara queden intents" **i** "encara no s'ha encertat".

```
Introdueix el nom d'usuari:
aaa
Introdueix la contrasenya:
bbb
Usuari o contrasenya incorrectes.
Introdueix el nom d'usuari:
cponts
Introdueix la contrasenya:
qw34T1234
Usuari i contrasenya correctes!
```

Si s'esgoten els 3 intents sense encertar:
```
Introdueix el nom d'usuari:
aaa
Introdueix la contrasenya:
bbb
Usuari o contrasenya incorrectes.
Introdueix el nom d'usuari:
ccc
Introdueix la contrasenya:
ddd
Usuari o contrasenya incorrectes.
Introdueix el nom d'usuari:
eee
Introdueix la contrasenya:
fff
Usuari o contrasenya incorrectes.
Usuari bloquejat!
```

#### 28 — Endevina el número, 10 intents (`EndevinaNumero10Intents`)
Genera un número entre 1 i 100 i intenta endevinar-lo, amb un màxim de 10
oportunitats. Cada vegada que entris un número, el programa et dirà si el número
generat és més gran o més petit que el que has pensat (o si l'has encertat).

⛔ Com a l'activitat 27, la condició de sortida del `while` ha de combinar "encara
queden intents" **i** "encara no s'ha encertat" (sense `break`).

> Aquesta activitat fa servir `Random`, no té una sortida fixa per provar.

```
Endevina un número que he generat comprès entre 1 i 100
Entra un número (intent 1): 10
El número que he generat és més gran que el que has pensat
Entra un número (intent 2): 65
El número que he generat és més petit que el que has pensat
Entra un número (intent 3): 15
L'has encertat!!
```
(sortida diferent cada vegada que s'executa; si s'esgoten els 10 intents sense
encertar, el programa informa'n l'usuari.)

#### 29 — El set i mig (`SetIMig`)
El set i mig és un joc de cartes de la baralla espanyola: es tracta d'acostar-se al
7 i 1/2 sense sobrepassar-lo. Les cartes de l'1 al 7 valen el seu número; la sota,
el cavall i el rei valen 1/2 punt.

El jugador fa una aposta i, a cada torn, l'ordinador li dona una carta aleatòria
(un número de l'1 al 10: el 8 és la sota, el 9 el cavall i el 10 el rei). Mentre no
se superi el 7 i 1/2, el jugador pot triar si es planta o vol una altra carta.

⛔ Com a les activitats 27 i 28, la condició de sortida del `while` ha de combinar
"encara no s'ha superat el 7 i 1/2" **i** "el jugador encara vol seguir" (sense
`break`).

Al final del joc, es mostra un d'aquests missatges:
- Si se supera el 7 i 1/2: `Has Perdut!!!!`
- Si s'arriba exactament a 7 i 1/2: `Has Guanyat <el doble de l'aposta> euros.`
- Si el jugador es planta abans: `El jugador es planta!!!`

> Aquesta activitat fa servir `Random`, no té una sortida fixa per provar.

```
Quant vols apostar?
10
Has tret un 4 (val 4.0 punts). Portes 4.0 punts.
Vols una altra carta? (s/n)
s
Has tret un rei (val 0.5 punts). Portes 4.5 punts.
Vols una altra carta? (s/n)
s
Has tret un 4 (val 4.0 punts). Portes 8.5 punts.
Has Perdut!!!!
```
(sortida diferent cada vegada que s'executa, ja que les cartes són aleatòries.)

#### 30 — Pedra, paper o tisora, a 3 victòries (`PedraPaperTisoraA3`)
Implementa el joc de pedra, paper o tisora contra l'ordinador (que genera la seva
jugada a l'atzar: 0=pedra, 1=paper, 2=tisora). Es repeteix el joc fins que un dels
dos jugadors aconsegueixi 3 victòries.

⛔ Com a les activitats 27, 28 i 29, la condició de sortida del `while` ha de
combinar "l'ordinador encara no té 3 victòries" **i** "l'usuari encara no té 3
victòries" (sense `break`).

> Aquesta activitat fa servir `Random`, no té una sortida fixa per provar.

```
Entra pedra, paper o tisora:
pedra
Ordinador ha tret: pedra
Heu empatat!! Ordinador: 0 , tú: 0
Entra pedra, paper o tisora:
pedra
Ordinador ha tret: paper
Has perdut! Ordinador: 1 , tú: 0
...
```
(sortida diferent cada vegada que s'executa; el joc acaba quan l'ordinador o
l'usuari arriben a 3 victòries.)

#### 31 — 3 números iguals seguits (`TresIgualsSeguits`)
Llegeix una seqüència de números enters. El programa para de demanar números quan
el mateix número s'ha introduït 3 vegades consecutives.

```
Entra un número:
2
Entra un número:
2
Entra un número:
1
Entra un número:
5
Entra un número:
1
Entra un número:
1
Entra un número:
4
Entra un número:
4
Entra un número:
4
Has entrat 3 cops seguits el número 4. Adeu!
```

### Categoria 6 — Bucles encaixats

#### 32 — Graella de files (`GraellaFiles`)
Mostra per pantalla la figura següent, fent servir dos bucles `for` encaixats (un
extern per a les 8 files i un d'intern per a les 9 columnes):

```
1 2 3 4 5 6 7 8 9
1 2 3 4 5 6 7 8 9
1 2 3 4 5 6 7 8 9
1 2 3 4 5 6 7 8 9
1 2 3 4 5 6 7 8 9
1 2 3 4 5 6 7 8 9
1 2 3 4 5 6 7 8 9
1 2 3 4 5 6 7 8 9
```

#### 33 — Triangle de números (`TriangleNumeros`)
Implementa un programa que mostri per pantalla, amb dos bucles `for` encaixats, el
triangle de números següent:

```
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
1 2 3 4 5 6
1 2 3 4 5 6 7
1 2 3 4 5 6 7 8
1 2 3 4 5 6 7 8 9
```

#### 34 — Triangle d'asteriscs (`TriangleAsteriscs`)
Mostra per pantalla el triangle d'asteriscs següent (igual que l'activitat 33, però
amb asteriscs en lloc de números):

```
*
* *
* * *
* * * *
* * * * *
* * * * * *
* * * * * * *
* * * * * * * *
* * * * * * * * *
```

#### 35 — Diagonal amb E (`DiagonalAmbE`)
Mostra per pantalla una graella de 9×9 amb dos bucles `for` encaixats: totes les
posicions han de tenir un asterisc, excepte la diagonal (on `fila` és igual a
`columna`), que ha de mostrar una `E`.

```
E * * * * * * * *
* E * * * * * * *
* * E * * * * * *
* * * E * * * * *
* * * * E * * * *
* * * * * E * * *
* * * * * * E * *
* * * * * * * E *
* * * * * * * * E
```

#### 36 — Triangle invertit d'asteriscs (`TriangleInvertit`)
Mostra per pantalla el triangle invertit d'asteriscs següent, amb dos bucles `for`
encaixats (la primera fila amb 9 asteriscs, i cada fila següent amb un asterisc
menys):

```
* * * * * * * * *
* * * * * * * *
* * * * * * *
* * * * * *
* * * * *
* * * *
* * *
* *
*
```

#### 37 — Taula de divisors i dividends (`TaulaDivisors`)
Genera una taula amb, verticalment, els divisors de l'1 al 10, i horitzontalment,
els dividends (un rang de números que entres per teclat, per exemple del 50 al
60). Omple les caselles d'intersecció amb un asterisc (`*`) si el dividend és
divisible pel divisor, o amb un guió (`-`) si no ho és.

> Nota: a la imatge original de l'enunciat, les caselles no divisibles apareixen
> en blanc en lloc d'un guió — sembla que es va perdre en copiar la taula com a
> text. He seguit l'enunciat escrit, que demana explícitament el guió.

```
Entra l'inici dels dividends:
50
Entra el final dels dividends:
60
     50  51  52  53  54  55  56  57  58  59  60
  1   *   *   *   *   *   *   *   *   *   *   *
  2   *   -   *   -   *   -   *   -   *   -   *
  3   -   *   -   -   *   -   -   *   -   -   *
  4   -   -   *   -   -   -   *   -   -   -   *
  5   *   -   -   -   -   *   -   -   -   -   *
  6   -   -   -   -   *   -   -   -   -   -   *
  7   -   -   -   -   -   -   *   -   -   -   -
  8   -   -   -   -   -   -   *   -   -   -   -
  9   -   -   -   -   *   -   -   -   -   -   -
 10   *   -   -   -   -   -   -   -   -   -   *
```

#### 38 — Generador de taula HTML (`GeneradorTaulaHTML`)
Demana a l'usuari el número de files i de columnes i genera, amb dos bucles `for`
encaixats, el codi HTML d'una taula on cada cel·la mostri "fila,columna". El
resultat es mostra per consola.

```
Entra el número de files:
4
Entra el número de columnes:
5
<table border='1'>
    <tr>
        <td>1,1</td>
        <td>1,2</td>
        <td>1,3</td>
        <td>1,4</td>
        <td>1,5</td>
    </tr>
    <tr>
        <td>2,1</td>
        <td>2,2</td>
        <td>2,3</td>
        <td>2,4</td>
        <td>2,5</td>
    </tr>
    <tr>
        <td>3,1</td>
        <td>3,2</td>
        <td>3,3</td>
        <td>3,4</td>
        <td>3,5</td>
    </tr>
    <tr>
        <td>4,1</td>
        <td>4,2</td>
        <td>4,3</td>
        <td>4,4</td>
        <td>4,5</td>
    </tr>
</table>
```
