package p538W2;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import io.sentry.android.core.AbstractC15256t;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import p138F8.vJO.vRJidSveZHcTw;

/* JADX INFO: renamed from: W2.c */
/* JADX INFO: loaded from: classes.dex */
public final class C8418c {

    /* JADX INFO: renamed from: a */
    public final int f26171a;

    /* JADX INFO: renamed from: b */
    public final int f26172b;

    /* JADX INFO: renamed from: c */
    public final long f26173c;

    /* JADX INFO: renamed from: d */
    public final byte[] f26174d;

    public C8418c(byte[] bArr, int i10, int i11) {
        this(-1L, bArr, i10, i11);
    }

    /* JADX INFO: renamed from: a */
    public static C8418c m8975a(String str) {
        byte[] bytes = str.concat("\u0000").getBytes(C8422g.f26208b0);
        return new C8418c(bytes, 2, bytes.length);
    }

    /* JADX INFO: renamed from: b */
    public static C8418c m8976b(long j10, ByteOrder byteOrder) {
        return m8977c(new long[]{j10}, byteOrder);
    }

    /* JADX INFO: renamed from: c */
    public static C8418c m8977c(long[] jArr, ByteOrder byteOrder) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[C8422g.f26199S[4] * jArr.length]);
        byteBufferWrap.order(byteOrder);
        for (long j10 : jArr) {
            byteBufferWrap.putInt((int) j10);
        }
        return new C8418c(byteBufferWrap.array(), 4, jArr.length);
    }

    /* JADX INFO: renamed from: d */
    public static C8418c m8978d(C8420e[] c8420eArr, ByteOrder byteOrder) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[C8422g.f26199S[5] * c8420eArr.length]);
        byteBufferWrap.order(byteOrder);
        for (C8420e c8420e : c8420eArr) {
            byteBufferWrap.putInt((int) c8420e.f26179a);
            byteBufferWrap.putInt((int) c8420e.f26180b);
        }
        return new C8418c(byteBufferWrap.array(), 5, c8420eArr.length);
    }

    /* JADX INFO: renamed from: e */
    public static C8418c m8979e(int i10, ByteOrder byteOrder) {
        return m8980f(new int[]{i10}, byteOrder);
    }

    /* JADX INFO: renamed from: f */
    public static C8418c m8980f(int[] iArr, ByteOrder byteOrder) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[C8422g.f26199S[3] * iArr.length]);
        byteBufferWrap.order(byteOrder);
        for (int i10 : iArr) {
            byteBufferWrap.putShort((short) i10);
        }
        return new C8418c(byteBufferWrap.array(), 3, iArr.length);
    }

    /* JADX INFO: renamed from: g */
    public final double m8981g(ByteOrder byteOrder) throws Throwable {
        Object objM8984j = m8984j(byteOrder);
        if (objM8984j == null) {
            throw new NumberFormatException("NULL can't be converted to a double value");
        }
        if (objM8984j instanceof String) {
            return Double.parseDouble((String) objM8984j);
        }
        if (objM8984j instanceof long[]) {
            long[] jArr = (long[]) objM8984j;
            if (jArr.length == 1) {
                return jArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (objM8984j instanceof int[]) {
            int[] iArr = (int[]) objM8984j;
            if (iArr.length == 1) {
                return iArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (objM8984j instanceof double[]) {
            double[] dArr = (double[]) objM8984j;
            if (dArr.length == 1) {
                return dArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (!(objM8984j instanceof C8420e[])) {
            throw new NumberFormatException("Couldn't find a double value");
        }
        C8420e[] c8420eArr = (C8420e[]) objM8984j;
        if (c8420eArr.length != 1) {
            throw new NumberFormatException("There are more than one component");
        }
        C8420e c8420e = c8420eArr[0];
        return c8420e.f26179a / c8420e.f26180b;
    }

    /* JADX INFO: renamed from: h */
    public final int m8982h(ByteOrder byteOrder) throws Throwable {
        Object objM8984j = m8984j(byteOrder);
        if (objM8984j == null) {
            throw new NumberFormatException("NULL can't be converted to a integer value");
        }
        if (objM8984j instanceof String) {
            return Integer.parseInt((String) objM8984j);
        }
        if (objM8984j instanceof long[]) {
            long[] jArr = (long[]) objM8984j;
            if (jArr.length == 1) {
                return (int) jArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (!(objM8984j instanceof int[])) {
            throw new NumberFormatException("Couldn't find a integer value");
        }
        int[] iArr = (int[]) objM8984j;
        if (iArr.length == 1) {
            return iArr[0];
        }
        throw new NumberFormatException("There are more than one component");
    }

    /* JADX INFO: renamed from: i */
    public final String m8983i(ByteOrder byteOrder) throws Throwable {
        Object objM8984j = m8984j(byteOrder);
        if (objM8984j == null) {
            return null;
        }
        if (objM8984j instanceof String) {
            return (String) objM8984j;
        }
        StringBuilder sb2 = new StringBuilder();
        int i10 = 0;
        if (objM8984j instanceof long[]) {
            long[] jArr = (long[]) objM8984j;
            while (i10 < jArr.length) {
                sb2.append(jArr[i10]);
                i10++;
                if (i10 != jArr.length) {
                    sb2.append(Separators.COMMA);
                }
            }
            return sb2.toString();
        }
        if (objM8984j instanceof int[]) {
            int[] iArr = (int[]) objM8984j;
            while (i10 < iArr.length) {
                sb2.append(iArr[i10]);
                i10++;
                if (i10 != iArr.length) {
                    sb2.append(Separators.COMMA);
                }
            }
            return sb2.toString();
        }
        if (objM8984j instanceof double[]) {
            double[] dArr = (double[]) objM8984j;
            while (i10 < dArr.length) {
                sb2.append(dArr[i10]);
                i10++;
                if (i10 != dArr.length) {
                    sb2.append(Separators.COMMA);
                }
            }
            return sb2.toString();
        }
        if (!(objM8984j instanceof C8420e[])) {
            return null;
        }
        C8420e[] c8420eArr = (C8420e[]) objM8984j;
        while (i10 < c8420eArr.length) {
            sb2.append(c8420eArr[i10].f26179a);
            sb2.append('/');
            sb2.append(c8420eArr[i10].f26180b);
            i10++;
            if (i10 != c8420eArr.length) {
                sb2.append(Separators.COMMA);
            }
        }
        return sb2.toString();
    }

    /* JADX WARN: Code duplicated, block: B:151:0x0172 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Not initialized variable reg: 6, insn: 0x0032: MOVE (r5 I:??[OBJECT, ARRAY]) = (r6 I:??[OBJECT, ARRAY]) (LINE:51), block:B:17:0x0032 */
    /* JADX WARN: Type inference failed for: r15v23, types: [int[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r15v24, types: [java.io.Serializable, long[]] */
    /* JADX WARN: Type inference failed for: r15v25, types: [W2.e[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r15v26, types: [int[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r15v27, types: [int[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r15v28, types: [W2.e[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r15v29, types: [double[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r15v30, types: [double[], java.io.Serializable] */
    /* JADX INFO: renamed from: j */
    public final Serializable m8984j(ByteOrder byteOrder) throws Throwable {
        C8417b c8417b;
        InputStream inputStream;
        byte b;
        int length = 0;
        byte[] bArr = this.f26174d;
        InputStream inputStream2 = null;
        try {
            try {
                c8417b = new C8417b(bArr);
                try {
                    c8417b.f26168o0 = byteOrder;
                    int i10 = this.f26171a;
                    int i11 = this.f26172b;
                    switch (i10) {
                        case 1:
                        case 6:
                            if (bArr.length != 1 || (b = bArr[0]) < 0 || b > 1) {
                                String str = new String(bArr, C8422g.f26208b0);
                                try {
                                    c8417b.close();
                                    break;
                                } catch (IOException e10) {
                                    AbstractC15256t.m16466d("ExifInterface", "IOException occurred while closing InputStream", e10);
                                }
                                return str;
                            }
                            String str2 = new String(new char[]{(char) (b + 48)});
                            try {
                                c8417b.close();
                                break;
                            } catch (IOException e11) {
                                AbstractC15256t.m16466d("ExifInterface", "IOException occurred while closing InputStream", e11);
                            }
                            return str2;
                        case 2:
                        case 7:
                            if (i11 >= C8422g.f26200T.length) {
                                int i12 = 0;
                                while (true) {
                                    byte[] bArr2 = C8422g.f26200T;
                                    if (i12 >= bArr2.length) {
                                        length = bArr2.length;
                                    } else if (bArr[i12] == bArr2[i12]) {
                                        i12++;
                                    }
                                }
                            }
                            StringBuilder sb2 = new StringBuilder();
                            try {
                                while (length < i11) {
                                    byte b10 = bArr[length];
                                    if (b10 == 0) {
                                        String string = sb2.toString();
                                        c8417b.close();
                                        return string;
                                    }
                                    if (b10 >= 32) {
                                        sb2.append((char) b10);
                                    } else {
                                        sb2.append('?');
                                    }
                                    length++;
                                }
                                c8417b.close();
                                break;
                            } catch (IOException e12) {
                                AbstractC15256t.m16466d("ExifInterface", "IOException occurred while closing InputStream", e12);
                            }
                            String string2 = sb2.toString();
                            return string2;
                        case 3:
                            ?? r15 = new int[i11];
                            while (length < i11) {
                                r15[length] = c8417b.readUnsignedShort();
                                length++;
                            }
                            try {
                                c8417b.close();
                                break;
                            } catch (IOException e13) {
                                AbstractC15256t.m16466d("ExifInterface", "IOException occurred while closing InputStream", e13);
                            }
                            return r15;
                        case 4:
                            ?? r16 = new long[i11];
                            while (length < i11) {
                                r16[length] = ((long) c8417b.readInt()) & 4294967295L;
                                length++;
                            }
                            try {
                                c8417b.close();
                                break;
                            } catch (IOException e14) {
                                AbstractC15256t.m16466d("ExifInterface", "IOException occurred while closing InputStream", e14);
                            }
                            return r16;
                        case 5:
                            ?? r17 = new C8420e[i11];
                            while (length < i11) {
                                r17[length] = new C8420e(((long) c8417b.readInt()) & 4294967295L, ((long) c8417b.readInt()) & 4294967295L);
                                length++;
                            }
                            try {
                                c8417b.close();
                                break;
                            } catch (IOException e15) {
                                AbstractC15256t.m16466d("ExifInterface", "IOException occurred while closing InputStream", e15);
                            }
                            return r17;
                        case 8:
                            ?? r18 = new int[i11];
                            while (length < i11) {
                                r18[length] = c8417b.readShort();
                                length++;
                            }
                            try {
                                c8417b.close();
                                break;
                            } catch (IOException e16) {
                                AbstractC15256t.m16466d("ExifInterface", "IOException occurred while closing InputStream", e16);
                            }
                            return r18;
                        case 9:
                            ?? r19 = new int[i11];
                            while (length < i11) {
                                r19[length] = c8417b.readInt();
                                length++;
                            }
                            try {
                                c8417b.close();
                                break;
                            } catch (IOException e17) {
                                AbstractC15256t.m16466d("ExifInterface", "IOException occurred while closing InputStream", e17);
                            }
                            return r19;
                        case 10:
                            ?? r110 = new C8420e[i11];
                            while (length < i11) {
                                r110[length] = new C8420e(c8417b.readInt(), c8417b.readInt());
                                length++;
                            }
                            try {
                                c8417b.close();
                                break;
                            } catch (IOException e18) {
                                AbstractC15256t.m16466d("ExifInterface", "IOException occurred while closing InputStream", e18);
                            }
                            return r110;
                        case 11:
                            ?? r111 = new double[i11];
                            while (length < i11) {
                                r111[length] = c8417b.readFloat();
                                length++;
                            }
                            try {
                                c8417b.close();
                                break;
                            } catch (IOException e19) {
                                AbstractC15256t.m16466d("ExifInterface", "IOException occurred while closing InputStream", e19);
                            }
                            return r111;
                        case 12:
                            ?? r112 = new double[i11];
                            while (length < i11) {
                                r112[length] = c8417b.readDouble();
                                length++;
                            }
                            try {
                                c8417b.close();
                                break;
                            } catch (IOException e20) {
                                AbstractC15256t.m16466d("ExifInterface", "IOException occurred while closing InputStream", e20);
                            }
                            return r112;
                        default:
                            try {
                                c8417b.close();
                                break;
                            } catch (IOException e21) {
                                AbstractC15256t.m16466d("ExifInterface", "IOException occurred while closing InputStream", e21);
                            }
                            return null;
                    }
                } catch (IOException e22) {
                    e = e22;
                    AbstractC15256t.m16483u("ExifInterface", vRJidSveZHcTw.TjuF, e);
                    if (c8417b != null) {
                        try {
                            c8417b.close();
                        } catch (IOException e23) {
                            AbstractC15256t.m16466d("ExifInterface", "IOException occurred while closing InputStream", e23);
                        }
                    }
                    return null;
                }
            } catch (Throwable th2) {
                th = th2;
                inputStream2 = inputStream;
                if (inputStream2 != null) {
                    try {
                        inputStream2.close();
                    } catch (IOException e24) {
                        AbstractC15256t.m16466d("ExifInterface", "IOException occurred while closing InputStream", e24);
                    }
                }
                throw th;
            }
        } catch (IOException e25) {
            e = e25;
            c8417b = null;
        } catch (Throwable th3) {
            th = th3;
            if (inputStream2 != null) {
                inputStream2.close();
            }
            throw th;
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(Separators.LPAREN);
        sb2.append(C8422g.f26198R[this.f26171a]);
        sb2.append(", data length:");
        return AbstractC10763a.m11056n(sb2, this.f26174d.length, Separators.RPAREN);
    }

    public C8418c(long j10, byte[] bArr, int i10, int i11) {
        this.f26171a = i10;
        this.f26172b = i11;
        this.f26173c = j10;
        this.f26174d = bArr;
    }
}
