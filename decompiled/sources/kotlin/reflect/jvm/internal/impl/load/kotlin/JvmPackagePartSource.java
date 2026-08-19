package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceFile;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoBufUtilKt;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMetadataVersion;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmClassName;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.IncompatibleVersionErrorData;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerAbiStability;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerSource;
import p1113xn.AbstractC21322p;
import p658b5.p659zh.MMVKXkcLpuHFDi;

/* JADX INFO: loaded from: classes2.dex */
public final class JvmPackagePartSource implements DeserializedContainerSource {

    /* JADX INFO: renamed from: a */
    public final JvmClassName f52061a;

    /* JADX INFO: renamed from: b */
    public final JvmClassName f52062b;

    /* JADX INFO: renamed from: c */
    public final KotlinJvmBinaryClass f52063c;

    public JvmPackagePartSource(JvmClassName className, JvmClassName jvmClassName, ProtoBuf.Package packageProto, NameResolver nameResolver, IncompatibleVersionErrorData<JvmMetadataVersion> incompatibleVersionErrorData, boolean z6, DeserializedContainerAbiStability abiStability, KotlinJvmBinaryClass kotlinJvmBinaryClass) {
        AbstractC16544l.m18094g(className, "className");
        AbstractC16544l.m18094g(packageProto, "packageProto");
        AbstractC16544l.m18094g(nameResolver, "nameResolver");
        AbstractC16544l.m18094g(abiStability, "abiStability");
        this.f52061a = className;
        this.f52062b = jvmClassName;
        this.f52063c = kotlinJvmBinaryClass;
        GeneratedMessageLite.GeneratedExtension<ProtoBuf.Package, Integer> generatedExtension = JvmProtoBuf.packageModuleName;
        AbstractC16544l.m18093f(generatedExtension, MMVKXkcLpuHFDi.YyuEnfr);
        Integer num = (Integer) ProtoBufUtilKt.getExtensionOrNull(packageProto, generatedExtension);
        if (num != null) {
            nameResolver.getString(num.intValue());
        }
    }

    public final ClassId getClassId() {
        FqName packageFqName = getClassName().getPackageFqName();
        AbstractC16544l.m18093f(packageFqName, "getPackageFqName(...)");
        return new ClassId(packageFqName, getSimpleName());
    }

    public JvmClassName getClassName() {
        return this.f52061a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.SourceElement
    public SourceFile getContainingFile() {
        SourceFile NO_SOURCE_FILE = SourceFile.NO_SOURCE_FILE;
        AbstractC16544l.m18093f(NO_SOURCE_FILE, "NO_SOURCE_FILE");
        return NO_SOURCE_FILE;
    }

    public JvmClassName getFacadeClassName() {
        return this.f52062b;
    }

    public final KotlinJvmBinaryClass getKnownJvmBinaryClass() {
        return this.f52063c;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerSource
    public String getPresentableString() {
        return "Class '" + getClassId().asSingleFqName().asString() + '\'';
    }

    public final Name getSimpleName() {
        String internalName = getClassName().getInternalName();
        AbstractC16544l.m18093f(internalName, "getInternalName(...)");
        Name nameIdentifier = Name.identifier(AbstractC21322p.m21703k0('/', internalName, internalName));
        AbstractC16544l.m18093f(nameIdentifier, "identifier(...)");
        return nameIdentifier;
    }

    public String toString() {
        return "JvmPackagePartSource: " + getClassName();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public JvmPackagePartSource(KotlinJvmBinaryClass kotlinClass, ProtoBuf.Package packageProto, NameResolver nameResolver, IncompatibleVersionErrorData<JvmMetadataVersion> incompatibleVersionErrorData, boolean z6, DeserializedContainerAbiStability abiStability) {
        AbstractC16544l.m18094g(kotlinClass, "kotlinClass");
        AbstractC16544l.m18094g(packageProto, "packageProto");
        AbstractC16544l.m18094g(nameResolver, "nameResolver");
        AbstractC16544l.m18094g(abiStability, "abiStability");
        JvmClassName jvmClassNameByClassId = JvmClassName.byClassId(kotlinClass.getClassId());
        AbstractC16544l.m18093f(jvmClassNameByClassId, "byClassId(...)");
        String multifileClassName = kotlinClass.getClassHeader().getMultifileClassName();
        JvmClassName jvmClassNameByInternalName = null;
        if (multifileClassName != null && multifileClassName.length() > 0) {
            jvmClassNameByInternalName = JvmClassName.byInternalName(multifileClassName);
        }
        this(jvmClassNameByClassId, jvmClassNameByInternalName, packageProto, nameResolver, incompatibleVersionErrorData, z6, abiStability, kotlinClass);
    }
}
