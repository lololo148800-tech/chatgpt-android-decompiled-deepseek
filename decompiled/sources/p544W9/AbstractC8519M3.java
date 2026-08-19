package p544W9;

import kotlin.jvm.internal.AbstractC16544l;
import p025An.AbstractC0575H;
import p025An.C0644w;
import p049Bm.InterfaceC1439n;
import p324Mn.C5521B;
import p324Mn.C5525F;
import p324Mn.C5551u;
import p561X.C8990d;
import p571X9.AbstractC9233X;
import p817j$.time.DateTimeException;
import p817j$.time.LocalDateTime;
import p823j3.C16072K;
import p823j3.C16077P;
import p823j3.C16078Q;
import p823j3.C16104z;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: W9.M3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8519M3 {
    /* JADX INFO: renamed from: a */
    public static final C5521B m9187a(C5551u c5551u, C5525F c5525f) {
        AbstractC16544l.m18094g(c5551u, "<this>");
        try {
            return new C5521B(LocalDateTime.ofInstant(c5551u.f18004Y, c5525f.f17977a));
        } catch (DateTimeException e10) {
            throw new C0644w(e10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static final Object m9188b(C8990d c8990d, C16104z c16104z, AbstractC19687c abstractC19687c) {
        C16078Q c16078q;
        if (abstractC19687c instanceof C16078Q) {
            c16078q = (C16078Q) abstractC19687c;
            int i10 = c16078q.f49795o0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c16078q.f49795o0 = i10 - Integer.MIN_VALUE;
            } else {
                c16078q = new C16078Q(abstractC19687c);
            }
        } else {
            c16078q = new C16078Q(abstractC19687c);
        }
        Object objM1183l = c16078q.f49794Z;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c16078q.f49795o0;
        Object obj = null;
        try {
            if (i11 == 0) {
                AbstractC9233X.m9807c(objM1183l);
                c16078q.f49793Y = c16104z;
                c16078q.f49795o0 = 1;
                objM1183l = AbstractC0575H.m1183l(new C16077P(c16104z, c8990d, null), c16078q);
                c16104z = c16104z;
                if (objM1183l == enumC19250a) {
                    return enumC19250a;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                InterfaceC1439n interfaceC1439n = c16078q.f49793Y;
                AbstractC9233X.m9807c(objM1183l);
                c16104z = interfaceC1439n;
            }
            obj = objM1183l;
            return obj;
        } catch (C16072K e10) {
            if (e10.f49767Z == c16104z.hashCode()) {
                return obj;
            }
            throw e10;
        }
    }
}
