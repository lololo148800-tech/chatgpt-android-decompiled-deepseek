package p225Im;

import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17308k;
import p571X9.AbstractC9306j0;
import p909nm.AbstractC17682p;

/* JADX INFO: renamed from: Im.G */
/* JADX INFO: loaded from: classes3.dex */
public final class C3748G implements TypeVariable, Type {

    /* JADX INFO: renamed from: Y */
    public final InterfaceC3778z f11407Y;

    public C3748G(InterfaceC3778z typeParameter) {
        AbstractC16544l.m18094g(typeParameter, "typeParameter");
        this.f11407Y = typeParameter;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof TypeVariable) || !AbstractC16544l.m18089b(this.f11407Y.getName(), ((TypeVariable) obj).getName())) {
            return false;
        }
        getGenericDeclaration();
        throw null;
    }

    @Override // java.lang.reflect.TypeVariable
    public final Type[] getBounds() {
        List upperBounds = this.f11407Y.getUpperBounds();
        ArrayList arrayList = new ArrayList(AbstractC17682p.m19389r(upperBounds, 10));
        Iterator it = upperBounds.iterator();
        while (it.hasNext()) {
            arrayList.add(AbstractC3751J.m4441f((InterfaceC3777y) it.next(), true));
        }
        return (Type[]) arrayList.toArray(new Type[0]);
    }

    @Override // java.lang.reflect.TypeVariable
    public final GenericDeclaration getGenericDeclaration() {
        throw new C17308k(AbstractC9306j0.m9889h("An operation is not implemented: ", "getGenericDeclaration() is not yet supported for type variables created from KType: " + this.f11407Y));
    }

    @Override // java.lang.reflect.TypeVariable
    public final String getName() {
        return this.f11407Y.getName();
    }

    @Override // java.lang.reflect.Type
    public final String getTypeName() {
        return this.f11407Y.getName();
    }

    public final int hashCode() {
        this.f11407Y.getName().getClass();
        getGenericDeclaration();
        throw null;
    }

    public final String toString() {
        return this.f11407Y.getName();
    }
}
