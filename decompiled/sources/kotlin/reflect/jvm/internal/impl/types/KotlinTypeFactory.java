package kotlin.reflect.jvm.internal.impl.types;

import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleAwareClassDescriptorKt;
import kotlin.reflect.jvm.internal.impl.resolve.constants.IntegerLiteralTypeConstructor;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;
import p049Bm.InterfaceC1436k;
import p658b5.C11234e;
import p909nm.C17689w;
import pn.C18520g;
import pn.C18521h;
import pn.C18523j;

/* JADX INFO: loaded from: classes2.dex */
public final class KotlinTypeFactory {
    public static final KotlinTypeFactory INSTANCE = new KotlinTypeFactory();

    /* JADX INFO: renamed from: a */
    public static C11234e m18416a(TypeConstructor typeConstructor, KotlinTypeRefiner kotlinTypeRefiner, List list) {
        ClassifierDescriptor classifierDescriptorRefineDescriptor;
        ClassifierDescriptor classifierDescriptorMo22589getDeclarationDescriptor = typeConstructor.mo22589getDeclarationDescriptor();
        Object obj = null;
        if (classifierDescriptorMo22589getDeclarationDescriptor == null || (classifierDescriptorRefineDescriptor = kotlinTypeRefiner.refineDescriptor(classifierDescriptorMo22589getDeclarationDescriptor)) == null) {
            return null;
        }
        if (classifierDescriptorRefineDescriptor instanceof TypeAliasDescriptor) {
            return new C11234e(computeExpandedType((TypeAliasDescriptor) classifierDescriptorRefineDescriptor, list), 29, obj);
        }
        TypeConstructor typeConstructorRefine = classifierDescriptorRefineDescriptor.getTypeConstructor().refine(kotlinTypeRefiner);
        AbstractC16544l.m18093f(typeConstructorRefine, "refine(...)");
        return new C11234e(obj, 29, typeConstructorRefine);
    }

    public static final SimpleType computeExpandedType(TypeAliasDescriptor typeAliasDescriptor, List<? extends TypeProjection> arguments) {
        AbstractC16544l.m18094g(typeAliasDescriptor, "<this>");
        AbstractC16544l.m18094g(arguments, "arguments");
        return new TypeAliasExpander(TypeAliasExpansionReportStrategy.DO_NOTHING.INSTANCE, false).expand(TypeAliasExpansion.Companion.create(null, typeAliasDescriptor, arguments), TypeAttributes.Companion.getEmpty());
    }

    public static final UnwrappedType flexibleType(SimpleType lowerBound, SimpleType upperBound) {
        AbstractC16544l.m18094g(lowerBound, "lowerBound");
        AbstractC16544l.m18094g(upperBound, "upperBound");
        return lowerBound.equals(upperBound) ? lowerBound : new FlexibleTypeImpl(lowerBound, upperBound);
    }

    public static final SimpleType integerLiteralType(TypeAttributes attributes, IntegerLiteralTypeConstructor constructor, boolean z6) {
        AbstractC16544l.m18094g(attributes, "attributes");
        AbstractC16544l.m18094g(constructor, "constructor");
        return simpleTypeWithNonTrivialMemberScope(attributes, constructor, C17689w.f56480Y, z6, ErrorUtils.createErrorScope(ErrorScopeKind.INTEGER_LITERAL_TYPE_SCOPE, true, "unknown integer literal type"));
    }

    public static final SimpleType simpleNotNullType(TypeAttributes attributes, ClassDescriptor descriptor, List<? extends TypeProjection> arguments) {
        AbstractC16544l.m18094g(attributes, "attributes");
        AbstractC16544l.m18094g(descriptor, "descriptor");
        AbstractC16544l.m18094g(arguments, "arguments");
        TypeConstructor typeConstructor = descriptor.getTypeConstructor();
        AbstractC16544l.m18093f(typeConstructor, "getTypeConstructor(...)");
        return simpleType$default(attributes, typeConstructor, (List) arguments, false, (KotlinTypeRefiner) null, 16, (Object) null);
    }

    public static final SimpleType simpleType(TypeAttributes attributes, TypeConstructor constructor, List<? extends TypeProjection> arguments, boolean z6) {
        AbstractC16544l.m18094g(attributes, "attributes");
        AbstractC16544l.m18094g(constructor, "constructor");
        AbstractC16544l.m18094g(arguments, "arguments");
        return simpleType$default(attributes, constructor, arguments, z6, (KotlinTypeRefiner) null, 16, (Object) null);
    }

    public static /* synthetic */ SimpleType simpleType$default(TypeAttributes typeAttributes, TypeConstructor typeConstructor, List list, boolean z6, KotlinTypeRefiner kotlinTypeRefiner, int i10, Object obj) {
        if ((i10 & 16) != 0) {
            kotlinTypeRefiner = null;
        }
        return simpleType(typeAttributes, typeConstructor, (List<? extends TypeProjection>) list, z6, kotlinTypeRefiner);
    }

    public static final SimpleType simpleTypeWithNonTrivialMemberScope(TypeAttributes attributes, TypeConstructor constructor, List<? extends TypeProjection> arguments, boolean z6, MemberScope memberScope) {
        AbstractC16544l.m18094g(attributes, "attributes");
        AbstractC16544l.m18094g(constructor, "constructor");
        AbstractC16544l.m18094g(arguments, "arguments");
        AbstractC16544l.m18094g(memberScope, "memberScope");
        C16633a c16633a = new C16633a(constructor, arguments, z6, memberScope, new C18521h(attributes, constructor, arguments, z6, memberScope));
        return attributes.isEmpty() ? c16633a : new C18523j(c16633a, attributes);
    }

    public static final SimpleType simpleType(TypeAttributes attributes, TypeConstructor constructor, List<? extends TypeProjection> arguments, boolean z6, KotlinTypeRefiner kotlinTypeRefiner) {
        MemberScope memberScopeCreateScopeForKotlinType;
        AbstractC16544l.m18094g(attributes, "attributes");
        AbstractC16544l.m18094g(constructor, "constructor");
        AbstractC16544l.m18094g(arguments, "arguments");
        if (attributes.isEmpty() && arguments.isEmpty() && !z6 && constructor.mo22589getDeclarationDescriptor() != null) {
            ClassifierDescriptor classifierDescriptorMo22589getDeclarationDescriptor = constructor.mo22589getDeclarationDescriptor();
            AbstractC16544l.m18091d(classifierDescriptorMo22589getDeclarationDescriptor);
            SimpleType defaultType = classifierDescriptorMo22589getDeclarationDescriptor.getDefaultType();
            AbstractC16544l.m18093f(defaultType, "getDefaultType(...)");
            return defaultType;
        }
        INSTANCE.getClass();
        ClassifierDescriptor classifierDescriptorMo22589getDeclarationDescriptor2 = constructor.mo22589getDeclarationDescriptor();
        if (classifierDescriptorMo22589getDeclarationDescriptor2 instanceof TypeParameterDescriptor) {
            memberScopeCreateScopeForKotlinType = ((TypeParameterDescriptor) classifierDescriptorMo22589getDeclarationDescriptor2).getDefaultType().getMemberScope();
        } else if (classifierDescriptorMo22589getDeclarationDescriptor2 instanceof ClassDescriptor) {
            if (kotlinTypeRefiner == null) {
                kotlinTypeRefiner = DescriptorUtilsKt.getKotlinTypeRefiner(DescriptorUtilsKt.getModule(classifierDescriptorMo22589getDeclarationDescriptor2));
            }
            memberScopeCreateScopeForKotlinType = arguments.isEmpty() ? ModuleAwareClassDescriptorKt.getRefinedUnsubstitutedMemberScopeIfPossible((ClassDescriptor) classifierDescriptorMo22589getDeclarationDescriptor2, kotlinTypeRefiner) : ModuleAwareClassDescriptorKt.getRefinedMemberScopeIfPossible((ClassDescriptor) classifierDescriptorMo22589getDeclarationDescriptor2, TypeConstructorSubstitution.Companion.create(constructor, arguments), kotlinTypeRefiner);
        } else if (classifierDescriptorMo22589getDeclarationDescriptor2 instanceof TypeAliasDescriptor) {
            memberScopeCreateScopeForKotlinType = ErrorUtils.createErrorScope(ErrorScopeKind.SCOPE_FOR_ABBREVIATION_TYPE, true, ((TypeAliasDescriptor) classifierDescriptorMo22589getDeclarationDescriptor2).getName().toString());
        } else {
            if (!(constructor instanceof IntersectionTypeConstructor)) {
                throw new IllegalStateException("Unsupported classifier: " + classifierDescriptorMo22589getDeclarationDescriptor2 + " for constructor: " + constructor);
            }
            memberScopeCreateScopeForKotlinType = ((IntersectionTypeConstructor) constructor).createScopeForKotlinType();
        }
        return simpleTypeWithNonTrivialMemberScope(attributes, constructor, arguments, z6, memberScopeCreateScopeForKotlinType, new C18520g(attributes, constructor, arguments, z6));
    }

    public static /* synthetic */ SimpleType simpleType$default(SimpleType simpleType, TypeAttributes typeAttributes, TypeConstructor typeConstructor, List list, boolean z6, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            typeAttributes = simpleType.getAttributes();
        }
        if ((i10 & 4) != 0) {
            typeConstructor = simpleType.getConstructor();
        }
        if ((i10 & 8) != 0) {
            list = simpleType.getArguments();
        }
        if ((i10 & 16) != 0) {
            z6 = simpleType.isMarkedNullable();
        }
        return simpleType(simpleType, typeAttributes, typeConstructor, (List<? extends TypeProjection>) list, z6);
    }

    public static final SimpleType simpleTypeWithNonTrivialMemberScope(TypeAttributes attributes, TypeConstructor constructor, List<? extends TypeProjection> arguments, boolean z6, MemberScope memberScope, InterfaceC1436k refinedTypeFactory) {
        AbstractC16544l.m18094g(attributes, "attributes");
        AbstractC16544l.m18094g(constructor, "constructor");
        AbstractC16544l.m18094g(arguments, "arguments");
        AbstractC16544l.m18094g(memberScope, "memberScope");
        AbstractC16544l.m18094g(refinedTypeFactory, "refinedTypeFactory");
        C16633a c16633a = new C16633a(constructor, arguments, z6, memberScope, refinedTypeFactory);
        return attributes.isEmpty() ? c16633a : new C18523j(c16633a, attributes);
    }

    public static final SimpleType simpleType(SimpleType baseType, TypeAttributes annotations, TypeConstructor constructor, List<? extends TypeProjection> arguments, boolean z6) {
        AbstractC16544l.m18094g(baseType, "baseType");
        AbstractC16544l.m18094g(annotations, "annotations");
        AbstractC16544l.m18094g(constructor, "constructor");
        AbstractC16544l.m18094g(arguments, "arguments");
        return simpleType$default(annotations, constructor, arguments, z6, (KotlinTypeRefiner) null, 16, (Object) null);
    }
}
