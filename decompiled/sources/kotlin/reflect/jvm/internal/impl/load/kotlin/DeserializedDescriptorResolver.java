package kotlin.reflect.jvm.internal.impl.load.kotlin;

import bn.C11511c;
import java.util.Set;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMetadataVersion;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmNameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmProtoBufUtil;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassData;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationComponents;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.IncompatibleVersionErrorData;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerAbiStability;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedPackageMemberScope;
import kotlin.reflect.jvm.internal.impl.utils.DeserializationHelpersKt;
import mm.C17309l;
import p909nm.AbstractC17665J;
import p909nm.AbstractC17678l;

/* JADX INFO: loaded from: classes2.dex */
public final class DeserializedDescriptorResolver {
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: a */
    public static final Set f52052a = AbstractC17665J.m19268h(KotlinClassHeader.Kind.CLASS);

    /* JADX INFO: renamed from: b */
    public static final Set f52053b = AbstractC17678l.m19293P(new KotlinClassHeader.Kind[]{KotlinClassHeader.Kind.FILE_FACADE, KotlinClassHeader.Kind.MULTIFILE_CLASS_PART});

    /* JADX INFO: renamed from: c */
    public static final JvmMetadataVersion f52054c = new JvmMetadataVersion(1, 1, 2);

    /* JADX INFO: renamed from: d */
    public static final JvmMetadataVersion f52055d = new JvmMetadataVersion(1, 1, 11);

    /* JADX INFO: renamed from: e */
    public static final JvmMetadataVersion f52056e = new JvmMetadataVersion(1, 1, 13);
    public DeserializationComponents components;

    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public final JvmMetadataVersion getKOTLIN_1_3_RC_METADATA_VERSION$descriptors_jvm() {
            return DeserializedDescriptorResolver.f52056e;
        }
    }

    /* JADX INFO: renamed from: a */
    public final DeserializedContainerAbiStability m18242a(KotlinJvmBinaryClass kotlinJvmBinaryClass) {
        if (getComponents().getConfiguration().getAllowUnstableDependencies()) {
            return DeserializedContainerAbiStability.STABLE;
        }
        return kotlinJvmBinaryClass.getClassHeader().isUnstableJvmIrBinary() ? DeserializedContainerAbiStability.UNSTABLE : DeserializedContainerAbiStability.STABLE;
    }

    /* JADX INFO: renamed from: b */
    public final IncompatibleVersionErrorData m18243b(KotlinJvmBinaryClass kotlinJvmBinaryClass) {
        if (getComponents().getConfiguration().getSkipMetadataVersionCheck() || kotlinJvmBinaryClass.getClassHeader().getMetadataVersion().isCompatible(DeserializationHelpersKt.jvmMetadataVersionOrDefault(getComponents().getConfiguration()))) {
            return null;
        }
        return new IncompatibleVersionErrorData(kotlinJvmBinaryClass.getClassHeader().getMetadataVersion(), JvmMetadataVersion.INSTANCE, DeserializationHelpersKt.jvmMetadataVersionOrDefault(getComponents().getConfiguration()), DeserializationHelpersKt.jvmMetadataVersionOrDefault(getComponents().getConfiguration()).lastSupportedVersionWithThisLanguageVersion(kotlinJvmBinaryClass.getClassHeader().getMetadataVersion().isStrictSemantics()), kotlinJvmBinaryClass.getLocation(), kotlinJvmBinaryClass.getClassId());
    }

    /* JADX INFO: renamed from: c */
    public final boolean m18244c(KotlinJvmBinaryClass kotlinJvmBinaryClass) {
        return (getComponents().getConfiguration().getReportErrorsOnPreReleaseDependencies() && (kotlinJvmBinaryClass.getClassHeader().isPreRelease() || AbstractC16544l.m18089b(kotlinJvmBinaryClass.getClassHeader().getMetadataVersion(), f52054c))) || (!getComponents().getConfiguration().getSkipPrereleaseCheck() && kotlinJvmBinaryClass.getClassHeader().isPreRelease() && AbstractC16544l.m18089b(kotlinJvmBinaryClass.getClassHeader().getMetadataVersion(), f52055d));
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002a  */
    public final MemberScope createKotlinPackagePartScope(PackageFragmentDescriptor descriptor, KotlinJvmBinaryClass kotlinClass) {
        String[] strings;
        C17309l packageDataFrom;
        AbstractC16544l.m18094g(descriptor, "descriptor");
        AbstractC16544l.m18094g(kotlinClass, "kotlinClass");
        KotlinClassHeader classHeader = kotlinClass.getClassHeader();
        String[] data = classHeader.getData();
        if (data == null) {
            data = classHeader.getIncompatibleData();
        }
        if (data == null) {
            data = null;
        } else if (!f52053b.contains(classHeader.getKind())) {
            data = null;
        }
        if (data == null || (strings = kotlinClass.getClassHeader().getStrings()) == null) {
            return null;
        }
        try {
            try {
                packageDataFrom = JvmProtoBufUtil.readPackageDataFrom(data, strings);
            } catch (InvalidProtocolBufferException e10) {
                throw new IllegalStateException("Could not read data from " + kotlinClass.getLocation(), e10);
            }
        } catch (Throwable th2) {
            if (getComponents().getConfiguration().getSkipMetadataVersionCheck() || kotlinClass.getClassHeader().getMetadataVersion().isCompatible(DeserializationHelpersKt.jvmMetadataVersionOrDefault(getComponents().getConfiguration()))) {
                throw th2;
            }
            packageDataFrom = null;
        }
        if (packageDataFrom == null) {
            return null;
        }
        JvmNameResolver jvmNameResolver = (JvmNameResolver) packageDataFrom.f55136Y;
        ProtoBuf.Package r6 = (ProtoBuf.Package) packageDataFrom.f55137Z;
        JvmPackagePartSource jvmPackagePartSource = new JvmPackagePartSource(kotlinClass, r6, jvmNameResolver, m18243b(kotlinClass), m18244c(kotlinClass), m18242a(kotlinClass));
        return new DeserializedPackageMemberScope(descriptor, r6, jvmNameResolver, kotlinClass.getClassHeader().getMetadataVersion(), jvmPackagePartSource, getComponents(), "scope for " + jvmPackagePartSource + " in " + descriptor, C11511c.f34834Y);
    }

    public final DeserializationComponents getComponents() {
        DeserializationComponents deserializationComponents = this.components;
        if (deserializationComponents != null) {
            return deserializationComponents;
        }
        AbstractC16544l.m18103p("components");
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    public final ClassData readClassData$descriptors_jvm(KotlinJvmBinaryClass kotlinClass) {
        C17309l classDataFrom;
        AbstractC16544l.m18094g(kotlinClass, "kotlinClass");
        KotlinClassHeader classHeader = kotlinClass.getClassHeader();
        String[] data = classHeader.getData();
        if (data == null) {
            data = classHeader.getIncompatibleData();
        }
        if (data != null) {
            if (!f52052a.contains(classHeader.getKind())) {
                data = null;
            }
        } else {
            data = null;
        }
        if (data == null) {
            return null;
        }
        String[] strings = kotlinClass.getClassHeader().getStrings();
        try {
            if (strings == null) {
                return null;
            }
            try {
                classDataFrom = JvmProtoBufUtil.readClassDataFrom(data, strings);
            } catch (InvalidProtocolBufferException e10) {
                throw new IllegalStateException("Could not read data from " + kotlinClass.getLocation(), e10);
            }
        } catch (Throwable th2) {
            if (getComponents().getConfiguration().getSkipMetadataVersionCheck() || kotlinClass.getClassHeader().getMetadataVersion().isCompatible(DeserializationHelpersKt.jvmMetadataVersionOrDefault(getComponents().getConfiguration()))) {
                throw th2;
            }
            classDataFrom = null;
        }
        if (classDataFrom == null) {
            return null;
        }
        return new ClassData((JvmNameResolver) classDataFrom.f55136Y, (ProtoBuf.Class) classDataFrom.f55137Z, kotlinClass.getClassHeader().getMetadataVersion(), new KotlinJvmBinarySourceElement(kotlinClass, m18243b(kotlinClass), m18244c(kotlinClass), m18242a(kotlinClass)));
    }

    public final ClassDescriptor resolveClass(KotlinJvmBinaryClass kotlinClass) {
        AbstractC16544l.m18094g(kotlinClass, "kotlinClass");
        ClassData classData$descriptors_jvm = readClassData$descriptors_jvm(kotlinClass);
        if (classData$descriptors_jvm == null) {
            return null;
        }
        return getComponents().getClassDeserializer().deserializeClass(kotlinClass.getClassId(), classData$descriptors_jvm);
    }

    public final void setComponents(DeserializationComponents deserializationComponents) {
        AbstractC16544l.m18094g(deserializationComponents, "<set-?>");
        this.components = deserializationComponents;
    }

    public final void setComponents(DeserializationComponentsForJava components) {
        AbstractC16544l.m18094g(components, "components");
        setComponents(components.getComponents());
    }
}
