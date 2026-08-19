package ug;

import kotlin.jvm.internal.AbstractC16544l;
import p003A1.AbstractC0168G;
import p092Dc.C1996m;

/* JADX INFO: renamed from: ug.i */
/* JADX INFO: loaded from: classes3.dex */
public final class C20226i extends AbstractC20236s {

    /* JADX INFO: renamed from: a */
    public final C1996m f64017a;

    /* JADX INFO: renamed from: b */
    public final String f64018b;

    /* JADX INFO: renamed from: c */
    public final boolean f64019c;

    /* JADX INFO: renamed from: d */
    public final boolean f64020d;

    public C20226i(C1996m component, String key, boolean z6, boolean z10) {
        AbstractC16544l.m18094g(component, "component");
        AbstractC16544l.m18094g(key, "key");
        this.f64017a = component;
        this.f64018b = key;
        this.f64019c = z6;
        this.f64020d = z10;
    }

    @Override // ug.AbstractC20236s
    /* JADX INFO: renamed from: e */
    public final Object mo21016e() {
        return this.f64017a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20226i)) {
            return false;
        }
        C20226i c20226i = (C20226i) obj;
        return AbstractC16544l.m18089b(this.f64017a, c20226i.f64017a) && AbstractC16544l.m18089b(this.f64018b, c20226i.f64018b) && this.f64019c == c20226i.f64019c && this.f64020d == c20226i.f64020d;
    }

    public final int hashCode() {
        return ((AbstractC0168G.m527p(this.f64017a.hashCode() * 31, 31, this.f64018b) + (this.f64019c ? 1231 : 1237)) * 31) + (this.f64020d ? 1231 : 1237);
    }

    public final String toString() {
        return "█";
    }
}
