package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Iterator;
import p571X9.AbstractC9306j0;
import p732en.AbstractC13450g;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.protobuf.g */
/* JADX INFO: loaded from: classes2.dex */
public class C16610g extends ByteString {

    /* JADX INFO: renamed from: Y */
    public final byte[] f52768Y;

    /* JADX INFO: renamed from: Z */
    public int f52769Z = 0;

    public C16610g(byte[] bArr) {
        this.f52768Y = bArr;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ByteString) || size() != ((ByteString) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (obj instanceof C16610g) {
            return m18305t((C16610g) obj, 0, size());
        }
        if (obj instanceof C16612i) {
            return obj.equals(this);
        }
        String strValueOf = String.valueOf(obj.getClass());
        throw new IllegalArgumentException(AbstractC9306j0.m9891j("Has a new type of ByteString been created? Found ", strValueOf, new StringBuilder(strValueOf.length() + 49)));
    }

    public final int hashCode() {
        int iMo18271p = this.f52769Z;
        if (iMo18271p == 0) {
            int size = size();
            iMo18271p = mo18271p(size, 0, size);
            if (iMo18271p == 0) {
                iMo18271p = 1;
            }
            this.f52769Z = iMo18271p;
        }
        return iMo18271p;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    /* JADX INFO: renamed from: i */
    public void mo18268i(int i10, int i11, int i12, byte[] bArr) {
        System.arraycopy(this.f52768Y, i10, bArr, i11, i12);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public final boolean isValidUtf8() {
        byte[] bArr = this.f52768Y;
        return AbstractC13450g.m14977c(bArr, 0, bArr.length) == 0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString, java.lang.Iterable
    public Iterator<Byte> iterator() {
        return new C16609f(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    /* JADX INFO: renamed from: j */
    public final int mo18269j() {
        return 0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    /* JADX INFO: renamed from: m */
    public final boolean mo18270m() {
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public final CodedInputStream newCodedInput() {
        CodedInputStream codedInputStream = new CodedInputStream(this);
        try {
            codedInputStream.pushLimit(this.f52768Y.length);
            return codedInputStream;
        } catch (InvalidProtocolBufferException e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    /* JADX INFO: renamed from: p */
    public final int mo18271p(int i10, int i11, int i12) {
        for (int i13 = i11; i13 < i11 + i12; i13++) {
            i10 = (i10 * 31) + this.f52768Y[i13];
        }
        return i10;
    }

    /* JADX WARN: Code duplicated, block: B:51:0x0086  */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0019, code lost:
    
        if (r0[r9] > (-65)) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x001c, code lost:
    
        r9 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x004d, code lost:
    
        if (r0[r9] > (-65)) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0095, code lost:
    
        if (r0[r8] > (-65)) goto L14;
     */
    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    /* JADX INFO: renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int mo18272q(int i10, int i11, int i12) {
        byte b;
        int i13;
        int i14;
        int i15 = i12 + i11;
        byte[] bArr = this.f52768Y;
        if (i10 != 0) {
            if (i11 >= i15) {
                return i10;
            }
            byte b10 = (byte) i10;
            if (b10 < -32) {
                if (b10 >= -62) {
                    i14 = i11 + 1;
                }
                return -1;
            }
            if (b10 < -16) {
                byte b11 = (byte) (~(i10 >> 8));
                if (b11 == 0) {
                    int i16 = i11 + 1;
                    byte b12 = bArr[i11];
                    if (i16 >= i15) {
                        return AbstractC13450g.m14975a(b10, b12);
                    }
                    i11 = i16;
                    b11 = b12;
                }
                if (b11 <= -65 && ((b10 != -32 || b11 >= -96) && (b10 != -19 || b11 < -96))) {
                    i14 = i11 + 1;
                }
            } else {
                byte b13 = (byte) (~(i10 >> 8));
                if (b13 == 0) {
                    i13 = i11 + 1;
                    b13 = bArr[i11];
                    if (i13 >= i15) {
                        return AbstractC13450g.m14975a(b10, b13);
                    }
                    b = 0;
                } else {
                    b = (byte) (i10 >> 16);
                    i13 = i11;
                }
                if (b == 0) {
                    int i17 = i13 + 1;
                    byte b14 = bArr[i13];
                    if (i17 < i15) {
                        b = b14;
                        i13 = i17;
                        if (b13 <= -65) {
                            if ((((b13 + 112) + (b10 << 28)) >> 30) == 0 && b <= -65) {
                                i11 = i13 + 1;
                            }
                        }
                    } else if (b10 <= -12 && b13 <= -65 && b14 <= -65) {
                        return (b14 << 16) ^ ((b13 << 8) ^ b10);
                    }
                } else if (b13 <= -65) {
                    if ((((b13 + 112) + (b10 << 28)) >> 30) == 0) {
                        i11 = i13 + 1;
                    }
                }
            }
            return -1;
        }
        return AbstractC13450g.m14977c(bArr, i11, i15);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    /* JADX INFO: renamed from: r */
    public final int mo18273r() {
        return this.f52769Z;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    /* JADX INFO: renamed from: s */
    public final void mo18274s(OutputStream outputStream, int i10, int i11) throws IOException {
        outputStream.write(this.f52768Y, i10, i11);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public int size() {
        return this.f52768Y.length;
    }

    /* JADX INFO: renamed from: t */
    public final boolean m18305t(C16610g c16610g, int i10, int i11) {
        byte[] bArr = c16610g.f52768Y;
        int length = bArr.length;
        byte[] bArr2 = this.f52768Y;
        if (i11 > length) {
            int length2 = bArr2.length;
            StringBuilder sb2 = new StringBuilder(40);
            sb2.append("Length too large: ");
            sb2.append(i11);
            sb2.append(length2);
            throw new IllegalArgumentException(sb2.toString());
        }
        int i12 = i10 + i11;
        int length3 = bArr.length;
        byte[] bArr3 = c16610g.f52768Y;
        if (i12 <= length3) {
            int i13 = 0;
            while (i13 < i11) {
                if (bArr2[i13] != bArr3[i10]) {
                    return false;
                }
                i13++;
                i10++;
            }
            return true;
        }
        int length4 = bArr3.length;
        StringBuilder sb3 = new StringBuilder(59);
        sb3.append("Ran off end of other: ");
        sb3.append(i10);
        sb3.append(", ");
        sb3.append(i11);
        sb3.append(", ");
        sb3.append(length4);
        throw new IllegalArgumentException(sb3.toString());
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public final String toString(String str) {
        byte[] bArr = this.f52768Y;
        return new String(bArr, 0, bArr.length, str);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString, java.lang.Iterable
    public Iterator<Byte> iterator() {
        return new C16609f(this);
    }
}
