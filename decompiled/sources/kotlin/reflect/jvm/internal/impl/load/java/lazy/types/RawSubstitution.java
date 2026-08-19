package kotlin.reflect.jvm.internal.impl.load.java.lazy.types;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.ErasureProjectionComputer;
import kotlin.reflect.jvm.internal.impl.types.FlexibleTypesKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributes;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeParameterUpperBoundEraser;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitution;
import kotlin.reflect.jvm.internal.impl.types.TypeUsage;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;
import mm.C17309l;
import p571X9.AbstractC9393x3;
import p630Zm.C10426b;
import p909nm.AbstractC17682p;

/* JADX INFO: loaded from: classes2.dex */
public final class RawSubstitution extends TypeSubstitution {
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: c */
    public static final JavaTypeAttributes f51973c;

    /* JADX INFO: renamed from: d */
    public static final JavaTypeAttributes f51974d;

    /* JADX INFO: renamed from: a */
    public final RawProjectionComputer f51975a;

    /* JADX INFO: renamed from: b */
    public final TypeParameterUpperBoundEraser f51976b;

    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    static {
        TypeUsage typeUsage = TypeUsage.COMMON;
        f51973c = JavaTypeAttributesKt.toAttributes$default(typeUsage, false, true, null, 5, null).withFlexibility(JavaTypeFlexibility.FLEXIBLE_LOWER_BOUND);
        f51974d = JavaTypeAttributesKt.toAttributes$default(typeUsage, false, true, null, 5, null).withFlexibility(JavaTypeFlexibility.FLEXIBLE_UPPER_BOUND);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RawSubstitution() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: renamed from: a */
    public final C17309l m18222a(SimpleType simpleType, ClassDescriptor classDescriptor, JavaTypeAttributes javaTypeAttributes) {
        if (simpleType.getConstructor().getParameters().isEmpty()) {
            return new C17309l(simpleType, Boolean.FALSE);
        }
        if (KotlinBuiltIns.isArray(simpleType)) {
            TypeProjection typeProjection = simpleType.getArguments().get(0);
            Variance projectionKind = typeProjection.getProjectionKind();
            KotlinType type = typeProjection.getType();
            AbstractC16544l.m18093f(type, "getType(...)");
            return new C17309l(KotlinTypeFactory.simpleType$default(simpleType.getAttributes(), simpleType.getConstructor(), AbstractC9393x3.m9974d(new TypeProjectionImpl(projectionKind, m18223b(type, javaTypeAttributes))), simpleType.isMarkedNullable(), (KotlinTypeRefiner) null, 16, (Object) null), Boolean.FALSE);
        }
        if (KotlinTypeKt.isError(simpleType)) {
            return new C17309l(ErrorUtils.createErrorType(ErrorTypeKind.ERROR_RAW_TYPE, simpleType.getConstructor().toString()), Boolean.FALSE);
        }
        MemberScope memberScope = classDescriptor.getMemberScope(this);
        AbstractC16544l.m18093f(memberScope, "getMemberScope(...)");
        TypeAttributes attributes = simpleType.getAttributes();
        TypeConstructor typeConstructor = classDescriptor.getTypeConstructor();
        AbstractC16544l.m18093f(typeConstructor, "getTypeConstructor(...)");
        List<TypeParameterDescriptor> parameters = classDescriptor.getTypeConstructor().getParameters();
        AbstractC16544l.m18093f(parameters, "getParameters(...)");
        List<TypeParameterDescriptor> list = parameters;
        ArrayList arrayList = new ArrayList(AbstractC17682p.m19389r(list, 10));
        for (TypeParameterDescriptor typeParameterDescriptor : list) {
            AbstractC16544l.m18091d(typeParameterDescriptor);
            arrayList.add(ErasureProjectionComputer.computeProjection$default(this.f51975a, typeParameterDescriptor, javaTypeAttributes, this.f51976b, null, 8, null));
        }
        return new C17309l(KotlinTypeFactory.simpleTypeWithNonTrivialMemberScope(attributes, typeConstructor, arrayList, simpleType.isMarkedNullable(), memberScope, new C10426b(classDescriptor, this, simpleType, javaTypeAttributes, 0)), Boolean.TRUE);
    }

    /* JADX INFO: renamed from: b */
    public final KotlinType m18223b(KotlinType kotlinType, JavaTypeAttributes javaTypeAttributes) {
        ClassifierDescriptor classifierDescriptorMo22589getDeclarationDescriptor = kotlinType.getConstructor().mo22589getDeclarationDescriptor();
        if (classifierDescriptorMo22589getDeclarationDescriptor instanceof TypeParameterDescriptor) {
            return m18223b(this.f51976b.getErasedUpperBound((TypeParameterDescriptor) classifierDescriptorMo22589getDeclarationDescriptor, javaTypeAttributes.markIsRaw(true)), javaTypeAttributes);
        }
        if (!(classifierDescriptorMo22589getDeclarationDescriptor instanceof ClassDescriptor)) {
            throw new IllegalStateException(("Unexpected declaration kind: " + classifierDescriptorMo22589getDeclarationDescriptor).toString());
        }
        ClassifierDescriptor classifierDescriptorMo22589getDeclarationDescriptor2 = FlexibleTypesKt.upperIfFlexible(kotlinType).getConstructor().mo22589getDeclarationDescriptor();
        if (classifierDescriptorMo22589getDeclarationDescriptor2 instanceof ClassDescriptor) {
            C17309l c17309lM18222a = m18222a(FlexibleTypesKt.lowerIfFlexible(kotlinType), (ClassDescriptor) classifierDescriptorMo22589getDeclarationDescriptor, f51973c);
            SimpleType simpleType = (SimpleType) c17309lM18222a.f55136Y;
            boolean zBooleanValue = ((Boolean) c17309lM18222a.f55137Z).booleanValue();
            C17309l c17309lM18222a2 = m18222a(FlexibleTypesKt.upperIfFlexible(kotlinType), (ClassDescriptor) classifierDescriptorMo22589getDeclarationDescriptor2, f51974d);
            SimpleType simpleType2 = (SimpleType) c17309lM18222a2.f55136Y;
            return (zBooleanValue || ((Boolean) c17309lM18222a2.f55137Z).booleanValue()) ? new RawTypeImpl(simpleType, simpleType2) : KotlinTypeFactory.flexibleType(simpleType, simpleType2);
        }
        throw new IllegalStateException(("For some reason declaration for upper bound is not a class but \"" + classifierDescriptorMo22589getDeclarationDescriptor2 + "\" while for lower it's \"" + classifierDescriptorMo22589getDeclarationDescriptor + '\"').toString());
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    public boolean isEmpty() {
        return false;
    }

    public RawSubstitution(TypeParameterUpperBoundEraser typeParameterUpperBoundEraser) {
        RawProjectionComputer rawProjectionComputer = new RawProjectionComputer();
        this.f51975a = rawProjectionComputer;
        this.f51976b = typeParameterUpperBoundEraser == null ? new TypeParameterUpperBoundEraser(rawProjectionComputer, null, 2, null) : typeParameterUpperBoundEraser;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    /* JADX INFO: renamed from: get */
    public TypeProjectionImpl mo22592get(KotlinType key) {
        AbstractC16544l.m18094g(key, "key");
        return new TypeProjectionImpl(m18223b(key, new JavaTypeAttributes(TypeUsage.COMMON, null, false, false, null, null, 62, null)));
    }

    public /* synthetic */ RawSubstitution(TypeParameterUpperBoundEraser typeParameterUpperBoundEraser, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : typeParameterUpperBoundEraser);
    }
}
