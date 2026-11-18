# WattWijk – Gedeelde navigatiebalk

## Overzicht

WattWijk gebruikt één gedeelde JavaFX-navigatiebalk voor alle pagina's. Hierdoor blijft de navigatie overal hetzelfde en wordt de actieve pagina automatisch gemarkeerd.

## Gedeelde bestanden

Maak geen kopieën van de bestaande navbar-bestanden.

| Bestand | Functie |
|---|---|
| `navbar.fxml` | De structuur en navigatieknoppen van de navbar |
| `navbar.css` | De styling van de navbar |
| `NavbarController.java` | Bepaalt welke navigatieknop als actief wordt weergegeven |

## De navbar gebruiken op je eigen pagina

### 1. Haal de nieuwste projectversie op

Zorg ervoor dat je de meest recente versie van het project van GitHub hebt opgehaald voordat je begint.

### 2. Voeg de navbar toe aan je FXML-bestand

Plaats de volgende code binnen de root-layout van je pagina:

```xml
<top>
    <fx:include source="navbar.fxml" fx:id="navbar"/>
</top>
```

Dit voorbeeld gebruikt een `BorderPane`. 

### 3. Maak een controller voor je eigen pagina

Iedere pagina krijgt een eigen controller.

Voorbeeld: `BuurtController.java`

```java
package com.example.thechallenge;

import javafx.fxml.FXML;

public class BuurtController {

    @FXML
    private NavbarController navbarController;

    @FXML
    public void initialize() {
        navbarController.setActivePage("buurt");
    }
}
```

### 4. Koppel je FXML-bestand aan de controller

Voeg het volgende attribuut toe aan het root-element van je FXML-bestand:

```xml
fx:controller="com.example.thechallenge.BuurtController"
```

De controller van de ingesloten navbar wordt automatisch beschikbaar gemaakt via de `fx:id` van de include (`navbar`).

### 5. Stel de actieve pagina in

Gebruik de juiste waarde in `setActivePage()`:

| Pagina | Waarde |
|---|---|
| Verbruik | `"verbruik"` |
| Buurt | `"buurt"` |
| Meldingen | `"meldingen"` |
| Instellingen | `"instellingen"` |

## Belangrijke aandachtspunten

- Maak de navbar niet opnieuw en kopieer deze niet.
- Wijzig de namen van de gedeelde bestanden of de `fx:id`-waarden van de navigatieknoppen niet zonder dit met het team te overleggen.
- Gebruik de package-naam `com.example.thechallenge`.
- De CSS-styling is al gekoppeld via `navbar.fxml`.
- Iedere pagina heeft een eigen controller, maar alle pagina's gebruiken dezelfde `NavbarController`.

## Samenwerken via GitHub

Werk bij voorkeur op je eigen Git-branch en voeg wijzigingen samen via pull requests.

Haal altijd eerst de nieuwste gedeelde wijzigingen op voordat je aan je eigen pagina begint.