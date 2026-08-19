package kotlin.reflect.jvm.internal.impl.platform;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;

/* JADX INFO: loaded from: classes2.dex */
public abstract class SimplePlatform {
    public String getTargetName() {
        return getTargetPlatformVersion().getDescription();
    }

    public TargetPlatformVersion getTargetPlatformVersion() {
        return null;
    }

    public String toString() {
        String targetName = getTargetName();
        if (targetName.length() > 0) {
            return AbstractC10763a.m11047e(')', "null (", targetName);
        }
        return null;
    }
}
