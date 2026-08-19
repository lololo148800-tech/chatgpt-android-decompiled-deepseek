package p615Z6;

import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import java.util.ArrayList;
import p658b5.C11238i;

/* JADX INFO: renamed from: Z6.S */
/* JADX INFO: loaded from: classes.dex */
public final class C10193S implements Cloneable {

    /* JADX INFO: renamed from: A0 */
    public Boolean f30256A0;

    /* JADX INFO: renamed from: B0 */
    public C11238i f30257B0;

    /* JADX INFO: renamed from: C0 */
    public String f30258C0;

    /* JADX INFO: renamed from: D0 */
    public String f30259D0;

    /* JADX INFO: renamed from: E0 */
    public String f30260E0;

    /* JADX INFO: renamed from: F0 */
    public Boolean f30261F0;

    /* JADX INFO: renamed from: G0 */
    public Boolean f30262G0;

    /* JADX INFO: renamed from: H0 */
    public AbstractC10204b0 f30263H0;

    /* JADX INFO: renamed from: I0 */
    public Float f30264I0;

    /* JADX INFO: renamed from: J0 */
    public String f30265J0;

    /* JADX INFO: renamed from: K0 */
    public String f30266K0;

    /* JADX INFO: renamed from: L0 */
    public AbstractC10204b0 f30267L0;

    /* JADX INFO: renamed from: M0 */
    public Float f30268M0;

    /* JADX INFO: renamed from: N0 */
    public AbstractC10204b0 f30269N0;

    /* JADX INFO: renamed from: O0 */
    public Float f30270O0;

    /* JADX INFO: renamed from: P0 */
    public int f30271P0;

    /* JADX INFO: renamed from: Q0 */
    public int f30272Q0;

    /* JADX INFO: renamed from: R0 */
    public int f30273R0;

    /* JADX INFO: renamed from: S0 */
    public int f30274S0;

    /* JADX INFO: renamed from: T0 */
    public int f30275T0;

    /* JADX INFO: renamed from: U0 */
    public int f30276U0;

    /* JADX INFO: renamed from: V0 */
    public int f30277V0;

    /* JADX INFO: renamed from: W0 */
    public int f30278W0;

    /* JADX INFO: renamed from: X0 */
    public int f30279X0;

    /* JADX INFO: renamed from: Y */
    public long f30280Y = 0;

    /* JADX INFO: renamed from: Y0 */
    public int f30281Y0;

    /* JADX INFO: renamed from: Z */
    public AbstractC10204b0 f30282Z;

    /* JADX INFO: renamed from: o0 */
    public Float f30283o0;

    /* JADX INFO: renamed from: p0 */
    public AbstractC10204b0 f30284p0;

    /* JADX INFO: renamed from: q0 */
    public Float f30285q0;

    /* JADX INFO: renamed from: r0 */
    public C10173D f30286r0;

    /* JADX INFO: renamed from: s0 */
    public Float f30287s0;

    /* JADX INFO: renamed from: t0 */
    public C10173D[] f30288t0;

    /* JADX INFO: renamed from: u0 */
    public C10173D f30289u0;

    /* JADX INFO: renamed from: v0 */
    public Float f30290v0;

    /* JADX INFO: renamed from: w0 */
    public C10241u f30291w0;

    /* JADX INFO: renamed from: x0 */
    public ArrayList f30292x0;

    /* JADX INFO: renamed from: y0 */
    public C10173D f30293y0;

    /* JADX INFO: renamed from: z0 */
    public Integer f30294z0;

    /* JADX INFO: renamed from: a */
    public static C10193S m10774a() {
        C10193S c10193s = new C10193S();
        c10193s.f30280Y = -1L;
        C10241u c10241u = C10241u.f30414Z;
        c10193s.f30282Z = c10241u;
        c10193s.f30271P0 = 1;
        Float fValueOf = Float.valueOf(1.0f);
        c10193s.f30283o0 = fValueOf;
        c10193s.f30284p0 = null;
        c10193s.f30285q0 = fValueOf;
        c10193s.f30286r0 = new C10173D(1.0f);
        c10193s.f30272Q0 = 1;
        c10193s.f30273R0 = 1;
        c10193s.f30287s0 = Float.valueOf(4.0f);
        c10193s.f30288t0 = null;
        c10193s.f30289u0 = new C10173D(0.0f);
        c10193s.f30290v0 = fValueOf;
        c10193s.f30291w0 = c10241u;
        c10193s.f30292x0 = null;
        c10193s.f30293y0 = new C10173D(7, 12.0f);
        c10193s.f30294z0 = Integer.valueOf(RCHTTPStatusCodes.BAD_REQUEST);
        c10193s.f30274S0 = 1;
        c10193s.f30275T0 = 1;
        c10193s.f30276U0 = 1;
        c10193s.f30277V0 = 1;
        Boolean bool = Boolean.TRUE;
        c10193s.f30256A0 = bool;
        c10193s.f30257B0 = null;
        c10193s.f30258C0 = null;
        c10193s.f30259D0 = null;
        c10193s.f30260E0 = null;
        c10193s.f30261F0 = bool;
        c10193s.f30262G0 = bool;
        c10193s.f30263H0 = c10241u;
        c10193s.f30264I0 = fValueOf;
        c10193s.f30265J0 = null;
        c10193s.f30278W0 = 1;
        c10193s.f30266K0 = null;
        c10193s.f30267L0 = null;
        c10193s.f30268M0 = fValueOf;
        c10193s.f30269N0 = null;
        c10193s.f30270O0 = fValueOf;
        c10193s.f30279X0 = 1;
        c10193s.f30281Y0 = 1;
        return c10193s;
    }

    public final Object clone() {
        C10193S c10193s = (C10193S) super.clone();
        C10173D[] c10173dArr = this.f30288t0;
        if (c10173dArr != null) {
            c10193s.f30288t0 = (C10173D[]) c10173dArr.clone();
        }
        return c10193s;
    }
}
