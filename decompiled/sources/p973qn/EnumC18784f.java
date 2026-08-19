package p973qn;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.types.DefinitelyNotNullType;
import kotlin.reflect.jvm.internal.impl.types.StubTypeForBuilderInference;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import kotlin.reflect.jvm.internal.impl.types.checker.NullabilityChecker;
import p523V9.AbstractC7877E4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: qn.f */
/* JADX INFO: loaded from: classes2.dex */
public abstract class EnumC18784f {

    /* JADX INFO: renamed from: Y */
    public static final C18782d f59687Y;

    /* JADX INFO: renamed from: Z */
    public static final C18780b f59688Z;

    /* JADX INFO: renamed from: o0 */
    public static final C18783e f59689o0;

    /* JADX INFO: renamed from: p0 */
    public static final C18781c f59690p0;

    /* JADX INFO: renamed from: q0 */
    public static final /* synthetic */ EnumC18784f[] f59691q0;

    static {
        C18782d c18782d = new C18782d();
        f59687Y = c18782d;
        C18780b c18780b = new C18780b();
        f59688Z = c18780b;
        C18783e c18783e = new C18783e();
        f59689o0 = c18783e;
        C18781c c18781c = new C18781c();
        f59690p0 = c18781c;
        EnumC18784f[] enumC18784fArr = {c18782d, c18780b, c18783e, c18781c};
        f59691q0 = enumC18784fArr;
        AbstractC7877E4.m8156j(enumC18784fArr);
    }

    /* JADX INFO: renamed from: b */
    public static EnumC18784f m20053b(UnwrappedType unwrappedType) {
        AbstractC16544l.m18094g(unwrappedType, "<this>");
        if (unwrappedType.isMarkedNullable()) {
            return f59688Z;
        }
        boolean z6 = unwrappedType instanceof DefinitelyNotNullType;
        C18781c c18781c = f59690p0;
        if (!z6 || !(((DefinitelyNotNullType) unwrappedType).getOriginal() instanceof StubTypeForBuilderInference)) {
            boolean z10 = unwrappedType instanceof StubTypeForBuilderInference;
            C18783e c18783e = f59689o0;
            if (z10 || !NullabilityChecker.INSTANCE.isSubtypeOfAny(unwrappedType)) {
                return c18783e;
            }
        }
        return c18781c;
    }

    public static EnumC18784f valueOf(String str) {
        return (EnumC18784f) Enum.valueOf(EnumC18784f.class, str);
    }

    public static EnumC18784f[] values() {
        return (EnumC18784f[]) f59691q0.clone();
    }

    /* JADX INFO: renamed from: a */
    public abstract EnumC18784f mo20052a(UnwrappedType unwrappedType);
}
