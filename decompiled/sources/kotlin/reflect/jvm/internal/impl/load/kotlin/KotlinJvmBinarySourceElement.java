package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceFile;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMetadataVersion;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.IncompatibleVersionErrorData;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerAbiStability;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerSource;

/* JADX INFO: loaded from: classes2.dex */
public final class KotlinJvmBinarySourceElement implements DeserializedContainerSource {

    /* JADX INFO: renamed from: a */
    public final KotlinJvmBinaryClass f52077a;

    public KotlinJvmBinarySourceElement(KotlinJvmBinaryClass binaryClass, IncompatibleVersionErrorData<JvmMetadataVersion> incompatibleVersionErrorData, boolean z6, DeserializedContainerAbiStability abiStability) {
        AbstractC16544l.m18094g(binaryClass, "binaryClass");
        AbstractC16544l.m18094g(abiStability, "abiStability");
        this.f52077a = binaryClass;
    }

    public final KotlinJvmBinaryClass getBinaryClass() {
        return this.f52077a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.SourceElement
    public SourceFile getContainingFile() {
        SourceFile NO_SOURCE_FILE = SourceFile.NO_SOURCE_FILE;
        AbstractC16544l.m18093f(NO_SOURCE_FILE, "NO_SOURCE_FILE");
        return NO_SOURCE_FILE;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerSource
    public String getPresentableString() {
        return "Class '" + this.f52077a.getClassId().asSingleFqName().asString() + '\'';
    }

    public String toString() {
        return "KotlinJvmBinarySourceElement: " + this.f52077a;
    }
}
