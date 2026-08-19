package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.C16553u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.name.SpecialNames;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorFactory;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ImplicitContextReceiver;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ReceiverValue;
import kotlin.reflect.jvm.internal.impl.storage.NullableLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.FlexibleTypesKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.SpecialTypesKt;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import p298Lm.C5150L;
import p909nm.AbstractC17681o;
import p909nm.AbstractC17682p;
import p909nm.C17689w;

/* JADX INFO: loaded from: classes2.dex */
public final class TypeAliasConstructorDescriptorImpl extends FunctionDescriptorImpl implements TypeAliasConstructorDescriptor {
    public static final Companion Companion;

    /* JADX INFO: renamed from: Q0 */
    public final StorageManager f51638Q0;

    /* JADX INFO: renamed from: R0 */
    public final TypeAliasDescriptor f51639R0;

    /* JADX INFO: renamed from: S0 */
    public final NullableLazyValue f51640S0;

    /* JADX INFO: renamed from: T0 */
    public ClassConstructorDescriptor f51641T0;

    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public static final TypeSubstitutor access$getTypeSubstitutorForUnderlyingClass(Companion companion, TypeAliasDescriptor typeAliasDescriptor) {
            companion.getClass();
            if (typeAliasDescriptor.getClassDescriptor() == null) {
                return null;
            }
            return TypeSubstitutor.create(typeAliasDescriptor.getExpandedType());
        }

        public final TypeAliasConstructorDescriptor createIfAvailable(StorageManager storageManager, TypeAliasDescriptor typeAliasDescriptor, ClassConstructorDescriptor constructor) {
            ClassConstructorDescriptor classConstructorDescriptorSubstitute;
            List<ReceiverParameterDescriptor> list;
            AbstractC16544l.m18094g(storageManager, "storageManager");
            AbstractC16544l.m18094g(typeAliasDescriptor, "typeAliasDescriptor");
            AbstractC16544l.m18094g(constructor, "constructor");
            TypeSubstitutor typeSubstitutorCreate = typeAliasDescriptor.getClassDescriptor() == null ? null : TypeSubstitutor.create(typeAliasDescriptor.getExpandedType());
            if (typeSubstitutorCreate == null || (classConstructorDescriptorSubstitute = constructor.substitute(typeSubstitutorCreate)) == null) {
                return null;
            }
            Annotations annotations = constructor.getAnnotations();
            CallableMemberDescriptor.Kind kind = constructor.getKind();
            AbstractC16544l.m18093f(kind, "getKind(...)");
            SourceElement source = typeAliasDescriptor.getSource();
            AbstractC16544l.m18093f(source, "getSource(...)");
            TypeAliasConstructorDescriptorImpl typeAliasConstructorDescriptorImpl = new TypeAliasConstructorDescriptorImpl(storageManager, typeAliasDescriptor, classConstructorDescriptorSubstitute, null, annotations, kind, source, null);
            List<ValueParameterDescriptor> substitutedValueParameters = FunctionDescriptorImpl.getSubstitutedValueParameters(typeAliasConstructorDescriptorImpl, constructor.getValueParameters(), typeSubstitutorCreate);
            if (substitutedValueParameters == null) {
                return null;
            }
            SimpleType simpleTypeLowerIfFlexible = FlexibleTypesKt.lowerIfFlexible(classConstructorDescriptorSubstitute.getReturnType().unwrap());
            SimpleType defaultType = typeAliasDescriptor.getDefaultType();
            AbstractC16544l.m18093f(defaultType, "getDefaultType(...)");
            SimpleType simpleTypeWithAbbreviation = SpecialTypesKt.withAbbreviation(simpleTypeLowerIfFlexible, defaultType);
            ReceiverParameterDescriptor dispatchReceiverParameter = constructor.getDispatchReceiverParameter();
            ReceiverParameterDescriptor receiverParameterDescriptorCreateExtensionReceiverParameterForCallable = dispatchReceiverParameter != null ? DescriptorFactory.createExtensionReceiverParameterForCallable(typeAliasConstructorDescriptorImpl, typeSubstitutorCreate.safeSubstitute(dispatchReceiverParameter.getType(), Variance.INVARIANT), Annotations.Companion.getEMPTY()) : null;
            ClassDescriptor classDescriptor = typeAliasDescriptor.getClassDescriptor();
            if (classDescriptor != null) {
                List<ReceiverParameterDescriptor> contextReceiverParameters = constructor.getContextReceiverParameters();
                AbstractC16544l.m18093f(contextReceiverParameters, "getContextReceiverParameters(...)");
                List<ReceiverParameterDescriptor> list2 = contextReceiverParameters;
                ArrayList arrayList = new ArrayList(AbstractC17682p.m19389r(list2, 10));
                int i10 = 0;
                for (Object obj : list2) {
                    int i11 = i10 + 1;
                    if (i10 < 0) {
                        AbstractC17681o.m19388q();
                        throw null;
                    }
                    ReceiverParameterDescriptor receiverParameterDescriptor = (ReceiverParameterDescriptor) obj;
                    KotlinType kotlinTypeSafeSubstitute = typeSubstitutorCreate.safeSubstitute(receiverParameterDescriptor.getType(), Variance.INVARIANT);
                    ReceiverValue value = receiverParameterDescriptor.getValue();
                    AbstractC16544l.m18092e(value, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.scopes.receivers.ImplicitContextReceiver");
                    arrayList.add(DescriptorFactory.createContextReceiverParameterForClass(classDescriptor, kotlinTypeSafeSubstitute, ((ImplicitContextReceiver) value).getCustomLabelName(), Annotations.Companion.getEMPTY(), i10));
                    i10 = i11;
                }
                list = arrayList;
            } else {
                list = C17689w.f56480Y;
            }
            typeAliasConstructorDescriptorImpl.initialize(receiverParameterDescriptorCreateExtensionReceiverParameterForCallable, null, list, typeAliasDescriptor.getDeclaredTypeParameters(), substitutedValueParameters, simpleTypeWithAbbreviation, Modality.FINAL, typeAliasDescriptor.getVisibility());
            return typeAliasConstructorDescriptorImpl;
        }
    }

    static {
        AbstractC16526C.f51263a.mo5699h(new C16553u(TypeAliasConstructorDescriptorImpl.class, "withDispatchReceiver", "getWithDispatchReceiver()Lorg/jetbrains/kotlin/descriptors/impl/TypeAliasConstructorDescriptor;", 0));
        Companion = new Companion(null);
    }

    public /* synthetic */ TypeAliasConstructorDescriptorImpl(StorageManager storageManager, TypeAliasDescriptor typeAliasDescriptor, ClassConstructorDescriptor classConstructorDescriptor, TypeAliasConstructorDescriptor typeAliasConstructorDescriptor, Annotations annotations, CallableMemberDescriptor.Kind kind, SourceElement sourceElement, DefaultConstructorMarker defaultConstructorMarker) {
        this(storageManager, typeAliasDescriptor, classConstructorDescriptor, typeAliasConstructorDescriptor, annotations, kind, sourceElement);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl
    public FunctionDescriptorImpl createSubstitutedCopy(DeclarationDescriptor newOwner, FunctionDescriptor functionDescriptor, CallableMemberDescriptor.Kind kind, Name name, Annotations annotations, SourceElement source) {
        AbstractC16544l.m18094g(newOwner, "newOwner");
        AbstractC16544l.m18094g(kind, "kind");
        AbstractC16544l.m18094g(annotations, "annotations");
        AbstractC16544l.m18094g(source, "source");
        CallableMemberDescriptor.Kind kind2 = CallableMemberDescriptor.Kind.DECLARATION;
        if (kind != kind2) {
            CallableMemberDescriptor.Kind kind3 = CallableMemberDescriptor.Kind.SYNTHESIZED;
        }
        return new TypeAliasConstructorDescriptorImpl(this.f51638Q0, getTypeAliasDescriptor(), getUnderlyingConstructorDescriptor(), this, annotations, kind2, source);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor
    public ClassDescriptor getConstructedClass() {
        ClassDescriptor constructedClass = getUnderlyingConstructorDescriptor().getConstructedClass();
        AbstractC16544l.m18093f(constructedClass, "getConstructedClass(...)");
        return constructedClass;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    public KotlinType getReturnType() {
        KotlinType returnType = super.getReturnType();
        AbstractC16544l.m18091d(returnType);
        return returnType;
    }

    public TypeAliasDescriptor getTypeAliasDescriptor() {
        return this.f51639R0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.TypeAliasConstructorDescriptor
    public ClassConstructorDescriptor getUnderlyingConstructorDescriptor() {
        return this.f51641T0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor
    public boolean isPrimary() {
        return getUnderlyingConstructorDescriptor().isPrimary();
    }

    public TypeAliasConstructorDescriptorImpl(StorageManager storageManager, TypeAliasDescriptor typeAliasDescriptor, ClassConstructorDescriptor classConstructorDescriptor, TypeAliasConstructorDescriptor typeAliasConstructorDescriptor, Annotations annotations, CallableMemberDescriptor.Kind kind, SourceElement sourceElement) {
        super(typeAliasDescriptor, typeAliasConstructorDescriptor, kind, SpecialNames.INIT, annotations, sourceElement);
        this.f51638Q0 = storageManager;
        this.f51639R0 = typeAliasDescriptor;
        setActual(getTypeAliasDescriptor().isActual());
        this.f51640S0 = storageManager.createNullableLazyValue(new C5150L(this, 9, classConstructorDescriptor));
        this.f51641T0 = classConstructorDescriptor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    public TypeAliasConstructorDescriptor copy(DeclarationDescriptor newOwner, Modality modality, DescriptorVisibility visibility, CallableMemberDescriptor.Kind kind, boolean z6) {
        AbstractC16544l.m18094g(newOwner, "newOwner");
        AbstractC16544l.m18094g(modality, "modality");
        AbstractC16544l.m18094g(visibility, "visibility");
        AbstractC16544l.m18094g(kind, "kind");
        FunctionDescriptor functionDescriptorBuild = newCopyBuilder().setOwner(newOwner).setModality(modality).setVisibility(visibility).setKind(kind).setCopyOverrides(z6).build();
        AbstractC16544l.m18092e(functionDescriptorBuild, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.impl.TypeAliasConstructorDescriptor");
        return (TypeAliasConstructorDescriptor) functionDescriptorBuild;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorNonRootImpl, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public TypeAliasDescriptor getContainingDeclaration() {
        return getTypeAliasDescriptor();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.Substitutable
    public TypeAliasConstructorDescriptor substitute(TypeSubstitutor substitutor) {
        AbstractC16544l.m18094g(substitutor, "substitutor");
        FunctionDescriptor functionDescriptorSubstitute = super.substitute(substitutor);
        AbstractC16544l.m18092e(functionDescriptorSubstitute, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.impl.TypeAliasConstructorDescriptorImpl");
        TypeAliasConstructorDescriptorImpl typeAliasConstructorDescriptorImpl = (TypeAliasConstructorDescriptorImpl) functionDescriptorSubstitute;
        TypeSubstitutor typeSubstitutorCreate = TypeSubstitutor.create(typeAliasConstructorDescriptorImpl.getReturnType());
        AbstractC16544l.m18093f(typeSubstitutorCreate, "create(...)");
        ClassConstructorDescriptor classConstructorDescriptorSubstitute = getUnderlyingConstructorDescriptor().getOriginal().substitute(typeSubstitutorCreate);
        if (classConstructorDescriptorSubstitute == null) {
            return null;
        }
        typeAliasConstructorDescriptorImpl.f51641T0 = classConstructorDescriptorSubstitute;
        return typeAliasConstructorDescriptorImpl;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorNonRootImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public TypeAliasConstructorDescriptor getOriginal() {
        FunctionDescriptor original = super.getOriginal();
        AbstractC16544l.m18092e(original, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.impl.TypeAliasConstructorDescriptor");
        return (TypeAliasConstructorDescriptor) original;
    }
}
