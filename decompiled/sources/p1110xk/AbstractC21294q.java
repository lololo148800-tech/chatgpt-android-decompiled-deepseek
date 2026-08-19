package p1110xk;

import com.withpersona.sdk2.inquiry.network.dto.styling.StyleElements;

/* JADX INFO: renamed from: xk.q */
/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class AbstractC21294q {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f67698a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ int[] f67699b;

    static {
        int[] iArr = new int[StyleElements.FontWeight.values().length];
        try {
            iArr[StyleElements.FontWeight.LIGHT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[StyleElements.FontWeight.NORMAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[StyleElements.FontWeight.MEDIUM.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[StyleElements.FontWeight.BOLD.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[StyleElements.FontWeight.HEAVY.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f67698a = iArr;
        int[] iArr2 = new int[StyleElements.PositionType.values().length];
        try {
            iArr2[StyleElements.PositionType.START.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[StyleElements.PositionType.CENTER.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[StyleElements.PositionType.END.ordinal()] = 3;
        } catch (NoSuchFieldError unused8) {
        }
        f67699b = iArr2;
    }
}
