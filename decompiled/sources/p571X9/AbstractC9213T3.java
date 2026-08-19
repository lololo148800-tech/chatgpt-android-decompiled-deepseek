package p571X9;

import android.gov.nist.core.Separators;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import io.sentry.android.core.AbstractC15256t;
import java.util.HashMap;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC16544l;
import p025An.C0624m;
import p080D0.C1811j0;
import p214Ib.C3676s;
import p214Ib.C3677t;
import p265Kb.C4613f;
import p378Pa.C6379a;
import p476Ta.C7291a;
import p476Ta.C7292b;
import p476Ta.C7293c;
import p500Ua.C7595d;
import p500Ua.C7597f;
import p523V9.AbstractC7854B5;
import p523V9.AbstractC8154o0;
import p524Va.C8254f;
import p524Va.C8256h;
import p545Wa.AbstractC8754a;
import p658b5.C11234e;
import p720e6.C13288c;
import p746fa.AbstractC13600i;
import p746fa.C13599h;
import p746fa.C13606o;
import p919o8.C17974h;
import p960q9.C18655i;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: X9.T3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9213T3 {
    /* JADX INFO: renamed from: a */
    public static C17974h m9780a(C3676s c3676s) {
        try {
            String testExecutionId = c3676s.m4395w("test_execution_id").mo4384r();
            AbstractC16544l.m18093f(testExecutionId, "testExecutionId");
            return new C17974h(testExecutionId);
        } catch (IllegalStateException e10) {
            throw new C3677t("Unable to parse json into type CiTest", e10);
        } catch (NullPointerException e11) {
            throw new C3677t("Unable to parse json into type CiTest", e11);
        } catch (NumberFormatException e12) {
            throw new C3677t("Unable to parse json into type CiTest", e12);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX INFO: renamed from: b */
    public static final Object m9781b(C11234e c11234e, AbstractC19687c abstractC19687c) {
        C7291a c7291a;
        C13606o c13606oM8116d;
        String str;
        if (abstractC19687c instanceof C7291a) {
            c7291a = (C7291a) abstractC19687c;
            int i10 = c7291a.f23098Z;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c7291a.f23098Z = i10 - Integer.MIN_VALUE;
            } else {
                c7291a = new C7291a(abstractC19687c);
            }
        } else {
            c7291a = new C7291a(abstractC19687c);
        }
        Object objM9782c = c7291a.f23097Y;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c7291a.f23098Z;
        if (i11 == 0) {
            AbstractC9233X.m9807c(objM9782c);
            C7597f c7597f = (C7597f) c11234e.f34001Z;
            Object[] objArr = {c7597f.f24027b};
            C4613f c4613f = C7597f.f24025c;
            c4613f.m5360c("requestInAppReview (%s)", objArr);
            C8256h c8256h = c7597f.f24026a;
            if (c8256h == null) {
                Object[] objArr2 = new Object[0];
                if (Log.isLoggable("PlayCore", 6)) {
                    AbstractC15256t.m16465c("PlayCore", C4613f.m5358e(c4613f.f15035Y, "Play Store app is either not installed or not the official version", objArr2));
                }
                Locale locale = Locale.getDefault();
                HashMap map = AbstractC8754a.f26674a;
                if (map.containsKey(-1)) {
                    str = ((String) map.get(-1)) + " (https://developer.android.com/reference/com/google/android/play/core/review/model/ReviewErrorCode.html#" + ((String) AbstractC8754a.f26675b.get(-1)) + Separators.RPAREN;
                } else {
                    str = "";
                }
                c13606oM8116d = AbstractC7854B5.m8116d(new C6379a(new Status(-1, String.format(locale, "Review Error(%d): %s", -1, str), null, null)));
            } else {
                C13599h c13599h = new C13599h();
                c8256h.m8892a().post(new C8254f(c8256h, c13599h, c13599h, new C7595d(c7597f, c13599h, c13599h)));
                c13606oM8116d = c13599h.f42961a;
            }
            AbstractC16544l.m18093f(c13606oM8116d, "requestReviewFlow(...)");
            c7291a.f23098Z = 1;
            objM9782c = m9782c(c13606oM8116d, c7291a);
            if (objM9782c == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(objM9782c);
        }
        AbstractC16544l.m18091d(objM9782c);
        return objM9782c;
    }

    /* JADX INFO: renamed from: c */
    public static Object m9782c(C13606o c13606o, AbstractC19687c abstractC19687c) {
        C7292b c7292b = C7292b.f23099Y;
        C0624m c0624m = new C0624m(1, AbstractC8154o0.m8714e(abstractC19687c));
        c0624m.m1262r();
        c0624m.m1264u(new C1811j0(8, c7292b));
        if (!c13606o.m15131j()) {
            c13606o.m15126e(AbstractC13600i.f42962a, new C18655i(new C7293c(c0624m, 0), 18));
            c13606o.m15124c(new C13288c(c0624m));
        } else if (c13606o.m15132k()) {
            c0624m.resumeWith(c13606o.m15130i());
        } else {
            Exception excM15129h = c13606o.m15129h();
            AbstractC16544l.m18091d(excM15129h);
            c0624m.resumeWith(AbstractC9233X.m9806b(excM15129h));
        }
        Object objM1261q = c0624m.m1261q();
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        return objM1261q;
    }
}
