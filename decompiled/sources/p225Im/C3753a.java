package p225Im;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: Im.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C3753a implements GenericArrayType, Type {

    /* JADX INFO: renamed from: Y */
    public final Type f11413Y;

    public C3753a(Type elementType) {
        AbstractC16544l.m18094g(elementType, "elementType");
        this.f11413Y = elementType;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof GenericArrayType) {
            if (AbstractC16544l.m18089b(this.f11413Y, ((GenericArrayType) obj).getGenericComponentType())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.reflect.GenericArrayType
    public final Type getGenericComponentType() {
        return this.f11413Y;
    }

    @Override // java.lang.reflect.Type
    public final String getTypeName() {
        return AbstractC3751J.m4440e(this.f11413Y) + "[]";
    }

    public final int hashCode() {
        return this.f11413Y.hashCode();
    }

    public final String toString() {
        return getTypeName();
    }
}
