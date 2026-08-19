package com.squareup.moshi.internal;

import bj.AbstractC11452Q;
import dj.AbstractC13178c;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes3.dex */
public final class Util$GenericArrayTypeImpl implements GenericArrayType {

    /* JADX INFO: renamed from: Y */
    public final Type f40517Y;

    public Util$GenericArrayTypeImpl(Type type) {
        this.f40517Y = AbstractC13178c.m14827a(type);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof GenericArrayType) && AbstractC11452Q.m12853b(this, (GenericArrayType) obj);
    }

    @Override // java.lang.reflect.GenericArrayType
    public final Type getGenericComponentType() {
        return this.f40517Y;
    }

    public final int hashCode() {
        return this.f40517Y.hashCode();
    }

    public final String toString() {
        return AbstractC13178c.m14837k(this.f40517Y) + "[]";
    }
}
