package p253K;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteOrder;

/* JADX INFO: renamed from: K.c */
/* JADX INFO: loaded from: classes.dex */
public final class C4492c extends FilterOutputStream {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f14651Y;

    /* JADX INFO: renamed from: Z */
    public final OutputStream f14652Z;

    /* JADX INFO: renamed from: o0 */
    public ByteOrder f14653o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4492c(OutputStream outputStream, ByteOrder byteOrder, int i10) {
        super(outputStream);
        this.f14651Y = i10;
        this.f14652Z = outputStream;
        this.f14653o0 = byteOrder;
    }

    /* JADX INFO: renamed from: E */
    public void m5222E(int i10) throws IOException {
        if (i10 > 65535) {
            throw new IllegalArgumentException("val is larger than the maximum value of a 16-bit unsigned integer");
        }
        m5225k((short) i10);
    }

    /* JADX INFO: renamed from: a */
    public void m5223a(int i10) throws IOException {
        this.f14652Z.write(i10);
    }

    /* JADX INFO: renamed from: e */
    public final void m5224e(int i10) throws IOException {
        switch (this.f14651Y) {
            case 0:
                ByteOrder byteOrder = this.f14653o0;
                ByteOrder byteOrder2 = ByteOrder.LITTLE_ENDIAN;
                OutputStream outputStream = this.f14652Z;
                if (byteOrder == byteOrder2) {
                    outputStream.write(i10 & 255);
                    outputStream.write((i10 >>> 8) & 255);
                    outputStream.write((i10 >>> 16) & 255);
                    outputStream.write((i10 >>> 24) & 255);
                } else if (byteOrder == ByteOrder.BIG_ENDIAN) {
                    outputStream.write((i10 >>> 24) & 255);
                    outputStream.write((i10 >>> 16) & 255);
                    outputStream.write((i10 >>> 8) & 255);
                    outputStream.write(i10 & 255);
                }
                break;
            default:
                ByteOrder byteOrder3 = this.f14653o0;
                ByteOrder byteOrder4 = ByteOrder.LITTLE_ENDIAN;
                OutputStream outputStream2 = this.f14652Z;
                if (byteOrder3 == byteOrder4) {
                    outputStream2.write(i10 & 255);
                    outputStream2.write((i10 >>> 8) & 255);
                    outputStream2.write((i10 >>> 16) & 255);
                    outputStream2.write((i10 >>> 24) & 255);
                } else if (byteOrder3 == ByteOrder.BIG_ENDIAN) {
                    outputStream2.write((i10 >>> 24) & 255);
                    outputStream2.write((i10 >>> 16) & 255);
                    outputStream2.write((i10 >>> 8) & 255);
                    outputStream2.write(i10 & 255);
                }
                break;
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m5225k(short s10) throws IOException {
        switch (this.f14651Y) {
            case 0:
                ByteOrder byteOrder = this.f14653o0;
                ByteOrder byteOrder2 = ByteOrder.LITTLE_ENDIAN;
                OutputStream outputStream = this.f14652Z;
                if (byteOrder == byteOrder2) {
                    outputStream.write(s10 & 255);
                    outputStream.write((s10 >>> 8) & 255);
                } else if (byteOrder == ByteOrder.BIG_ENDIAN) {
                    outputStream.write((s10 >>> 8) & 255);
                    outputStream.write(s10 & 255);
                }
                break;
            default:
                ByteOrder byteOrder3 = this.f14653o0;
                ByteOrder byteOrder4 = ByteOrder.LITTLE_ENDIAN;
                OutputStream outputStream2 = this.f14652Z;
                if (byteOrder3 == byteOrder4) {
                    outputStream2.write(s10 & 255);
                    outputStream2.write((s10 >>> 8) & 255);
                } else if (byteOrder3 == ByteOrder.BIG_ENDIAN) {
                    outputStream2.write((s10 >>> 8) & 255);
                    outputStream2.write(s10 & 255);
                }
                break;
        }
    }

    /* JADX INFO: renamed from: m */
    public void m5226m(long j10) throws IOException {
        if (j10 > 4294967295L) {
            throw new IllegalArgumentException("val is larger than the maximum value of a 32-bit unsigned integer");
        }
        m5224e((int) j10);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        switch (this.f14651Y) {
            case 0:
                this.f14652Z.write(bArr);
                break;
            default:
                this.f14652Z.write(bArr);
                break;
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr, int i10, int i11) throws IOException {
        switch (this.f14651Y) {
            case 0:
                this.f14652Z.write(bArr, i10, i11);
                break;
            default:
                this.f14652Z.write(bArr, i10, i11);
                break;
        }
    }
}
