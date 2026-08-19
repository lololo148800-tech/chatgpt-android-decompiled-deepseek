package p109E3;

import java.nio.ByteBuffer;
import p523V9.AbstractC8020X;

/* JADX INFO: renamed from: E3.M */
/* JADX INFO: loaded from: classes.dex */
public final class C2272M {

    /* JADX INFO: renamed from: d */
    public static final byte[] f7019d = {79, 103, 103, 83, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 28, -43, -59, -9, 1, 19, 79, 112, 117, 115, 72, 101, 97, 100, 1, 2, 56, 1, -128, -69, 0, 0, 0, 0, 0};

    /* JADX INFO: renamed from: e */
    public static final byte[] f7020e = {79, 103, 103, 83, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 11, -103, 87, 83, 1, 16, 79, 112, 117, 115, 84, 97, 103, 115, 0, 0, 0, 0, 0, 0, 0, 0};

    /* JADX INFO: renamed from: a */
    public ByteBuffer f7021a;

    /* JADX INFO: renamed from: b */
    public int f7022b;

    /* JADX INFO: renamed from: c */
    public int f7023c;

    /* JADX INFO: renamed from: a */
    public static void m3351a(ByteBuffer byteBuffer, long j10, int i10, int i11, boolean z6) {
        byteBuffer.put((byte) 79);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 83);
        byteBuffer.put((byte) 0);
        byteBuffer.put(z6 ? (byte) 2 : (byte) 0);
        byteBuffer.putLong(j10);
        byteBuffer.putInt(0);
        byteBuffer.putInt(i10);
        byteBuffer.putInt(0);
        long j11 = i11;
        AbstractC8020X.m8352b((j11 >> 8) == 0, "out of range: %s", j11);
        byteBuffer.put((byte) j11);
    }
}
