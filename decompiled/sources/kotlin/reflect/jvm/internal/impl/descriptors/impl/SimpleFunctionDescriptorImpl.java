package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import java.util.LinkedHashMap;
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
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* JADX INFO: loaded from: classes2.dex */
public class SimpleFunctionDescriptorImpl extends FunctionDescriptorImpl implements SimpleFunctionDescriptor {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SimpleFunctionDescriptorImpl(DeclarationDescriptor declarationDescriptor, SimpleFunctionDescriptor simpleFunctionDescriptor, Annotations annotations, Name name, CallableMemberDescriptor.Kind kind, SourceElement sourceElement) {
        super(declarationDescriptor, simpleFunctionDescriptor, kind, name, annotations, sourceElement);
        if (declarationDescriptor == null) {
            m18157a(0);
            throw null;
        }
        if (annotations == null) {
            m18157a(1);
            throw null;
        }
        if (name == null) {
            m18157a(2);
            throw null;
        }
        if (kind == null) {
            m18157a(3);
            throw null;
        }
        if (sourceElement != null) {
        } else {
            m18157a(4);
            throw null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m18157a(int i10) {
        String str = (i10 == 13 || i10 == 18 || i10 == 23 || i10 == 24 || i10 == 29 || i10 == 30) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 13 || i10 == 18 || i10 == 23 || i10 == 24 || i10 == 29 || i10 == 30) ? 2 : 3];
        switch (i10) {
            case 1:
            case 6:
            case 27:
                objArr[0] = "annotations";
                break;
            case 2:
            case 7:
                objArr[0] = DiagnosticsEntry.NAME_KEY;
                break;
            case 3:
            case 8:
            case 26:
                objArr[0] = "kind";
                break;
            case 4:
            case 9:
            case 28:
                objArr[0] = "source";
                break;
            case 5:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 10:
            case 15:
            case 20:
                objArr[0] = "typeParameters";
                break;
            case 11:
            case 16:
            case 21:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 12:
            case 17:
            case 22:
                objArr[0] = "visibility";
                break;
            case 13:
            case 18:
            case 23:
            case 24:
            case 29:
            case 30:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/SimpleFunctionDescriptorImpl";
                break;
            case 14:
            case 19:
                objArr[0] = "contextReceiverParameters";
                break;
            case 25:
                objArr[0] = "newOwner";
                break;
        }
        if (i10 == 13 || i10 == 18 || i10 == 23) {
            objArr[1] = "initialize";
        } else if (i10 == 24) {
            objArr[1] = "getOriginal";
        } else if (i10 == 29) {
            objArr[1] = "copy";
        } else if (i10 != 30) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/SimpleFunctionDescriptorImpl";
        } else {
            objArr[1] = "newCopyBuilder";
        }
        switch (i10) {
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                objArr[2] = "create";
                break;
            case 10:
            case 11:
            case 12:
            case 14:
            case 15:
            case 16:
            case 17:
            case 19:
            case 20:
            case 21:
            case 22:
                objArr[2] = "initialize";
                break;
            case 13:
            case 18:
            case 23:
            case 24:
            case 29:
            case 30:
                break;
            case 25:
            case 26:
            case 27:
            case 28:
                objArr[2] = "createSubstitutedCopy";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i10 != 13 && i10 != 18 && i10 != 23 && i10 != 24 && i10 != 29 && i10 != 30) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public static SimpleFunctionDescriptorImpl create(DeclarationDescriptor declarationDescriptor, Annotations annotations, Name name, CallableMemberDescriptor.Kind kind, SourceElement sourceElement) {
        if (declarationDescriptor == null) {
            m18157a(5);
            throw null;
        }
        if (annotations == null) {
            m18157a(6);
            throw null;
        }
        if (name == null) {
            m18157a(7);
            throw null;
        }
        if (kind == null) {
            m18157a(8);
            throw null;
        }
        if (sourceElement != null) {
            return new SimpleFunctionDescriptorImpl(declarationDescriptor, null, annotations, name, kind, sourceElement);
        }
        m18157a(9);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl
    public FunctionDescriptorImpl createSubstitutedCopy(DeclarationDescriptor declarationDescriptor, FunctionDescriptor functionDescriptor, CallableMemberDescriptor.Kind kind, Name name, Annotations annotations, SourceElement sourceElement) {
        if (declarationDescriptor == null) {
            m18157a(25);
            throw null;
        }
        if (kind == null) {
            m18157a(26);
            throw null;
        }
        if (annotations == null) {
            m18157a(27);
            throw null;
        }
        SimpleFunctionDescriptor simpleFunctionDescriptor = (SimpleFunctionDescriptor) functionDescriptor;
        if (name == null) {
            name = getName();
        }
        return new SimpleFunctionDescriptorImpl(declarationDescriptor, simpleFunctionDescriptor, annotations, name, kind, sourceElement);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl
    public /* bridge */ /* synthetic */ FunctionDescriptorImpl initialize(ReceiverParameterDescriptor receiverParameterDescriptor, ReceiverParameterDescriptor receiverParameterDescriptor2, List list, List list2, List list3, KotlinType kotlinType, Modality modality, DescriptorVisibility descriptorVisibility) {
        return initialize(receiverParameterDescriptor, receiverParameterDescriptor2, (List<ReceiverParameterDescriptor>) list, (List<? extends TypeParameterDescriptor>) list2, (List<ValueParameterDescriptor>) list3, kotlinType, modality, descriptorVisibility);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor
    public FunctionDescriptor.CopyBuilder<? extends SimpleFunctionDescriptor> newCopyBuilder() {
        FunctionDescriptor.CopyBuilder copyBuilderNewCopyBuilder = super.newCopyBuilder();
        if (copyBuilderNewCopyBuilder != null) {
            return copyBuilderNewCopyBuilder;
        }
        m18157a(30);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl
    public SimpleFunctionDescriptorImpl initialize(ReceiverParameterDescriptor receiverParameterDescriptor, ReceiverParameterDescriptor receiverParameterDescriptor2, List<ReceiverParameterDescriptor> list, List<? extends TypeParameterDescriptor> list2, List<ValueParameterDescriptor> list3, KotlinType kotlinType, Modality modality, DescriptorVisibility descriptorVisibility) {
        if (list == null) {
            m18157a(14);
            throw null;
        }
        if (list2 == null) {
            m18157a(15);
            throw null;
        }
        if (list3 == null) {
            m18157a(16);
            throw null;
        }
        if (descriptorVisibility == null) {
            m18157a(17);
            throw null;
        }
        SimpleFunctionDescriptorImpl simpleFunctionDescriptorImplInitialize = initialize(receiverParameterDescriptor, receiverParameterDescriptor2, list, list2, list3, kotlinType, modality, descriptorVisibility, null);
        if (simpleFunctionDescriptorImplInitialize != null) {
            return simpleFunctionDescriptorImplInitialize;
        }
        m18157a(18);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    public SimpleFunctionDescriptor copy(DeclarationDescriptor declarationDescriptor, Modality modality, DescriptorVisibility descriptorVisibility, CallableMemberDescriptor.Kind kind, boolean z6) {
        SimpleFunctionDescriptor simpleFunctionDescriptor = (SimpleFunctionDescriptor) super.copy(declarationDescriptor, modality, descriptorVisibility, kind, z6);
        if (simpleFunctionDescriptor != null) {
            return simpleFunctionDescriptor;
        }
        m18157a(29);
        throw null;
    }

    public SimpleFunctionDescriptorImpl initialize(ReceiverParameterDescriptor receiverParameterDescriptor, ReceiverParameterDescriptor receiverParameterDescriptor2, List<ReceiverParameterDescriptor> list, List<? extends TypeParameterDescriptor> list2, List<ValueParameterDescriptor> list3, KotlinType kotlinType, Modality modality, DescriptorVisibility descriptorVisibility, Map<? extends CallableDescriptor.UserDataKey<?>, ?> map) {
        if (list == null) {
            m18157a(19);
            throw null;
        }
        if (list2 == null) {
            m18157a(20);
            throw null;
        }
        if (list3 == null) {
            m18157a(21);
            throw null;
        }
        if (descriptorVisibility != null) {
            super.initialize(receiverParameterDescriptor, receiverParameterDescriptor2, list, list2, list3, kotlinType, modality, descriptorVisibility);
            if (map != null && !map.isEmpty()) {
                this.f51517P0 = new LinkedHashMap(map);
            }
            return this;
        }
        m18157a(22);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorNonRootImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public SimpleFunctionDescriptor getOriginal() {
        SimpleFunctionDescriptor simpleFunctionDescriptor = (SimpleFunctionDescriptor) super.getOriginal();
        if (simpleFunctionDescriptor != null) {
            return simpleFunctionDescriptor;
        }
        m18157a(24);
        throw null;
    }
}
