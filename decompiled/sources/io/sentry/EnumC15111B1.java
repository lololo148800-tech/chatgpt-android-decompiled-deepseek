package io.sentry;

/* JADX INFO: renamed from: io.sentry.B1 */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC15111B1 {
    LOW(0.8f, 50000),
    MEDIUM(1.0f, 75000),
    HIGH(1.0f, 100000);

    public final int bitRate;
    public final float sizeScale;

    EnumC15111B1(float f10, int i10) {
        this.sizeScale = f10;
        this.bitRate = i10;
    }
}
