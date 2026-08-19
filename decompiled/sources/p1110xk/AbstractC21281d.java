package p1110xk;

import com.withpersona.sdk2.inquiry.network.dto.styling.StyleElements;

/* JADX INFO: renamed from: xk.d */
/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class AbstractC21281d {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f67673a;

    static {
        int[] iArr = new int[StyleElements.PositionType.values().length];
        try {
            iArr[StyleElements.PositionType.START.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[StyleElements.PositionType.CENTER.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[StyleElements.PositionType.END.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f67673a = iArr;
    }
}
