package p298Lm;

import kotlin.reflect.jvm.internal.impl.types.Variance;

/* JADX INFO: renamed from: Lm.z0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC5215z0 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f16950a;

    static {
        int[] iArr = new int[Variance.values().length];
        try {
            iArr[Variance.INVARIANT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[Variance.IN_VARIANCE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[Variance.OUT_VARIANCE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f16950a = iArr;
    }
}
