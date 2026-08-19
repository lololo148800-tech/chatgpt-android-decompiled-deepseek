package p672c3;

import io.sentry.android.core.AbstractC15256t;
import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p077Cn.C1753u;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: c3.Y */
/* JADX INFO: loaded from: classes.dex */
public final class C11591Y extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f35071Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C11596b0 f35072Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11591Y(C11596b0 c11596b0, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f35072Z = c11596b0;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C11591Y(this.f35072Z, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C11591Y) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f35071Y;
        try {
            if (i10 == 0) {
                AbstractC9233X.m9807c(obj);
                C11596b0 c11596b0 = this.f35072Z;
                C11597c c11597c = new C11597c(c11596b0.f35085b);
                this.f35071Y = 1;
                if (C11596b0.m12978a(c11596b0, c11597c, this) == enumC19250a) {
                    return enumC19250a;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9233X.m9807c(obj);
            }
            return C17296C.f55119a;
        } catch (C1753u e10) {
            return new Integer(AbstractC15256t.m16466d("GlanceRemoteViewService", "Error when trying to start session for list items", e10));
        }
    }
}
