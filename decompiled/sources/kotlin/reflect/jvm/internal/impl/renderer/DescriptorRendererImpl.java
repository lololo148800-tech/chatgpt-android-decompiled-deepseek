package kotlin.reflect.jvm.internal.impl.renderer;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.builtins.FunctionTypesKt;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters;
import kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithSource;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.FieldDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageViewDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PossiblyInnerType;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyGetterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertySetterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterUtilsKt;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.name.SpecialNames;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.resolve.constants.AnnotationValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ArrayValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.KClassValue;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.AbbreviatedType;
import kotlin.reflect.jvm.internal.impl.types.DefinitelyNotNullType;
import kotlin.reflect.jvm.internal.impl.types.FlexibleType;
import kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.SpecialTypesKt;
import kotlin.reflect.jvm.internal.impl.types.StubTypeForBuilderInference;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import kotlin.reflect.jvm.internal.impl.types.WrappedType;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorType;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import kotlin.reflect.jvm.internal.impl.util.capitalizeDecapitalize.CapitalizeDecapitalizeKt;
import mm.C17314q;
import p025An.C0644w;
import p049Bm.InterfaceC1436k;
import p1113xn.AbstractC21322p;
import p1113xn.AbstractC21329w;
import p298Lm.C5140G;
import p523V9.AbstractC7966P5;
import p571X9.AbstractC9227W;
import p571X9.AbstractC9306j0;
import p571X9.AbstractC9393x3;
import p588Y2.C9642z;
import p755fn.C13700a;
import p755fn.C13701b;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17681o;
import p909nm.AbstractC17682p;
import p909nm.C17689w;

/* JADX INFO: loaded from: classes2.dex */
public final class DescriptorRendererImpl extends DescriptorRenderer implements DescriptorRendererOptions {

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ int f52783c = 0;

    /* JADX INFO: renamed from: a */
    public final DescriptorRendererOptionsImpl f52784a;

    /* JADX INFO: renamed from: b */
    public final C17314q f52785b;

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[RenderingFormat.values().length];
            try {
                iArr[RenderingFormat.PLAIN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RenderingFormat.HTML.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ParameterNameRenderingPolicy.values().length];
            try {
                iArr2[ParameterNameRenderingPolicy.ALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[ParameterNameRenderingPolicy.ONLY_NON_SYNTHESIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[ParameterNameRenderingPolicy.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public DescriptorRendererImpl(DescriptorRendererOptionsImpl options) {
        AbstractC16544l.m18094g(options, "options");
        this.f52784a = options;
        options.isLocked();
        this.f52785b = AbstractC9227W.m9800c(new C5140G(this, 19));
    }

    /* JADX INFO: renamed from: E */
    public static boolean m18307E(KotlinType kotlinType) {
        if (FunctionTypesKt.isBuiltinFunctionalType(kotlinType)) {
            List<TypeProjection> arguments = kotlinType.getArguments();
            if (!(arguments instanceof Collection) || !arguments.isEmpty()) {
                Iterator<T> it = arguments.iterator();
                while (it.hasNext()) {
                    if (((TypeProjection) it.next()).isStarProjection()) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    public static final void access$renderClass(DescriptorRendererImpl descriptorRendererImpl, ClassDescriptor classDescriptor, StringBuilder sb2) {
        ClassConstructorDescriptor classConstructorDescriptorMo22584getUnsubstitutedPrimaryConstructor;
        descriptorRendererImpl.getClass();
        boolean z6 = classDescriptor.getKind() == ClassKind.ENUM_ENTRY;
        if (!descriptorRendererImpl.getStartFromName()) {
            List<ReceiverParameterDescriptor> contextReceivers = classDescriptor.getContextReceivers();
            AbstractC16544l.m18093f(contextReceivers, "getContextReceivers(...)");
            descriptorRendererImpl.m18318f(sb2, contextReceivers);
            descriptorRendererImpl.m18315c(sb2, classDescriptor, null);
            if (!z6) {
                DescriptorVisibility visibility = classDescriptor.getVisibility();
                AbstractC16544l.m18093f(visibility, "getVisibility(...)");
                descriptorRendererImpl.m18312C(visibility, sb2);
            }
            if ((classDescriptor.getKind() != ClassKind.INTERFACE || classDescriptor.getModality() != Modality.ABSTRACT) && (!classDescriptor.getKind().isSingleton() || classDescriptor.getModality() != Modality.FINAL)) {
                Modality modality = classDescriptor.getModality();
                AbstractC16544l.m18093f(modality, "getModality(...)");
                Modality modalityM18308b = m18308b(classDescriptor);
                if (descriptorRendererImpl.getRenderDefaultModality() || modality != modalityM18308b) {
                    descriptorRendererImpl.m18326n(sb2, descriptorRendererImpl.getModifiers().contains(DescriptorRendererModifier.MODALITY), CapitalizeDecapitalizeKt.toLowerCaseAsciiOnly(modality.name()));
                }
            }
            descriptorRendererImpl.m18324l(classDescriptor, sb2);
            descriptorRendererImpl.m18326n(sb2, descriptorRendererImpl.getModifiers().contains(DescriptorRendererModifier.INNER) && classDescriptor.isInner(), "inner");
            descriptorRendererImpl.m18326n(sb2, descriptorRendererImpl.getModifiers().contains(DescriptorRendererModifier.DATA) && classDescriptor.isData(), "data");
            descriptorRendererImpl.m18326n(sb2, descriptorRendererImpl.getModifiers().contains(DescriptorRendererModifier.INLINE) && classDescriptor.isInline(), "inline");
            descriptorRendererImpl.m18326n(sb2, descriptorRendererImpl.getModifiers().contains(DescriptorRendererModifier.VALUE) && classDescriptor.isValue(), "value");
            descriptorRendererImpl.m18326n(sb2, descriptorRendererImpl.getModifiers().contains(DescriptorRendererModifier.FUN) && classDescriptor.isFun(), "fun");
            sb2.append(descriptorRendererImpl.m18322j(DescriptorRenderer.Companion.getClassifierKindPrefix(classDescriptor)));
        }
        if (DescriptorUtils.isCompanionObject(classDescriptor)) {
            if (descriptorRendererImpl.getRenderCompanionObjectName()) {
                if (descriptorRendererImpl.getStartFromName()) {
                    sb2.append("companion object");
                }
                m18309v(sb2);
                DeclarationDescriptor containingDeclaration = classDescriptor.getContainingDeclaration();
                if (containingDeclaration != null) {
                    sb2.append("of ");
                    Name name = containingDeclaration.getName();
                    AbstractC16544l.m18093f(name, "getName(...)");
                    sb2.append(descriptorRendererImpl.renderName(name, false));
                }
            }
            if (descriptorRendererImpl.getVerbose() || !AbstractC16544l.m18089b(classDescriptor.getName(), SpecialNames.DEFAULT_NAME_FOR_COMPANION_OBJECT)) {
                if (!descriptorRendererImpl.getStartFromName()) {
                    m18309v(sb2);
                }
                Name name2 = classDescriptor.getName();
                AbstractC16544l.m18093f(name2, "getName(...)");
                sb2.append(descriptorRendererImpl.renderName(name2, true));
            }
        } else {
            if (!descriptorRendererImpl.getStartFromName()) {
                m18309v(sb2);
            }
            descriptorRendererImpl.m18327o(classDescriptor, sb2, true);
        }
        if (z6) {
            return;
        }
        List<TypeParameterDescriptor> declaredTypeParameters = classDescriptor.getDeclaredTypeParameters();
        AbstractC16544l.m18093f(declaredTypeParameters, "getDeclaredTypeParameters(...)");
        descriptorRendererImpl.m18336y(declaredTypeParameters, sb2, false);
        descriptorRendererImpl.m18316d(classDescriptor, sb2);
        if (!classDescriptor.getKind().isSingleton() && descriptorRendererImpl.getClassWithPrimaryConstructor() && (classConstructorDescriptorMo22584getUnsubstitutedPrimaryConstructor = classDescriptor.mo22584getUnsubstitutedPrimaryConstructor()) != null) {
            sb2.append(Separators.f31991SP);
            descriptorRendererImpl.m18315c(sb2, classConstructorDescriptorMo22584getUnsubstitutedPrimaryConstructor, null);
            DescriptorVisibility visibility2 = classConstructorDescriptorMo22584getUnsubstitutedPrimaryConstructor.getVisibility();
            AbstractC16544l.m18093f(visibility2, "getVisibility(...)");
            descriptorRendererImpl.m18312C(visibility2, sb2);
            sb2.append(descriptorRendererImpl.m18322j("constructor"));
            List<ValueParameterDescriptor> valueParameters = classConstructorDescriptorMo22584getUnsubstitutedPrimaryConstructor.getValueParameters();
            AbstractC16544l.m18093f(valueParameters, "getValueParameters(...)");
            descriptorRendererImpl.m18311B(valueParameters, classConstructorDescriptorMo22584getUnsubstitutedPrimaryConstructor.hasSynthesizedParameterNames(), sb2);
        }
        if (!descriptorRendererImpl.getWithoutSuperTypes() && !KotlinBuiltIns.isNothing(classDescriptor.getDefaultType())) {
            Collection<KotlinType> supertypes = classDescriptor.getTypeConstructor().getSupertypes();
            AbstractC16544l.m18093f(supertypes, "getSupertypes(...)");
            if (!supertypes.isEmpty() && (supertypes.size() != 1 || !KotlinBuiltIns.isAnyOrNullableAny(supertypes.iterator().next()))) {
                m18309v(sb2);
                sb2.append(": ");
                AbstractC17680n.m19347W(supertypes, sb2, ", ", (124 & 4) != 0 ? "" : null, (124 & 8) != 0 ? "" : null, -1, "...", (124 & 64) != 0 ? null : new C13701b(descriptorRendererImpl, 1));
            }
        }
        descriptorRendererImpl.m18313D(sb2, declaredTypeParameters);
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0034  */
    public static final void access$renderConstructor(DescriptorRendererImpl descriptorRendererImpl, ConstructorDescriptor constructorDescriptor, StringBuilder sb2) {
        boolean z6;
        ClassConstructorDescriptor classConstructorDescriptorMo22584getUnsubstitutedPrimaryConstructor;
        descriptorRendererImpl.getClass();
        descriptorRendererImpl.m18315c(sb2, constructorDescriptor, null);
        if (descriptorRendererImpl.f52784a.getRenderDefaultVisibility() || constructorDescriptor.getConstructedClass().getModality() != Modality.SEALED) {
            DescriptorVisibility visibility = constructorDescriptor.getVisibility();
            AbstractC16544l.m18093f(visibility, "getVisibility(...)");
            if (descriptorRendererImpl.m18312C(visibility, sb2)) {
                z6 = true;
            } else {
                z6 = false;
            }
        } else {
            z6 = false;
        }
        descriptorRendererImpl.m18323k(sb2, constructorDescriptor);
        boolean z10 = descriptorRendererImpl.getRenderConstructorKeyword() || !constructorDescriptor.isPrimary() || z6;
        if (z10) {
            sb2.append(descriptorRendererImpl.m18322j("constructor"));
        }
        ClassifierDescriptorWithTypeParameters containingDeclaration = constructorDescriptor.getContainingDeclaration();
        AbstractC16544l.m18093f(containingDeclaration, "getContainingDeclaration(...)");
        if (descriptorRendererImpl.getSecondaryConstructorsAsPrimary()) {
            if (z10) {
                sb2.append(Separators.f31991SP);
            }
            descriptorRendererImpl.m18327o(containingDeclaration, sb2, true);
            List<TypeParameterDescriptor> typeParameters = constructorDescriptor.getTypeParameters();
            AbstractC16544l.m18093f(typeParameters, "getTypeParameters(...)");
            descriptorRendererImpl.m18336y(typeParameters, sb2, false);
        }
        List<ValueParameterDescriptor> valueParameters = constructorDescriptor.getValueParameters();
        AbstractC16544l.m18093f(valueParameters, "getValueParameters(...)");
        descriptorRendererImpl.m18311B(valueParameters, constructorDescriptor.hasSynthesizedParameterNames(), sb2);
        if (descriptorRendererImpl.getRenderConstructorDelegation() && !constructorDescriptor.isPrimary() && (containingDeclaration instanceof ClassDescriptor) && (classConstructorDescriptorMo22584getUnsubstitutedPrimaryConstructor = ((ClassDescriptor) containingDeclaration).mo22584getUnsubstitutedPrimaryConstructor()) != null) {
            List<ValueParameterDescriptor> valueParameters2 = classConstructorDescriptorMo22584getUnsubstitutedPrimaryConstructor.getValueParameters();
            AbstractC16544l.m18093f(valueParameters2, "getValueParameters(...)");
            ArrayList arrayList = new ArrayList();
            for (Object obj : valueParameters2) {
                ValueParameterDescriptor valueParameterDescriptor = (ValueParameterDescriptor) obj;
                if (!valueParameterDescriptor.declaresDefaultValue() && valueParameterDescriptor.getVarargElementType() == null) {
                    arrayList.add(obj);
                }
            }
            if (!arrayList.isEmpty()) {
                sb2.append(" : ");
                sb2.append(descriptorRendererImpl.m18322j("this"));
                sb2.append(AbstractC17680n.m19349Y(arrayList, ", ", Separators.LPAREN, Separators.RPAREN, 0, null, C13700a.f43244z0, 24));
            }
        }
        if (descriptorRendererImpl.getSecondaryConstructorsAsPrimary()) {
            List<TypeParameterDescriptor> typeParameters2 = constructorDescriptor.getTypeParameters();
            AbstractC16544l.m18093f(typeParameters2, "getTypeParameters(...)");
            descriptorRendererImpl.m18313D(sb2, typeParameters2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x007c  */
    public static final void access$renderFunction(DescriptorRendererImpl descriptorRendererImpl, FunctionDescriptor functionDescriptor, StringBuilder sb2) {
        boolean z6;
        if (!descriptorRendererImpl.getStartFromName()) {
            if (!descriptorRendererImpl.getStartFromDeclarationKeyword()) {
                List<ReceiverParameterDescriptor> contextReceiverParameters = functionDescriptor.getContextReceiverParameters();
                AbstractC16544l.m18093f(contextReceiverParameters, "getContextReceiverParameters(...)");
                descriptorRendererImpl.m18318f(sb2, contextReceiverParameters);
                descriptorRendererImpl.m18315c(sb2, functionDescriptor, null);
                DescriptorVisibility visibility = functionDescriptor.getVisibility();
                AbstractC16544l.m18093f(visibility, "getVisibility(...)");
                descriptorRendererImpl.m18312C(visibility, sb2);
                descriptorRendererImpl.m18325m(sb2, functionDescriptor);
                if (descriptorRendererImpl.getIncludeAdditionalModifiers()) {
                    descriptorRendererImpl.m18324l(functionDescriptor, sb2);
                }
                descriptorRendererImpl.m18330r(sb2, functionDescriptor);
                if (descriptorRendererImpl.getIncludeAdditionalModifiers()) {
                    boolean z10 = false;
                    if (functionDescriptor.isOperator()) {
                        Collection<? extends FunctionDescriptor> overriddenDescriptors = functionDescriptor.getOverriddenDescriptors();
                        AbstractC16544l.m18093f(overriddenDescriptors, "getOverriddenDescriptors(...)");
                        Collection<? extends FunctionDescriptor> collection = overriddenDescriptors;
                        if (!collection.isEmpty()) {
                            Iterator<T> it = collection.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    if (((FunctionDescriptor) it.next()).isOperator()) {
                                        if (!descriptorRendererImpl.getAlwaysRenderModifiers()) {
                                            z6 = false;
                                        }
                                    }
                                }
                            }
                        }
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    if (functionDescriptor.isInfix()) {
                        Collection<? extends FunctionDescriptor> overriddenDescriptors2 = functionDescriptor.getOverriddenDescriptors();
                        AbstractC16544l.m18093f(overriddenDescriptors2, "getOverriddenDescriptors(...)");
                        Collection<? extends FunctionDescriptor> collection2 = overriddenDescriptors2;
                        if (!collection2.isEmpty()) {
                            Iterator<T> it2 = collection2.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    if (((FunctionDescriptor) it2.next()).isInfix()) {
                                        if (!descriptorRendererImpl.getAlwaysRenderModifiers()) {
                                            break;
                                        } else {
                                            break;
                                        }
                                    }
                                }
                                z10 = true;
                                break;
                            }
                        }
                        z10 = true;
                        break;
                    }
                    descriptorRendererImpl.m18326n(sb2, functionDescriptor.isTailrec(), "tailrec");
                    descriptorRendererImpl.m18326n(sb2, functionDescriptor.isSuspend(), "suspend");
                    descriptorRendererImpl.m18326n(sb2, functionDescriptor.isInline(), "inline");
                    descriptorRendererImpl.m18326n(sb2, z10, "infix");
                    descriptorRendererImpl.m18326n(sb2, z6, "operator");
                } else {
                    descriptorRendererImpl.m18326n(sb2, functionDescriptor.isSuspend(), "suspend");
                }
                descriptorRendererImpl.m18323k(sb2, functionDescriptor);
                if (descriptorRendererImpl.getVerbose()) {
                    if (functionDescriptor.isHiddenToOvercomeSignatureClash()) {
                        sb2.append("/*isHiddenToOvercomeSignatureClash*/ ");
                    }
                    if (functionDescriptor.isHiddenForResolutionEverywhereBesideSupercalls()) {
                        sb2.append("/*isHiddenForResolutionEverywhereBesideSupercalls*/ ");
                    }
                }
            }
            sb2.append(descriptorRendererImpl.m18322j("fun"));
            sb2.append(Separators.f31991SP);
            List<TypeParameterDescriptor> typeParameters = functionDescriptor.getTypeParameters();
            AbstractC16544l.m18093f(typeParameters, "getTypeParameters(...)");
            descriptorRendererImpl.m18336y(typeParameters, sb2, true);
            descriptorRendererImpl.m18332t(sb2, functionDescriptor);
        }
        descriptorRendererImpl.m18327o(functionDescriptor, sb2, true);
        List<ValueParameterDescriptor> valueParameters = functionDescriptor.getValueParameters();
        AbstractC16544l.m18093f(valueParameters, "getValueParameters(...)");
        descriptorRendererImpl.m18311B(valueParameters, functionDescriptor.hasSynthesizedParameterNames(), sb2);
        descriptorRendererImpl.m18333u(sb2, functionDescriptor);
        KotlinType returnType = functionDescriptor.getReturnType();
        if (!descriptorRendererImpl.getWithoutReturnType() && (descriptorRendererImpl.getUnitReturnType() || returnType == null || !KotlinBuiltIns.isUnit(returnType))) {
            sb2.append(": ");
            sb2.append(returnType == null ? "[NULL]" : descriptorRendererImpl.renderType(returnType));
        }
        List<TypeParameterDescriptor> typeParameters2 = functionDescriptor.getTypeParameters();
        AbstractC16544l.m18093f(typeParameters2, "getTypeParameters(...)");
        descriptorRendererImpl.m18313D(sb2, typeParameters2);
    }

    public static final void access$renderPackageFragment(DescriptorRendererImpl descriptorRendererImpl, PackageFragmentDescriptor packageFragmentDescriptor, StringBuilder sb2) {
        descriptorRendererImpl.getClass();
        FqName fqName = packageFragmentDescriptor.getFqName();
        sb2.append(descriptorRendererImpl.m18322j("package-fragment"));
        String strRenderFqName = descriptorRendererImpl.renderFqName(fqName.toUnsafe());
        if (strRenderFqName.length() > 0) {
            sb2.append(Separators.f31991SP);
            sb2.append(strRenderFqName);
        }
        if (descriptorRendererImpl.getDebugMode()) {
            sb2.append(" in ");
            descriptorRendererImpl.m18327o(packageFragmentDescriptor.getContainingDeclaration(), sb2, false);
        }
    }

    public static final void access$renderPackageView(DescriptorRendererImpl descriptorRendererImpl, PackageViewDescriptor packageViewDescriptor, StringBuilder sb2) {
        descriptorRendererImpl.getClass();
        FqName fqName = packageViewDescriptor.getFqName();
        sb2.append(descriptorRendererImpl.m18322j("package"));
        String strRenderFqName = descriptorRendererImpl.renderFqName(fqName.toUnsafe());
        if (strRenderFqName.length() > 0) {
            sb2.append(Separators.f31991SP);
            sb2.append(strRenderFqName);
        }
        if (descriptorRendererImpl.getDebugMode()) {
            sb2.append(" in context of ");
            descriptorRendererImpl.m18327o(packageViewDescriptor.getModule(), sb2, false);
        }
    }

    public static final void access$renderProperty(DescriptorRendererImpl descriptorRendererImpl, PropertyDescriptor propertyDescriptor, StringBuilder sb2) {
        ConstantValue<?> constantValueMo22586getCompileTimeInitializer;
        String strM18317e;
        if (!descriptorRendererImpl.getStartFromName()) {
            if (!descriptorRendererImpl.getStartFromDeclarationKeyword()) {
                List<ReceiverParameterDescriptor> contextReceiverParameters = propertyDescriptor.getContextReceiverParameters();
                AbstractC16544l.m18093f(contextReceiverParameters, "getContextReceiverParameters(...)");
                descriptorRendererImpl.m18318f(sb2, contextReceiverParameters);
                if (descriptorRendererImpl.getModifiers().contains(DescriptorRendererModifier.ANNOTATIONS)) {
                    descriptorRendererImpl.m18315c(sb2, propertyDescriptor, null);
                    FieldDescriptor backingField = propertyDescriptor.getBackingField();
                    if (backingField != null) {
                        descriptorRendererImpl.m18315c(sb2, backingField, AnnotationUseSiteTarget.FIELD);
                    }
                    FieldDescriptor delegateField = propertyDescriptor.getDelegateField();
                    if (delegateField != null) {
                        descriptorRendererImpl.m18315c(sb2, delegateField, AnnotationUseSiteTarget.PROPERTY_DELEGATE_FIELD);
                    }
                    if (descriptorRendererImpl.getPropertyAccessorRenderingPolicy() == PropertyAccessorRenderingPolicy.NONE) {
                        PropertyGetterDescriptor getter = propertyDescriptor.getGetter();
                        if (getter != null) {
                            descriptorRendererImpl.m18315c(sb2, getter, AnnotationUseSiteTarget.PROPERTY_GETTER);
                        }
                        PropertySetterDescriptor setter = propertyDescriptor.getSetter();
                        if (setter != null) {
                            descriptorRendererImpl.m18315c(sb2, setter, AnnotationUseSiteTarget.PROPERTY_SETTER);
                            List<ValueParameterDescriptor> valueParameters = setter.getValueParameters();
                            AbstractC16544l.m18093f(valueParameters, "getValueParameters(...)");
                            ValueParameterDescriptor valueParameterDescriptor = (ValueParameterDescriptor) AbstractC17680n.m19365o0(valueParameters);
                            AbstractC16544l.m18091d(valueParameterDescriptor);
                            descriptorRendererImpl.m18315c(sb2, valueParameterDescriptor, AnnotationUseSiteTarget.SETTER_PARAMETER);
                        }
                    }
                }
                DescriptorVisibility visibility = propertyDescriptor.getVisibility();
                AbstractC16544l.m18093f(visibility, "getVisibility(...)");
                descriptorRendererImpl.m18312C(visibility, sb2);
                descriptorRendererImpl.m18326n(sb2, descriptorRendererImpl.getModifiers().contains(DescriptorRendererModifier.CONST) && propertyDescriptor.isConst(), "const");
                descriptorRendererImpl.m18324l(propertyDescriptor, sb2);
                descriptorRendererImpl.m18325m(sb2, propertyDescriptor);
                descriptorRendererImpl.m18330r(sb2, propertyDescriptor);
                descriptorRendererImpl.m18326n(sb2, descriptorRendererImpl.getModifiers().contains(DescriptorRendererModifier.LATEINIT) && propertyDescriptor.isLateInit(), "lateinit");
                descriptorRendererImpl.m18323k(sb2, propertyDescriptor);
            }
            descriptorRendererImpl.m18337z(propertyDescriptor, sb2, false);
            List<TypeParameterDescriptor> typeParameters = propertyDescriptor.getTypeParameters();
            AbstractC16544l.m18093f(typeParameters, "getTypeParameters(...)");
            descriptorRendererImpl.m18336y(typeParameters, sb2, true);
            descriptorRendererImpl.m18332t(sb2, propertyDescriptor);
        }
        descriptorRendererImpl.m18327o(propertyDescriptor, sb2, true);
        sb2.append(": ");
        KotlinType type = propertyDescriptor.getType();
        AbstractC16544l.m18093f(type, "getType(...)");
        sb2.append(descriptorRendererImpl.renderType(type));
        descriptorRendererImpl.m18333u(sb2, propertyDescriptor);
        if (descriptorRendererImpl.getIncludePropertyConstant() && (constantValueMo22586getCompileTimeInitializer = propertyDescriptor.mo22586getCompileTimeInitializer()) != null && (strM18317e = descriptorRendererImpl.m18317e(constantValueMo22586getCompileTimeInitializer)) != null) {
            sb2.append(" = ");
            sb2.append(descriptorRendererImpl.m18314a(strM18317e));
        }
        List<TypeParameterDescriptor> typeParameters2 = propertyDescriptor.getTypeParameters();
        AbstractC16544l.m18093f(typeParameters2, "getTypeParameters(...)");
        descriptorRendererImpl.m18313D(sb2, typeParameters2);
    }

    public static final void access$renderTypeAlias(DescriptorRendererImpl descriptorRendererImpl, TypeAliasDescriptor typeAliasDescriptor, StringBuilder sb2) {
        descriptorRendererImpl.getClass();
        descriptorRendererImpl.m18315c(sb2, typeAliasDescriptor, null);
        DescriptorVisibility visibility = typeAliasDescriptor.getVisibility();
        AbstractC16544l.m18093f(visibility, "getVisibility(...)");
        descriptorRendererImpl.m18312C(visibility, sb2);
        descriptorRendererImpl.m18324l(typeAliasDescriptor, sb2);
        sb2.append(descriptorRendererImpl.m18322j("typealias"));
        sb2.append(Separators.f31991SP);
        descriptorRendererImpl.m18327o(typeAliasDescriptor, sb2, true);
        List<TypeParameterDescriptor> declaredTypeParameters = typeAliasDescriptor.getDeclaredTypeParameters();
        AbstractC16544l.m18093f(declaredTypeParameters, "getDeclaredTypeParameters(...)");
        descriptorRendererImpl.m18336y(declaredTypeParameters, sb2, false);
        descriptorRendererImpl.m18316d(typeAliasDescriptor, sb2);
        sb2.append(" = ");
        sb2.append(descriptorRendererImpl.renderType(typeAliasDescriptor.getUnderlyingType()));
    }

    /* JADX INFO: renamed from: b */
    public static Modality m18308b(MemberDescriptor memberDescriptor) {
        if (memberDescriptor instanceof ClassDescriptor) {
            return ((ClassDescriptor) memberDescriptor).getKind() == ClassKind.INTERFACE ? Modality.ABSTRACT : Modality.FINAL;
        }
        DeclarationDescriptor containingDeclaration = memberDescriptor.getContainingDeclaration();
        ClassDescriptor classDescriptor = containingDeclaration instanceof ClassDescriptor ? (ClassDescriptor) containingDeclaration : null;
        if (classDescriptor == null) {
            return Modality.FINAL;
        }
        if (!(memberDescriptor instanceof CallableMemberDescriptor)) {
            return Modality.FINAL;
        }
        CallableMemberDescriptor callableMemberDescriptor = (CallableMemberDescriptor) memberDescriptor;
        Collection<? extends CallableMemberDescriptor> overriddenDescriptors = callableMemberDescriptor.getOverriddenDescriptors();
        AbstractC16544l.m18093f(overriddenDescriptors, "getOverriddenDescriptors(...)");
        if (!overriddenDescriptors.isEmpty() && classDescriptor.getModality() != Modality.FINAL) {
            return Modality.OPEN;
        }
        if (classDescriptor.getKind() != ClassKind.INTERFACE || AbstractC16544l.m18089b(callableMemberDescriptor.getVisibility(), DescriptorVisibilities.PRIVATE)) {
            return Modality.FINAL;
        }
        Modality modality = callableMemberDescriptor.getModality();
        Modality modality2 = Modality.ABSTRACT;
        return modality == modality2 ? modality2 : Modality.OPEN;
    }

    /* JADX INFO: renamed from: v */
    public static void m18309v(StringBuilder sb2) {
        int length = sb2.length();
        if (length == 0 || sb2.charAt(length - 1) != ' ') {
            sb2.append(' ');
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x005a  */
    /* JADX INFO: renamed from: A */
    public final void m18310A(ValueParameterDescriptor valueParameterDescriptor, boolean z6, StringBuilder sb2, boolean z10) {
        boolean z11;
        ConstantValue<?> constantValueMo22586getCompileTimeInitializer;
        String strM18317e;
        if (z10) {
            sb2.append(m18322j("value-parameter"));
            sb2.append(Separators.f31991SP);
        }
        if (getVerbose()) {
            sb2.append("/*");
            sb2.append(valueParameterDescriptor.getIndex());
            sb2.append("*/ ");
        }
        m18315c(sb2, valueParameterDescriptor, null);
        m18326n(sb2, valueParameterDescriptor.isCrossinline(), "crossinline");
        m18326n(sb2, valueParameterDescriptor.isNoinline(), "noinline");
        boolean z12 = false;
        if (getRenderPrimaryConstructorParametersAsProperties()) {
            CallableDescriptor containingDeclaration = valueParameterDescriptor.getContainingDeclaration();
            ClassConstructorDescriptor classConstructorDescriptor = containingDeclaration instanceof ClassConstructorDescriptor ? (ClassConstructorDescriptor) containingDeclaration : null;
            if (classConstructorDescriptor == null || !classConstructorDescriptor.isPrimary()) {
                z11 = false;
            } else {
                z11 = true;
            }
        } else {
            z11 = false;
        }
        if (z11) {
            m18326n(sb2, getActualPropertiesInPrimaryConstructor(), "actual");
        }
        KotlinType type = valueParameterDescriptor.getType();
        AbstractC16544l.m18093f(type, "getType(...)");
        KotlinType varargElementType = valueParameterDescriptor.getVarargElementType();
        KotlinType kotlinType = varargElementType == null ? type : varargElementType;
        m18326n(sb2, varargElementType != null, "vararg");
        if (z11 || (z10 && !getStartFromName())) {
            m18337z(valueParameterDescriptor, sb2, z11);
        }
        if (z6) {
            m18327o(valueParameterDescriptor, sb2, z10);
            sb2.append(": ");
        }
        sb2.append(renderType(kotlinType));
        if (getIncludePropertyConstant() && (constantValueMo22586getCompileTimeInitializer = valueParameterDescriptor.mo22586getCompileTimeInitializer()) != null && (strM18317e = m18317e(constantValueMo22586getCompileTimeInitializer)) != null) {
            sb2.append(" = ");
            sb2.append(m18314a(strM18317e));
        }
        if (getVerbose() && varargElementType != null) {
            sb2.append(" /*");
            sb2.append(renderType(type));
            sb2.append("*/");
        }
        if (getDefaultParameterValueRenderer() != null) {
            if (getDebugMode() ? valueParameterDescriptor.declaresDefaultValue() : DescriptorUtilsKt.declaresOrInheritsDefaultValue(valueParameterDescriptor)) {
                z12 = true;
            }
        }
        if (z12) {
            StringBuilder sb3 = new StringBuilder(" = ");
            InterfaceC1436k defaultParameterValueRenderer = getDefaultParameterValueRenderer();
            AbstractC16544l.m18091d(defaultParameterValueRenderer);
            sb3.append((String) defaultParameterValueRenderer.invoke(valueParameterDescriptor));
            sb2.append(sb3.toString());
        }
    }

    /* JADX INFO: renamed from: B */
    public final void m18311B(Collection collection, boolean z6, StringBuilder sb2) {
        int i10 = WhenMappings.$EnumSwitchMapping$1[getParameterNameRenderingPolicy().ordinal()];
        boolean z10 = true;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    throw new C0644w();
                }
            } else if (z6) {
            }
            z10 = false;
        }
        int size = collection.size();
        getValueParametersHandler().appendBeforeValueParameters(size, sb2);
        Iterator it = collection.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            ValueParameterDescriptor valueParameterDescriptor = (ValueParameterDescriptor) it.next();
            getValueParametersHandler().appendBeforeValueParameter(valueParameterDescriptor, i11, size, sb2);
            m18310A(valueParameterDescriptor, z10, sb2, false);
            getValueParametersHandler().appendAfterValueParameter(valueParameterDescriptor, i11, size, sb2);
            i11++;
        }
        getValueParametersHandler().appendAfterValueParameters(size, sb2);
    }

    /* JADX INFO: renamed from: C */
    public final boolean m18312C(DescriptorVisibility descriptorVisibility, StringBuilder sb2) {
        if (!getModifiers().contains(DescriptorRendererModifier.VISIBILITY)) {
            return false;
        }
        if (getNormalizedVisibilities()) {
            descriptorVisibility = descriptorVisibility.normalize();
        }
        if (!getRenderDefaultVisibility() && AbstractC16544l.m18089b(descriptorVisibility, DescriptorVisibilities.DEFAULT_VISIBILITY)) {
            return false;
        }
        sb2.append(m18322j(descriptorVisibility.getInternalDisplayName()));
        sb2.append(Separators.f31991SP);
        return true;
    }

    /* JADX INFO: renamed from: D */
    public final void m18313D(StringBuilder sb2, List list) {
        if (getWithoutTypeParameters()) {
            return;
        }
        ArrayList arrayList = new ArrayList(0);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            TypeParameterDescriptor typeParameterDescriptor = (TypeParameterDescriptor) it.next();
            List<KotlinType> upperBounds = typeParameterDescriptor.getUpperBounds();
            AbstractC16544l.m18093f(upperBounds, "getUpperBounds(...)");
            for (KotlinType kotlinType : AbstractC17680n.m19336L(upperBounds, 1)) {
                StringBuilder sb3 = new StringBuilder();
                Name name = typeParameterDescriptor.getName();
                AbstractC16544l.m18093f(name, "getName(...)");
                sb3.append(renderName(name, false));
                sb3.append(" : ");
                AbstractC16544l.m18091d(kotlinType);
                sb3.append(renderType(kotlinType));
                arrayList.add(sb3.toString());
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        sb2.append(Separators.f31991SP);
        sb2.append(m18322j("where"));
        sb2.append(Separators.f31991SP);
        AbstractC17680n.m19347W(arrayList, sb2, ", ", (124 & 4) != 0 ? "" : null, (124 & 8) != 0 ? "" : null, -1, "...", (124 & 64) != 0 ? null : null);
    }

    /* JADX INFO: renamed from: a */
    public final String m18314a(String str) {
        return getTextFormat().escape(str);
    }

    /* JADX INFO: renamed from: c */
    public final void m18315c(StringBuilder sb2, Annotated annotated, AnnotationUseSiteTarget annotationUseSiteTarget) {
        if (getModifiers().contains(DescriptorRendererModifier.ANNOTATIONS)) {
            Set<FqName> excludedTypeAnnotationClasses = annotated instanceof KotlinType ? getExcludedTypeAnnotationClasses() : getExcludedAnnotationClasses();
            InterfaceC1436k annotationFilter = getAnnotationFilter();
            for (AnnotationDescriptor annotationDescriptor : annotated.getAnnotations()) {
                if (!AbstractC17680n.m19333J(excludedTypeAnnotationClasses, annotationDescriptor.getFqName()) && !AbstractC16544l.m18089b(annotationDescriptor.getFqName(), StandardNames.FqNames.parameterName) && (annotationFilter == null || ((Boolean) annotationFilter.invoke(annotationDescriptor)).booleanValue())) {
                    sb2.append(renderAnnotation(annotationDescriptor, annotationUseSiteTarget));
                    if (getEachAnnotationOnNewLine()) {
                        sb2.append('\n');
                    } else {
                        sb2.append(Separators.f31991SP);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m18316d(ClassifierDescriptorWithTypeParameters classifierDescriptorWithTypeParameters, StringBuilder sb2) {
        List<TypeParameterDescriptor> declaredTypeParameters = classifierDescriptorWithTypeParameters.getDeclaredTypeParameters();
        AbstractC16544l.m18093f(declaredTypeParameters, "getDeclaredTypeParameters(...)");
        List<TypeParameterDescriptor> parameters = classifierDescriptorWithTypeParameters.getTypeConstructor().getParameters();
        AbstractC16544l.m18093f(parameters, "getParameters(...)");
        if (getVerbose() && classifierDescriptorWithTypeParameters.isInner() && parameters.size() > declaredTypeParameters.size()) {
            sb2.append(" /*captured type parameters: ");
            m18335x(sb2, parameters.subList(declaredTypeParameters.size(), parameters.size()));
            sb2.append("*/");
        }
    }

    /* JADX INFO: renamed from: e */
    public final String m18317e(ConstantValue constantValue) {
        InterfaceC1436k propertyConstantRenderer = this.f52784a.getPropertyConstantRenderer();
        if (propertyConstantRenderer != null) {
            return (String) propertyConstantRenderer.invoke(constantValue);
        }
        if (constantValue instanceof ArrayValue) {
            List<? extends ConstantValue<?>> value = ((ArrayValue) constantValue).getValue();
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = value.iterator();
            while (it.hasNext()) {
                String strM18317e = m18317e((ConstantValue) it.next());
                if (strM18317e != null) {
                    arrayList.add(strM18317e);
                }
            }
            return AbstractC17680n.m19349Y(arrayList, ", ", "{", "}", 0, null, null, 56);
        }
        if (constantValue instanceof AnnotationValue) {
            return AbstractC21322p.m21688V(DescriptorRenderer.renderAnnotation$default(this, ((AnnotationValue) constantValue).getValue(), null, 2, null), Separators.f31989AT);
        }
        if (!(constantValue instanceof KClassValue)) {
            return constantValue.toString();
        }
        KClassValue.Value value2 = ((KClassValue) constantValue).getValue();
        if (value2 instanceof KClassValue.Value.LocalClass) {
            return ((KClassValue.Value.LocalClass) value2).getType() + "::class";
        }
        if (!(value2 instanceof KClassValue.Value.NormalClass)) {
            throw new C0644w();
        }
        KClassValue.Value.NormalClass normalClass = (KClassValue.Value.NormalClass) value2;
        String strAsString = normalClass.getClassId().asSingleFqName().asString();
        int arrayDimensions = normalClass.getArrayDimensions();
        for (int i10 = 0; i10 < arrayDimensions; i10++) {
            strAsString = AbstractC10763a.m11047e('>', "kotlin.Array<", strAsString);
        }
        return AbstractC10763a.m11052j(strAsString, "::class");
    }

    /* JADX INFO: renamed from: f */
    public final void m18318f(StringBuilder sb2, List list) {
        if (list.isEmpty()) {
            return;
        }
        sb2.append("context(");
        Iterator it = list.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            int i11 = i10 + 1;
            ReceiverParameterDescriptor receiverParameterDescriptor = (ReceiverParameterDescriptor) it.next();
            m18315c(sb2, receiverParameterDescriptor, AnnotationUseSiteTarget.RECEIVER);
            KotlinType type = receiverParameterDescriptor.getType();
            AbstractC16544l.m18093f(type, "getType(...)");
            sb2.append(m18321i(type));
            if (i10 == AbstractC17681o.m19381j(list)) {
                sb2.append(") ");
            } else {
                sb2.append(", ");
            }
            i10 = i11;
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m18319g(StringBuilder sb2, SimpleType simpleType) {
        m18315c(sb2, simpleType, null);
        DefinitelyNotNullType definitelyNotNullType = simpleType instanceof DefinitelyNotNullType ? (DefinitelyNotNullType) simpleType : null;
        SimpleType original = definitelyNotNullType != null ? definitelyNotNullType.getOriginal() : null;
        if (KotlinTypeKt.isError(simpleType)) {
            if (TypeUtilsKt.isUnresolvedType(simpleType) && getPresentableUnresolvedTypes()) {
                sb2.append(m18320h(ErrorUtils.INSTANCE.unresolvedTypeAsItIs(simpleType)));
            } else {
                if (!(simpleType instanceof ErrorType) || getInformativeErrorType()) {
                    sb2.append(simpleType.getConstructor().toString());
                } else {
                    sb2.append(((ErrorType) simpleType).getDebugMessage());
                }
                sb2.append(renderTypeArguments(simpleType.getArguments()));
            }
        } else if (simpleType instanceof StubTypeForBuilderInference) {
            sb2.append(((StubTypeForBuilderInference) simpleType).getOriginalTypeVariable().toString());
        } else if (original instanceof StubTypeForBuilderInference) {
            sb2.append(((StubTypeForBuilderInference) original).getOriginalTypeVariable().toString());
        } else {
            TypeConstructor constructor = simpleType.getConstructor();
            PossiblyInnerType possiblyInnerTypeBuildPossiblyInnerType = TypeParameterUtilsKt.buildPossiblyInnerType(simpleType);
            if (possiblyInnerTypeBuildPossiblyInnerType == null) {
                sb2.append(renderTypeConstructor(constructor));
                sb2.append(renderTypeArguments(simpleType.getArguments()));
            } else {
                m18331s(sb2, possiblyInnerTypeBuildPossiblyInnerType);
            }
        }
        if (simpleType.isMarkedNullable()) {
            sb2.append(Separators.QUESTION);
        }
        if (SpecialTypesKt.isDefinitelyNotNullType(simpleType)) {
            sb2.append(" & Any");
        }
    }

    public boolean getActualPropertiesInPrimaryConstructor() {
        return this.f52784a.getActualPropertiesInPrimaryConstructor();
    }

    public boolean getAlwaysRenderModifiers() {
        return this.f52784a.getAlwaysRenderModifiers();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public AnnotationArgumentsRenderingPolicy getAnnotationArgumentsRenderingPolicy() {
        return this.f52784a.getAnnotationArgumentsRenderingPolicy();
    }

    public InterfaceC1436k getAnnotationFilter() {
        return this.f52784a.getAnnotationFilter();
    }

    public boolean getBoldOnlyForNamesInHtml() {
        return this.f52784a.getBoldOnlyForNamesInHtml();
    }

    public boolean getClassWithPrimaryConstructor() {
        return this.f52784a.getClassWithPrimaryConstructor();
    }

    public ClassifierNamePolicy getClassifierNamePolicy() {
        return this.f52784a.getClassifierNamePolicy();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public boolean getDebugMode() {
        return this.f52784a.getDebugMode();
    }

    public InterfaceC1436k getDefaultParameterValueRenderer() {
        return this.f52784a.getDefaultParameterValueRenderer();
    }

    public boolean getEachAnnotationOnNewLine() {
        return this.f52784a.getEachAnnotationOnNewLine();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public boolean getEnhancedTypes() {
        return this.f52784a.getEnhancedTypes();
    }

    public Set<FqName> getExcludedAnnotationClasses() {
        return this.f52784a.getExcludedAnnotationClasses();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public Set<FqName> getExcludedTypeAnnotationClasses() {
        return this.f52784a.getExcludedTypeAnnotationClasses();
    }

    public boolean getIncludeAdditionalModifiers() {
        return this.f52784a.getIncludeAdditionalModifiers();
    }

    public boolean getIncludeAnnotationArguments() {
        return this.f52784a.getIncludeAnnotationArguments();
    }

    public boolean getIncludeEmptyAnnotationArguments() {
        return this.f52784a.getIncludeEmptyAnnotationArguments();
    }

    public boolean getIncludePropertyConstant() {
        return this.f52784a.getIncludePropertyConstant();
    }

    public boolean getInformativeErrorType() {
        return this.f52784a.getInformativeErrorType();
    }

    public Set<DescriptorRendererModifier> getModifiers() {
        return this.f52784a.getModifiers();
    }

    public boolean getNormalizedVisibilities() {
        return this.f52784a.getNormalizedVisibilities();
    }

    public final DescriptorRendererOptionsImpl getOptions() {
        return this.f52784a;
    }

    public OverrideRenderingPolicy getOverrideRenderingPolicy() {
        return this.f52784a.getOverrideRenderingPolicy();
    }

    public ParameterNameRenderingPolicy getParameterNameRenderingPolicy() {
        return this.f52784a.getParameterNameRenderingPolicy();
    }

    public boolean getParameterNamesInFunctionalTypes() {
        return this.f52784a.getParameterNamesInFunctionalTypes();
    }

    public boolean getPresentableUnresolvedTypes() {
        return this.f52784a.getPresentableUnresolvedTypes();
    }

    public PropertyAccessorRenderingPolicy getPropertyAccessorRenderingPolicy() {
        return this.f52784a.getPropertyAccessorRenderingPolicy();
    }

    public boolean getReceiverAfterName() {
        return this.f52784a.getReceiverAfterName();
    }

    public boolean getRenderAbbreviatedTypeComments() {
        return this.f52784a.getRenderAbbreviatedTypeComments();
    }

    public boolean getRenderCompanionObjectName() {
        return this.f52784a.getRenderCompanionObjectName();
    }

    public boolean getRenderConstructorDelegation() {
        return this.f52784a.getRenderConstructorDelegation();
    }

    public boolean getRenderConstructorKeyword() {
        return this.f52784a.getRenderConstructorKeyword();
    }

    public boolean getRenderDefaultAnnotationArguments() {
        return this.f52784a.getRenderDefaultAnnotationArguments();
    }

    public boolean getRenderDefaultModality() {
        return this.f52784a.getRenderDefaultModality();
    }

    public boolean getRenderDefaultVisibility() {
        return this.f52784a.getRenderDefaultVisibility();
    }

    public boolean getRenderPrimaryConstructorParametersAsProperties() {
        return this.f52784a.getRenderPrimaryConstructorParametersAsProperties();
    }

    public boolean getRenderTypeExpansions() {
        return this.f52784a.getRenderTypeExpansions();
    }

    public boolean getRenderUnabbreviatedType() {
        return this.f52784a.getRenderUnabbreviatedType();
    }

    public boolean getSecondaryConstructorsAsPrimary() {
        return this.f52784a.getSecondaryConstructorsAsPrimary();
    }

    public boolean getStartFromDeclarationKeyword() {
        return this.f52784a.getStartFromDeclarationKeyword();
    }

    public boolean getStartFromName() {
        return this.f52784a.getStartFromName();
    }

    public RenderingFormat getTextFormat() {
        return this.f52784a.getTextFormat();
    }

    public InterfaceC1436k getTypeNormalizer() {
        return this.f52784a.getTypeNormalizer();
    }

    public boolean getUninferredTypeParameterAsName() {
        return this.f52784a.getUninferredTypeParameterAsName();
    }

    public boolean getUnitReturnType() {
        return this.f52784a.getUnitReturnType();
    }

    public DescriptorRenderer.ValueParametersHandler getValueParametersHandler() {
        return this.f52784a.getValueParametersHandler();
    }

    public boolean getVerbose() {
        return this.f52784a.getVerbose();
    }

    public boolean getWithDefinedIn() {
        return this.f52784a.getWithDefinedIn();
    }

    public boolean getWithSourceFileForTopLevel() {
        return this.f52784a.getWithSourceFileForTopLevel();
    }

    public boolean getWithoutReturnType() {
        return this.f52784a.getWithoutReturnType();
    }

    public boolean getWithoutSuperTypes() {
        return this.f52784a.getWithoutSuperTypes();
    }

    public boolean getWithoutTypeParameters() {
        return this.f52784a.getWithoutTypeParameters();
    }

    /* JADX INFO: renamed from: h */
    public final String m18320h(String str) {
        int i10 = WhenMappings.$EnumSwitchMapping$0[getTextFormat().ordinal()];
        if (i10 == 1) {
            return str;
        }
        if (i10 == 2) {
            return AbstractC10763a.m11054l("<font color=red><b>", str, "</b></font>");
        }
        throw new C0644w();
    }

    /* JADX INFO: renamed from: i */
    public final String m18321i(KotlinType kotlinType) {
        String strRenderType = renderType(kotlinType);
        return ((!m18307E(kotlinType) || TypeUtils.isNullableType(kotlinType)) && !(kotlinType instanceof DefinitelyNotNullType)) ? strRenderType : AbstractC10763a.m11047e(')', Separators.LPAREN, strRenderType);
    }

    /* JADX INFO: renamed from: j */
    public final String m18322j(String str) {
        int i10 = WhenMappings.$EnumSwitchMapping$0[getTextFormat().ordinal()];
        if (i10 == 1) {
            return str;
        }
        if (i10 == 2) {
            return getBoldOnlyForNamesInHtml() ? str : AbstractC10763a.m11054l("<b>", str, "</b>");
        }
        throw new C0644w();
    }

    /* JADX INFO: renamed from: k */
    public final void m18323k(StringBuilder sb2, CallableMemberDescriptor callableMemberDescriptor) {
        if (getModifiers().contains(DescriptorRendererModifier.MEMBER_KIND) && getVerbose() && callableMemberDescriptor.getKind() != CallableMemberDescriptor.Kind.DECLARATION) {
            sb2.append("/*");
            sb2.append(CapitalizeDecapitalizeKt.toLowerCaseAsciiOnly(callableMemberDescriptor.getKind().name()));
            sb2.append("*/ ");
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m18324l(MemberDescriptor memberDescriptor, StringBuilder sb2) {
        m18326n(sb2, memberDescriptor.isExternal(), "external");
        boolean z6 = false;
        m18326n(sb2, getModifiers().contains(DescriptorRendererModifier.EXPECT) && memberDescriptor.isExpect(), "expect");
        if (getModifiers().contains(DescriptorRendererModifier.ACTUAL) && memberDescriptor.isActual()) {
            z6 = true;
        }
        m18326n(sb2, z6, "actual");
    }

    /* JADX INFO: renamed from: m */
    public final void m18325m(StringBuilder sb2, CallableMemberDescriptor callableMemberDescriptor) {
        if (DescriptorUtils.isTopLevelDeclaration(callableMemberDescriptor) && callableMemberDescriptor.getModality() == Modality.FINAL) {
            return;
        }
        if (getOverrideRenderingPolicy() == OverrideRenderingPolicy.RENDER_OVERRIDE && callableMemberDescriptor.getModality() == Modality.OPEN && !callableMemberDescriptor.getOverriddenDescriptors().isEmpty()) {
            return;
        }
        Modality modality = callableMemberDescriptor.getModality();
        AbstractC16544l.m18093f(modality, "getModality(...)");
        Modality modalityM18308b = m18308b(callableMemberDescriptor);
        if (getRenderDefaultModality() || modality != modalityM18308b) {
            m18326n(sb2, getModifiers().contains(DescriptorRendererModifier.MODALITY), CapitalizeDecapitalizeKt.toLowerCaseAsciiOnly(modality.name()));
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m18326n(StringBuilder sb2, boolean z6, String str) {
        if (z6) {
            sb2.append(m18322j(str));
            sb2.append(Separators.f31991SP);
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m18327o(DeclarationDescriptor declarationDescriptor, StringBuilder sb2, boolean z6) {
        Name name = declarationDescriptor.getName();
        AbstractC16544l.m18093f(name, "getName(...)");
        sb2.append(renderName(name, z6));
    }

    /* JADX INFO: renamed from: p */
    public final void m18328p(StringBuilder sb2, KotlinType kotlinType) {
        UnwrappedType unwrappedTypeUnwrap = kotlinType.unwrap();
        AbbreviatedType abbreviatedType = unwrappedTypeUnwrap instanceof AbbreviatedType ? (AbbreviatedType) unwrappedTypeUnwrap : null;
        if (abbreviatedType == null) {
            m18329q(sb2, kotlinType);
            return;
        }
        if (getRenderTypeExpansions()) {
            m18329q(sb2, abbreviatedType.getExpandedType());
            if (getRenderAbbreviatedTypeComments()) {
                RenderingFormat textFormat = getTextFormat();
                RenderingFormat renderingFormat = RenderingFormat.HTML;
                if (textFormat == renderingFormat) {
                    sb2.append("<font color=\"808080\"><i>");
                }
                sb2.append(" /* ");
                sb2.append("from: ");
                m18329q(sb2, abbreviatedType.getAbbreviation());
                sb2.append(" */");
                if (getTextFormat() == renderingFormat) {
                    sb2.append("</i></font>");
                    return;
                }
                return;
            }
            return;
        }
        m18329q(sb2, abbreviatedType.getAbbreviation());
        if (getRenderUnabbreviatedType()) {
            RenderingFormat textFormat2 = getTextFormat();
            RenderingFormat renderingFormat2 = RenderingFormat.HTML;
            if (textFormat2 == renderingFormat2) {
                sb2.append("<font color=\"808080\"><i>");
            }
            sb2.append(" /* ");
            sb2.append("= ");
            m18329q(sb2, abbreviatedType.getExpandedType());
            sb2.append(" */");
            if (getTextFormat() == renderingFormat2) {
                sb2.append("</i></font>");
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m18329q(StringBuilder sb2, KotlinType kotlinType) {
        Name nameExtractParameterNameFromFunctionTypeArgument;
        String strM18314a;
        if ((kotlinType instanceof WrappedType) && getDebugMode() && !((WrappedType) kotlinType).isComputed()) {
            sb2.append("<Not computed yet>");
            return;
        }
        UnwrappedType unwrappedTypeUnwrap = kotlinType.unwrap();
        if (unwrappedTypeUnwrap instanceof FlexibleType) {
            sb2.append(((FlexibleType) unwrappedTypeUnwrap).render(this, this));
            return;
        }
        if (!(unwrappedTypeUnwrap instanceof SimpleType)) {
            throw new C0644w();
        }
        SimpleType simpleType = (SimpleType) unwrappedTypeUnwrap;
        if (AbstractC16544l.m18089b(simpleType, TypeUtils.CANNOT_INFER_FUNCTION_PARAM_TYPE) || TypeUtils.isDontCarePlaceholder(simpleType)) {
            sb2.append("???");
            return;
        }
        if (ErrorUtils.isUninferredTypeVariable(simpleType)) {
            if (!getUninferredTypeParameterAsName()) {
                sb2.append("???");
                return;
            }
            TypeConstructor constructor = simpleType.getConstructor();
            AbstractC16544l.m18092e(constructor, "null cannot be cast to non-null type org.jetbrains.kotlin.types.error.ErrorTypeConstructor");
            sb2.append(m18320h(((ErrorTypeConstructor) constructor).getParam(0)));
            return;
        }
        if (KotlinTypeKt.isError(simpleType)) {
            m18319g(sb2, simpleType);
            return;
        }
        if (!m18307E(simpleType)) {
            m18319g(sb2, simpleType);
            return;
        }
        int length = sb2.length();
        ((DescriptorRendererImpl) this.f52785b.getValue()).m18315c(sb2, simpleType, null);
        boolean z6 = sb2.length() != length;
        KotlinType receiverTypeFromFunctionType = FunctionTypesKt.getReceiverTypeFromFunctionType(simpleType);
        List<KotlinType> contextReceiverTypesFromFunctionType = FunctionTypesKt.getContextReceiverTypesFromFunctionType(simpleType);
        boolean zIsSuspendFunctionType = FunctionTypesKt.isSuspendFunctionType(simpleType);
        boolean zIsMarkedNullable = simpleType.isMarkedNullable();
        boolean z10 = zIsMarkedNullable || (z6 && receiverTypeFromFunctionType != null);
        if (z10) {
            if (zIsSuspendFunctionType) {
                sb2.insert(length, '(');
            } else {
                if (z6) {
                    AbstractC7966P5.m8258f(AbstractC21322p.m21682P(sb2));
                    if (sb2.charAt(AbstractC21322p.m21674H(sb2) - 1) != ')') {
                        sb2.insert(AbstractC21322p.m21674H(sb2), "()");
                    }
                }
                sb2.append(Separators.LPAREN);
            }
        }
        if (!contextReceiverTypesFromFunctionType.isEmpty()) {
            sb2.append("context(");
            Iterator<KotlinType> it = contextReceiverTypesFromFunctionType.subList(0, AbstractC17681o.m19381j(contextReceiverTypesFromFunctionType)).iterator();
            while (it.hasNext()) {
                m18328p(sb2, it.next());
                sb2.append(", ");
            }
            m18328p(sb2, (KotlinType) AbstractC17680n.m19351a0(contextReceiverTypesFromFunctionType));
            sb2.append(") ");
        }
        m18326n(sb2, zIsSuspendFunctionType, "suspend");
        if (receiverTypeFromFunctionType != null) {
            boolean z11 = (m18307E(receiverTypeFromFunctionType) && !receiverTypeFromFunctionType.isMarkedNullable()) || FunctionTypesKt.isSuspendFunctionType(receiverTypeFromFunctionType) || !receiverTypeFromFunctionType.getAnnotations().isEmpty() || (receiverTypeFromFunctionType instanceof DefinitelyNotNullType);
            if (z11) {
                sb2.append(Separators.LPAREN);
            }
            m18328p(sb2, receiverTypeFromFunctionType);
            if (z11) {
                sb2.append(Separators.RPAREN);
            }
            sb2.append(Separators.DOT);
        }
        sb2.append(Separators.LPAREN);
        if (!FunctionTypesKt.isBuiltinExtensionFunctionalType(simpleType) || simpleType.getArguments().size() > 1) {
            int i10 = 0;
            for (TypeProjection typeProjection : FunctionTypesKt.getValueParameterTypesFromFunctionType(simpleType)) {
                int i11 = i10 + 1;
                if (i10 > 0) {
                    sb2.append(", ");
                }
                if (getParameterNamesInFunctionalTypes()) {
                    KotlinType type = typeProjection.getType();
                    AbstractC16544l.m18093f(type, "getType(...)");
                    nameExtractParameterNameFromFunctionTypeArgument = FunctionTypesKt.extractParameterNameFromFunctionTypeArgument(type);
                } else {
                    nameExtractParameterNameFromFunctionTypeArgument = null;
                }
                if (nameExtractParameterNameFromFunctionTypeArgument != null) {
                    sb2.append(renderName(nameExtractParameterNameFromFunctionTypeArgument, false));
                    sb2.append(": ");
                }
                sb2.append(renderTypeProjection(typeProjection));
                i10 = i11;
            }
        } else {
            sb2.append("???");
        }
        sb2.append(") ");
        int i12 = WhenMappings.$EnumSwitchMapping$0[getTextFormat().ordinal()];
        if (i12 == 1) {
            strM18314a = m18314a("->");
        } else {
            if (i12 != 2) {
                throw new C0644w();
            }
            strM18314a = "&rarr;";
        }
        sb2.append(strM18314a);
        sb2.append(Separators.f31991SP);
        m18328p(sb2, FunctionTypesKt.getReturnTypeFromFunctionType(simpleType));
        if (z10) {
            sb2.append(Separators.RPAREN);
        }
        if (zIsMarkedNullable) {
            sb2.append(Separators.QUESTION);
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m18330r(StringBuilder sb2, CallableMemberDescriptor callableMemberDescriptor) {
        if (!getModifiers().contains(DescriptorRendererModifier.OVERRIDE) || callableMemberDescriptor.getOverriddenDescriptors().isEmpty() || getOverrideRenderingPolicy() == OverrideRenderingPolicy.RENDER_OPEN) {
            return;
        }
        m18326n(sb2, true, "override");
        if (getVerbose()) {
            sb2.append("/*");
            sb2.append(callableMemberDescriptor.getOverriddenDescriptors().size());
            sb2.append("*/ ");
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer
    public String render(DeclarationDescriptor declarationDescriptor) {
        DeclarationDescriptor containingDeclaration;
        String name;
        AbstractC16544l.m18094g(declarationDescriptor, "declarationDescriptor");
        StringBuilder sb2 = new StringBuilder();
        declarationDescriptor.accept(new C9642z(this, 8), sb2);
        if (getWithDefinedIn() && !(declarationDescriptor instanceof PackageFragmentDescriptor) && !(declarationDescriptor instanceof PackageViewDescriptor) && (containingDeclaration = declarationDescriptor.getContainingDeclaration()) != null && !(containingDeclaration instanceof ModuleDescriptor)) {
            sb2.append(Separators.f31991SP);
            sb2.append(renderMessage("defined in"));
            sb2.append(Separators.f31991SP);
            FqNameUnsafe fqName = DescriptorUtils.getFqName(containingDeclaration);
            AbstractC16544l.m18093f(fqName, "getFqName(...)");
            sb2.append(fqName.isRoot() ? "root package" : renderFqName(fqName));
            if (getWithSourceFileForTopLevel() && (containingDeclaration instanceof PackageFragmentDescriptor) && (declarationDescriptor instanceof DeclarationDescriptorWithSource) && (name = ((DeclarationDescriptorWithSource) declarationDescriptor).getSource().getContainingFile().getName()) != null) {
                sb2.append(Separators.f31991SP);
                sb2.append(renderMessage("in file"));
                sb2.append(Separators.f31991SP);
                sb2.append(name);
            }
        }
        return sb2.toString();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer
    public String renderAnnotation(AnnotationDescriptor annotation, AnnotationUseSiteTarget annotationUseSiteTarget) {
        ClassConstructorDescriptor classConstructorDescriptorMo22584getUnsubstitutedPrimaryConstructor;
        List<ValueParameterDescriptor> valueParameters;
        AbstractC16544l.m18094g(annotation, "annotation");
        StringBuilder sb2 = new StringBuilder();
        sb2.append('@');
        if (annotationUseSiteTarget != null) {
            sb2.append(annotationUseSiteTarget.getRenderName() + ':');
        }
        KotlinType type = annotation.getType();
        sb2.append(renderType(type));
        if (getIncludeAnnotationArguments()) {
            Map<Name, ConstantValue<?>> allValueArguments = annotation.getAllValueArguments();
            List list = null;
            ClassDescriptor annotationClass = getRenderDefaultAnnotationArguments() ? DescriptorUtilsKt.getAnnotationClass(annotation) : null;
            if (annotationClass != null && (classConstructorDescriptorMo22584getUnsubstitutedPrimaryConstructor = annotationClass.mo22584getUnsubstitutedPrimaryConstructor()) != null && (valueParameters = classConstructorDescriptorMo22584getUnsubstitutedPrimaryConstructor.getValueParameters()) != null) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : valueParameters) {
                    if (((ValueParameterDescriptor) obj).declaresDefaultValue()) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList(AbstractC17682p.m19389r(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((ValueParameterDescriptor) it.next()).getName());
                }
                list = arrayList2;
            }
            if (list == null) {
                list = C17689w.f56480Y;
            }
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : list) {
                if (!allValueArguments.containsKey((Name) obj2)) {
                    arrayList3.add(obj2);
                }
            }
            ArrayList arrayList4 = new ArrayList(AbstractC17682p.m19389r(arrayList3, 10));
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                arrayList4.add(((Name) it2.next()).asString() + " = ...");
            }
            Set<Map.Entry<Name, ConstantValue<?>>> setEntrySet = allValueArguments.entrySet();
            ArrayList arrayList5 = new ArrayList(AbstractC17682p.m19389r(setEntrySet, 10));
            Iterator<T> it3 = setEntrySet.iterator();
            while (it3.hasNext()) {
                Map.Entry entry = (Map.Entry) it3.next();
                Name name = (Name) entry.getKey();
                ConstantValue constantValue = (ConstantValue) entry.getValue();
                StringBuilder sb3 = new StringBuilder();
                sb3.append(name.asString());
                sb3.append(" = ");
                sb3.append(!list.contains(name) ? m18317e(constantValue) : "...");
                arrayList5.add(sb3.toString());
            }
            List listM19369s0 = AbstractC17680n.m19369s0(AbstractC17680n.m19361k0(arrayList5, arrayList4));
            if (getIncludeEmptyAnnotationArguments() || !listM19369s0.isEmpty()) {
                AbstractC17680n.m19347W(listM19369s0, sb2, ", ", (124 & 4) != 0 ? "" : Separators.LPAREN, (124 & 8) != 0 ? "" : Separators.RPAREN, -1, "...", (124 & 64) != 0 ? null : null);
            }
        }
        if (getVerbose() && (KotlinTypeKt.isError(type) || (type.getConstructor().mo22589getDeclarationDescriptor() instanceof NotFoundClasses.MockClassDescriptor))) {
            sb2.append(" /* annotation class not found */");
        }
        return sb2.toString();
    }

    public String renderClassifierName(ClassifierDescriptor klass) {
        AbstractC16544l.m18094g(klass, "klass");
        return ErrorUtils.isError(klass) ? klass.getTypeConstructor().toString() : getClassifierNamePolicy().renderClassifier(klass, this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer
    public String renderFlexibleType(String lowerRendered, String upperRendered, KotlinBuiltIns builtIns) {
        AbstractC16544l.m18094g(lowerRendered, "lowerRendered");
        AbstractC16544l.m18094g(upperRendered, "upperRendered");
        AbstractC16544l.m18094g(builtIns, "builtIns");
        if (RenderingUtilsKt.typeStringsDifferOnlyInNullability(lowerRendered, upperRendered)) {
            return AbstractC21329w.m21734u(upperRendered, Separators.LPAREN, false) ? AbstractC10763a.m11054l(Separators.LPAREN, lowerRendered, ")!") : lowerRendered.concat("!");
        }
        ClassifierNamePolicy classifierNamePolicy = getClassifierNamePolicy();
        ClassDescriptor collection = builtIns.getCollection();
        AbstractC16544l.m18093f(collection, "getCollection(...)");
        String strM21706n0 = AbstractC21322p.m21706n0(classifierNamePolicy.renderClassifier(collection, this), "Collection");
        String strReplacePrefixesInTypeRepresentations = RenderingUtilsKt.replacePrefixesInTypeRepresentations(lowerRendered, strM21706n0.concat("Mutable"), upperRendered, strM21706n0, strM21706n0.concat("(Mutable)"));
        if (strReplacePrefixesInTypeRepresentations != null) {
            return strReplacePrefixesInTypeRepresentations;
        }
        String strReplacePrefixesInTypeRepresentations2 = RenderingUtilsKt.replacePrefixesInTypeRepresentations(lowerRendered, strM21706n0.concat("MutableMap.MutableEntry"), upperRendered, strM21706n0.concat("Map.Entry"), strM21706n0.concat("(Mutable)Map.(Mutable)Entry"));
        if (strReplacePrefixesInTypeRepresentations2 != null) {
            return strReplacePrefixesInTypeRepresentations2;
        }
        ClassifierNamePolicy classifierNamePolicy2 = getClassifierNamePolicy();
        ClassDescriptor array = builtIns.getArray();
        AbstractC16544l.m18093f(array, "getArray(...)");
        String strM21706n1 = AbstractC21322p.m21706n0(classifierNamePolicy2.renderClassifier(array, this), "Array");
        StringBuilder sbM9893l = AbstractC9306j0.m9893l(strM21706n1);
        sbM9893l.append(m18314a("Array<"));
        String string = sbM9893l.toString();
        StringBuilder sbM9893l2 = AbstractC9306j0.m9893l(strM21706n1);
        sbM9893l2.append(m18314a("Array<out "));
        String string2 = sbM9893l2.toString();
        StringBuilder sbM9893l3 = AbstractC9306j0.m9893l(strM21706n1);
        sbM9893l3.append(m18314a("Array<(out) "));
        String strReplacePrefixesInTypeRepresentations3 = RenderingUtilsKt.replacePrefixesInTypeRepresentations(lowerRendered, string, upperRendered, string2, sbM9893l3.toString());
        if (strReplacePrefixesInTypeRepresentations3 != null) {
            return strReplacePrefixesInTypeRepresentations3;
        }
        return Separators.LPAREN + lowerRendered + ".." + upperRendered + ')';
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer
    public String renderFqName(FqNameUnsafe fqName) {
        AbstractC16544l.m18094g(fqName, "fqName");
        return m18314a(RenderingUtilsKt.renderFqName(fqName.pathSegments()));
    }

    public String renderMessage(String message) {
        AbstractC16544l.m18094g(message, "message");
        int i10 = WhenMappings.$EnumSwitchMapping$0[getTextFormat().ordinal()];
        if (i10 == 1) {
            return message;
        }
        if (i10 == 2) {
            return AbstractC10763a.m11054l("<i>", message, "</i>");
        }
        throw new C0644w();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer
    public String renderName(Name name, boolean z6) {
        AbstractC16544l.m18094g(name, "name");
        String strM18314a = m18314a(RenderingUtilsKt.render(name));
        return (getBoldOnlyForNamesInHtml() && getTextFormat() == RenderingFormat.HTML && z6) ? AbstractC10763a.m11054l("<b>", strM18314a, "</b>") : strM18314a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer
    public String renderType(KotlinType type) {
        AbstractC16544l.m18094g(type, "type");
        StringBuilder sb2 = new StringBuilder();
        m18328p(sb2, (KotlinType) getTypeNormalizer().invoke(type));
        return sb2.toString();
    }

    public String renderTypeArguments(List<? extends TypeProjection> typeArguments) {
        AbstractC16544l.m18094g(typeArguments, "typeArguments");
        if (typeArguments.isEmpty()) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(m18314a(Separators.LESS_THAN));
        AbstractC17680n.m19347W(typeArguments, sb2, ", ", (124 & 4) != 0 ? "" : null, (124 & 8) != 0 ? "" : null, -1, "...", (124 & 64) != 0 ? null : new C13701b(this, 0));
        sb2.append(m18314a(Separators.GREATER_THAN));
        return sb2.toString();
    }

    public String renderTypeConstructor(TypeConstructor typeConstructor) {
        AbstractC16544l.m18094g(typeConstructor, "typeConstructor");
        ClassifierDescriptor classifierDescriptorMo22589getDeclarationDescriptor = typeConstructor.mo22589getDeclarationDescriptor();
        if ((classifierDescriptorMo22589getDeclarationDescriptor instanceof TypeParameterDescriptor) || (classifierDescriptorMo22589getDeclarationDescriptor instanceof ClassDescriptor) || (classifierDescriptorMo22589getDeclarationDescriptor instanceof TypeAliasDescriptor)) {
            return renderClassifierName(classifierDescriptorMo22589getDeclarationDescriptor);
        }
        if (classifierDescriptorMo22589getDeclarationDescriptor == null) {
            return typeConstructor instanceof IntersectionTypeConstructor ? ((IntersectionTypeConstructor) typeConstructor).makeDebugNameForIntersectionType(C13700a.f43243y0) : typeConstructor.toString();
        }
        throw new IllegalStateException(("Unexpected classifier: " + classifierDescriptorMo22589getDeclarationDescriptor.getClass()).toString());
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer
    public String renderTypeProjection(TypeProjection typeProjection) {
        AbstractC16544l.m18094g(typeProjection, "typeProjection");
        StringBuilder sb2 = new StringBuilder();
        AbstractC17680n.m19347W(AbstractC9393x3.m9974d(typeProjection), sb2, ", ", (124 & 4) != 0 ? "" : null, (124 & 8) != 0 ? "" : null, -1, "...", (124 & 64) != 0 ? null : new C13701b(this, 0));
        return sb2.toString();
    }

    /* JADX INFO: renamed from: s */
    public final void m18331s(StringBuilder sb2, PossiblyInnerType possiblyInnerType) {
        PossiblyInnerType outerType = possiblyInnerType.getOuterType();
        if (outerType != null) {
            m18331s(sb2, outerType);
            sb2.append('.');
            Name name = possiblyInnerType.getClassifierDescriptor().getName();
            AbstractC16544l.m18093f(name, "getName(...)");
            sb2.append(renderName(name, false));
        } else {
            TypeConstructor typeConstructor = possiblyInnerType.getClassifierDescriptor().getTypeConstructor();
            AbstractC16544l.m18093f(typeConstructor, "getTypeConstructor(...)");
            sb2.append(renderTypeConstructor(typeConstructor));
        }
        sb2.append(renderTypeArguments(possiblyInnerType.getArguments()));
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setAnnotationArgumentsRenderingPolicy(AnnotationArgumentsRenderingPolicy annotationArgumentsRenderingPolicy) {
        AbstractC16544l.m18094g(annotationArgumentsRenderingPolicy, "<set-?>");
        this.f52784a.setAnnotationArgumentsRenderingPolicy(annotationArgumentsRenderingPolicy);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setClassifierNamePolicy(ClassifierNamePolicy classifierNamePolicy) {
        AbstractC16544l.m18094g(classifierNamePolicy, "<set-?>");
        this.f52784a.setClassifierNamePolicy(classifierNamePolicy);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setDebugMode(boolean z6) {
        this.f52784a.setDebugMode(z6);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setExcludedTypeAnnotationClasses(Set<FqName> set) {
        AbstractC16544l.m18094g(set, "<set-?>");
        this.f52784a.setExcludedTypeAnnotationClasses(set);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setModifiers(Set<? extends DescriptorRendererModifier> set) {
        AbstractC16544l.m18094g(set, "<set-?>");
        this.f52784a.setModifiers(set);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setParameterNameRenderingPolicy(ParameterNameRenderingPolicy parameterNameRenderingPolicy) {
        AbstractC16544l.m18094g(parameterNameRenderingPolicy, "<set-?>");
        this.f52784a.setParameterNameRenderingPolicy(parameterNameRenderingPolicy);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setReceiverAfterName(boolean z6) {
        this.f52784a.setReceiverAfterName(z6);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setRenderCompanionObjectName(boolean z6) {
        this.f52784a.setRenderCompanionObjectName(z6);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setStartFromName(boolean z6) {
        this.f52784a.setStartFromName(z6);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setTextFormat(RenderingFormat renderingFormat) {
        AbstractC16544l.m18094g(renderingFormat, "<set-?>");
        this.f52784a.setTextFormat(renderingFormat);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setVerbose(boolean z6) {
        this.f52784a.setVerbose(z6);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setWithDefinedIn(boolean z6) {
        this.f52784a.setWithDefinedIn(z6);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setWithoutSuperTypes(boolean z6) {
        this.f52784a.setWithoutSuperTypes(z6);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setWithoutTypeParameters(boolean z6) {
        this.f52784a.setWithoutTypeParameters(z6);
    }

    /* JADX INFO: renamed from: t */
    public final void m18332t(StringBuilder sb2, CallableMemberDescriptor callableMemberDescriptor) {
        ReceiverParameterDescriptor extensionReceiverParameter = callableMemberDescriptor.getExtensionReceiverParameter();
        if (extensionReceiverParameter != null) {
            m18315c(sb2, extensionReceiverParameter, AnnotationUseSiteTarget.RECEIVER);
            KotlinType type = extensionReceiverParameter.getType();
            AbstractC16544l.m18093f(type, "getType(...)");
            sb2.append(m18321i(type));
            sb2.append(Separators.DOT);
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m18333u(StringBuilder sb2, CallableMemberDescriptor callableMemberDescriptor) {
        ReceiverParameterDescriptor extensionReceiverParameter;
        if (getReceiverAfterName() && (extensionReceiverParameter = callableMemberDescriptor.getExtensionReceiverParameter()) != null) {
            sb2.append(" on ");
            KotlinType type = extensionReceiverParameter.getType();
            AbstractC16544l.m18093f(type, "getType(...)");
            sb2.append(renderType(type));
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m18334w(TypeParameterDescriptor typeParameterDescriptor, StringBuilder sb2, boolean z6) {
        if (z6) {
            sb2.append(m18314a(Separators.LESS_THAN));
        }
        if (getVerbose()) {
            sb2.append("/*");
            sb2.append(typeParameterDescriptor.getIndex());
            sb2.append("*/ ");
        }
        m18326n(sb2, typeParameterDescriptor.isReified(), "reified");
        String label = typeParameterDescriptor.getVariance().getLabel();
        boolean z10 = true;
        m18326n(sb2, label.length() > 0, label);
        m18315c(sb2, typeParameterDescriptor, null);
        m18327o(typeParameterDescriptor, sb2, z6);
        int size = typeParameterDescriptor.getUpperBounds().size();
        if ((size > 1 && !z6) || size == 1) {
            KotlinType next = typeParameterDescriptor.getUpperBounds().iterator().next();
            if (!KotlinBuiltIns.isDefaultBound(next)) {
                sb2.append(" : ");
                AbstractC16544l.m18091d(next);
                sb2.append(renderType(next));
            }
        } else if (z6) {
            for (KotlinType kotlinType : typeParameterDescriptor.getUpperBounds()) {
                if (!KotlinBuiltIns.isDefaultBound(kotlinType)) {
                    if (z10) {
                        sb2.append(" : ");
                    } else {
                        sb2.append(" & ");
                    }
                    AbstractC16544l.m18091d(kotlinType);
                    sb2.append(renderType(kotlinType));
                    z10 = false;
                }
            }
        }
        if (z6) {
            sb2.append(m18314a(Separators.GREATER_THAN));
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m18335x(StringBuilder sb2, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            m18334w((TypeParameterDescriptor) it.next(), sb2, false);
            if (it.hasNext()) {
                sb2.append(", ");
            }
        }
    }

    /* JADX INFO: renamed from: y */
    public final void m18336y(List list, StringBuilder sb2, boolean z6) {
        if (getWithoutTypeParameters() || list.isEmpty()) {
            return;
        }
        sb2.append(m18314a(Separators.LESS_THAN));
        m18335x(sb2, list);
        sb2.append(m18314a(Separators.GREATER_THAN));
        if (z6) {
            sb2.append(Separators.f31991SP);
        }
    }

    /* JADX INFO: renamed from: z */
    public final void m18337z(VariableDescriptor variableDescriptor, StringBuilder sb2, boolean z6) {
        if (z6 || !(variableDescriptor instanceof ValueParameterDescriptor)) {
            sb2.append(m18322j(variableDescriptor.isVar() ? "var" : "val"));
            sb2.append(Separators.f31991SP);
        }
    }
}
