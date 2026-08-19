package p1155zi;

import ao.AbstractC11153a0;
import kotlin.jvm.internal.AbstractC16544l;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: zi.U0 */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C21965U0 implements InterfaceC21915G {
    public static final C21944N0 Companion = new C21944N0();

    /* JADX INFO: renamed from: a */
    public final String f69534a;

    /* JADX INFO: renamed from: b */
    public final int f69535b;

    /* JADX INFO: renamed from: c */
    public final int f69536c;

    /* JADX INFO: renamed from: d */
    public final int f69537d;

    /* JADX INFO: renamed from: e */
    public final String f69538e;

    /* JADX INFO: renamed from: f */
    public final C21962T0 f69539f;

    /* JADX INFO: renamed from: g */
    public final String f69540g;

    public C21965U0(String assetPointer, int i10, int i11, int i12, String str, int i13) {
        str = (i13 & 16) != 0 ? null : str;
        AbstractC16544l.m18094g(assetPointer, "assetPointer");
        this.f69534a = assetPointer;
        this.f69535b = i10;
        this.f69536c = i11;
        this.f69537d = i12;
        this.f69538e = str;
        this.f69539f = null;
        this.f69540g = "image_asset_pointer";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C21965U0)) {
            return false;
        }
        C21965U0 c21965u0 = (C21965U0) obj;
        return AbstractC16544l.m18089b(this.f69534a, c21965u0.f69534a) && this.f69535b == c21965u0.f69535b && this.f69536c == c21965u0.f69536c && this.f69537d == c21965u0.f69537d && AbstractC16544l.m18089b(this.f69538e, c21965u0.f69538e) && AbstractC16544l.m18089b(this.f69539f, c21965u0.f69539f) && AbstractC16544l.m18089b(this.f69540g, c21965u0.f69540g);
    }

    public final int hashCode() {
        int iHashCode = ((((((this.f69534a.hashCode() * 31) + this.f69535b) * 31) + this.f69536c) * 31) + this.f69537d) * 31;
        String str = this.f69538e;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        C21962T0 c21962t0 = this.f69539f;
        return this.f69540g.hashCode() + ((iHashCode2 + (c21962t0 != null ? c21962t0.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "█";
    }

    public C21965U0(int i10, String str, int i11, int i12, int i13, String str2, C21962T0 c21962t0, String str3) {
        if (15 != (i10 & 15)) {
            AbstractC11153a0.m12389l(i10, 15, C21940M0.f69493a.getDescriptor());
            throw null;
        }
        this.f69534a = str;
        this.f69535b = i11;
        this.f69536c = i12;
        this.f69537d = i13;
        if ((i10 & 16) == 0) {
            this.f69538e = null;
        } else {
            this.f69538e = str2;
        }
        if ((i10 & 32) == 0) {
            this.f69539f = null;
        } else {
            this.f69539f = c21962t0;
        }
        if ((i10 & 64) == 0) {
            this.f69540g = "image_asset_pointer";
        } else {
            this.f69540g = str3;
        }
    }
}
