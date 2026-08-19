package kotlin.reflect.jvm.internal.impl.metadata.deserialization;

import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: loaded from: classes2.dex */
public final class VersionSpecificBehaviorKt {
    public static final boolean isKotlin1Dot4OrLater(BinaryVersion version) {
        AbstractC16544l.m18094g(version, "version");
        return (version.getMajor() == 1 && version.getMinor() >= 4) || version.getMajor() > 1;
    }

    public static final boolean isVersionRequirementTableWrittenCorrectly(BinaryVersion version) {
        AbstractC16544l.m18094g(version, "version");
        return isKotlin1Dot4OrLater(version);
    }
}
