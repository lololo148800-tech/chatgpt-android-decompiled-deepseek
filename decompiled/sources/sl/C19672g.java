package sl;

import io.ktor.utils.p815io.C15085k;
import io.ktor.utils.p815io.InterfaceC15088n;
import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p972qm.InterfaceC18770c;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: sl.g */
/* JADX INFO: loaded from: classes3.dex */
public final class C19672g extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public byte[] f62354Y;

    /* JADX INFO: renamed from: Z */
    public int f62355Z;

    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ Object f62356o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ InterfaceC15088n f62357p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ C15085k f62358q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ C15085k f62359r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19672g(InterfaceC15088n interfaceC15088n, C15085k c15085k, C15085k c15085k2, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f62357p0 = interfaceC15088n;
        this.f62358q0 = c15085k;
        this.f62359r0 = c15085k2;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C19672g c19672g = new C19672g(this.f62357p0, this.f62358q0, this.f62359r0, interfaceC18770c);
        c19672g.f62356o0 = obj;
        return c19672g;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C19672g) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0050 A[Catch: all -> 0x001e, TryCatch #1 {all -> 0x001e, blocks: (B:7:0x0019, B:21:0x004a, B:23:0x0050, B:27:0x0061, B:29:0x0069, B:33:0x0098, B:37:0x00aa, B:14:0x002f), top: B:47:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:25:0x005d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:26:0x005e  */
    /* JADX WARN: Code duplicated, block: B:29:0x0069 A[Catch: all -> 0x001e, TryCatch #1 {all -> 0x001e, blocks: (B:7:0x0019, B:21:0x004a, B:23:0x0050, B:27:0x0061, B:29:0x0069, B:33:0x0098, B:37:0x00aa, B:14:0x002f), top: B:47:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:31:0x0095 A[RETURN] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v5, types: [byte[], java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v9 */
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
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0067 -> B:32:0x0096). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x0093 -> B:32:0x0096). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // sm.AbstractC19685a
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 202
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sl.C19672g.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
