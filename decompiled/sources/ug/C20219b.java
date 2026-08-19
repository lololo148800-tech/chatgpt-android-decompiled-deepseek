package ug;

import p455Sf.C7122g;

/* JADX INFO: renamed from: ug.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C20219b implements InterfaceC20220c {

    /* JADX INFO: renamed from: a */
    public final C7122g f64012a;

    public C20219b(C7122g c7122g) {
        this.f64012a = c7122g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C20219b) && this.f64012a.equals(((C20219b) obj).f64012a);
    }

    public final int hashCode() {
        return this.f64012a.hashCode();
    }

    public final String toString() {
        return "█";
    }
}
