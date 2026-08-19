package ug;

import kotlin.jvm.internal.AbstractC16544l;
import p092Dc.C1996m;

/* JADX INFO: renamed from: ug.h */
/* JADX INFO: loaded from: classes3.dex */
public final class C20225h extends AbstractC20236s {

    /* JADX INFO: renamed from: a */
    public final C1996m f64016a;

    public C20225h(C1996m component) {
        AbstractC16544l.m18094g(component, "component");
        this.f64016a = component;
    }

    @Override // ug.AbstractC20236s
    /* JADX INFO: renamed from: e */
    public final Object mo21016e() {
        return this.f64016a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C20225h) && AbstractC16544l.m18089b(this.f64016a, ((C20225h) obj).f64016a);
    }

    public final int hashCode() {
        return this.f64016a.hashCode();
    }

    public final String toString() {
        return "█";
    }
}
