package bj;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Arrays;
import p026Ao.InterfaceC0677k;
import p232J3.C4206F;
import p571X9.AbstractC9306j0;
import p582Xk.HXHG.TfazcFv;

/* JADX INFO: renamed from: bj.x */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC11477x implements Closeable {

    /* JADX INFO: renamed from: Y */
    public int f34697Y;

    /* JADX INFO: renamed from: Z */
    public int[] f34698Z;

    /* JADX INFO: renamed from: o0 */
    public String[] f34699o0;

    /* JADX INFO: renamed from: p0 */
    public int[] f34700p0;

    /* JADX INFO: renamed from: q0 */
    public boolean f34701q0;

    /* JADX INFO: renamed from: r0 */
    public boolean f34702r0;

    public AbstractC11477x() {
        this.f34698Z = new int[32];
        this.f34699o0 = new String[32];
        this.f34700p0 = new int[32];
    }

    /* JADX INFO: renamed from: C0 */
    public abstract int mo12799C0(C11475v c11475v);

    /* JADX INFO: renamed from: D */
    public abstract void mo12800D();

    /* JADX INFO: renamed from: E */
    public final String m12867E() {
        return AbstractC11452Q.m12854c(this.f34697Y, this.f34698Z, this.f34699o0, this.f34700p0);
    }

    /* JADX INFO: renamed from: E0 */
    public abstract long mo12801E0();

    /* JADX INFO: renamed from: H0 */
    public abstract void mo12802H0();

    /* JADX INFO: renamed from: J0 */
    public final void m12868J0(String str) throws C4206F {
        StringBuilder sbM9895n = AbstractC9306j0.m9895n(str, " at path ");
        sbM9895n.append(m12867E());
        throw new C4206F(sbM9895n.toString());
    }

    /* JADX INFO: renamed from: N0 */
    public final C11473t m12869N0(Object obj, Object obj2) {
        if (obj == null) {
            return new C11473t("Expected " + obj2 + " but was null at path " + m12867E());
        }
        return new C11473t("Expected " + obj2 + " but was " + obj + ", a " + obj.getClass().getName() + ", at path " + m12867E());
    }

    /* JADX INFO: renamed from: O */
    public abstract double mo12803O();

    /* JADX INFO: renamed from: P */
    public abstract InterfaceC0677k mo12804P();

    /* JADX INFO: renamed from: S */
    public abstract EnumC11476w mo12805S();

    /* JADX INFO: renamed from: S0 */
    public abstract boolean mo12806S0();

    /* JADX INFO: renamed from: T */
    public abstract AbstractC11477x mo12807T();

    /* JADX INFO: renamed from: W */
    public abstract void mo12809W();

    /* JADX INFO: renamed from: a */
    public abstract void mo12812a();

    /* JADX INFO: renamed from: a0 */
    public abstract String mo12813a0();

    /* JADX INFO: renamed from: e */
    public abstract void mo12814e();

    /* JADX INFO: renamed from: e0 */
    public abstract void mo12815e0();

    /* JADX INFO: renamed from: g0 */
    public abstract int mo12816g0();

    public abstract boolean hasNext();

    /* JADX INFO: renamed from: j0 */
    public final void m12870j0(int i10) {
        int i11 = this.f34697Y;
        int[] iArr = this.f34698Z;
        if (i11 == iArr.length) {
            if (i11 == 256) {
                throw new C11473t("Nesting too deep at " + m12867E());
            }
            this.f34698Z = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.f34699o0;
            this.f34699o0 = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
            int[] iArr2 = this.f34700p0;
            this.f34700p0 = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.f34698Z;
        int i12 = this.f34697Y;
        this.f34697Y = i12 + 1;
        iArr3[i12] = i10;
    }

    /* JADX INFO: renamed from: k */
    public abstract void mo12817k();

    /* JADX INFO: renamed from: m */
    public abstract void mo12818m();

    /* JADX INFO: renamed from: v0 */
    public abstract int mo12819v0(C11475v c11475v);

    /* JADX INFO: renamed from: x */
    public abstract String mo12820x();

    /* JADX INFO: renamed from: r0 */
    public final Object m12871r0() {
        int iOrdinal = mo12805S().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 2) {
                if (iOrdinal != 5) {
                    if (iOrdinal != 6) {
                        if (iOrdinal != 7) {
                            if (iOrdinal == 8) {
                                mo12815e0();
                                return null;
                            }
                            throw new IllegalStateException(TfazcFv.igKbxdp + mo12805S() + " at path " + m12867E());
                        }
                        return Boolean.valueOf(mo12806S0());
                    }
                    return Double.valueOf(mo12803O());
                }
                return mo12820x();
            }
            C11444I c11444i = new C11444I();
            mo12814e();
            while (hasNext()) {
                String strMo12813a0 = mo12813a0();
                Object objM12871r0 = m12871r0();
                Object objPut = c11444i.put(strMo12813a0, objM12871r0);
                if (objPut != null) {
                    StringBuilder sbM11058p = AbstractC10763a.m11058p("Map key '", strMo12813a0, "' has multiple values at path ");
                    sbM11058p.append(m12867E());
                    sbM11058p.append(": ");
                    sbM11058p.append(objPut);
                    sbM11058p.append(" and ");
                    sbM11058p.append(objM12871r0);
                    throw new C11473t(sbM11058p.toString());
                }
            }
            mo12818m();
            return c11444i;
        }
        ArrayList arrayList = new ArrayList();
        mo12812a();
        while (hasNext()) {
            arrayList.add(m12871r0());
        }
        mo12817k();
        return arrayList;
    }

    public AbstractC11477x(AbstractC11477x abstractC11477x) {
        this.f34697Y = abstractC11477x.f34697Y;
        this.f34698Z = (int[]) abstractC11477x.f34698Z.clone();
        this.f34699o0 = (String[]) abstractC11477x.f34699o0.clone();
        this.f34700p0 = (int[]) abstractC11477x.f34700p0.clone();
        this.f34701q0 = abstractC11477x.f34701q0;
        this.f34702r0 = abstractC11477x.f34702r0;
    }
}
