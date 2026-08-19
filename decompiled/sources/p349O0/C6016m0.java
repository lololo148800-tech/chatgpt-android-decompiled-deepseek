package p349O0;

import android.app.PendingIntent;
import android.content.IntentSender;
import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import kotlin.jvm.internal.C16556x;
import mm.C17296C;
import p001A.AbstractC0010F;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p080D0.C1766B0;
import p080D0.C1831t0;
import p1036u9.C20168n;
import p1071w0.C20710G0;
import p1071w0.C20724N0;
import p1071w0.C20745e;
import p1071w0.C20780v0;
import p1081wc.C20887f;
import p1081wc.InterfaceC20904w;
import p1095x1.AbstractC21068W;
import p1095x1.AbstractC21069X;
import p1113xn.AbstractC21322p;
import p204I1.C3578I;
import p204I1.C3581L;
import p204I1.C3590f;
import p221Ii.C3727f;
import p228J.AbstractC3794B0;
import p229J0.C3974R1;
import p334Na.C5694a;
import p334Na.C5697d;
import p350O1.C6045C;
import p350O1.C6052a;
import p350O1.C6064m;
import p374P5.C6358k;
import p385Pj.C6427b;
import p530Vi.AbstractC8301I;
import p571X9.AbstractC9393x3;
import p692d0.C12948A;
import p692d0.C12951D;
import p773h0.C14246A0;
import p810ig.AbstractC14993l;
import p841k.C16288h;
import p841k.C16290j;
import p869ld.C16843a;
import p893n.AbstractActivityC17375g;
import p909nm.C17690x;

/* JADX INFO: renamed from: O0.m0 */
/* JADX INFO: loaded from: classes.dex */
public final class C6016m0 extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f19522Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ int f19523Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ Object f19524o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ Object f19525p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6016m0(int i10, C6358k c6358k, C5697d c5697d, AbstractActivityC17375g abstractActivityC17375g) {
        super(1);
        this.f19522Y = 3;
        this.f19523Z = i10;
        this.f19524o0 = c6358k;
        this.f19525p0 = abstractActivityC17375g;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:324:0x06bc  */
    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        int i10;
        InterfaceC6023q interfaceC6023q;
        int i11;
        InterfaceC6023q interfaceC6023q2;
        int i12;
        Integer numM2659e;
        Integer numM2658d;
        Integer numM2658d2;
        Integer numM2659e2;
        C3578I c3578i;
        C3578I c3578i2;
        C20710G0 c20710g0;
        C20710G0 c20710g1;
        C3578I c3578i3;
        C3578I c3578i4;
        C20710G0 c20710g2;
        C20710G0 c20710g3;
        Integer numM2658d3;
        Integer numM2659e3;
        Integer numM2659e4;
        Integer numM2658d4;
        C20168n c20168n;
        int i13 = 8;
        int i14 = 4;
        C6045C c6045c = null;
        int i15 = 2;
        C17296C c17296c = C17296C.f55119a;
        Object obj2 = this.f19525p0;
        Object obj3 = this.f19524o0;
        int i16 = this.f19523Z;
        int i17 = 1;
        switch (this.f19522Y) {
            case 0:
                int i18 = 0;
                InterfaceC6023q interfaceC6023q3 = (InterfaceC6023q) obj;
                C6018n0 c6018n0 = (C6018n0) obj3;
                if (c6018n0.f19537e == i16) {
                    C12948A c12948a = (C12948A) obj2;
                    if (AbstractC16544l.m18089b(c12948a, c6018n0.f19538f) && (interfaceC6023q3 instanceof C6029t)) {
                        long[] jArr = c12948a.f41109a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i19 = 0;
                            while (true) {
                                long j10 = jArr[i19];
                                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i20 = 8 - ((~(i19 - length)) >>> 31);
                                    long j11 = j10;
                                    int i21 = i18;
                                    while (i21 < i20) {
                                        if ((j11 & 255) < 128) {
                                            int i22 = (i19 << 3) + i21;
                                            Object obj4 = c12948a.f41110b[i22];
                                            boolean z6 = c12948a.f41111c[i22] != i16;
                                            if (z6) {
                                                C6029t c6029t = (C6029t) interfaceC6023q3;
                                                c6029t.f19622s0.m14922b0(obj4, c6018n0);
                                                if (obj4 instanceof C5944C) {
                                                    C5944C c5944c = (C5944C) obj4;
                                                    interfaceC6023q2 = interfaceC6023q3;
                                                    if (!((C12951D) c6029t.f19622s0.f42001Y).m14616b(c5944c)) {
                                                        c6029t.f19625v0.m14923c0(c5944c);
                                                    }
                                                    C12951D c12951d = c6018n0.f19539g;
                                                    if (c12951d != null) {
                                                        c12951d.m14621g(obj4);
                                                    }
                                                } else {
                                                    interfaceC6023q2 = interfaceC6023q3;
                                                }
                                            } else {
                                                interfaceC6023q2 = interfaceC6023q3;
                                            }
                                            if (z6) {
                                                c12948a.m14605e(i22);
                                            }
                                            i12 = 8;
                                        } else {
                                            interfaceC6023q2 = interfaceC6023q3;
                                            i12 = i13;
                                        }
                                        j11 >>= i12;
                                        i21++;
                                        interfaceC6023q3 = interfaceC6023q2;
                                        i17 = 1;
                                        i13 = i12;
                                    }
                                    i10 = i13;
                                    interfaceC6023q = interfaceC6023q3;
                                    i11 = i17;
                                    if (i20 == i10) {
                                    }
                                } else {
                                    i10 = i13;
                                    interfaceC6023q = interfaceC6023q3;
                                    i11 = i17;
                                }
                                if (i19 != length) {
                                    i19 += i11;
                                    interfaceC6023q3 = interfaceC6023q;
                                    i17 = i11;
                                    i18 = 0;
                                    i13 = i10;
                                }
                            }
                        }
                    }
                }
                return c17296c;
            case 1:
                AbstractC21068W abstractC21068W = (AbstractC21068W) obj;
                C14246A0 c14246a0 = (C14246A0) obj3;
                int iM8921l = AbstractC8301I.m8921l(c14246a0.f44708z0.f44952a.m6412g(), 0, i16);
                int i23 = c14246a0.f44706A0 ? iM8921l - i16 : -iM8921l;
                boolean z10 = c14246a0.f44707B0;
                int i24 = z10 ? 0 : i23;
                if (!z10) {
                    i23 = 0;
                }
                C3974R1 c3974r1 = new C3974R1((AbstractC21069X) obj2, i24, i23, 1);
                abstractC21068W.f66980a = true;
                c3974r1.invoke(abstractC21068W);
                abstractC21068W.f66980a = false;
                return c17296c;
            case 2:
                String value = (String) obj;
                AbstractC16544l.m18094g(value, "value");
                String strM21709q0 = AbstractC21322p.m21709q0(i16, AbstractC14993l.m16133d(value));
                ((InterfaceC1436k) obj3).invoke(strM21709q0);
                if (strM21709q0.length() == i16) {
                    ((InterfaceC1426a) obj2).invoke();
                }
                return c17296c;
            case 3:
                C5694a c5694a = (C5694a) obj;
                if (c5694a.f18463a == 2) {
                    Integer num = c5694a.f18464b;
                    if (num == null) {
                        num = 0;
                    }
                    if (num.intValue() >= i16) {
                        byte b = (byte) (((byte) (0 | 1)) | 2);
                        if (b != 3) {
                            StringBuilder sb2 = new StringBuilder();
                            if ((b & 1) == 0) {
                                sb2.append(" appUpdateType");
                            }
                            if ((b & 2) == 0) {
                                sb2.append(" allowAssetPackDeletion");
                            }
                            throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
                        }
                        PendingIntent pendingIntent = c5694a.f18465c;
                        if ((pendingIntent != null ? pendingIntent : null) != null) {
                            C6358k c6358k = (C6358k) obj3;
                            ((InterfaceC20904w) c6358k.f20695o0).mo21448b(C20887f.f66529d, "Start update", C17690x.f56481Y);
                            AbstractActivityC17375g abstractActivityC17375g = (AbstractActivityC17375g) obj2;
                            C16288h c16288hM15531d = abstractActivityC17375g.f32069u0.m15531d(AbstractC3794B0.m4498w("toString(...)"), new C6427b(i13), new C16843a(c6358k));
                            abstractActivityC17375g.f55801Y.mo7806a(new C3727f(c16288hM15531d, i14));
                            byte b10 = (byte) (((byte) (0 | 1)) | 2);
                            if (b10 != 3) {
                                StringBuilder sb3 = new StringBuilder();
                                if ((b10 & 1) == 0) {
                                    sb3.append(" appUpdateType");
                                }
                                if ((b10 & 2) == 0) {
                                    sb3.append(" allowAssetPackDeletion");
                                }
                                throw new IllegalStateException("Missing required properties:".concat(sb3.toString()));
                            }
                            if ((pendingIntent != null ? pendingIntent : null) != null && !c5694a.f18466d) {
                                c5694a.f18466d = true;
                                if (pendingIntent == null) {
                                    pendingIntent = null;
                                }
                                IntentSender intentSender = pendingIntent.getIntentSender();
                                AbstractC16544l.m18094g(intentSender, "intentSender");
                                c16288hM15531d.mo10188b(new C16290j(intentSender, null, 0, 0));
                            }
                        }
                    }
                }
                return c17296c;
            case 4:
                AbstractC21068W layout = (AbstractC21068W) obj;
                AbstractC16544l.m18094g(layout, "$this$layout");
                AbstractC21068W.m21537f(layout, (AbstractC21069X) obj3, 0L);
                layout.m21545d((AbstractC21069X) obj2, i16, 0, 0.0f);
                return c17296c;
            default:
                C1831t0 c1831t0 = (C1831t0) obj;
                C20780v0 c20780v0 = (C20780v0) obj3;
                switch (AbstractC0010F.m24h(i16)) {
                    case 0:
                        c1831t0.f5286e.f5041a = null;
                        if (c1831t0.f5288g.f10934Y.length() > 0) {
                            if (C3581L.m4267c(c1831t0.f5287f)) {
                                c1831t0.m2663i();
                            } else if (c1831t0.m2660f()) {
                                int iM4270f = C3581L.m4270f(c1831t0.f5287f);
                                c1831t0.m2670p(iM4270f, iM4270f);
                            } else {
                                int iM4269e = C3581L.m4269e(c1831t0.f5287f);
                                c1831t0.m2670p(iM4269e, iM4269e);
                            }
                        }
                        return c17296c;
                    case 1:
                        c1831t0.f5286e.f5041a = null;
                        if (c1831t0.f5288g.f10934Y.length() > 0) {
                            if (C3581L.m4267c(c1831t0.f5287f)) {
                                c1831t0.m2666l();
                            } else if (c1831t0.m2660f()) {
                                int iM4269e2 = C3581L.m4269e(c1831t0.f5287f);
                                c1831t0.m2670p(iM4269e2, iM4269e2);
                            } else {
                                int iM4270f2 = C3581L.m4270f(c1831t0.f5287f);
                                c1831t0.m2670p(iM4270f2, iM4270f2);
                            }
                        }
                        return c17296c;
                    case 2:
                        C1766B0 c1766b0 = c1831t0.f5286e;
                        c1766b0.f5041a = null;
                        if (c1831t0.f5288g.f10934Y.length() > 0) {
                            if (c1831t0.m2660f()) {
                                c1766b0.f5041a = null;
                                if (c1831t0.f5288g.f10934Y.length() > 0 && (numM2658d = c1831t0.m2658d()) != null) {
                                    int iIntValue = numM2658d.intValue();
                                    c1831t0.m2670p(iIntValue, iIntValue);
                                }
                            } else {
                                c1766b0.f5041a = null;
                                if (c1831t0.f5288g.f10934Y.length() > 0 && (numM2659e = c1831t0.m2659e()) != null) {
                                    int iIntValue2 = numM2659e.intValue();
                                    c1831t0.m2670p(iIntValue2, iIntValue2);
                                }
                            }
                        }
                        return c17296c;
                    case 3:
                        C1766B0 c1766b1 = c1831t0.f5286e;
                        c1766b1.f5041a = null;
                        if (c1831t0.f5288g.f10934Y.length() > 0) {
                            if (c1831t0.m2660f()) {
                                c1766b1.f5041a = null;
                                if (c1831t0.f5288g.f10934Y.length() > 0 && (numM2659e2 = c1831t0.m2659e()) != null) {
                                    int iIntValue3 = numM2659e2.intValue();
                                    c1831t0.m2670p(iIntValue3, iIntValue3);
                                }
                            } else {
                                c1766b1.f5041a = null;
                                if (c1831t0.f5288g.f10934Y.length() > 0 && (numM2658d2 = c1831t0.m2658d()) != null) {
                                    int iIntValue4 = numM2658d2.intValue();
                                    c1831t0.m2670p(iIntValue4, iIntValue4);
                                }
                            }
                        }
                        return c17296c;
                    case 4:
                        c1831t0.m2664j();
                        return c17296c;
                    case 5:
                        c1831t0.m2665k();
                        return c17296c;
                    case 6:
                        c1831t0.m2668n();
                        return c17296c;
                    case 7:
                        c1831t0.m2667m();
                        return c17296c;
                    case 8:
                        c1831t0.f5286e.f5041a = null;
                        if (c1831t0.f5288g.f10934Y.length() > 0) {
                            if (c1831t0.m2660f()) {
                                c1831t0.m2668n();
                            } else {
                                c1831t0.m2667m();
                            }
                        }
                        return c17296c;
                    case 9:
                        c1831t0.f5286e.f5041a = null;
                        if (c1831t0.f5288g.f10934Y.length() > 0) {
                            if (c1831t0.m2660f()) {
                                c1831t0.m2667m();
                            } else {
                                c1831t0.m2668n();
                            }
                        }
                        return c17296c;
                    case 10:
                        if (c1831t0.f5288g.f10934Y.length() > 0 && (c3578i = c1831t0.f5284c) != null) {
                            int iM2661g = c1831t0.m2661g(c3578i, -1);
                            c1831t0.m2670p(iM2661g, iM2661g);
                        }
                        return c17296c;
                    case 11:
                        if (c1831t0.f5288g.f10934Y.length() > 0 && (c3578i2 = c1831t0.f5284c) != null) {
                            int iM2661g2 = c1831t0.m2661g(c3578i2, 1);
                            c1831t0.m2670p(iM2661g2, iM2661g2);
                        }
                        return c17296c;
                    case 12:
                        if (c1831t0.f5288g.f10934Y.length() > 0 && (c20710g0 = c1831t0.f5290i) != null) {
                            int iM2662h = c1831t0.m2662h(c20710g0, -1);
                            c1831t0.m2670p(iM2662h, iM2662h);
                        }
                        return c17296c;
                    case 13:
                        if (c1831t0.f5288g.f10934Y.length() > 0 && (c20710g1 = c1831t0.f5290i) != null) {
                            int iM2662h2 = c1831t0.m2662h(c20710g1, 1);
                            c1831t0.m2670p(iM2662h2, iM2662h2);
                        }
                        return c17296c;
                    case 14:
                        c1831t0.f5286e.f5041a = null;
                        if (c1831t0.f5288g.f10934Y.length() > 0) {
                            c1831t0.m2670p(0, 0);
                        }
                        return c17296c;
                    case 15:
                        c1831t0.f5286e.f5041a = null;
                        C3590f c3590f = c1831t0.f5288g;
                        if (c3590f.f10934Y.length() > 0) {
                            int length2 = c3590f.f10934Y.length();
                            c1831t0.m2670p(length2, length2);
                        }
                        return c17296c;
                    case 16:
                        c20780v0.f65989b.m2679b(false);
                        return c17296c;
                    case 17:
                        c20780v0.f65989b.m2688l();
                        return c17296c;
                    case 18:
                        c20780v0.f65989b.m2680d();
                        return c17296c;
                    case 19:
                        List listM2655a = c1831t0.m2655a(C20745e.f65765u0);
                        if (listM2655a != null) {
                            c20780v0.m21306a(listM2655a);
                        }
                        return c17296c;
                    case 20:
                        List listM2655a2 = c1831t0.m2655a(C20745e.f65766v0);
                        if (listM2655a2 != null) {
                            c20780v0.m21306a(listM2655a2);
                        }
                        return c17296c;
                    case 21:
                        List listM2655a3 = c1831t0.m2655a(C20745e.f65767w0);
                        if (listM2655a3 != null) {
                            c20780v0.m21306a(listM2655a3);
                        }
                        return c17296c;
                    case 22:
                        List listM2655a4 = c1831t0.m2655a(C20745e.f65768x0);
                        if (listM2655a4 != null) {
                            c20780v0.m21306a(listM2655a4);
                        }
                        return c17296c;
                    case 23:
                        List listM2655a5 = c1831t0.m2655a(C20745e.f65769y0);
                        if (listM2655a5 != null) {
                            c20780v0.m21306a(listM2655a5);
                        }
                        return c17296c;
                    case 24:
                        List listM2655a6 = c1831t0.m2655a(C20745e.f65770z0);
                        if (listM2655a6 != null) {
                            c20780v0.m21306a(listM2655a6);
                        }
                        return c17296c;
                    case 25:
                        c1831t0.f5286e.f5041a = null;
                        C3590f c3590f2 = c1831t0.f5288g;
                        if (c3590f2.f10934Y.length() > 0) {
                            c1831t0.m2670p(0, c3590f2.f10934Y.length());
                        }
                        return c17296c;
                    case 26:
                        c1831t0.m2663i();
                        c1831t0.m2669o();
                        return c17296c;
                    case 27:
                        c1831t0.m2666l();
                        c1831t0.m2669o();
                        return c17296c;
                    case 28:
                        if (c1831t0.f5288g.f10934Y.length() > 0 && (c3578i3 = c1831t0.f5284c) != null) {
                            int iM2661g3 = c1831t0.m2661g(c3578i3, -1);
                            c1831t0.m2670p(iM2661g3, iM2661g3);
                        }
                        c1831t0.m2669o();
                        return c17296c;
                    case 29:
                        if (c1831t0.f5288g.f10934Y.length() > 0 && (c3578i4 = c1831t0.f5284c) != null) {
                            int iM2661g4 = c1831t0.m2661g(c3578i4, 1);
                            c1831t0.m2670p(iM2661g4, iM2661g4);
                        }
                        c1831t0.m2669o();
                        return c17296c;
                    case 30:
                        if (c1831t0.f5288g.f10934Y.length() > 0 && (c20710g2 = c1831t0.f5290i) != null) {
                            int iM2662h3 = c1831t0.m2662h(c20710g2, -1);
                            c1831t0.m2670p(iM2662h3, iM2662h3);
                        }
                        c1831t0.m2669o();
                        return c17296c;
                    case 31:
                        if (c1831t0.f5288g.f10934Y.length() > 0 && (c20710g3 = c1831t0.f5290i) != null) {
                            int iM2662h4 = c1831t0.m2662h(c20710g3, 1);
                            c1831t0.m2670p(iM2662h4, iM2662h4);
                        }
                        c1831t0.m2669o();
                        return c17296c;
                    case 32:
                        c1831t0.f5286e.f5041a = null;
                        if (c1831t0.f5288g.f10934Y.length() > 0) {
                            c1831t0.m2670p(0, 0);
                        }
                        c1831t0.m2669o();
                        return c17296c;
                    case 33:
                        c1831t0.f5286e.f5041a = null;
                        C3590f c3590f3 = c1831t0.f5288g;
                        if (c3590f3.f10934Y.length() > 0) {
                            int length3 = c3590f3.f10934Y.length();
                            c1831t0.m2670p(length3, length3);
                        }
                        c1831t0.m2669o();
                        return c17296c;
                    case 34:
                        C1766B0 c1766b2 = c1831t0.f5286e;
                        c1766b2.f5041a = null;
                        if (c1831t0.f5288g.f10934Y.length() > 0) {
                            if (c1831t0.m2660f()) {
                                c1766b2.f5041a = null;
                                if (c1831t0.f5288g.f10934Y.length() > 0 && (numM2659e3 = c1831t0.m2659e()) != null) {
                                    int iIntValue5 = numM2659e3.intValue();
                                    c1831t0.m2670p(iIntValue5, iIntValue5);
                                }
                            } else {
                                c1766b2.f5041a = null;
                                if (c1831t0.f5288g.f10934Y.length() > 0 && (numM2658d3 = c1831t0.m2658d()) != null) {
                                    int iIntValue6 = numM2658d3.intValue();
                                    c1831t0.m2670p(iIntValue6, iIntValue6);
                                }
                            }
                        }
                        c1831t0.m2669o();
                        return c17296c;
                    case 35:
                        C1766B0 c1766b3 = c1831t0.f5286e;
                        c1766b3.f5041a = null;
                        if (c1831t0.f5288g.f10934Y.length() > 0) {
                            if (c1831t0.m2660f()) {
                                c1766b3.f5041a = null;
                                if (c1831t0.f5288g.f10934Y.length() > 0 && (numM2658d4 = c1831t0.m2658d()) != null) {
                                    int iIntValue7 = numM2658d4.intValue();
                                    c1831t0.m2670p(iIntValue7, iIntValue7);
                                }
                            } else {
                                c1766b3.f5041a = null;
                                if (c1831t0.f5288g.f10934Y.length() > 0 && (numM2659e4 = c1831t0.m2659e()) != null) {
                                    int iIntValue8 = numM2659e4.intValue();
                                    c1831t0.m2670p(iIntValue8, iIntValue8);
                                }
                            }
                        }
                        c1831t0.m2669o();
                        return c17296c;
                    case 36:
                        c1831t0.m2664j();
                        c1831t0.m2669o();
                        return c17296c;
                    case 37:
                        c1831t0.m2665k();
                        c1831t0.m2669o();
                        return c17296c;
                    case 38:
                        c1831t0.m2668n();
                        c1831t0.m2669o();
                        return c17296c;
                    case 39:
                        c1831t0.m2667m();
                        c1831t0.m2669o();
                        return c17296c;
                    case 40:
                        c1831t0.f5286e.f5041a = null;
                        if (c1831t0.f5288g.f10934Y.length() > 0) {
                            if (c1831t0.m2660f()) {
                                c1831t0.m2668n();
                            } else {
                                c1831t0.m2667m();
                            }
                        }
                        c1831t0.m2669o();
                        return c17296c;
                    case 41:
                        c1831t0.f5286e.f5041a = null;
                        if (c1831t0.f5288g.f10934Y.length() > 0) {
                            if (c1831t0.m2660f()) {
                                c1831t0.m2667m();
                            } else {
                                c1831t0.m2668n();
                            }
                        }
                        c1831t0.m2669o();
                        return c17296c;
                    case 42:
                        c1831t0.f5286e.f5041a = null;
                        if (c1831t0.f5288g.f10934Y.length() > 0) {
                            long j12 = c1831t0.f5287f;
                            int i25 = C3581L.f10907c;
                            int i26 = (int) (j12 & 4294967295L);
                            c1831t0.m2670p(i26, i26);
                        }
                        return c17296c;
                    case 43:
                        if (c20780v0.f65992e) {
                            c20780v0.f65988a.f65830u.invoke(new C6064m(c20780v0.f65999l));
                        } else {
                            c20780v0.m21306a(AbstractC9393x3.m9974d(new C6052a(Separators.RETURN, 1)));
                        }
                        return c17296c;
                    case 44:
                        if (c20780v0.f65992e) {
                            ((C16556x) obj2).f51285Y = false;
                        } else {
                            c20780v0.m21306a(AbstractC9393x3.m9974d(new C6052a(Separators.f31990HT, 1)));
                        }
                        return c17296c;
                    case 45:
                        C20724N0 c20724n0 = c20780v0.f65995h;
                        if (c20724n0 != null) {
                            c20724n0.m21222a(C6045C.m6612a(c1831t0.f5289h, c1831t0.f5288g, c1831t0.f5287f, 4));
                        }
                        C20724N0 c20724n1 = c20780v0.f65995h;
                        if (c20724n1 != null) {
                            C20168n c20168n2 = c20724n1.f65706b;
                            if (c20168n2 != null && (c20168n = (C20168n) c20168n2.f63875Z) != null) {
                                c20724n1.f65706b = c20168n;
                                c20724n1.f65708d -= ((C6045C) c20168n2.f63876o0).f19682a.f10934Y.length();
                                c20724n1.f65707c = new C20168n(c20724n1.f65707c, i15, (C6045C) c20168n2.f63876o0);
                                c6045c = (C6045C) c20168n.f63876o0;
                            }
                            if (c6045c != null) {
                                c20780v0.f65998k.invoke(c6045c);
                            }
                        }
                        return c17296c;
                    case 46:
                        C20724N0 c20724n2 = c20780v0.f65995h;
                        if (c20724n2 != null) {
                            C20168n c20168n3 = c20724n2.f65707c;
                            if (c20168n3 != null) {
                                c20724n2.f65707c = (C20168n) c20168n3.f63875Z;
                                C6045C c6045c2 = (C6045C) c20168n3.f63876o0;
                                c20724n2.f65706b = new C20168n(c20724n2.f65706b, i15, c6045c2);
                                c20724n2.f65708d = c6045c2.f19682a.f10934Y.length() + c20724n2.f65708d;
                                c6045c = (C6045C) c20168n3.f63876o0;
                            }
                            if (c6045c != null) {
                                c20780v0.f65998k.invoke(c6045c);
                            }
                        }
                        return c17296c;
                    default:
                        return c17296c;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6016m0(int i10, Object obj, Object obj2, int i11) {
        super(1);
        this.f19522Y = i11;
        this.f19523Z = i10;
        this.f19524o0 = obj;
        this.f19525p0 = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6016m0(Object obj, int i10, Object obj2, int i11) {
        super(1);
        this.f19522Y = i11;
        this.f19524o0 = obj;
        this.f19523Z = i10;
        this.f19525p0 = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6016m0(AbstractC21069X abstractC21069X, AbstractC21069X abstractC21069X2, int i10) {
        super(1);
        this.f19522Y = 4;
        this.f19524o0 = abstractC21069X;
        this.f19525p0 = abstractC21069X2;
        this.f19523Z = i10;
    }
}
