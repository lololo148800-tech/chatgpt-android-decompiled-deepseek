package p530Vi;

import bo.AbstractC11516d;
import bo.C11515c;
import com.segment.analytics.kotlin.core.C12777d;
import com.segment.analytics.kotlin.core.Settings;
import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p1114xp.C21346q;
import p432Rh.C6898k;
import p571X9.AbstractC9233X;
import p580Xi.C9519e;
import p594Y9.AbstractC9859b3;
import p909nm.C17691y;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Vi.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C8306b extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public C21346q f25881Y;

    /* JADX INFO: renamed from: Z */
    public C8312h f25882Z;

    /* JADX INFO: renamed from: o0 */
    public C21346q f25883o0;

    /* JADX INFO: renamed from: p0 */
    public int f25884p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ C8312h f25885q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8306b(C8312h c8312h, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f25885q0 = c8312h;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C8306b(this.f25885q0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C8306b) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00c3 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:34:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:38:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:40:0x0100 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:43:0x0107  */
    /* JADX WARN: Code duplicated, block: B:46:0x0119 A[RETURN] */
    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        C21346q c21346q;
        C21346q c21346q2;
        C8312h c8312h;
        C8317m configuration;
        InterfaceC8294B storage;
        Settings settings;
        C8312h c8312h2;
        C21346q c21346q3;
        InterfaceC8294B interfaceC8294BM8932b;
        C21346q c21346q4;
        Object objM21744f;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f25884p0;
        C17296C c17296c = C17296C.f55119a;
        C8312h c8312h3 = this.f25885q0;
        try {
            if (i10 != 0) {
                if (i10 == 1) {
                    c21346q = this.f25883o0;
                    c8312h = this.f25882Z;
                    c21346q2 = this.f25881Y;
                    AbstractC9233X.m9807c(obj);
                } else if (i10 == 2) {
                    c8312h2 = this.f25882Z;
                    c21346q3 = this.f25881Y;
                    AbstractC9233X.m9807c(obj);
                    interfaceC8294BM8932b = c8312h2.m8932b();
                    this.f25881Y = c21346q3;
                    this.f25882Z = c8312h2;
                    this.f25884p0 = 3;
                    if (interfaceC8294BM8932b.mo7528e(this) == enumC19250a) {
                        return enumC19250a;
                    }
                    c21346q4 = c21346q3;
                    C8300H c8300h = C8300H.f25862Y;
                    C21346q c21346q5 = (C21346q) c8312h2.f25903Z.f7436Z;
                    this.f25881Y = c21346q4;
                    this.f25882Z = null;
                    this.f25884p0 = 4;
                    C6898k c6898k = new C6898k(2, c8300h, C8300H.class, "systemUpdate", "systemUpdate(Lcom/segment/analytics/kotlin/core/System;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 3);
                    objM21744f = c21346q5.m21744f(c8300h, AbstractC16526C.f51263a.mo5693b(C8297E.class), true, C8300H.f25875z0, c6898k, this);
                    if (objM21744f != EnumC19250a.f61036Y) {
                        objM21744f = c17296c;
                    }
                    if (objM21744f == enumC19250a) {
                        return enumC19250a;
                    }
                    if (c8312h3.f25902Y.f25926l) {
                        c8312h3.m8931a(new C9519e());
                    }
                    this.f25881Y = null;
                    this.f25884p0 = 5;
                    if (AbstractC9859b3.m10509a(c8312h3, this) == enumC19250a) {
                        return enumC19250a;
                    }
                } else if (i10 == 3) {
                    c8312h2 = this.f25882Z;
                    c21346q4 = this.f25881Y;
                    AbstractC9233X.m9807c(obj);
                    C8300H c8300h2 = C8300H.f25862Y;
                    C21346q c21346q6 = (C21346q) c8312h2.f25903Z.f7436Z;
                    this.f25881Y = c21346q4;
                    this.f25882Z = null;
                    this.f25884p0 = 4;
                    C6898k c6898k2 = new C6898k(2, c8300h2, C8300H.class, "systemUpdate", "systemUpdate(Lcom/segment/analytics/kotlin/core/System;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 3);
                    objM21744f = c21346q6.m21744f(c8300h2, AbstractC16526C.f51263a.mo5693b(C8297E.class), true, C8300H.f25875z0, c6898k2, this);
                    if (objM21744f != EnumC19250a.f61036Y) {
                        objM21744f = c17296c;
                    }
                    if (objM21744f == enumC19250a) {
                        return enumC19250a;
                    }
                    if (c8312h3.f25902Y.f25926l) {
                        c8312h3.m8931a(new C9519e());
                    }
                    this.f25881Y = null;
                    this.f25884p0 = 5;
                    if (AbstractC9859b3.m10509a(c8312h3, this) == enumC19250a) {
                        return enumC19250a;
                    }
                } else if (i10 == 4) {
                    AbstractC9233X.m9807c(obj);
                    if (c8312h3.f25902Y.f25926l) {
                        c8312h3.m8931a(new C9519e());
                    }
                    this.f25881Y = null;
                    this.f25884p0 = 5;
                    if (AbstractC9859b3.m10509a(c8312h3, this) == enumC19250a) {
                        return enumC19250a;
                    }
                } else {
                    if (i10 != 5) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC9233X.m9807c(obj);
                }
                return c17296c;
            }
            AbstractC9233X.m9807c(obj);
            c21346q = (C21346q) c8312h3.f25903Z.f7436Z;
            C8304L c8304l = c8312h3.f25906q0;
            this.f25881Y = c21346q;
            this.f25882Z = c8312h3;
            this.f25883o0 = c21346q;
            this.f25884p0 = 1;
            if (c21346q.m21742d(c8304l, this) == enumC19250a) {
                return enumC19250a;
            }
            c21346q2 = c21346q;
            c8312h = c8312h3;
            C11515c c11515c = AbstractC11516d.f34842d;
            KSerializer kSerializerSerializer = Settings.INSTANCE.serializer();
            String strMo7525b = storage.mo7525b(4);
            if (strMo7525b == null) {
                strMo7525b = "";
            }
            settings = (Settings) c11515c.m12903b(strMo7525b, kSerializerSerializer);
        } catch (Exception unused) {
            settings = configuration.f25925k;
        }
        C12777d c12777d = C8297E.Companion;
        configuration = c8312h.f25902Y;
        storage = c8312h.m8932b();
        c12777d.getClass();
        AbstractC16544l.m18094g(configuration, "configuration");
        AbstractC16544l.m18094g(storage, "storage");
        C8297E c8297e = new C8297E(configuration, settings, false, C17691y.f56482Y, true);
        this.f25881Y = c21346q2;
        this.f25882Z = c8312h;
        this.f25883o0 = null;
        this.f25884p0 = 2;
        if (c21346q.m21742d(c8297e, this) == enumC19250a) {
            return enumC19250a;
        }
        c8312h2 = c8312h;
        c21346q3 = c21346q2;
        interfaceC8294BM8932b = c8312h2.m8932b();
        this.f25881Y = c21346q3;
        this.f25882Z = c8312h2;
        this.f25884p0 = 3;
        if (interfaceC8294BM8932b.mo7528e(this) == enumC19250a) {
            return enumC19250a;
        }
        c21346q4 = c21346q3;
        C8300H c8300h3 = C8300H.f25862Y;
        C21346q c21346q7 = (C21346q) c8312h2.f25903Z.f7436Z;
        this.f25881Y = c21346q4;
        this.f25882Z = null;
        this.f25884p0 = 4;
        C6898k c6898k3 = new C6898k(2, c8300h3, C8300H.class, "systemUpdate", "systemUpdate(Lcom/segment/analytics/kotlin/core/System;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 3);
        objM21744f = c21346q7.m21744f(c8300h3, AbstractC16526C.f51263a.mo5693b(C8297E.class), true, C8300H.f25875z0, c6898k3, this);
        if (objM21744f != EnumC19250a.f61036Y) {
            objM21744f = c17296c;
        }
        if (objM21744f == enumC19250a) {
            return enumC19250a;
        }
        if (c8312h3.f25902Y.f25926l) {
            c8312h3.m8931a(new C9519e());
        }
        this.f25881Y = null;
        this.f25884p0 = 5;
        if (AbstractC9859b3.m10509a(c8312h3, this) == enumC19250a) {
            return enumC19250a;
        }
        return c17296c;
    }
}
