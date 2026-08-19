package p178H;

import android.util.Size;
import p1009s9.C19506i;
import p228J.C3814P;
import p228J.C3825a0;
import p228J.C3828c;
import p228J.C3835f0;
import p228J.InterfaceC3800E0;
import p228J.InterfaceC3816S;
import p228J.InterfaceC3818U;
import p391Q.AbstractC6542b;
import p490U.C7530a;
import p490U.C7531b;
import p490U.C7532c;

/* JADX INFO: renamed from: H.C */
/* JADX INFO: loaded from: classes.dex */
public final class C3110C {

    /* JADX INFO: renamed from: a */
    public static final C3814P f9351a;

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
    static {
        Object size = new Size(640, 480);
        C3175v c3175v = C3175v.f9575d;
        C7530a c7530a = C7530a.f23872a;
        Size size2 = AbstractC6542b.f21171b;
        C7532c c7532c = new C7532c();
        c7532c.f23876a = size2;
        c7532c.f23877b = 1;
        Object c7531b = new C7531b(c7530a, c7532c, null);
        C19506i c19506i = new C19506i(9, (byte) 0);
        C3828c c3828c = InterfaceC3818U.f11568q;
        C3825a0 c3825a0 = (C3825a0) c19506i.f61960Z;
        c3825a0.m4561x(c3828c, size);
        c3825a0.m4561x(InterfaceC3800E0.f11500z, 1);
        c3825a0.m4561x(InterfaceC3818U.f11563l, 0);
        c3825a0.m4561x(InterfaceC3818U.f11571t, c7531b);
        if (!c3175v.equals(c3175v)) {
            throw new UnsupportedOperationException("ImageAnalysis currently only supports SDR");
        }
        c3825a0.m4561x(InterfaceC3816S.f11561k, c3175v);
        f9351a = new C3814P(C3835f0.m4568a(c3825a0));
    }
}
