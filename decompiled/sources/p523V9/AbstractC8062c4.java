package p523V9;

import android.gov.nist.javax.sip.header.ParameterNames;
import android.os.Build;
import android.view.View;
import kotlin.jvm.internal.AbstractC16544l;
import p081D1.AbstractC1849f;
import p081D1.C1844a;
import p1008s8.C19497z;
import p1071w0.AbstractC20734X;
import p214Ib.C3676s;
import p214Ib.C3677t;
import p537W0.C8410b;
import p571X9.AbstractC9233X;
import p672c3.C11580M;
import p672c3.C11623p;
import p672c3.C11641y;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: V9.c4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8062c4 {
    /* JADX INFO: renamed from: a */
    public static C19497z m8455a(C3676s c3676s) {
        try {
            String id2 = c3676s.m4395w(ParameterNames.f31999ID).mo4384r();
            AbstractC16544l.m18093f(id2, "id");
            return new C19497z(id2);
        } catch (IllegalStateException e10) {
            throw new C3677t("Unable to parse json into type View", e10);
        } catch (NullPointerException e11) {
            throw new C3677t("Unable to parse json into type View", e11);
        } catch (NumberFormatException e12) {
            throw new C3677t("Unable to parse json into type View", e12);
        }
    }

    /* JADX INFO: renamed from: b */
    public static C1844a m8456b(View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return new C1844a(AbstractC1849f.m2703a(view));
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public static final void m8457c(C8410b c8410b, AbstractC19687c abstractC19687c) {
        C11580M c11580m;
        if (abstractC19687c instanceof C11580M) {
            c11580m = (C11580M) abstractC19687c;
            int i10 = c11580m.f35024Z;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c11580m.f35024Z = i10 - Integer.MIN_VALUE;
            } else {
                c11580m = new C11580M(abstractC19687c);
            }
        } else {
            c11580m = new C11580M(abstractC19687c);
        }
        Object obj = c11580m.f35023Y;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c11580m.f35024Z;
        if (i11 != 0) {
            if (i11 == 1) {
                throw AbstractC20734X.m21252w(obj);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC9233X.m9807c(obj);
        C11623p c11623p = (C11623p) c11580m.getContext().get(C11641y.f35270Y);
        if (c11623p == null) {
            throw new IllegalStateException("provideContent requires a ContentReceiver and should only be called from GlanceAppWidget.provideGlance");
        }
        c11580m.f35024Z = 1;
        c11623p.m12998b(c8410b, c11580m);
    }
}
