package p030B2;

import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.view.View;
import java.util.Arrays;
import java.util.Locale;
import p001A.C0017I0;
import p013Ab.C0420b;
import p1007s7.C19465d;
import p1060v9.AbstractC20502t;
import p1072w2.C20793e;
import p449S9.C7042K;
import p501Ub.AbstractC7601c;
import p523V9.AbstractC8097h;
import p523V9.AbstractC8135l5;
import p523V9.C7896H;
import p523V9.C8019W5;
import p523V9.C8232x6;
import p523V9.EnumC7909I4;
import p531Vj.AbstractC8367f0;
import p531Vj.C8369h;
import p531Vj.EnumC8334D;
import p555Wj.C8885a;
import p571X9.AbstractC9251a;
import p571X9.AbstractC9353r;
import p571X9.C9173M4;
import p571X9.C9340o4;
import p571X9.C9341p;
import p571X9.C9377v;
import p571X9.EnumC9369t3;
import p588Y2.C9642z;
import p594Y9.AbstractC10009z4;
import p594Y9.AbstractC9950q;
import p594Y9.C9788P4;
import p594Y9.C9938o;
import p594Y9.C9955q4;
import p594Y9.C9998y;
import p594Y9.EnumC9972t3;
import p615Z6.C10252z0;
import p658b5.C11248s;
import p813ij.C15026j;
import p893n.AbstractActivityC17375g;
import p896n2.AbstractC17449b;
import p976r.C18807e;
import p976r.C18816n;
import p976r.MenuC18814l;
import p976r.ViewOnKeyListenerC18808f;

/* JADX INFO: renamed from: B2.g0 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0758g0 implements Runnable {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f2146Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ Object f2147Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ Object f2148o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ Object f2149p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ Object f2150q0;

    public /* synthetic */ RunnableC0758g0(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f2146Y = i10;
        this.f2147Z = obj;
        this.f2148o0 = obj2;
        this.f2149p0 = obj3;
        this.f2150q0 = obj4;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x002b  */
    /* JADX INFO: renamed from: a */
    private final void m1637a() {
        String str;
        C9377v c9377v;
        C9173M4 c9173m4 = (C9173M4) this.f2147Z;
        C0420b c0420b = (C0420b) this.f2148o0;
        EnumC9369t3 enumC9369t3 = (EnumC9369t3) this.f2149p0;
        String str2 = (String) this.f2150q0;
        c9173m4.getClass();
        C0017I0 c0017i0 = (C0017I0) c0420b.f1382o0;
        c0017i0.f65Z = enumC9369t3;
        C9340o4 c9340o4 = (C9340o4) c0017i0.f64Y;
        if (c9340o4 != null) {
            int i10 = AbstractC9251a.f28034a;
            str = c9340o4.f28163d;
            if (str == null || str.isEmpty()) {
                str = "NA";
            }
        } else {
            str = "NA";
        }
        C19465d c19465d = new C19465d();
        c19465d.f61768Y = c9173m4.f27953a;
        c19465d.f61769Z = c9173m4.f27954b;
        synchronized (C9173M4.class) {
            c9377v = C9173M4.f27951k;
            if (c9377v == null) {
                C20793e c20793eM8657e = AbstractC8135l5.m8657e(Resources.getSystem().getConfiguration());
                Object[] objArrCopyOf = new Object[4];
                int i11 = 0;
                int i12 = 0;
                while (i11 < c20793eM8657e.f66056a.size()) {
                    Locale locale = c20793eM8657e.f66056a.get(i11);
                    C15026j c15026j = AbstractC7601c.f24035a;
                    String languageTag = locale.toLanguageTag();
                    languageTag.getClass();
                    int i13 = i12 + 1;
                    int length = objArrCopyOf.length;
                    if (length < i13) {
                        int i14 = length + (length >> 1) + 1;
                        if (i14 < i13) {
                            int iHighestOneBit = Integer.highestOneBit(i12);
                            i14 = iHighestOneBit + iHighestOneBit;
                        }
                        if (i14 < 0) {
                            i14 = Integer.MAX_VALUE;
                        }
                        objArrCopyOf = Arrays.copyOf(objArrCopyOf, i14);
                    }
                    objArrCopyOf[i12] = languageTag;
                    i11++;
                    i12 = i13;
                }
                C9341p c9341p = AbstractC9353r.f28193Z;
                c9377v = i12 == 0 ? C9377v.f28246q0 : new C9377v(i12, objArrCopyOf);
                C9173M4.f27951k = c9377v;
            }
        }
        c19465d.f61772q0 = c9377v;
        c19465d.f61775t0 = Boolean.TRUE;
        c19465d.f61771p0 = str;
        c19465d.f61770o0 = str2;
        c19465d.f61773r0 = c9173m4.f27958f.m15132k() ? (String) c9173m4.f27958f.m15130i() : c9173m4.f27956d.m7956a();
        c19465d.f61777v0 = 10;
        c19465d.f61778w0 = Integer.valueOf(c9173m4.f27960h);
        c0420b.f1383p0 = c19465d;
        c9173m4.f27955c.mo9704a(c0420b);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x002b  */
    /* JADX INFO: renamed from: b */
    private final void m1638b() {
        String str;
        C9998y c9998y;
        C9788P4 c9788p4 = (C9788P4) this.f2147Z;
        C0420b c0420b = (C0420b) this.f2148o0;
        EnumC9972t3 enumC9972t3 = (EnumC9972t3) this.f2149p0;
        String str2 = (String) this.f2150q0;
        c9788p4.getClass();
        C10252z0 c10252z0 = (C10252z0) c0420b.f1382o0;
        c10252z0.f30455Z = enumC9972t3;
        C9955q4 c9955q4 = (C9955q4) c10252z0.f30454Y;
        if (c9955q4 != null) {
            str = c9955q4.f29513d;
            if (AbstractC10009z4.m10651d(str)) {
                str = "NA";
            } else {
                AbstractC20502t.m21157h(str);
            }
        } else {
            str = "NA";
        }
        C19465d c19465d = new C19465d();
        c19465d.f61768Y = c9788p4.f29301a;
        c19465d.f61769Z = c9788p4.f29302b;
        synchronized (C9788P4.class) {
            c9998y = C9788P4.f29299k;
            if (c9998y == null) {
                C20793e c20793eM8657e = AbstractC8135l5.m8657e(Resources.getSystem().getConfiguration());
                Object[] objArrCopyOf = new Object[4];
                int i10 = 0;
                int i11 = 0;
                while (i10 < c20793eM8657e.f66056a.size()) {
                    Locale locale = c20793eM8657e.f66056a.get(i10);
                    C15026j c15026j = AbstractC7601c.f24035a;
                    String languageTag = locale.toLanguageTag();
                    languageTag.getClass();
                    int i12 = i11 + 1;
                    int length = objArrCopyOf.length;
                    if (length < i12) {
                        int i13 = length + (length >> 1) + 1;
                        if (i13 < i12) {
                            int iHighestOneBit = Integer.highestOneBit(i11);
                            i13 = iHighestOneBit + iHighestOneBit;
                        }
                        if (i13 < 0) {
                            i13 = Integer.MAX_VALUE;
                        }
                        objArrCopyOf = Arrays.copyOf(objArrCopyOf, i13);
                    }
                    objArrCopyOf[i11] = languageTag;
                    i10++;
                    i11 = i12;
                }
                C9938o c9938o = AbstractC9950q.f29506Z;
                c9998y = i11 == 0 ? C9998y.f29584q0 : new C9998y(i11, objArrCopyOf);
                C9788P4.f29299k = c9998y;
            }
        }
        c19465d.f61772q0 = c9998y;
        c19465d.f61775t0 = Boolean.TRUE;
        c19465d.f61771p0 = str;
        c19465d.f61770o0 = str2;
        c19465d.f61773r0 = c9788p4.f29306f.m15132k() ? (String) c9788p4.f29306f.m15130i() : c9788p4.f29304d.m7956a();
        c19465d.f61777v0 = 10;
        c19465d.f61778w0 = Integer.valueOf(c9788p4.f29308h);
        c0420b.f1383p0 = c19465d;
        c9788p4.f29303c.mo10376a(c0420b);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00ae  */
    /* JADX WARN: Type inference failed for: r0v28, types: [Bm.k, kotlin.jvm.internal.n] */
    /* JADX WARN: Type inference failed for: r0v30, types: [Bm.k, kotlin.jvm.internal.n] */
    @Override // java.lang.Runnable
    public final void run() {
        String str;
        C7896H c7896hM7441o;
        switch (this.f2146Y) {
            case 0:
                C0762i0.m1689h((View) this.f2147Z, (C0770m0) this.f2148o0, (C11248s) this.f2149p0);
                ((ValueAnimator) this.f2150q0).start();
                return;
            case 1:
                C8232x6 c8232x6 = (C8232x6) this.f2147Z;
                C0420b c0420b = (C0420b) this.f2148o0;
                EnumC7909I4 enumC7909I4 = (EnumC7909I4) this.f2149p0;
                String str2 = (String) this.f2150q0;
                c8232x6.getClass();
                C10252z0 c10252z0 = (C10252z0) c0420b.f1382o0;
                c10252z0.f30455Z = enumC7909I4;
                C8019W5 c8019w5 = (C8019W5) c10252z0.f30454Y;
                if (c8019w5 != null) {
                    int i10 = AbstractC8097h.f25434a;
                    str = c8019w5.f25315d;
                    if (str == null || str.isEmpty()) {
                        str = "NA";
                    }
                } else {
                    str = "NA";
                }
                C19465d c19465d = new C19465d();
                c19465d.f61768Y = c8232x6.f25700a;
                c19465d.f61769Z = c8232x6.f25701b;
                synchronized (C8232x6.class) {
                    c7896hM7441o = C8232x6.f25698k;
                    if (c7896hM7441o == null) {
                        C20793e c20793eM8657e = AbstractC8135l5.m8657e(Resources.getSystem().getConfiguration());
                        C7042K c7042k = new C7042K();
                        for (int i11 = 0; i11 < c20793eM8657e.f66056a.size(); i11++) {
                            Locale locale = c20793eM8657e.f66056a.get(i11);
                            C15026j c15026j = AbstractC7601c.f24035a;
                            c7042k.m7439m(locale.toLanguageTag());
                        }
                        c7896hM7441o = c7042k.m7441o();
                        C8232x6.f25698k = c7896hM7441o;
                    }
                }
                c19465d.f61772q0 = c7896hM7441o;
                c19465d.f61775t0 = Boolean.TRUE;
                c19465d.f61771p0 = str;
                c19465d.f61770o0 = str2;
                c19465d.f61773r0 = c8232x6.f25705f.m15132k() ? (String) c8232x6.f25705f.m15130i() : c8232x6.f25703d.m7956a();
                c19465d.f61777v0 = 10;
                c19465d.f61778w0 = Integer.valueOf(c8232x6.f25707h);
                c0420b.f1383p0 = c19465d;
                c8232x6.f25702c.mo8104a(c0420b);
                return;
            case 2:
                if (((C8885a) this.f2147Z).f27194a.isAttachedToWindow()) {
                    C8369h c8369h = (C8369h) this.f2148o0;
                    EnumC8334D enumC8334D = c8369h.f26065Y;
                    EnumC8334D enumC8334D2 = EnumC8334D.f25984Z;
                    C8369h c8369h2 = (C8369h) this.f2149p0;
                    if (enumC8334D != enumC8334D2 || c8369h.f26066Z) {
                        c8369h2.f26067o0.invoke(Boolean.valueOf(AbstractC17449b.m19126f((AbstractActivityC17375g) this.f2150q0, AbstractC8367f0.m8939b(c8369h2.f26065Y))));
                        return;
                    } else {
                        c8369h2.f26067o0.invoke(Boolean.TRUE);
                        return;
                    }
                }
                return;
            case 3:
                m1637a();
                return;
            case 4:
                m1638b();
                return;
            default:
                C18807e c18807e = (C18807e) this.f2147Z;
                if (c18807e != null) {
                    C9642z c9642z = (C9642z) this.f2150q0;
                    ((ViewOnKeyListenerC18808f) c9642z.f29064Z).f59816L0 = true;
                    c18807e.f59803b.m20122c(false);
                    ((ViewOnKeyListenerC18808f) c9642z.f29064Z).f59816L0 = false;
                }
                C18816n c18816n = (C18816n) this.f2148o0;
                if (c18816n.isEnabled() && c18816n.hasSubMenu()) {
                    ((MenuC18814l) this.f2149p0).m20128q(c18816n, null, 4);
                    return;
                }
                return;
        }
    }

    public RunnableC0758g0(C9642z c9642z, C18807e c18807e, C18816n c18816n, MenuC18814l menuC18814l) {
        this.f2146Y = 5;
        this.f2150q0 = c9642z;
        this.f2147Z = c18807e;
        this.f2148o0 = c18816n;
        this.f2149p0 = menuC18814l;
    }
}
