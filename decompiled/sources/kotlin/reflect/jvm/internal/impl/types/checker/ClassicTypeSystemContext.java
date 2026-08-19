package kotlin.reflect.jvm.internal.impl.types.checker;

import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.InlineClassRepresentation;
import kotlin.reflect.jvm.internal.impl.descriptors.ModalityUtilsKt;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.resolve.InlineClassesUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedType;
import kotlin.reflect.jvm.internal.impl.resolve.constants.IntegerLiteralTypeConstructor;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.DefinitelyNotNullType;
import kotlin.reflect.jvm.internal.impl.types.DynamicType;
import kotlin.reflect.jvm.internal.impl.types.FlexibleType;
import kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt;
import kotlin.reflect.jvm.internal.impl.types.NotNullTypeParameter;
import kotlin.reflect.jvm.internal.impl.types.RawType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.SimpleTypeWithEnhancement;
import kotlin.reflect.jvm.internal.impl.types.SpecialTypesKt;
import kotlin.reflect.jvm.internal.impl.types.TypeCheckerState;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructorSubstitution;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.TypeSystemCommonBackendContext;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus;
import kotlin.reflect.jvm.internal.impl.types.model.CapturedTypeConstructorMarker;
import kotlin.reflect.jvm.internal.impl.types.model.CapturedTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.DefinitelyNotNullTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.DynamicTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.FlexibleTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentListMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeParameterMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContextKt;
import kotlin.reflect.jvm.internal.impl.types.model.TypeSystemInferenceExtensionContext;
import kotlin.reflect.jvm.internal.impl.types.model.TypeVariableTypeConstructorMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeVariance;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import p160G5.p161rK.TVCuK;
import p548Wd.p549VF.zakks;
import p582Xk.HXHG.TfazcFv;
import p911o0.AbstractC17792x;

/* JADX INFO: loaded from: classes2.dex */
public interface ClassicTypeSystemContext extends TypeSystemCommonBackendContext, TypeSystemInferenceExtensionContext {

    public static final class DefaultImpls {
        public static boolean areEqualTypeConstructors(ClassicTypeSystemContext classicTypeSystemContext, TypeConstructorMarker c9, TypeConstructorMarker c10) {
            AbstractC16544l.m18094g(c9, "c1");
            AbstractC16544l.m18094g(c10, "c2");
            if (!(c9 instanceof TypeConstructor)) {
                StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
                sb2.append(c9);
                sb2.append(", ");
                throw new IllegalArgumentException(AbstractC17792x.m19535r(AbstractC16526C.f51263a, c9.getClass(), sb2).toString());
            }
            if (c10 instanceof TypeConstructor) {
                return c9.equals(c10);
            }
            StringBuilder sb3 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb3.append(c10);
            sb3.append(", ");
            throw new IllegalArgumentException(AbstractC17792x.m19535r(AbstractC16526C.f51263a, c10.getClass(), sb3).toString());
        }

        public static int argumentsCount(ClassicTypeSystemContext classicTypeSystemContext, KotlinTypeMarker receiver) {
            AbstractC16544l.m18094g(receiver, "$receiver");
            if (receiver instanceof KotlinType) {
                return ((KotlinType) receiver).getArguments().size();
            }
            StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb2.append(receiver);
            sb2.append(", ");
            throw new IllegalArgumentException(AbstractC17792x.m19535r(AbstractC16526C.f51263a, receiver.getClass(), sb2).toString());
        }

        public static TypeArgumentListMarker asArgumentList(ClassicTypeSystemContext classicTypeSystemContext, RigidTypeMarker receiver) {
            AbstractC16544l.m18094g(receiver, "$receiver");
            if (receiver instanceof SimpleType) {
                return (TypeArgumentListMarker) receiver;
            }
            StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb2.append(receiver);
            sb2.append(", ");
            throw new IllegalArgumentException(AbstractC17792x.m19535r(AbstractC16526C.f51263a, receiver.getClass(), sb2).toString());
        }

        public static CapturedTypeMarker asCapturedType(ClassicTypeSystemContext classicTypeSystemContext, SimpleTypeMarker receiver) {
            AbstractC16544l.m18094g(receiver, "$receiver");
            if (receiver instanceof SimpleType) {
                if (receiver instanceof SimpleTypeWithEnhancement) {
                    return classicTypeSystemContext.asCapturedType(((SimpleTypeWithEnhancement) receiver).getOrigin());
                }
                if (receiver instanceof NewCapturedType) {
                    return (NewCapturedType) receiver;
                }
                return null;
            }
            StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb2.append(receiver);
            sb2.append(", ");
            throw new IllegalArgumentException(AbstractC17792x.m19535r(AbstractC16526C.f51263a, receiver.getClass(), sb2).toString());
        }

        public static DefinitelyNotNullTypeMarker asDefinitelyNotNullType(ClassicTypeSystemContext classicTypeSystemContext, RigidTypeMarker receiver) {
            AbstractC16544l.m18094g(receiver, "$receiver");
            if (receiver instanceof SimpleType) {
                if (receiver instanceof DefinitelyNotNullType) {
                    return (DefinitelyNotNullType) receiver;
                }
                return null;
            }
            StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb2.append(receiver);
            sb2.append(", ");
            throw new IllegalArgumentException(AbstractC17792x.m19535r(AbstractC16526C.f51263a, receiver.getClass(), sb2).toString());
        }

        public static DynamicTypeMarker asDynamicType(ClassicTypeSystemContext classicTypeSystemContext, FlexibleTypeMarker receiver) {
            AbstractC16544l.m18094g(receiver, "$receiver");
            if (receiver instanceof FlexibleType) {
                if (receiver instanceof DynamicType) {
                    return (DynamicType) receiver;
                }
                return null;
            }
            StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb2.append(receiver);
            sb2.append(", ");
            throw new IllegalArgumentException(AbstractC17792x.m19535r(AbstractC16526C.f51263a, receiver.getClass(), sb2).toString());
        }

        public static FlexibleTypeMarker asFlexibleType(ClassicTypeSystemContext classicTypeSystemContext, KotlinTypeMarker receiver) {
            AbstractC16544l.m18094g(receiver, "$receiver");
            if (receiver instanceof KotlinType) {
                UnwrappedType unwrappedTypeUnwrap = ((KotlinType) receiver).unwrap();
                if (unwrappedTypeUnwrap instanceof FlexibleType) {
                    return (FlexibleType) unwrappedTypeUnwrap;
                }
                return null;
            }
            StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb2.append(receiver);
            sb2.append(", ");
            throw new IllegalArgumentException(AbstractC17792x.m19535r(AbstractC16526C.f51263a, receiver.getClass(), sb2).toString());
        }

        public static SimpleTypeMarker asRigidType(ClassicTypeSystemContext classicTypeSystemContext, KotlinTypeMarker receiver) {
            AbstractC16544l.m18094g(receiver, "$receiver");
            if (receiver instanceof KotlinType) {
                UnwrappedType unwrappedTypeUnwrap = ((KotlinType) receiver).unwrap();
                if (unwrappedTypeUnwrap instanceof SimpleType) {
                    return (SimpleType) unwrappedTypeUnwrap;
                }
                return null;
            }
            StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb2.append(receiver);
            sb2.append(", ");
            throw new IllegalArgumentException(AbstractC17792x.m19535r(AbstractC16526C.f51263a, receiver.getClass(), sb2).toString());
        }

        public static TypeArgumentMarker asTypeArgument(ClassicTypeSystemContext classicTypeSystemContext, KotlinTypeMarker receiver) {
            AbstractC16544l.m18094g(receiver, "$receiver");
            if (receiver instanceof KotlinType) {
                return TypeUtilsKt.asTypeProjection((KotlinType) receiver);
            }
            StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb2.append(receiver);
            sb2.append(", ");
            throw new IllegalArgumentException(AbstractC17792x.m19535r(AbstractC16526C.f51263a, receiver.getClass(), sb2).toString());
        }

        public static SimpleType captureFromArguments(ClassicTypeSystemContext classicTypeSystemContext, RigidTypeMarker type, CaptureStatus status) {
            AbstractC16544l.m18094g(type, "type");
            AbstractC16544l.m18094g(status, "status");
            if (type instanceof SimpleType) {
                return NewCapturedTypeKt.captureFromArguments((SimpleType) type, status);
            }
            StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb2.append(type);
            sb2.append(", ");
            throw new IllegalArgumentException(AbstractC17792x.m19535r(AbstractC16526C.f51263a, type.getClass(), sb2).toString());
        }

        public static CaptureStatus captureStatus(ClassicTypeSystemContext classicTypeSystemContext, CapturedTypeMarker receiver) {
            AbstractC16544l.m18094g(receiver, "$receiver");
            if (receiver instanceof NewCapturedType) {
                return ((NewCapturedType) receiver).getCaptureStatus();
            }
            StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb2.append(receiver);
            sb2.append(", ");
            throw new IllegalArgumentException(AbstractC17792x.m19535r(AbstractC16526C.f51263a, receiver.getClass(), sb2).toString());
        }

        public static KotlinTypeMarker createFlexibleType(ClassicTypeSystemContext classicTypeSystemContext, RigidTypeMarker lowerBound, RigidTypeMarker upperBound) {
            AbstractC16544l.m18094g(lowerBound, "lowerBound");
            AbstractC16544l.m18094g(upperBound, "upperBound");
            if (!(lowerBound instanceof SimpleType)) {
                StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
                sb2.append(classicTypeSystemContext);
                sb2.append(", ");
                throw new IllegalArgumentException(AbstractC17792x.m19535r(AbstractC16526C.f51263a, classicTypeSystemContext.getClass(), sb2).toString());
            }
            if (upperBound instanceof SimpleType) {
                return KotlinTypeFactory.flexibleType((SimpleType) lowerBound, (SimpleType) upperBound);
            }
            StringBuilder sb3 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb3.append(classicTypeSystemContext);
            sb3.append(", ");
            throw new IllegalArgumentException(AbstractC17792x.m19535r(AbstractC16526C.f51263a, classicTypeSystemContext.getClass(), sb3).toString());
        }

        public static TypeArgumentMarker getArgument(ClassicTypeSystemContext classicTypeSystemContext, KotlinTypeMarker receiver, int i10) {
            AbstractC16544l.m18094g(receiver, "$receiver");
            if (receiver instanceof KotlinType) {
                return ((KotlinType) receiver).getArguments().get(i10);
            }
            StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb2.append(receiver);
            sb2.append(", ");
            throw new IllegalArgumentException(AbstractC17792x.m19535r(AbstractC16526C.f51263a, receiver.getClass(), sb2).toString());
        }

        public static List<TypeArgumentMarker> getArguments(ClassicTypeSystemContext classicTypeSystemContext, KotlinTypeMarker receiver) {
            AbstractC16544l.m18094g(receiver, "$receiver");
            if (receiver instanceof KotlinType) {
                return ((KotlinType) receiver).getArguments();
            }
            StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb2.append(receiver);
            sb2.append(", ");
            throw new IllegalArgumentException(AbstractC17792x.m19535r(AbstractC16526C.f51263a, receiver.getClass(), sb2).toString());
        }

        public static FqNameUnsafe getClassFqNameUnsafe(ClassicTypeSystemContext classicTypeSystemContext, TypeConstructorMarker receiver) {
            AbstractC16544l.m18094g(receiver, "$receiver");
            if (receiver instanceof TypeConstructor) {
                ClassifierDescriptor classifierDescriptorMo22589getDeclarationDescriptor = ((TypeConstructor) receiver).mo22589getDeclarationDescriptor();
                AbstractC16544l.m18092e(classifierDescriptorMo22589getDeclarationDescriptor, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                return DescriptorUtilsKt.getFqNameUnsafe((ClassDescriptor) classifierDescriptorMo22589getDeclarationDescriptor);
            }
            StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb2.append(receiver);
            sb2.append(", ");
            throw new IllegalArgumentException(AbstractC17792x.m19535r(AbstractC16526C.f51263a, receiver.getClass(), sb2).toString());
        }

        public static TypeParameterMarker getParameter(ClassicTypeSystemContext classicTypeSystemContext, TypeConstructorMarker receiver, int i10) {
            AbstractC16544l.m18094g(receiver, "$receiver");
            if (receiver instanceof TypeConstructor) {
                TypeParameterDescriptor typeParameterDescriptor = ((TypeConstructor) receiver).getParameters().get(i10);
                AbstractC16544l.m18093f(typeParameterDescriptor, "get(...)");
                return typeParameterDescriptor;
            }
            StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb2.append(receiver);
            sb2.append(", ");
            throw new IllegalArgumentException(AbstractC17792x.m19535r(AbstractC16526C.f51263a, receiver.getClass(), sb2).toString());
        }

        public static List<TypeParameterMarker> getParameters(ClassicTypeSystemContext classicTypeSystemContext, TypeConstructorMarker receiver) {
            AbstractC16544l.m18094g(receiver, "$receiver");
            if (receiver instanceof TypeConstructor) {
                List<TypeParameterDescriptor> parameters = ((TypeConstructor) receiver).getParameters();
                AbstractC16544l.m18093f(parameters, "getParameters(...)");
                return parameters;
            }
            StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb2.append(receiver);
            sb2.append(", ");
            throw new IllegalArgumentException(AbstractC17792x.m19535r(AbstractC16526C.f51263a, receiver.getClass(), sb2).toString());
        }

        public static PrimitiveType getPrimitiveArrayType(ClassicTypeSystemContext classicTypeSystemContext, TypeConstructorMarker receiver) {
            AbstractC16544l.m18094g(receiver, "$receiver");
            if (receiver instanceof TypeConstructor) {
                ClassifierDescriptor classifierDescriptorMo22589getDeclarationDescriptor = ((TypeConstructor) receiver).mo22589getDeclarationDescriptor();
                AbstractC16544l.m18092e(classifierDescriptorMo22589getDeclarationDescriptor, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                return KotlinBuiltIns.getPrimitiveArrayType((ClassDescriptor) classifierDescriptorMo22589getDeclarationDescriptor);
            }
            StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb2.append(receiver);
            sb2.append(", ");
            throw new IllegalArgumentException(AbstractC17792x.m19535r(AbstractC16526C.f51263a, receiver.getClass(), sb2).toString());
        }

        public static PrimitiveType getPrimitiveType(ClassicTypeSystemContext classicTypeSystemContext, TypeConstructorMarker receiver) {
            AbstractC16544l.m18094g(receiver, "$receiver");
            if (receiver instanceof TypeConstructor) {
                ClassifierDescriptor classifierDescriptorMo22589getDeclarationDescriptor = ((TypeConstructor) receiver).mo22589getDeclarationDescriptor();
                AbstractC16544l.m18092e(classifierDescriptorMo22589getDeclarationDescriptor, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                return KotlinBuiltIns.getPrimitiveType((ClassDescriptor) classifierDescriptorMo22589getDeclarationDescriptor);
            }
            StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb2.append(receiver);
            sb2.append(", ");
            throw new IllegalArgumentException(AbstractC17792x.m19535r(AbstractC16526C.f51263a, receiver.getClass(), sb2).toString());
        }

        public static KotlinTypeMarker getRepresentativeUpperBound(ClassicTypeSystemContext classicTypeSystemContext, TypeParameterMarker receiver) {
            AbstractC16544l.m18094g(receiver, "$receiver");
            if (receiver instanceof TypeParameterDescriptor) {
                return TypeUtilsKt.getRepresentativeUpperBound((TypeParameterDescriptor) receiver);
            }
            StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb2.append(receiver);
            sb2.append(", ");
            throw new IllegalArgumentException(AbstractC17792x.m19535r(AbstractC16526C.f51263a, receiver.getClass(), sb2).toString());
        }

        public static KotlinTypeMarker getType(ClassicTypeSystemContext classicTypeSystemContext, TypeArgumentMarker receiver) {
            AbstractC16544l.m18094g(receiver, "$receiver");
            if (classicTypeSystemContext.isStarProjection(receiver)) {
                return null;
            }
            if (receiver instanceof TypeProjection) {
                return ((TypeProjection) receiver).getType().unwrap();
            }
            StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb2.append(receiver);
            sb2.append(", ");
            throw new IllegalArgumentException(AbstractC17792x.m19535r(AbstractC16526C.f51263a, receiver.getClass(), sb2).toString());
        }

        public static TypeParameterMarker getTypeParameter(ClassicTypeSystemContext classicTypeSystemContext, TypeVariableTypeConstructorMarker receiver) {
            AbstractC16544l.m18094g(receiver, "$receiver");
            if (receiver instanceof NewTypeVariableConstructor) {
                return ((NewTypeVariableConstructor) receiver).getOriginalTypeParameter();
            }
            StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb2.append(receiver);
            sb2.append(", ");
            throw new IllegalArgumentException(AbstractC17792x.m19535r(AbstractC16526C.f51263a, receiver.getClass(), sb2).toString());
        }

        public static TypeParameterMarker getTypeParameterClassifier(ClassicTypeSystemContext classicTypeSystemContext, TypeConstructorMarker receiver) {
            AbstractC16544l.m18094g(receiver, "$receiver");
            if (receiver instanceof TypeConstructor) {
                ClassifierDescriptor classifierDescriptorMo22589getDeclarationDescriptor = ((TypeConstructor) receiver).mo22589getDeclarationDescriptor();
                if (classifierDescriptorMo22589getDeclarationDescriptor instanceof TypeParameterDescriptor) {
                    return (TypeParameterDescriptor) classifierDescriptorMo22589getDeclarationDescriptor;
                }
                return null;
            }
            StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb2.append(receiver);
            sb2.append(", ");
            throw new IllegalArgumentException(AbstractC17792x.m19535r(AbstractC16526C.f51263a, receiver.getClass(), sb2).toString());
        }

        public static KotlinTypeMarker getUnsubstitutedUnderlyingType(ClassicTypeSystemContext classicTypeSystemContext, KotlinTypeMarker receiver) {
            AbstractC16544l.m18094g(receiver, "$receiver");
            if (receiver instanceof KotlinType) {
                return InlineClassesUtilsKt.unsubstitutedUnderlyingType((KotlinType) receiver);
            }
            StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb2.append(receiver);
            sb2.append(", ");
            throw new IllegalArgumentException(AbstractC17792x.m19535r(AbstractC16526C.f51263a, receiver.getClass(), sb2).toString());
        }

        public static List<KotlinTypeMarker> getUpperBounds(ClassicTypeSystemContext classicTypeSystemContext, TypeParameterMarker receiver) {
            AbstractC16544l.m18094g(receiver, "$receiver");
            if (receiver instanceof TypeParameterDescriptor) {
                List<KotlinType> upperBounds = ((TypeParameterDescriptor) receiver).getUpperBounds();
                AbstractC16544l.m18093f(upperBounds, "getUpperBounds(...)");
                return upperBounds;
            }
            StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb2.append(receiver);
            sb2.append(", ");
            throw new IllegalArgumentException(AbstractC17792x.m19535r(AbstractC16526C.f51263a, receiver.getClass(), sb2).toString());
        }

        public static TypeVariance getVariance(ClassicTypeSystemContext classicTypeSystemContext, TypeArgumentMarker receiver) {
            AbstractC16544l.m18094g(receiver, "$receiver");
            if (receiver instanceof TypeProjection) {
                Variance projectionKind = ((TypeProjection) receiver).getProjectionKind();
                AbstractC16544l.m18093f(projectionKind, "getProjectionKind(...)");
                return TypeSystemContextKt.convertVariance(projectionKind);
            }
            StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb2.append(receiver);
            sb2.append(", ");
            throw new IllegalArgumentException(AbstractC17792x.m19535r(AbstractC16526C.f51263a, receiver.getClass(), sb2).toString());
        }

        public static boolean hasAnnotation(ClassicTypeSystemContext classicTypeSystemContext, KotlinTypeMarker receiver, FqName fqName) {
            AbstractC16544l.m18094g(receiver, "$receiver");
            AbstractC16544l.m18094g(fqName, "fqName");
            if (receiver instanceof KotlinType) {
                return ((KotlinType) receiver).getAnnotations().hasAnnotation(fqName);
            }
            StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb2.append(receiver);
            sb2.append(", ");
            throw new IllegalArgumentException(AbstractC17792x.m19535r(AbstractC16526C.f51263a, receiver.getClass(), sb2).toString());
        }

        public static boolean hasRecursiveBounds(ClassicTypeSystemContext classicTypeSystemContext, TypeParameterMarker receiver, TypeConstructorMarker typeConstructorMarker) {
            AbstractC16544l.m18094g(receiver, "$receiver");
            if (!(receiver instanceof TypeParameterDescriptor)) {
                StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
                sb2.append(receiver);
                sb2.append(", ");
                throw new IllegalArgumentException(AbstractC17792x.m19535r(AbstractC16526C.f51263a, receiver.getClass(), sb2).toString());
            }
            TypeParameterDescriptor typeParameterDescriptor = (TypeParameterDescriptor) receiver;
            if (typeConstructorMarker == null ? true : typeConstructorMarker instanceof TypeConstructor) {
                return TypeUtilsKt.hasTypeParameterRecursiveBounds$default(typeParameterDescriptor, (TypeConstructor) typeConstructorMarker, null, 4, null);
            }
            StringBuilder sb3 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb3.append(typeParameterDescriptor);
            sb3.append(", ");
            throw new IllegalArgumentException(AbstractC17792x.m19535r(AbstractC16526C.f51263a, typeParameterDescriptor.getClass(), sb3).toString());
        }

        public static boolean identicalArguments(ClassicTypeSystemContext classicTypeSystemContext, RigidTypeMarker a10, RigidTypeMarker b) {
            AbstractC16544l.m18094g(a10, "a");
            AbstractC16544l.m18094g(b, "b");
            if (!(a10 instanceof SimpleType)) {
                StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
                sb2.append(a10);
                sb2.append(", ");
                throw new IllegalArgumentException(AbstractC17792x.m19535r(AbstractC16526C.f51263a, a10.getClass(), sb2).toString());
            }
            if (b instanceof SimpleType) {
                return ((SimpleType) a10).getArguments() == ((SimpleType) b).getArguments();
            }
            StringBuilder sb3 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb3.append(b);
            sb3.append(", ");
            throw new IllegalArgumentException(AbstractC17792x.m19535r(AbstractC16526C.f51263a, b.getClass(), sb3).toString());
        }

        public static KotlinTypeMarker intersectTypes(ClassicTypeSystemContext classicTypeSystemContext, Collection<? extends KotlinTypeMarker> types) {
            AbstractC16544l.m18094g(types, "types");
            return IntersectionTypeKt.intersectTypes(types);
        }

        public static boolean isAnyConstructor(ClassicTypeSystemContext classicTypeSystemContext, TypeConstructorMarker receiver) {
            AbstractC16544l.m18094g(receiver, "$receiver");
            if (receiver instanceof TypeConstructor) {
                return KotlinBuiltIns.isTypeConstructorForGivenClass((TypeConstructor) receiver, StandardNames.FqNames.any);
            }
            StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb2.append(receiver);
            sb2.append(", ");
            throw new IllegalArgumentException(AbstractC17792x.m19535r(AbstractC16526C.f51263a, receiver.getClass(), sb2).toString());
        }

        public static boolean isClassTypeConstructor(ClassicTypeSystemContext classicTypeSystemContext, TypeConstructorMarker receiver) {
            AbstractC16544l.m18094g(receiver, "$receiver");
            if (receiver instanceof TypeConstructor) {
                return ((TypeConstructor) receiver).mo22589getDeclarationDescriptor() instanceof ClassDescriptor;
            }
            StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb2.append(receiver);
            sb2.append(", ");
            throw new IllegalArgumentException(AbstractC17792x.m19535r(AbstractC16526C.f51263a, receiver.getClass(), sb2).toString());
        }

        public static boolean isCommonFinalClassConstructor(ClassicTypeSystemContext classicTypeSystemContext, TypeConstructorMarker receiver) {
            AbstractC16544l.m18094g(receiver, "$receiver");
            if (receiver instanceof TypeConstructor) {
                ClassifierDescriptor classifierDescriptorMo22589getDeclarationDescriptor = ((TypeConstructor) receiver).mo22589getDeclarationDescriptor();
                ClassDescriptor classDescriptor = classifierDescriptorMo22589getDeclarationDescriptor instanceof ClassDescriptor ? (ClassDescriptor) classifierDescriptorMo22589getDeclarationDescriptor : null;
                return (classDescriptor == null || !ModalityUtilsKt.isFinalClass(classDescriptor) || classDescriptor.getKind() == ClassKind.ENUM_ENTRY || classDescriptor.getKind() == ClassKind.ANNOTATION_CLASS) ? false : true;
            }
            StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb2.append(receiver);
            sb2.append(", ");
            throw new IllegalArgumentException(AbstractC17792x.m19535r(AbstractC16526C.f51263a, receiver.getClass(), sb2).toString());
        }

        public static boolean isDenotable(ClassicTypeSystemContext classicTypeSystemContext, TypeConstructorMarker receiver) {
            AbstractC16544l.m18094g(receiver, "$receiver");
            if (receiver instanceof TypeConstructor) {
                return ((TypeConstructor) receiver).isDenotable();
            }
            StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb2.append(receiver);
            sb2.append(", ");
            throw new IllegalArgumentException(AbstractC17792x.m19535r(AbstractC16526C.f51263a, receiver.getClass(), sb2).toString());
        }

        public static boolean isError(ClassicTypeSystemContext classicTypeSystemContext, KotlinTypeMarker receiver) {
            AbstractC16544l.m18094g(receiver, "$receiver");
            if (receiver instanceof KotlinType) {
                return KotlinTypeKt.isError((KotlinType) receiver);
            }
            StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb2.append(receiver);
            sb2.append(", ");
            throw new IllegalArgumentException(AbstractC17792x.m19535r(AbstractC16526C.f51263a, receiver.getClass(), sb2).toString());
        }

        public static boolean isInlineClass(ClassicTypeSystemContext classicTypeSystemContext, TypeConstructorMarker receiver) {
            AbstractC16544l.m18094g(receiver, "$receiver");
            if (receiver instanceof TypeConstructor) {
                ClassifierDescriptor classifierDescriptorMo22589getDeclarationDescriptor = ((TypeConstructor) receiver).mo22589getDeclarationDescriptor();
                ClassDescriptor classDescriptor = classifierDescriptorMo22589getDeclarationDescriptor instanceof ClassDescriptor ? (ClassDescriptor) classifierDescriptorMo22589getDeclarationDescriptor : null;
                return (classDescriptor != null ? classDescriptor.getValueClassRepresentation() : null) instanceof InlineClassRepresentation;
            }
            StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb2.append(receiver);
            sb2.append(", ");
            throw new IllegalArgumentException(AbstractC17792x.m19535r(AbstractC16526C.f51263a, receiver.getClass(), sb2).toString());
        }

        public static boolean isIntegerLiteralTypeConstructor(ClassicTypeSystemContext classicTypeSystemContext, TypeConstructorMarker receiver) {
            AbstractC16544l.m18094g(receiver, "$receiver");
            if (receiver instanceof TypeConstructor) {
                return receiver instanceof IntegerLiteralTypeConstructor;
            }
            StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb2.append(receiver);
            sb2.append(", ");
            throw new IllegalArgumentException(AbstractC17792x.m19535r(AbstractC16526C.f51263a, receiver.getClass(), sb2).toString());
        }

        public static boolean isIntersection(ClassicTypeSystemContext classicTypeSystemContext, TypeConstructorMarker receiver) {
            AbstractC16544l.m18094g(receiver, "$receiver");
            if (receiver instanceof TypeConstructor) {
                return receiver instanceof IntersectionTypeConstructor;
            }
            StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb2.append(receiver);
            sb2.append(", ");
            throw new IllegalArgumentException(AbstractC17792x.m19535r(AbstractC16526C.f51263a, receiver.getClass(), sb2).toString());
        }

        public static boolean isK2(ClassicTypeSystemContext classicTypeSystemContext) {
            return false;
        }

        public static boolean isMarkedNullable(ClassicTypeSystemContext classicTypeSystemContext, KotlinTypeMarker receiver) {
            AbstractC16544l.m18094g(receiver, "$receiver");
            return (receiver instanceof SimpleType) && ((SimpleType) receiver).isMarkedNullable();
        }

        public static boolean isNotNullTypeParameter(ClassicTypeSystemContext classicTypeSystemContext, KotlinTypeMarker receiver) {
            AbstractC16544l.m18094g(receiver, "$receiver");
            return receiver instanceof NotNullTypeParameter;
        }

        public static boolean isNullableType(ClassicTypeSystemContext classicTypeSystemContext, KotlinTypeMarker receiver) {
            AbstractC16544l.m18094g(receiver, "$receiver");
            if (receiver instanceof KotlinType) {
                return TypeUtils.isNullableType((KotlinType) receiver);
            }
            StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb2.append(receiver);
            sb2.append(", ");
            throw new IllegalArgumentException(AbstractC17792x.m19535r(AbstractC16526C.f51263a, receiver.getClass(), sb2).toString());
        }

        public static boolean isOldCapturedType(ClassicTypeSystemContext classicTypeSystemContext, CapturedTypeMarker receiver) {
            AbstractC16544l.m18094g(receiver, "$receiver");
            return receiver instanceof CapturedType;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean isPrimitiveType(ClassicTypeSystemContext classicTypeSystemContext, SimpleTypeMarker receiver) {
            AbstractC16544l.m18094g(receiver, "$receiver");
            if (receiver instanceof KotlinType) {
                return KotlinBuiltIns.isPrimitiveType((KotlinType) receiver);
            }
            StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb2.append(receiver);
            sb2.append(", ");
            throw new IllegalArgumentException(AbstractC17792x.m19535r(AbstractC16526C.f51263a, receiver.getClass(), sb2).toString());
        }

        public static boolean isRawType(ClassicTypeSystemContext classicTypeSystemContext, KotlinTypeMarker receiver) {
            AbstractC16544l.m18094g(receiver, "$receiver");
            if (receiver instanceof KotlinType) {
                return receiver instanceof RawType;
            }
            StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb2.append(receiver);
            sb2.append(", ");
            throw new IllegalArgumentException(AbstractC17792x.m19535r(AbstractC16526C.f51263a, receiver.getClass(), sb2).toString());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean isSingleClassifierType(ClassicTypeSystemContext classicTypeSystemContext, RigidTypeMarker receiver) {
            AbstractC16544l.m18094g(receiver, "$receiver");
            if (!(receiver instanceof SimpleType)) {
                StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
                sb2.append(receiver);
                sb2.append(", ");
                throw new IllegalArgumentException(AbstractC17792x.m19535r(AbstractC16526C.f51263a, receiver.getClass(), sb2).toString());
            }
            if (!KotlinTypeKt.isError((KotlinType) receiver)) {
                SimpleType simpleType = (SimpleType) receiver;
                if (!(simpleType.getConstructor().mo22589getDeclarationDescriptor() instanceof TypeAliasDescriptor)) {
                    if (simpleType.getConstructor().mo22589getDeclarationDescriptor() == null && !(receiver instanceof CapturedType) && !(receiver instanceof NewCapturedType) && !(receiver instanceof DefinitelyNotNullType) && !(simpleType.getConstructor() instanceof IntegerLiteralTypeConstructor)) {
                        SimpleTypeMarker simpleTypeMarker = (SimpleTypeMarker) receiver;
                        if (!(simpleTypeMarker instanceof SimpleTypeWithEnhancement) || !classicTypeSystemContext.isSingleClassifierType(((SimpleTypeWithEnhancement) simpleTypeMarker).getOrigin())) {
                        }
                    }
                    return true;
                }
            }
            return false;
        }

        public static boolean isStarProjection(ClassicTypeSystemContext classicTypeSystemContext, TypeArgumentMarker receiver) {
            AbstractC16544l.m18094g(receiver, "$receiver");
            if (receiver instanceof TypeProjection) {
                return ((TypeProjection) receiver).isStarProjection();
            }
            StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb2.append(receiver);
            sb2.append(", ");
            throw new IllegalArgumentException(AbstractC17792x.m19535r(AbstractC16526C.f51263a, receiver.getClass(), sb2).toString());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean isStubType(ClassicTypeSystemContext classicTypeSystemContext, RigidTypeMarker receiver) {
            AbstractC16544l.m18094g(receiver, "$receiver");
            if (receiver instanceof SimpleType) {
                return TypeUtilsKt.isStubType((KotlinType) receiver);
            }
            StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb2.append(receiver);
            sb2.append(", ");
            throw new IllegalArgumentException(AbstractC17792x.m19535r(AbstractC16526C.f51263a, receiver.getClass(), sb2).toString());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean isStubTypeForBuilderInference(ClassicTypeSystemContext classicTypeSystemContext, RigidTypeMarker receiver) {
            AbstractC16544l.m18094g(receiver, "$receiver");
            if (receiver instanceof SimpleType) {
                return TypeUtilsKt.isStubTypeForBuilderInference((KotlinType) receiver);
            }
            StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb2.append(receiver);
            sb2.append(", ");
            throw new IllegalArgumentException(AbstractC17792x.m19535r(AbstractC16526C.f51263a, receiver.getClass(), sb2).toString());
        }

        public static boolean isTypeVariableType(ClassicTypeSystemContext classicTypeSystemContext, KotlinTypeMarker receiver) {
            AbstractC16544l.m18094g(receiver, "$receiver");
            return (receiver instanceof UnwrappedType) && (((UnwrappedType) receiver).getConstructor() instanceof NewTypeVariableConstructor);
        }

        public static boolean isUnderKotlinPackage(ClassicTypeSystemContext classicTypeSystemContext, TypeConstructorMarker receiver) {
            AbstractC16544l.m18094g(receiver, "$receiver");
            if (receiver instanceof TypeConstructor) {
                ClassifierDescriptor classifierDescriptorMo22589getDeclarationDescriptor = ((TypeConstructor) receiver).mo22589getDeclarationDescriptor();
                return classifierDescriptorMo22589getDeclarationDescriptor != null && KotlinBuiltIns.isUnderKotlinPackage(classifierDescriptorMo22589getDeclarationDescriptor);
            }
            StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb2.append(receiver);
            sb2.append(", ");
            throw new IllegalArgumentException(AbstractC17792x.m19535r(AbstractC16526C.f51263a, receiver.getClass(), sb2).toString());
        }

        public static SimpleTypeMarker lowerBound(ClassicTypeSystemContext classicTypeSystemContext, FlexibleTypeMarker receiver) {
            AbstractC16544l.m18094g(receiver, "$receiver");
            if (receiver instanceof FlexibleType) {
                return ((FlexibleType) receiver).getLowerBound();
            }
            StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb2.append(receiver);
            sb2.append(", ");
            throw new IllegalArgumentException(AbstractC17792x.m19535r(AbstractC16526C.f51263a, receiver.getClass(), sb2).toString());
        }

        public static KotlinTypeMarker lowerType(ClassicTypeSystemContext classicTypeSystemContext, CapturedTypeMarker receiver) {
            AbstractC16544l.m18094g(receiver, "$receiver");
            if (receiver instanceof NewCapturedType) {
                return ((NewCapturedType) receiver).getLowerType();
            }
            StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb2.append(receiver);
            sb2.append(", ");
            throw new IllegalArgumentException(AbstractC17792x.m19535r(AbstractC16526C.f51263a, receiver.getClass(), sb2).toString());
        }

        public static KotlinTypeMarker makeDefinitelyNotNullOrNotNull(ClassicTypeSystemContext classicTypeSystemContext, KotlinTypeMarker receiver, boolean z6) {
            AbstractC16544l.m18094g(receiver, "$receiver");
            if (receiver instanceof UnwrappedType) {
                return SpecialTypesKt.makeDefinitelyNotNullOrNotNull$default((UnwrappedType) receiver, false, 1, null);
            }
            StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb2.append(receiver);
            sb2.append(", ");
            throw new IllegalArgumentException(AbstractC17792x.m19535r(AbstractC16526C.f51263a, receiver.getClass(), sb2).toString());
        }

        public static TypeCheckerState newTypeCheckerState(ClassicTypeSystemContext classicTypeSystemContext, boolean z6, boolean z10) {
            return ClassicTypeCheckerStateKt.createClassicTypeCheckerState$default(z6, z10, classicTypeSystemContext, null, null, 24, null);
        }

        public static SimpleTypeMarker original(ClassicTypeSystemContext classicTypeSystemContext, DefinitelyNotNullTypeMarker receiver) {
            AbstractC16544l.m18094g(receiver, "$receiver");
            if (receiver instanceof DefinitelyNotNullType) {
                return ((DefinitelyNotNullType) receiver).getOriginal();
            }
            StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb2.append(receiver);
            sb2.append(", ");
            throw new IllegalArgumentException(AbstractC17792x.m19535r(AbstractC16526C.f51263a, receiver.getClass(), sb2).toString());
        }

        public static int parametersCount(ClassicTypeSystemContext classicTypeSystemContext, TypeConstructorMarker receiver) {
            AbstractC16544l.m18094g(receiver, "$receiver");
            if (receiver instanceof TypeConstructor) {
                return ((TypeConstructor) receiver).getParameters().size();
            }
            StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb2.append(receiver);
            sb2.append(", ");
            throw new IllegalArgumentException(AbstractC17792x.m19535r(AbstractC16526C.f51263a, receiver.getClass(), sb2).toString());
        }

        public static Collection<KotlinTypeMarker> possibleIntegerTypes(ClassicTypeSystemContext classicTypeSystemContext, RigidTypeMarker receiver) {
            AbstractC16544l.m18094g(receiver, "$receiver");
            TypeConstructorMarker typeConstructorMarkerTypeConstructor = classicTypeSystemContext.typeConstructor(receiver);
            if (typeConstructorMarkerTypeConstructor instanceof IntegerLiteralTypeConstructor) {
                return ((IntegerLiteralTypeConstructor) typeConstructorMarkerTypeConstructor).getPossibleTypes();
            }
            StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb2.append(receiver);
            sb2.append(", ");
            throw new IllegalArgumentException(AbstractC17792x.m19535r(AbstractC16526C.f51263a, receiver.getClass(), sb2).toString());
        }

        public static TypeArgumentMarker projection(ClassicTypeSystemContext classicTypeSystemContext, CapturedTypeConstructorMarker receiver) {
            AbstractC16544l.m18094g(receiver, "$receiver");
            if (receiver instanceof NewCapturedTypeConstructor) {
                return ((NewCapturedTypeConstructor) receiver).getProjection();
            }
            StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb2.append(receiver);
            sb2.append(", ");
            throw new IllegalArgumentException(AbstractC17792x.m19535r(AbstractC16526C.f51263a, receiver.getClass(), sb2).toString());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static TypeCheckerState.SupertypesPolicy substitutionSupertypePolicy(final ClassicTypeSystemContext classicTypeSystemContext, RigidTypeMarker type) {
            AbstractC16544l.m18094g(type, "type");
            if (type instanceof SimpleType) {
                final TypeSubstitutor typeSubstitutorBuildSubstitutor = TypeConstructorSubstitution.Companion.create((KotlinType) type).buildSubstitutor();
                return new TypeCheckerState.SupertypesPolicy.DoCustomTransform() { // from class: kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext$substitutionSupertypePolicy$2
                    @Override // kotlin.reflect.jvm.internal.impl.types.TypeCheckerState.SupertypesPolicy
                    /* JADX INFO: renamed from: transformType */
                    public SimpleTypeMarker mo22591transformType(TypeCheckerState state, KotlinTypeMarker type2) {
                        AbstractC16544l.m18094g(state, "state");
                        AbstractC16544l.m18094g(type2, "type");
                        ClassicTypeSystemContext classicTypeSystemContext2 = classicTypeSystemContext;
                        Object objLowerBoundIfFlexible = classicTypeSystemContext2.lowerBoundIfFlexible(type2);
                        AbstractC16544l.m18092e(objLowerBoundIfFlexible, "null cannot be cast to non-null type org.jetbrains.kotlin.types.KotlinType");
                        Variance variance = Variance.INVARIANT;
                        KotlinType kotlinTypeSafeSubstitute = typeSubstitutorBuildSubstitutor.safeSubstitute((KotlinType) objLowerBoundIfFlexible, variance);
                        AbstractC16544l.m18093f(kotlinTypeSafeSubstitute, "safeSubstitute(...)");
                        SimpleTypeMarker simpleTypeMarkerAsRigidType = classicTypeSystemContext2.asRigidType((KotlinTypeMarker) kotlinTypeSafeSubstitute);
                        AbstractC16544l.m18091d(simpleTypeMarkerAsRigidType);
                        return simpleTypeMarkerAsRigidType;
                    }
                };
            }
            StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb2.append(type);
            sb2.append(", ");
            throw new IllegalArgumentException(AbstractC17792x.m19535r(AbstractC16526C.f51263a, type.getClass(), sb2).toString());
        }

        public static Collection<KotlinTypeMarker> supertypes(ClassicTypeSystemContext classicTypeSystemContext, TypeConstructorMarker receiver) {
            AbstractC16544l.m18094g(receiver, "$receiver");
            if (receiver instanceof TypeConstructor) {
                Collection<KotlinType> supertypes = ((TypeConstructor) receiver).getSupertypes();
                AbstractC16544l.m18093f(supertypes, "getSupertypes(...)");
                return supertypes;
            }
            StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb2.append(receiver);
            sb2.append(", ");
            throw new IllegalArgumentException(AbstractC17792x.m19535r(AbstractC16526C.f51263a, receiver.getClass(), sb2).toString());
        }

        public static TypeConstructorMarker typeConstructor(ClassicTypeSystemContext classicTypeSystemContext, RigidTypeMarker receiver) {
            AbstractC16544l.m18094g(receiver, "$receiver");
            if (receiver instanceof SimpleType) {
                return ((SimpleType) receiver).getConstructor();
            }
            StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb2.append(receiver);
            sb2.append(", ");
            throw new IllegalArgumentException(AbstractC17792x.m19535r(AbstractC16526C.f51263a, receiver.getClass(), sb2).toString());
        }

        public static SimpleTypeMarker upperBound(ClassicTypeSystemContext classicTypeSystemContext, FlexibleTypeMarker receiver) {
            AbstractC16544l.m18094g(receiver, "$receiver");
            if (receiver instanceof FlexibleType) {
                return ((FlexibleType) receiver).getUpperBound();
            }
            StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb2.append(receiver);
            sb2.append(", ");
            throw new IllegalArgumentException(AbstractC17792x.m19535r(AbstractC16526C.f51263a, receiver.getClass(), sb2).toString());
        }

        public static SimpleTypeMarker withNullability(ClassicTypeSystemContext classicTypeSystemContext, RigidTypeMarker receiver, boolean z6) {
            AbstractC16544l.m18094g(receiver, "$receiver");
            if (receiver instanceof SimpleType) {
                return ((SimpleType) receiver).makeNullableAsSpecified(z6);
            }
            StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb2.append(receiver);
            sb2.append(", ");
            throw new IllegalArgumentException(AbstractC17792x.m19535r(AbstractC16526C.f51263a, receiver.getClass(), sb2).toString());
        }

        public static boolean isNothingConstructor(ClassicTypeSystemContext classicTypeSystemContext, TypeConstructorMarker typeConstructorMarker) {
            AbstractC16544l.m18094g(typeConstructorMarker, TVCuK.JWIGLe);
            if (typeConstructorMarker instanceof TypeConstructor) {
                return KotlinBuiltIns.isTypeConstructorForGivenClass((TypeConstructor) typeConstructorMarker, StandardNames.FqNames.nothing);
            }
            StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb2.append(typeConstructorMarker);
            sb2.append(", ");
            throw new IllegalArgumentException(AbstractC17792x.m19535r(AbstractC16526C.f51263a, typeConstructorMarker.getClass(), sb2).toString());
        }

        public static boolean isProjectionNotNull(ClassicTypeSystemContext classicTypeSystemContext, CapturedTypeMarker capturedTypeMarker) {
            AbstractC16544l.m18094g(capturedTypeMarker, TfazcFv.LmeKKVnpO);
            if (capturedTypeMarker instanceof NewCapturedType) {
                return ((NewCapturedType) capturedTypeMarker).isProjectionNotNull();
            }
            StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb2.append(capturedTypeMarker);
            sb2.append(", ");
            throw new IllegalArgumentException(AbstractC17792x.m19535r(AbstractC16526C.f51263a, capturedTypeMarker.getClass(), sb2).toString());
        }

        public static TypeVariance getVariance(ClassicTypeSystemContext classicTypeSystemContext, TypeParameterMarker receiver) {
            AbstractC16544l.m18094g(receiver, "$receiver");
            if (receiver instanceof TypeParameterDescriptor) {
                Variance variance = ((TypeParameterDescriptor) receiver).getVariance();
                AbstractC16544l.m18093f(variance, "getVariance(...)");
                return TypeSystemContextKt.convertVariance(variance);
            }
            StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb2.append(receiver);
            sb2.append(", ");
            throw new IllegalArgumentException(AbstractC17792x.m19535r(AbstractC16526C.f51263a, receiver.getClass(), sb2).toString());
        }

        public static CapturedTypeConstructorMarker typeConstructor(ClassicTypeSystemContext classicTypeSystemContext, CapturedTypeMarker receiver) {
            AbstractC16544l.m18094g(receiver, "$receiver");
            if (receiver instanceof NewCapturedType) {
                return ((NewCapturedType) receiver).getConstructor();
            }
            StringBuilder sb2 = new StringBuilder(zakks.FZDGcyxwqeQ);
            sb2.append(receiver);
            sb2.append(", ");
            throw new IllegalArgumentException(AbstractC17792x.m19535r(AbstractC16526C.f51263a, receiver.getClass(), sb2).toString());
        }

        public static KotlinTypeMarker withNullability(ClassicTypeSystemContext classicTypeSystemContext, KotlinTypeMarker receiver, boolean z6) {
            AbstractC16544l.m18094g(receiver, "$receiver");
            if (receiver instanceof RigidTypeMarker) {
                return classicTypeSystemContext.withNullability((RigidTypeMarker) receiver, z6);
            }
            if (!(receiver instanceof FlexibleTypeMarker)) {
                throw new IllegalStateException("sealed");
            }
            FlexibleTypeMarker flexibleTypeMarker = (FlexibleTypeMarker) receiver;
            return classicTypeSystemContext.createFlexibleType(classicTypeSystemContext.withNullability((RigidTypeMarker) classicTypeSystemContext.lowerBound(flexibleTypeMarker), z6), classicTypeSystemContext.withNullability((RigidTypeMarker) classicTypeSystemContext.upperBound(flexibleTypeMarker), z6));
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    CapturedTypeMarker asCapturedType(SimpleTypeMarker simpleTypeMarker);

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    SimpleTypeMarker asRigidType(KotlinTypeMarker kotlinTypeMarker);

    KotlinTypeMarker createFlexibleType(RigidTypeMarker rigidTypeMarker, RigidTypeMarker rigidTypeMarker2);

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    boolean isSingleClassifierType(RigidTypeMarker rigidTypeMarker);

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    boolean isStarProjection(TypeArgumentMarker typeArgumentMarker);

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    SimpleTypeMarker lowerBound(FlexibleTypeMarker flexibleTypeMarker);

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    TypeConstructorMarker typeConstructor(RigidTypeMarker rigidTypeMarker);

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    SimpleTypeMarker upperBound(FlexibleTypeMarker flexibleTypeMarker);

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    SimpleTypeMarker withNullability(RigidTypeMarker rigidTypeMarker, boolean z6);
}
