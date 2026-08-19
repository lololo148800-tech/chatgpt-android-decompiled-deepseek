package kotlin.reflect.jvm.internal.impl.load.java.descriptors;

import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassConstructorDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorFactory;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import mm.C17309l;
import p909nm.C17689w;

/* JADX INFO: loaded from: classes2.dex */
public class JavaClassConstructorDescriptor extends ClassConstructorDescriptorImpl implements JavaCallableMemberDescriptor {

    /* JADX INFO: renamed from: R0 */
    public Boolean f51824R0;

    /* JADX INFO: renamed from: S0 */
    public Boolean f51825S0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JavaClassConstructorDescriptor(ClassDescriptor classDescriptor, JavaClassConstructorDescriptor javaClassConstructorDescriptor, Annotations annotations, boolean z6, CallableMemberDescriptor.Kind kind, SourceElement sourceElement) {
        super(classDescriptor, javaClassConstructorDescriptor, annotations, z6, kind, sourceElement);
        if (classDescriptor == null) {
            m18181a(0);
            throw null;
        }
        if (annotations == null) {
            m18181a(1);
            throw null;
        }
        if (kind == null) {
            m18181a(2);
            throw null;
        }
        if (sourceElement == null) {
            m18181a(3);
            throw null;
        }
        this.f51824R0 = null;
        this.f51825S0 = null;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m18181a(int i10) {
        String str = (i10 == 11 || i10 == 18) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 11 || i10 == 18) ? 2 : 3];
        switch (i10) {
            case 1:
            case 5:
            case 9:
            case 15:
                objArr[0] = "annotations";
                break;
            case 2:
            case 8:
            case 13:
                objArr[0] = "kind";
                break;
            case 3:
            case 6:
            case 10:
                objArr[0] = "source";
                break;
            case 4:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 7:
            case 12:
                objArr[0] = "newOwner";
                break;
            case 11:
            case 18:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaClassConstructorDescriptor";
                break;
            case 14:
                objArr[0] = "sourceElement";
                break;
            case 16:
                objArr[0] = "enhancedValueParameterTypes";
                break;
            case 17:
                objArr[0] = "enhancedReturnType";
                break;
        }
        if (i10 == 11) {
            objArr[1] = "createSubstitutedCopy";
        } else if (i10 != 18) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaClassConstructorDescriptor";
        } else {
            objArr[1] = "enhance";
        }
        switch (i10) {
            case 4:
            case 5:
            case 6:
                objArr[2] = "createJavaConstructor";
                break;
            case 7:
            case 8:
            case 9:
            case 10:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 11:
            case 18:
                break;
            case 12:
            case 13:
            case 14:
            case 15:
                objArr[2] = "createDescriptor";
                break;
            case 16:
            case 17:
                objArr[2] = "enhance";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i10 != 11 && i10 != 18) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public static JavaClassConstructorDescriptor createJavaConstructor(ClassDescriptor classDescriptor, Annotations annotations, boolean z6, SourceElement sourceElement) {
        if (classDescriptor == null) {
            m18181a(4);
            throw null;
        }
        if (annotations == null) {
            m18181a(5);
            throw null;
        }
        if (sourceElement != null) {
            return new JavaClassConstructorDescriptor(classDescriptor, null, annotations, z6, CallableMemberDescriptor.Kind.DECLARATION, sourceElement);
        }
        m18181a(6);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassConstructorDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl
    public final /* bridge */ /* synthetic */ ClassConstructorDescriptorImpl createSubstitutedCopy(DeclarationDescriptor declarationDescriptor, FunctionDescriptor functionDescriptor, CallableMemberDescriptor.Kind kind, Name name, Annotations annotations, SourceElement sourceElement) {
        return m18182d(declarationDescriptor, functionDescriptor, kind, annotations, sourceElement);
    }

    /* JADX INFO: renamed from: d */
    public final JavaClassConstructorDescriptor m18182d(DeclarationDescriptor declarationDescriptor, FunctionDescriptor functionDescriptor, CallableMemberDescriptor.Kind kind, Annotations annotations, SourceElement sourceElement) {
        if (declarationDescriptor == null) {
            m18181a(7);
            throw null;
        }
        if (kind == null) {
            m18181a(8);
            throw null;
        }
        if (annotations == null) {
            m18181a(9);
            throw null;
        }
        if (sourceElement == null) {
            m18181a(10);
            throw null;
        }
        if (kind == CallableMemberDescriptor.Kind.DECLARATION || kind == CallableMemberDescriptor.Kind.SYNTHESIZED) {
            JavaClassConstructorDescriptor javaClassConstructorDescriptor = new JavaClassConstructorDescriptor((ClassDescriptor) declarationDescriptor, (JavaClassConstructorDescriptor) functionDescriptor, annotations, this.f51482Q0, kind, sourceElement);
            javaClassConstructorDescriptor.setHasStableParameterNames(hasStableParameterNames());
            javaClassConstructorDescriptor.setHasSynthesizedParameterNames(hasSynthesizedParameterNames());
            return javaClassConstructorDescriptor;
        }
        throw new IllegalStateException("Attempt at creating a constructor that is not a declaration: \ncopy from: " + this + "\nnewOwner: " + declarationDescriptor + "\nkind: " + kind);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaCallableMemberDescriptor
    public /* bridge */ /* synthetic */ JavaCallableMemberDescriptor enhance(KotlinType kotlinType, List list, KotlinType kotlinType2, C17309l c17309l) {
        return enhance(kotlinType, (List<KotlinType>) list, kotlinType2, c17309l);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl
    public boolean hasStableParameterNames() {
        return this.f51824R0.booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    public boolean hasSynthesizedParameterNames() {
        return this.f51825S0.booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl
    public void setHasStableParameterNames(boolean z6) {
        this.f51824R0 = Boolean.valueOf(z6);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl
    public void setHasSynthesizedParameterNames(boolean z6) {
        this.f51825S0 = Boolean.valueOf(z6);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassConstructorDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl
    public final /* bridge */ /* synthetic */ FunctionDescriptorImpl createSubstitutedCopy(DeclarationDescriptor declarationDescriptor, FunctionDescriptor functionDescriptor, CallableMemberDescriptor.Kind kind, Name name, Annotations annotations, SourceElement sourceElement) {
        return m18182d(declarationDescriptor, functionDescriptor, kind, annotations, sourceElement);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaCallableMemberDescriptor
    public JavaClassConstructorDescriptor enhance(KotlinType kotlinType, List<KotlinType> list, KotlinType kotlinType2, C17309l c17309l) {
        if (list == null) {
            m18181a(16);
            throw null;
        }
        if (kotlinType2 == null) {
            m18181a(17);
            throw null;
        }
        JavaClassConstructorDescriptor javaClassConstructorDescriptorM18182d = m18182d(getContainingDeclaration(), null, getKind(), getAnnotations(), getSource());
        javaClassConstructorDescriptorM18182d.initialize(kotlinType != null ? DescriptorFactory.createExtensionReceiverParameterForCallable(javaClassConstructorDescriptorM18182d, kotlinType, Annotations.Companion.getEMPTY()) : null, getDispatchReceiverParameter(), C17689w.f56480Y, getTypeParameters(), UtilKt.copyValueParameters(list, getValueParameters(), javaClassConstructorDescriptorM18182d), kotlinType2, getModality(), getVisibility());
        if (c17309l != null) {
            javaClassConstructorDescriptorM18182d.putInUserDataMap((CallableDescriptor.UserDataKey) c17309l.f55136Y, c17309l.f55137Z);
        }
        return javaClassConstructorDescriptorM18182d;
    }
}
