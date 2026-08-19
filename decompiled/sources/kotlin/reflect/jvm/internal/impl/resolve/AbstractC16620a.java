package kotlin.reflect.jvm.internal.impl.resolve;

import kotlin.reflect.jvm.internal.impl.descriptors.Modality;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.resolve.a */
/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC16620a {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f52865a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ int[] f52866b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ int[] f52867c;

    static {
        int[] iArr = new int[Modality.values().length];
        f52867c = iArr;
        try {
            iArr[Modality.FINAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f52867c[Modality.SEALED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f52867c[Modality.OPEN.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f52867c[Modality.ABSTRACT.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        int[] iArr2 = new int[OverridingUtil.OverrideCompatibilityInfo.Result.values().length];
        f52866b = iArr2;
        try {
            iArr2[OverridingUtil.OverrideCompatibilityInfo.Result.OVERRIDABLE.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f52866b[OverridingUtil.OverrideCompatibilityInfo.Result.CONFLICT.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            f52866b[OverridingUtil.OverrideCompatibilityInfo.Result.INCOMPATIBLE.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        int[] iArr3 = new int[ExternalOverridabilityCondition.Result.values().length];
        f52865a = iArr3;
        try {
            iArr3[ExternalOverridabilityCondition.Result.OVERRIDABLE.ordinal()] = 1;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            f52865a[ExternalOverridabilityCondition.Result.INCOMPATIBLE.ordinal()] = 2;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            f52865a[ExternalOverridabilityCondition.Result.UNKNOWN.ordinal()] = 3;
        } catch (NoSuchFieldError unused10) {
        }
    }
}
