package p877ln;

import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ErrorReporter;

/* JADX INFO: renamed from: ln.b */
/* JADX INFO: loaded from: classes2.dex */
public final class C17070b implements ErrorReporter {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m18891a(int i10) {
        Object[] objArr = new Object[3];
        if (i10 != 1) {
            objArr[0] = "descriptor";
        } else {
            objArr[0] = "unresolvedSuperClasses";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/serialization/deserialization/ErrorReporter$1";
        if (i10 != 2) {
            objArr[2] = "reportIncompleteHierarchy";
        } else {
            objArr[2] = "reportCannotInferVisibility";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.ErrorReporter
    public final void reportCannotInferVisibility(CallableMemberDescriptor callableMemberDescriptor) {
        if (callableMemberDescriptor != null) {
            return;
        }
        m18891a(2);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.ErrorReporter
    public final void reportIncompleteHierarchy(ClassDescriptor classDescriptor, List list) {
        if (classDescriptor == null) {
            m18891a(0);
            throw null;
        }
        if (list != null) {
            return;
        }
        m18891a(1);
        throw null;
    }
}
