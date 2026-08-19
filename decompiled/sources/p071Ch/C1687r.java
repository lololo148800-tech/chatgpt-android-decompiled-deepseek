package p071Ch;

import kotlin.jvm.internal.AbstractC16526C;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p097Dh.C2049b;
import p097Dh.C2050c;
import p097Dh.C2051d;
import p1111xl.C21296a;
import p123Eh.C2439c;
import p225Im.InterfaceC3756d;
import p225Im.InterfaceC3777y;
import p364Oh.AbstractC6224C;
import p432Rh.C6895h;
import p571X9.AbstractC9144I;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Ch.r */
/* JADX INFO: loaded from: classes3.dex */
public final class C1687r extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f4772Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ boolean f4773Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C1692w f4774o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C2439c f4775p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1687r(boolean z6, C1692w c1692w, C2439c c2439c, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f4773Z = z6;
        this.f4774o0 = c1692w;
        this.f4775p0 = c2439c;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C1687r(this.f4773Z, this.f4774o0, this.f4775p0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C1687r) create(Integer.valueOf(((Number) obj).intValue()), (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f4772Y;
        if (i10 != 0) {
            if (i10 == 1) {
                AbstractC9233X.m9807c(obj);
                return (AbstractC6224C) obj;
            }
            if (i10 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
            return (AbstractC6224C) obj;
        }
        AbstractC9233X.m9807c(obj);
        C2439c c2439c = this.f4775p0;
        boolean z6 = this.f4773Z;
        InterfaceC3777y interfaceC3777yM18075c = null;
        C1692w c1692w = this.f4774o0;
        if (z6) {
            C2051d c2051d = c1692w.f4794b;
            this.f4772Y = 1;
            C6895h c6895h = (C6895h) c2051d.f6273b.getValue();
            C2050c c2050c = new C2050c(c2439c, null);
            InterfaceC3756d interfaceC3756dMo5693b = AbstractC16526C.f51263a.mo5693b(C17296C.class);
            try {
                interfaceC3777yM18075c = AbstractC16526C.m18075c(C17296C.class);
            } catch (Throwable unused) {
            }
            C21296a c21296a = new C21296a(interfaceC3756dMo5693b, interfaceC3777yM18075c);
            c6895h.getClass();
            obj = AbstractC9144I.m9690b(c6895h, c21296a, c2050c, this);
            if (obj == enumC19250a) {
                return enumC19250a;
            }
            return (AbstractC6224C) obj;
        }
        C2051d c2051d2 = c1692w.f4794b;
        this.f4772Y = 2;
        C6895h c6895h2 = (C6895h) c2051d2.f6273b.getValue();
        C2049b c2049b = new C2049b(c2439c, null);
        InterfaceC3756d interfaceC3756dMo5693b2 = AbstractC16526C.f51263a.mo5693b(C17296C.class);
        try {
            interfaceC3777yM18075c = AbstractC16526C.m18075c(C17296C.class);
        } catch (Throwable unused2) {
        }
        C21296a c21296a2 = new C21296a(interfaceC3756dMo5693b2, interfaceC3777yM18075c);
        c6895h2.getClass();
        obj = AbstractC9144I.m9690b(c6895h2, c21296a2, c2049b, this);
        if (obj == enumC19250a) {
            return enumC19250a;
        }
        return (AbstractC6224C) obj;
    }
}
