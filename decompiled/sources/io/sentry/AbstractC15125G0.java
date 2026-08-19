package io.sentry;

import io.sentry.rrweb.EnumC15462c;
import io.sentry.rrweb.EnumC15463d;

/* JADX INFO: renamed from: io.sentry.G0 */
/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class AbstractC15125G0 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f47073a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ int[] f47074b;

    static {
        int[] iArr = new int[EnumC15462c.values().length];
        f47074b = iArr;
        try {
            iArr[EnumC15462c.IncrementalSnapshot.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f47074b[EnumC15462c.Meta.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f47074b[EnumC15462c.Custom.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        int[] iArr2 = new int[EnumC15463d.values().length];
        f47073a = iArr2;
        try {
            iArr2[EnumC15463d.MouseInteraction.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f47073a[EnumC15463d.TouchMove.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
    }
}
