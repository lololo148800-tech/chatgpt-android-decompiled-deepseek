package p253K;

import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import p283L5.AbstractC4941g;

/* JADX INFO: renamed from: K.k */
/* JADX INFO: loaded from: classes.dex */
public final class C4500k extends FilterOutputStream {

    /* JADX INFO: renamed from: s0 */
    public static final byte[] f14681s0 = "Exif\u0000\u0000".getBytes(C4495f.f14661d);

    /* JADX INFO: renamed from: Y */
    public final C4499j f14682Y;

    /* JADX INFO: renamed from: Z */
    public final byte[] f14683Z;

    /* JADX INFO: renamed from: o0 */
    public final ByteBuffer f14684o0;

    /* JADX INFO: renamed from: p0 */
    public int f14685p0;

    /* JADX INFO: renamed from: q0 */
    public int f14686q0;

    /* JADX INFO: renamed from: r0 */
    public int f14687r0;

    public C4500k(ByteArrayOutputStream byteArrayOutputStream, C4499j c4499j) {
        super(new BufferedOutputStream(byteArrayOutputStream, 65536));
        this.f14683Z = new byte[1];
        this.f14684o0 = ByteBuffer.allocate(4);
        this.f14685p0 = 0;
        this.f14682Y = c4499j;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr, int i10, int i11) throws IOException {
        C4499j c4499j;
        int i12;
        int i13;
        int i14 = 0;
        int i15 = 1;
        int i16 = i10;
        int i17 = i11;
        while (true) {
            int i18 = this.f14686q0;
            if ((i18 <= 0 && this.f14687r0 <= 0 && this.f14685p0 == 2) || i17 <= 0) {
                break;
            }
            if (i18 > 0) {
                int iMin = Math.min(i17, i18);
                i17 -= iMin;
                this.f14686q0 -= iMin;
                i16 += iMin;
            }
            int i19 = this.f14687r0;
            if (i19 > 0) {
                int iMin2 = Math.min(i17, i19);
                ((FilterOutputStream) this).out.write(bArr, i16, iMin2);
                i17 -= iMin2;
                this.f14687r0 -= iMin2;
                i16 += iMin2;
            }
            if (i17 == 0) {
                return;
            }
            int i20 = this.f14685p0;
            int i21 = 4;
            ByteBuffer byteBuffer = this.f14684o0;
            if (i20 != 0) {
                if (i20 == i15) {
                    int iMin3 = Math.min(i17, 4 - byteBuffer.position());
                    byteBuffer.put(bArr, i16, iMin3);
                    i16 += iMin3;
                    i17 -= iMin3;
                    if (byteBuffer.position() == 2 && byteBuffer.getShort() == -39) {
                        ((FilterOutputStream) this).out.write(byteBuffer.array(), i14, 2);
                        byteBuffer.rewind();
                    }
                    if (byteBuffer.position() < 4) {
                        return;
                    }
                    byteBuffer.rewind();
                    short s10 = byteBuffer.getShort();
                    if (s10 == -31) {
                        this.f14686q0 = (byteBuffer.getShort() & 65535) - 2;
                        this.f14685p0 = 2;
                    } else if (s10 < -64 || s10 > -49 || s10 == -60 || s10 == -56 || s10 == -52) {
                        ((FilterOutputStream) this).out.write(byteBuffer.array(), i14, 4);
                        this.f14687r0 = (byteBuffer.getShort() & 65535) - 2;
                    } else {
                        ((FilterOutputStream) this).out.write(byteBuffer.array(), i14, 4);
                        this.f14685p0 = 2;
                    }
                    byteBuffer.rewind();
                }
                i13 = i14;
                i12 = i15;
            } else {
                int iMin4 = Math.min(i17, 2 - byteBuffer.position());
                byteBuffer.put(bArr, i16, iMin4);
                i16 += iMin4;
                i17 -= iMin4;
                if (byteBuffer.position() < 2) {
                    return;
                }
                byteBuffer.rewind();
                if (byteBuffer.getShort() != -40) {
                    throw new IOException("Not a valid jpeg image, cannot write exif");
                }
                ((FilterOutputStream) this).out.write(byteBuffer.array(), i14, 2);
                this.f14685p0 = i15;
                byteBuffer.rewind();
                C4492c c4492c = new C4492c(((FilterOutputStream) this).out, ByteOrder.BIG_ENDIAN, i14);
                c4492c.m5225k((short) -31);
                int[] iArr = new int[4];
                int[] iArr2 = new int[4];
                C4501l[] c4501lArr = C4499j.f14676c;
                int i22 = i14;
                while (true) {
                    c4499j = this.f14682Y;
                    if (i22 >= i21) {
                        break;
                    }
                    C4501l c4501l = c4501lArr[i22];
                    int i23 = i14;
                    while (true) {
                        C4501l[] c4501lArr2 = C4499j.f14676c;
                        if (i23 < i21) {
                            c4499j.m5237a(i23).remove(c4501l.f14689b);
                            i23 += i15;
                            i21 = 4;
                        }
                    }
                    i22 += i15;
                    i21 = 4;
                }
                boolean zIsEmpty = c4499j.m5237a(i15).isEmpty();
                ByteOrder byteOrder = c4499j.f14680b;
                if (!zIsEmpty) {
                    c4499j.m5237a(i14).put(C4499j.f14676c[i15].f14689b, C4495f.m5231a(0L, byteOrder));
                }
                if (!c4499j.m5237a(2).isEmpty()) {
                    c4499j.m5237a(i14).put(C4499j.f14676c[2].f14689b, C4495f.m5231a(0L, byteOrder));
                }
                if (!c4499j.m5237a(3).isEmpty()) {
                    c4499j.m5237a(i15).put(C4499j.f14676c[3].f14689b, C4495f.m5231a(0L, byteOrder));
                }
                int i24 = i14;
                while (true) {
                    C4501l[] c4501lArr3 = C4499j.f14676c;
                    if (i24 >= 4) {
                        break;
                    }
                    Iterator it = c4499j.m5237a(i24).entrySet().iterator();
                    int i25 = i14;
                    while (it.hasNext()) {
                        C4495f c4495f = (C4495f) ((Map.Entry) it.next()).getValue();
                        int i26 = C4495f.f14663f[c4495f.f14664a] * c4495f.f14665b;
                        if (i26 > 4) {
                            i25 += i26;
                        }
                    }
                    iArr2[i24] = iArr2[i24] + i25;
                    i24 += i15;
                    i14 = 0;
                }
                int i27 = 0;
                int size = 8;
                while (true) {
                    C4501l[] c4501lArr4 = C4499j.f14676c;
                    if (i27 >= 4) {
                        break;
                    }
                    if (!c4499j.m5237a(i27).isEmpty()) {
                        iArr[i27] = size;
                        size += (c4499j.m5237a(i27).size() * 12) + 6 + iArr2[i27];
                    }
                    i27 += i15;
                }
                int i28 = size + 8;
                if (!c4499j.m5237a(i15).isEmpty()) {
                    c4499j.m5237a(0).put(C4499j.f14676c[i15].f14689b, C4495f.m5231a(iArr[i15], byteOrder));
                }
                if (!c4499j.m5237a(2).isEmpty()) {
                    c4499j.m5237a(0).put(C4499j.f14676c[2].f14689b, C4495f.m5231a(iArr[2], byteOrder));
                }
                if (!c4499j.m5237a(3).isEmpty()) {
                    c4499j.m5237a(i15).put(C4499j.f14676c[3].f14689b, C4495f.m5231a(iArr[3], byteOrder));
                }
                c4492c.m5225k((short) i28);
                c4492c.write(f14681s0);
                c4492c.m5225k(byteOrder == ByteOrder.BIG_ENDIAN ? (short) 19789 : (short) 18761);
                c4492c.f14653o0 = byteOrder;
                c4492c.m5225k((short) 42);
                c4492c.m5224e((int) 8);
                int i29 = 0;
                while (true) {
                    C4501l[] c4501lArr5 = C4499j.f14676c;
                    if (i29 >= 4) {
                        break;
                    }
                    if (!c4499j.m5237a(i29).isEmpty()) {
                        c4492c.m5225k((short) c4499j.m5237a(i29).size());
                        int size2 = (c4499j.m5237a(i29).size() * 12) + iArr[i29] + 2 + 4;
                        for (Map.Entry entry : c4499j.m5237a(i29).entrySet()) {
                            C4501l c4501l2 = (C4501l) ((HashMap) C4498i.f14673f.get(i29)).get(entry.getKey());
                            AbstractC4941g.m5558Q(c4501l2, "Tag not supported: " + ((String) entry.getKey()) + ". Tag needs to be ported from ExifInterface to ExifData.");
                            C4495f c4495f2 = (C4495f) entry.getValue();
                            int i30 = C4495f.f14663f[c4495f2.f14664a];
                            int i31 = c4495f2.f14665b;
                            int i32 = i30 * i31;
                            c4492c.m5225k((short) c4501l2.f14688a);
                            c4492c.m5225k((short) c4495f2.f14664a);
                            c4492c.m5224e(i31);
                            if (i32 > 4) {
                                c4492c.m5224e(size2);
                                size2 += i32;
                            } else {
                                c4492c.write(c4495f2.f14666c);
                                if (i32 < 4) {
                                    for (int i33 = 4; i32 < i33; i33 = 4) {
                                        c4492c.f14652Z.write(0);
                                        i32++;
                                    }
                                }
                            }
                        }
                        c4492c.m5224e((int) 0);
                        Iterator it2 = c4499j.m5237a(i29).entrySet().iterator();
                        while (it2.hasNext()) {
                            byte[] bArr2 = ((C4495f) ((Map.Entry) it2.next()).getValue()).f14666c;
                            if (bArr2.length > 4) {
                                c4492c.write(bArr2, 0, bArr2.length);
                            }
                        }
                    }
                    i29++;
                    i15 = 1;
                }
                i12 = i15;
                i13 = 0;
                c4492c.f14653o0 = ByteOrder.BIG_ENDIAN;
            }
            i15 = i12;
            i14 = i13;
        }
        if (i17 > 0) {
            ((FilterOutputStream) this).out.write(bArr, i16, i17);
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(int i10) throws IOException {
        byte[] bArr = this.f14683Z;
        bArr[0] = (byte) (i10 & 255);
        write(bArr);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }
}
