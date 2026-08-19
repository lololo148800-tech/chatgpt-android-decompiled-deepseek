package kotlin.reflect.jvm.internal.impl.types.error;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassConstructorDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitution;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import p909nm.AbstractC17665J;
import p909nm.C17689w;

/* JADX INFO: loaded from: classes2.dex */
public final class ErrorClassDescriptor extends ClassDescriptorImpl {
    /* JADX WARN: Illegal instructions before constructor call */
    public ErrorClassDescriptor(Name name) {
        AbstractC16544l.m18094g(name, "name");
        ErrorUtils errorUtils = ErrorUtils.INSTANCE;
        ModuleDescriptor errorModule = errorUtils.getErrorModule();
        Modality modality = Modality.OPEN;
        ClassKind classKind = ClassKind.CLASS;
        C17689w c17689w = C17689w.f56480Y;
        SourceElement sourceElement = SourceElement.NO_SOURCE;
        super(errorModule, name, modality, classKind, c17689w, sourceElement, false, LockBasedStorageManager.NO_LOCKS);
        ClassConstructorDescriptorImpl classConstructorDescriptorImplCreate = ClassConstructorDescriptorImpl.create(this, Annotations.Companion.getEMPTY(), true, sourceElement);
        classConstructorDescriptorImplCreate.initialize(c17689w, DescriptorVisibilities.INTERNAL);
        MemberScope memberScopeCreateErrorScope = ErrorUtils.createErrorScope(ErrorScopeKind.SCOPE_FOR_ERROR_CLASS, classConstructorDescriptorImplCreate.getName().toString(), "");
        ErrorTypeKind errorTypeKind = ErrorTypeKind.ERROR_CLASS;
        classConstructorDescriptorImplCreate.setReturnType(new ErrorType(errorUtils.createErrorTypeConstructor(errorTypeKind, new String[0]), memberScopeCreateErrorScope, errorTypeKind, null, false, new String[0], 24, null));
        initialize(memberScopeCreateErrorScope, AbstractC17665J.m19268h(classConstructorDescriptorImplCreate), classConstructorDescriptorImplCreate);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleAwareClassDescriptor
    public MemberScope getMemberScope(TypeSubstitution typeSubstitution, KotlinTypeRefiner kotlinTypeRefiner) {
        AbstractC16544l.m18094g(typeSubstitution, "typeSubstitution");
        AbstractC16544l.m18094g(kotlinTypeRefiner, "kotlinTypeRefiner");
        return ErrorUtils.createErrorScope(ErrorScopeKind.SCOPE_FOR_ERROR_CLASS, getName().toString(), typeSubstitution.toString());
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.Substitutable
    public ClassDescriptor substitute(TypeSubstitutor substitutor) {
        AbstractC16544l.m18094g(substitutor, "substitutor");
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassDescriptorImpl
    public String toString() {
        String strAsString = getName().asString();
        AbstractC16544l.m18093f(strAsString, "asString(...)");
        return strAsString;
    }
}
