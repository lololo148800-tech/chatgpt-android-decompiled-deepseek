package p554Wi;

import com.segment.analytics.kotlin.core.Settings;
import java.util.Collection;
import java.util.Set;
import kotlin.jvm.internal.AbstractC16526C;
import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p1114xp.C21346q;
import p117Eb.C2392v;
import p225Im.InterfaceC3756d;
import p530Vi.C8295C;
import p530Vi.C8297E;
import p530Vi.C8312h;
import p571X9.AbstractC9233X;
import p909nm.AbstractC17665J;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Wi.j */
/* JADX INFO: loaded from: classes3.dex */
public final class C8883j extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f27189Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C8312h f27190Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC8882i f27191o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8883j(C8312h c8312h, InterfaceC8882i interfaceC8882i, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f27190Z = c8312h;
        this.f27191o0 = interfaceC8882i;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C8883j(this.f27190Z, this.f27191o0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C8883j) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f27189Y;
        C2392v c2392v = this.f27190Z.f25903Z;
        if (i10 != 0) {
            if (i10 == 1) {
                AbstractC9233X.m9807c(obj);
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9233X.m9807c(obj);
            }
            return C17296C.f55119a;
        }
        AbstractC9233X.m9807c(obj);
        C21346q c21346q = (C21346q) c2392v.f7436Z;
        InterfaceC3756d interfaceC3756dMo5693b = AbstractC16526C.f51263a.mo5693b(C8297E.class);
        this.f27189Y = 1;
        obj = c21346q.m21739a(interfaceC3756dMo5693b, this);
        if (obj == enumC19250a) {
            return enumC19250a;
        }
        C8297E c8297e = (C8297E) obj;
        Settings settings = c8297e != null ? c8297e.f25854b : null;
        if (settings != null && !((Collection) c8297e.f25856d).isEmpty()) {
            InterfaceC8882i interfaceC8882i = this.f27191o0;
            interfaceC8882i.mo7803b(settings, 1);
            C21346q c21346q2 = (C21346q) c2392v.f7436Z;
            Set setM19268h = AbstractC17665J.m19268h(new Integer(interfaceC8882i.hashCode()));
            C8295C c8295c = new C8295C(1);
            c8295c.f25850b = setM19268h;
            InterfaceC3756d interfaceC3756dMo5693b2 = AbstractC16526C.f51263a.mo5693b(C8297E.class);
            this.f27189Y = 2;
            if (c21346q2.m21740b(c8295c, interfaceC3756dMo5693b2, this) == enumC19250a) {
                return enumC19250a;
            }
        }
        return C17296C.f55119a;
    }
}
