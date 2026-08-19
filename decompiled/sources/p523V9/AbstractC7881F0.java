package p523V9;

import android.content.Context;
import android.gov.nist.javax.sip.header.ParameterNames;
import android.net.Uri;
import android.os.Build;
import androidx.compose.p650ui.platform.AndroidCompositionLocals_androidKt;
import coil3.compose.AsyncImagePainter;
import coil3.compose.AsyncImagePainter$State$Error;
import coil3.compose.AsyncImagePainter$State$Loading;
import coil3.compose.AsyncImagePainter$State$Success;
import coil3.compose.internal.ContentPainterElement;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import p001A.AbstractC0010F;
import p003A1.AbstractC0168G;
import p008A6.C0383c;
import p008A6.C0385e;
import p025An.AbstractC0563B;
import p025An.C0644w;
import p033B5.InterfaceC0832p;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p059C5.AbstractC1602t;
import p059C5.C1585c;
import p059C5.C1586d;
import p059C5.C1588f;
import p059C5.C1600r;
import p059C5.InterfaceC1589g;
import p085D5.AbstractC1956c;
import p085D5.C1954a;
import p1008s8.C19483l;
import p1095x1.C21088i;
import p1095x1.C21089j;
import p1095x1.InterfaceC21057K;
import p1095x1.InterfaceC21090k;
import p1140z1.C21694h;
import p1140z1.C21696i;
import p1140z1.C21698j;
import p1140z1.InterfaceC21700k;
import p156G1.AbstractC2965l;
import p214Ib.C3676s;
import p214Ib.C3677t;
import p349O0.C5997d;
import p349O0.C6013l;
import p349O0.C6018n0;
import p349O0.C6021p;
import p349O0.InterfaceC6008i0;
import p374P5.C6351d;
import p374P5.C6354g;
import p374P5.C6360m;
import p397Q5.InterfaceC6580i;
import p444S4.C6997c;
import p444S4.EnumC7019y;
import p523V9.AbstractC7881F0;
import p635a1.AbstractC10443a;
import p635a1.C10444b;
import p635a1.C10451i;
import p635a1.InterfaceC10446d;
import p635a1.InterfaceC10459q;
import p774h1.C14356l;
import p882m1.AbstractC17140a;

/* JADX INFO: renamed from: V9.F0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7881F0 {
    /* JADX WARN: Code duplicated, block: B:100:0x0136  */
    /* JADX WARN: Code duplicated, block: B:103:0x014a  */
    /* JADX WARN: Code duplicated, block: B:106:0x0164  */
    /* JADX WARN: Code duplicated, block: B:108:0x017c  */
    /* JADX WARN: Code duplicated, block: B:111:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:95:0x0113  */
    /* JADX WARN: Code duplicated, block: B:97:0x011d  */
    /* JADX WARN: Code duplicated, block: B:98:0x012a  */
    /* JADX INFO: renamed from: a */
    public static final void m8162a(final C1954a c1954a, final String str, final InterfaceC10459q interfaceC10459q, final InterfaceC1436k interfaceC1436k, final InterfaceC1436k interfaceC1436k2, final InterfaceC10446d interfaceC10446d, final InterfaceC21090k interfaceC21090k, final float f10, final C14356l c14356l, final int i10, final boolean z6, C6021p c6021p, final int i11, final int i12) {
        int i13;
        int i14;
        boolean zM18089b;
        Object obj;
        Object objM6514H;
        InterfaceC6580i interfaceC6580i;
        Context context;
        boolean zM6542f;
        Object objM6514H2;
        C6354g c6354g;
        C6354g c6354g2;
        boolean zM6542f2;
        Object objM6514H3;
        c6021p.m6526U(1236588022);
        if ((i11 & 6) == 0) {
            i13 = (c6021p.m6542f(c1954a) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            i13 |= c6021p.m6542f(str) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i13 |= c6021p.m6542f(interfaceC10459q) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i13 |= c6021p.m6545h(interfaceC1436k) ? 2048 : 1024;
        }
        if ((i11 & 24576) == 0) {
            i13 |= c6021p.m6545h(interfaceC1436k2) ? 16384 : 8192;
        }
        if ((196608 & i11) == 0) {
            i13 |= c6021p.m6542f(interfaceC10446d) ? 131072 : 65536;
        }
        if ((1572864 & i11) == 0) {
            i13 |= c6021p.m6542f(interfaceC21090k) ? 1048576 : 524288;
        }
        if ((12582912 & i11) == 0) {
            i13 |= c6021p.m6536c(f10) ? 8388608 : 4194304;
        }
        if ((100663296 & i11) == 0) {
            i13 |= c6021p.m6542f(c14356l) ? 67108864 : 33554432;
        }
        if ((805306368 & i11) == 0) {
            i13 |= c6021p.m6538d(i10) ? 536870912 : 268435456;
        }
        if ((i12 & 6) == 0) {
            i14 = i12 | (c6021p.m6544g(z6) ? 4 : 2);
        } else {
            i14 = i12;
        }
        if ((306783379 & i13) == 306783378 && (i14 & 3) == 2 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            AbstractC0563B abstractC0563B = AbstractC1956c.f5791a;
            c6021p.m6524S(-329318062);
            Object obj2 = c1954a.f5784a;
            boolean z10 = obj2 instanceof C6354g;
            if (z10) {
                c6354g = (C6354g) obj2;
                if (c6354g.f20680t.f20658g != null) {
                    c6021p.m6553p(false);
                } else {
                    zM18089b = AbstractC16544l.m18089b(interfaceC21090k, C21089j.f67014q0);
                    obj = C6013l.f19514a;
                    if (zM18089b) {
                        c6021p.m6524S(-858313867);
                        c6021p.m6553p(false);
                        interfaceC6580i = InterfaceC6580i.f21267f0;
                    } else {
                        c6021p.m6524S(-858270839);
                        objM6514H = c6021p.m6514H();
                        if (objM6514H == obj) {
                            objM6514H = new C1600r();
                            c6021p.m6537c0(objM6514H);
                        }
                        c6021p.m6553p(false);
                        interfaceC6580i = (C1600r) objM6514H;
                    }
                    if (z10) {
                        c6021p.m6524S(-858186178);
                        c6354g2 = (C6354g) obj2;
                        zM6542f2 = c6021p.m6542f(c6354g2) | c6021p.m6542f(interfaceC6580i);
                        objM6514H3 = c6021p.m6514H();
                        if (zM6542f2 || objM6514H3 == obj) {
                            C6351d c6351dM6973a = C6354g.m6973a(c6354g2);
                            c6351dM6973a.f20633m = interfaceC6580i;
                            objM6514H3 = c6351dM6973a.m6972a();
                            c6021p.m6537c0(objM6514H3);
                        }
                        c6354g = (C6354g) objM6514H3;
                        c6021p.m6553p(false);
                        c6021p.m6553p(false);
                    } else {
                        c6021p.m6524S(-858022374);
                        context = (Context) c6021p.m6548k(AndroidCompositionLocals_androidKt.f32825b);
                        zM6542f = c6021p.m6542f(context) | c6021p.m6542f(obj2) | c6021p.m6542f(interfaceC6580i);
                        objM6514H2 = c6021p.m6514H();
                        if (zM6542f || objM6514H2 == obj) {
                            C6351d c6351d = new C6351d(context);
                            c6351d.f20623c = obj2;
                            c6351d.f20633m = interfaceC6580i;
                            objM6514H2 = c6351d.m6972a();
                            c6021p.m6537c0(objM6514H2);
                        }
                        c6354g = (C6354g) objM6514H2;
                        c6021p.m6553p(false);
                        c6021p.m6553p(false);
                    }
                }
            } else {
                zM18089b = AbstractC16544l.m18089b(interfaceC21090k, C21089j.f67014q0);
                obj = C6013l.f19514a;
                if (zM18089b) {
                    c6021p.m6524S(-858313867);
                    c6021p.m6553p(false);
                    interfaceC6580i = InterfaceC6580i.f21267f0;
                } else {
                    c6021p.m6524S(-858270839);
                    objM6514H = c6021p.m6514H();
                    if (objM6514H == obj) {
                        objM6514H = new C1600r();
                        c6021p.m6537c0(objM6514H);
                    }
                    c6021p.m6553p(false);
                    interfaceC6580i = (C1600r) objM6514H;
                }
                if (z10) {
                    c6021p.m6524S(-858186178);
                    c6354g2 = (C6354g) obj2;
                    zM6542f2 = c6021p.m6542f(c6354g2) | c6021p.m6542f(interfaceC6580i);
                    objM6514H3 = c6021p.m6514H();
                    if (zM6542f2) {
                        C6351d c6351dM6973a2 = C6354g.m6973a(c6354g2);
                        c6351dM6973a2.f20633m = interfaceC6580i;
                        objM6514H3 = c6351dM6973a2.m6972a();
                        c6021p.m6537c0(objM6514H3);
                    } else {
                        C6351d c6351dM6973a3 = C6354g.m6973a(c6354g2);
                        c6351dM6973a3.f20633m = interfaceC6580i;
                        objM6514H3 = c6351dM6973a3.m6972a();
                        c6021p.m6537c0(objM6514H3);
                    }
                    c6354g = (C6354g) objM6514H3;
                    c6021p.m6553p(false);
                    c6021p.m6553p(false);
                } else {
                    c6021p.m6524S(-858022374);
                    context = (Context) c6021p.m6548k(AndroidCompositionLocals_androidKt.f32825b);
                    zM6542f = c6021p.m6542f(context) | c6021p.m6542f(obj2) | c6021p.m6542f(interfaceC6580i);
                    objM6514H2 = c6021p.m6514H();
                    if (zM6542f) {
                        C6351d c6351d2 = new C6351d(context);
                        c6351d2.f20623c = obj2;
                        c6351d2.f20633m = interfaceC6580i;
                        objM6514H2 = c6351d2.m6972a();
                        c6021p.m6537c0(objM6514H2);
                    } else {
                        C6351d c6351d3 = new C6351d(context);
                        c6351d3.f20623c = obj2;
                        c6351d3.f20633m = interfaceC6580i;
                        objM6514H2 = c6351d3.m6972a();
                        c6021p.m6537c0(objM6514H2);
                    }
                    c6354g = (C6354g) objM6514H2;
                    c6021p.m6553p(false);
                    c6021p.m6553p(false);
                }
            }
            C6354g c6354g3 = c6354g;
            int i15 = i13 >> 6;
            int i16 = i15 & 57344;
            AsyncImagePainter asyncImagePainterM8186d = AbstractC7889G0.m8186d(c6354g3, c1954a.f5786c, interfaceC1436k, interfaceC1436k2, interfaceC21090k, i10, c6021p, ((i13 >> 3) & 8064) | i16 | ((i13 >> 12) & 458752), 0);
            InterfaceC6580i interfaceC6580i2 = c6354g3.f20676p;
            m8165d(interfaceC6580i2 instanceof C1600r ? interfaceC10459q.mo428M((InterfaceC10459q) interfaceC6580i2) : interfaceC10459q, asyncImagePainterM8186d, str, interfaceC10446d, interfaceC21090k, f10, c14356l, z6, c6021p, ((i13 << 3) & 896) | (i15 & 7168) | i16 | (i15 & 458752) | (i15 & 3670016) | ((i14 << 21) & 29360128));
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new InterfaceC1439n() { // from class: C5.a
                @Override // p049Bm.InterfaceC1439n
                public final Object invoke(Object obj3, Object obj4) {
                    ((Integer) obj4).intValue();
                    int iM6447d0 = C5997d.m6447d0(i11 | 1);
                    int iM6447d1 = C5997d.m6447d0(i12);
                    AbstractC7881F0.m8162a(c1954a, str, interfaceC10459q, interfaceC1436k, interfaceC1436k2, interfaceC10446d, interfaceC21090k, f10, c14356l, i10, z6, (C6021p) obj3, iM6447d0, iM6447d1);
                    return C17296C.f55119a;
                }
            };
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m8163b(Object obj, String str, InterfaceC0832p interfaceC0832p, InterfaceC10459q interfaceC10459q, AbstractC17140a abstractC17140a, AbstractC17140a abstractC17140a2, AbstractC17140a abstractC17140a3, InterfaceC1436k interfaceC1436k, InterfaceC1436k interfaceC1436k2, InterfaceC1436k interfaceC1436k3, InterfaceC21090k interfaceC21090k, C14356l c14356l, C6021p c6021p, int i10, int i11, int i12) {
        InterfaceC1436k interfaceC1436k4;
        InterfaceC1436k interfaceC1436k5 = null;
        final AbstractC17140a abstractC17140a4 = (i12 & 16) != 0 ? null : abstractC17140a;
        final AbstractC17140a abstractC17140a5 = (i12 & 32) != 0 ? null : abstractC17140a2;
        final AbstractC17140a abstractC17140a6 = (i12 & 64) != 0 ? abstractC17140a5 : abstractC17140a3;
        final InterfaceC1436k interfaceC1436k6 = (i12 & 128) != 0 ? null : interfaceC1436k;
        final InterfaceC1436k interfaceC1436k7 = (i12 & 256) != 0 ? null : interfaceC1436k2;
        final InterfaceC1436k interfaceC1436k8 = (i12 & 512) != 0 ? null : interfaceC1436k3;
        C10451i c10451i = C10444b.f30938q0;
        InterfaceC21090k interfaceC21090k2 = (i12 & 2048) != 0 ? C21089j.f67012o0 : interfaceC21090k;
        C14356l c14356l2 = (i12 & 8192) != 0 ? null : c14356l;
        int i13 = i10 >> 3;
        AbstractC0563B abstractC0563B = AbstractC1956c.f5791a;
        C1954a c1954a = new C1954a(obj, (C1586d) c6021p.m6548k(AbstractC1602t.f4483a), interfaceC0832p);
        if (abstractC17140a4 == null && abstractC17140a5 == null && abstractC17140a6 == null) {
            interfaceC1436k4 = AsyncImagePainter.f35900G0;
        } else {
            final int i14 = 0;
            interfaceC1436k4 = new InterfaceC1436k() { // from class: D5.b
                @Override // p049Bm.InterfaceC1436k
                public final Object invoke(Object obj2) {
                    InterfaceC1589g interfaceC1589g = (InterfaceC1589g) obj2;
                    switch (i14) {
                        case 0:
                            if (interfaceC1589g instanceof AsyncImagePainter$State$Loading) {
                                AbstractC17140a abstractC17140a7 = (AbstractC17140a) abstractC17140a4;
                                AsyncImagePainter$State$Loading asyncImagePainter$State$Loading = (AsyncImagePainter$State$Loading) interfaceC1589g;
                                if (abstractC17140a7 == null) {
                                    return asyncImagePainter$State$Loading;
                                }
                                asyncImagePainter$State$Loading.getClass();
                                return new AsyncImagePainter$State$Loading(abstractC17140a7);
                            }
                            if (!(interfaceC1589g instanceof AsyncImagePainter$State$Error)) {
                                return interfaceC1589g;
                            }
                            AsyncImagePainter$State$Error asyncImagePainter$State$Error = (AsyncImagePainter$State$Error) interfaceC1589g;
                            if (asyncImagePainter$State$Error.f35916a.f20620c instanceof C6360m) {
                                AbstractC17140a abstractC17140a8 = (AbstractC17140a) abstractC17140a6;
                                return abstractC17140a8 != null ? AsyncImagePainter$State$Error.m13136b(asyncImagePainter$State$Error, abstractC17140a8) : asyncImagePainter$State$Error;
                            }
                            AbstractC17140a abstractC17140a9 = (AbstractC17140a) abstractC17140a5;
                            return abstractC17140a9 != null ? AsyncImagePainter$State$Error.m13136b(asyncImagePainter$State$Error, abstractC17140a9) : asyncImagePainter$State$Error;
                        default:
                            if (interfaceC1589g instanceof AsyncImagePainter$State$Loading) {
                                InterfaceC1436k interfaceC1436k9 = (InterfaceC1436k) abstractC17140a4;
                                if (interfaceC1436k9 != null) {
                                    interfaceC1436k9.invoke(interfaceC1589g);
                                }
                            } else if (interfaceC1589g instanceof AsyncImagePainter$State$Success) {
                                InterfaceC1436k interfaceC1436k10 = (InterfaceC1436k) abstractC17140a6;
                                if (interfaceC1436k10 != null) {
                                    interfaceC1436k10.invoke(interfaceC1589g);
                                }
                            } else if (interfaceC1589g instanceof AsyncImagePainter$State$Error) {
                                InterfaceC1436k interfaceC1436k11 = (InterfaceC1436k) abstractC17140a5;
                                if (interfaceC1436k11 != null) {
                                    interfaceC1436k11.invoke(interfaceC1589g);
                                }
                            } else if (!(interfaceC1589g instanceof C1588f)) {
                                throw new C0644w();
                            }
                            return C17296C.f55119a;
                    }
                }
            };
        }
        if (interfaceC1436k6 != null || interfaceC1436k7 != null || interfaceC1436k8 != null) {
            final int i15 = 1;
            interfaceC1436k5 = new InterfaceC1436k() { // from class: D5.b
                @Override // p049Bm.InterfaceC1436k
                public final Object invoke(Object obj2) {
                    InterfaceC1589g interfaceC1589g = (InterfaceC1589g) obj2;
                    switch (i15) {
                        case 0:
                            if (interfaceC1589g instanceof AsyncImagePainter$State$Loading) {
                                AbstractC17140a abstractC17140a7 = (AbstractC17140a) interfaceC1436k6;
                                AsyncImagePainter$State$Loading asyncImagePainter$State$Loading = (AsyncImagePainter$State$Loading) interfaceC1589g;
                                if (abstractC17140a7 == null) {
                                    return asyncImagePainter$State$Loading;
                                }
                                asyncImagePainter$State$Loading.getClass();
                                return new AsyncImagePainter$State$Loading(abstractC17140a7);
                            }
                            if (!(interfaceC1589g instanceof AsyncImagePainter$State$Error)) {
                                return interfaceC1589g;
                            }
                            AsyncImagePainter$State$Error asyncImagePainter$State$Error = (AsyncImagePainter$State$Error) interfaceC1589g;
                            if (asyncImagePainter$State$Error.f35916a.f20620c instanceof C6360m) {
                                AbstractC17140a abstractC17140a8 = (AbstractC17140a) interfaceC1436k7;
                                return abstractC17140a8 != null ? AsyncImagePainter$State$Error.m13136b(asyncImagePainter$State$Error, abstractC17140a8) : asyncImagePainter$State$Error;
                            }
                            AbstractC17140a abstractC17140a9 = (AbstractC17140a) interfaceC1436k8;
                            return abstractC17140a9 != null ? AsyncImagePainter$State$Error.m13136b(asyncImagePainter$State$Error, abstractC17140a9) : asyncImagePainter$State$Error;
                        default:
                            if (interfaceC1589g instanceof AsyncImagePainter$State$Loading) {
                                InterfaceC1436k interfaceC1436k9 = (InterfaceC1436k) interfaceC1436k6;
                                if (interfaceC1436k9 != null) {
                                    interfaceC1436k9.invoke(interfaceC1589g);
                                }
                            } else if (interfaceC1589g instanceof AsyncImagePainter$State$Success) {
                                InterfaceC1436k interfaceC1436k10 = (InterfaceC1436k) interfaceC1436k7;
                                if (interfaceC1436k10 != null) {
                                    interfaceC1436k10.invoke(interfaceC1589g);
                                }
                            } else if (interfaceC1589g instanceof AsyncImagePainter$State$Error) {
                                InterfaceC1436k interfaceC1436k11 = (InterfaceC1436k) interfaceC1436k8;
                                if (interfaceC1436k11 != null) {
                                    interfaceC1436k11.invoke(interfaceC1589g);
                                }
                            } else if (!(interfaceC1589g instanceof C1588f)) {
                                throw new C0644w();
                            }
                            return C17296C.f55119a;
                    }
                }
            };
        }
        m8162a(c1954a, str, interfaceC10459q, interfaceC1436k4, interfaceC1436k5, c10451i, interfaceC21090k2, 1.0f, c14356l2, 1, true, c6021p, (i13 & 896) | (i10 & 112) | ((i11 << 15) & 3670016), 0);
    }

    /* JADX INFO: renamed from: c */
    public static final void m8164c(Object obj, String str, InterfaceC0832p interfaceC0832p, InterfaceC10459q interfaceC10459q, C21088i c21088i, C6021p c6021p, int i10, int i11) {
        C0383c c0383c = AsyncImagePainter.f35900G0;
        C10451i c10451i = C10444b.f30938q0;
        C21088i c21088i2 = (i11 & 128) != 0 ? C21089j.f67012o0 : c21088i;
        int i12 = i10 >> 3;
        AbstractC0563B abstractC0563B = AbstractC1956c.f5791a;
        m8162a(new C1954a(obj, (C1586d) c6021p.m6548k(AbstractC1602t.f4483a), interfaceC0832p), str, interfaceC10459q, c0383c, null, c10451i, c21088i2, 1.0f, null, 1, true, c6021p, (i10 & 112) | (i12 & 896) | (i12 & 7168) | (57344 & i12) | (458752 & i12) | (3670016 & i12) | (29360128 & i12) | (i12 & 234881024), 0);
    }

    /* JADX INFO: renamed from: d */
    public static final void m8165d(final InterfaceC10459q interfaceC10459q, final AsyncImagePainter asyncImagePainter, final String str, final InterfaceC10446d interfaceC10446d, final InterfaceC21090k interfaceC21090k, final float f10, final C14356l c14356l, final boolean z6, C6021p c6021p, final int i10) {
        int i11;
        int i12 = 1;
        c6021p.m6526U(-237738007);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6542f(interfaceC10459q) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6542f(asyncImagePainter) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c6021p.m6542f(str) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= c6021p.m6542f(interfaceC10446d) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= c6021p.m6542f(interfaceC21090k) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i11 |= c6021p.m6536c(f10) ? 131072 : 65536;
        }
        if ((1572864 & i10) == 0) {
            i11 |= c6021p.m6542f(c14356l) ? 1048576 : 524288;
        }
        if ((12582912 & i10) == 0) {
            i11 |= c6021p.m6544g(z6) ? 8388608 : 4194304;
        }
        if ((i11 & 4793491) == 4793490 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            AbstractC0563B abstractC0563B = AbstractC1956c.f5791a;
            InterfaceC10459q interfaceC10459qM3789a = str != null ? AbstractC2965l.m3789a(interfaceC10459q, false, new C0385e(str, i12)) : interfaceC10459q;
            if (z6) {
                interfaceC10459qM3789a = AbstractC8079e5.m8502b(interfaceC10459qM3789a);
            }
            InterfaceC10459q interfaceC10459qMo428M = interfaceC10459qM3789a.mo428M(new ContentPainterElement(asyncImagePainter, interfaceC10446d, interfaceC21090k, f10, c14356l));
            Object objM6514H = c6021p.m6514H();
            if (objM6514H == C6013l.f19514a) {
                objM6514H = C1585c.f4452a;
                c6021p.m6537c0(objM6514H);
            }
            InterfaceC21057K interfaceC21057K = (InterfaceC21057K) objM6514H;
            int i13 = c6021p.f19564P;
            InterfaceC10459q interfaceC10459qM10923d = AbstractC10443a.m10923d(c6021p, interfaceC10459qMo428M);
            InterfaceC6008i0 interfaceC6008i0M6550m = c6021p.m6550m();
            InterfaceC21700k.f68875m0.getClass();
            C21696i c21696i = C21698j.f68869b;
            c6021p.m6528W();
            if (c6021p.f19563O) {
                c6021p.m6549l(c21696i);
            } else {
                c6021p.m6543f0();
            }
            C5997d.m6439Z(C21698j.f68873f, c6021p, interfaceC21057K);
            C5997d.m6439Z(C21698j.f68872e, c6021p, interfaceC6008i0M6550m);
            C5997d.m6439Z(C21698j.f68871d, c6021p, interfaceC10459qM10923d);
            C21694h c21694h = C21698j.f68874g;
            if (c6021p.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i13))) {
                AbstractC0168G.m537z(i13, c6021p, i13, c21694h);
            }
            c6021p.m6553p(true);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new InterfaceC1439n() { // from class: C5.b
                @Override // p049Bm.InterfaceC1439n
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    AbstractC7881F0.m8165d(interfaceC10459q, asyncImagePainter, str, interfaceC10446d, interfaceC21090k, f10, c14356l, z6, (C6021p) obj, C5997d.m6447d0(i10 | 1));
                    return C17296C.f55119a;
                }
            };
        }
    }

    /* JADX INFO: renamed from: e */
    public static final LinkedHashSet m8166e(byte[] bytes) {
        AbstractC16544l.m18094g(bytes, "bytes");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (bytes.length == 0) {
            return linkedHashSet;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
        try {
            try {
                ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
                try {
                    int i10 = objectInputStream.readInt();
                    for (int i11 = 0; i11 < i10; i11++) {
                        Uri uri = Uri.parse(objectInputStream.readUTF());
                        boolean z6 = objectInputStream.readBoolean();
                        AbstractC16544l.m18093f(uri, "uri");
                        linkedHashSet.add(new C6997c(z6, uri));
                    }
                    AbstractC7942M5.m8232a(objectInputStream, null);
                    AbstractC7942M5.m8232a(byteArrayInputStream, null);
                    return linkedHashSet;
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        AbstractC7942M5.m8232a(objectInputStream, th2);
                        throw th3;
                    }
                }
            } catch (Throwable th4) {
                try {
                    throw th4;
                } catch (Throwable th5) {
                    AbstractC7942M5.m8232a(byteArrayInputStream, th4);
                    throw th5;
                }
            }
        } catch (IOException e10) {
            e10.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: f */
    public static C19483l m8167f(C3676s c3676s) {
        try {
            String id2 = c3676s.m4395w(ParameterNames.f31999ID).mo4384r();
            AbstractC16544l.m18093f(id2, "id");
            return new C19483l(id2);
        } catch (IllegalStateException e10) {
            throw new C3677t("Unable to parse json into type Application", e10);
        } catch (NullPointerException e11) {
            throw new C3677t("Unable to parse json into type Application", e11);
        } catch (NumberFormatException e12) {
            throw new C3677t("Unable to parse json into type Application", e12);
        }
    }

    /* JADX INFO: renamed from: g */
    public static final int m8168g(int i10) {
        if (i10 == 0) {
            return 1;
        }
        if (i10 == 1) {
            return 2;
        }
        throw new IllegalArgumentException(AbstractC0010F.m19c(i10, "Could not convert ", " to BackoffPolicy"));
    }

    /* JADX INFO: renamed from: h */
    public static final int m8169h(int i10) {
        if (i10 == 0) {
            return 1;
        }
        int i11 = 2;
        if (i10 != 1) {
            if (i10 == 2) {
                return 3;
            }
            i11 = 4;
            if (i10 != 3) {
                if (i10 == 4) {
                    return 5;
                }
                if (Build.VERSION.SDK_INT < 30 || i10 != 5) {
                    throw new IllegalArgumentException(AbstractC0010F.m19c(i10, "Could not convert ", " to NetworkType"));
                }
                return 6;
            }
        }
        return i11;
    }

    /* JADX INFO: renamed from: i */
    public static final int m8170i(int i10) {
        if (i10 == 0) {
            return 1;
        }
        if (i10 == 1) {
            return 2;
        }
        throw new IllegalArgumentException(AbstractC0010F.m19c(i10, "Could not convert ", " to OutOfQuotaPolicy"));
    }

    /* JADX INFO: renamed from: j */
    public static final EnumC7019y m8171j(int i10) {
        if (i10 == 0) {
            return EnumC7019y.f22432Y;
        }
        if (i10 == 1) {
            return EnumC7019y.f22433Z;
        }
        if (i10 == 2) {
            return EnumC7019y.f22434o0;
        }
        if (i10 == 3) {
            return EnumC7019y.f22435p0;
        }
        if (i10 == 4) {
            return EnumC7019y.f22436q0;
        }
        if (i10 == 5) {
            return EnumC7019y.f22437r0;
        }
        throw new IllegalArgumentException(AbstractC0010F.m19c(i10, "Could not convert ", " to State"));
    }

    /* JADX INFO: renamed from: k */
    public static final int m8172k(EnumC7019y state) {
        AbstractC16544l.m18094g(state, "state");
        int iOrdinal = state.ordinal();
        if (iOrdinal == 0) {
            return 0;
        }
        if (iOrdinal == 1) {
            return 1;
        }
        if (iOrdinal == 2) {
            return 2;
        }
        if (iOrdinal == 3) {
            return 3;
        }
        if (iOrdinal == 4) {
            return 4;
        }
        if (iOrdinal == 5) {
            return 5;
        }
        throw new C0644w();
    }
}
