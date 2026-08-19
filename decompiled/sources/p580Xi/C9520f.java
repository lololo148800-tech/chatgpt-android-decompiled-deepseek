package p580Xi;

import kotlin.jvm.internal.AbstractC16526C;
import mm.C17296C;
import p025An.AbstractC0593T;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p1114xp.C21346q;
import p179H0.C3191i;
import p225Im.InterfaceC3756d;
import p530Vi.C8297E;
import p530Vi.C8312h;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Xi.f */
/* JADX INFO: loaded from: classes3.dex */
public final class C9520f extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f28652Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C8312h f28653Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C9521g f28654o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9520f(C8312h c8312h, C9521g c9521g, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f28653Z = c8312h;
        this.f28654o0 = c9521g;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C9520f(this.f28653Z, this.f28654o0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C9520f) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f28652Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C21346q c21346q = (C21346q) this.f28653Z.f25903Z.f7436Z;
            InterfaceC3756d interfaceC3756dMo5693b = AbstractC16526C.f51263a.mo5693b(C8297E.class);
            C9521g c9521g = this.f28654o0;
            C3191i c3191i = new C3191i(2, c9521g, C9521g.class, "runningUpdate", "runningUpdate(Lcom/segment/analytics/kotlin/core/System;)V", 4, 2);
            this.f28652Y = 1;
            if (c21346q.m21744f(c9521g, interfaceC3756dMo5693b, true, AbstractC0593T.f1824a, c3191i, this) == enumC19250a) {
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
