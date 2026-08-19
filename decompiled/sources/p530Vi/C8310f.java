package p530Vi;

import com.segment.analytics.kotlin.core.AbstractC12774a;
import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p1114xp.C21346q;
import p554Wi.C8884k;
import p554Wi.EnumC8881h;
import p571X9.AbstractC9233X;
import p594Y9.AbstractC9758K4;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Vi.f */
/* JADX INFO: loaded from: classes3.dex */
public final class C8310f extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f25894Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ AbstractC12774a f25895Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C8312h f25896o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ InterfaceC1436k f25897p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8310f(AbstractC12774a abstractC12774a, C8312h c8312h, InterfaceC1436k interfaceC1436k, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f25895Z = abstractC12774a;
        this.f25896o0 = c8312h;
        this.f25897p0 = interfaceC1436k;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C8310f(this.f25895Z, this.f25896o0, this.f25897p0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C8310f) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f25894Y;
        AbstractC12774a abstractC12774a = this.f25895Z;
        C8312h c8312h = this.f25896o0;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C21346q c21346q = (C21346q) c8312h.f25903Z.f7436Z;
            this.f25894Y = 1;
            if (abstractC12774a.m14521a(c21346q, this) == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
        }
        AbstractC9758K4.m10361b(c8312h, "processing event on " + Thread.currentThread().getName());
        C8884k c8884kM8933c = c8312h.m8933c();
        c8884kM8933c.getClass();
        Object objM9556c = c8884kM8933c.m9556c(EnumC8881h.f27184Z, c8884kM8933c.m9556c(EnumC8881h.f27183Y, abstractC12774a));
        InterfaceC1436k interfaceC1436k = this.f25897p0;
        if (interfaceC1436k != null) {
            objM9556c = interfaceC1436k.invoke(objM9556c);
        }
        AbstractC12774a abstractC12774a2 = (AbstractC12774a) objM9556c;
        c8884kM8933c.m9556c(EnumC8881h.f27185o0, abstractC12774a2);
        c8884kM8933c.m9556c(EnumC8881h.f27186p0, abstractC12774a2);
        return C17296C.f55119a;
    }
}
