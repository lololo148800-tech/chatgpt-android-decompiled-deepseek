package p294Li;

import androidx.lifecycle.EnumC11103l;

/* JADX INFO: renamed from: Li.c */
/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class AbstractC5081c {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f16638a;

    static {
        int[] iArr = new int[EnumC11103l.values().length];
        try {
            iArr[EnumC11103l.ON_PAUSE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[EnumC11103l.ON_RESUME.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[EnumC11103l.ON_DESTROY.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f16638a = iArr;
    }
}
