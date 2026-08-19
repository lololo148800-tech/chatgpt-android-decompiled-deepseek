package p103Dn;

import mm.C17296C;
import p049Bm.InterfaceC1440o;
import p129En.C2590a;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Dn.Y */
/* JADX INFO: loaded from: classes2.dex */
public final class C2166Y implements InterfaceC2186j {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ AbstractC19694j f6637Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC2186j f6638Z;

    /* JADX WARN: Multi-variable type inference failed */
    public C2166Y(InterfaceC1440o interfaceC1440o, InterfaceC2186j interfaceC2186j) {
        this.f6637Y = (AbstractC19694j) interfaceC1440o;
        this.f6638Z = interfaceC2186j;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r6v2, types: [Bm.o, sm.j] */
    @Override // p103Dn.InterfaceC2186j
    /* JADX INFO: renamed from: a */
    public final Object mo395a(Object obj, InterfaceC18770c interfaceC18770c) {
        C2165X c2165x;
        C2166Y c2166y;
        if (interfaceC18770c instanceof C2165X) {
            c2165x = (C2165X) interfaceC18770c;
            int i10 = c2165x.f6635o0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c2165x.f6635o0 = i10 - Integer.MIN_VALUE;
            } else {
                c2165x = new C2165X(this, interfaceC18770c);
            }
        } else {
            c2165x = new C2165X(this, interfaceC18770c);
        }
        Object objInvoke = c2165x.f6634Z;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c2165x.f6635o0;
        if (i11 == 0) {
            AbstractC9233X.m9807c(objInvoke);
            c2165x.f6633Y = this;
            c2165x.f6635o0 = 1;
            objInvoke = this.f6637Y.invoke(this.f6638Z, obj, c2165x);
            if (objInvoke == enumC19250a) {
                return enumC19250a;
            }
            c2166y = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c2166y = c2165x.f6633Y;
            AbstractC9233X.m9807c(objInvoke);
        }
        if (((Boolean) objInvoke).booleanValue()) {
            return C17296C.f55119a;
        }
        throw new C2590a(c2166y);
    }
}
