package kotlin.reflect.jvm.internal.impl.resolve;

import gn.C14199d;
import java.util.Collections;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassConstructorDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyGetterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertySetterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ReceiverParameterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.SimpleFunctionDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ValueParameterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.name.NameUtils;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ContextClassReceiver;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ContextReceiver;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ExtensionReceiver;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributes;
import kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import p582Xk.HXHG.bQBnquXS;

/* JADX INFO: loaded from: classes2.dex */
public class DescriptorFactory {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m18340a(int i10) {
        String str = (i10 == 12 || i10 == 23 || i10 == 25) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 12 || i10 == 23 || i10 == 25) ? 2 : 3];
        switch (i10) {
            case 1:
            case 4:
            case 8:
            case 14:
            case 16:
            case 18:
            case 31:
            case 33:
            case 35:
                objArr[0] = "annotations";
                break;
            case 2:
            case 5:
            case 9:
                objArr[0] = "parameterAnnotations";
                break;
            case 3:
            case 7:
            case 13:
            case 15:
            case 17:
            default:
                objArr[0] = "propertyDescriptor";
                break;
            case 6:
            case 11:
            case 19:
                objArr[0] = "sourceElement";
                break;
            case 10:
                objArr[0] = "visibility";
                break;
            case 12:
            case 23:
            case 25:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorFactory";
                break;
            case 20:
                objArr[0] = "containingClass";
                break;
            case 21:
                objArr[0] = "source";
                break;
            case 22:
            case 24:
            case 26:
                objArr[0] = "enumClass";
                break;
            case 27:
            case 28:
            case 29:
                objArr[0] = bQBnquXS.qoFCCxxg;
                break;
            case 30:
            case 32:
            case 34:
                objArr[0] = "owner";
                break;
        }
        if (i10 == 12) {
            objArr[1] = "createSetter";
        } else if (i10 == 23) {
            objArr[1] = "createEnumValuesMethod";
        } else if (i10 != 25) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorFactory";
        } else {
            objArr[1] = "createEnumValueOfMethod";
        }
        switch (i10) {
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                objArr[2] = "createSetter";
                break;
            case 12:
            case 23:
            case 25:
                break;
            case 13:
            case 14:
                objArr[2] = "createDefaultGetter";
                break;
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                objArr[2] = "createGetter";
                break;
            case 20:
            case 21:
                objArr[2] = "createPrimaryConstructorForObject";
                break;
            case 22:
                objArr[2] = "createEnumValuesMethod";
                break;
            case 24:
                objArr[2] = "createEnumValueOfMethod";
                break;
            case 26:
                objArr[2] = "createEnumEntriesProperty";
                break;
            case 27:
                objArr[2] = "isEnumValuesMethod";
                break;
            case 28:
                objArr[2] = "isEnumValueOfMethod";
                break;
            case 29:
                objArr[2] = "isEnumSpecialMethod";
                break;
            case 30:
            case 31:
                objArr[2] = "createExtensionReceiverParameterForCallable";
                break;
            case 32:
            case 33:
                objArr[2] = "createContextReceiverParameterForCallable";
                break;
            case 34:
            case 35:
                objArr[2] = "createContextReceiverParameterForClass";
                break;
            default:
                objArr[2] = "createDefaultSetter";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i10 != 12 && i10 != 23 && i10 != 25) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    /* JADX INFO: renamed from: b */
    public static boolean m18341b(FunctionDescriptor functionDescriptor) {
        if (functionDescriptor != null) {
            return functionDescriptor.getKind() == CallableMemberDescriptor.Kind.SYNTHESIZED && DescriptorUtils.isEnumClass(functionDescriptor.getContainingDeclaration());
        }
        m18340a(29);
        throw null;
    }

    public static ReceiverParameterDescriptor createContextReceiverParameterForCallable(CallableDescriptor callableDescriptor, KotlinType kotlinType, Name name, Annotations annotations, int i10) {
        if (callableDescriptor == null) {
            m18340a(32);
            throw null;
        }
        if (annotations == null) {
            m18340a(33);
            throw null;
        }
        if (kotlinType == null) {
            return null;
        }
        return new ReceiverParameterDescriptorImpl(callableDescriptor, new ContextReceiver(callableDescriptor, kotlinType, name, null), annotations, NameUtils.contextReceiverName(i10));
    }

    public static ReceiverParameterDescriptor createContextReceiverParameterForClass(ClassDescriptor classDescriptor, KotlinType kotlinType, Name name, Annotations annotations, int i10) {
        if (classDescriptor == null) {
            m18340a(34);
            throw null;
        }
        if (annotations == null) {
            m18340a(35);
            throw null;
        }
        if (kotlinType == null) {
            return null;
        }
        return new ReceiverParameterDescriptorImpl(classDescriptor, new ContextClassReceiver(classDescriptor, kotlinType, name, null), annotations, NameUtils.contextReceiverName(i10));
    }

    public static PropertyGetterDescriptorImpl createDefaultGetter(PropertyDescriptor propertyDescriptor, Annotations annotations) {
        if (propertyDescriptor == null) {
            m18340a(13);
            throw null;
        }
        if (annotations != null) {
            return createGetter(propertyDescriptor, annotations, true, false, false);
        }
        m18340a(14);
        throw null;
    }

    public static PropertySetterDescriptorImpl createDefaultSetter(PropertyDescriptor propertyDescriptor, Annotations annotations, Annotations annotations2) {
        if (propertyDescriptor == null) {
            m18340a(0);
            throw null;
        }
        if (annotations == null) {
            m18340a(1);
            throw null;
        }
        if (annotations2 != null) {
            return createSetter(propertyDescriptor, annotations, annotations2, true, false, false, propertyDescriptor.getSource());
        }
        m18340a(2);
        throw null;
    }

    public static PropertyDescriptor createEnumEntriesProperty(ClassDescriptor classDescriptor) {
        if (classDescriptor == null) {
            m18340a(26);
            throw null;
        }
        ModuleDescriptor containingModule = DescriptorUtils.getContainingModule(classDescriptor);
        ClassDescriptor classDescriptorFindEnumEntriesClass = StdlibClassFinderKt.getStdlibClassFinder(containingModule).findEnumEntriesClass(containingModule);
        if (classDescriptorFindEnumEntriesClass == null) {
            return null;
        }
        Annotations.Companion companion = Annotations.Companion;
        Annotations empty = companion.getEMPTY();
        Modality modality = Modality.FINAL;
        DescriptorVisibility descriptorVisibility = DescriptorVisibilities.PUBLIC;
        Name name = StandardNames.ENUM_ENTRIES;
        CallableMemberDescriptor.Kind kind = CallableMemberDescriptor.Kind.SYNTHESIZED;
        PropertyDescriptorImpl propertyDescriptorImplCreate = PropertyDescriptorImpl.create(classDescriptor, empty, modality, descriptorVisibility, false, name, kind, classDescriptor.getSource(), false, false, false, false, false, false);
        PropertyGetterDescriptorImpl propertyGetterDescriptorImpl = new PropertyGetterDescriptorImpl(propertyDescriptorImplCreate, companion.getEMPTY(), modality, descriptorVisibility, false, false, false, kind, null, classDescriptor.getSource());
        propertyDescriptorImplCreate.initialize(propertyGetterDescriptorImpl, null);
        propertyDescriptorImplCreate.setType(KotlinTypeFactory.simpleType(TypeAttributes.Companion.getEmpty(), classDescriptorFindEnumEntriesClass.getTypeConstructor(), Collections.singletonList(new TypeProjectionImpl(classDescriptor.getDefaultType())), false), Collections.emptyList(), null, null, Collections.emptyList());
        propertyGetterDescriptorImpl.initialize(propertyDescriptorImplCreate.getReturnType());
        return propertyDescriptorImplCreate;
    }

    public static SimpleFunctionDescriptor createEnumValueOfMethod(ClassDescriptor classDescriptor) {
        if (classDescriptor == null) {
            m18340a(24);
            throw null;
        }
        Annotations.Companion companion = Annotations.Companion;
        SimpleFunctionDescriptorImpl simpleFunctionDescriptorImplCreate = SimpleFunctionDescriptorImpl.create(classDescriptor, companion.getEMPTY(), StandardNames.ENUM_VALUE_OF, CallableMemberDescriptor.Kind.SYNTHESIZED, classDescriptor.getSource());
        SimpleFunctionDescriptorImpl simpleFunctionDescriptorImplInitialize = simpleFunctionDescriptorImplCreate.initialize((ReceiverParameterDescriptor) null, (ReceiverParameterDescriptor) null, Collections.emptyList(), Collections.emptyList(), Collections.singletonList(new ValueParameterDescriptorImpl(simpleFunctionDescriptorImplCreate, null, 0, companion.getEMPTY(), Name.identifier("value"), DescriptorUtilsKt.getBuiltIns(classDescriptor).getStringType(), false, false, false, null, classDescriptor.getSource())), (KotlinType) classDescriptor.getDefaultType(), Modality.FINAL, DescriptorVisibilities.PUBLIC);
        if (simpleFunctionDescriptorImplInitialize != null) {
            return simpleFunctionDescriptorImplInitialize;
        }
        m18340a(25);
        throw null;
    }

    public static SimpleFunctionDescriptor createEnumValuesMethod(ClassDescriptor classDescriptor) {
        if (classDescriptor == null) {
            m18340a(22);
            throw null;
        }
        SimpleFunctionDescriptorImpl simpleFunctionDescriptorImplInitialize = SimpleFunctionDescriptorImpl.create(classDescriptor, Annotations.Companion.getEMPTY(), StandardNames.ENUM_VALUES, CallableMemberDescriptor.Kind.SYNTHESIZED, classDescriptor.getSource()).initialize((ReceiverParameterDescriptor) null, (ReceiverParameterDescriptor) null, Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), (KotlinType) DescriptorUtilsKt.getBuiltIns(classDescriptor).getArrayType(Variance.INVARIANT, classDescriptor.getDefaultType()), Modality.FINAL, DescriptorVisibilities.PUBLIC);
        if (simpleFunctionDescriptorImplInitialize != null) {
            return simpleFunctionDescriptorImplInitialize;
        }
        m18340a(23);
        throw null;
    }

    public static ReceiverParameterDescriptor createExtensionReceiverParameterForCallable(CallableDescriptor callableDescriptor, KotlinType kotlinType, Annotations annotations) {
        if (callableDescriptor == null) {
            m18340a(30);
            throw null;
        }
        if (annotations == null) {
            m18340a(31);
            throw null;
        }
        if (kotlinType == null) {
            return null;
        }
        return new ReceiverParameterDescriptorImpl(callableDescriptor, new ExtensionReceiver(callableDescriptor, kotlinType, null), annotations);
    }

    public static PropertyGetterDescriptorImpl createGetter(PropertyDescriptor propertyDescriptor, Annotations annotations, boolean z6, boolean z10, boolean z11) {
        if (propertyDescriptor == null) {
            m18340a(15);
            throw null;
        }
        if (annotations != null) {
            return createGetter(propertyDescriptor, annotations, z6, z10, z11, propertyDescriptor.getSource());
        }
        m18340a(16);
        throw null;
    }

    public static ClassConstructorDescriptorImpl createPrimaryConstructorForObject(ClassDescriptor classDescriptor, SourceElement sourceElement) {
        if (classDescriptor == null) {
            m18340a(20);
            throw null;
        }
        if (sourceElement == null) {
            m18340a(21);
            throw null;
        }
        if (classDescriptor == null) {
            C14199d.m15509a(0);
            throw null;
        }
        if (sourceElement == null) {
            C14199d.m15509a(1);
            throw null;
        }
        C14199d c14199d = new C14199d(classDescriptor, null, Annotations.Companion.getEMPTY(), true, CallableMemberDescriptor.Kind.DECLARATION, sourceElement);
        c14199d.initialize(Collections.emptyList(), DescriptorUtils.getDefaultConstructorVisibility(classDescriptor, false));
        return c14199d;
    }

    public static PropertySetterDescriptorImpl createSetter(PropertyDescriptor propertyDescriptor, Annotations annotations, Annotations annotations2, boolean z6, boolean z10, boolean z11, SourceElement sourceElement) {
        if (propertyDescriptor == null) {
            m18340a(3);
            throw null;
        }
        if (annotations == null) {
            m18340a(4);
            throw null;
        }
        if (annotations2 == null) {
            m18340a(5);
            throw null;
        }
        if (sourceElement != null) {
            return createSetter(propertyDescriptor, annotations, annotations2, z6, z10, z11, propertyDescriptor.getVisibility(), sourceElement);
        }
        m18340a(6);
        throw null;
    }

    public static boolean isEnumValueOfMethod(FunctionDescriptor functionDescriptor) {
        if (functionDescriptor != null) {
            return functionDescriptor.getName().equals(StandardNames.ENUM_VALUE_OF) && m18341b(functionDescriptor);
        }
        m18340a(28);
        throw null;
    }

    public static boolean isEnumValuesMethod(FunctionDescriptor functionDescriptor) {
        if (functionDescriptor != null) {
            return functionDescriptor.getName().equals(StandardNames.ENUM_VALUES) && m18341b(functionDescriptor);
        }
        m18340a(27);
        throw null;
    }

    public static PropertyGetterDescriptorImpl createGetter(PropertyDescriptor propertyDescriptor, Annotations annotations, boolean z6, boolean z10, boolean z11, SourceElement sourceElement) {
        if (propertyDescriptor == null) {
            m18340a(17);
            throw null;
        }
        if (annotations == null) {
            m18340a(18);
            throw null;
        }
        if (sourceElement != null) {
            return new PropertyGetterDescriptorImpl(propertyDescriptor, annotations, propertyDescriptor.getModality(), propertyDescriptor.getVisibility(), z6, z10, z11, CallableMemberDescriptor.Kind.DECLARATION, null, sourceElement);
        }
        m18340a(19);
        throw null;
    }

    public static PropertySetterDescriptorImpl createSetter(PropertyDescriptor propertyDescriptor, Annotations annotations, Annotations annotations2, boolean z6, boolean z10, boolean z11, DescriptorVisibility descriptorVisibility, SourceElement sourceElement) {
        if (propertyDescriptor == null) {
            m18340a(7);
            throw null;
        }
        if (annotations == null) {
            m18340a(8);
            throw null;
        }
        if (annotations2 == null) {
            m18340a(9);
            throw null;
        }
        if (descriptorVisibility == null) {
            m18340a(10);
            throw null;
        }
        if (sourceElement != null) {
            PropertySetterDescriptorImpl propertySetterDescriptorImpl = new PropertySetterDescriptorImpl(propertyDescriptor, annotations, propertyDescriptor.getModality(), descriptorVisibility, z6, z10, z11, CallableMemberDescriptor.Kind.DECLARATION, null, sourceElement);
            propertySetterDescriptorImpl.initialize(PropertySetterDescriptorImpl.createSetterParameter(propertySetterDescriptorImpl, propertyDescriptor.getType(), annotations2));
            return propertySetterDescriptorImpl;
        }
        m18340a(11);
        throw null;
    }
}
