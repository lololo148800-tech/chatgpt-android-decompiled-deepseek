package com.squareup.moshi.internal;

import android.gov.nist.core.Separators;
import bj.AbstractC11452Q;
import dj.AbstractC13178c;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;

/* JADX INFO: loaded from: classes3.dex */
public final class Util$WildcardTypeImpl implements WildcardType {

    /* JADX INFO: renamed from: Y */
    public final Type f40521Y;

    /* JADX INFO: renamed from: Z */
    public final Type f40522Z;

    public Util$WildcardTypeImpl(Type[] typeArr, Type[] typeArr2) {
        if (typeArr2.length > 1) {
            throw new IllegalArgumentException();
        }
        if (typeArr.length != 1) {
            throw new IllegalArgumentException();
        }
        if (typeArr2.length != 1) {
            typeArr[0].getClass();
            AbstractC13178c.m14828b(typeArr[0]);
            this.f40522Z = null;
            this.f40521Y = AbstractC13178c.m14827a(typeArr[0]);
            return;
        }
        typeArr2[0].getClass();
        AbstractC13178c.m14828b(typeArr2[0]);
        if (typeArr[0] != Object.class) {
            throw new IllegalArgumentException();
        }
        this.f40522Z = AbstractC13178c.m14827a(typeArr2[0]);
        this.f40521Y = Object.class;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof WildcardType) && AbstractC11452Q.m12853b(this, (WildcardType) obj);
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getLowerBounds() {
        Type type = this.f40522Z;
        return type != null ? new Type[]{type} : AbstractC13178c.f41821b;
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getUpperBounds() {
        return new Type[]{this.f40521Y};
    }

    public final int hashCode() {
        Type type = this.f40522Z;
        return (type != null ? type.hashCode() + 31 : 1) ^ (this.f40521Y.hashCode() + 31);
    }

    public final String toString() {
        Type type = this.f40522Z;
        if (type != null) {
            return "? super " + AbstractC13178c.m14837k(type);
        }
        Type type2 = this.f40521Y;
        if (type2 == Object.class) {
            return Separators.QUESTION;
        }
        return "? extends " + AbstractC13178c.m14837k(type2);
    }
}
