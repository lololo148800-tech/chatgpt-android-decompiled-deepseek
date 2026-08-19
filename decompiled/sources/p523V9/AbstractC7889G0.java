package p523V9;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import android.os.Trace;
import androidx.lifecycle.AbstractC11105n;
import coil3.compose.AsyncImagePainter;
import java.util.List;
import p003A1.AbstractC0233b1;
import p025An.AbstractC0563B;
import p033B5.AbstractC0833q;
import p033B5.InterfaceC0832p;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p059C5.AbstractC1602t;
import p059C5.AbstractC1603u;
import p059C5.C1586d;
import p059C5.C1587e;
import p059C5.C1596n;
import p085D5.AbstractC1956c;
import p103Dn.C2153Q0;
import p1095x1.C21089j;
import p1095x1.InterfaceC21090k;
import p214Ib.C3676s;
import p214Ib.C3677t;
import p349O0.C6013l;
import p349O0.C6021p;
import p374P5.AbstractC6356i;
import p374P5.C6351d;
import p374P5.C6354g;
import p661b7.EnumC11255b;
import p661b7.InterfaceC11256c;
import p774h1.C14351g;
import p849k7.C16361n;
import p882m1.AbstractC17140a;
import p895n1.C17425e;
import p918o7.C17878e;

/* JADX INFO: renamed from: V9.G0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7889G0 {
    /* JADX INFO: renamed from: a */
    public static C16361n m8183a(C3676s c3676s) {
        try {
            if (c3676s.m4395w("format_version").mo4382p() == 2) {
                return new C16361n();
            }
            throw new IllegalStateException("Check failed.");
        } catch (IllegalStateException e10) {
            throw new C3677t("Unable to parse json into type Dd", e10);
        } catch (NullPointerException e11) {
            throw new C3677t("Unable to parse json into type Dd", e11);
        } catch (NumberFormatException e12) {
            throw new C3677t("Unable to parse json into type Dd", e12);
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m8184b(InterfaceC11256c interfaceC11256c, int i10, EnumC11255b enumC11255b, InterfaceC1426a interfaceC1426a, Throwable th2, boolean z6, int i11) {
        if ((i11 & 8) != 0) {
            th2 = null;
        }
        Throwable th3 = th2;
        if ((i11 & 16) != 0) {
            z6 = false;
        }
        ((C17878e) interfaceC11256c).m19602a(i10, enumC11255b, interfaceC1426a, th3, z6, null);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m8185c(InterfaceC11256c interfaceC11256c, int i10, List list, InterfaceC1426a interfaceC1426a, Throwable th2, int i11) {
        if ((i11 & 8) != 0) {
            th2 = null;
        }
        ((C17878e) interfaceC11256c).m19603b(i10, list, interfaceC1426a, th2, false, null);
    }

    /* JADX INFO: renamed from: d */
    public static final AsyncImagePainter m8186d(Object obj, InterfaceC0832p interfaceC0832p, InterfaceC1436k interfaceC1436k, InterfaceC1436k interfaceC1436k2, InterfaceC21090k interfaceC21090k, int i10, C6021p c6021p, int i11, int i12) {
        C1596n c1596n;
        if ((i12 & 4) != 0) {
            interfaceC1436k = AsyncImagePainter.f35900G0;
        }
        if ((i12 & 8) != 0) {
            interfaceC1436k2 = null;
        }
        if ((i12 & 16) != 0) {
            interfaceC21090k = C21089j.f67012o0;
        }
        if ((i12 & 32) != 0) {
            i10 = 1;
        }
        AbstractC0563B abstractC0563B = AbstractC1956c.f5791a;
        C1586d c1586d = (C1586d) c6021p.m6548k(AbstractC1602t.f4483a);
        c6021p.m6524S(-1242991349);
        Trace.beginSection("rememberAsyncImagePainter");
        try {
            C6354g c6354gM3139b = AbstractC1956c.m3139b(obj, c6021p);
            m8188f(c6354gM3139b);
            C1587e c1587e = new C1587e(interfaceC0832p, c6354gM3139b, c1586d);
            Object objM6514H = c6021p.m6514H();
            if (objM6514H == C6013l.f19514a) {
                objM6514H = new AsyncImagePainter(c1587e);
                c6021p.m6537c0(objM6514H);
            }
            AsyncImagePainter asyncImagePainter = (AsyncImagePainter) objM6514H;
            asyncImagePainter.f35913x0 = AbstractC1956c.m3138a(c6021p);
            asyncImagePainter.f35914y0 = interfaceC1436k;
            asyncImagePainter.f35915z0 = interfaceC1436k2;
            asyncImagePainter.f35901A0 = interfaceC21090k;
            asyncImagePainter.f35902B0 = i10;
            if (((Boolean) c6021p.m6548k(AbstractC0233b1.f873a)).booleanValue()) {
                c6021p.m6524S(-924922939);
                c1596n = (C1596n) c6021p.m6548k(AbstractC1603u.f4484a);
                c6021p.m6553p(false);
            } else {
                c6021p.m6524S(-924865434);
                c6021p.m6553p(false);
                c1596n = null;
            }
            asyncImagePainter.f35903C0 = c1596n;
            C2153Q0 c2153q0 = asyncImagePainter.f35904D0;
            c2153q0.getClass();
            c2153q0.m3251l(null, c1587e);
            c6021p.m6553p(false);
            return asyncImagePainter;
        } finally {
            Trace.endSection();
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m8187e(String str) {
        throw new IllegalArgumentException(AbstractC10763a.m11055m("Unsupported type: ", str, ". ", AbstractC10763a.m11054l("If you wish to display this ", str, ", use androidx.compose.foundation.Image.")));
    }

    /* JADX INFO: renamed from: f */
    public static final void m8188f(C6354g c6354g) {
        Object obj = c6354g.f20662b;
        if (obj instanceof C6351d) {
            throw new IllegalArgumentException("Unsupported type: ImageRequest.Builder. Did you forget to call ImageRequest.Builder.build()?");
        }
        if (obj instanceof C14351g) {
            m8187e("ImageBitmap");
            throw null;
        }
        if (obj instanceof C17425e) {
            m8187e("ImageVector");
            throw null;
        }
        if (obj instanceof AbstractC17140a) {
            m8187e("Painter");
            throw null;
        }
        if (c6354g.f20663c != null) {
            throw new IllegalArgumentException("request.target must be null.");
        }
        if (((AbstractC11105n) AbstractC0833q.m1891d(c6354g, AbstractC6356i.f20689f)) != null) {
            throw new IllegalArgumentException("request.lifecycle must be null.");
        }
    }
}
