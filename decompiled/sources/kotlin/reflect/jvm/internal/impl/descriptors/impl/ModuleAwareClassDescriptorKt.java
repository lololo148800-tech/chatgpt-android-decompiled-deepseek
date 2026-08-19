package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitution;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;

/* JADX INFO: loaded from: classes2.dex */
public final class ModuleAwareClassDescriptorKt {
    public static final MemberScope getRefinedMemberScopeIfPossible(ClassDescriptor classDescriptor, TypeSubstitution typeSubstitution, KotlinTypeRefiner kotlinTypeRefiner) {
        AbstractC16544l.m18094g(classDescriptor, "<this>");
        AbstractC16544l.m18094g(typeSubstitution, "typeSubstitution");
        AbstractC16544l.m18094g(kotlinTypeRefiner, "kotlinTypeRefiner");
        return ModuleAwareClassDescriptor.Companion.getRefinedMemberScopeIfPossible$descriptors(classDescriptor, typeSubstitution, kotlinTypeRefiner);
    }

    public static final MemberScope getRefinedUnsubstitutedMemberScopeIfPossible(ClassDescriptor classDescriptor, KotlinTypeRefiner kotlinTypeRefiner) {
        AbstractC16544l.m18094g(classDescriptor, "<this>");
        AbstractC16544l.m18094g(kotlinTypeRefiner, "kotlinTypeRefiner");
        return ModuleAwareClassDescriptor.Companion.getRefinedUnsubstitutedMemberScopeIfPossible$descriptors(classDescriptor, kotlinTypeRefiner);
    }
}
