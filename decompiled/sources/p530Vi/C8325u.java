package p530Vi;

import com.segment.analytics.kotlin.core.Settings;
import kotlin.jvm.internal.AbstractC16526C;
import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p1114xp.C21346q;
import p117Eb.C2392v;
import p225Im.InterfaceC3756d;
import p571X9.AbstractC9233X;
import p594Y9.AbstractC9758K4;
import p594Y9.AbstractC9859b3;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Vi.u */
/* JADX INFO: loaded from: classes3.dex */
public final class C8325u extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public C8312h f25953Y;

    /* JADX INFO: renamed from: Z */
    public Settings f25954Z;

    /* JADX INFO: renamed from: o0 */
    public int f25955o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ Settings f25956p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ C8312h f25957q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8325u(Settings settings, C8312h c8312h, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f25956p0 = settings;
        this.f25957q0 = c8312h;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C8325u(this.f25956p0, this.f25957q0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C8325u) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x007a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:22:0x0093 A[RETURN] */
    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        Settings settings;
        C21346q c21346q;
        C8296D c8296d;
        InterfaceC3756d interfaceC3756dMo5693b;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f25955o0;
        C8312h c8312h = this.f25957q0;
        C2392v c2392v = c8312h.f25903Z;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            settings = this.f25956p0;
            if (settings != null) {
                AbstractC9758K4.m10361b(c8312h, "Dispatching update settings on " + Thread.currentThread().getName());
                C21346q c21346q2 = (C21346q) c2392v.f7436Z;
                C8295C c8295c = new C8295C(2);
                c8295c.f25850b = settings;
                InterfaceC3756d interfaceC3756dMo5693b2 = AbstractC16526C.f51263a.mo5693b(C8297E.class);
                this.f25953Y = c8312h;
                this.f25954Z = settings;
                this.f25955o0 = 1;
                if (c21346q2.m21740b(c8295c, interfaceC3756dMo5693b2, this) == enumC19250a) {
                    return enumC19250a;
                }
                this.f25953Y = null;
                this.f25954Z = null;
                this.f25955o0 = 2;
                if (AbstractC9859b3.m10511c(c8312h, settings, this) == enumC19250a) {
                    return enumC19250a;
                }
            }
            c21346q = (C21346q) c2392v.f7436Z;
            c8296d = new C8296D(true, 1);
            interfaceC3756dMo5693b = AbstractC16526C.f51263a.mo5693b(C8297E.class);
            this.f25955o0 = 3;
            if (c21346q.m21740b(c8296d, interfaceC3756dMo5693b, this) == enumC19250a) {
                return enumC19250a;
            }
        } else if (i10 == 1) {
            settings = this.f25954Z;
            c8312h = this.f25953Y;
            AbstractC9233X.m9807c(obj);
            this.f25953Y = null;
            this.f25954Z = null;
            this.f25955o0 = 2;
            if (AbstractC9859b3.m10511c(c8312h, settings, this) == enumC19250a) {
                return enumC19250a;
            }
            c21346q = (C21346q) c2392v.f7436Z;
            c8296d = new C8296D(true, 1);
            interfaceC3756dMo5693b = AbstractC16526C.f51263a.mo5693b(C8297E.class);
            this.f25955o0 = 3;
            if (c21346q.m21740b(c8296d, interfaceC3756dMo5693b, this) == enumC19250a) {
                return enumC19250a;
            }
        } else if (i10 == 2) {
            AbstractC9233X.m9807c(obj);
            c21346q = (C21346q) c2392v.f7436Z;
            c8296d = new C8296D(true, 1);
            interfaceC3756dMo5693b = AbstractC16526C.f51263a.mo5693b(C8297E.class);
            this.f25955o0 = 3;
            if (c21346q.m21740b(c8296d, interfaceC3756dMo5693b, this) == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i10 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
        }
        return C17296C.f55119a;
    }
}
