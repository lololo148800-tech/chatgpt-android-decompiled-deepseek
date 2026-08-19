package kotlin.reflect.jvm.internal.impl.types.model;

import p523V9.AbstractC7877E4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class CaptureStatus {
    public static final CaptureStatus FOR_INCORPORATION;
    public static final CaptureStatus FOR_SUBTYPING;
    public static final CaptureStatus FROM_EXPRESSION;

    /* JADX INFO: renamed from: Y */
    public static final /* synthetic */ CaptureStatus[] f53274Y;

    static {
        CaptureStatus captureStatus = new CaptureStatus("FOR_SUBTYPING", 0);
        FOR_SUBTYPING = captureStatus;
        CaptureStatus captureStatus2 = new CaptureStatus("FOR_INCORPORATION", 1);
        FOR_INCORPORATION = captureStatus2;
        CaptureStatus captureStatus3 = new CaptureStatus("FROM_EXPRESSION", 2);
        FROM_EXPRESSION = captureStatus3;
        CaptureStatus[] captureStatusArr = {captureStatus, captureStatus2, captureStatus3};
        f53274Y = captureStatusArr;
        AbstractC7877E4.m8156j(captureStatusArr);
    }

    public static CaptureStatus valueOf(String str) {
        return (CaptureStatus) Enum.valueOf(CaptureStatus.class, str);
    }

    public static CaptureStatus[] values() {
        return (CaptureStatus[]) f53274Y.clone();
    }
}
