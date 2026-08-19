package p1027tp;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

/* JADX INFO: renamed from: tp.S */
/* JADX INFO: loaded from: classes2.dex */
public final class C20053S implements GenericArrayType {

    /* JADX INFO: renamed from: Y */
    public final Type f63539Y;

    public C20053S(Type type) {
        this.f63539Y = type;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof GenericArrayType) && AbstractC20056V.m20877c(this, (GenericArrayType) obj);
    }

    @Override // java.lang.reflect.GenericArrayType
    public final Type getGenericComponentType() {
        return this.f63539Y;
    }

    public final int hashCode() {
        return this.f63539Y.hashCode();
    }

    public final String toString() {
        return AbstractC20056V.m20890p(this.f63539Y) + "[]";
    }
}
