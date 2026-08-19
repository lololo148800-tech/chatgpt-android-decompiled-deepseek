package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.SimpleFunctionDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.GivenFunctionsMemberScope;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import p571X9.AbstractC9393x3;
import p909nm.C17689w;

/* JADX INFO: loaded from: classes2.dex */
public final class CloneableClassScope extends GivenFunctionsMemberScope {
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: d */
    public static final Name f51340d;

    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public final Name getCLONE_NAME() {
            return CloneableClassScope.f51340d;
        }
    }

    static {
        Name nameIdentifier = Name.identifier("clone");
        AbstractC16544l.m18093f(nameIdentifier, "identifier(...)");
        f51340d = nameIdentifier;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CloneableClassScope(StorageManager storageManager, ClassDescriptor containingClass) {
        super(storageManager, containingClass);
        AbstractC16544l.m18094g(storageManager, "storageManager");
        AbstractC16544l.m18094g(containingClass, "containingClass");
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.GivenFunctionsMemberScope
    /* JADX INFO: renamed from: a */
    public final List mo5681a() {
        Annotations empty = Annotations.Companion.getEMPTY();
        CallableMemberDescriptor.Kind kind = CallableMemberDescriptor.Kind.DECLARATION;
        SourceElement sourceElement = SourceElement.NO_SOURCE;
        ClassDescriptor classDescriptor = this.f52931a;
        SimpleFunctionDescriptorImpl simpleFunctionDescriptorImplCreate = SimpleFunctionDescriptorImpl.create(classDescriptor, empty, f51340d, kind, sourceElement);
        ReceiverParameterDescriptor thisAsReceiverParameter = classDescriptor.getThisAsReceiverParameter();
        C17689w c17689w = C17689w.f56480Y;
        simpleFunctionDescriptorImplCreate.initialize((ReceiverParameterDescriptor) null, thisAsReceiverParameter, (List<ReceiverParameterDescriptor>) c17689w, (List<? extends TypeParameterDescriptor>) c17689w, (List<ValueParameterDescriptor>) c17689w, (KotlinType) DescriptorUtilsKt.getBuiltIns(classDescriptor).getAnyType(), Modality.OPEN, DescriptorVisibilities.PROTECTED);
        return AbstractC9393x3.m9974d(simpleFunctionDescriptorImplCreate);
    }
}
