package p544W9;

import android.gov.nist.javax.sip.header.SIPHeaderNames;
import android.net.Uri;
import androidx.glance.appwidget.protobuf.C11043g0;
import com.openai.chatgpt.R;
import com.openai.feature.messages.search.FaviconKt$Favicon$placeholderPainter$1$1;
import java.util.List;
import ki.AbstractC16421b;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17311n;
import ni.C17632f;
import p033B5.InterfaceC0832p;
import p1051v0.AbstractC20417e;
import p1095x1.C21089j;
import p121Ef.C2427d;
import p229J0.AbstractC3959O0;
import p229J0.C3949M0;
import p349O0.C5997d;
import p349O0.C6013l;
import p349O0.C6018n0;
import p349O0.C6021p;
import p349O0.InterfaceC5985X;
import p523V9.AbstractC7881F0;
import p523V9.AbstractC8079e5;
import p523V9.AbstractC8126k4;
import p571X9.AbstractC9233X;
import p579Xh.InterfaceC9514a;
import p635a1.InterfaceC10459q;
import p759g1.C13803e;
import p774h1.C14365u;
import p821j1.C16042g;
import p821j1.InterfaceC16039d;
import p857kl.AbstractC16435B;
import p857kl.C16460h;
import p857kl.C16477y;
import p857kl.InterfaceC16436C;
import p857kl.InterfaceC16437D;
import p857kl.InterfaceC16476x;
import p882m1.AbstractC17140a;

/* JADX INFO: renamed from: W9.i4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8651i4 {
    /* JADX WARN: Code duplicated, block: B:34:0x0059 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x005b  */
    /* JADX WARN: Code duplicated, block: B:37:0x005f  */
    /* JADX WARN: Code duplicated, block: B:39:0x0065  */
    /* JADX WARN: Code duplicated, block: B:47:0x008e  */
    /* JADX WARN: Code duplicated, block: B:50:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:53:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:56:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:57:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:61:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:65:0x0109  */
    /* JADX WARN: Code duplicated, block: B:66:0x010f  */
    /* JADX WARN: Code duplicated, block: B:69:0x011e  */
    /* JADX WARN: Code duplicated, block: B:74:0x0149  */
    /* JADX WARN: Code duplicated, block: B:78:0x0077 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:81:0x0106 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:82:? A[LOOP:0: B:59:0x00f8->B:82:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:83:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:84:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    public static final void m9323a(int i10, int i11, C6021p c6021p, InterfaceC10459q interfaceC10459q, String str, boolean z6) {
        boolean z10;
        Object objM9806b;
        Object obj;
        String str2;
        final InterfaceC5985X interfaceC5985XM6435V;
        Object objM6514H;
        FaviconKt$Favicon$placeholderPainter$1$1 faviconKt$Favicon$placeholderPainter$1$1;
        String str3;
        FaviconKt$Favicon$placeholderPainter$1$1 faviconKt$Favicon$placeholderPainter$1$2;
        Object objM19235b;
        InterfaceC9514a interfaceC9514a;
        InterfaceC0832p interfaceC0832pMo3165c;
        C6018n0 c6018n0M6555r;
        C6018n0 c6018n0M6555r2;
        c6021p.m6526U(1267213751);
        int i12 = (i10 & 6) == 0 ? (c6021p.m6542f(str) ? 4 : 2) | i10 : i10;
        if ((i10 & 48) == 0) {
            i12 |= c6021p.m6542f(interfaceC10459q) ? 32 : 16;
        }
        int i13 = i11 & 4;
        if (i13 == 0) {
            if ((i10 & 384) == 0) {
                z10 = z6;
                i12 |= c6021p.m6544g(z10) ? 256 : 128;
            }
            if ((i12 & 147) == 146 || !c6021p.m6562y()) {
                if (i13 != 0) {
                    z10 = true;
                }
                if (str == null) {
                    c6018n0M6555r = c6021p.m6555r();
                    if (c6018n0M6555r != null) {
                        c6018n0M6555r.f19536d = new C2427d(str, interfaceC10459q, z10, i10, i11, 1);
                        return;
                    }
                    return;
                }
                try {
                    objM9806b = Uri.parse(C11043g0.m12023e(str)).getHost();
                } catch (Throwable th2) {
                    objM9806b = AbstractC9233X.m9806b(th2);
                }
                obj = null;
                if (objM9806b instanceof C17311n) {
                    objM9806b = null;
                }
                str2 = (String) objM9806b;
                interfaceC5985XM6435V = C5997d.m6435V(new C14365u(((C3949M0) c6021p.m6548k(AbstractC3959O0.f12302a)).f12191E), c6021p);
                c6021p.m6524S(1938742009);
                objM6514H = c6021p.m6514H();
                if (objM6514H == C6013l.f19514a) {
                    objM6514H = new AbstractC17140a() { // from class: com.openai.feature.messages.search.FaviconKt$Favicon$placeholderPainter$1$1
                        @Override // p882m1.AbstractC17140a
                        /* JADX INFO: renamed from: h */
                        public final long getF38830r0() {
                            return 0L;
                        }

                        @Override // p882m1.AbstractC17140a
                        /* JADX INFO: renamed from: i */
                        public final void mo11310i(InterfaceC16039d interfaceC16039d) {
                            AbstractC16544l.m18094g(interfaceC16039d, "<this>");
                            interfaceC16039d.mo17591U(((C14365u) interfaceC5985XM6435V.getValue()).f45062a, (112 & 2) != 0 ? C13803e.m15332d(interfaceC16039d.mo17602i()) / 2.0f : 0.0f, (112 & 4) != 0 ? interfaceC16039d.mo17604o0() : 0L, (112 & 8) != 0 ? 1.0f : 0.0f, (112 & 16) != 0 ? C16042g.f49483a : null, null, 3);
                        }
                    };
                    c6021p.m6537c0(objM6514H);
                }
                faviconKt$Favicon$placeholderPainter$1$1 = (FaviconKt$Favicon$placeholderPainter$1$1) objM6514H;
                c6021p.m6553p(false);
                str3 = "https://www.google.com/s2/favicons?domain=" + str2 + "&sz=128";
                if (str2 == null) {
                    str3 = null;
                }
                AbstractC17140a abstractC17140aM8631b = AbstractC8126k4.m8631b(R.drawable.explore, c6021p, 0);
                AbstractC17140a abstractC17140aM8631b2 = AbstractC8126k4.m8631b(R.drawable.explore, c6021p, 0);
                if (z10) {
                    faviconKt$Favicon$placeholderPainter$1$2 = faviconKt$Favicon$placeholderPainter$1$1;
                } else {
                    faviconKt$Favicon$placeholderPainter$1$2 = null;
                }
                c6021p.m6524S(617413469);
                for (Object obj2 : (Iterable) c6021p.m6548k(AbstractC16421b.f50950a)) {
                    if (obj2 instanceof InterfaceC9514a) {
                        obj = obj2;
                        break;
                    }
                }
                if (obj != null) {
                    objM19235b = (InterfaceC9514a) obj;
                    c6021p.m6553p(false);
                } else {
                    objM19235b = C17632f.f56419a.m19235b(InterfaceC9514a.class);
                    c6021p.m6553p(false);
                }
                interfaceC9514a = (InterfaceC9514a) objM19235b;
                if (interfaceC9514a != null || (interfaceC0832pMo3165c = interfaceC9514a.mo3165c()) == null) {
                    throw new IllegalStateException("No ImageLoader");
                }
                AbstractC7881F0.m8163b(str3, null, interfaceC0832pMo3165c, AbstractC8079e5.m8501a(interfaceC10459q, AbstractC20417e.f64539a), faviconKt$Favicon$placeholderPainter$1$2, abstractC17140aM8631b, abstractC17140aM8631b2, null, null, null, C21089j.f67012o0, null, c6021p, 48, 48, 63360);
            } else {
                c6021p.m6517L();
            }
            c6018n0M6555r2 = c6021p.m6555r();
            if (c6018n0M6555r2 != null) {
                c6018n0M6555r2.f19536d = new C2427d(str, interfaceC10459q, z10, i10, i11, 2);
            }
        }
        i12 |= 384;
        z10 = z6;
        if ((i12 & 147) == 146) {
            if (i13 != 0) {
                z10 = true;
            }
            if (str == null) {
                c6018n0M6555r = c6021p.m6555r();
                if (c6018n0M6555r != null) {
                    c6018n0M6555r.f19536d = new C2427d(str, interfaceC10459q, z10, i10, i11, 1);
                    return;
                }
                return;
            }
            objM9806b = Uri.parse(C11043g0.m12023e(str)).getHost();
            obj = null;
            if (objM9806b instanceof C17311n) {
                objM9806b = null;
            }
            str2 = (String) objM9806b;
            interfaceC5985XM6435V = C5997d.m6435V(new C14365u(((C3949M0) c6021p.m6548k(AbstractC3959O0.f12302a)).f12191E), c6021p);
            c6021p.m6524S(1938742009);
            objM6514H = c6021p.m6514H();
            if (objM6514H == C6013l.f19514a) {
                objM6514H = new AbstractC17140a() { // from class: com.openai.feature.messages.search.FaviconKt$Favicon$placeholderPainter$1$1
                    @Override // p882m1.AbstractC17140a
                    /* JADX INFO: renamed from: h */
                    public final long getF38830r0() {
                        return 0L;
                    }

                    @Override // p882m1.AbstractC17140a
                    /* JADX INFO: renamed from: i */
                    public final void mo11310i(InterfaceC16039d interfaceC16039d) {
                        AbstractC16544l.m18094g(interfaceC16039d, "<this>");
                        interfaceC16039d.mo17591U(((C14365u) interfaceC5985XM6435V.getValue()).f45062a, (112 & 2) != 0 ? C13803e.m15332d(interfaceC16039d.mo17602i()) / 2.0f : 0.0f, (112 & 4) != 0 ? interfaceC16039d.mo17604o0() : 0L, (112 & 8) != 0 ? 1.0f : 0.0f, (112 & 16) != 0 ? C16042g.f49483a : null, null, 3);
                    }
                };
                c6021p.m6537c0(objM6514H);
            }
            faviconKt$Favicon$placeholderPainter$1$1 = (FaviconKt$Favicon$placeholderPainter$1$1) objM6514H;
            c6021p.m6553p(false);
            str3 = "https://www.google.com/s2/favicons?domain=" + str2 + "&sz=128";
            if (str2 == null) {
                str3 = null;
            }
            AbstractC17140a abstractC17140aM8631b3 = AbstractC8126k4.m8631b(R.drawable.explore, c6021p, 0);
            AbstractC17140a abstractC17140aM8631b4 = AbstractC8126k4.m8631b(R.drawable.explore, c6021p, 0);
            if (z10) {
                faviconKt$Favicon$placeholderPainter$1$2 = faviconKt$Favicon$placeholderPainter$1$1;
            } else {
                faviconKt$Favicon$placeholderPainter$1$2 = null;
            }
            c6021p.m6524S(617413469);
            while (r0.hasNext()) {
                if (obj2 instanceof InterfaceC9514a) {
                    obj = obj2;
                    break;
                }
            }
            if (obj != null) {
                objM19235b = (InterfaceC9514a) obj;
                c6021p.m6553p(false);
            } else {
                objM19235b = C17632f.f56419a.m19235b(InterfaceC9514a.class);
                c6021p.m6553p(false);
            }
            interfaceC9514a = (InterfaceC9514a) objM19235b;
            if (interfaceC9514a != null) {
            }
            throw new IllegalStateException("No ImageLoader");
        }
        if (i13 != 0) {
            z10 = true;
        }
        if (str == null) {
            c6018n0M6555r = c6021p.m6555r();
            if (c6018n0M6555r != null) {
                c6018n0M6555r.f19536d = new C2427d(str, interfaceC10459q, z10, i10, i11, 1);
                return;
            }
            return;
        }
        objM9806b = Uri.parse(C11043g0.m12023e(str)).getHost();
        obj = null;
        if (objM9806b instanceof C17311n) {
            objM9806b = null;
        }
        str2 = (String) objM9806b;
        interfaceC5985XM6435V = C5997d.m6435V(new C14365u(((C3949M0) c6021p.m6548k(AbstractC3959O0.f12302a)).f12191E), c6021p);
        c6021p.m6524S(1938742009);
        objM6514H = c6021p.m6514H();
        if (objM6514H == C6013l.f19514a) {
            objM6514H = new AbstractC17140a() { // from class: com.openai.feature.messages.search.FaviconKt$Favicon$placeholderPainter$1$1
                @Override // p882m1.AbstractC17140a
                /* JADX INFO: renamed from: h */
                public final long getF38830r0() {
                    return 0L;
                }

                @Override // p882m1.AbstractC17140a
                /* JADX INFO: renamed from: i */
                public final void mo11310i(InterfaceC16039d interfaceC16039d) {
                    AbstractC16544l.m18094g(interfaceC16039d, "<this>");
                    interfaceC16039d.mo17591U(((C14365u) interfaceC5985XM6435V.getValue()).f45062a, (112 & 2) != 0 ? C13803e.m15332d(interfaceC16039d.mo17602i()) / 2.0f : 0.0f, (112 & 4) != 0 ? interfaceC16039d.mo17604o0() : 0L, (112 & 8) != 0 ? 1.0f : 0.0f, (112 & 16) != 0 ? C16042g.f49483a : null, null, 3);
                }
            };
            c6021p.m6537c0(objM6514H);
        }
        faviconKt$Favicon$placeholderPainter$1$1 = (FaviconKt$Favicon$placeholderPainter$1$1) objM6514H;
        c6021p.m6553p(false);
        str3 = "https://www.google.com/s2/favicons?domain=" + str2 + "&sz=128";
        if (str2 == null) {
            str3 = null;
        }
        AbstractC17140a abstractC17140aM8631b5 = AbstractC8126k4.m8631b(R.drawable.explore, c6021p, 0);
        AbstractC17140a abstractC17140aM8631b6 = AbstractC8126k4.m8631b(R.drawable.explore, c6021p, 0);
        if (z10) {
            faviconKt$Favicon$placeholderPainter$1$2 = faviconKt$Favicon$placeholderPainter$1$1;
        } else {
            faviconKt$Favicon$placeholderPainter$1$2 = null;
        }
        c6021p.m6524S(617413469);
        while (r0.hasNext()) {
            if (obj2 instanceof InterfaceC9514a) {
                obj = obj2;
                break;
            }
        }
        if (obj != null) {
            objM19235b = (InterfaceC9514a) obj;
            c6021p.m6553p(false);
        } else {
            objM19235b = C17632f.f56419a.m19235b(InterfaceC9514a.class);
            c6021p.m6553p(false);
        }
        interfaceC9514a = (InterfaceC9514a) objM19235b;
        if (interfaceC9514a != null) {
        }
        throw new IllegalStateException("No ImageLoader");
        c6018n0M6555r2 = c6021p.m6555r();
        if (c6018n0M6555r2 != null) {
            c6018n0M6555r2.f19536d = new C2427d(str, interfaceC10459q, z10, i10, i11, 2);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final Long m9324b(InterfaceC16436C interfaceC16436C) {
        AbstractC16544l.m18094g(interfaceC16436C, "<this>");
        InterfaceC16476x interfaceC16476xMo7301a = interfaceC16436C.mo7301a();
        List list = AbstractC16435B.f50983a;
        String strMo7982g = interfaceC16476xMo7301a.mo7982g(SIPHeaderNames.CONTENT_LENGTH);
        if (strMo7982g != null) {
            return Long.valueOf(Long.parseLong(strMo7982g));
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static final C16460h m9325c(InterfaceC16436C interfaceC16436C) {
        AbstractC16544l.m18094g(interfaceC16436C, "<this>");
        InterfaceC16476x interfaceC16476xMo7301a = interfaceC16436C.mo7301a();
        List list = AbstractC16435B.f50983a;
        String strMo7982g = interfaceC16476xMo7301a.mo7982g(SIPHeaderNames.CONTENT_TYPE);
        if (strMo7982g == null) {
            return null;
        }
        C16460h c16460h = C16460h.f51065f;
        return AbstractC8621d4.m9270a(strMo7982g);
    }

    /* JADX INFO: renamed from: d */
    public static final C16460h m9326d(InterfaceC16437D interfaceC16437D) {
        AbstractC16544l.m18094g(interfaceC16437D, "<this>");
        C16477y c16477yMo9567a = interfaceC16437D.mo9567a();
        List list = AbstractC16435B.f50983a;
        String strM4540z = c16477yMo9567a.m4540z(SIPHeaderNames.CONTENT_TYPE);
        if (strM4540z == null) {
            return null;
        }
        C16460h c16460h = C16460h.f51065f;
        return AbstractC8621d4.m9270a(strM4540z);
    }

    /* JADX INFO: renamed from: e */
    public static final void m9327e(InterfaceC16437D interfaceC16437D, C16460h type) {
        AbstractC16544l.m18094g(type, "type");
        C16477y c16477yMo9567a = interfaceC16437D.mo9567a();
        List list = AbstractC16435B.f50983a;
        c16477yMo9567a.m4522M(SIPHeaderNames.CONTENT_TYPE, type.toString());
    }
}
