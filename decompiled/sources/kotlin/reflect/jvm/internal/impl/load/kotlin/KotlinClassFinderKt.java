package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMetadataVersion;
import kotlin.reflect.jvm.internal.impl.name.ClassId;

/* JADX INFO: loaded from: classes2.dex */
public final class KotlinClassFinderKt {
    public static final KotlinJvmBinaryClass findKotlinClass(KotlinClassFinder kotlinClassFinder, ClassId classId, JvmMetadataVersion jvmMetadataVersion) {
        AbstractC16544l.m18094g(kotlinClassFinder, "<this>");
        AbstractC16544l.m18094g(classId, "classId");
        AbstractC16544l.m18094g(jvmMetadataVersion, "jvmMetadataVersion");
        KotlinClassFinder.Result resultFindKotlinClassOrContent = kotlinClassFinder.findKotlinClassOrContent(classId, jvmMetadataVersion);
        if (resultFindKotlinClassOrContent != null) {
            return resultFindKotlinClassOrContent.toKotlinJvmBinaryClass();
        }
        return null;
    }

    public static final KotlinJvmBinaryClass findKotlinClass(KotlinClassFinder kotlinClassFinder, JavaClass javaClass, JvmMetadataVersion jvmMetadataVersion) {
        AbstractC16544l.m18094g(kotlinClassFinder, "<this>");
        AbstractC16544l.m18094g(javaClass, "javaClass");
        AbstractC16544l.m18094g(jvmMetadataVersion, "jvmMetadataVersion");
        KotlinClassFinder.Result resultFindKotlinClassOrContent = kotlinClassFinder.findKotlinClassOrContent(javaClass, jvmMetadataVersion);
        if (resultFindKotlinClassOrContent != null) {
            return resultFindKotlinClassOrContent.toKotlinJvmBinaryClass();
        }
        return null;
    }
}
