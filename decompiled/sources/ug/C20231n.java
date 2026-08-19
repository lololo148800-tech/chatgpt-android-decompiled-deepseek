package ug;

import kotlin.jvm.internal.AbstractC16544l;
import p1155zi.AbstractC21933K1;

/* JADX INFO: renamed from: ug.n */
/* JADX INFO: loaded from: classes3.dex */
public final class C20231n extends AbstractC20236s {

    /* JADX INFO: renamed from: a */
    public final Object f64025a;

    /* JADX INFO: renamed from: b */
    public final AbstractC21933K1 f64026b;

    public C20231n(Object obj, AbstractC21933K1 abstractC21933K1) {
        this.f64025a = obj;
        this.f64026b = abstractC21933K1;
    }

    @Override // ug.AbstractC20236s
    /* JADX INFO: renamed from: e */
    public final Object mo21016e() {
        return this.f64025a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20231n)) {
            return false;
        }
        C20231n c20231n = (C20231n) obj;
        return AbstractC16544l.m18089b(this.f64025a, c20231n.f64025a) && AbstractC16544l.m18089b(this.f64026b, c20231n.f64026b);
    }

    public final int hashCode() {
        return this.f64026b.hashCode() + (this.f64025a.hashCode() * 31);
    }

    public final String toString() {
        return "█";
    }
}
