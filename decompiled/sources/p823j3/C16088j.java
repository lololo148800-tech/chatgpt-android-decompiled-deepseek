package p823j3;

import mm.C17296C;
import p025An.C0624m;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p523V9.AbstractC8154o0;
import p571X9.AbstractC9233X;
import p749fd.C13628m;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: j3.j */
/* JADX INFO: loaded from: classes.dex */
public final class C16088j extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f49823Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C16089k f49824Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16088j(C16089k c16089k, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f49824Z = c16089k;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C16088j(this.f49824Z, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C16088j) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f49823Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            this.f49824Z.m17649c();
            C16089k c16089k = this.f49824Z;
            this.f49823Y = 1;
            C0624m c0624m = new C0624m(1, AbstractC8154o0.m8714e(this));
            c0624m.m1262r();
            synchronized (c16089k.f49831s0) {
                c16089k.f49832t0 = c16089k.f49827o0;
                c16089k.f49834v0 = c0624m;
            }
            c0624m.m1264u(new C13628m(c16089k, 22));
            if (c0624m.m1261q() == enumC19250a) {
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
