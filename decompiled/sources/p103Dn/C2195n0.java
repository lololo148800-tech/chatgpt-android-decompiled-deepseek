package p103Dn;

import mm.C17296C;
import p025An.C0644w;
import p049Bm.InterfaceC1439n;
import p129En.AbstractC2591b;
import p153Fn.C2942t;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Dn.n0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2195n0 extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f6725Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f6726Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC2184i f6727o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ AbstractC2591b f6728p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ Object f6729q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C2195n0(InterfaceC2184i interfaceC2184i, InterfaceC2211v0 interfaceC2211v0, Object obj, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f6727o0 = interfaceC2184i;
        this.f6728p0 = (AbstractC2591b) interfaceC2211v0;
        this.f6729q0 = obj;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [Dn.v0, En.b] */
    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C2195n0 c2195n0 = new C2195n0(this.f6727o0, this.f6728p0, this.f6729q0, interfaceC18770c);
        c2195n0.f6726Z = obj;
        return c2195n0;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C2195n0) create((EnumC2131F0) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [Dn.j, Dn.v0, En.b] */
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
        int i10 = this.f6725Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            int iOrdinal = ((EnumC2131F0) this.f6726Z).ordinal();
            ?? r6 = this.f6728p0;
            if (iOrdinal == 0) {
                this.f6725Y = 1;
                if (this.f6727o0.mo3141d(r6, this) == enumC19250a) {
                    return enumC19250a;
                }
            } else if (iOrdinal != 1) {
                if (iOrdinal != 2) {
                    throw new C0644w();
                }
                C2942t c2942t = AbstractC2124C.f6496c;
                Object obj2 = this.f6729q0;
                if (obj2 == c2942t) {
                    r6.mo3230e();
                } else {
                    r6.mo3231f(obj2);
                }
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
        }
        return C17296C.f55119a;
    }
}
