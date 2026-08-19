package kotlin.reflect.jvm.internal.impl.descriptors.runtime.components;

import java.io.InputStream;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinClassFinder;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMetadataVersion;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.BuiltInSerializerProtocol;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.BuiltInsResourceLoader;

/* JADX INFO: loaded from: classes2.dex */
public final class ReflectKotlinClassFinder implements KotlinClassFinder {

    /* JADX INFO: renamed from: a */
    public final ClassLoader f51666a;

    /* JADX INFO: renamed from: b */
    public final BuiltInsResourceLoader f51667b;

    public ReflectKotlinClassFinder(ClassLoader classLoader) {
        AbstractC16544l.m18094g(classLoader, "classLoader");
        this.f51666a = classLoader;
        this.f51667b = new BuiltInsResourceLoader();
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.KotlinMetadataFinder
    public InputStream findBuiltInsData(FqName packageFqName) {
        AbstractC16544l.m18094g(packageFqName, "packageFqName");
        if (!packageFqName.startsWith(StandardNames.BUILT_INS_PACKAGE_NAME)) {
            return null;
        }
        return this.f51667b.loadResource(BuiltInSerializerProtocol.INSTANCE.getBuiltInsFilePath(packageFqName));
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinClassFinder
    public KotlinClassFinder.Result findKotlinClassOrContent(ClassId classId, JvmMetadataVersion jvmMetadataVersion) {
        ReflectKotlinClass reflectKotlinClassCreate;
        AbstractC16544l.m18094g(classId, "classId");
        AbstractC16544l.m18094g(jvmMetadataVersion, "jvmMetadataVersion");
        Class<?> clsTryLoadClass = ReflectJavaClassFinderKt.tryLoadClass(this.f51666a, ReflectKotlinClassFinderKt.access$toRuntimeFqName(classId));
        if (clsTryLoadClass == null || (reflectKotlinClassCreate = ReflectKotlinClass.Factory.create(clsTryLoadClass)) == null) {
            return null;
        }
        return new KotlinClassFinder.Result.KotlinClass(reflectKotlinClassCreate, null, 2, null);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinClassFinder
    public KotlinClassFinder.Result findKotlinClassOrContent(JavaClass javaClass, JvmMetadataVersion jvmMetadataVersion) {
        String strAsString;
        Class<?> clsTryLoadClass;
        ReflectKotlinClass reflectKotlinClassCreate;
        AbstractC16544l.m18094g(javaClass, "javaClass");
        AbstractC16544l.m18094g(jvmMetadataVersion, "jvmMetadataVersion");
        FqName fqName = javaClass.getFqName();
        if (fqName == null || (strAsString = fqName.asString()) == null || (clsTryLoadClass = ReflectJavaClassFinderKt.tryLoadClass(this.f51666a, strAsString)) == null || (reflectKotlinClassCreate = ReflectKotlinClass.Factory.create(clsTryLoadClass)) == null) {
            return null;
        }
        return new KotlinClassFinder.Result.KotlinClass(reflectKotlinClassCreate, null, 2, null);
    }
}
