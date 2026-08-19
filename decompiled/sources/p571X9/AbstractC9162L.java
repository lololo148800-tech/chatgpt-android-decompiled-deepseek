package p571X9;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: X9.L */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9162L {
    /* JADX INFO: renamed from: a */
    public static void m9711a(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final float m9712b(float f10, float f11, float f12) {
        return (f11 * f12) + ((1 - f12) * f10);
    }

    /* JADX INFO: renamed from: c */
    public static final float[] m9713c(byte[] buffer) {
        AbstractC16544l.m18094g(buffer, "buffer");
        ByteBuffer byteBufferOrder = ByteBuffer.wrap(buffer).order(ByteOrder.nativeOrder());
        int length = buffer.length / 2;
        float[] fArr = new float[length];
        for (int i10 = 0; i10 < length; i10++) {
            fArr[i10] = byteBufferOrder.getShort() / 32767.0f;
        }
        return fArr;
    }
}
