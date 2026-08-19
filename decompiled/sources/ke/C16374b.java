package ke;

import java.util.Collection;
import java.util.Iterator;
import mm.C17296C;
import mm.C17309l;
import p049Bm.InterfaceC1439n;
import p972qm.InterfaceC18770c;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: ke.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C16374b extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public C16382j f50849Y;

    /* JADX INFO: renamed from: Z */
    public Collection f50850Z;

    /* JADX INFO: renamed from: o0 */
    public Iterator f50851o0;

    /* JADX INFO: renamed from: p0 */
    public String f50852p0;

    /* JADX INFO: renamed from: q0 */
    public Collection f50853q0;

    /* JADX INFO: renamed from: r0 */
    public int f50854r0;

    /* JADX INFO: renamed from: s0 */
    public /* synthetic */ Object f50855s0;

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ C16382j f50856t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16374b(C16382j c16382j, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f50856t0 = c16382j;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C16374b c16374b = new C16374b(this.f50856t0, interfaceC18770c);
        c16374b.f50855s0 = obj;
        return c16374b;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C16374b) create((C17309l) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    /* JADX WARN: Code duplicated, block: B:54:0x0166 A[LOOP:0: B:51:0x0140->B:54:0x0166, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:60:0x015c A[EDGE_INSN: B:60:0x015c->B:53:0x015c BREAK  A[LOOP:0: B:51:0x0140->B:54:0x0166], SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v3 */
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
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00f0 -> B:34:0x00f1). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:51:0x0140
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // sm.AbstractC19685a
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            Method dump skipped, instruction units count: 372
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ke.C16374b.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
