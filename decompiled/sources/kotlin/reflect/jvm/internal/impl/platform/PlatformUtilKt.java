package kotlin.reflect.jvm.internal.impl.platform;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.AbstractC16544l;
import p909nm.AbstractC17680n;

/* JADX INFO: loaded from: classes2.dex */
public final class PlatformUtilKt {
    public static final String getPresentableDescription(TargetPlatform targetPlatform) {
        AbstractC16544l.m18094g(targetPlatform, "<this>");
        return AbstractC17680n.m19349Y(targetPlatform.getComponentPlatforms(), Separators.SLASH, null, null, 0, null, null, 62);
    }
}
