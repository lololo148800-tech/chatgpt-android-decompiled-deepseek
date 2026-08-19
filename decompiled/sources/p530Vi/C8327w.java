package p530Vi;

import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p1114xp.C21346q;
import p225Im.InterfaceC3756d;
import p554Wi.C8880g;
import p554Wi.C8884k;
import p554Wi.InterfaceC8882i;
import p571X9.AbstractC9233X;
import p580Xi.C9519e;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Vi.w */
/* JADX INFO: loaded from: classes3.dex */
public final class C8327w extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f25962Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C8312h f25963Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C9519e f25964o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8327w(C8312h c8312h, C9519e c9519e, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f25963Z = c8312h;
        this.f25964o0 = c9519e;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C8327w(this.f25963Z, this.f25964o0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C8327w) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.Map] */
    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        InterfaceC8882i interfaceC8882i;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f25962Y;
        C9519e c9519e = this.f25964o0;
        C8312h c8312h = this.f25963Z;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C21346q c21346q = (C21346q) c8312h.f25903Z.f7436Z;
            String destinationKey = c9519e.f28651r0;
            AbstractC16544l.m18094g(destinationKey, "destinationKey");
            C8295C c8295c = new C8295C(0);
            c8295c.f25850b = destinationKey;
            InterfaceC3756d interfaceC3756dMo5693b = AbstractC16526C.f51263a.mo5693b(C8297E.class);
            this.f25962Y = 1;
            if (c21346q.m21740b(c8295c, interfaceC3756dMo5693b, this) == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
        }
        InterfaceC3756d interfaceC3756dMo5693b2 = AbstractC16526C.f51263a.mo5693b(C9519e.class);
        C8884k c8884kM8933c = c8312h.m8933c();
        c8884kM8933c.getClass();
        Iterator it = c8884kM8933c.f27192a.entrySet().iterator();
        do {
            interfaceC8882i = null;
            if (!it.hasNext()) {
                break;
            }
            C8880g c8880g = (C8880g) ((Map.Entry) it.next()).getValue();
            c8880g.getClass();
            for (InterfaceC8882i interfaceC8882i2 : c8880g.f27182a) {
                if (interfaceC3756dMo5693b2.mo4449e(interfaceC8882i2)) {
                    AbstractC16544l.m18092e(interfaceC8882i2, "null cannot be cast to non-null type T of com.segment.analytics.kotlin.core.platform.Mediator.find$lambda$3");
                    interfaceC8882i = interfaceC8882i2;
                    break;
                }
            }
        } while (interfaceC8882i == null);
        C9519e c9519e2 = (C9519e) interfaceC8882i;
        if (c9519e2 != null) {
            c9519e2.f28648o0 = true;
        }
        return C17296C.f55119a;
    }
}
