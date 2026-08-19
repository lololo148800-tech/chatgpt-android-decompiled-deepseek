package kotlin.reflect.jvm.internal.impl.builtins;

import android.gov.nist.javax.sip.parser.TokenNames;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.EmptyPackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.MutableClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.TypeParameterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributes;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import p571X9.AbstractC9393x3;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17682p;

/* JADX INFO: loaded from: classes2.dex */
public final class SuspendFunctionTypesKt {

    /* JADX INFO: renamed from: a */
    public static final MutableClassDescriptor f51309a;

    static {
        EmptyPackageFragmentDescriptor emptyPackageFragmentDescriptor = new EmptyPackageFragmentDescriptor(ErrorUtils.INSTANCE.getErrorModule(), StandardNames.COROUTINES_PACKAGE_FQ_NAME);
        ClassKind classKind = ClassKind.INTERFACE;
        Name nameShortName = StandardNames.CONTINUATION_INTERFACE_FQ_NAME.shortName();
        SourceElement sourceElement = SourceElement.NO_SOURCE;
        StorageManager storageManager = LockBasedStorageManager.NO_LOCKS;
        MutableClassDescriptor mutableClassDescriptor = new MutableClassDescriptor(emptyPackageFragmentDescriptor, classKind, false, false, nameShortName, sourceElement, storageManager);
        mutableClassDescriptor.setModality(Modality.ABSTRACT);
        mutableClassDescriptor.setVisibility(DescriptorVisibilities.PUBLIC);
        mutableClassDescriptor.setTypeParameterDescriptors(AbstractC9393x3.m9974d(TypeParameterDescriptorImpl.createWithDefaultBound(mutableClassDescriptor, Annotations.Companion.getEMPTY(), false, Variance.IN_VARIANCE, Name.identifier(TokenNames.f32019T), 0, storageManager)));
        mutableClassDescriptor.createTypeConstructor();
        f51309a = mutableClassDescriptor;
    }

    public static final SimpleType transformSuspendFunctionToRuntimeFunctionType(KotlinType suspendFunType) {
        AbstractC16544l.m18094g(suspendFunType, "suspendFunType");
        FunctionTypesKt.isSuspendFunctionType(suspendFunType);
        KotlinBuiltIns builtIns = TypeUtilsKt.getBuiltIns(suspendFunType);
        Annotations annotations = suspendFunType.getAnnotations();
        KotlinType receiverTypeFromFunctionType = FunctionTypesKt.getReceiverTypeFromFunctionType(suspendFunType);
        List<KotlinType> contextReceiverTypesFromFunctionType = FunctionTypesKt.getContextReceiverTypesFromFunctionType(suspendFunType);
        List<TypeProjection> valueParameterTypesFromFunctionType = FunctionTypesKt.getValueParameterTypesFromFunctionType(suspendFunType);
        ArrayList arrayList = new ArrayList(AbstractC17682p.m19389r(valueParameterTypesFromFunctionType, 10));
        Iterator<T> it = valueParameterTypesFromFunctionType.iterator();
        while (it.hasNext()) {
            arrayList.add(((TypeProjection) it.next()).getType());
        }
        TypeAttributes empty = TypeAttributes.Companion.getEmpty();
        TypeConstructor typeConstructor = f51309a.getTypeConstructor();
        AbstractC16544l.m18093f(typeConstructor, "getTypeConstructor(...)");
        ArrayList arrayListM19362l0 = AbstractC17680n.m19362l0(arrayList, KotlinTypeFactory.simpleType$default(empty, typeConstructor, AbstractC9393x3.m9974d(TypeUtilsKt.asTypeProjection(FunctionTypesKt.getReturnTypeFromFunctionType(suspendFunType))), false, (KotlinTypeRefiner) null, 16, (Object) null));
        SimpleType nullableAnyType = TypeUtilsKt.getBuiltIns(suspendFunType).getNullableAnyType();
        AbstractC16544l.m18093f(nullableAnyType, "getNullableAnyType(...)");
        return FunctionTypesKt.createFunctionType(builtIns, annotations, receiverTypeFromFunctionType, contextReceiverTypesFromFunctionType, arrayListM19362l0, null, nullableAnyType, (128 & 128) != 0 ? false : false).makeNullableAsSpecified(suspendFunType.isMarkedNullable());
    }
}
