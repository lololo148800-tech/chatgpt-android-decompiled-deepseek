package de;

import java.util.Map;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1426a;
import p1081wc.C20902u;
import p1081wc.InterfaceC20904w;

/* JADX INFO: renamed from: de.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C13075c extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f41534Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC20904w f41535Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ Object f41536o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ InterfaceC1426a f41537p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C13075c(InterfaceC20904w interfaceC20904w, Map map, InterfaceC1426a interfaceC1426a, int i10) {
        super(0);
        this.f41534Y = i10;
        this.f41535Z = interfaceC20904w;
        this.f41536o0 = map;
        this.f41537p0 = interfaceC1426a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.Map] */
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
    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        switch (this.f41534Y) {
            case 0:
                this.f41535Z.mo21447a(C20902u.f66622c, this.f41536o0);
                this.f41537p0.invoke();
                break;
            case 1:
                this.f41535Z.mo21447a(C20902u.f66624e, this.f41536o0);
                this.f41537p0.invoke();
                break;
            default:
                this.f41535Z.mo21447a(C20902u.f66624e, this.f41536o0);
                this.f41537p0.invoke();
                break;
        }
        return C17296C.f55119a;
    }
}
