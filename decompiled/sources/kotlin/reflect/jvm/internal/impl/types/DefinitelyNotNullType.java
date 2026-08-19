package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.TypeParameterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedType;
import kotlin.reflect.jvm.internal.impl.types.checker.NewTypeVariableConstructor;
import kotlin.reflect.jvm.internal.impl.types.checker.NullabilityChecker;
import kotlin.reflect.jvm.internal.impl.types.model.DefinitelyNotNullTypeMarker;

/* JADX INFO: loaded from: classes2.dex */
public final class DefinitelyNotNullType extends DelegatingSimpleType implements CustomTypeParameter, DefinitelyNotNullTypeMarker {
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: Z */
    public final SimpleType f53152Z;

    /* JADX INFO: renamed from: o0 */
    public final boolean f53153o0;

    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public static /* synthetic */ DefinitelyNotNullType makeDefinitelyNotNull$default(Companion companion, UnwrappedType unwrappedType, boolean z6, boolean z10, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                z6 = false;
            }
            if ((i10 & 4) != 0) {
                z10 = false;
            }
            return companion.makeDefinitelyNotNull(unwrappedType, z6, z10);
        }

        public final DefinitelyNotNullType makeDefinitelyNotNull(UnwrappedType type, boolean z6, boolean z10) {
            boolean zIsNullableType;
            AbstractC16544l.m18094g(type, "type");
            if (type instanceof DefinitelyNotNullType) {
                return (DefinitelyNotNullType) type;
            }
            DefaultConstructorMarker defaultConstructorMarker = null;
            if (!z10) {
                if (!(type.getConstructor() instanceof NewTypeVariableConstructor) && !(type.getConstructor().mo22589getDeclarationDescriptor() instanceof TypeParameterDescriptor) && !(type instanceof NewCapturedType) && !(type instanceof StubTypeForBuilderInference)) {
                    zIsNullableType = false;
                } else if (type instanceof StubTypeForBuilderInference) {
                    zIsNullableType = TypeUtils.isNullableType(type);
                } else {
                    ClassifierDescriptor classifierDescriptorMo22589getDeclarationDescriptor = type.getConstructor().mo22589getDeclarationDescriptor();
                    TypeParameterDescriptorImpl typeParameterDescriptorImpl = classifierDescriptorMo22589getDeclarationDescriptor instanceof TypeParameterDescriptorImpl ? (TypeParameterDescriptorImpl) classifierDescriptorMo22589getDeclarationDescriptor : null;
                    if (typeParameterDescriptorImpl == null || typeParameterDescriptorImpl.isInitialized()) {
                        zIsNullableType = (z6 && (type.getConstructor().mo22589getDeclarationDescriptor() instanceof TypeParameterDescriptor)) ? TypeUtils.isNullableType(type) : !NullabilityChecker.INSTANCE.isSubtypeOfAny(type);
                    } else {
                        zIsNullableType = true;
                    }
                }
                if (!zIsNullableType) {
                    return null;
                }
            }
            if (type instanceof FlexibleType) {
                FlexibleType flexibleType = (FlexibleType) type;
                AbstractC16544l.m18089b(flexibleType.getLowerBound().getConstructor(), flexibleType.getUpperBound().getConstructor());
            }
            return new DefinitelyNotNullType(FlexibleTypesKt.lowerIfFlexible(type).makeNullableAsSpecified(false), z6, defaultConstructorMarker);
        }
    }

    public /* synthetic */ DefinitelyNotNullType(SimpleType simpleType, boolean z6, DefaultConstructorMarker defaultConstructorMarker) {
        this(simpleType, z6);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType
    public final SimpleType getDelegate() {
        return this.f53152Z;
    }

    public final SimpleType getOriginal() {
        return this.f53152Z;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType, kotlin.reflect.jvm.internal.impl.types.KotlinType
    public boolean isMarkedNullable() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.CustomTypeParameter
    public boolean isTypeParameter() {
        SimpleType simpleType = this.f53152Z;
        return (simpleType.getConstructor() instanceof NewTypeVariableConstructor) || (simpleType.getConstructor().mo22589getDeclarationDescriptor() instanceof TypeParameterDescriptor);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.CustomTypeParameter
    public KotlinType substitutionResult(KotlinType replacement) {
        AbstractC16544l.m18094g(replacement, "replacement");
        return SpecialTypesKt.makeDefinitelyNotNullOrNotNull(replacement.unwrap(), this.f53153o0);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.SimpleType
    public String toString() {
        return this.f53152Z + " & Any";
    }

    public DefinitelyNotNullType(SimpleType simpleType, boolean z6) {
        this.f53152Z = simpleType;
        this.f53153o0 = z6;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.SimpleType, kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    public SimpleType makeNullableAsSpecified(boolean z6) {
        return z6 ? this.f53152Z.makeNullableAsSpecified(z6) : this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.SimpleType, kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    public SimpleType replaceAttributes(TypeAttributes newAttributes) {
        AbstractC16544l.m18094g(newAttributes, "newAttributes");
        return new DefinitelyNotNullType(this.f53152Z.replaceAttributes(newAttributes), this.f53153o0);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType
    public DefinitelyNotNullType replaceDelegate(SimpleType delegate) {
        AbstractC16544l.m18094g(delegate, "delegate");
        return new DefinitelyNotNullType(delegate, this.f53153o0);
    }
}
