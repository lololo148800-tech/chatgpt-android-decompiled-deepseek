package kotlin.reflect.jvm.internal.impl.descriptors.runtime.components;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.load.kotlin.DeserializationComponentsForJava;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationComponents;
import mm.C17296C;

/* JADX INFO: loaded from: classes2.dex */
public final class RuntimeModuleData {
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: a */
    public final DeserializationComponents f51669a;

    /* JADX INFO: renamed from: b */
    public final PackagePartScopeCache f51670b;

    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public final RuntimeModuleData create(ClassLoader classLoader) {
            AbstractC16544l.m18094g(classLoader, "classLoader");
            ReflectKotlinClassFinder reflectKotlinClassFinder = new ReflectKotlinClassFinder(classLoader);
            DeserializationComponentsForJava.Companion companion = DeserializationComponentsForJava.Companion;
            ClassLoader classLoader2 = C17296C.class.getClassLoader();
            AbstractC16544l.m18093f(classLoader2, "getClassLoader(...)");
            DeserializationComponentsForJava.Companion.ModuleData moduleDataCreateModuleData = companion.createModuleData(reflectKotlinClassFinder, new ReflectKotlinClassFinder(classLoader2), new ReflectJavaClassFinder(classLoader), "runtime module for " + classLoader, RuntimeErrorReporter.INSTANCE, RuntimeSourceElementFactory.INSTANCE);
            return new RuntimeModuleData(moduleDataCreateModuleData.getDeserializationComponentsForJava().getComponents(), new PackagePartScopeCache(moduleDataCreateModuleData.getDeserializedDescriptorResolver(), reflectKotlinClassFinder), null);
        }
    }

    public RuntimeModuleData(DeserializationComponents deserializationComponents, PackagePartScopeCache packagePartScopeCache, DefaultConstructorMarker defaultConstructorMarker) {
        this.f51669a = deserializationComponents;
        this.f51670b = packagePartScopeCache;
    }

    public final DeserializationComponents getDeserialization() {
        return this.f51669a;
    }

    public final ModuleDescriptor getModule() {
        return this.f51669a.getModuleDescriptor();
    }

    public final PackagePartScopeCache getPackagePartScopeCache() {
        return this.f51670b;
    }
}
