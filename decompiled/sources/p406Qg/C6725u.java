package p406Qg;

import kotlin.jvm.internal.AbstractC16544l;
import p098Di.InterfaceC2062k;
import ve.C20584h;

/* JADX INFO: renamed from: Qg.u */
/* JADX INFO: loaded from: classes3.dex */
public final class C6725u implements InterfaceC2062k {

    /* JADX INFO: renamed from: a */
    public final Boolean f21597a;

    /* JADX INFO: renamed from: b */
    public final boolean f21598b;

    /* JADX INFO: renamed from: c */
    public final Boolean f21599c;

    /* JADX INFO: renamed from: d */
    public final boolean f21600d;

    /* JADX INFO: renamed from: e */
    public final boolean f21601e;

    /* JADX INFO: renamed from: f */
    public final Float f21602f;

    /* JADX INFO: renamed from: g */
    public final C20584h f21603g;

    public C6725u(Boolean bool, boolean z6, Boolean bool2, boolean z10, boolean z11, Float f10, C20584h c20584h) {
        this.f21597a = bool;
        this.f21598b = z6;
        this.f21599c = bool2;
        this.f21600d = z10;
        this.f21601e = z11;
        this.f21602f = f10;
        this.f21603g = c20584h;
    }

    /* JADX INFO: renamed from: e */
    public static C6725u m7184e(C6725u c6725u, Boolean bool, boolean z6, Boolean bool2, boolean z10, Float f10, C20584h c20584h, int i10) {
        if ((i10 & 1) != 0) {
            bool = c6725u.f21597a;
        }
        Boolean bool3 = bool;
        if ((i10 & 2) != 0) {
            z6 = c6725u.f21598b;
        }
        boolean z11 = z6;
        if ((i10 & 4) != 0) {
            bool2 = c6725u.f21599c;
        }
        Boolean bool4 = bool2;
        boolean z12 = c6725u.f21600d;
        if ((i10 & 16) != 0) {
            z10 = c6725u.f21601e;
        }
        boolean z13 = z10;
        if ((i10 & 32) != 0) {
            f10 = c6725u.f21602f;
        }
        Float f11 = f10;
        if ((i10 & 64) != 0) {
            c20584h = c6725u.f21603g;
        }
        c6725u.getClass();
        return new C6725u(bool3, z11, bool4, z12, z13, f11, c20584h);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6725u)) {
            return false;
        }
        C6725u c6725u = (C6725u) obj;
        return AbstractC16544l.m18089b(this.f21597a, c6725u.f21597a) && this.f21598b == c6725u.f21598b && AbstractC16544l.m18089b(this.f21599c, c6725u.f21599c) && this.f21600d == c6725u.f21600d && this.f21601e == c6725u.f21601e && AbstractC16544l.m18089b(this.f21602f, c6725u.f21602f) && AbstractC16544l.m18089b(this.f21603g, c6725u.f21603g);
    }

    public final int hashCode() {
        Boolean bool = this.f21597a;
        int iHashCode = (((bool == null ? 0 : bool.hashCode()) * 31) + (this.f21598b ? 1231 : 1237)) * 31;
        Boolean bool2 = this.f21599c;
        int iHashCode2 = (((((iHashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31) + (this.f21600d ? 1231 : 1237)) * 31) + (this.f21601e ? 1231 : 1237)) * 31;
        Float f10 = this.f21602f;
        int iHashCode3 = (iHashCode2 + (f10 == null ? 0 : f10.hashCode())) * 31;
        C20584h c20584h = this.f21603g;
        return iHashCode3 + (c20584h != null ? c20584h.hashCode() : 0);
    }

    public final String toString() {
        return "█";
    }
}
