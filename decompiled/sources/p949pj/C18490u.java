package p949pj;

import android.content.Context;
import android.gov.nist.core.Separators;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import p025An.AbstractC0575H;
import p025An.AbstractC0593T;
import p025An.C0621k0;
import p050Bn.C1451e;
import p1113xn.C21317k;
import p1113xn.C21319m;
import p153Fn.AbstractC2935m;
import p201Hn.C3516e;
import p201Hn.ExecutorC3515d;
import p536W.C8408d;
import p571X9.AbstractC9233X;
import p747fb.InterfaceFutureC13608b;
import p887m7.C17176b;
import p909nm.AbstractC17680n;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: pj.u */
/* JADX INFO: loaded from: classes3.dex */
public final class C18490u {

    /* JADX INFO: renamed from: a */
    public static final C18490u f58938a = new C18490u();

    /* JADX INFO: renamed from: a */
    public static final C21319m m19880a(C18490u c18490u, String str) {
        return new C21319m(AbstractC10763a.m11054l(Separators.RETURN, str, "(.+?)(\n|$)"));
    }

    /* JADX INFO: renamed from: b */
    public static Date m19881b(String str) {
        if (str == null) {
            return null;
        }
        try {
            return new SimpleDateFormat("MMddyyyy", Locale.US).parse(str);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public static String m19882c(String str, C21319m c21319m) {
        C21317k c21317kM21662a = c21319m.m21662a(0, str);
        if (c21317kM21662a != null) {
            return (String) AbstractC17680n.m19344T(1, c21317kM21662a.m21657a());
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0085 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: d */
    public Object m19883d(Context context, AbstractC19687c abstractC19687c) throws Throwable {
        C18487r c18487r;
        C1451e c1451e;
        C18488s c18488s;
        if (abstractC19687c instanceof C18487r) {
            c18487r = (C18487r) abstractC19687c;
            int i10 = c18487r.f58935o0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c18487r.f58935o0 = i10 - Integer.MIN_VALUE;
            } else {
                c18487r = new C18487r(this, abstractC19687c);
            }
        } else {
            c18487r = new C18487r(this, abstractC19687c);
        }
        Object objM1168P = c18487r.f58933Y;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c18487r.f58935o0;
        if (i11 != 0) {
            if (i11 == 1) {
                AbstractC9233X.m9807c(objM1168P);
            } else if (i11 == 2) {
                AbstractC9233X.m9807c(objM1168P);
                C3516e c3516e = AbstractC0593T.f1824a;
                c1451e = AbstractC2935m.f8797a;
                c18488s = new C18488s((C8408d) objM1168P, null);
                c18487r.f58935o0 = 3;
                if (AbstractC0575H.m1168P(c1451e, c18488s, c18487r) == enumC19250a) {
                    return enumC19250a;
                }
            } else {
                if (i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9233X.m9807c(objM1168P);
            }
            return C17296C.f55119a;
        }
        AbstractC9233X.m9807c(objM1168P);
        C3516e c3516e2 = AbstractC0593T.f1824a;
        C1451e c1451e2 = AbstractC2935m.f8797a;
        C18489t c18489t = new C18489t(context, null);
        c18487r.f58935o0 = 1;
        objM1168P = AbstractC0575H.m1168P(c1451e2, c18489t, c18487r);
        if (objM1168P == enumC19250a) {
            return enumC19250a;
        }
        AbstractC16544l.m18093f(objM1168P, "withContext(...)");
        C3516e c3516e3 = AbstractC0593T.f1824a;
        ExecutorC3515d executorC3515d = ExecutorC3515d.f10633Z;
        C17176b c17176b = new C17176b((InterfaceFutureC13608b) objM1168P, 4);
        c18487r.f58935o0 = 2;
        objM1168P = AbstractC0575H.m1168P(executorC3515d, new C0621k0(c17176b, null), c18487r);
        if (objM1168P == enumC19250a) {
            return enumC19250a;
        }
        C3516e c3516e4 = AbstractC0593T.f1824a;
        c1451e = AbstractC2935m.f8797a;
        c18488s = new C18488s((C8408d) objM1168P, null);
        c18487r.f58935o0 = 3;
        if (AbstractC0575H.m1168P(c1451e, c18488s, c18487r) == enumC19250a) {
            return enumC19250a;
        }
        return C17296C.f55119a;
    }
}
