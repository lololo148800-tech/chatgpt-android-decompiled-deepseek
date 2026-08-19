package p571X9;

import io.ktor.utils.p815io.AbstractC15070F;
import io.ktor.utils.p815io.InterfaceC15088n;
import kotlin.jvm.internal.AbstractC16544l;
import p434Rk.C6911c;
import p434Rk.C6913e;
import p434Rk.C6914f;
import p488Tn.AbstractC7527j;
import p488Tn.InterfaceC7526i;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: X9.b3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9261b3 {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public static final Object m9835a(C6911c c6911c, AbstractC19687c abstractC19687c) {
        C6913e c6913e;
        if (abstractC19687c instanceof C6913e) {
            c6913e = (C6913e) abstractC19687c;
            int i10 = c6913e.f22171o0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c6913e.f22171o0 = i10 - Integer.MIN_VALUE;
            } else {
                c6913e = new C6913e(abstractC19687c);
            }
        } else {
            c6913e = new C6913e(abstractC19687c);
        }
        Object objM16186n = c6913e.f22170Z;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c6913e.f22171o0;
        if (i11 == 0) {
            AbstractC9233X.m9807c(objM16186n);
            InterfaceC15088n interfaceC15088nMo7304c = c6911c.m7297d().mo7304c();
            c6913e.f22169Y = c6911c;
            c6913e.f22171o0 = 1;
            objM16186n = AbstractC15070F.m16186n(interfaceC15088nMo7304c, c6913e);
            if (objM16186n == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c6911c = c6913e.f22169Y;
            AbstractC9233X.m9807c(objM16186n);
        }
        InterfaceC7526i interfaceC7526i = (InterfaceC7526i) objM16186n;
        AbstractC16544l.m18094g(interfaceC7526i, "<this>");
        return new C6914f(c6911c.f22164Y, c6911c.m7296c(), c6911c.m7297d(), AbstractC7527j.m7841g(interfaceC7526i, -1));
    }
}
