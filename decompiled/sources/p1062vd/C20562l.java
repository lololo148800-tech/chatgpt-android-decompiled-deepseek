package p1062vd;

import kotlin.jvm.internal.AbstractC16544l;
import p1042uh.C20263a0;

/* JADX INFO: renamed from: vd.l */
/* JADX INFO: loaded from: classes3.dex */
public final class C20562l implements InterfaceC20563m {

    /* JADX INFO: renamed from: a */
    public final C20263a0 f65270a;

    /* JADX INFO: renamed from: b */
    public final boolean f65271b;

    /* JADX INFO: renamed from: c */
    public final boolean f65272c;

    /* JADX INFO: renamed from: d */
    public final int f65273d;

    /* JADX INFO: renamed from: e */
    public final String f65274e;

    public C20562l(C20263a0 c20263a0, boolean z6, boolean z10, int i10) {
        this.f65270a = c20263a0;
        this.f65271b = z6;
        this.f65272c = z10;
        this.f65273d = i10;
        this.f65274e = c20263a0.f64085b + "_" + i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20562l)) {
            return false;
        }
        C20562l c20562l = (C20562l) obj;
        return AbstractC16544l.m18089b(this.f65270a, c20562l.f65270a) && this.f65271b == c20562l.f65271b && this.f65272c == c20562l.f65272c && this.f65273d == c20562l.f65273d;
    }

    @Override // p1062vd.InterfaceC20563m
    public final String getId() {
        return this.f65274e;
    }

    public final int hashCode() {
        return (((((this.f65270a.hashCode() * 31) + (this.f65271b ? 1231 : 1237)) * 31) + (this.f65272c ? 1231 : 1237)) * 31) + this.f65273d;
    }

    public final String toString() {
        return "█";
    }
}
