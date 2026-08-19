package p1055v4;

import p1073w3.AbstractC20800b;
import p372P3.InterfaceC6316H;

/* JADX INFO: renamed from: v4.j */
/* JADX INFO: loaded from: classes.dex */
public final class C20439j {

    /* JADX INFO: renamed from: a */
    public final InterfaceC6316H f64730a;

    /* JADX INFO: renamed from: b */
    public boolean f64731b;

    /* JADX INFO: renamed from: c */
    public boolean f64732c;

    /* JADX INFO: renamed from: d */
    public boolean f64733d;

    /* JADX INFO: renamed from: e */
    public int f64734e;

    /* JADX INFO: renamed from: f */
    public int f64735f;

    /* JADX INFO: renamed from: g */
    public long f64736g;

    /* JADX INFO: renamed from: h */
    public long f64737h;

    public C20439j(InterfaceC6316H interfaceC6316H) {
        this.f64730a = interfaceC6316H;
    }

    /* JADX INFO: renamed from: a */
    public final void m21098a(byte[] bArr, int i10, int i11) {
        if (this.f64732c) {
            int i12 = this.f64735f;
            int i13 = (i10 + 1) - i12;
            if (i13 >= i11) {
                this.f64735f = (i11 - i10) + i12;
            } else {
                this.f64733d = ((bArr[i13] & 192) >> 6) == 0;
                this.f64732c = false;
            }
        }
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
    /* JADX INFO: renamed from: b */
    public final void m21099b(int i10, long j10, boolean z6) {
        AbstractC20800b.m21320h(this.f64737h != -9223372036854775807L);
        if (this.f64734e == 182 && z6 && this.f64731b) {
            this.f64730a.mo4968a(this.f64737h, this.f64733d ? 1 : 0, (int) (j10 - this.f64736g), i10, null);
        }
        if (this.f64734e != 179) {
            this.f64736g = j10;
        }
    }
}
