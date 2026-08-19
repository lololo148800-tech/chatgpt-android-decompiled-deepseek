package p427Rc;

import java.nio.charset.Charset;
import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import kotlin.jvm.internal.C16525B;
import kotlin.jvm.internal.C16556x;
import ml.C17283a;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p077Cn.C1757y;
import p077Cn.InterfaceC1758z;
import p103Dn.InterfaceC2184i;
import p103Dn.InterfaceC2186j;
import p1111xl.C21296a;
import p1113xn.C21307a;
import p275Kn.C4816c;
import p275Kn.InterfaceC4814a;
import p295Lj.AbstractC5103c;
import p523V9.AbstractC8146n0;
import p544W9.AbstractC8627e4;
import p571X9.AbstractC9233X;
import p857kl.C16460h;
import p971ql.C18764e;
import p972qm.InterfaceC18770c;
import p995rl.C19247g;
import p995rl.C19249i;
import p996rm.EnumC19250a;

/* JADX INFO: renamed from: Rc.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C6848e implements InterfaceC2186j {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f21973Y = 1;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ Object f21974Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ Object f21975o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ Object f21976p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ Object f21977q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ Object f21978r0;

    public C6848e(InterfaceC2186j interfaceC2186j, C16460h c16460h, Charset charset, C21296a c21296a, Object obj) {
        this.f21974Z = interfaceC2186j;
        this.f21975o0 = c16460h;
        this.f21976p0 = charset;
        this.f21977q0 = c21296a;
        this.f21978r0 = obj;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0095  */
    /* JADX WARN: Code duplicated, block: B:37:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:9:0x0018  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v2, types: [Bm.n] */
    /* JADX WARN: Type inference failed for: r14v24 */
    @Override // p103Dn.InterfaceC2186j
    /* JADX INFO: renamed from: a */
    public final Object mo395a(Object obj, InterfaceC18770c interfaceC18770c) throws Throwable {
        C6847d c6847d;
        C16556x c16556x;
        InterfaceC1758z interfaceC1758z;
        C16525B c16525b;
        Object obj2;
        ?? r14;
        C4816c c4816c;
        Throwable th2;
        InterfaceC4814a interfaceC4814a;
        InterfaceC4814a interfaceC4814a2;
        InterfaceC4814a interfaceC4814a3;
        C18764e c18764e;
        InterfaceC2186j interfaceC2186j;
        switch (this.f21973Y) {
            case 0:
                if (interfaceC18770c instanceof C6847d) {
                    c6847d = (C6847d) interfaceC18770c;
                    int i10 = c6847d.f21972u0;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        c6847d.f21972u0 = i10 - Integer.MIN_VALUE;
                    } else {
                        c6847d = new C6847d(this, interfaceC18770c);
                    }
                } else {
                    c6847d = new C6847d(this, interfaceC18770c);
                }
                Object obj3 = c6847d.f21970s0;
                EnumC19250a enumC19250a = EnumC19250a.f61036Y;
                int i11 = c6847d.f21972u0;
                try {
                    if (i11 == 0) {
                        AbstractC9233X.m9807c(obj3);
                        c6847d.f21964Y = obj;
                        C4816c c4816c2 = (C4816c) this.f21974Z;
                        c6847d.f21965Z = c4816c2;
                        c16556x = (C16556x) this.f21975o0;
                        c6847d.f21966o0 = c16556x;
                        InterfaceC1758z interfaceC1758z2 = (InterfaceC1758z) this.f21976p0;
                        c6847d.f21967p0 = interfaceC1758z2;
                        C16525B c16525b2 = (C16525B) this.f21977q0;
                        c6847d.f21968q0 = c16525b2;
                        AbstractC16546n abstractC16546n = (AbstractC16546n) this.f21978r0;
                        c6847d.f21969r0 = abstractC16546n;
                        c6847d.f21972u0 = 1;
                        if (c4816c2.m5448e(null, c6847d) == enumC19250a) {
                            return enumC19250a;
                        }
                        interfaceC1758z = interfaceC1758z2;
                        c16525b = c16525b2;
                        obj2 = obj;
                        r14 = abstractC16546n;
                        c4816c = c4816c2;
                    } else {
                        if (i11 != 1) {
                            if (i11 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            interfaceC4814a = (InterfaceC4814a) c6847d.f21964Y;
                            try {
                                AbstractC9233X.m9807c(obj3);
                                interfaceC4814a2 = interfaceC4814a;
                                interfaceC4814a3 = interfaceC4814a2;
                                ((C4816c) interfaceC4814a3).m5450g(null);
                                return C17296C.f55119a;
                            } catch (Throwable th3) {
                                th2 = th3;
                                ((C4816c) interfaceC4814a).m5450g(null);
                                throw th2;
                            }
                        }
                        InterfaceC1439n interfaceC1439n = (InterfaceC1439n) c6847d.f21969r0;
                        c16525b = c6847d.f21968q0;
                        interfaceC1758z = c6847d.f21967p0;
                        c16556x = c6847d.f21966o0;
                        C4816c c4816c3 = c6847d.f21965Z;
                        obj2 = c6847d.f21964Y;
                        AbstractC9233X.m9807c(obj3);
                        c4816c = c4816c3;
                        r14 = interfaceC1439n;
                    }
                    if (c16556x.f51285Y) {
                        c6847d.f21964Y = c4816c;
                        c6847d.f21965Z = null;
                        c6847d.f21966o0 = null;
                        c6847d.f21967p0 = null;
                        c6847d.f21968q0 = null;
                        c6847d.f21969r0 = null;
                        c6847d.f21972u0 = 2;
                        if (((C1757y) interfaceC1758z).f5030p0.mo2523o(obj2, c6847d) == enumC19250a) {
                            return enumC19250a;
                        }
                        interfaceC4814a2 = c4816c;
                        interfaceC4814a3 = interfaceC4814a2;
                    } else {
                        c16525b.f51262Y = r14.invoke(c16525b.f51262Y, obj2);
                        interfaceC4814a3 = c4816c;
                    }
                    ((C4816c) interfaceC4814a3).m5450g(null);
                    return C17296C.f55119a;
                } catch (Throwable th4) {
                    C4816c c4816c4 = c4816c;
                    th2 = th4;
                    interfaceC4814a = c4816c4;
                    ((C4816c) interfaceC4814a).m5450g(null);
                    throw th2;
                }
            default:
                if (interfaceC18770c instanceof C18764e) {
                    c18764e = (C18764e) interfaceC18770c;
                    int i12 = c18764e.f59665Z;
                    if ((i12 & Integer.MIN_VALUE) != 0) {
                        c18764e.f59665Z = i12 - Integer.MIN_VALUE;
                    } else {
                        c18764e = new C18764e(this, interfaceC18770c);
                    }
                } else {
                    c18764e = new C18764e(this, interfaceC18770c);
                }
                Object c17283a = c18764e.f59664Y;
                EnumC19250a enumC19250a2 = EnumC19250a.f61036Y;
                int i13 = c18764e.f59665Z;
                if (i13 != 0) {
                    if (i13 == 1) {
                        interfaceC2186j = c18764e.f59666o0;
                        AbstractC9233X.m9807c(c17283a);
                    } else {
                        if (i13 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC9233X.m9807c(c17283a);
                    }
                    return C17296C.f55119a;
                }
                AbstractC9233X.m9807c(c17283a);
                C19249i c19249i = (C19249i) obj;
                interfaceC2186j = (InterfaceC2186j) this.f21974Z;
                c18764e.f59666o0 = interfaceC2186j;
                c18764e.f59665Z = 1;
                c19249i.getClass();
                Charset charset = C21307a.f67720a;
                Charset charset2 = (Charset) this.f21976p0;
                if (AbstractC16544l.m18089b(charset2, charset)) {
                    C21296a c21296a = (C21296a) this.f21977q0;
                    if (AbstractC16544l.m18089b(c21296a.f67700a, AbstractC16526C.f51263a.mo5693b(InterfaceC2184i.class))) {
                        c17283a = new C17283a(new C19247g(c19249i, this.f21978r0, AbstractC5103c.m5671g(c19249i.f61034a.f34844b, AbstractC8146n0.m8684a(c21296a)), charset2, null), AbstractC8627e4.m9278e((C16460h) this.f21975o0, charset2));
                    } else {
                        c17283a = null;
                    }
                } else {
                    c17283a = null;
                }
                if (c17283a == enumC19250a2) {
                    return enumC19250a2;
                }
                c18764e.f59666o0 = null;
                c18764e.f59665Z = 2;
                if (interfaceC2186j.mo395a(c17283a, c18764e) == enumC19250a2) {
                    return enumC19250a2;
                }
                return C17296C.f55119a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C6848e(C4816c c4816c, C16556x c16556x, InterfaceC1758z interfaceC1758z, C16525B c16525b, InterfaceC1439n interfaceC1439n) {
        this.f21974Z = c4816c;
        this.f21975o0 = c16556x;
        this.f21976p0 = interfaceC1758z;
        this.f21977q0 = c16525b;
        this.f21978r0 = (AbstractC16546n) interfaceC1439n;
    }
}
