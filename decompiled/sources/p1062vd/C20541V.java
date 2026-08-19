package p1062vd;

import kotlin.jvm.internal.AbstractC16544l;
import p003A1.AbstractC0168G;
import p403Qd.C6636i;

/* JADX INFO: renamed from: vd.V */
/* JADX INFO: loaded from: classes3.dex */
public final class C20541V implements InterfaceC20563m {

    /* JADX INFO: renamed from: a */
    public final C6636i f65169a;

    /* JADX INFO: renamed from: b */
    public final String f65170b;

    /* JADX INFO: renamed from: c */
    public final String f65171c;

    /* JADX INFO: renamed from: d */
    public final boolean f65172d;

    /* JADX INFO: renamed from: e */
    public final EnumC20540U f65173e;

    /* JADX INFO: renamed from: f */
    public final String f65174f;

    public C20541V(C6636i c6636i, String str, String leafNodeId, boolean z6, EnumC20540U enumC20540U) {
        AbstractC16544l.m18094g(leafNodeId, "leafNodeId");
        this.f65169a = c6636i;
        this.f65170b = str;
        this.f65171c = leafNodeId;
        this.f65172d = z6;
        this.f65173e = enumC20540U;
        this.f65174f = c6636i.f21379a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20541V)) {
            return false;
        }
        C20541V c20541v = (C20541V) obj;
        return AbstractC16544l.m18089b(this.f65169a, c20541v.f65169a) && AbstractC16544l.m18089b(this.f65170b, c20541v.f65170b) && AbstractC16544l.m18089b(this.f65171c, c20541v.f65171c) && this.f65172d == c20541v.f65172d && this.f65173e == c20541v.f65173e;
    }

    @Override // p1062vd.InterfaceC20563m
    public final String getId() {
        return this.f65174f;
    }

    public final int hashCode() {
        return this.f65173e.hashCode() + ((AbstractC0168G.m527p(AbstractC0168G.m527p(this.f65169a.hashCode() * 31, 31, this.f65170b), 31, this.f65171c) + (this.f65172d ? 1231 : 1237)) * 31);
    }

    public final String toString() {
        return "█";
    }
}
