package p253K;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* JADX INFO: renamed from: K.f */
/* JADX INFO: loaded from: classes.dex */
public final class C4495f {

    /* JADX INFO: renamed from: d */
    public static final Charset f14661d = StandardCharsets.US_ASCII;

    /* JADX INFO: renamed from: e */
    public static final String[] f14662e = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};

    /* JADX INFO: renamed from: f */
    public static final int[] f14663f = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};

    /* JADX INFO: renamed from: a */
    public final int f14664a;

    /* JADX INFO: renamed from: b */
    public final int f14665b;

    /* JADX INFO: renamed from: c */
    public final byte[] f14666c;

    public C4495f(byte[] bArr, int i10, int i11) {
        this.f14664a = i10;
        this.f14665b = i11;
        this.f14666c = bArr;
    }

    /* JADX INFO: renamed from: a */
    public static C4495f m5231a(long j10, ByteOrder byteOrder) {
        return m5232b(new long[]{j10}, byteOrder);
    }

    /* JADX INFO: renamed from: b */
    public static C4495f m5232b(long[] jArr, ByteOrder byteOrder) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[f14663f[4] * jArr.length]);
        byteBufferWrap.order(byteOrder);
        for (long j10 : jArr) {
            byteBufferWrap.putInt((int) j10);
        }
        return new C4495f(byteBufferWrap.array(), 4, jArr.length);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(Separators.LPAREN);
        sb2.append(f14662e[this.f14664a]);
        sb2.append(", data length:");
        return AbstractC10763a.m11056n(sb2, this.f14666c.length, Separators.RPAREN);
    }
}
