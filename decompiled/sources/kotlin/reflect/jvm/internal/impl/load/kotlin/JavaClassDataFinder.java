package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassData;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassDataFinder;
import kotlin.reflect.jvm.internal.impl.utils.DeserializationHelpersKt;

/* JADX INFO: loaded from: classes2.dex */
public final class JavaClassDataFinder implements ClassDataFinder {

    /* JADX INFO: renamed from: a */
    public final KotlinClassFinder f52057a;

    /* JADX INFO: renamed from: b */
    public final DeserializedDescriptorResolver f52058b;

    public JavaClassDataFinder(KotlinClassFinder kotlinClassFinder, DeserializedDescriptorResolver deserializedDescriptorResolver) {
        AbstractC16544l.m18094g(kotlinClassFinder, "kotlinClassFinder");
        AbstractC16544l.m18094g(deserializedDescriptorResolver, "deserializedDescriptorResolver");
        this.f52057a = kotlinClassFinder;
        this.f52058b = deserializedDescriptorResolver;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassDataFinder
    public ClassData findClassData(ClassId classId) {
        AbstractC16544l.m18094g(classId, "classId");
        DeserializedDescriptorResolver deserializedDescriptorResolver = this.f52058b;
        KotlinJvmBinaryClass kotlinJvmBinaryClassFindKotlinClass = KotlinClassFinderKt.findKotlinClass(this.f52057a, classId, DeserializationHelpersKt.jvmMetadataVersionOrDefault(deserializedDescriptorResolver.getComponents().getConfiguration()));
        if (kotlinJvmBinaryClassFindKotlinClass == null) {
            return null;
        }
        AbstractC16544l.m18089b(kotlinJvmBinaryClassFindKotlinClass.getClassId(), classId);
        return deserializedDescriptorResolver.readClassData$descriptors_jvm(kotlinJvmBinaryClassFindKotlinClass);
    }
}
