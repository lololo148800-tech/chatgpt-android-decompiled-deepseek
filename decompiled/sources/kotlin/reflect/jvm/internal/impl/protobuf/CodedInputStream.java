package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import p732en.AbstractC13450g;

/* JADX INFO: loaded from: classes2.dex */
public final class CodedInputStream {

    /* JADX INFO: renamed from: a */
    public final byte[] f52717a;

    /* JADX INFO: renamed from: b */
    public int f52718b;

    /* JADX INFO: renamed from: c */
    public int f52719c;

    /* JADX INFO: renamed from: d */
    public int f52720d;

    /* JADX INFO: renamed from: e */
    public final InputStream f52721e;

    /* JADX INFO: renamed from: f */
    public int f52722f;

    /* JADX INFO: renamed from: g */
    public int f52723g;

    /* JADX INFO: renamed from: h */
    public int f52724h;

    /* JADX INFO: renamed from: i */
    public int f52725i;

    public CodedInputStream(InputStream inputStream) {
        this.f52724h = Integer.MAX_VALUE;
        this.f52717a = new byte[4096];
        this.f52718b = 0;
        this.f52720d = 0;
        this.f52723g = 0;
        this.f52721e = inputStream;
    }

    public static int decodeZigZag32(int i10) {
        return (-(i10 & 1)) ^ (i10 >>> 1);
    }

    public static long decodeZigZag64(long j10) {
        return (-(j10 & 1)) ^ (j10 >>> 1);
    }

    public static CodedInputStream newInstance(InputStream inputStream) {
        return new CodedInputStream(inputStream);
    }

    /* JADX INFO: renamed from: a */
    public final byte[] m18277a(int i10) throws InvalidProtocolBufferException {
        if (i10 <= 0) {
            if (i10 == 0) {
                return Internal.EMPTY_BYTE_ARRAY;
            }
            throw new InvalidProtocolBufferException("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i11 = this.f52723g;
        int i12 = this.f52720d;
        int i13 = i11 + i12 + i10;
        int i14 = this.f52724h;
        if (i13 > i14) {
            skipRawBytes((i14 - i11) - i12);
            throw InvalidProtocolBufferException.m18290a();
        }
        byte[] bArr = this.f52717a;
        if (i10 < 4096) {
            byte[] bArr2 = new byte[i10];
            int i15 = this.f52718b - i12;
            System.arraycopy(bArr, i12, bArr2, 0, i15);
            this.f52720d = this.f52718b;
            int i16 = i10 - i15;
            if (i16 > 0) {
                m18280d(i16);
            }
            System.arraycopy(bArr, 0, bArr2, i15, i16);
            this.f52720d = i16;
            return bArr2;
        }
        int i17 = this.f52718b;
        this.f52723g = i11 + i17;
        this.f52720d = 0;
        this.f52718b = 0;
        int length = i17 - i12;
        int i18 = i10 - length;
        ArrayList<byte[]> arrayList = new ArrayList();
        while (i18 > 0) {
            int iMin = Math.min(i18, 4096);
            byte[] bArr3 = new byte[iMin];
            int i19 = 0;
            while (i19 < iMin) {
                InputStream inputStream = this.f52721e;
                int i20 = inputStream == null ? -1 : inputStream.read(bArr3, i19, iMin - i19);
                if (i20 == -1) {
                    throw InvalidProtocolBufferException.m18290a();
                }
                this.f52723g += i20;
                i19 += i20;
            }
            i18 -= iMin;
            arrayList.add(bArr3);
        }
        byte[] bArr4 = new byte[i10];
        System.arraycopy(bArr, i12, bArr4, 0, length);
        for (byte[] bArr5 : arrayList) {
            System.arraycopy(bArr5, 0, bArr4, length, bArr5.length);
            length += bArr5.length;
        }
        return bArr4;
    }

    /* JADX INFO: renamed from: b */
    public final long m18278b() throws InvalidProtocolBufferException {
        long j10 = 0;
        for (int i10 = 0; i10 < 64; i10 += 7) {
            byte rawByte = readRawByte();
            j10 |= ((long) (rawByte & 127)) << i10;
            if ((rawByte & 128) == 0) {
                return j10;
            }
        }
        throw new InvalidProtocolBufferException("CodedInputStream encountered a malformed varint.");
    }

    /* JADX INFO: renamed from: c */
    public final void m18279c() {
        int i10 = this.f52718b + this.f52719c;
        this.f52718b = i10;
        int i11 = this.f52723g + i10;
        int i12 = this.f52724h;
        if (i11 <= i12) {
            this.f52719c = 0;
            return;
        }
        int i13 = i11 - i12;
        this.f52719c = i13;
        this.f52718b = i10 - i13;
    }

    public void checkLastTagWas(int i10) throws InvalidProtocolBufferException {
        if (this.f52722f != i10) {
            throw new InvalidProtocolBufferException("Protocol message end-group tag did not match expected tag.");
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m18280d(int i10) throws InvalidProtocolBufferException {
        if (!m18281e(i10)) {
            throw InvalidProtocolBufferException.m18290a();
        }
    }

    /* JADX INFO: renamed from: e */
    public final boolean m18281e(int i10) throws IOException {
        InputStream inputStream;
        int i11 = this.f52720d;
        int i12 = i11 + i10;
        int i13 = this.f52718b;
        if (i12 <= i13) {
            StringBuilder sb2 = new StringBuilder(77);
            sb2.append("refillBuffer() called when ");
            sb2.append(i10);
            sb2.append(" bytes were already available in buffer");
            throw new IllegalStateException(sb2.toString());
        }
        if (this.f52723g + i11 + i10 <= this.f52724h && (inputStream = this.f52721e) != null) {
            byte[] bArr = this.f52717a;
            if (i11 > 0) {
                if (i13 > i11) {
                    System.arraycopy(bArr, i11, bArr, 0, i13 - i11);
                }
                this.f52723g += i11;
                this.f52718b -= i11;
                this.f52720d = 0;
            }
            int i14 = this.f52718b;
            int i15 = inputStream.read(bArr, i14, bArr.length - i14);
            if (i15 == 0 || i15 < -1 || i15 > bArr.length) {
                StringBuilder sb3 = new StringBuilder(102);
                sb3.append("InputStream#read(byte[]) returned invalid result: ");
                sb3.append(i15);
                sb3.append("\nThe InputStream implementation is buggy.");
                throw new IllegalStateException(sb3.toString());
            }
            if (i15 > 0) {
                this.f52718b += i15;
                if ((this.f52723g + i10) - 67108864 > 0) {
                    throw new InvalidProtocolBufferException("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
                }
                m18279c();
                if (this.f52718b >= i10) {
                    return true;
                }
                return m18281e(i10);
            }
        }
        return false;
    }

    public int getBytesUntilLimit() {
        int i10 = this.f52724h;
        if (i10 == Integer.MAX_VALUE) {
            return -1;
        }
        return i10 - (this.f52723g + this.f52720d);
    }

    public boolean isAtEnd() {
        return this.f52720d == this.f52718b && !m18281e(1);
    }

    public void popLimit(int i10) {
        this.f52724h = i10;
        m18279c();
    }

    public int pushLimit(int i10) throws InvalidProtocolBufferException {
        if (i10 < 0) {
            throw new InvalidProtocolBufferException("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i11 = this.f52723g + this.f52720d + i10;
        int i12 = this.f52724h;
        if (i11 > i12) {
            throw InvalidProtocolBufferException.m18290a();
        }
        this.f52724h = i11;
        m18279c();
        return i12;
    }

    public boolean readBool() {
        return readRawVarint64() != 0;
    }

    public ByteString readBytes() {
        int rawVarint32 = readRawVarint32();
        int i10 = this.f52718b;
        int i11 = this.f52720d;
        if (rawVarint32 > i10 - i11 || rawVarint32 <= 0) {
            return rawVarint32 == 0 ? ByteString.EMPTY : new C16610g(m18277a(rawVarint32));
        }
        ByteString byteStringCopyFrom = ByteString.copyFrom(this.f52717a, i11, rawVarint32);
        this.f52720d += rawVarint32;
        return byteStringCopyFrom;
    }

    public double readDouble() {
        return Double.longBitsToDouble(readRawLittleEndian64());
    }

    public int readEnum() {
        return readRawVarint32();
    }

    public int readFixed32() {
        return readRawLittleEndian32();
    }

    public long readFixed64() {
        return readRawLittleEndian64();
    }

    public float readFloat() {
        return Float.intBitsToFloat(readRawLittleEndian32());
    }

    public void readGroup(int i10, MessageLite.Builder builder, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        int i11 = this.f52725i;
        if (i11 >= 64) {
            throw new InvalidProtocolBufferException("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
        }
        this.f52725i = i11 + 1;
        builder.mergeFrom(this, extensionRegistryLite);
        checkLastTagWas((i10 << 3) | 4);
        this.f52725i--;
    }

    public int readInt32() {
        return readRawVarint32();
    }

    public long readInt64() {
        return readRawVarint64();
    }

    public void readMessage(MessageLite.Builder builder, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        int rawVarint32 = readRawVarint32();
        if (this.f52725i >= 64) {
            throw new InvalidProtocolBufferException("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
        }
        int iPushLimit = pushLimit(rawVarint32);
        this.f52725i++;
        builder.mergeFrom(this, extensionRegistryLite);
        checkLastTagWas(0);
        this.f52725i--;
        popLimit(iPushLimit);
    }

    public byte readRawByte() throws InvalidProtocolBufferException {
        if (this.f52720d == this.f52718b) {
            m18280d(1);
        }
        int i10 = this.f52720d;
        this.f52720d = i10 + 1;
        return this.f52717a[i10];
    }

    public int readRawLittleEndian32() throws InvalidProtocolBufferException {
        int i10 = this.f52720d;
        if (this.f52718b - i10 < 4) {
            m18280d(4);
            i10 = this.f52720d;
        }
        this.f52720d = i10 + 4;
        byte[] bArr = this.f52717a;
        return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
    }

    public long readRawLittleEndian64() throws InvalidProtocolBufferException {
        int i10 = this.f52720d;
        if (this.f52718b - i10 < 8) {
            m18280d(8);
            i10 = this.f52720d;
        }
        this.f52720d = i10 + 8;
        byte[] bArr = this.f52717a;
        return ((((long) bArr[i10 + 7]) & 255) << 56) | (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 1]) & 255) << 8) | ((((long) bArr[i10 + 2]) & 255) << 16) | ((((long) bArr[i10 + 3]) & 255) << 24) | ((((long) bArr[i10 + 4]) & 255) << 32) | ((((long) bArr[i10 + 5]) & 255) << 40) | ((((long) bArr[i10 + 6]) & 255) << 48);
    }

    public int readRawVarint32() {
        int i10;
        int i11 = this.f52720d;
        int i12 = this.f52718b;
        if (i12 != i11) {
            int i13 = i11 + 1;
            byte[] bArr = this.f52717a;
            byte b = bArr[i11];
            if (b >= 0) {
                this.f52720d = i13;
                return b;
            }
            if (i12 - i13 >= 9) {
                int i14 = i11 + 2;
                int i15 = (bArr[i13] << 7) ^ b;
                long j10 = i15;
                if (j10 < 0) {
                    i10 = (int) ((-128) ^ j10);
                } else {
                    int i16 = i11 + 3;
                    int i17 = (bArr[i14] << 14) ^ i15;
                    long j11 = i17;
                    if (j11 >= 0) {
                        i10 = (int) (16256 ^ j11);
                    } else {
                        int i18 = i11 + 4;
                        int i19 = i17 ^ (bArr[i16] << 21);
                        long j12 = i19;
                        if (j12 < 0) {
                            i10 = (int) ((-2080896) ^ j12);
                        } else {
                            i16 = i11 + 5;
                            byte b10 = bArr[i18];
                            int i20 = (int) (((long) (i19 ^ (b10 << 28))) ^ 266354560);
                            if (b10 < 0) {
                                i18 = i11 + 6;
                                if (bArr[i16] < 0) {
                                    i16 = i11 + 7;
                                    if (bArr[i18] < 0) {
                                        i18 = i11 + 8;
                                        if (bArr[i16] < 0) {
                                            i16 = i11 + 9;
                                            if (bArr[i18] < 0) {
                                                int i21 = i11 + 10;
                                                if (bArr[i16] >= 0) {
                                                    i14 = i21;
                                                    i10 = i20;
                                                }
                                            }
                                        }
                                    }
                                }
                                i10 = i20;
                            }
                            i10 = i20;
                        }
                        i14 = i18;
                    }
                    i14 = i16;
                }
                this.f52720d = i14;
                return i10;
            }
        }
        return (int) m18278b();
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b6, code lost:
    
        if (r3[r2] < 0) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public long readRawVarint64() {
        long j10;
        long j11;
        long j12;
        int i10 = this.f52720d;
        int i11 = this.f52718b;
        if (i11 != i10) {
            int i12 = i10 + 1;
            byte[] bArr = this.f52717a;
            byte b = bArr[i10];
            if (b >= 0) {
                this.f52720d = i12;
                return b;
            }
            if (i11 - i12 >= 9) {
                int i13 = i10 + 2;
                long j13 = (bArr[i12] << 7) ^ b;
                if (j13 >= 0) {
                    int i14 = i10 + 3;
                    long j14 = j13 ^ ((long) (bArr[i13] << 14));
                    if (j14 >= 0) {
                        j12 = 16256;
                    } else {
                        i13 = i10 + 4;
                        j13 = j14 ^ ((long) (bArr[i14] << 21));
                        if (j13 < 0) {
                            j11 = -2080896;
                        } else {
                            i14 = i10 + 5;
                            j14 = j13 ^ (((long) bArr[i13]) << 28);
                            if (j14 >= 0) {
                                j12 = 266354560;
                            } else {
                                i13 = i10 + 6;
                                j13 = j14 ^ (((long) bArr[i14]) << 35);
                                if (j13 >= 0) {
                                    i14 = i10 + 7;
                                    j14 = j13 ^ (((long) bArr[i13]) << 42);
                                    if (j14 >= 0) {
                                        j12 = 4363953127296L;
                                    } else {
                                        i13 = i10 + 8;
                                        j13 = j14 ^ (((long) bArr[i14]) << 49);
                                        if (j13 < 0) {
                                            j11 = -558586000294016L;
                                        } else {
                                            int i15 = i10 + 9;
                                            long j15 = (j13 ^ (((long) bArr[i13]) << 56)) ^ 71499008037633920L;
                                            i13 = j15 < 0 ? i10 + 10 : i15;
                                            j10 = j15;
                                        }
                                    }
                                    this.f52720d = i13;
                                    return j10;
                                }
                                j11 = -34093383808L;
                            }
                        }
                    }
                    i13 = i14;
                    j10 = j12 ^ j14;
                    this.f52720d = i13;
                    return j10;
                }
                j11 = -128;
                j10 = j11 ^ j13;
                this.f52720d = i13;
                return j10;
            }
        }
        return m18278b();
    }

    public int readSFixed32() {
        return readRawLittleEndian32();
    }

    public long readSFixed64() {
        return readRawLittleEndian64();
    }

    public int readSInt32() {
        return decodeZigZag32(readRawVarint32());
    }

    public long readSInt64() {
        return decodeZigZag64(readRawVarint64());
    }

    public String readString() {
        int rawVarint32 = readRawVarint32();
        int i10 = this.f52718b;
        int i11 = this.f52720d;
        if (rawVarint32 > i10 - i11 || rawVarint32 <= 0) {
            return rawVarint32 == 0 ? "" : new String(m18277a(rawVarint32), "UTF-8");
        }
        String str = new String(this.f52717a, i11, rawVarint32, "UTF-8");
        this.f52720d += rawVarint32;
        return str;
    }

    public String readStringRequireUtf8() throws InvalidProtocolBufferException {
        byte[] bArrM18277a;
        int rawVarint32 = readRawVarint32();
        int i10 = this.f52720d;
        if (rawVarint32 <= this.f52718b - i10 && rawVarint32 > 0) {
            this.f52720d = i10 + rawVarint32;
            bArrM18277a = this.f52717a;
        } else {
            if (rawVarint32 == 0) {
                return "";
            }
            bArrM18277a = m18277a(rawVarint32);
            i10 = 0;
        }
        if (AbstractC13450g.m14977c(bArrM18277a, i10, i10 + rawVarint32) == 0) {
            return new String(bArrM18277a, i10, rawVarint32, "UTF-8");
        }
        throw new InvalidProtocolBufferException("Protocol message had invalid UTF-8.");
    }

    public int readTag() throws InvalidProtocolBufferException {
        if (isAtEnd()) {
            this.f52722f = 0;
            return 0;
        }
        int rawVarint32 = readRawVarint32();
        this.f52722f = rawVarint32;
        if (WireFormat.getTagFieldNumber(rawVarint32) != 0) {
            return this.f52722f;
        }
        throw new InvalidProtocolBufferException("Protocol message contained an invalid tag (zero).");
    }

    public int readUInt32() {
        return readRawVarint32();
    }

    public long readUInt64() {
        return readRawVarint64();
    }

    public boolean skipField(int i10, CodedOutputStream codedOutputStream) throws InvalidProtocolBufferException {
        int i11 = i10 & 7;
        if (i11 == 0) {
            long int64 = readInt64();
            codedOutputStream.writeRawVarint32(i10);
            codedOutputStream.writeUInt64NoTag(int64);
            return true;
        }
        if (i11 == 1) {
            long rawLittleEndian64 = readRawLittleEndian64();
            codedOutputStream.writeRawVarint32(i10);
            codedOutputStream.writeFixed64NoTag(rawLittleEndian64);
            return true;
        }
        if (i11 == 2) {
            ByteString bytes = readBytes();
            codedOutputStream.writeRawVarint32(i10);
            codedOutputStream.writeBytesNoTag(bytes);
            return true;
        }
        if (i11 == 3) {
            codedOutputStream.writeRawVarint32(i10);
            skipMessage(codedOutputStream);
            int tagFieldNumber = (WireFormat.getTagFieldNumber(i10) << 3) | 4;
            checkLastTagWas(tagFieldNumber);
            codedOutputStream.writeRawVarint32(tagFieldNumber);
            return true;
        }
        if (i11 == 4) {
            return false;
        }
        if (i11 != 5) {
            throw new InvalidProtocolBufferException("Protocol message tag had invalid wire type.");
        }
        int rawLittleEndian32 = readRawLittleEndian32();
        codedOutputStream.writeRawVarint32(i10);
        codedOutputStream.writeFixed32NoTag(rawLittleEndian32);
        return true;
    }

    public void skipMessage(CodedOutputStream codedOutputStream) throws InvalidProtocolBufferException {
        int tag;
        do {
            tag = readTag();
            if (tag == 0) {
                return;
            }
        } while (skipField(tag, codedOutputStream));
    }

    public void skipRawBytes(int i10) throws InvalidProtocolBufferException {
        int i11 = this.f52718b;
        int i12 = this.f52720d;
        int i13 = i11 - i12;
        if (i10 <= i13 && i10 >= 0) {
            this.f52720d = i12 + i10;
            return;
        }
        if (i10 < 0) {
            throw new InvalidProtocolBufferException("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i14 = this.f52723g;
        int i15 = i14 + i12 + i10;
        int i16 = this.f52724h;
        if (i15 > i16) {
            skipRawBytes((i16 - i14) - i12);
            throw InvalidProtocolBufferException.m18290a();
        }
        this.f52720d = i11;
        m18280d(1);
        while (true) {
            int i17 = i10 - i13;
            int i18 = this.f52718b;
            if (i17 <= i18) {
                this.f52720d = i17;
                return;
            } else {
                i13 += i18;
                this.f52720d = i18;
                m18280d(1);
            }
        }
    }

    public CodedInputStream(C16610g c16610g) {
        this.f52724h = Integer.MAX_VALUE;
        byte[] bArr = c16610g.f52768Y;
        this.f52717a = bArr;
        this.f52720d = 0;
        this.f52718b = bArr.length;
        this.f52723g = -0;
        this.f52721e = null;
    }

    public <T extends MessageLite> T readMessage(Parser<T> parser, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        int rawVarint32 = readRawVarint32();
        if (this.f52725i < 64) {
            int iPushLimit = pushLimit(rawVarint32);
            this.f52725i++;
            T partialFrom = parser.parsePartialFrom(this, extensionRegistryLite);
            checkLastTagWas(0);
            this.f52725i--;
            popLimit(iPushLimit);
            return partialFrom;
        }
        throw new InvalidProtocolBufferException("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    public static int readRawVarint32(int i10, InputStream inputStream) throws IOException {
        if ((i10 & 128) == 0) {
            return i10;
        }
        int i11 = i10 & 127;
        int i12 = 7;
        while (i12 < 32) {
            int i13 = inputStream.read();
            if (i13 == -1) {
                throw InvalidProtocolBufferException.m18290a();
            }
            i11 |= (i13 & 127) << i12;
            if ((i13 & 128) == 0) {
                return i11;
            }
            i12 += 7;
        }
        while (i12 < 64) {
            int i14 = inputStream.read();
            if (i14 == -1) {
                throw InvalidProtocolBufferException.m18290a();
            }
            if ((i14 & 128) == 0) {
                return i11;
            }
            i12 += 7;
        }
        throw new InvalidProtocolBufferException("CodedInputStream encountered a malformed varint.");
    }
}
