package p1055v4;

import p372P3.InterfaceC6316H;

/* JADX INFO: renamed from: v4.o */
/* JADX INFO: loaded from: classes.dex */
public final class C20444o {

    /* JADX INFO: renamed from: a */
    public final InterfaceC6316H f64800a;

    /* JADX INFO: renamed from: b */
    public long f64801b;

    /* JADX INFO: renamed from: c */
    public boolean f64802c;

    /* JADX INFO: renamed from: d */
    public int f64803d;

    /* JADX INFO: renamed from: e */
    public long f64804e;

    /* JADX INFO: renamed from: f */
    public boolean f64805f;

    /* JADX INFO: renamed from: g */
    public boolean f64806g;

    /* JADX INFO: renamed from: h */
    public boolean f64807h;

    /* JADX INFO: renamed from: i */
    public boolean f64808i;

    /* JADX INFO: renamed from: j */
    public boolean f64809j;

    /* JADX INFO: renamed from: k */
    public long f64810k;

    /* JADX INFO: renamed from: l */
    public long f64811l;

    /* JADX INFO: renamed from: m */
    public boolean f64812m;

    public C20444o(InterfaceC6316H interfaceC6316H) {
        this.f64800a = interfaceC6316H;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: a */
    public final void m21102a(int i10) {
        long j10 = this.f64811l;
        if (j10 == -9223372036854775807L) {
            return;
        }
        boolean z6 = this.f64812m;
        this.f64800a.mo4968a(j10, z6 ? 1 : 0, (int) (this.f64801b - this.f64810k), i10, null);
    }
}
