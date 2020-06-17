package com.company.cubaforcepovidevelop.web.screens.entitydeprueba;

import com.haulmont.cuba.gui.screen.*;
import com.company.cubaforcepovidevelop.entity.EntityDePrueba;

@UiController("cubaforcepovidevelop_EntityDePrueba.browse")
@UiDescriptor("entity-de-prueba-browse.xml")
@LookupComponent("entityDePruebasTable")
@LoadDataBeforeShow
public class EntityDePruebaBrowse extends StandardLookup<EntityDePrueba> {
}