package kotlin.reflect.jvm.internal.impl.builtins.functions;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import p315Me.Myis.CxcULo;
import p571X9.AbstractC9306j0;

/* JADX INFO: loaded from: classes2.dex */
public abstract class FunctionTypeKind {

    /* JADX INFO: renamed from: a */
    public final FqName f51332a;

    /* JADX INFO: renamed from: b */
    public final String f51333b;

    public static final class Function extends FunctionTypeKind {
        public static final Function INSTANCE = new Function(StandardNames.BUILT_INS_PACKAGE_FQ_NAME, "Function", false, null);
    }

    public static final class KFunction extends FunctionTypeKind {
        public static final KFunction INSTANCE = new KFunction(StandardNames.KOTLIN_REFLECT_FQ_NAME, "KFunction", true, null);
    }

    public static final class KSuspendFunction extends FunctionTypeKind {
        public static final KSuspendFunction INSTANCE = new KSuspendFunction(StandardNames.KOTLIN_REFLECT_FQ_NAME, "KSuspendFunction", true, null);
    }

    public static final class SuspendFunction extends FunctionTypeKind {
        public static final SuspendFunction INSTANCE = new SuspendFunction(StandardNames.COROUTINES_PACKAGE_FQ_NAME, "SuspendFunction", false, null);
    }

    public final String getClassNamePrefix() {
        return this.f51333b;
    }

    public final FqName getPackageFqName() {
        return this.f51332a;
    }

    public final Name numberedClassName(int i10) {
        Name nameIdentifier = Name.identifier(this.f51333b + i10);
        AbstractC16544l.m18093f(nameIdentifier, "identifier(...)");
        return nameIdentifier;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f51332a);
        sb2.append('.');
        return AbstractC9306j0.m9892k(sb2, this.f51333b, 'N');
    }

    public FunctionTypeKind(FqName fqName, String classNamePrefix, boolean z6, ClassId classId) {
        AbstractC16544l.m18094g(fqName, CxcULo.MVLxkZhmEw);
        AbstractC16544l.m18094g(classNamePrefix, "classNamePrefix");
        this.f51332a = fqName;
        this.f51333b = classNamePrefix;
    }
}
