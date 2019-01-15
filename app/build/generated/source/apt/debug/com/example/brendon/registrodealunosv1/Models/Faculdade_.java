
package com.example.brendon.registrodealunosv1.Models;

import com.example.brendon.registrodealunosv1.Models.FaculdadeCursor.Factory;
import io.objectbox.EntityInfo;
import io.objectbox.annotation.apihint.Internal;
import io.objectbox.internal.CursorFactory;
import io.objectbox.internal.IdGetter;


// THIS CODE IS GENERATED BY ObjectBox, DO NOT EDIT.

/**
 * Properties for entity "Faculdade". Can be used for QueryBuilder and for referencing DB names.
 */
public final class Faculdade_ implements EntityInfo<Faculdade> {

    // Leading underscores for static constants to avoid naming conflicts with property names

    public static final String __ENTITY_NAME = "Faculdade";

    public static final int __ENTITY_ID = 1;

    public static final Class<Faculdade> __ENTITY_CLASS = Faculdade.class;

    public static final String __DB_NAME = "Faculdade";

    public static final CursorFactory<Faculdade> __CURSOR_FACTORY = new Factory();

    @Internal
    static final FaculdadeIdGetter __ID_GETTER = new FaculdadeIdGetter();

    public final static Faculdade_ __INSTANCE = new Faculdade_();

    public final static io.objectbox.Property<Faculdade> id =
        new io.objectbox.Property<>(__INSTANCE, 0, 1, long.class, "id", true, "id");

    public final static io.objectbox.Property<Faculdade> nome =
        new io.objectbox.Property<>(__INSTANCE, 1, 2, String.class, "nome");

    public final static io.objectbox.Property<Faculdade> email =
        new io.objectbox.Property<>(__INSTANCE, 2, 3, String.class, "email");

    public final static io.objectbox.Property<Faculdade> contatoPrincipal =
        new io.objectbox.Property<>(__INSTANCE, 3, 4, String.class, "contatoPrincipal");

    @SuppressWarnings("unchecked")
    public final static io.objectbox.Property<Faculdade>[] __ALL_PROPERTIES = new io.objectbox.Property[]{
        id,
        nome,
        email,
        contatoPrincipal
    };

    public final static io.objectbox.Property<Faculdade> __ID_PROPERTY = id;

    @Override
    public String getEntityName() {
        return __ENTITY_NAME;
    }

    @Override
    public int getEntityId() {
        return __ENTITY_ID;
    }

    @Override
    public Class<Faculdade> getEntityClass() {
        return __ENTITY_CLASS;
    }

    @Override
    public String getDbName() {
        return __DB_NAME;
    }

    @Override
    public io.objectbox.Property<Faculdade>[] getAllProperties() {
        return __ALL_PROPERTIES;
    }

    @Override
    public io.objectbox.Property<Faculdade> getIdProperty() {
        return __ID_PROPERTY;
    }

    @Override
    public IdGetter<Faculdade> getIdGetter() {
        return __ID_GETTER;
    }

    @Override
    public CursorFactory<Faculdade> getCursorFactory() {
        return __CURSOR_FACTORY;
    }

    @Internal
    static final class FaculdadeIdGetter implements IdGetter<Faculdade> {
        @Override
        public long getId(Faculdade object) {
            return object.id;
        }
    }

}
