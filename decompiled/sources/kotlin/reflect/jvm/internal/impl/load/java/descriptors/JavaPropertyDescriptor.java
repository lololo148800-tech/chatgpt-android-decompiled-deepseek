package kotlin.reflect.jvm.internal.impl.load.java.descriptors;

import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ConstUtil;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertySetterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyGetterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertySetterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeEnhancementKt;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorFactory;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import mm.C17309l;
import p049Bm.InterfaceC1426a;
import p909nm.C17689w;

/* JADX INFO: loaded from: classes2.dex */
public class JavaPropertyDescriptor extends PropertyDescriptorImpl implements JavaCallableMemberDescriptor {

    /* JADX INFO: renamed from: O0 */
    public final boolean f51831O0;

    /* JADX INFO: renamed from: P0 */
    public final C17309l f51832P0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JavaPropertyDescriptor(DeclarationDescriptor declarationDescriptor, Annotations annotations, Modality modality, DescriptorVisibility descriptorVisibility, boolean z6, Name name, SourceElement sourceElement, PropertyDescriptor propertyDescriptor, CallableMemberDescriptor.Kind kind, boolean z10, C17309l c17309l) {
        super(declarationDescriptor, propertyDescriptor, annotations, modality, descriptorVisibility, z6, name, kind, sourceElement, false, false, false, false, false, false);
        if (declarationDescriptor == null) {
            m18184a(0);
            throw null;
        }
        if (annotations == null) {
            m18184a(1);
            throw null;
        }
        if (modality == null) {
            m18184a(2);
            throw null;
        }
        if (descriptorVisibility == null) {
            m18184a(3);
            throw null;
        }
        if (name == null) {
            m18184a(4);
            throw null;
        }
        if (sourceElement == null) {
            m18184a(5);
            throw null;
        }
        if (kind == null) {
            m18184a(6);
            throw null;
        }
        this.f51831O0 = z10;
        this.f51832P0 = c17309l;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m18184a(int i10) {
        String str = i10 != 21 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i10 != 21 ? 3 : 2];
        switch (i10) {
            case 1:
            case 8:
                objArr[0] = "annotations";
                break;
            case 2:
            case 9:
                objArr[0] = "modality";
                break;
            case 3:
            case 10:
                objArr[0] = "visibility";
                break;
            case 4:
            case 11:
                objArr[0] = DiagnosticsEntry.NAME_KEY;
                break;
            case 5:
            case 12:
            case 18:
                objArr[0] = "source";
                break;
            case 6:
            case 16:
                objArr[0] = "kind";
                break;
            case 7:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 13:
                objArr[0] = "newOwner";
                break;
            case 14:
                objArr[0] = "newModality";
                break;
            case 15:
                objArr[0] = "newVisibility";
                break;
            case 17:
                objArr[0] = "newName";
                break;
            case 19:
                objArr[0] = "enhancedValueParameterTypes";
                break;
            case 20:
                objArr[0] = "enhancedReturnType";
                break;
            case 21:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaPropertyDescriptor";
                break;
            case 22:
                objArr[0] = "inType";
                break;
        }
        if (i10 != 21) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaPropertyDescriptor";
        } else {
            objArr[1] = "enhance";
        }
        switch (i10) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                objArr[2] = "create";
                break;
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 19:
            case 20:
                objArr[2] = "enhance";
                break;
            case 21:
                break;
            case 22:
                objArr[2] = "setInType";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i10 == 21) {
            throw new IllegalStateException(str2);
        }
    }

    public static JavaPropertyDescriptor create(DeclarationDescriptor declarationDescriptor, Annotations annotations, Modality modality, DescriptorVisibility descriptorVisibility, boolean z6, Name name, SourceElement sourceElement, boolean z10) {
        if (declarationDescriptor == null) {
            m18184a(7);
            throw null;
        }
        if (annotations == null) {
            m18184a(8);
            throw null;
        }
        if (modality == null) {
            m18184a(9);
            throw null;
        }
        if (descriptorVisibility == null) {
            m18184a(10);
            throw null;
        }
        if (name == null) {
            m18184a(11);
            throw null;
        }
        if (sourceElement != null) {
            return new JavaPropertyDescriptor(declarationDescriptor, annotations, modality, descriptorVisibility, z6, name, sourceElement, null, CallableMemberDescriptor.Kind.DECLARATION, z10, null);
        }
        m18184a(12);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyDescriptorImpl
    /* JADX INFO: renamed from: b */
    public final PropertyDescriptorImpl mo18152b(DeclarationDescriptor declarationDescriptor, Modality modality, DescriptorVisibility descriptorVisibility, PropertyDescriptor propertyDescriptor, CallableMemberDescriptor.Kind kind, Name name, SourceElement sourceElement) {
        if (declarationDescriptor == null) {
            m18184a(13);
            throw null;
        }
        if (modality == null) {
            m18184a(14);
            throw null;
        }
        if (descriptorVisibility == null) {
            m18184a(15);
            throw null;
        }
        if (kind == null) {
            m18184a(16);
            throw null;
        }
        if (name == null) {
            m18184a(17);
            throw null;
        }
        if (sourceElement != null) {
            return new JavaPropertyDescriptor(declarationDescriptor, getAnnotations(), modality, descriptorVisibility, isVar(), name, sourceElement, propertyDescriptor, kind, this.f51831O0, this.f51832P0);
        }
        m18184a(18);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaCallableMemberDescriptor
    public JavaCallableMemberDescriptor enhance(KotlinType kotlinType, List<KotlinType> list, KotlinType kotlinType2, C17309l c17309l) {
        PropertyGetterDescriptorImpl propertyGetterDescriptorImpl;
        PropertySetterDescriptorImpl propertySetterDescriptorImpl;
        if (list == null) {
            m18184a(19);
            throw null;
        }
        if (kotlinType2 == null) {
            m18184a(20);
            throw null;
        }
        PropertyDescriptor original = getOriginal() == this ? null : getOriginal();
        JavaPropertyDescriptor javaPropertyDescriptor = new JavaPropertyDescriptor(getContainingDeclaration(), getAnnotations(), getModality(), getVisibility(), isVar(), getName(), getSource(), original, getKind(), this.f51831O0, c17309l);
        PropertyGetterDescriptorImpl getter = getGetter();
        if (getter != null) {
            propertyGetterDescriptorImpl = propertyGetterDescriptorImpl;
            PropertyGetterDescriptorImpl propertyGetterDescriptorImpl2 = new PropertyGetterDescriptorImpl(javaPropertyDescriptor, getter.getAnnotations(), getter.getModality(), getter.getVisibility(), getter.isDefault(), getter.isExternal(), getter.isInline(), getKind(), original == null ? null : original.getGetter(), getter.getSource());
            propertyGetterDescriptorImpl.setInitialSignatureDescriptor(getter.getInitialSignatureDescriptor());
            propertyGetterDescriptorImpl.initialize(kotlinType2);
        } else {
            propertyGetterDescriptorImpl = null;
        }
        PropertySetterDescriptor setter = getSetter();
        if (setter != null) {
            PropertySetterDescriptorImpl propertySetterDescriptorImpl2 = new PropertySetterDescriptorImpl(javaPropertyDescriptor, setter.getAnnotations(), setter.getModality(), setter.getVisibility(), setter.isDefault(), setter.isExternal(), setter.isInline(), getKind(), original == null ? null : original.getSetter(), setter.getSource());
            propertySetterDescriptorImpl2.setInitialSignatureDescriptor(propertySetterDescriptorImpl2.getInitialSignatureDescriptor());
            propertySetterDescriptorImpl2.initialize(setter.getValueParameters().get(0));
            propertySetterDescriptorImpl = propertySetterDescriptorImpl2;
        } else {
            propertySetterDescriptorImpl = null;
        }
        javaPropertyDescriptor.initialize(propertyGetterDescriptorImpl, propertySetterDescriptorImpl, getBackingField(), getDelegateField());
        javaPropertyDescriptor.setSetterProjectedOut(isSetterProjectedOut());
        InterfaceC1426a interfaceC1426a = this.f51656t0;
        if (interfaceC1426a != null) {
            javaPropertyDescriptor.setCompileTimeInitializer(this.f51655s0, interfaceC1426a);
        }
        javaPropertyDescriptor.setOverriddenDescriptors(getOverriddenDescriptors());
        javaPropertyDescriptor.setType(kotlinType2, getTypeParameters(), getDispatchReceiverParameter(), kotlinType == null ? null : DescriptorFactory.createExtensionReceiverParameterForCallable(this, kotlinType, Annotations.Companion.getEMPTY()), C17689w.f56480Y);
        return javaPropertyDescriptor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.VariableDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    public <V> V getUserData(CallableDescriptor.UserDataKey<V> userDataKey) {
        C17309l c17309l = this.f51832P0;
        if (c17309l == null || !((CallableDescriptor.UserDataKey) c17309l.f55136Y).equals(userDataKey)) {
            return null;
        }
        return (V) c17309l.f55137Z;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.VariableDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    public boolean hasSynthesizedParameterNames() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.VariableDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptor
    public boolean isConst() {
        KotlinType type = getType();
        return this.f51831O0 && ConstUtil.canBeUsedForConstVal(type) && (!TypeEnhancementKt.hasEnhancedNullability(type) || KotlinBuiltIns.isString(type));
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyDescriptorImpl
    public void setInType(KotlinType kotlinType) {
        if (kotlinType != null) {
            return;
        }
        m18184a(22);
        throw null;
    }
}
