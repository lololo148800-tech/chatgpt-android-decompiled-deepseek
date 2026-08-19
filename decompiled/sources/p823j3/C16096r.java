package p823j3;

import p049Bm.InterfaceC1439n;
import p275Kn.AbstractC4817d;
import p275Kn.C4816c;
import p275Kn.InterfaceC4814a;
import p571X9.AbstractC9233X;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: j3.r */
/* JADX INFO: loaded from: classes.dex */
public final class C16096r implements InterfaceC16091m {

    /* JADX INFO: renamed from: a */
    public final C4816c f49860a = AbstractC4817d.m5451a();

    /* JADX INFO: renamed from: b */
    public final C16095q f49861b = new C16095q(this);

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m17652a(InterfaceC1439n interfaceC1439n, AbstractC19687c abstractC19687c) throws Throwable {
        C16092n c16092n;
        C4816c c4816c;
        C16096r c16096r;
        Throwable th2;
        InterfaceC4814a interfaceC4814a;
        if (abstractC19687c instanceof C16092n) {
            c16092n = (C16092n) abstractC19687c;
            int i10 = c16092n.f49847r0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c16092n.f49847r0 = i10 - Integer.MIN_VALUE;
            } else {
                c16092n = new C16092n(this, abstractC19687c);
            }
        } else {
            c16092n = new C16092n(this, abstractC19687c);
        }
        Object obj = c16092n.f49845p0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c16092n.f49847r0;
        try {
            if (i11 == 0) {
                AbstractC9233X.m9807c(obj);
                c16092n.f49842Y = this;
                c16092n.f49843Z = interfaceC1439n;
                c4816c = this.f49860a;
                c16092n.f49844o0 = c4816c;
                c16092n.f49847r0 = 1;
                if (c4816c.m5448e(null, c16092n) == enumC19250a) {
                    return enumC19250a;
                }
                c16096r = this;
            } else {
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    interfaceC4814a = (InterfaceC4814a) c16092n.f49842Y;
                    try {
                        AbstractC9233X.m9807c(obj);
                        ((C4816c) interfaceC4814a).m5450g(null);
                        return obj;
                    } catch (Throwable th3) {
                        th2 = th3;
                        ((C4816c) interfaceC4814a).m5450g(null);
                        throw th2;
                    }
                }
                C4816c c4816c2 = c16092n.f49844o0;
                InterfaceC1439n interfaceC1439n2 = c16092n.f49843Z;
                c16096r = (C16096r) c16092n.f49842Y;
                AbstractC9233X.m9807c(obj);
                c4816c = c4816c2;
                interfaceC1439n = interfaceC1439n2;
            }
            C16095q c16095q = c16096r.f49861b;
            c16092n.f49842Y = c4816c;
            c16092n.f49843Z = null;
            c16092n.f49844o0 = null;
            c16092n.f49847r0 = 2;
            Object objInvoke = interfaceC1439n.invoke(c16095q, c16092n);
            if (objInvoke == enumC19250a) {
                return enumC19250a;
            }
            C4816c c4816c3 = c4816c;
            obj = objInvoke;
            interfaceC4814a = c4816c3;
            ((C4816c) interfaceC4814a).m5450g(null);
            return obj;
        } catch (Throwable th4) {
            C4816c c4816c4 = c4816c;
            th2 = th4;
            interfaceC4814a = c4816c4;
            ((C4816c) interfaceC4814a).m5450g(null);
            throw th2;
        }
    }
}
