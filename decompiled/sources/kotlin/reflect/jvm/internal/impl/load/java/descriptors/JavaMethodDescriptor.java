package kotlin.reflect.jvm.internal.impl.load.java.descriptors;

import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import java.util.List;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.SimpleFunctionDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorFactory;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.util.OperatorChecks;
import mm.C17309l;
import p558Wm.C8967a;
import p558Wm.C8968b;

/* JADX INFO: loaded from: classes2.dex */
public class JavaMethodDescriptor extends SimpleFunctionDescriptorImpl implements JavaCallableMemberDescriptor {

    /* JADX INFO: renamed from: Q0 */
    public int f51829Q0;

    /* JADX INFO: renamed from: R0 */
    public final boolean f51830R0;
    public static final CallableDescriptor.UserDataKey<ValueParameterDescriptor> ORIGINAL_VALUE_PARAMETER_FOR_EXTENSION_RECEIVER = new C8967a();
    public static final CallableDescriptor.UserDataKey<Boolean> HAS_ERASED_VALUE_PARAMETERS = new C8968b();

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JavaMethodDescriptor(DeclarationDescriptor declarationDescriptor, SimpleFunctionDescriptor simpleFunctionDescriptor, Annotations annotations, Name name, CallableMemberDescriptor.Kind kind, SourceElement sourceElement, boolean z6) {
        super(declarationDescriptor, simpleFunctionDescriptor, annotations, name, kind, sourceElement);
        if (declarationDescriptor == null) {
            m18183a(0);
            throw null;
        }
        if (annotations == null) {
            m18183a(1);
            throw null;
        }
        if (name == null) {
            m18183a(2);
            throw null;
        }
        if (kind == null) {
            m18183a(3);
            throw null;
        }
        if (sourceElement == null) {
            m18183a(4);
            throw null;
        }
        this.f51829Q0 = 0;
        this.f51830R0 = z6;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m18183a(int i10) {
        String str = (i10 == 13 || i10 == 18 || i10 == 21) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 13 || i10 == 18 || i10 == 21) ? 2 : 3];
        switch (i10) {
            case 1:
            case 6:
            case 16:
                objArr[0] = "annotations";
                break;
            case 2:
            case 7:
                objArr[0] = DiagnosticsEntry.NAME_KEY;
                break;
            case 3:
            case 15:
                objArr[0] = "kind";
                break;
            case 4:
            case 8:
            case 17:
                objArr[0] = "source";
                break;
            case 5:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 9:
                objArr[0] = "contextReceiverParameters";
                break;
            case 10:
                objArr[0] = "typeParameters";
                break;
            case 11:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 12:
                objArr[0] = "visibility";
                break;
            case 13:
            case 18:
            case 21:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaMethodDescriptor";
                break;
            case 14:
                objArr[0] = "newOwner";
                break;
            case 19:
                objArr[0] = "enhancedValueParameterTypes";
                break;
            case 20:
                objArr[0] = "enhancedReturnType";
                break;
        }
        if (i10 == 13) {
            objArr[1] = "initialize";
        } else if (i10 == 18) {
            objArr[1] = "createSubstitutedCopy";
        } else if (i10 != 21) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaMethodDescriptor";
        } else {
            objArr[1] = "enhance";
        }
        switch (i10) {
            case 5:
            case 6:
            case 7:
            case 8:
                objArr[2] = "createJavaMethod";
                break;
            case 9:
            case 10:
            case 11:
            case 12:
                objArr[2] = "initialize";
                break;
            case 13:
            case 18:
            case 21:
                break;
            case 14:
            case 15:
            case 16:
            case 17:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 19:
            case 20:
                objArr[2] = "enhance";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i10 != 13 && i10 != 18 && i10 != 21) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public static JavaMethodDescriptor createJavaMethod(DeclarationDescriptor declarationDescriptor, Annotations annotations, Name name, SourceElement sourceElement, boolean z6) {
        if (declarationDescriptor == null) {
            m18183a(5);
            throw null;
        }
        if (annotations == null) {
            m18183a(6);
            throw null;
        }
        if (name == null) {
            m18183a(7);
            throw null;
        }
        if (sourceElement != null) {
            return new JavaMethodDescriptor(declarationDescriptor, null, annotations, name, CallableMemberDescriptor.Kind.DECLARATION, sourceElement, z6);
        }
        m18183a(8);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.SimpleFunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl
    public final FunctionDescriptorImpl createSubstitutedCopy(DeclarationDescriptor declarationDescriptor, FunctionDescriptor functionDescriptor, CallableMemberDescriptor.Kind kind, Name name, Annotations annotations, SourceElement sourceElement) {
        if (declarationDescriptor == null) {
            m18183a(14);
            throw null;
        }
        if (kind == null) {
            m18183a(15);
            throw null;
        }
        if (annotations == null) {
            m18183a(16);
            throw null;
        }
        SimpleFunctionDescriptor simpleFunctionDescriptor = (SimpleFunctionDescriptor) functionDescriptor;
        if (name == null) {
            name = getName();
        }
        JavaMethodDescriptor javaMethodDescriptor = new JavaMethodDescriptor(declarationDescriptor, simpleFunctionDescriptor, annotations, name, kind, sourceElement, this.f51830R0);
        javaMethodDescriptor.setParameterNamesStatus(hasStableParameterNames(), hasSynthesizedParameterNames());
        return javaMethodDescriptor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaCallableMemberDescriptor
    public /* bridge */ /* synthetic */ JavaCallableMemberDescriptor enhance(KotlinType kotlinType, List list, KotlinType kotlinType2, C17309l c17309l) {
        return enhance(kotlinType, (List<KotlinType>) list, kotlinType2, c17309l);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl
    public boolean hasStableParameterNames() {
        int i10 = this.f51829Q0;
        if (i10 == 1) {
            return false;
        }
        if (i10 != 2) {
            if (i10 == 3) {
                return false;
            }
            if (i10 != 4) {
                throw null;
            }
        }
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    public boolean hasSynthesizedParameterNames() {
        int i10 = this.f51829Q0;
        if (i10 == 1 || i10 == 2) {
            return false;
        }
        if (i10 == 3 || i10 == 4) {
            return true;
        }
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.SimpleFunctionDescriptorImpl
    public SimpleFunctionDescriptorImpl initialize(ReceiverParameterDescriptor receiverParameterDescriptor, ReceiverParameterDescriptor receiverParameterDescriptor2, List<ReceiverParameterDescriptor> list, List<? extends TypeParameterDescriptor> list2, List<ValueParameterDescriptor> list3, KotlinType kotlinType, Modality modality, DescriptorVisibility descriptorVisibility, Map<? extends CallableDescriptor.UserDataKey<?>, ?> map) {
        if (list == null) {
            m18183a(9);
            throw null;
        }
        if (list2 == null) {
            m18183a(10);
            throw null;
        }
        if (list3 == null) {
            m18183a(11);
            throw null;
        }
        if (descriptorVisibility == null) {
            m18183a(12);
            throw null;
        }
        SimpleFunctionDescriptorImpl simpleFunctionDescriptorImplInitialize = super.initialize(receiverParameterDescriptor, receiverParameterDescriptor2, list, list2, list3, kotlinType, modality, descriptorVisibility, map);
        setOperator(OperatorChecks.INSTANCE.check(simpleFunctionDescriptorImplInitialize).isSuccess());
        if (simpleFunctionDescriptorImplInitialize != null) {
            return simpleFunctionDescriptorImplInitialize;
        }
        m18183a(13);
        throw null;
    }

    public void setParameterNamesStatus(boolean z6, boolean z10) {
        int i10;
        if (z6) {
            i10 = z10 ? 4 : 2;
        } else {
            i10 = z10 ? 3 : 1;
        }
        this.f51829Q0 = i10;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaCallableMemberDescriptor
    public JavaMethodDescriptor enhance(KotlinType kotlinType, List<KotlinType> list, KotlinType kotlinType2, C17309l c17309l) {
        if (list == null) {
            m18183a(19);
            throw null;
        }
        if (kotlinType2 == null) {
            m18183a(20);
            throw null;
        }
        JavaMethodDescriptor javaMethodDescriptor = (JavaMethodDescriptor) newCopyBuilder().setValueParameters(UtilKt.copyValueParameters(list, getValueParameters(), this)).setReturnType(kotlinType2).setExtensionReceiverParameter(kotlinType == null ? null : DescriptorFactory.createExtensionReceiverParameterForCallable(this, kotlinType, Annotations.Companion.getEMPTY())).setDropOriginalInContainingParts().setPreserveSourceElement().build();
        if (c17309l != null) {
            javaMethodDescriptor.putInUserDataMap((CallableDescriptor.UserDataKey) c17309l.f55136Y, c17309l.f55137Z);
        }
        if (javaMethodDescriptor != null) {
            return javaMethodDescriptor;
        }
        m18183a(21);
        throw null;
    }
}
