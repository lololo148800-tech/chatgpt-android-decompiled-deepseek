package p086D6;

import java.util.UUID;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.C16556x;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p103Dn.InterfaceC2186j;
import p571X9.AbstractC9233X;
import p917o6.C17851d;
import p917o6.C17852e;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: D6.l */
/* JADX INFO: loaded from: classes.dex */
public final class C1968l extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f5822Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f5823Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C16556x f5824o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C17852e f5825p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1968l(C16556x c16556x, C17852e c17852e, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f5824o0 = c16556x;
        this.f5825p0 = c17852e;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C1968l c1968l = new C1968l(this.f5824o0, this.f5825p0, interfaceC18770c);
        c1968l.f5823Z = obj;
        return c1968l;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C1968l) create((InterfaceC2186j) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f5822Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            InterfaceC2186j interfaceC2186j = (InterfaceC2186j) this.f5823Z;
            C16556x c16556x = this.f5824o0;
            boolean z6 = c16556x.f51285Y;
            C17852e c17852e = this.f5825p0;
            if (z6) {
                c16556x.f51285Y = false;
                this.f5822Y = 1;
                if (interfaceC2186j.mo395a(c17852e, this) == enumC19250a) {
                    return enumC19250a;
                }
            } else {
                C17851d c17851dM19597a = c17852e.m19597a();
                UUID uuidRandomUUID = UUID.randomUUID();
                AbstractC16544l.m18093f(uuidRandomUUID, "randomUUID(...)");
                c17851dM19597a.f56912b = uuidRandomUUID;
                C17852e c17852eM19596a = c17851dM19597a.m19596a();
                this.f5822Y = 2;
                if (interfaceC2186j.mo395a(c17852eM19596a, this) == enumC19250a) {
                    return enumC19250a;
                }
            }
        } else {
            if (i10 != 1 && i10 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
        }
        return C17296C.f55119a;
    }
}
