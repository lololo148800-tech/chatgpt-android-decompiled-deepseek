package p552Wg;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p098Di.InterfaceC2062k;
import p1042uh.C20263a0;
import p1107xh.EnumC21219I;
import p324Mn.C5551u;
import p403Qd.C6604J;
import p621Zd.C10282c;
import p775h2.AbstractC14376f;

/* JADX INFO: renamed from: Wg.B */
/* JADX INFO: loaded from: classes3.dex */
public final class C8838B implements InterfaceC2062k {

    /* JADX INFO: renamed from: a */
    public final boolean f27026a;

    /* JADX INFO: renamed from: b */
    public final boolean f27027b;

    /* JADX INFO: renamed from: c */
    public final C6604J f27028c;

    /* JADX INFO: renamed from: d */
    public final C10282c f27029d;

    /* JADX INFO: renamed from: e */
    public final List f27030e;

    /* JADX INFO: renamed from: f */
    public final C20263a0 f27031f;

    /* JADX INFO: renamed from: g */
    public final String f27032g;

    /* JADX INFO: renamed from: h */
    public final boolean f27033h;

    /* JADX INFO: renamed from: i */
    public final boolean f27034i;

    /* JADX INFO: renamed from: j */
    public final boolean f27035j;

    /* JADX INFO: renamed from: k */
    public final C5551u f27036k;

    /* JADX INFO: renamed from: l */
    public final C10282c f27037l;

    /* JADX INFO: renamed from: m */
    public final String f27038m;

    public C8838B(boolean z6, boolean z10, C6604J c6604j, C10282c c10282c, List conversationItems, C20263a0 c20263a0, String str, boolean z11, boolean z12) {
        AbstractC16544l.m18094g(conversationItems, "conversationItems");
        this.f27026a = z6;
        this.f27027b = z10;
        this.f27028c = c6604j;
        this.f27029d = c10282c;
        this.f27030e = conversationItems;
        this.f27031f = c20263a0;
        this.f27032g = str;
        this.f27033h = z11;
        this.f27034i = z12;
        boolean z13 = true;
        if (!z11 && (c20263a0 == null || !c20263a0.f64087d.contains(EnumC21219I.REPORTABLE))) {
            z13 = false;
        }
        this.f27035j = z13;
        this.f27036k = c6604j != null ? c6604j.f21323a.f21381c : null;
        this.f27037l = c6604j != null ? c6604j.f21324b : null;
        this.f27038m = c6604j != null ? c6604j.f21323a.f21384f : null;
    }

    /* JADX INFO: renamed from: e */
    public static C8838B m9545e(C8838B c8838b, C6604J c6604j, C10282c c10282c, ArrayList arrayList, C20263a0 c20263a0, String str, boolean z6, int i10) {
        boolean z10 = c8838b.f27026a;
        boolean z11 = (i10 & 2) != 0 ? c8838b.f27027b : false;
        C6604J c6604j2 = (i10 & 4) != 0 ? c8838b.f27028c : c6604j;
        C10282c c10282c2 = (i10 & 8) != 0 ? c8838b.f27029d : c10282c;
        List conversationItems = (i10 & 16) != 0 ? c8838b.f27030e : arrayList;
        C20263a0 c20263a1 = (i10 & 32) != 0 ? c8838b.f27031f : c20263a0;
        String str2 = (i10 & 64) != 0 ? c8838b.f27032g : str;
        boolean z12 = c8838b.f27033h;
        boolean z13 = (i10 & 256) != 0 ? c8838b.f27034i : z6;
        c8838b.getClass();
        AbstractC16544l.m18094g(conversationItems, "conversationItems");
        return new C8838B(z10, z11, c6604j2, c10282c2, conversationItems, c20263a1, str2, z12, z13);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0050  */
    public final boolean equals(Object obj) {
        boolean zM18089b;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8838B)) {
            return false;
        }
        C8838B c8838b = (C8838B) obj;
        if (this.f27026a != c8838b.f27026a || this.f27027b != c8838b.f27027b || !AbstractC16544l.m18089b(this.f27028c, c8838b.f27028c) || !AbstractC16544l.m18089b(this.f27029d, c8838b.f27029d) || !AbstractC16544l.m18089b(this.f27030e, c8838b.f27030e) || !AbstractC16544l.m18089b(this.f27031f, c8838b.f27031f)) {
            return false;
        }
        String str = this.f27032g;
        String str2 = c8838b.f27032g;
        if (str == null) {
            if (str2 == null) {
                zM18089b = true;
            } else {
                zM18089b = false;
            }
        } else if (str2 == null) {
            zM18089b = false;
        } else {
            zM18089b = AbstractC16544l.m18089b(str, str2);
        }
        return zM18089b && this.f27033h == c8838b.f27033h && this.f27034i == c8838b.f27034i;
    }

    public final int hashCode() {
        int i10 = (((this.f27026a ? 1231 : 1237) * 31) + (this.f27027b ? 1231 : 1237)) * 31;
        C6604J c6604j = this.f27028c;
        int iHashCode = (i10 + (c6604j == null ? 0 : c6604j.hashCode())) * 31;
        C10282c c10282c = this.f27029d;
        int iM15858x = AbstractC14376f.m15858x(this.f27030e, (iHashCode + (c10282c == null ? 0 : c10282c.hashCode())) * 31, 31);
        C20263a0 c20263a0 = this.f27031f;
        int iHashCode2 = (iM15858x + (c20263a0 == null ? 0 : c20263a0.hashCode())) * 31;
        String str = this.f27032g;
        return ((((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31) + (this.f27033h ? 1231 : 1237)) * 31) + (this.f27034i ? 1231 : 1237);
    }

    public final String toString() {
        return "█";
    }
}
