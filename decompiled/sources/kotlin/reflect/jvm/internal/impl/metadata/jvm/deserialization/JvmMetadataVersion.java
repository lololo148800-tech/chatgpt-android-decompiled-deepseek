package kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization;

import java.util.Arrays;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.BinaryVersion;

/* JADX INFO: loaded from: classes2.dex */
public final class JvmMetadataVersion extends BinaryVersion {
    public static final Companion Companion = new Companion(null);
    public static final JvmMetadataVersion INSTANCE;
    public static final JvmMetadataVersion INSTANCE_NEXT;
    public static final JvmMetadataVersion INVALID_VERSION;

    /* JADX INFO: renamed from: f */
    public final boolean f52663f;

    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    static {
        JvmMetadataVersion jvmMetadataVersion = new JvmMetadataVersion(2, 1, 0);
        INSTANCE = jvmMetadataVersion;
        INSTANCE_NEXT = jvmMetadataVersion.next();
        INVALID_VERSION = new JvmMetadataVersion(new int[0]);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JvmMetadataVersion(int[] versionArray, boolean z6) {
        super(Arrays.copyOf(versionArray, versionArray.length));
        AbstractC16544l.m18094g(versionArray, "versionArray");
        this.f52663f = z6;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m18260a(JvmMetadataVersion jvmMetadataVersion) {
        if (getMajor() > jvmMetadataVersion.getMajor()) {
            return true;
        }
        return getMajor() >= jvmMetadataVersion.getMajor() && getMinor() > jvmMetadataVersion.getMinor();
    }

    public final boolean isCompatible(JvmMetadataVersion metadataVersionFromLanguageVersion) {
        AbstractC16544l.m18094g(metadataVersionFromLanguageVersion, "metadataVersionFromLanguageVersion");
        if (getMajor() == 2 && getMinor() == 0) {
            JvmMetadataVersion jvmMetadataVersion = INSTANCE;
            if (jvmMetadataVersion.getMajor() == 1 && jvmMetadataVersion.getMinor() == 8) {
                return true;
            }
        }
        JvmMetadataVersion jvmMetadataVersionLastSupportedVersionWithThisLanguageVersion = metadataVersionFromLanguageVersion.lastSupportedVersionWithThisLanguageVersion(this.f52663f);
        if ((getMajor() == 1 && getMinor() == 0) || getMajor() == 0) {
            return false;
        }
        return !m18260a(jvmMetadataVersionLastSupportedVersionWithThisLanguageVersion);
    }

    public final boolean isStrictSemantics() {
        return this.f52663f;
    }

    public final JvmMetadataVersion lastSupportedVersionWithThisLanguageVersion(boolean z6) {
        JvmMetadataVersion jvmMetadataVersion = z6 ? INSTANCE : INSTANCE_NEXT;
        return jvmMetadataVersion.m18260a(this) ? jvmMetadataVersion : this;
    }

    public final JvmMetadataVersion next() {
        return (getMajor() == 1 && getMinor() == 9) ? new JvmMetadataVersion(2, 0, 0) : new JvmMetadataVersion(getMajor(), getMinor() + 1, 0);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public JvmMetadataVersion(int... numbers) {
        this(numbers, false);
        AbstractC16544l.m18094g(numbers, "numbers");
    }
}
