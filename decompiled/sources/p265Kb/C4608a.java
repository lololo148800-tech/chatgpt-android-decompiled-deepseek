package p265Kb;

import java.io.Serializable;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import p817j$.util.Objects;

/* JADX INFO: renamed from: Kb.a */
/* JADX INFO: loaded from: classes.dex */
public final class C4608a implements GenericArrayType, Serializable {

    /* JADX INFO: renamed from: Y */
    public final Type f15026Y;

    public C4608a(Type type) {
        Objects.requireNonNull(type);
        this.f15026Y = AbstractC4611d.m5342a(type);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof GenericArrayType) && AbstractC4611d.m5345d(this, (GenericArrayType) obj);
    }

    @Override // java.lang.reflect.GenericArrayType
    public final Type getGenericComponentType() {
        return this.f15026Y;
    }

    public final int hashCode() {
        return this.f15026Y.hashCode();
    }

    public final String toString() {
        return AbstractC4611d.m5352k(this.f15026Y) + "[]";
    }
}
