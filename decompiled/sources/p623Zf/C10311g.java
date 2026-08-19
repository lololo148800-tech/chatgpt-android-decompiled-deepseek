package p623Zf;

import ga.C13834b;
import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p1048uo.AbstractC20405l;
import p1081wc.InterfaceC20904w;
import p1149zc.C21841c;
import p571X9.AbstractC9233X;
import p893n.AbstractActivityC17375g;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Zf.g */
/* JADX INFO: loaded from: classes3.dex */
public final class C10311g extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f30613Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC1436k f30614Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ AbstractActivityC17375g f30615o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C10324t f30616p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ InterfaceC20904w f30617q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10311g(InterfaceC1436k interfaceC1436k, AbstractActivityC17375g abstractActivityC17375g, C10324t c10324t, InterfaceC20904w interfaceC20904w, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f30614Z = interfaceC1436k;
        this.f30615o0 = abstractActivityC17375g;
        this.f30616p0 = c10324t;
        this.f30617q0 = interfaceC20904w;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C10311g(this.f30614Z, this.f30615o0, this.f30616p0, this.f30617q0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C10311g) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f30613Y;
        InterfaceC1436k interfaceC1436k = this.f30614Z;
        try {
            if (i10 == 0) {
                AbstractC9233X.m9807c(obj);
                interfaceC1436k.invoke(new C10321q(true));
                AbstractActivityC17375g abstractActivityC17375g = this.f30615o0;
                String str = this.f30616p0.f30637a;
                InterfaceC20904w interfaceC20904w = this.f30617q0;
                this.f30613Y = 1;
                obj = AbstractC20405l.m21071b(abstractActivityC17375g, str, interfaceC20904w, this);
                if (obj == enumC19250a) {
                    return enumC19250a;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9233X.m9807c(obj);
            }
            interfaceC1436k.invoke(new C10320p(C21841c.f69307c, (C13834b) obj));
            interfaceC1436k.invoke(new C10321q(false));
            return C17296C.f55119a;
        } catch (Throwable th2) {
            interfaceC1436k.invoke(new C10321q(false));
            throw th2;
        }
    }
}
