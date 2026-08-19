package pn;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.types.ErasureTypeAttributes;

/* JADX INFO: renamed from: pn.k */
/* JADX INFO: loaded from: classes2.dex */
public final class C18524k {

    /* JADX INFO: renamed from: a */
    public final TypeParameterDescriptor f59025a;

    /* JADX INFO: renamed from: b */
    public final ErasureTypeAttributes f59026b;

    public C18524k(TypeParameterDescriptor typeParameter, ErasureTypeAttributes typeAttr) {
        AbstractC16544l.m18094g(typeParameter, "typeParameter");
        AbstractC16544l.m18094g(typeAttr, "typeAttr");
        this.f59025a = typeParameter;
        this.f59026b = typeAttr;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C18524k)) {
            return false;
        }
        C18524k c18524k = (C18524k) obj;
        return AbstractC16544l.m18089b(c18524k.f59025a, this.f59025a) && AbstractC16544l.m18089b(c18524k.f59026b, this.f59026b);
    }

    public final int hashCode() {
        int iHashCode = this.f59025a.hashCode();
        return this.f59026b.hashCode() + (iHashCode * 31) + iHashCode;
    }

    public final String toString() {
        return "DataToEraseUpperBound(typeParameter=" + this.f59025a + ", typeAttr=" + this.f59026b + ')';
    }
}
