package li;

import gd.C13969n2;
import gd.C13982r;
import gd.C13994u;
import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: li.f */
/* JADX INFO: loaded from: classes3.dex */
public final class C16967f extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f54450Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C16968g f54451Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16967f(C16968g c16968g, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f54451Z = c16968g;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C16967f(this.f54451Z, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C16967f) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f54450Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C13969n2 c13969n2 = this.f54451Z.f54456d;
            C13982r c13982r = C13982r.f44042e;
            this.f54450Y = 1;
            obj = c13969n2.m15478b(c13982r, this);
            if (obj == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
        }
        C16968g.f54452f = (C13994u) obj;
        return C17296C.f55119a;
    }
}
