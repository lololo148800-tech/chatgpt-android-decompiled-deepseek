package kotlin.reflect.jvm.internal.impl.types;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import p909nm.AbstractC17659D;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17682p;

/* JADX INFO: loaded from: classes2.dex */
public final class TypeAliasExpansion {
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: a */
    public final TypeAliasExpansion f53188a;

    /* JADX INFO: renamed from: b */
    public final TypeAliasDescriptor f53189b;

    /* JADX INFO: renamed from: c */
    public final List f53190c;

    /* JADX INFO: renamed from: d */
    public final Map f53191d;

    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public final TypeAliasExpansion create(TypeAliasExpansion typeAliasExpansion, TypeAliasDescriptor typeAliasDescriptor, List<? extends TypeProjection> arguments) {
            AbstractC16544l.m18094g(typeAliasDescriptor, "typeAliasDescriptor");
            AbstractC16544l.m18094g(arguments, "arguments");
            List<TypeParameterDescriptor> parameters = typeAliasDescriptor.getTypeConstructor().getParameters();
            AbstractC16544l.m18093f(parameters, "getParameters(...)");
            List<TypeParameterDescriptor> list = parameters;
            ArrayList arrayList = new ArrayList(AbstractC17682p.m19389r(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((TypeParameterDescriptor) it.next()).getOriginal());
            }
            return new TypeAliasExpansion(typeAliasExpansion, typeAliasDescriptor, arguments, AbstractC17659D.m19253o(AbstractC17680n.m19334J0(arrayList, arguments)), null);
        }
    }

    public TypeAliasExpansion(TypeAliasExpansion typeAliasExpansion, TypeAliasDescriptor typeAliasDescriptor, List list, Map map, DefaultConstructorMarker defaultConstructorMarker) {
        this.f53188a = typeAliasExpansion;
        this.f53189b = typeAliasDescriptor;
        this.f53190c = list;
        this.f53191d = map;
    }

    public final List<TypeProjection> getArguments() {
        return this.f53190c;
    }

    public final TypeAliasDescriptor getDescriptor() {
        return this.f53189b;
    }

    public final TypeProjection getReplacement(TypeConstructor constructor) {
        AbstractC16544l.m18094g(constructor, "constructor");
        ClassifierDescriptor classifierDescriptorMo22589getDeclarationDescriptor = constructor.mo22589getDeclarationDescriptor();
        if (classifierDescriptorMo22589getDeclarationDescriptor instanceof TypeParameterDescriptor) {
            return (TypeProjection) this.f53191d.get(classifierDescriptorMo22589getDeclarationDescriptor);
        }
        return null;
    }

    public final boolean isRecursion(TypeAliasDescriptor descriptor) {
        AbstractC16544l.m18094g(descriptor, "descriptor");
        if (!AbstractC16544l.m18089b(this.f53189b, descriptor)) {
            TypeAliasExpansion typeAliasExpansion = this.f53188a;
            if (!(typeAliasExpansion != null ? typeAliasExpansion.isRecursion(descriptor) : false)) {
                return false;
            }
        }
        return true;
    }
}
