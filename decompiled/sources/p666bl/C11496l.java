package p666bl;

import io.ktor.utils.p815io.InterfaceC15088n;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p1113xn.AbstractC21322p;
import p523V9.AbstractC7995T3;
import p544W9.AbstractC8651i4;
import p571X9.AbstractC9233X;
import p792hl.AbstractC14527b;
import p857kl.C16460h;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: bl.l */
/* JADX INFO: loaded from: classes3.dex */
public final class C11496l extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public StringBuilder f34796Y;

    /* JADX INFO: renamed from: Z */
    public int f34797Z;

    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ Object f34798o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ EnumC11489e f34799p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11496l(EnumC11489e enumC11489e, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f34799p0 = enumC11489e;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C11496l c11496l = new C11496l(this.f34799p0, interfaceC18770c);
        c11496l.f34798o0 = obj;
        return c11496l;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C11496l) create((AbstractC14527b) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00c5 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:33:0x00d1 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:36:0x00ee A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:39:0x00fa A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:40:0x00fb A[RETURN] */
    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C11488d c11488d;
        StringBuilder sb2;
        String string;
        String string2;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f34797Z;
        C17296C c17296c = C17296C.f55119a;
        switch (i10) {
            case 0:
                AbstractC9233X.m9807c(obj);
                AbstractC14527b abstractC14527b = (AbstractC14527b) this.f34798o0;
                if (this.f34799p0 != EnumC11489e.f34774q0 && !abstractC14527b.mo7303b().m7299k().m20648b(AbstractC11497m.f34801b)) {
                    c11488d = (C11488d) abstractC14527b.mo7303b().m7299k().m20649c(AbstractC11497m.f34800a);
                    sb2 = new StringBuilder();
                    try {
                        C16460h c16460hM9325c = AbstractC8651i4.m9325c(abstractC14527b);
                        InterfaceC15088n interfaceC15088nMo7304c = abstractC14527b.mo7304c();
                        this.f34798o0 = c11488d;
                        this.f34796Y = sb2;
                        this.f34797Z = 1;
                        if (AbstractC7995T3.m8298d(sb2, c16460hM9325c, interfaceC15088nMo7304c, this) == enumC19250a) {
                            return enumC19250a;
                        }
                        String string3 = sb2.toString();
                        AbstractC16544l.m18093f(string3, "toString(...)");
                        string2 = AbstractC21322p.m21711s0(string3).toString();
                        this.f34798o0 = c11488d;
                        this.f34796Y = null;
                        this.f34797Z = 2;
                        if (c11488d.m12891d(string2, this) == enumC19250a) {
                            return enumC19250a;
                        }
                        this.f34798o0 = null;
                        this.f34797Z = 3;
                        if (c11488d.m12889b(this) == enumC19250a) {
                            return enumC19250a;
                        }
                    } catch (Throwable unused) {
                        String string4 = sb2.toString();
                        AbstractC16544l.m18093f(string4, "toString(...)");
                        string = AbstractC21322p.m21711s0(string4).toString();
                        this.f34798o0 = c11488d;
                        this.f34796Y = null;
                        this.f34797Z = 4;
                        if (c11488d.m12891d(string, this) == enumC19250a) {
                            return enumC19250a;
                        }
                        this.f34798o0 = null;
                        this.f34797Z = 5;
                        if (c11488d.m12889b(this) == enumC19250a) {
                            return enumC19250a;
                        }
                    }
                }
                return c17296c;
            case 1:
                StringBuilder sb3 = this.f34796Y;
                C11488d c11488d2 = (C11488d) this.f34798o0;
                try {
                    AbstractC9233X.m9807c(obj);
                    sb2 = sb3;
                    c11488d = c11488d2;
                    String string5 = sb2.toString();
                    AbstractC16544l.m18093f(string5, "toString(...)");
                    string2 = AbstractC21322p.m21711s0(string5).toString();
                    this.f34798o0 = c11488d;
                    this.f34796Y = null;
                    this.f34797Z = 2;
                    if (c11488d.m12891d(string2, this) == enumC19250a) {
                        return enumC19250a;
                    }
                    this.f34798o0 = null;
                    this.f34797Z = 3;
                    if (c11488d.m12889b(this) == enumC19250a) {
                        return enumC19250a;
                    }
                    return c17296c;
                } catch (Throwable unused2) {
                    sb2 = sb3;
                    c11488d = c11488d2;
                    String string6 = sb2.toString();
                    AbstractC16544l.m18093f(string6, "toString(...)");
                    string = AbstractC21322p.m21711s0(string6).toString();
                    this.f34798o0 = c11488d;
                    this.f34796Y = null;
                    this.f34797Z = 4;
                    if (c11488d.m12891d(string, this) == enumC19250a) {
                        return enumC19250a;
                    }
                    this.f34798o0 = null;
                    this.f34797Z = 5;
                    if (c11488d.m12889b(this) == enumC19250a) {
                        return enumC19250a;
                    }
                }
            case 2:
                c11488d = (C11488d) this.f34798o0;
                AbstractC9233X.m9807c(obj);
                this.f34798o0 = null;
                this.f34797Z = 3;
                if (c11488d.m12889b(this) == enumC19250a) {
                    return enumC19250a;
                }
                return c17296c;
            case 3:
            case 5:
                AbstractC9233X.m9807c(obj);
                return c17296c;
            case 4:
                c11488d = (C11488d) this.f34798o0;
                AbstractC9233X.m9807c(obj);
                this.f34798o0 = null;
                this.f34797Z = 5;
                if (c11488d.m12889b(this) == enumC19250a) {
                    return enumC19250a;
                }
                return c17296c;
            case 6:
                Throwable th2 = (Throwable) this.f34796Y;
                C11488d c11488d3 = (C11488d) this.f34798o0;
                AbstractC9233X.m9807c(obj);
                this.f34798o0 = th2;
                this.f34796Y = null;
                this.f34797Z = 7;
                if (c11488d3.m12889b(this) == enumC19250a) {
                    return enumC19250a;
                }
                throw th2;
            case 7:
                Throwable th3 = (Throwable) this.f34798o0;
                AbstractC9233X.m9807c(obj);
                throw th3;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
