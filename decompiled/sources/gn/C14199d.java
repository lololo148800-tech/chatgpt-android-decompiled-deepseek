package gn;

import kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassConstructorDescriptorImpl;

/* JADX INFO: renamed from: gn.d */
/* JADX INFO: loaded from: classes2.dex */
public final class C14199d extends ClassConstructorDescriptorImpl {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m15509a(int i10) {
        Object[] objArr = new Object[3];
        if (i10 != 1) {
            objArr[0] = "containingClass";
        } else {
            objArr[0] = "source";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorFactory$DefaultClassConstructorDescriptor";
        objArr[2] = "<init>";
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }
}
