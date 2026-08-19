package ug;

import kotlin.jvm.internal.AbstractC16544l;
import p092Dc.C1996m;

/* JADX INFO: renamed from: ug.j */
/* JADX INFO: loaded from: classes3.dex */
public final class C20227j extends AbstractC20236s {

    /* JADX INFO: renamed from: a */
    public final C1996m f64021a;

    public C20227j(C1996m component) {
        AbstractC16544l.m18094g(component, "component");
        this.f64021a = component;
    }

    @Override // ug.AbstractC20236s
    /* JADX INFO: renamed from: e */
    public final Object mo21016e() {
        return this.f64021a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C20227j) && AbstractC16544l.m18089b(this.f64021a, ((C20227j) obj).f64021a);
    }

    public final int hashCode() {
        return this.f64021a.hashCode();
    }

    public final String toString() {
        return "█";
    }
}
