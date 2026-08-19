package p229J0;

import p025An.C0624m;
import p275Kn.AbstractC4817d;
import p275Kn.C4816c;
import p275Kn.InterfaceC4814a;
import p349O0.C5975S;
import p349O0.C5997d;
import p349O0.C6002f0;
import p523V9.AbstractC8154o0;
import p571X9.AbstractC9233X;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: J0.M3 */
/* JADX INFO: loaded from: classes.dex */
public final class C3952M3 {

    /* JADX INFO: renamed from: a */
    public final C4816c f12252a = AbstractC4817d.m5451a();

    /* JADX INFO: renamed from: b */
    public final C6002f0 f12253b = C5997d.m6430Q(null, C5975S.f19448r0);

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public final Object m4658a(InterfaceC4006X3 interfaceC4006X3, AbstractC19687c abstractC19687c) {
        C3946L3 c3946l3;
        C3952M3 c3952m3;
        InterfaceC4814a interfaceC4814a;
        InterfaceC4006X3 interfaceC4006X4;
        C3952M3 c3952m4;
        Throwable th2;
        InterfaceC4814a interfaceC4814a2;
        if (abstractC19687c instanceof C3946L3) {
            c3946l3 = (C3946L3) abstractC19687c;
            int i10 = c3946l3.f12182r0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c3946l3.f12182r0 = i10 - Integer.MIN_VALUE;
            } else {
                c3946l3 = new C3946L3(this, abstractC19687c);
            }
        } else {
            c3946l3 = new C3946L3(this, abstractC19687c);
        }
        Object obj = c3946l3.f12180p0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c3946l3.f12182r0;
        try {
            try {
                if (i11 == 0) {
                    AbstractC9233X.m9807c(obj);
                    c3946l3.f12177Y = this;
                    c3946l3.f12178Z = interfaceC4006X3;
                    C4816c c4816c = this.f12252a;
                    c3946l3.f12179o0 = c4816c;
                    c3946l3.f12182r0 = 1;
                    if (c4816c.m5448e(null, c3946l3) == enumC19250a) {
                        return enumC19250a;
                    }
                    c3952m3 = this;
                    interfaceC4006X4 = interfaceC4006X3;
                    interfaceC4814a = c4816c;
                } else {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        InterfaceC4814a interfaceC4814a3 = c3946l3.f12179o0;
                        c3952m4 = c3946l3.f12177Y;
                        try {
                            AbstractC9233X.m9807c(obj);
                            interfaceC4814a2 = interfaceC4814a3;
                            c3952m4.f12253b.setValue(null);
                            ((C4816c) interfaceC4814a2).m5450g(null);
                            return obj;
                        } catch (Throwable th3) {
                            th2 = th3;
                            c3952m4.f12253b.setValue(null);
                            throw th2;
                        }
                    }
                    InterfaceC4814a interfaceC4814a4 = c3946l3.f12179o0;
                    InterfaceC4006X3 interfaceC4006X5 = c3946l3.f12178Z;
                    c3952m3 = c3946l3.f12177Y;
                    AbstractC9233X.m9807c(obj);
                    interfaceC4814a = interfaceC4814a4;
                    interfaceC4006X4 = interfaceC4006X5;
                }
                c3946l3.f12177Y = c3952m3;
                c3946l3.f12178Z = interfaceC4006X4;
                c3946l3.f12179o0 = interfaceC4814a;
                c3946l3.f12182r0 = 2;
                C0624m c0624m = new C0624m(1, AbstractC8154o0.m8714e(c3946l3));
                c0624m.m1262r();
                c3952m3.f12253b.setValue(new C3934J3(interfaceC4006X4, c0624m));
                Object objM1261q = c0624m.m1261q();
                if (objM1261q == enumC19250a) {
                    return enumC19250a;
                }
                c3952m4 = c3952m3;
                InterfaceC4814a interfaceC4814a5 = interfaceC4814a;
                obj = objM1261q;
                interfaceC4814a2 = interfaceC4814a5;
                c3952m4.f12253b.setValue(null);
                ((C4816c) interfaceC4814a2).m5450g(null);
                return obj;
            } catch (Throwable th4) {
                c3952m4 = c3952m3;
                th2 = th4;
                c3952m4.f12253b.setValue(null);
                throw th2;
            }
        } catch (Throwable th5) {
            ((C4816c) interfaceC4006X3).m5450g(null);
            throw th5;
        }
    }
}
