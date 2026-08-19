package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: classes2.dex */
public final class CodedOutputStream {

    /* JADX INFO: renamed from: a */
    public final byte[] f52726a;

    /* JADX INFO: renamed from: b */
    public final int f52727b;

    /* JADX INFO: renamed from: c */
    public int f52728c = 0;

    /* JADX INFO: renamed from: d */
    public final OutputStream f52729d;

    public static class OutOfSpaceException extends IOException {
    }

    public CodedOutputStream(OutputStream outputStream, byte[] bArr) {
        this.f52729d = outputStream;
        this.f52726a = bArr;
        this.f52727b = bArr.length;
    }

    public static int computeBoolSize(int i10, boolean z6) {
        return computeBoolSizeNoTag(z6) + computeTagSize(i10);
    }

    public static int computeBoolSizeNoTag(boolean z6) {
        return 1;
    }

    public static int computeByteArraySizeNoTag(byte[] bArr) {
        return computeRawVarint32Size(bArr.length) + bArr.length;
    }

    public static int computeBytesSize(int i10, ByteString byteString) {
        return computeBytesSizeNoTag(byteString) + computeTagSize(i10);
    }

    public static int computeBytesSizeNoTag(ByteString byteString) {
        return byteString.size() + computeRawVarint32Size(byteString.size());
    }

    public static int computeDoubleSize(int i10, double d10) {
        return computeDoubleSizeNoTag(d10) + computeTagSize(i10);
    }

    public static int computeDoubleSizeNoTag(double d10) {
        return 8;
    }

    public static int computeEnumSize(int i10, int i11) {
        return computeEnumSizeNoTag(i11) + computeTagSize(i10);
    }

    public static int computeEnumSizeNoTag(int i10) {
        return computeInt32SizeNoTag(i10);
    }

    public static int computeFixed32SizeNoTag(int i10) {
        return 4;
    }

    public static int computeFixed64SizeNoTag(long j10) {
        return 8;
    }

    public static int computeFloatSize(int i10, float f10) {
        return computeFloatSizeNoTag(f10) + computeTagSize(i10);
    }

    public static int computeFloatSizeNoTag(float f10) {
        return 4;
    }

    public static int computeGroupSizeNoTag(MessageLite messageLite) {
        return messageLite.getSerializedSize();
    }

    public static int computeInt32Size(int i10, int i11) {
        return computeInt32SizeNoTag(i11) + computeTagSize(i10);
    }

    public static int computeInt32SizeNoTag(int i10) {
        if (i10 >= 0) {
            return computeRawVarint32Size(i10);
        }
        return 10;
    }

    public static int computeInt64SizeNoTag(long j10) {
        return computeRawVarint64Size(j10);
    }

    public static int computeLazyFieldSizeNoTag(LazyFieldLite lazyFieldLite) {
        int serializedSize = lazyFieldLite.getSerializedSize();
        return computeRawVarint32Size(serializedSize) + serializedSize;
    }

    public static int computeMessageSize(int i10, MessageLite messageLite) {
        return computeMessageSizeNoTag(messageLite) + computeTagSize(i10);
    }

    public static int computeMessageSizeNoTag(MessageLite messageLite) {
        int serializedSize = messageLite.getSerializedSize();
        return computeRawVarint32Size(serializedSize) + serializedSize;
    }

    public static int computeRawVarint32Size(int i10) {
        if ((i10 & (-128)) == 0) {
            return 1;
        }
        if ((i10 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i10) == 0) {
            return 3;
        }
        return (i10 & (-268435456)) == 0 ? 4 : 5;
    }

    public static int computeRawVarint64Size(long j10) {
        if (((-128) & j10) == 0) {
            return 1;
        }
        if (((-16384) & j10) == 0) {
            return 2;
        }
        if (((-2097152) & j10) == 0) {
            return 3;
        }
        if (((-268435456) & j10) == 0) {
            return 4;
        }
        if (((-34359738368L) & j10) == 0) {
            return 5;
        }
        if (((-4398046511104L) & j10) == 0) {
            return 6;
        }
        if (((-562949953421312L) & j10) == 0) {
            return 7;
        }
        if (((-72057594037927936L) & j10) == 0) {
            return 8;
        }
        return (j10 & Long.MIN_VALUE) == 0 ? 9 : 10;
    }

    public static int computeSFixed32SizeNoTag(int i10) {
        return 4;
    }

    public static int computeSFixed64SizeNoTag(long j10) {
        return 8;
    }

    public static int computeSInt32SizeNoTag(int i10) {
        return computeRawVarint32Size(encodeZigZag32(i10));
    }

    public static int computeSInt64Size(int i10, long j10) {
        return computeSInt64SizeNoTag(j10) + computeTagSize(i10);
    }

    public static int computeSInt64SizeNoTag(long j10) {
        return computeRawVarint64Size(encodeZigZag64(j10));
    }

    public static int computeStringSizeNoTag(String str) {
        try {
            byte[] bytes = str.getBytes("UTF-8");
            return computeRawVarint32Size(bytes.length) + bytes.length;
        } catch (UnsupportedEncodingException e10) {
            throw new RuntimeException("UTF-8 not supported.", e10);
        }
    }

    public static int computeTagSize(int i10) {
        return computeRawVarint32Size(i10 << 3);
    }

    public static int computeUInt32SizeNoTag(int i10) {
        return computeRawVarint32Size(i10);
    }

    public static int computeUInt64SizeNoTag(long j10) {
        return computeRawVarint64Size(j10);
    }

    public static int encodeZigZag32(int i10) {
        return (i10 >> 31) ^ (i10 << 1);
    }

    public static long encodeZigZag64(long j10) {
        return (j10 >> 63) ^ (j10 << 1);
    }

    public static CodedOutputStream newInstance(OutputStream outputStream, int i10) {
        return new CodedOutputStream(outputStream, new byte[i10]);
    }

    /* JADX INFO: renamed from: a */
    public final void m18282a() throws IOException {
        OutputStream outputStream = this.f52729d;
        if (outputStream == null) {
            throw new OutOfSpaceException("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }
        outputStream.write(this.f52726a, 0, this.f52728c);
        this.f52728c = 0;
    }

    public void flush() throws IOException {
        if (this.f52729d != null) {
            m18282a();
        }
    }

    public void writeBool(int i10, boolean z6) {
        writeTag(i10, 0);
        writeBoolNoTag(z6);
    }

    public void writeBoolNoTag(boolean z6) throws IOException {
        writeRawByte(z6 ? 1 : 0);
    }

    public void writeByteArrayNoTag(byte[] bArr) throws IOException {
        writeRawVarint32(bArr.length);
        writeRawBytes(bArr);
    }

    public void writeBytes(int i10, ByteString byteString) {
        writeTag(i10, 2);
        writeBytesNoTag(byteString);
    }

    public void writeBytesNoTag(ByteString byteString) {
        writeRawVarint32(byteString.size());
        writeRawBytes(byteString);
    }

    public void writeDouble(int i10, double d10) {
        writeTag(i10, 1);
        writeDoubleNoTag(d10);
    }

    public void writeDoubleNoTag(double d10) throws IOException {
        writeRawLittleEndian64(Double.doubleToRawLongBits(d10));
    }

    public void writeEnum(int i10, int i11) {
        writeTag(i10, 0);
        writeEnumNoTag(i11);
    }

    public void writeEnumNoTag(int i10) {
        writeInt32NoTag(i10);
    }

    public void writeFixed32NoTag(int i10) {
        writeRawLittleEndian32(i10);
    }

    public void writeFixed64NoTag(long j10) {
        writeRawLittleEndian64(j10);
    }

    public void writeFloat(int i10, float f10) {
        writeTag(i10, 5);
        writeFloatNoTag(f10);
    }

    public void writeFloatNoTag(float f10) throws IOException {
        writeRawLittleEndian32(Float.floatToRawIntBits(f10));
    }

    public void writeGroup(int i10, MessageLite messageLite) {
        writeTag(i10, 3);
        writeGroupNoTag(messageLite);
        writeTag(i10, 4);
    }

    public void writeGroupNoTag(MessageLite messageLite) {
        messageLite.writeTo(this);
    }

    public void writeInt32(int i10, int i11) {
        writeTag(i10, 0);
        writeInt32NoTag(i11);
    }

    public void writeInt32NoTag(int i10) {
        if (i10 >= 0) {
            writeRawVarint32(i10);
        } else {
            writeRawVarint64(i10);
        }
    }

    public void writeInt64NoTag(long j10) throws IOException {
        writeRawVarint64(j10);
    }

    public void writeMessage(int i10, MessageLite messageLite) {
        writeTag(i10, 2);
        writeMessageNoTag(messageLite);
    }

    public void writeMessageNoTag(MessageLite messageLite) {
        writeRawVarint32(messageLite.getSerializedSize());
        messageLite.writeTo(this);
    }

    public void writeMessageSetExtension(int i10, MessageLite messageLite) {
        writeTag(1, 3);
        writeUInt32(2, i10);
        writeMessage(3, messageLite);
        writeTag(1, 4);
    }

    public void writeRawByte(byte b) throws IOException {
        if (this.f52728c == this.f52727b) {
            m18282a();
        }
        int i10 = this.f52728c;
        this.f52728c = i10 + 1;
        this.f52726a[i10] = b;
    }

    public void writeRawBytes(ByteString byteString) {
        writeRawBytes(byteString, 0, byteString.size());
    }

    public void writeRawLittleEndian32(int i10) throws IOException {
        writeRawByte(i10 & 255);
        writeRawByte((i10 >> 8) & 255);
        writeRawByte((i10 >> 16) & 255);
        writeRawByte((i10 >> 24) & 255);
    }

    public void writeRawLittleEndian64(long j10) throws IOException {
        writeRawByte(((int) j10) & 255);
        writeRawByte(((int) (j10 >> 8)) & 255);
        writeRawByte(((int) (j10 >> 16)) & 255);
        writeRawByte(((int) (j10 >> 24)) & 255);
        writeRawByte(((int) (j10 >> 32)) & 255);
        writeRawByte(((int) (j10 >> 40)) & 255);
        writeRawByte(((int) (j10 >> 48)) & 255);
        writeRawByte(((int) (j10 >> 56)) & 255);
    }

    public void writeRawVarint32(int i10) {
        while ((i10 & (-128)) != 0) {
            writeRawByte((i10 & 127) | 128);
            i10 >>>= 7;
        }
        writeRawByte(i10);
    }

    public void writeRawVarint64(long j10) throws IOException {
        while (((-128) & j10) != 0) {
            writeRawByte((((int) j10) & 127) | 128);
            j10 >>>= 7;
        }
        writeRawByte((int) j10);
    }

    public void writeSFixed32NoTag(int i10) throws IOException {
        writeRawLittleEndian32(i10);
    }

    public void writeSFixed64NoTag(long j10) throws IOException {
        writeRawLittleEndian64(j10);
    }

    public void writeSInt32NoTag(int i10) {
        writeRawVarint32(encodeZigZag32(i10));
    }

    public void writeSInt64(int i10, long j10) {
        writeTag(i10, 0);
        writeSInt64NoTag(j10);
    }

    public void writeSInt64NoTag(long j10) throws IOException {
        writeRawVarint64(encodeZigZag64(j10));
    }

    public void writeStringNoTag(String str) throws IOException {
        byte[] bytes = str.getBytes("UTF-8");
        writeRawVarint32(bytes.length);
        writeRawBytes(bytes);
    }

    public void writeTag(int i10, int i11) {
        writeRawVarint32((i10 << 3) | i11);
    }

    public void writeUInt32(int i10, int i11) {
        writeTag(i10, 0);
        writeUInt32NoTag(i11);
    }

    public void writeUInt32NoTag(int i10) {
        writeRawVarint32(i10);
    }

    public void writeUInt64NoTag(long j10) {
        writeRawVarint64(j10);
    }

    public void writeRawBytes(byte[] bArr) throws IOException {
        writeRawBytes(bArr, 0, bArr.length);
    }

    public void writeRawBytes(byte[] bArr, int i10, int i11) throws IOException {
        int i12 = this.f52728c;
        int i13 = this.f52727b;
        int i14 = i13 - i12;
        byte[] bArr2 = this.f52726a;
        if (i14 >= i11) {
            System.arraycopy(bArr, i10, bArr2, i12, i11);
            this.f52728c += i11;
            return;
        }
        System.arraycopy(bArr, i10, bArr2, i12, i14);
        int i15 = i10 + i14;
        int i16 = i11 - i14;
        this.f52728c = i13;
        m18282a();
        if (i16 <= i13) {
            System.arraycopy(bArr, i15, bArr2, 0, i16);
            this.f52728c = i16;
        } else {
            this.f52729d.write(bArr, i15, i16);
        }
    }

    public void writeRawByte(int i10) throws IOException {
        writeRawByte((byte) i10);
    }

    public void writeRawBytes(ByteString byteString, int i10, int i11) throws IOException {
        int i12 = this.f52728c;
        int i13 = this.f52727b;
        int i14 = i13 - i12;
        byte[] bArr = this.f52726a;
        if (i14 >= i11) {
            byteString.copyTo(bArr, i10, i12, i11);
            this.f52728c += i11;
            return;
        }
        byteString.copyTo(bArr, i10, i12, i14);
        int i15 = i10 + i14;
        int i16 = i11 - i14;
        this.f52728c = i13;
        m18282a();
        if (i16 <= i13) {
            byteString.copyTo(bArr, i15, 0, i16);
            this.f52728c = i16;
            return;
        }
        if (i15 < 0) {
            StringBuilder sb2 = new StringBuilder(30);
            sb2.append("Source offset < 0: ");
            sb2.append(i15);
            throw new IndexOutOfBoundsException(sb2.toString());
        }
        if (i16 >= 0) {
            int i17 = i15 + i16;
            if (i17 <= byteString.size()) {
                if (i16 > 0) {
                    byteString.mo18274s(this.f52729d, i15, i16);
                    return;
                }
                return;
            } else {
                StringBuilder sb3 = new StringBuilder(39);
                sb3.append("Source end offset exceeded: ");
                sb3.append(i17);
                throw new IndexOutOfBoundsException(sb3.toString());
            }
        }
        StringBuilder sb4 = new StringBuilder(23);
        sb4.append("Length < 0: ");
        sb4.append(i16);
        throw new IndexOutOfBoundsException(sb4.toString());
    }
}
