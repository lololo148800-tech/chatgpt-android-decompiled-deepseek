package p397Q5;

import com.auth0.android.provider.lcl.qffLJgOYizGmMj;
import p972qm.InterfaceC18770c;

/* JADX INFO: renamed from: Q5.e */
/* JADX INFO: loaded from: classes.dex */
public final class C6576e implements InterfaceC6580i {
    @Override // p397Q5.InterfaceC6580i
    /* JADX INFO: renamed from: a */
    public final Object mo2445a(InterfaceC18770c interfaceC18770c) {
        return C6579h.f21264c;
    }

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
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6576e)) {
            return false;
        }
        C6579h c6579h = C6579h.f21264c;
        ((C6576e) obj).getClass();
        return c6579h.equals(c6579h);
    }

    public final int hashCode() {
        return C6579h.f21264c.hashCode();
    }

    public final String toString() {
        return qffLJgOYizGmMj.AwHkeNKCCBNqWhE + C6579h.f21264c + ')';
    }
}
