package ug;

import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: ug.m */
/* JADX INFO: loaded from: classes3.dex */
public final class C20230m extends AbstractC20236s {

    /* JADX INFO: renamed from: a */
    public final Object f64024a;

    public C20230m(Object component) {
        AbstractC16544l.m18094g(component, "component");
        this.f64024a = component;
    }

    @Override // ug.AbstractC20236s
    /* JADX INFO: renamed from: e */
    public final Object mo21016e() {
        return this.f64024a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C20230m) && AbstractC16544l.m18089b(this.f64024a, ((C20230m) obj).f64024a);
    }

    public final int hashCode() {
        return this.f64024a.hashCode();
    }

    public final String toString() {
        return "█";
    }
}
