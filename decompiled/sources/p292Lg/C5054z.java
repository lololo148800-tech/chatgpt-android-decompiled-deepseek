package p292Lg;

import kotlin.jvm.internal.AbstractC16544l;
import p072Ci.C1705j;
import p098Di.InterfaceC2062k;
import p1155zi.C22038o;
import p1155zi.InterfaceC21925I1;

/* JADX INFO: renamed from: Lg.z */
/* JADX INFO: loaded from: classes3.dex */
public final class C5054z implements InterfaceC2062k {

    /* JADX INFO: renamed from: a */
    public final C1705j f16508a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC21925I1 f16509b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC21925I1 f16510c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC21925I1 f16511d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC21925I1 f16512e;

    /* JADX INFO: renamed from: f */
    public final C22038o f16513f;

    /* JADX INFO: renamed from: g */
    public final boolean f16514g;

    /* JADX INFO: renamed from: h */
    public final Boolean f16515h;

    /* JADX INFO: renamed from: i */
    public final boolean f16516i;

    /* JADX INFO: renamed from: j */
    public final Boolean f16517j;

    /* JADX INFO: renamed from: k */
    public final boolean f16518k;

    /* JADX INFO: renamed from: l */
    public final Boolean f16519l;

    public C5054z(C1705j c1705j, InterfaceC21925I1 interfaceC21925I1, InterfaceC21925I1 interfaceC21925I2, InterfaceC21925I1 interfaceC21925I3, InterfaceC21925I1 interfaceC21925I4, C22038o c22038o, boolean z6, Boolean bool, boolean z10, Boolean bool2, boolean z11, Boolean bool3) {
        this.f16508a = c1705j;
        this.f16509b = interfaceC21925I1;
        this.f16510c = interfaceC21925I2;
        this.f16511d = interfaceC21925I3;
        this.f16512e = interfaceC21925I4;
        this.f16513f = c22038o;
        this.f16514g = z6;
        this.f16515h = bool;
        this.f16516i = z10;
        this.f16517j = bool2;
        this.f16518k = z11;
        this.f16519l = bool3;
    }

    /* JADX INFO: renamed from: e */
    public static C5054z m5657e(C5054z c5054z, InterfaceC21925I1 interfaceC21925I1, InterfaceC21925I1 interfaceC21925I2, InterfaceC21925I1 interfaceC21925I3, InterfaceC21925I1 interfaceC21925I4, C22038o c22038o, boolean z6, Boolean bool, Boolean bool2, Boolean bool3, int i10) {
        C1705j c1705j = c5054z.f16508a;
        InterfaceC21925I1 interfaceC21925I5 = (i10 & 2) != 0 ? c5054z.f16509b : interfaceC21925I1;
        InterfaceC21925I1 interfaceC21925I6 = (i10 & 4) != 0 ? c5054z.f16510c : interfaceC21925I2;
        InterfaceC21925I1 interfaceC21925I7 = (i10 & 8) != 0 ? c5054z.f16511d : interfaceC21925I3;
        InterfaceC21925I1 interfaceC21925I8 = (i10 & 16) != 0 ? c5054z.f16512e : interfaceC21925I4;
        C22038o c22038o2 = (i10 & 32) != 0 ? c5054z.f16513f : c22038o;
        boolean z10 = (i10 & 64) != 0 ? c5054z.f16514g : z6;
        Boolean bool4 = (i10 & 128) != 0 ? c5054z.f16515h : bool;
        boolean z11 = c5054z.f16516i;
        Boolean bool5 = (i10 & 512) != 0 ? c5054z.f16517j : bool2;
        boolean z12 = c5054z.f16518k;
        Boolean bool6 = (i10 & 2048) != 0 ? c5054z.f16519l : bool3;
        c5054z.getClass();
        return new C5054z(c1705j, interfaceC21925I5, interfaceC21925I6, interfaceC21925I7, interfaceC21925I8, c22038o2, z10, bool4, z11, bool5, z12, bool6);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5054z)) {
            return false;
        }
        C5054z c5054z = (C5054z) obj;
        return AbstractC16544l.m18089b(this.f16508a, c5054z.f16508a) && AbstractC16544l.m18089b(this.f16509b, c5054z.f16509b) && AbstractC16544l.m18089b(this.f16510c, c5054z.f16510c) && AbstractC16544l.m18089b(this.f16511d, c5054z.f16511d) && AbstractC16544l.m18089b(this.f16512e, c5054z.f16512e) && AbstractC16544l.m18089b(this.f16513f, c5054z.f16513f) && this.f16514g == c5054z.f16514g && AbstractC16544l.m18089b(this.f16515h, c5054z.f16515h) && this.f16516i == c5054z.f16516i && AbstractC16544l.m18089b(this.f16517j, c5054z.f16517j) && this.f16518k == c5054z.f16518k && AbstractC16544l.m18089b(this.f16519l, c5054z.f16519l);
    }

    public final int hashCode() {
        C1705j c1705j = this.f16508a;
        int iHashCode = (c1705j == null ? 0 : c1705j.hashCode()) * 31;
        InterfaceC21925I1 interfaceC21925I1 = this.f16509b;
        int iHashCode2 = (iHashCode + (interfaceC21925I1 == null ? 0 : interfaceC21925I1.hashCode())) * 31;
        InterfaceC21925I1 interfaceC21925I2 = this.f16510c;
        int iHashCode3 = (iHashCode2 + (interfaceC21925I2 == null ? 0 : interfaceC21925I2.hashCode())) * 31;
        InterfaceC21925I1 interfaceC21925I3 = this.f16511d;
        int iHashCode4 = (iHashCode3 + (interfaceC21925I3 == null ? 0 : interfaceC21925I3.hashCode())) * 31;
        InterfaceC21925I1 interfaceC21925I4 = this.f16512e;
        int iHashCode5 = (iHashCode4 + (interfaceC21925I4 == null ? 0 : interfaceC21925I4.hashCode())) * 31;
        C22038o c22038o = this.f16513f;
        int iHashCode6 = (((iHashCode5 + (c22038o == null ? 0 : c22038o.hashCode())) * 31) + (this.f16514g ? 1231 : 1237)) * 31;
        Boolean bool = this.f16515h;
        int iHashCode7 = (((iHashCode6 + (bool == null ? 0 : bool.hashCode())) * 31) + (this.f16516i ? 1231 : 1237)) * 31;
        Boolean bool2 = this.f16517j;
        int iHashCode8 = (((iHashCode7 + (bool2 == null ? 0 : bool2.hashCode())) * 31) + (this.f16518k ? 1231 : 1237)) * 31;
        Boolean bool3 = this.f16519l;
        return iHashCode8 + (bool3 != null ? bool3.hashCode() : 0);
    }

    public final String toString() {
        return "█";
    }
}
