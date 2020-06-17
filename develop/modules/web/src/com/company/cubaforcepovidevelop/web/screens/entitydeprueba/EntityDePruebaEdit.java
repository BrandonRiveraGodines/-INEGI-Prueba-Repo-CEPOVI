package com.company.cubaforcepovidevelop.web.screens.entitydeprueba;

import com.haulmont.cuba.gui.screen.*;
import com.company.cubaforcepovidevelop.entity.EntityDePrueba;

@UiController("cubaforcepovidevelop_EntityDePrueba.edit")
@UiDescriptor("entity-de-prueba-edit.xml")
@EditedEntityContainer("entityDePruebaDc")
@LoadDataBeforeShow
public class EntityDePruebaEdit extends StandardEditor<EntityDePrueba> {
}