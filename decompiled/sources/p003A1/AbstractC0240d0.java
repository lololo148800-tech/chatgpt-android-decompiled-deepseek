package p003A1;

import android.graphics.Rect;
import android.graphics.Region;
import android.os.Binder;
import android.os.Build;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import android.view.View;
import com.google.protobuf.AbstractC12107L1;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC16544l;
import mm.InterfaceC17302e;
import p025An.C0644w;
import p049Bm.InterfaceC1436k;
import p1095x1.AbstractC21075b0;
import p1095x1.InterfaceC21098s;
import p1140z1.AbstractC21678Y;
import p1140z1.AbstractC21690f;
import p1140z1.C21658D;
import p156G1.AbstractC2962i;
import p156G1.C2954a;
import p156G1.C2960g;
import p156G1.C2963j;
import p156G1.C2968o;
import p156G1.C2969p;
import p156G1.C2971r;
import p156G1.C2974u;
import p204I1.C3578I;
import p349O0.C5975S;
import p492U1.EnumC7546k;
import p523V9.AbstractC7902H5;
import p563X1.AbstractC9029i;
import p586Y0.InterfaceC9564p;
import p615Z6.C10235r;
import p635a1.AbstractC10458p;
import p692d0.AbstractC12972k;
import p692d0.C12982u;
import p759g1.AbstractC13799a;
import p759g1.C13801c;
import p759g1.C13802d;
import p759g1.C13803e;
import p774h1.AbstractC14332J;
import p774h1.AbstractC14334L;
import p774h1.C14329G;
import p774h1.C14330H;
import p774h1.C14331I;
import p774h1.C14353i;
import p774h1.InterfaceC14333K;

/* JADX INFO: renamed from: A1.d0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0240d0 implements InterfaceC0158C1 {

    /* JADX INFO: renamed from: a */
    public static final Class[] f892a = {Serializable.class, Parcelable.class, String.class, SparseArray.class, Binder.class, Size.class, SizeF.class};

    /* JADX INFO: renamed from: b */
    public static final C13801c f893b = new C13801c(0.0f, 0.0f, 10.0f, 10.0f);

    /* JADX INFO: renamed from: a */
    public static final boolean m790a(C2968o c2968o) {
        return !c2968o.m3798i().f8880Y.containsKey(C2971r.f8923i);
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m791b(C2968o c2968o) {
        return c2968o.f8888c.f68634E0 == EnumC7546k.f23905Z;
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m792c(Object obj) {
        if (obj instanceof InterfaceC9564p) {
            InterfaceC9564p interfaceC9564p = (InterfaceC9564p) obj;
            if (interfaceC9564p.mo6406b() != C5975S.f19445o0 && interfaceC9564p.mo6406b() != C5975S.f19448r0 && interfaceC9564p.mo6406b() != C5975S.f19446p0) {
                return false;
            }
            Object value = interfaceC9564p.getValue();
            if (value == null) {
                return true;
            }
            return m792c(value);
        }
        if ((obj instanceof InterfaceC17302e) && (obj instanceof Serializable)) {
            return false;
        }
        Class[] clsArr = f892a;
        for (int i10 = 0; i10 < 7; i10++) {
            if (clsArr[i10].isInstance(obj)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    public static final int m793d(float f10) {
        return ((int) (f10 >= 0.0f ? Math.ceil(f10) : Math.floor(f10))) * (-1);
    }

    /* JADX INFO: renamed from: e */
    public static final float m794e(float[] fArr, int i10, float[] fArr2, int i11) {
        int i12 = i10 * 4;
        return (fArr[i12 + 3] * fArr2[12 + i11]) + (fArr[i12 + 2] * fArr2[8 + i11]) + (fArr[i12 + 1] * fArr2[4 + i11]) + (fArr[i12] * fArr2[i11]);
    }

    /* JADX INFO: renamed from: f */
    public static final C12982u m795f(C2969p c2969p) {
        C2968o c2968oM3805a = c2969p.m3805a();
        C12982u c12982u = AbstractC12972k.f41182a;
        C12982u c12982u2 = new C12982u();
        C21658D c21658d = c2968oM3805a.f8888c;
        if (c21658d.m22025W() && c21658d.m22024V()) {
            C13801c c13801cM3795e = c2968oM3805a.m3795e();
            m796g(new Region(Math.round(c13801cM3795e.f43586a), Math.round(c13801cM3795e.f43587b), Math.round(c13801cM3795e.f43588c), Math.round(c13801cM3795e.f43589d)), c2968oM3805a, c12982u2, c2968oM3805a, new Region());
        }
        return c12982u2;
    }

    /* JADX INFO: renamed from: g */
    public static final void m796g(Region region, C2968o c2968o, C12982u c12982u, C2968o c2968o2, Region region2) {
        C21658D c21658d;
        Object objM8206k;
        boolean zM22025W = c2968o2.f8888c.m22025W();
        C21658D c21658d2 = c2968o2.f8888c;
        boolean z6 = (zM22025W && c21658d2.m22024V()) ? false : true;
        boolean zIsEmpty = region.isEmpty();
        int i10 = c2968o.f8892g;
        int i11 = c2968o2.f8892g;
        if (!zIsEmpty || i11 == i10) {
            if (!z6 || c2968o2.f8890e) {
                C2963j c2963j = c2968o2.f8889d;
                boolean z10 = c2963j.f8881Z;
                Object obj = c2968o2.f8886a;
                if (z10 && (objM8206k = AbstractC7902H5.m8206k(c21658d2)) != null) {
                    obj = objM8206k;
                }
                AbstractC10458p abstractC10458p = ((AbstractC10458p) obj).f30960Y;
                Object obj2 = c2963j.f8880Y.get(AbstractC2962i.f8855b);
                if (obj2 == null) {
                    obj2 = null;
                }
                boolean z11 = obj2 != null;
                boolean z12 = abstractC10458p.f30960Y.f30972y0;
                C13801c c13801c = C13801c.f43585e;
                if (z12) {
                    if (z11) {
                        AbstractC21678Y abstractC21678YM22215t = AbstractC21690f.m22215t(abstractC10458p, 8);
                        if (abstractC21678YM22215t.mo22159J0().f30972y0) {
                            InterfaceC21098s interfaceC21098sM21568i = AbstractC21075b0.m21568i(abstractC21678YM22215t);
                            C10235r c10235r = abstractC21678YM22215t.f68812K0;
                            if (c10235r == null) {
                                c10235r = new C10235r();
                                c10235r.f30390b = 0.0f;
                                c10235r.f30391c = 0.0f;
                                c10235r.f30392d = 0.0f;
                                c10235r.f30393e = 0.0f;
                                abstractC21678YM22215t.f68812K0 = c10235r;
                            }
                            long jM22183z0 = abstractC21678YM22215t.m22183z0(abstractC21678YM22215t.m22158I0());
                            c10235r.f30390b = -C13803e.m15333e(jM22183z0);
                            c10235r.f30391c = -C13803e.m15331c(jM22183z0);
                            c10235r.f30392d = C13803e.m15333e(jM22183z0) + abstractC21678YM22215t.mo21549L();
                            c10235r.f30393e = C13803e.m15331c(jM22183z0) + abstractC21678YM22215t.mo21548K();
                            while (true) {
                                if (abstractC21678YM22215t == interfaceC21098sM21568i) {
                                    c13801c = new C13801c(c10235r.f30390b, c10235r.f30391c, c10235r.f30392d, c10235r.f30393e);
                                    break;
                                }
                                abstractC21678YM22215t.m22173X0(c10235r, false, true);
                                if (c10235r.m10795b()) {
                                    break;
                                }
                                abstractC21678YM22215t = abstractC21678YM22215t.f68821z0;
                                AbstractC16544l.m18091d(abstractC21678YM22215t);
                            }
                        }
                    } else {
                        AbstractC21678Y abstractC21678YM22215t2 = AbstractC21690f.m22215t(abstractC10458p, 8);
                        c13801c = AbstractC21075b0.m21568i(abstractC21678YM22215t2).mo21528y(abstractC21678YM22215t2, true);
                    }
                }
                int iRound = Math.round(c13801c.f43586a);
                int iRound2 = Math.round(c13801c.f43587b);
                int iRound3 = Math.round(c13801c.f43588c);
                int iRound4 = Math.round(c13801c.f43589d);
                region2.set(iRound, iRound2, iRound3, iRound4);
                if (i11 == i10) {
                    i11 = -1;
                }
                if (!region2.op(region, Region.Op.INTERSECT)) {
                    if (c2968o2.f8890e) {
                        C2968o c2968oM3799j = c2968o2.m3799j();
                        C13801c c13801cM3795e = (c2968oM3799j == null || (c21658d = c2968oM3799j.f8888c) == null || !c21658d.m22025W()) ? f893b : c2968oM3799j.m3795e();
                        c12982u.m14697i(i11, new C0297v1(c2968o2, new Rect(Math.round(c13801cM3795e.f43586a), Math.round(c13801cM3795e.f43587b), Math.round(c13801cM3795e.f43588c), Math.round(c13801cM3795e.f43589d))));
                        return;
                    } else {
                        if (i11 == -1) {
                            c12982u.m14697i(i11, new C0297v1(c2968o2, region2.getBounds()));
                            return;
                        }
                        return;
                    }
                }
                c12982u.m14697i(i11, new C0297v1(c2968o2, region2.getBounds()));
                List listM3790h = C2968o.m3790h(c2968o2, true, 4);
                for (int size = listM3790h.size() - 1; -1 < size; size--) {
                    m796g(region, c2968o, c12982u, (C2968o) listM3790h.get(size), region2);
                }
                if (m799j(c2968o2)) {
                    region.op(iRound, iRound2, iRound3, iRound4, Region.Op.DIFFERENCE);
                }
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public static final C3578I m797h(C2963j c2963j) {
        InterfaceC1436k interfaceC1436k;
        ArrayList arrayList = new ArrayList();
        Object obj = c2963j.f8880Y.get(AbstractC2962i.f8854a);
        if (obj == null) {
            obj = null;
        }
        C2954a c2954a = (C2954a) obj;
        if (c2954a == null || (interfaceC1436k = (InterfaceC1436k) c2954a.f8838b) == null || !((Boolean) interfaceC1436k.invoke(arrayList)).booleanValue()) {
            return null;
        }
        return (C3578I) arrayList.get(0);
    }

    /* JADX INFO: renamed from: i */
    public static final boolean m798i(float[] fArr, float[] fArr2) {
        float f10 = fArr[0];
        float f11 = fArr[1];
        float f12 = fArr[2];
        float f13 = fArr[3];
        float f14 = fArr[4];
        float f15 = fArr[5];
        float f16 = fArr[6];
        float f17 = fArr[7];
        float f18 = fArr[8];
        float f19 = fArr[9];
        float f20 = fArr[10];
        float f21 = fArr[11];
        float f22 = fArr[12];
        float f23 = fArr[13];
        float f24 = fArr[14];
        float f25 = fArr[15];
        float f26 = (f10 * f15) - (f11 * f14);
        float f27 = (f10 * f16) - (f12 * f14);
        float f28 = (f10 * f17) - (f13 * f14);
        float f29 = (f11 * f16) - (f12 * f15);
        float f30 = (f11 * f17) - (f13 * f15);
        float f31 = (f12 * f17) - (f13 * f16);
        float f32 = (f18 * f23) - (f19 * f22);
        float f33 = (f18 * f24) - (f20 * f22);
        float f34 = (f18 * f25) - (f21 * f22);
        float f35 = (f19 * f24) - (f20 * f23);
        float f36 = (f19 * f25) - (f21 * f23);
        float f37 = (f20 * f25) - (f21 * f24);
        float f38 = (f31 * f32) + (((f29 * f34) + ((f28 * f35) + ((f26 * f37) - (f27 * f36)))) - (f30 * f33));
        if (f38 == 0.0f) {
            return false;
        }
        float f39 = 1.0f / f38;
        fArr2[0] = ((f17 * f35) + ((f15 * f37) - (f16 * f36))) * f39;
        fArr2[1] = (((f12 * f36) + ((-f11) * f37)) - (f13 * f35)) * f39;
        fArr2[2] = ((f25 * f29) + ((f23 * f31) - (f24 * f30))) * f39;
        fArr2[3] = (((f20 * f30) + ((-f19) * f31)) - (f21 * f29)) * f39;
        float f40 = -f14;
        fArr2[4] = (((f16 * f34) + (f40 * f37)) - (f17 * f33)) * f39;
        fArr2[5] = ((f13 * f33) + ((f37 * f10) - (f12 * f34))) * f39;
        float f41 = -f22;
        fArr2[6] = (((f24 * f28) + (f41 * f31)) - (f25 * f27)) * f39;
        fArr2[7] = ((f21 * f27) + ((f31 * f18) - (f20 * f28))) * f39;
        fArr2[8] = ((f17 * f32) + ((f14 * f36) - (f15 * f34))) * f39;
        fArr2[9] = (((f34 * f11) + ((-f10) * f36)) - (f13 * f32)) * f39;
        fArr2[10] = ((f25 * f26) + ((f22 * f30) - (f23 * f28))) * f39;
        fArr2[11] = (((f28 * f19) + ((-f18) * f30)) - (f21 * f26)) * f39;
        fArr2[12] = (((f15 * f33) + (f40 * f35)) - (f16 * f32)) * f39;
        fArr2[13] = ((f12 * f32) + ((f10 * f35) - (f11 * f33))) * f39;
        fArr2[14] = (((f23 * f27) + (f41 * f29)) - (f24 * f26)) * f39;
        fArr2[15] = ((f20 * f26) + ((f18 * f29) - (f19 * f27))) * f39;
        return true;
    }

    /* JADX INFO: renamed from: j */
    public static final boolean m799j(C2968o c2968o) {
        if (m802m(c2968o)) {
            C2963j c2963j = c2968o.f8889d;
            if (!c2963j.f8881Z) {
                Set setKeySet = c2963j.f8880Y.keySet();
                if (!(setKeySet instanceof Collection) || !setKeySet.isEmpty()) {
                    Iterator it = setKeySet.iterator();
                    while (it.hasNext()) {
                        if (((C2974u) it.next()).f8945c) {
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: k */
    public static final boolean m800k(AbstractC14332J abstractC14332J, float f10, float f11, InterfaceC14333K interfaceC14333K, InterfaceC14333K interfaceC14333K2) {
        boolean zM803n;
        if (!(abstractC14332J instanceof C14330H)) {
            if (!(abstractC14332J instanceof C14331I)) {
                if (abstractC14332J instanceof C14329G) {
                    return m801l(((C14329G) abstractC14332J).f44969a, f10, f11, interfaceC14333K, interfaceC14333K2);
                }
                throw new C0644w();
            }
            C13802d c13802d = ((C14331I) abstractC14332J).f44971a;
            float f12 = c13802d.f43590a;
            if (f10 < f12) {
                return false;
            }
            float f13 = c13802d.f43592c;
            if (f10 >= f13) {
                return false;
            }
            float f14 = c13802d.f43591b;
            if (f11 < f14) {
                return false;
            }
            float f15 = c13802d.f43593d;
            if (f11 >= f15) {
                return false;
            }
            long j10 = c13802d.f43594e;
            float fM15297b = AbstractC13799a.m15297b(j10);
            long j11 = c13802d.f43595f;
            if (AbstractC13799a.m15297b(j11) + fM15297b <= c13802d.m15328b()) {
                long j12 = c13802d.f43597h;
                float fM15297b2 = AbstractC13799a.m15297b(j12);
                long j13 = c13802d.f43596g;
                if (AbstractC13799a.m15297b(j13) + fM15297b2 <= c13802d.m15328b()) {
                    if (AbstractC13799a.m15298c(j12) + AbstractC13799a.m15298c(j10) <= c13802d.m15327a()) {
                        if (AbstractC13799a.m15298c(j13) + AbstractC13799a.m15298c(j11) <= c13802d.m15327a()) {
                            float fM15297b3 = AbstractC13799a.m15297b(j10) + f12;
                            float fM15298c = AbstractC13799a.m15298c(j10) + f14;
                            float fM15297b4 = f13 - AbstractC13799a.m15297b(j11);
                            float fM15298c2 = f14 + AbstractC13799a.m15298c(j11);
                            float fM15297b5 = f13 - AbstractC13799a.m15297b(j13);
                            float fM15298c3 = f15 - AbstractC13799a.m15298c(j13);
                            float fM15298c4 = f15 - AbstractC13799a.m15298c(j12);
                            float fM15297b6 = AbstractC13799a.m15297b(j12) + f12;
                            if (f10 < fM15297b3 && f11 < fM15298c) {
                                zM803n = m803n(f10, f11, c13802d.f43594e, fM15297b3, fM15298c);
                            } else if (f10 < fM15297b6 && f11 > fM15298c4) {
                                zM803n = m803n(f10, f11, c13802d.f43597h, fM15297b6, fM15298c4);
                            } else if (f10 > fM15297b4 && f11 < fM15298c2) {
                                zM803n = m803n(f10, f11, c13802d.f43595f, fM15297b4, fM15298c2);
                            } else if (f10 > fM15297b5 && f11 > fM15298c3) {
                                zM803n = m803n(f10, f11, c13802d.f43596g, fM15297b5, fM15298c3);
                            }
                            return zM803n;
                        }
                    }
                }
            }
            InterfaceC14333K interfaceC14333KM15631i = interfaceC14333K2 == null ? AbstractC14334L.m15631i() : interfaceC14333K2;
            AbstractC12107L1.m13812c(interfaceC14333KM15631i, c13802d);
            return m801l(interfaceC14333KM15631i, f10, f11, interfaceC14333K, interfaceC14333K2);
        }
        C13801c c13801c = ((C14330H) abstractC14332J).f44970a;
        if (c13801c.f43586a > f10 || f10 >= c13801c.f43588c || c13801c.f43587b > f11 || f11 >= c13801c.f43589d) {
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: l */
    public static final boolean m801l(InterfaceC14333K interfaceC14333K, float f10, float f11, InterfaceC14333K interfaceC14333K2, InterfaceC14333K interfaceC14333K3) {
        C13801c c13801c = new C13801c(f10 - 0.005f, f11 - 0.005f, f10 + 0.005f, f11 + 0.005f);
        if (interfaceC14333K2 == null) {
            interfaceC14333K2 = AbstractC14334L.m15631i();
        }
        AbstractC12107L1.m13811b(interfaceC14333K2, c13801c);
        if (interfaceC14333K3 == null) {
            interfaceC14333K3 = AbstractC14334L.m15631i();
        }
        C14353i c14353i = (C14353i) interfaceC14333K3;
        c14353i.m15732d(interfaceC14333K, interfaceC14333K2, 1);
        boolean zIsEmpty = c14353i.f45039a.isEmpty();
        c14353i.m15733e();
        ((C14353i) interfaceC14333K2).m15733e();
        return !zIsEmpty;
    }

    /* JADX INFO: renamed from: m */
    public static final boolean m802m(C2968o c2968o) {
        AbstractC21678Y abstractC21678YM3793c = c2968o.m3793c();
        if (abstractC21678YM3793c != null ? abstractC21678YM3793c.m22166Q0() : false) {
            return false;
        }
        return !c2968o.f8889d.f8880Y.containsKey(C2971r.f8927m);
    }

    /* JADX INFO: renamed from: n */
    public static final boolean m803n(float f10, float f11, long j10, float f12, float f13) {
        float f14 = f10 - f12;
        float f15 = f11 - f13;
        float fM15297b = AbstractC13799a.m15297b(j10);
        float fM15298c = AbstractC13799a.m15298c(j10);
        return ((f15 * f15) / (fM15298c * fM15298c)) + ((f14 * f14) / (fM15297b * fM15297b)) <= 1.0f;
    }

    /* JADX INFO: renamed from: o */
    public static final void m804o(float[] fArr, float[] fArr2) {
        float fM794e = m794e(fArr2, 0, fArr, 0);
        float fM794e2 = m794e(fArr2, 0, fArr, 1);
        float fM794e3 = m794e(fArr2, 0, fArr, 2);
        float fM794e4 = m794e(fArr2, 0, fArr, 3);
        float fM794e5 = m794e(fArr2, 1, fArr, 0);
        float fM794e6 = m794e(fArr2, 1, fArr, 1);
        float fM794e7 = m794e(fArr2, 1, fArr, 2);
        float fM794e8 = m794e(fArr2, 1, fArr, 3);
        float fM794e9 = m794e(fArr2, 2, fArr, 0);
        float fM794e10 = m794e(fArr2, 2, fArr, 1);
        float fM794e11 = m794e(fArr2, 2, fArr, 2);
        float fM794e12 = m794e(fArr2, 2, fArr, 3);
        float fM794e13 = m794e(fArr2, 3, fArr, 0);
        float fM794e14 = m794e(fArr2, 3, fArr, 1);
        float fM794e15 = m794e(fArr2, 3, fArr, 2);
        float fM794e16 = m794e(fArr2, 3, fArr, 3);
        fArr[0] = fM794e;
        fArr[1] = fM794e2;
        fArr[2] = fM794e3;
        fArr[3] = fM794e4;
        fArr[4] = fM794e5;
        fArr[5] = fM794e6;
        fArr[6] = fM794e7;
        fArr[7] = fM794e8;
        fArr[8] = fM794e9;
        fArr[9] = fM794e10;
        fArr[10] = fM794e11;
        fArr[11] = fM794e12;
        fArr[12] = fM794e13;
        fArr[13] = fM794e14;
        fArr[14] = fM794e15;
        fArr[15] = fM794e16;
    }

    /* JADX INFO: renamed from: p */
    public static final AbstractC9029i m805p(C0151A0 c0151a0, int i10) {
        Object next;
        Iterator<T> it = c0151a0.getLayoutNodeToHolder().entrySet().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((C21658D) ((Map.Entry) next).getKey()).f68651Z != i10);
        Map.Entry entry = (Map.Entry) next;
        if (entry != null) {
            return (AbstractC9029i) entry.getValue();
        }
        return null;
    }

    /* JADX INFO: renamed from: q */
    public static final String m806q(Object obj) {
        return (obj.getClass().isAnonymousClass() ? obj.getClass().getName() : obj.getClass().getSimpleName()) + '@' + String.format("%07x", Arrays.copyOf(new Object[]{Integer.valueOf(System.identityHashCode(obj))}, 1));
    }

    /* JADX INFO: renamed from: r */
    public static final String m807r(int i10) {
        if (C2960g.m3783a(i10, 0)) {
            return "android.widget.Button";
        }
        if (C2960g.m3783a(i10, 1)) {
            return "android.widget.CheckBox";
        }
        if (C2960g.m3783a(i10, 3)) {
            return "android.widget.RadioButton";
        }
        if (C2960g.m3783a(i10, 5)) {
            return "android.widget.ImageView";
        }
        if (C2960g.m3783a(i10, 6)) {
            return "android.widget.Spinner";
        }
        return null;
    }

    /* JADX INFO: renamed from: s */
    public static void m808s(View view) {
        try {
            if (!C0170G1.f653G0) {
                C0170G1.f653G0 = true;
                if (Build.VERSION.SDK_INT < 28) {
                    C0170G1.f651E0 = View.class.getDeclaredMethod("updateDisplayListIfDirty", null);
                    C0170G1.f652F0 = View.class.getDeclaredField("mRecreateDisplayList");
                } else {
                    C0170G1.f651E0 = (Method) Class.class.getDeclaredMethod("getDeclaredMethod", String.class, new Class[0].getClass()).invoke(View.class, "updateDisplayListIfDirty", new Class[0]);
                    C0170G1.f652F0 = (Field) Class.class.getDeclaredMethod("getDeclaredField", String.class).invoke(View.class, "mRecreateDisplayList");
                }
                Method method = C0170G1.f651E0;
                if (method != null) {
                    method.setAccessible(true);
                }
                Field field = C0170G1.f652F0;
                if (field != null) {
                    field.setAccessible(true);
                }
            }
            Field field2 = C0170G1.f652F0;
            if (field2 != null) {
                field2.setBoolean(view, true);
            }
            Method method2 = C0170G1.f651E0;
            if (method2 != null) {
                method2.invoke(view, null);
            }
        } catch (Throwable unused) {
            C0170G1.f654H0 = true;
        }
    }
}
