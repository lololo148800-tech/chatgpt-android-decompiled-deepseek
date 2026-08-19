package io;

import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p492U1.C7545j;
import p571X9.AbstractC9233X;
import p773h0.EnumC14284g0;
import p937p1.C18286b;
import p937p1.InterfaceC18285a;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: io.c */
/* JADX INFO: loaded from: classes2.dex */
public final class C15047c extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f46768Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C15105o f46769Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ float f46770o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ InterfaceC18285a f46771p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15047c(C15105o c15105o, float f10, InterfaceC18285a interfaceC18285a, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f46769Z = c15105o;
        this.f46770o0 = f10;
        this.f46771p0 = interfaceC18285a;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C15047c(this.f46769Z, this.f46770o0, this.f46771p0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C15047c) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0051  */
    /* JADX WARN: Code duplicated, block: B:19:0x0059 A[RETURN] */
    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f46768Y;
        C17296C c17296c = C17296C.f55119a;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C15105o c15105o = this.f46769Z;
            InterfaceC15054j interfaceC15054jM16229b = c15105o.m16229b();
            if (interfaceC15054jM16229b instanceof C15051g) {
                float f10 = ((int) (((C7545j) c15105o.f46992g.getValue()).f23903a & 4294967295L)) * c15105o.f46986a * 10.0f;
                boolean z6 = ((C15051g) interfaceC15054jM16229b).f46778a;
                float f11 = this.f46770o0;
                if (z6 || Math.abs(f11) >= f10) {
                    ((C18286b) this.f46771p0).m19828a(0);
                    this.f46768Y = 1;
                    Object objMo5517a = c15105o.f46994i.mo5517a(EnumC14284g0.f44823o0, new C15055k(c15105o, f11, null), this);
                    if (objMo5517a != enumC19250a) {
                        objMo5517a = c17296c;
                    }
                    if (objMo5517a == enumC19250a) {
                        return enumC19250a;
                    }
                } else {
                    this.f46768Y = 2;
                    if (c15105o.m16228a(this) == enumC19250a) {
                        return enumC19250a;
                    }
                }
            } else {
                this.f46768Y = 2;
                if (c15105o.m16228a(this) == enumC19250a) {
                    return enumC19250a;
                }
            }
        } else {
            if (i10 != 1 && i10 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
        }
        return c17296c;
    }
}
