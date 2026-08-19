package p354O5;

import kotlin.jvm.internal.AbstractC16544l;
import p049Bm.InterfaceC1439n;
import p283L5.C4945k;
import p283L5.C4954t;
import p409Qk.C6752c;
import p544W9.AbstractC8460C4;
import p571X9.AbstractC9233X;
import p754fl.C13693c;
import p792hl.C14535j;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: O5.c */
/* JADX INFO: loaded from: classes.dex */
public final class C6133c {

    /* JADX INFO: renamed from: a */
    public final C6752c f19994a;

    public /* synthetic */ C6133c(C6752c c6752c) {
        this.f19994a = c6752c;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public static Object m6675a(C6752c c6752c, C4954t c4954t, C4945k c4945k, AbstractC19687c abstractC19687c) throws Throwable {
        C6131a c6131a;
        InterfaceC1439n interfaceC1439n;
        if (abstractC19687c instanceof C6131a) {
            c6131a = (C6131a) abstractC19687c;
            int i10 = c6131a.f19990p0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c6131a.f19990p0 = i10 - Integer.MIN_VALUE;
            } else {
                c6131a = new C6131a(abstractC19687c);
            }
        } else {
            c6131a = new C6131a(abstractC19687c);
        }
        Object objM9082b = c6131a.f19989o0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c6131a.f19990p0;
        if (i11 != 0) {
            if (i11 == 1) {
                c6752c = c6131a.f19988Z;
                InterfaceC1439n interfaceC1439n2 = c6131a.f19987Y;
                AbstractC9233X.m9807c(objM9082b);
                interfaceC1439n = interfaceC1439n2;
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9233X.m9807c(objM9082b);
            }
        }
        AbstractC9233X.m9807c(objM9082b);
        c6131a.f19987Y = c4945k;
        c6131a.f19988Z = c6752c;
        c6131a.f19990p0 = 1;
        objM9082b = AbstractC8460C4.m9082b(c4954t, c6131a);
        if (objM9082b == enumC19250a) {
            interfaceC1439n = c4945k;
            return enumC19250a;
        }
        interfaceC1439n = c4945k;
        C14535j c14535j = new C14535j((C13693c) objM9082b, c6752c);
        C6132b c6132b = new C6132b(interfaceC1439n, null);
        c6131a.f19987Y = null;
        c6131a.f19988Z = null;
        c6131a.f19990p0 = 2;
        objM9082b = c14535j.m16037b(c6132b, c6131a);
        return objM9082b == enumC19250a ? enumC19250a : objM9082b;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C6133c) {
            return AbstractC16544l.m18089b(this.f19994a, ((C6133c) obj).f19994a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f19994a.hashCode();
    }

    public final String toString() {
        return "KtorNetworkClient(httpClient=" + this.f19994a + ')';
    }
}
