package kotlin.reflect.jvm.internal.impl.types;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17682p;

/* JADX INFO: loaded from: classes2.dex */
public final class StarProjectionImplKt {
    /* JADX INFO: renamed from: a */
    public static final KotlinType m18419a(final ArrayList arrayList, List list, KotlinBuiltIns kotlinBuiltIns) {
        KotlinType kotlinTypeSubstitute = TypeSubstitutor.create(new TypeConstructorSubstitution() { // from class: kotlin.reflect.jvm.internal.impl.types.StarProjectionImplKt$buildStarProjectionTypeByTypeParameters$1
            @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructorSubstitution
            public TypeProjection get(TypeConstructor key) {
                AbstractC16544l.m18094g(key, "key");
                if (!arrayList.contains(key)) {
                    return null;
                }
                ClassifierDescriptor classifierDescriptorMo22589getDeclarationDescriptor = key.mo22589getDeclarationDescriptor();
                AbstractC16544l.m18092e(classifierDescriptorMo22589getDeclarationDescriptor, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.TypeParameterDescriptor");
                return TypeUtils.makeStarProjection((TypeParameterDescriptor) classifierDescriptorMo22589getDeclarationDescriptor);
            }
        }).substitute((KotlinType) AbstractC17680n.m19341Q(list), Variance.OUT_VARIANCE);
        if (kotlinTypeSubstitute != null) {
            return kotlinTypeSubstitute;
        }
        SimpleType defaultBound = kotlinBuiltIns.getDefaultBound();
        AbstractC16544l.m18093f(defaultBound, "getDefaultBound(...)");
        return defaultBound;
    }

    public static final KotlinType starProjectionType(TypeParameterDescriptor typeParameterDescriptor) {
        AbstractC16544l.m18094g(typeParameterDescriptor, "<this>");
        DeclarationDescriptor containingDeclaration = typeParameterDescriptor.getContainingDeclaration();
        AbstractC16544l.m18093f(containingDeclaration, "getContainingDeclaration(...)");
        if (containingDeclaration instanceof ClassifierDescriptorWithTypeParameters) {
            List<TypeParameterDescriptor> parameters = ((ClassifierDescriptorWithTypeParameters) containingDeclaration).getTypeConstructor().getParameters();
            AbstractC16544l.m18093f(parameters, "getParameters(...)");
            List<TypeParameterDescriptor> list = parameters;
            ArrayList arrayList = new ArrayList(AbstractC17682p.m19389r(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                TypeConstructor typeConstructor = ((TypeParameterDescriptor) it.next()).getTypeConstructor();
                AbstractC16544l.m18093f(typeConstructor, "getTypeConstructor(...)");
                arrayList.add(typeConstructor);
            }
            List<KotlinType> upperBounds = typeParameterDescriptor.getUpperBounds();
            AbstractC16544l.m18093f(upperBounds, "getUpperBounds(...)");
            return m18419a(arrayList, upperBounds, DescriptorUtilsKt.getBuiltIns(typeParameterDescriptor));
        }
        if (!(containingDeclaration instanceof FunctionDescriptor)) {
            throw new IllegalArgumentException("Unsupported descriptor type to build star projection type based on type parameters of it");
        }
        List<TypeParameterDescriptor> typeParameters = ((FunctionDescriptor) containingDeclaration).getTypeParameters();
        AbstractC16544l.m18093f(typeParameters, "getTypeParameters(...)");
        List<TypeParameterDescriptor> list2 = typeParameters;
        ArrayList arrayList2 = new ArrayList(AbstractC17682p.m19389r(list2, 10));
        Iterator<T> it2 = list2.iterator();
        while (it2.hasNext()) {
            TypeConstructor typeConstructor2 = ((TypeParameterDescriptor) it2.next()).getTypeConstructor();
            AbstractC16544l.m18093f(typeConstructor2, "getTypeConstructor(...)");
            arrayList2.add(typeConstructor2);
        }
        List<KotlinType> upperBounds2 = typeParameterDescriptor.getUpperBounds();
        AbstractC16544l.m18093f(upperBounds2, "getUpperBounds(...)");
        return m18419a(arrayList2, upperBounds2, DescriptorUtilsKt.getBuiltIns(typeParameterDescriptor));
    }
}
