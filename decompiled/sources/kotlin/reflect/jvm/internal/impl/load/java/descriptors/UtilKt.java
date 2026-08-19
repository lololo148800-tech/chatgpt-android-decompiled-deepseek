package kotlin.reflect.jvm.internal.impl.load.java.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ValueParameterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaStaticClassScope;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import mm.C17309l;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17682p;

/* JADX INFO: loaded from: classes2.dex */
public final class UtilKt {
    public static final List<ValueParameterDescriptor> copyValueParameters(Collection<? extends KotlinType> newValueParameterTypes, Collection<? extends ValueParameterDescriptor> oldValueParameters, CallableDescriptor newOwner) {
        AbstractC16544l.m18094g(newValueParameterTypes, "newValueParameterTypes");
        AbstractC16544l.m18094g(oldValueParameters, "oldValueParameters");
        AbstractC16544l.m18094g(newOwner, "newOwner");
        newValueParameterTypes.size();
        oldValueParameters.size();
        ArrayList arrayListM19334J0 = AbstractC17680n.m19334J0(newValueParameterTypes, oldValueParameters);
        ArrayList arrayList = new ArrayList(AbstractC17682p.m19389r(arrayListM19334J0, 10));
        for (Iterator it = arrayListM19334J0.iterator(); it.hasNext(); it = it) {
            C17309l c17309l = (C17309l) it.next();
            KotlinType kotlinType = (KotlinType) c17309l.f55136Y;
            ValueParameterDescriptor valueParameterDescriptor = (ValueParameterDescriptor) c17309l.f55137Z;
            int index = valueParameterDescriptor.getIndex();
            Annotations annotations = valueParameterDescriptor.getAnnotations();
            Name name = valueParameterDescriptor.getName();
            AbstractC16544l.m18093f(name, "getName(...)");
            boolean zDeclaresDefaultValue = valueParameterDescriptor.declaresDefaultValue();
            boolean zIsCrossinline = valueParameterDescriptor.isCrossinline();
            boolean zIsNoinline = valueParameterDescriptor.isNoinline();
            KotlinType arrayElementType = valueParameterDescriptor.getVarargElementType() != null ? DescriptorUtilsKt.getModule(newOwner).getBuiltIns().getArrayElementType(kotlinType) : null;
            SourceElement source = valueParameterDescriptor.getSource();
            AbstractC16544l.m18093f(source, "getSource(...)");
            arrayList.add(new ValueParameterDescriptorImpl(newOwner, null, index, annotations, name, kotlinType, zDeclaresDefaultValue, zIsCrossinline, zIsNoinline, arrayElementType, source));
        }
        return arrayList;
    }

    public static final LazyJavaStaticClassScope getParentJavaStaticClassScope(ClassDescriptor classDescriptor) {
        AbstractC16544l.m18094g(classDescriptor, "<this>");
        ClassDescriptor superClassNotAny = DescriptorUtilsKt.getSuperClassNotAny(classDescriptor);
        if (superClassNotAny == null) {
            return null;
        }
        MemberScope staticScope = superClassNotAny.getStaticScope();
        LazyJavaStaticClassScope lazyJavaStaticClassScope = staticScope instanceof LazyJavaStaticClassScope ? (LazyJavaStaticClassScope) staticScope : null;
        return lazyJavaStaticClassScope == null ? getParentJavaStaticClassScope(superClassNotAny) : lazyJavaStaticClassScope;
    }
}
