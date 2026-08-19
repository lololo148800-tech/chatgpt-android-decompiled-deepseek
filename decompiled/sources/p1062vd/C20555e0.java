package p1062vd;

import bf.C11349D;
import bf.InterfaceC11374b0;
import kotlin.jvm.internal.AbstractC16544l;
import p1155zi.C21936L0;

/* JADX INFO: renamed from: vd.e0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C20555e0 implements InterfaceC20563m {

    /* JADX INFO: renamed from: a */
    public final InterfaceC11374b0 f65256a;

    /* JADX INFO: renamed from: b */
    public final boolean f65257b;

    /* JADX INFO: renamed from: c */
    public final boolean f65258c;

    /* JADX INFO: renamed from: d */
    public final int f65259d;

    /* JADX INFO: renamed from: e */
    public final String f65260e;

    public C20555e0(InterfaceC11374b0 snorlax, boolean z6, boolean z10, int i10) {
        AbstractC16544l.m18094g(snorlax, "snorlax");
        this.f65256a = snorlax;
        this.f65257b = z6;
        this.f65258c = z10;
        this.f65259d = i10;
        this.f65260e = C21936L0.m22338a(((C11349D) snorlax).f34318a) + "_" + i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20555e0)) {
            return false;
        }
        C20555e0 c20555e0 = (C20555e0) obj;
        return AbstractC16544l.m18089b(this.f65256a, c20555e0.f65256a) && this.f65257b == c20555e0.f65257b && this.f65258c == c20555e0.f65258c && this.f65259d == c20555e0.f65259d;
    }

    @Override // p1062vd.InterfaceC20563m
    public final String getId() {
        return this.f65260e;
    }

    public final int hashCode() {
        return (((((this.f65256a.hashCode() * 31) + (this.f65257b ? 1231 : 1237)) * 31) + (this.f65258c ? 1231 : 1237)) * 31) + this.f65259d;
    }

    public final String toString() {
        return "█";
    }
}
