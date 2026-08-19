package p434Rk;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.AbstractC16544l;
import ml.C17284b;
import p025An.AbstractC0575H;
import p025An.InterfaceC0571F;
import p1111xl.C21296a;
import p225Im.InterfaceC3756d;
import p225Im.InterfaceC3777y;
import p409Qk.C6752c;
import p523V9.AbstractC8138m0;
import p556Wk.AbstractC8936r;
import p571X9.AbstractC9233X;
import p754fl.InterfaceC13692b;
import p792hl.AbstractC14527b;
import p792hl.C14526a;
import p792hl.C14528c;
import p972qm.InterfaceC18776i;
import p996rm.EnumC19250a;
import sl.C19666a;
import sl.C19675j;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: Rk.c */
/* JADX INFO: loaded from: classes3.dex */
public class C6911c implements InterfaceC0571F {

    /* JADX INFO: renamed from: p0 */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f22162p0;

    /* JADX INFO: renamed from: q0 */
    public static final C19666a f22163q0;

    /* JADX INFO: renamed from: Y */
    public final C6752c f22164Y;

    /* JADX INFO: renamed from: Z */
    public InterfaceC13692b f22165Z;

    /* JADX INFO: renamed from: o0 */
    public AbstractC14527b f22166o0;
    private volatile /* synthetic */ int received;

    static {
        InterfaceC3777y interfaceC3777yM18075c;
        InterfaceC3756d interfaceC3756dMo5693b = AbstractC16526C.f51263a.mo5693b(Object.class);
        try {
            interfaceC3777yM18075c = AbstractC16526C.m18075c(Object.class);
        } catch (Throwable unused) {
            interfaceC3777yM18075c = null;
        }
        f22163q0 = new C19666a("CustomResponse", new C21296a(interfaceC3756dMo5693b, interfaceC3777yM18075c));
        f22162p0 = AtomicIntegerFieldUpdater.newUpdater(C6911c.class, "received");
    }

    public C6911c(C6752c client) {
        AbstractC16544l.m18094g(client, "client");
        this.f22164Y = client;
        this.received = 0;
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:53:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:55:0x00d4 A[Catch: all -> 0x0031, TryCatch #0 {all -> 0x0031, blocks: (B:13:0x002c, B:50:0x00c4, B:55:0x00d4, B:58:0x00e4, B:59:0x00f9), top: B:63:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:57:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:58:0x00e4 A[Catch: all -> 0x0031, TryCatch #0 {all -> 0x0031, blocks: (B:13:0x002c, B:50:0x00c4, B:55:0x00d4, B:58:0x00e4, B:59:0x00f9), top: B:63:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m7294a(C21296a c21296a, AbstractC19687c abstractC19687c) {
        C6910b c6910b;
        C6911c c6911c;
        C6911c c6911c2;
        Object obj;
        InterfaceC3756d type;
        if (abstractC19687c instanceof C6910b) {
            c6910b = (C6910b) abstractC19687c;
            int i10 = c6910b.f22161q0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c6910b.f22161q0 = i10 - Integer.MIN_VALUE;
            } else {
                c6910b = new C6910b(this, abstractC19687c);
            }
        } else {
            c6910b = new C6910b(this, abstractC19687c);
        }
        Object objM20651e = c6910b.f22159o0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c6910b.f22161q0;
        if (i11 == 0) {
            AbstractC9233X.m9807c(objM20651e);
            try {
                AbstractC14527b abstractC14527bM7297d = m7297d();
                InterfaceC3756d type2 = c21296a.f67700a;
                AbstractC16544l.m18094g(type2, "type");
                if (AbstractC8138m0.m8667b(type2).isInstance(abstractC14527bM7297d)) {
                    return m7297d();
                }
                if (!mo7295b()) {
                    AbstractC14527b abstractC14527bM7297d2 = m7297d();
                    C19666a c19666a = AbstractC8936r.f27327a;
                    if (!abstractC14527bM7297d2.mo7303b().m7299k().m20648b(AbstractC8936r.f27328b) && !f22162p0.compareAndSet(this, 0, 1)) {
                        throw new C6909a(this);
                    }
                }
                objM20651e = m7299k().m20651e(f22163q0);
                if (objM20651e == null) {
                    c6910b.f22157Y = this;
                    c6910b.f22158Z = c21296a;
                    c6910b.f22161q0 = 1;
                    objM20651e = mo7298e();
                    if (objM20651e == enumC19250a) {
                        return enumC19250a;
                    }
                }
                c6911c2 = this;
            } catch (Throwable th2) {
                th = th2;
                c6911c = this;
                AbstractC0575H.m1180i(c6911c.m7297d(), AbstractC0575H.m1172a("Receive failed", th));
                throw th;
            }
        } else {
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c21296a = c6910b.f22158Z;
                c6911c = c6910b.f22157Y;
                try {
                    AbstractC9233X.m9807c(objM20651e);
                    obj = ((C14528c) objM20651e).f45790b;
                    if (!AbstractC16544l.m18089b(obj, C17284b.f55106a)) {
                        obj = null;
                    }
                    if (obj != null) {
                        type = c21296a.f67700a;
                        AbstractC16544l.m18094g(type, "type");
                        if (AbstractC8138m0.m8667b(type).isInstance(obj)) {
                            throw new C6912d(c6911c.m7297d(), AbstractC16526C.f51263a.mo5693b(obj.getClass()), c21296a.f67700a);
                        }
                    }
                    return obj;
                } catch (Throwable th3) {
                    th = th3;
                    AbstractC0575H.m1180i(c6911c.m7297d(), AbstractC0575H.m1172a("Receive failed", th));
                    throw th;
                }
            }
            c21296a = c6910b.f22158Z;
            c6911c2 = c6910b.f22157Y;
            try {
                AbstractC9233X.m9807c(objM20651e);
            } catch (Throwable th4) {
                th = th4;
                c6911c = c6911c2;
                AbstractC0575H.m1180i(c6911c.m7297d(), AbstractC0575H.m1172a("Receive failed", th));
                throw th;
            }
        }
        C14528c c14528c = new C14528c(c21296a, objM20651e);
        C14526a c14526a = c6911c2.f22164Y.f21672s0;
        c6910b.f22157Y = c6911c2;
        c6910b.f22158Z = c21296a;
        c6910b.f22161q0 = 2;
        objM20651e = c14526a.m21467a(c6911c2, c14528c, c6910b);
        if (objM20651e == enumC19250a) {
            return enumC19250a;
        }
        c6911c = c6911c2;
        obj = ((C14528c) objM20651e).f45790b;
        if (!AbstractC16544l.m18089b(obj, C17284b.f55106a)) {
            obj = null;
        }
        if (obj != null) {
            type = c21296a.f67700a;
            AbstractC16544l.m18094g(type, "type");
            if (AbstractC8138m0.m8667b(type).isInstance(obj)) {
                throw new C6912d(c6911c.m7297d(), AbstractC16526C.f51263a.mo5693b(obj.getClass()), c21296a.f67700a);
            }
        }
        return obj;
    }

    /* JADX INFO: renamed from: b */
    public boolean mo7295b() {
        return false;
    }

    /* JADX INFO: renamed from: c */
    public final InterfaceC13692b m7296c() {
        InterfaceC13692b interfaceC13692b = this.f22165Z;
        if (interfaceC13692b != null) {
            return interfaceC13692b;
        }
        AbstractC16544l.m18103p("request");
        throw null;
    }

    /* JADX INFO: renamed from: d */
    public final AbstractC14527b m7297d() {
        AbstractC14527b abstractC14527b = this.f22166o0;
        if (abstractC14527b != null) {
            return abstractC14527b;
        }
        AbstractC16544l.m18103p("response");
        throw null;
    }

    /* JADX INFO: renamed from: e */
    public Object mo7298e() {
        return m7297d().mo7304c();
    }

    @Override // p025An.InterfaceC0571F
    public final InterfaceC18776i getCoroutineContext() {
        return m7297d().getCoroutineContext();
    }

    /* JADX INFO: renamed from: k */
    public final C19675j m7299k() {
        return m7296c().mo7302k();
    }

    public final String toString() {
        return "HttpClientCall[" + m7296c().mo7300S() + ", " + m7297d().mo7307f() + ']';
    }
}
