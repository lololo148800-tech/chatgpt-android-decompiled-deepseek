package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;
import p1091wn.AbstractC21031l;
import p1091wn.C21028i;
import p1091wn.C21034o;
import p388Pm.C6507a;
import p388Pm.C6510d;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17682p;
import p909nm.C17689w;

/* JADX INFO: loaded from: classes2.dex */
public final class TypeParameterUtilsKt {
    /* JADX INFO: renamed from: a */
    public static final PossiblyInnerType m18126a(KotlinType kotlinType, ClassifierDescriptorWithTypeParameters classifierDescriptorWithTypeParameters, int i10) {
        if (classifierDescriptorWithTypeParameters == null || ErrorUtils.isError(classifierDescriptorWithTypeParameters)) {
            return null;
        }
        int size = classifierDescriptorWithTypeParameters.getDeclaredTypeParameters().size() + i10;
        if (classifierDescriptorWithTypeParameters.isInner()) {
            List<TypeProjection> listSubList = kotlinType.getArguments().subList(i10, size);
            DeclarationDescriptor containingDeclaration = classifierDescriptorWithTypeParameters.getContainingDeclaration();
            return new PossiblyInnerType(classifierDescriptorWithTypeParameters, listSubList, m18126a(kotlinType, containingDeclaration instanceof ClassifierDescriptorWithTypeParameters ? (ClassifierDescriptorWithTypeParameters) containingDeclaration : null, size));
        }
        if (size != kotlinType.getArguments().size()) {
            DescriptorUtils.isLocal(classifierDescriptorWithTypeParameters);
        }
        return new PossiblyInnerType(classifierDescriptorWithTypeParameters, kotlinType.getArguments().subList(i10, kotlinType.getArguments().size()), null);
    }

    public static final PossiblyInnerType buildPossiblyInnerType(KotlinType kotlinType) {
        AbstractC16544l.m18094g(kotlinType, "<this>");
        ClassifierDescriptor classifierDescriptorMo22589getDeclarationDescriptor = kotlinType.getConstructor().mo22589getDeclarationDescriptor();
        return m18126a(kotlinType, classifierDescriptorMo22589getDeclarationDescriptor instanceof ClassifierDescriptorWithTypeParameters ? (ClassifierDescriptorWithTypeParameters) classifierDescriptorMo22589getDeclarationDescriptor : null, 0);
    }

    public static final List<TypeParameterDescriptor> computeConstructorTypeParameters(ClassifierDescriptorWithTypeParameters classifierDescriptorWithTypeParameters) {
        List<TypeParameterDescriptor> parameters;
        Object next;
        TypeConstructor typeConstructor;
        AbstractC16544l.m18094g(classifierDescriptorWithTypeParameters, "<this>");
        List<TypeParameterDescriptor> declaredTypeParameters = classifierDescriptorWithTypeParameters.getDeclaredTypeParameters();
        AbstractC16544l.m18093f(declaredTypeParameters, "getDeclaredTypeParameters(...)");
        if (!classifierDescriptorWithTypeParameters.isInner() && !(classifierDescriptorWithTypeParameters.getContainingDeclaration() instanceof CallableDescriptor)) {
            return declaredTypeParameters;
        }
        List listM21499w = AbstractC21031l.m21499w(new C21028i(AbstractC21031l.m21487k(AbstractC21031l.m21498v(DescriptorUtilsKt.getParents(classifierDescriptorWithTypeParameters), C6510d.f21114p0), C6510d.f21115q0), C6510d.f21116r0, C21034o.f66913Y));
        Iterator it = DescriptorUtilsKt.getParents(classifierDescriptorWithTypeParameters).iterator();
        do {
            parameters = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!(next instanceof ClassDescriptor));
        ClassDescriptor classDescriptor = (ClassDescriptor) next;
        if (classDescriptor != null && (typeConstructor = classDescriptor.getTypeConstructor()) != null) {
            parameters = typeConstructor.getParameters();
        }
        if (parameters == null) {
            parameters = C17689w.f56480Y;
        }
        if (listM21499w.isEmpty() && parameters.isEmpty()) {
            List<TypeParameterDescriptor> declaredTypeParameters2 = classifierDescriptorWithTypeParameters.getDeclaredTypeParameters();
            AbstractC16544l.m18093f(declaredTypeParameters2, "getDeclaredTypeParameters(...)");
            return declaredTypeParameters2;
        }
        ArrayList<TypeParameterDescriptor> arrayListM19361k0 = AbstractC17680n.m19361k0(parameters, listM21499w);
        ArrayList arrayList = new ArrayList(AbstractC17682p.m19389r(arrayListM19361k0, 10));
        for (TypeParameterDescriptor typeParameterDescriptor : arrayListM19361k0) {
            AbstractC16544l.m18091d(typeParameterDescriptor);
            arrayList.add(new C6507a(typeParameterDescriptor, classifierDescriptorWithTypeParameters, declaredTypeParameters.size()));
        }
        return AbstractC17680n.m19361k0(arrayList, declaredTypeParameters);
    }
}
