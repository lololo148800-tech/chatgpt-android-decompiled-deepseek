package p538W2;

import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteOrder;
import p001A.AbstractC0010F;

/* JADX INFO: renamed from: W2.b */
/* JADX INFO: loaded from: classes.dex */
public class C8417b extends InputStream implements DataInput {

    /* JADX INFO: renamed from: Y */
    public final DataInputStream f26166Y;

    /* JADX INFO: renamed from: Z */
    public int f26167Z;

    /* JADX INFO: renamed from: o0 */
    public ByteOrder f26168o0;

    /* JADX INFO: renamed from: p0 */
    public byte[] f26169p0;

    /* JADX INFO: renamed from: q0 */
    public final int f26170q0;

    public C8417b(byte[] bArr) {
        this(new ByteArrayInputStream(bArr), ByteOrder.BIG_ENDIAN);
        this.f26170q0 = bArr.length;
    }

    /* JADX INFO: renamed from: a */
    public final void m8974a(int i10) throws IOException {
        int i11 = 0;
        while (i11 < i10) {
            DataInputStream dataInputStream = this.f26166Y;
            int i12 = i10 - i11;
            int iSkip = (int) dataInputStream.skip(i12);
            if (iSkip <= 0) {
                if (this.f26169p0 == null) {
                    this.f26169p0 = new byte[8192];
                }
                iSkip = dataInputStream.read(this.f26169p0, 0, Math.min(8192, i12));
                if (iSkip == -1) {
                    throw new EOFException(AbstractC0010F.m19c(i10, "Reached EOF while skipping ", " bytes."));
                }
            }
            i11 += iSkip;
        }
        this.f26167Z += i11;
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.f26166Y.available();
    }

    @Override // java.io.InputStream
    public final void mark(int i10) {
        throw new UnsupportedOperationException("Mark is currently unsupported");
    }

    @Override // java.io.InputStream
    public final int read() {
        this.f26167Z++;
        return this.f26166Y.read();
    }

    @Override // java.io.DataInput
    public final boolean readBoolean() {
        this.f26167Z++;
        return this.f26166Y.readBoolean();
    }

    @Override // java.io.DataInput
    public final byte readByte() throws IOException {
        this.f26167Z++;
        int i10 = this.f26166Y.read();
        if (i10 >= 0) {
            return (byte) i10;
        }
        throw new EOFException();
    }

    @Override // java.io.DataInput
    public final char readChar() {
        this.f26167Z += 2;
        return this.f26166Y.readChar();
    }

    @Override // java.io.DataInput
    public final double readDouble() {
        return Double.longBitsToDouble(readLong());
    }

    @Override // java.io.DataInput
    public final float readFloat() {
        return Float.intBitsToFloat(readInt());
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr, int i10, int i11) throws IOException {
        this.f26167Z += i11;
        this.f26166Y.readFully(bArr, i10, i11);
    }

    @Override // java.io.DataInput
    public final int readInt() throws IOException {
        this.f26167Z += 4;
        DataInputStream dataInputStream = this.f26166Y;
        int i10 = dataInputStream.read();
        int i11 = dataInputStream.read();
        int i12 = dataInputStream.read();
        int i13 = dataInputStream.read();
        if ((i10 | i11 | i12 | i13) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.f26168o0;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            return (i13 << 24) + (i12 << 16) + (i11 << 8) + i10;
        }
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            return (i10 << 24) + (i11 << 16) + (i12 << 8) + i13;
        }
        throw new IOException("Invalid byte order: " + this.f26168o0);
    }

    @Override // java.io.DataInput
    public final String readLine() {
        Log.d("ExifInterface", "Currently unsupported");
        return null;
    }

    @Override // java.io.DataInput
    public final long readLong() throws IOException {
        this.f26167Z += 8;
        DataInputStream dataInputStream = this.f26166Y;
        int i10 = dataInputStream.read();
        int i11 = dataInputStream.read();
        int i12 = dataInputStream.read();
        int i13 = dataInputStream.read();
        int i14 = dataInputStream.read();
        int i15 = dataInputStream.read();
        int i16 = dataInputStream.read();
        int i17 = dataInputStream.read();
        if ((i10 | i11 | i12 | i13 | i14 | i15 | i16 | i17) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.f26168o0;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            return (((long) i17) << 56) + (((long) i16) << 48) + (((long) i15) << 40) + (((long) i14) << 32) + (((long) i13) << 24) + (((long) i12) << 16) + (((long) i11) << 8) + ((long) i10);
        }
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            return (((long) i10) << 56) + (((long) i11) << 48) + (((long) i12) << 40) + (((long) i13) << 32) + (((long) i14) << 24) + (((long) i15) << 16) + (((long) i16) << 8) + ((long) i17);
        }
        throw new IOException("Invalid byte order: " + this.f26168o0);
    }

    @Override // java.io.DataInput
    public final short readShort() throws IOException {
        this.f26167Z += 2;
        DataInputStream dataInputStream = this.f26166Y;
        int i10 = dataInputStream.read();
        int i11 = dataInputStream.read();
        if ((i10 | i11) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.f26168o0;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            return (short) ((i11 << 8) + i10);
        }
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            return (short) ((i10 << 8) + i11);
        }
        throw new IOException("Invalid byte order: " + this.f26168o0);
    }

    @Override // java.io.DataInput
    public final String readUTF() {
        this.f26167Z += 2;
        return this.f26166Y.readUTF();
    }

    @Override // java.io.DataInput
    public final int readUnsignedByte() {
        this.f26167Z++;
        return this.f26166Y.readUnsignedByte();
    }

    @Override // java.io.DataInput
    public final int readUnsignedShort() throws IOException {
        this.f26167Z += 2;
        DataInputStream dataInputStream = this.f26166Y;
        int i10 = dataInputStream.read();
        int i11 = dataInputStream.read();
        if ((i10 | i11) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.f26168o0;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            return (i11 << 8) + i10;
        }
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            return (i10 << 8) + i11;
        }
        throw new IOException("Invalid byte order: " + this.f26168o0);
    }

    @Override // java.io.InputStream
    public final void reset() {
        throw new UnsupportedOperationException("Reset is currently unsupported");
    }

    @Override // java.io.DataInput
    public final int skipBytes(int i10) {
        throw new UnsupportedOperationException("skipBytes is currently unsupported");
    }

    public C8417b(InputStream inputStream) {
        this(inputStream, ByteOrder.BIG_ENDIAN);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        int i12 = this.f26166Y.read(bArr, i10, i11);
        this.f26167Z += i12;
        return i12;
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr) throws IOException {
        this.f26167Z += bArr.length;
        this.f26166Y.readFully(bArr);
    }

    public C8417b(InputStream inputStream, ByteOrder byteOrder) {
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        this.f26166Y = dataInputStream;
        dataInputStream.mark(0);
        this.f26167Z = 0;
        this.f26168o0 = byteOrder;
        this.f26170q0 = inputStream instanceof C8417b ? ((C8417b) inputStream).f26170q0 : -1;
    }
}
