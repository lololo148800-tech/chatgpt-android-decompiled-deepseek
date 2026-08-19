package kotlin.reflect.jvm.internal.impl.types;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import p909nm.AbstractC17659D;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17682p;

/* JADX INFO: loaded from: classes2.dex */
public abstract class TypeConstructorSubstitution extends TypeSubstitution {
    public static final Companion Companion = new Companion(null);

    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public static /* synthetic */ TypeConstructorSubstitution createByConstructorsMap$default(Companion companion, Map map, boolean z6, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                z6 = false;
            }
            return companion.createByConstructorsMap(map, z6);
        }

        public final TypeSubstitution create(KotlinType kotlinType) {
            AbstractC16544l.m18094g(kotlinType, "kotlinType");
            return create(kotlinType.getConstructor(), kotlinType.getArguments());
        }

        public final TypeConstructorSubstitution createByConstructorsMap(Map<TypeConstructor, ? extends TypeProjection> map) {
            AbstractC16544l.m18094g(map, "map");
            return createByConstructorsMap$default(this, map, false, 2, null);
        }

        public final TypeSubstitution create(TypeConstructor typeConstructor, List<? extends TypeProjection> arguments) {
            AbstractC16544l.m18094g(typeConstructor, "typeConstructor");
            AbstractC16544l.m18094g(arguments, "arguments");
            List<TypeParameterDescriptor> parameters = typeConstructor.getParameters();
            AbstractC16544l.m18093f(parameters, "getParameters(...)");
            TypeParameterDescriptor typeParameterDescriptor = (TypeParameterDescriptor) AbstractC17680n.m19353c0(parameters);
            if (typeParameterDescriptor == null || !typeParameterDescriptor.isCapturedFromOuterDeclaration()) {
                return new IndexedParametersSubstitution(parameters, arguments);
            }
            List<TypeParameterDescriptor> parameters2 = typeConstructor.getParameters();
            AbstractC16544l.m18093f(parameters2, "getParameters(...)");
            List<TypeParameterDescriptor> list = parameters2;
            ArrayList arrayList = new ArrayList(AbstractC17682p.m19389r(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((TypeParameterDescriptor) it.next()).getTypeConstructor());
            }
            return createByConstructorsMap$default(this, AbstractC17659D.m19253o(AbstractC17680n.m19334J0(arrayList, arguments)), false, 2, null);
        }

        public final TypeConstructorSubstitution createByConstructorsMap(final Map<TypeConstructor, ? extends TypeProjection> map, final boolean z6) {
            AbstractC16544l.m18094g(map, "map");
            return new TypeConstructorSubstitution() { // from class: kotlin.reflect.jvm.internal.impl.types.TypeConstructorSubstitution$Companion$createByConstructorsMap$1
                @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
                public boolean approximateCapturedTypes() {
                    return z6;
                }

                @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructorSubstitution
                public TypeProjection get(TypeConstructor key) {
                    AbstractC16544l.m18094g(key, "key");
                    return (TypeProjection) map.get(key);
                }

                @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
                public boolean isEmpty() {
                    return map.isEmpty();
                }
            };
        }
    }

    public static final TypeSubstitution create(TypeConstructor typeConstructor, List<? extends TypeProjection> list) {
        return Companion.create(typeConstructor, list);
    }

    public static final TypeConstructorSubstitution createByConstructorsMap(Map<TypeConstructor, ? extends TypeProjection> map) {
        return Companion.createByConstructorsMap(map);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    /* JADX INFO: renamed from: get */
    public TypeProjection mo22592get(KotlinType key) {
        AbstractC16544l.m18094g(key, "key");
        return get(key.getConstructor());
    }

    public abstract TypeProjection get(TypeConstructor typeConstructor);
}
