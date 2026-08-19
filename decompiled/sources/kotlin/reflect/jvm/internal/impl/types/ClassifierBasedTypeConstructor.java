package kotlin.reflect.jvm.internal.impl.types;

import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ClassifierBasedTypeConstructor implements TypeConstructor {

    /* JADX INFO: renamed from: a */
    public int f53151a;

    /* JADX INFO: renamed from: a */
    public abstract boolean mo7318a(ClassifierDescriptor classifierDescriptor);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TypeConstructor) || obj.hashCode() != hashCode()) {
            return false;
        }
        TypeConstructor typeConstructor = (TypeConstructor) obj;
        if (typeConstructor.getParameters().size() != getParameters().size()) {
            return false;
        }
        ClassifierDescriptor classifierDescriptorMo22589getDeclarationDescriptor = mo22589getDeclarationDescriptor();
        ClassifierDescriptor classifierDescriptorMo22589getDeclarationDescriptor2 = typeConstructor.mo22589getDeclarationDescriptor();
        if (classifierDescriptorMo22589getDeclarationDescriptor2 == null || ErrorUtils.isError(classifierDescriptorMo22589getDeclarationDescriptor) || DescriptorUtils.isLocal(classifierDescriptorMo22589getDeclarationDescriptor) || ErrorUtils.isError(classifierDescriptorMo22589getDeclarationDescriptor2) || DescriptorUtils.isLocal(classifierDescriptorMo22589getDeclarationDescriptor2)) {
            return false;
        }
        return mo7318a(classifierDescriptorMo22589getDeclarationDescriptor2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    /* JADX INFO: renamed from: getDeclarationDescriptor */
    public abstract ClassifierDescriptor mo22589getDeclarationDescriptor();

    public int hashCode() {
        int i10 = this.f53151a;
        if (i10 != 0) {
            return i10;
        }
        ClassifierDescriptor classifierDescriptorMo22589getDeclarationDescriptor = mo22589getDeclarationDescriptor();
        int iIdentityHashCode = (ErrorUtils.isError(classifierDescriptorMo22589getDeclarationDescriptor) || DescriptorUtils.isLocal(classifierDescriptorMo22589getDeclarationDescriptor)) ? System.identityHashCode(this) : DescriptorUtils.getFqName(classifierDescriptorMo22589getDeclarationDescriptor).hashCode();
        this.f53151a = iIdentityHashCode;
        return iIdentityHashCode;
    }
}
