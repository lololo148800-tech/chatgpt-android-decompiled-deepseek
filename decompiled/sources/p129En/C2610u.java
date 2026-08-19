package p129En;

import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1439n;
import p049Bm.InterfaceC1440o;
import p077Cn.InterfaceC1747o;
import p103Dn.InterfaceC2184i;
import p103Dn.InterfaceC2186j;
import p972qm.InterfaceC18770c;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: En.u */
/* JADX INFO: loaded from: classes2.dex */
public final class C2610u extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public InterfaceC1747o f8087Y;

    /* JADX INFO: renamed from: Z */
    public byte[] f8088Z;

    /* JADX INFO: renamed from: o0 */
    public int f8089o0;

    /* JADX INFO: renamed from: p0 */
    public int f8090p0;

    /* JADX INFO: renamed from: q0 */
    public int f8091q0;

    /* JADX INFO: renamed from: r0 */
    public /* synthetic */ Object f8092r0;

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ InterfaceC2184i[] f8093s0;

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ InterfaceC1426a f8094t0;

    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ AbstractC19694j f8095u0;

    /* JADX INFO: renamed from: v0 */
    public final /* synthetic */ InterfaceC2186j f8096v0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C2610u(InterfaceC1426a interfaceC1426a, InterfaceC1440o interfaceC1440o, InterfaceC2186j interfaceC2186j, InterfaceC18770c interfaceC18770c, InterfaceC2184i[] interfaceC2184iArr) {
        super(2, interfaceC18770c);
        this.f8093s0 = interfaceC2184iArr;
        this.f8094t0 = interfaceC1426a;
        this.f8095u0 = (AbstractC19694j) interfaceC1440o;
        this.f8096v0 = interfaceC2186j;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [Bm.o, sm.j] */
    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        ?? r6 = this.f8095u0;
        C2610u c2610u = new C2610u(this.f8094t0, r6, this.f8096v0, interfaceC18770c, this.f8093s0);
        c2610u.f8092r0 = obj;
        return c2610u;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C2610u) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:30:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:32:0x00dc A[DONT_INVERT, EDGE_INSN: B:32:0x00dc->B:19:0x009f BREAK  A[LOOP:0: B:25:0x00bd->B:44:?]] */
    /* JADX WARN: Code duplicated, block: B:33:0x00de  */
    /* JADX WARN: Code duplicated, block: B:35:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:37:0x00fe A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:38:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:40:0x0117 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:43:0x00dc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:? A[LOOP:0: B:25:0x00bd->B:44:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1, types: [Cn.k] */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v2, types: [Cn.B, Cn.o] */
    /* JADX WARN: Type inference failed for: r11v3, types: [Cn.B, Cn.o] */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v6, types: [Cn.o] */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r13v3, types: [Bm.o, sm.j] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00fc -> B:19:0x009f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x0115 -> B:41:0x0118). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:33:0x00de
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // sm.AbstractC19685a
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            Method dump skipped, instruction units count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p129En.C2610u.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
