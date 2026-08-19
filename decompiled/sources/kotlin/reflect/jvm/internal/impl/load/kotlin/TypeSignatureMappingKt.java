package kotlin.reflect.jvm.internal.impl.load.kotlin;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMap;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeEnhancementUtilsKt;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmClassName;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;
import kotlin.reflect.jvm.internal.impl.types.TypeSystemCommonBackendContext;
import kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker;

/* JADX INFO: loaded from: classes2.dex */
public final class TypeSignatureMappingKt {
    public static final <T> T boxTypeIfNeeded(JvmTypeFactory<T> jvmTypeFactory, T possiblyPrimitiveType, boolean z6) {
        AbstractC16544l.m18094g(jvmTypeFactory, "<this>");
        AbstractC16544l.m18094g(possiblyPrimitiveType, "possiblyPrimitiveType");
        return z6 ? jvmTypeFactory.boxType(possiblyPrimitiveType) : possiblyPrimitiveType;
    }

    public static final <T> T mapBuiltInType(TypeSystemCommonBackendContext typeSystemCommonBackendContext, KotlinTypeMarker type, JvmTypeFactory<T> typeFactory, TypeMappingMode mode) {
        AbstractC16544l.m18094g(typeSystemCommonBackendContext, "<this>");
        AbstractC16544l.m18094g(type, "type");
        AbstractC16544l.m18094g(typeFactory, "typeFactory");
        AbstractC16544l.m18094g(mode, "mode");
        TypeConstructorMarker typeConstructorMarkerTypeConstructor = typeSystemCommonBackendContext.typeConstructor(type);
        if (!typeSystemCommonBackendContext.isClassTypeConstructor(typeConstructorMarkerTypeConstructor)) {
            return null;
        }
        PrimitiveType primitiveType = typeSystemCommonBackendContext.getPrimitiveType(typeConstructorMarkerTypeConstructor);
        if (primitiveType != null) {
            return (T) boxTypeIfNeeded(typeFactory, typeFactory.createPrimitiveType(primitiveType), typeSystemCommonBackendContext.isNullableType(type) || TypeEnhancementUtilsKt.hasEnhancedNullability(typeSystemCommonBackendContext, type));
        }
        PrimitiveType primitiveArrayType = typeSystemCommonBackendContext.getPrimitiveArrayType(typeConstructorMarkerTypeConstructor);
        if (primitiveArrayType != null) {
            return typeFactory.createFromString("[" + JvmPrimitiveType.get(primitiveArrayType).getDesc());
        }
        if (typeSystemCommonBackendContext.isUnderKotlinPackage(typeConstructorMarkerTypeConstructor)) {
            FqNameUnsafe classFqNameUnsafe = typeSystemCommonBackendContext.getClassFqNameUnsafe(typeConstructorMarkerTypeConstructor);
            ClassId classIdMapKotlinToJava = classFqNameUnsafe != null ? JavaToKotlinClassMap.INSTANCE.mapKotlinToJava(classFqNameUnsafe) : null;
            if (classIdMapKotlinToJava != null) {
                if (!mode.getKotlinCollectionsToJavaCollections()) {
                    List<JavaToKotlinClassMap.PlatformMutabilityMapping> mutabilityMappings = JavaToKotlinClassMap.INSTANCE.getMutabilityMappings();
                    if (!(mutabilityMappings instanceof Collection) || !mutabilityMappings.isEmpty()) {
                        Iterator<T> it = mutabilityMappings.iterator();
                        while (it.hasNext()) {
                            if (AbstractC16544l.m18089b(((JavaToKotlinClassMap.PlatformMutabilityMapping) it.next()).getJavaClass(), classIdMapKotlinToJava)) {
                                return null;
                            }
                        }
                    }
                }
                String strInternalNameByClassId = JvmClassName.internalNameByClassId(classIdMapKotlinToJava);
                AbstractC16544l.m18093f(strInternalNameByClassId, "internalNameByClassId(...)");
                return typeFactory.createObjectType(strInternalNameByClassId);
            }
        }
        return null;
    }
}
