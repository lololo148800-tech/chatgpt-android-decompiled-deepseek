package p590Y4;

import java.util.LinkedHashSet;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p077Cn.InterfaceC1758z;
import p444S4.C7011q;
import p523V9.AbstractC8031Y3;
import p547Wc.C8816z;
import p571X9.AbstractC9233X;
import p613Z4.AbstractC10159f;
import p613Z4.AbstractC10160g;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Y4.c */
/* JADX INFO: loaded from: classes.dex */
public final class C9646c extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f29070Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f29071Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ AbstractC9647d f29072o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9646c(AbstractC9647d abstractC9647d, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f29072o0 = abstractC9647d;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C9646c c9646c = new C9646c(this.f29072o0, interfaceC18770c);
        c9646c.f29071Z = obj;
        return c9646c;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C9646c) create((InterfaceC1758z) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f29070Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            InterfaceC1758z interfaceC1758z = (InterfaceC1758z) this.f29071Z;
            AbstractC9647d abstractC9647d = this.f29072o0;
            C9645b c9645b = new C9645b(abstractC9647d, interfaceC1758z);
            AbstractC10159f abstractC10159f = abstractC9647d.f29073a;
            abstractC10159f.getClass();
            synchronized (abstractC10159f.f30091c) {
                try {
                    if (((LinkedHashSet) abstractC10159f.f30093e).add(c9645b)) {
                        if (((LinkedHashSet) abstractC10159f.f30093e).size() == 1) {
                            abstractC10159f.f30092d = abstractC10159f.mo10755a();
                            C7011q.m7408d().m7410a(AbstractC10160g.f30094a, abstractC10159f.getClass().getSimpleName() + ": initial state = " + abstractC10159f.f30092d);
                            abstractC10159f.mo10758c();
                        }
                        c9645b.m10228a(abstractC10159f.f30092d);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            C8816z c8816z = new C8816z(this.f29072o0, 6, c9645b);
            this.f29070Y = 1;
            if (AbstractC8031Y3.m8377a(interfaceC1758z, c8816z, this) == enumC19250a) {
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
