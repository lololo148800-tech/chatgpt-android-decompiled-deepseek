package sk;

import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p077Cn.EnumC1733a;
import p103Dn.AbstractC2173c0;
import p103Dn.C2146N;
import p103Dn.C2176e;
import p103Dn.InterfaceC2184i;
import p103Dn.InterfaceC2186j;
import p571X9.AbstractC9233X;
import p658b5.C11232c;
import p729ej.C13435z;
import p791hj.C14522e;
import p909nm.AbstractC17678l;
import p972qm.C18777j;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: sk.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C19663b extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f62322Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f62323Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C14522e f62324o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19663b(C14522e c14522e, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f62324o0 = c14522e;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C19663b c19663b = new C19663b(this.f62324o0, interfaceC18770c);
        c19663b.f62323Z = obj;
        return c19663b;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C19663b) create((InterfaceC2186j) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f62322Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            InterfaceC2186j interfaceC2186j = (InterfaceC2186j) this.f62323Z;
            C14522e c14522e = this.f62324o0;
            InterfaceC2184i[] interfaceC2184iArr = {(C2146N) ((C11232c) c14522e.f45762Z).f33997Z, (C2146N) ((C11232c) c14522e.f45763o0).f33997Z, (C2146N) ((C11232c) c14522e.f45764p0).f33997Z};
            int i11 = AbstractC2173c0.f6659a;
            C2176e c2176e = new C2176e(AbstractC17678l.m19295b(interfaceC2184iArr), C18777j.f59682Y, -2, EnumC1733a.f4961Y);
            C13435z c13435z = new C13435z(interfaceC2186j, 6, c14522e);
            this.f62322Y = 1;
            if (c2176e.mo3141d(c13435z, this) == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
        }
        return C17296C.f55119a;
    }
}
