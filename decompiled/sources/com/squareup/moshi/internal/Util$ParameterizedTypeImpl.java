package com.squareup.moshi.internal;

import android.gov.nist.core.Separators;
import bj.AbstractC11452Q;
import dj.AbstractC13178c;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class Util$ParameterizedTypeImpl implements ParameterizedType {

    /* JADX INFO: renamed from: Y */
    public final Type f40518Y;

    /* JADX INFO: renamed from: Z */
    public final Type f40519Z;

    /* JADX INFO: renamed from: o0 */
    public final Type[] f40520o0;

    public Util$ParameterizedTypeImpl(Type type, Type type2, Type... typeArr) {
        if (type2 instanceof Class) {
            Class<?> enclosingClass = ((Class) type2).getEnclosingClass();
            if (type != null) {
                if (enclosingClass == null || AbstractC11452Q.m12855d(type) != enclosingClass) {
                    throw new IllegalArgumentException("unexpected owner type for " + type2 + ": " + type);
                }
            } else if (enclosingClass != null) {
                throw new IllegalArgumentException("unexpected owner type for " + type2 + ": null");
            }
        }
        this.f40518Y = type == null ? null : AbstractC13178c.m14827a(type);
        this.f40519Z = AbstractC13178c.m14827a(type2);
        this.f40520o0 = (Type[]) typeArr.clone();
        int i10 = 0;
        while (true) {
            Type[] typeArr2 = this.f40520o0;
            if (i10 >= typeArr2.length) {
                return;
            }
            typeArr2[i10].getClass();
            AbstractC13178c.m14828b(this.f40520o0[i10]);
            Type[] typeArr3 = this.f40520o0;
            typeArr3[i10] = AbstractC13178c.m14827a(typeArr3[i10]);
            i10++;
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ParameterizedType) && AbstractC11452Q.m12853b(this, (ParameterizedType) obj);
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type[] getActualTypeArguments() {
        return (Type[]) this.f40520o0.clone();
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getOwnerType() {
        return this.f40518Y;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getRawType() {
        return this.f40519Z;
    }

    public final int hashCode() {
        int iHashCode = Arrays.hashCode(this.f40520o0) ^ this.f40519Z.hashCode();
        Set set = AbstractC13178c.f41820a;
        Type type = this.f40518Y;
        return iHashCode ^ (type != null ? type.hashCode() : 0);
    }

    public final String toString() {
        Type[] typeArr = this.f40520o0;
        StringBuilder sb2 = new StringBuilder((typeArr.length + 1) * 30);
        sb2.append(AbstractC13178c.m14837k(this.f40519Z));
        if (typeArr.length == 0) {
            return sb2.toString();
        }
        sb2.append(Separators.LESS_THAN);
        sb2.append(AbstractC13178c.m14837k(typeArr[0]));
        for (int i10 = 1; i10 < typeArr.length; i10++) {
            sb2.append(", ");
            sb2.append(AbstractC13178c.m14837k(typeArr[i10]));
        }
        sb2.append(Separators.GREATER_THAN);
        return sb2.toString();
    }
}
