package p103Dn;

import kotlin.jvm.internal.C16525B;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p129En.AbstractC2592c;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Dn.y */
/* JADX INFO: loaded from: classes2.dex */
public final class C2216y extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f6794Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C16525B f6795Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC2186j f6796o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2216y(InterfaceC2186j interfaceC2186j, C16525B c16525b, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f6795Z = c16525b;
        this.f6796o0 = interfaceC2186j;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C2216y(this.f6796o0, this.f6795Z, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C2216y) create((C17296C) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f6794Y;
        C17296C c17296c = C17296C.f55119a;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C16525B c16525b = this.f6795Z;
            Object obj2 = c16525b.f51262Y;
            if (obj2 == null) {
                return c17296c;
            }
            c16525b.f51262Y = null;
            if (obj2 == AbstractC2592c.f8037b) {
                obj2 = null;
            }
            this.f6794Y = 1;
            if (this.f6796o0.mo395a(obj2, this) == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
        }
        return c17296c;
    }
}
