package p1099x6;

import java.util.Set;
import java.util.UUID;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.C16525B;
import mm.C17296C;
import p001A.C0017I0;
import p002A0.C0132i;
import p049Bm.InterfaceC1439n;
import p1034u6.AbstractC20125c;
import p103Dn.InterfaceC2184i;
import p103Dn.InterfaceC2186j;
import p571X9.AbstractC9233X;
import p826j6.C16137F;
import p909nm.C17691y;
import p917o6.C17852e;
import p917o6.C17867t;
import p917o6.InterfaceC17837E;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: x6.d */
/* JADX INFO: loaded from: classes.dex */
public final class C21136d extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public C16525B f67156Y;

    /* JADX INFO: renamed from: Z */
    public C16525B f67157Z;

    /* JADX INFO: renamed from: o0 */
    public int f67158o0;

    /* JADX INFO: renamed from: p0 */
    public /* synthetic */ Object f67159p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ C17852e f67160q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ C21143k f67161r0;

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ C17867t f67162s0;

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ C16137F f67163t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21136d(C17852e c17852e, C21143k c21143k, C17867t c17867t, C16137F c16137f, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f67160q0 = c17852e;
        this.f67161r0 = c21143k;
        this.f67162s0 = c17867t;
        this.f67163t0 = c16137f;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C21136d c21136d = new C21136d(this.f67160q0, this.f67161r0, this.f67162s0, this.f67163t0, interfaceC18770c);
        c21136d.f67159p0 = obj;
        return c21136d;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C21136d) create((InterfaceC2186j) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:29:0x00cb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:32:0x00e1 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:33:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:35:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:39:0x0105 A[RETURN] */
    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        InterfaceC2186j interfaceC2186j;
        InterfaceC17837E interfaceC17837E;
        C16525B c16525b;
        C16525B c16525b2;
        Object obj2;
        C16525B c16525b3;
        Object objM64B;
        C0017I0 c0017i0;
        Object obj3;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f67158o0;
        C17296C c17296c = C17296C.f55119a;
        C21143k c21143k = this.f67161r0;
        C17852e c17852e = this.f67160q0;
        if (i10 != 0) {
            if (i10 == 1) {
                InterfaceC17837E interfaceC17837E2 = (InterfaceC17837E) this.f67156Y;
                InterfaceC2186j interfaceC2186j2 = (InterfaceC2186j) this.f67159p0;
                AbstractC9233X.m9807c(obj);
                interfaceC2186j = interfaceC2186j2;
                interfaceC17837E = interfaceC17837E2;
            } else if (i10 == 2) {
                c16525b2 = this.f67157Z;
                c16525b = this.f67156Y;
                interfaceC17837E = (InterfaceC17837E) this.f67159p0;
                AbstractC9233X.m9807c(obj);
                if (c16525b.f51262Y != null) {
                    if (c16525b2.f51262Y == null) {
                        if (interfaceC17837E != null) {
                            C0017I0 c0017i1 = c21143k.f67190b;
                            UUID uuid = c17852e.f56922b;
                            this.f67159p0 = c16525b2;
                            this.f67156Y = c16525b2;
                            this.f67157Z = null;
                            this.f67158o0 = 3;
                            objM64B = c0017i1.m64B(uuid, this);
                            if (objM64B == enumC19250a) {
                                return enumC19250a;
                            }
                            c16525b3 = c16525b2;
                            obj2 = (Set) objM64B;
                        } else {
                            obj2 = C17691y.f56482Y;
                            c16525b3 = c16525b2;
                        }
                        c16525b2.f51262Y = obj2;
                        c16525b2 = c16525b3;
                    }
                    c0017i0 = c21143k.f67190b;
                    obj3 = c16525b2.f51262Y;
                    AbstractC16544l.m18091d(obj3);
                    this.f67159p0 = null;
                    this.f67156Y = null;
                    this.f67157Z = null;
                    this.f67158o0 = 4;
                    if (c0017i0.m87z((Set) obj3, this) == enumC19250a) {
                        return enumC19250a;
                    }
                }
            } else if (i10 == 3) {
                c16525b2 = this.f67156Y;
                c16525b3 = (C16525B) this.f67159p0;
                AbstractC9233X.m9807c(obj);
                objM64B = obj;
                obj2 = (Set) objM64B;
                c16525b2.f51262Y = obj2;
                c16525b2 = c16525b3;
                c0017i0 = c21143k.f67190b;
                obj3 = c16525b2.f51262Y;
                AbstractC16544l.m18091d(obj3);
                this.f67159p0 = null;
                this.f67156Y = null;
                this.f67157Z = null;
                this.f67158o0 = 4;
                if (c0017i0.m87z((Set) obj3, this) == enumC19250a) {
                    return enumC19250a;
                }
            } else {
                if (i10 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9233X.m9807c(obj);
            }
            return c17296c;
        }
        AbstractC9233X.m9807c(obj);
        InterfaceC2186j interfaceC2186j3 = (InterfaceC2186j) this.f67159p0;
        AbstractC16544l.m18094g(c17852e, "<this>");
        if (c17852e.f56923c.mo4141d(AbstractC20125c.f63754c) != null) {
            throw new ClassCastException();
        }
        interfaceC2186j = interfaceC2186j3;
        interfaceC17837E = null;
        C16525B c16525b4 = new C16525B();
        InterfaceC2184i interfaceC2184iM17695n = this.f67163t0.m17695n(c17852e);
        C21135c c21135c = new C21135c(c16525b4, null);
        C16525B c16525b5 = new C16525B();
        C21134b c21134b = new C21134b(interfaceC17837E, new C16525B(), c16525b5, this.f67161r0, this.f67160q0, this.f67162s0, interfaceC2186j);
        this.f67159p0 = interfaceC17837E;
        this.f67156Y = c16525b4;
        this.f67157Z = c16525b5;
        this.f67158o0 = 2;
        Object objMo3141d = interfaceC2184iM17695n.mo3141d(new C0132i(c21134b, 6, c21135c), this);
        if (objMo3141d != enumC19250a) {
            objMo3141d = c17296c;
        }
        if (objMo3141d == enumC19250a) {
            return enumC19250a;
        }
        c16525b = c16525b4;
        c16525b2 = c16525b5;
        if (c16525b.f51262Y != null) {
            if (c16525b2.f51262Y == null) {
                if (interfaceC17837E != null) {
                    C0017I0 c0017i2 = c21143k.f67190b;
                    UUID uuid2 = c17852e.f56922b;
                    this.f67159p0 = c16525b2;
                    this.f67156Y = c16525b2;
                    this.f67157Z = null;
                    this.f67158o0 = 3;
                    objM64B = c0017i2.m64B(uuid2, this);
                    if (objM64B == enumC19250a) {
                        return enumC19250a;
                    }
                    c16525b3 = c16525b2;
                    obj2 = (Set) objM64B;
                } else {
                    obj2 = C17691y.f56482Y;
                    c16525b3 = c16525b2;
                }
                c16525b2.f51262Y = obj2;
                c16525b2 = c16525b3;
            }
            c0017i0 = c21143k.f67190b;
            obj3 = c16525b2.f51262Y;
            AbstractC16544l.m18091d(obj3);
            this.f67159p0 = null;
            this.f67156Y = null;
            this.f67157Z = null;
            this.f67158o0 = 4;
            if (c0017i0.m87z((Set) obj3, this) == enumC19250a) {
                return enumC19250a;
            }
        }
        return c17296c;
    }
}
