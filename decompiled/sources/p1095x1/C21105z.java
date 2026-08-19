package p1095x1;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p1140z1.C21658D;
import p1140z1.C21664J;
import p228J.AbstractC3794B0;
import p392Q0.C6543a;
import p392Q0.C6546d;
import p492U1.EnumC7546k;
import p909nm.C17689w;

/* JADX INFO: renamed from: x1.z */
/* JADX INFO: loaded from: classes.dex */
public final class C21105z implements InterfaceC21083f0, InterfaceC21059M {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ C21048B f67040Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C21053G f67041Z;

    public C21105z(C21053G c21053g) {
        this.f67041Z = c21053g;
        this.f67040Y = c21053g.f66962t0;
    }

    @Override // p492U1.InterfaceC7537b
    /* JADX INFO: renamed from: F */
    public final long mo7859F(int i10) {
        return this.f67040Y.mo7859F(i10);
    }

    @Override // p492U1.InterfaceC7537b
    /* JADX INFO: renamed from: J */
    public final long mo7860J(float f10) {
        return this.f67040Y.mo7860J(f10);
    }

    @Override // p492U1.InterfaceC7537b
    /* JADX INFO: renamed from: O */
    public final float mo7861O(int i10) {
        return this.f67040Y.mo7861O(i10);
    }

    @Override // p492U1.InterfaceC7537b
    /* JADX INFO: renamed from: P */
    public final float mo7862P(float f10) {
        return f10 / this.f67040Y.getDensity();
    }

    @Override // p1095x1.InterfaceC21059M
    /* JADX INFO: renamed from: R */
    public final InterfaceC21058L mo19936R(int i10, int i11, Map map, InterfaceC1436k interfaceC1436k) {
        return this.f67040Y.m21501a(i10, i11, map, interfaceC1436k);
    }

    @Override // p492U1.InterfaceC7537b
    /* JADX INFO: renamed from: X */
    public final float mo7863X() {
        return this.f67040Y.f66942o0;
    }

    @Override // p1095x1.InterfaceC21095p
    /* JADX INFO: renamed from: Z */
    public final boolean mo19937Z() {
        return this.f67040Y.mo19937Z();
    }

    @Override // p492U1.InterfaceC7537b
    /* JADX INFO: renamed from: b0 */
    public final float mo7864b0(float f10) {
        return this.f67040Y.getDensity() * f10;
    }

    @Override // p492U1.InterfaceC7537b
    public final float getDensity() {
        return this.f67040Y.f66941Z;
    }

    @Override // p1095x1.InterfaceC21095p
    public final EnumC7546k getLayoutDirection() {
        return this.f67040Y.f66940Y;
    }

    @Override // p492U1.InterfaceC7537b
    /* JADX INFO: renamed from: i0 */
    public final int mo7865i0(long j10) {
        return this.f67040Y.mo7865i0(j10);
    }

    @Override // p492U1.InterfaceC7537b
    /* JADX INFO: renamed from: k0 */
    public final int mo7866k0(float f10) {
        C21048B c21048b = this.f67040Y;
        c21048b.getClass();
        return AbstractC3794B0.m4485j(c21048b, f10);
    }

    @Override // p1095x1.InterfaceC21083f0
    /* JADX INFO: renamed from: m0 */
    public final List mo21503m0(Object obj, InterfaceC1439n interfaceC1439n) {
        C21053G c21053g = this.f67041Z;
        C21658D c21658d = (C21658D) c21053g.f66961s0.get(obj);
        List listM22052o = c21658d != null ? c21658d.m22052o() : null;
        if (listM22052o != null) {
            return listM22052o;
        }
        C6546d c6546d = c21053g.f66967y0;
        int i10 = c6546d.f21184o0;
        int i11 = c21053g.f66959q0;
        if (i10 < i11) {
            throw new IllegalArgumentException("Error: currentPostLookaheadIndex cannot be greater than the size of thepostLookaheadComposedSlotIds list.");
        }
        if (i10 == i11) {
            c6546d.m7099c(obj);
        } else {
            Object[] objArr = c6546d.f21182Y;
            Object obj2 = objArr[i11];
            objArr[i11] = obj;
        }
        c21053g.f66959q0++;
        HashMap map = c21053g.f66964v0;
        if (!map.containsKey(obj)) {
            c21053g.f66966x0.put(obj, c21053g.m21511f(obj, interfaceC1439n));
            C21658D c21658d2 = c21053g.f66955Y;
            if (c21658d2.m22064w() == 3) {
                c21658d2.m22055p0(true);
            } else {
                C21658D.m22000q0(c21658d2, true, 6);
            }
        }
        C21658D c21658d3 = (C21658D) map.get(obj);
        if (c21658d3 == null) {
            return C17689w.f56480Y;
        }
        List listM22098V = c21658d3.m22003A().m22098V();
        C6543a c6543a = (C6543a) listM22098V;
        int i12 = c6543a.f21176Y.f21184o0;
        for (int i13 = 0; i13 < i12; i13++) {
            ((C21664J) c6543a.get(i13)).f68719T0.f68730b = true;
        }
        return listM22098V;
    }

    @Override // p492U1.InterfaceC7537b
    /* JADX INFO: renamed from: r0 */
    public final long mo7867r0(long j10) {
        C21048B c21048b = this.f67040Y;
        c21048b.getClass();
        return AbstractC3794B0.m4489n(j10, c21048b);
    }

    @Override // p492U1.InterfaceC7537b
    /* JADX INFO: renamed from: s */
    public final long mo7868s(long j10) {
        C21048B c21048b = this.f67040Y;
        c21048b.getClass();
        return AbstractC3794B0.m4487l(j10, c21048b);
    }

    @Override // p492U1.InterfaceC7537b
    /* JADX INFO: renamed from: t0 */
    public final float mo7869t0(long j10) {
        C21048B c21048b = this.f67040Y;
        c21048b.getClass();
        return AbstractC3794B0.m4488m(j10, c21048b);
    }

    @Override // p492U1.InterfaceC7537b
    /* JADX INFO: renamed from: w */
    public final float mo7870w(long j10) {
        C21048B c21048b = this.f67040Y;
        c21048b.getClass();
        return AbstractC3794B0.m4486k(j10, c21048b);
    }
}
