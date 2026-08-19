package p122Eg;

import kotlin.jvm.internal.AbstractC16526C;
import mm.C17296C;
import p025An.C0644w;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p1026ti.C19995a;
import p1026ti.C19996b;
import p1026ti.C19997c;
import p103Dn.C2153Q0;
import p1111xl.C21296a;
import p146Fg.C2733b;
import p146Fg.C2734c;
import p146Fg.C2737f;
import p146Fg.C2740i;
import p225Im.InterfaceC3756d;
import p225Im.InterfaceC3777y;
import p364Oh.AbstractC6224C;
import p364Oh.AbstractC6249w;
import p364Oh.C6223B;
import p364Oh.C6226E;
import p364Oh.C6248v;
import p523V9.AbstractC8160o6;
import p571X9.AbstractC9144I;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Eg.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C2434c extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f7565Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C2734c f7566Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C6226E f7567o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C2435d f7568p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2434c(C2734c c2734c, C6226E c6226e, C2435d c2435d, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f7566Z = c2734c;
        this.f7567o0 = c6226e;
        this.f7568p0 = c2435d;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C2434c(this.f7566Z, this.f7567o0, this.f7568p0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C2434c) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        InterfaceC3777y interfaceC3777yM18075c;
        Object c19995a;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f7565Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C6226E c6226e = this.f7567o0;
            C2737f c2737f = new C2737f(c6226e.f20269a, c6226e.f20272d, String.valueOf(c6226e.f20273e));
            this.f7565Y = 1;
            C2734c c2734c = this.f7566Z;
            C2733b c2733b = new C2733b(c2734c, c2737f, null);
            InterfaceC3756d interfaceC3756dMo5693b = AbstractC16526C.f51263a.mo5693b(C2740i.class);
            try {
                interfaceC3777yM18075c = AbstractC16526C.m18075c(C2740i.class);
            } catch (Throwable unused) {
                interfaceC3777yM18075c = null;
            }
            obj = AbstractC9144I.m9690b(c2734c.f8396a, new C21296a(interfaceC3756dMo5693b, interfaceC3777yM18075c), c2733b, this);
            if (obj == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
        }
        AbstractC6224C abstractC6224C = (AbstractC6224C) obj;
        boolean z6 = abstractC6224C instanceof C6223B;
        C2435d c2435d = this.f7568p0;
        if (z6) {
            C2740i c2740i = (C2740i) ((C6223B) abstractC6224C).f20258a;
            C2153Q0 c2153q0 = c2435d.f7570b;
            int iOrdinal = c2740i.f8405a.ordinal();
            String str = c2740i.f8406b;
            if (iOrdinal == 0) {
                c19995a = new C19995a(str, c2740i.f8408d, c2740i.f8407c);
            } else if (iOrdinal == 1) {
                c19995a = new C19996b(str);
            } else {
                if (iOrdinal != 2) {
                    throw new C0644w();
                }
                c19995a = C19997c.f63313a;
            }
            c2153q0.getClass();
            c2153q0.m3251l(null, c19995a);
        } else if (abstractC6224C instanceof AbstractC6249w) {
            AbstractC8160o6.m8731f(c2435d.f7569a, "Sunset check failed: " + ((AbstractC6249w) abstractC6224C), null, null, 6);
        } else if (!(abstractC6224C instanceof C6248v)) {
            throw new C0644w();
        }
        return C17296C.f55119a;
    }
}
