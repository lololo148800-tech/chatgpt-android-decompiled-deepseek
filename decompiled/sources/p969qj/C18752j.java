package p969qj;

import ac.C10539a;
import android.gov.nist.core.Separators;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.SystemClock;
import com.google.android.renderscript.Toolkit;
import ec.C13363e;
import ec.InterfaceC13364f;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ExecutionException;
import java.util.regex.Pattern;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17314q;
import p102Dm.AbstractC2119a;
import p1113xn.AbstractC21329w;
import p1113xn.C21317k;
import p1113xn.C21319m;
import p468T2.C7224p;
import p523V9.AbstractC7854B5;
import p546Wb.InterfaceC8755a;
import p571X9.AbstractC9227W;
import p571X9.AbstractC9233X;
import p573Xb.C9430a;
import p596Yb.InterfaceC10011a;
import p619Zb.C10268a;
import p746fa.C13606o;
import p748fc.C13609a;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17681o;
import p909nm.C17662G;
import p949pj.C18442O;
import p949pj.C18443P;
import p949pj.C18477m;
import p949pj.C18479n;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: qj.j */
/* JADX INFO: loaded from: classes3.dex */
public final class C18752j implements InterfaceC18753k {

    /* JADX INFO: renamed from: c */
    public static final float[] f59629c = {-0.15f, -0.15f, -0.15f, -0.15f, 2.2f, -0.15f, -0.15f, -0.15f, -0.15f};

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f59630a;

    /* JADX INFO: renamed from: b */
    public final C17314q f59631b;

    public C18752j(int i10) {
        this.f59630a = i10;
        switch (i10) {
            case 1:
                this.f59631b = AbstractC9227W.m9800c(C18751i.f59627q0);
                break;
            default:
                this.f59631b = AbstractC9227W.m9800c(C18751i.f59624Z);
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:56:0x0271  */
    /* JADX WARN: Code duplicated, block: B:59:0x028c  */
    /* JADX WARN: Code duplicated, block: B:61:0x0296  */
    /* JADX WARN: Code duplicated, block: B:74:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:75:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:80:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p969qj.InterfaceC18753k
    /* JADX INFO: renamed from: a */
    public final Object mo20046a(C7224p c7224p, Rect rect, AbstractC19687c abstractC19687c) throws InterruptedException {
        InterfaceC10011a interfaceC10011a;
        String strMo10215i;
        C18479n c18479n;
        Rect rect2;
        Rect rect3;
        C21317k c21317kM21662a;
        C21317k c21317kM21662a2;
        C18443P c18443p;
        C18443P c18443p2;
        C21317k c21317kM21662a3;
        Object objM13698a = null;
        C18744b c18744b = C18744b.f59618a;
        C17314q c17314q = this.f59631b;
        switch (this.f59630a) {
            case 0:
                Bitmap bitmap = (Bitmap) ((C17314q) c7224p.f22916f).getValue();
                if (bitmap == 0) {
                    return c18744b;
                }
                try {
                    Toolkit toolkit = Toolkit.f36840a;
                    objM13698a = Toolkit.m13698a(bitmap, f59629c);
                    break;
                } catch (UnsatisfiedLinkError unused) {
                }
                if (objM13698a != null) {
                    bitmap = objM13698a;
                }
                int i10 = c7224p.m7619a().f31259f;
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                C10539a c10539a = new C10539a(bitmap, i10);
                C10539a.m10979c(-1, 1, jElapsedRealtime, bitmap.getHeight(), bitmap.getWidth(), bitmap.getAllocationByteCount(), i10);
                C13606o c13606oM12770k = ((C10268a) ((InterfaceC8755a) c17314q.getValue())).m12770k(c10539a);
                AbstractC16544l.m18093f(c13606oM12770k, "process(...)");
                try {
                    AbstractC7854B5.m8113a(c13606oM12770k);
                    Object objM15130i = c13606oM12770k.m15130i();
                    AbstractC16544l.m18093f(objM15130i, "getResult(...)");
                    C9430a c9430a = (C9430a) AbstractC17680n.m19344T(0, (List) objM15130i);
                    if (c9430a == null || (strMo10215i = (interfaceC10011a = c9430a.f28411a).mo10215i()) == null) {
                        return c18744b;
                    }
                    int iMo10220t = interfaceC10011a.mo10220t();
                    int i11 = -1;
                    if (iMo10220t <= 4096) {
                        if (iMo10220t != 0) {
                        }
                        if (i11 == 2048) {
                            return c18744b;
                        }
                        c18479n = new C18479n(strMo10215i);
                        rect2 = new Rect(0, 0, c7224p.m7619a().f31257d, c7224p.m7619a().f31258e);
                        rect3 = c9430a.f28412b;
                        if (rect3 == null) {
                            return c18744b;
                        }
                        rect2.inset(1, 1);
                        if (rect2.contains(rect3)) {
                            return new C18743a(c18479n);
                        }
                        return c18744b;
                    }
                    iMo10220t = -1;
                    i11 = iMo10220t;
                    if (i11 == 2048) {
                        return c18744b;
                    }
                    c18479n = new C18479n(strMo10215i);
                    rect2 = new Rect(0, 0, c7224p.m7619a().f31257d, c7224p.m7619a().f31258e);
                    rect3 = c9430a.f28412b;
                    if (rect3 == null) {
                        return c18744b;
                    }
                    rect2.inset(1, 1);
                    if (rect2.contains(rect3)) {
                        return new C18743a(c18479n);
                    }
                    return c18744b;
                } catch (ExecutionException unused2) {
                    return AbstractC9233X.m9806b(new C18750h());
                }
            default:
                C13606o c13606oM12770k2 = ((C13609a) ((InterfaceC13364f) c17314q.getValue())).m12770k(c7224p.m7619a());
                AbstractC16544l.m18093f(c13606oM12770k2, "process(...)");
                try {
                    AbstractC7854B5.m8113a(c13606oM12770k2);
                    String str = ((C13363e) c13606oM12770k2.m15130i()).f42404b;
                    AbstractC16544l.m18093f(str, "getText(...)");
                    if (str.equals("")) {
                        return c18744b;
                    }
                    C21319m c21319m = C18443P.f58840p;
                    Pattern patternCompile = Pattern.compile("(\r|\t| )");
                    AbstractC16544l.m18093f(patternCompile, "compile(...)");
                    String strReplaceAll = patternCompile.matcher(str).replaceAll("");
                    AbstractC16544l.m18093f(strReplaceAll, "replaceAll(...)");
                    Locale locale = Locale.getDefault();
                    AbstractC16544l.m18093f(locale, "getDefault(...)");
                    String upperCase = strReplaceAll.toUpperCase(locale);
                    AbstractC16544l.m18093f(upperCase, "this as java.lang.String).toUpperCase(locale)");
                    C21317k c21317kM21662a4 = C18443P.f58840p.m21662a(0, upperCase);
                    if (c21317kM21662a4 == null || (c21317kM21662a = C18443P.f58841q.m21662a(0, upperCase)) == null || (c21317kM21662a2 = C18443P.f58842r.m21662a(0, AbstractC21329w.m21731r(AbstractC21329w.m21731r(upperCase, c21317kM21662a4.m21659c(), ""), c21317kM21662a.m21659c(), ""))) == null) {
                        c18443p2 = 0;
                    } else {
                        c18443p = new C18443P(AbstractC17680n.m19349Y(AbstractC17681o.m19382k(c21317kM21662a4, c21317kM21662a, c21317kM21662a2), Separators.RETURN, null, null, 0, null, C18442O.f58837Z, 30), AbstractC2119a.m3192f((String) ((C17662G) c21317kM21662a2.m21657a()).get(2)), AbstractC2119a.m3192f((String) ((C17662G) c21317kM21662a2.m21657a()).get(1)), (String) ((C17662G) c21317kM21662a.m21657a()).get(3), (String) ((C17662G) c21317kM21662a4.m21657a()).get(3), AbstractC2119a.m3191e((String) ((C17662G) c21317kM21662a.m21657a()).get(4)), AbstractC2119a.m3191e((String) ((C17662G) c21317kM21662a.m21657a()).get(1)), (String) ((C17662G) c21317kM21662a4.m21657a()).get(2));
                    }
                    if (c18443p2 == 0) {
                        c18443p2 = c18443p;
                        C21317k c21317kM21662a5 = C18443P.f58843s.m21662a(0, upperCase);
                        if (c21317kM21662a5 != null && (c21317kM21662a3 = C18443P.f58844t.m21662a(0, upperCase)) != null) {
                            objM13698a = new C18443P(AbstractC17680n.m19349Y(AbstractC17681o.m19382k(c21317kM21662a5, c21317kM21662a3), Separators.RETURN, null, null, 0, null, C18442O.f58838o0, 30), AbstractC2119a.m3192f((String) ((C17662G) c21317kM21662a5.m21657a()).get(4)), AbstractC2119a.m3192f((String) ((C17662G) c21317kM21662a5.m21657a()).get(3)), (String) ((C17662G) c21317kM21662a3.m21657a()).get(6), (String) ((C17662G) c21317kM21662a3.m21657a()).get(1), AbstractC2119a.m3191e((String) ((C17662G) c21317kM21662a3.m21657a()).get(7)), AbstractC2119a.m3191e((String) ((C17662G) c21317kM21662a3.m21657a()).get(4)), (String) ((C17662G) c21317kM21662a5.m21657a()).get(2));
                        }
                        c18443p2 = objM13698a;
                    }
                    return c18443p2 == 0 ? c18744b : new C18743a(new C18477m(c18443p2.f58845a, c18443p2.f58855k, c18443p2.f58858n, c18443p2.f58857m));
                } catch (ExecutionException unused3) {
                    return AbstractC9233X.m9806b(new C18750h());
                }
        }
    }
}
