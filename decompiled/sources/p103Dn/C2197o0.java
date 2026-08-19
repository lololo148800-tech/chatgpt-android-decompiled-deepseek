package p103Dn;

import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p129En.AbstractC2591b;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Dn.o0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2197o0 extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f6733Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC2135H0 f6734Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC2184i f6735o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ AbstractC2591b f6736p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ Object f6737q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C2197o0(InterfaceC2135H0 interfaceC2135H0, InterfaceC2184i interfaceC2184i, InterfaceC2211v0 interfaceC2211v0, Object obj, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f6734Z = interfaceC2135H0;
        this.f6735o0 = interfaceC2184i;
        this.f6736p0 = (AbstractC2591b) interfaceC2211v0;
        this.f6737q0 = obj;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [Dn.v0, En.b] */
    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C2197o0(this.f6734Z, this.f6735o0, this.f6736p0, this.f6737q0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C2197o0) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0058 A[RETURN] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [Dn.j, Dn.v0, En.b] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f6733Y;
        ?? r6 = this.f6736p0;
        InterfaceC2184i interfaceC2184i = this.f6735o0;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    AbstractC9233X.m9807c(obj);
                    this.f6733Y = 3;
                    if (interfaceC2184i.mo3141d(r6, this) == enumC19250a) {
                        return enumC19250a;
                    }
                } else if (i10 != 3 && i10 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
            AbstractC9233X.m9807c(obj);
        } else {
            AbstractC9233X.m9807c(obj);
            C2137I0 c2137i0 = C2133G0.f6536a;
            InterfaceC2135H0 interfaceC2135H0 = this.f6734Z;
            if (interfaceC2135H0 == c2137i0) {
                this.f6733Y = 1;
                if (interfaceC2184i.mo3141d(r6, this) == enumC19250a) {
                    return enumC19250a;
                }
            } else if (interfaceC2135H0 == C2133G0.f6537b) {
                InterfaceC2149O0 interfaceC2149O0Mo3258i = r6.mo3258i();
                C2193m0 c2193m0 = new C2193m0(2, null);
                this.f6733Y = 2;
                if (AbstractC2124C.m3220s(interfaceC2149O0Mo3258i, c2193m0, this) == enumC19250a) {
                    return enumC19250a;
                }
                this.f6733Y = 3;
                if (interfaceC2184i.mo3141d(r6, this) == enumC19250a) {
                    return enumC19250a;
                }
            } else {
                InterfaceC2184i interfaceC2184iM3215n = AbstractC2124C.m3215n(interfaceC2135H0.mo3248a(r6.mo3258i()));
                C2195n0 c2195n0 = new C2195n0(interfaceC2184i, r6, this.f6737q0, null);
                this.f6733Y = 4;
                if (AbstractC2124C.m3212k(interfaceC2184iM3215n, c2195n0, this) == enumC19250a) {
                    return enumC19250a;
                }
            }
        }
        return C17296C.f55119a;
    }
}
