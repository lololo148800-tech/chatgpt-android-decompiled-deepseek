package p523V9;

import java.io.OutputStream;

/* JADX INFO: renamed from: V9.P */
/* JADX INFO: loaded from: classes.dex */
public final class C7960P extends OutputStream {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f25201Y;

    /* JADX INFO: renamed from: Z */
    public long f25202Z;

    @Override // java.io.OutputStream
    public final void write(int i10) {
        switch (this.f25201Y) {
            case 0:
                this.f25202Z++;
                break;
            case 1:
                this.f25202Z++;
                break;
            case 2:
                this.f25202Z++;
                break;
            case 3:
                this.f25202Z++;
                break;
            default:
                this.f25202Z++;
                break;
        }
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        switch (this.f25201Y) {
            case 0:
                this.f25202Z += (long) bArr.length;
                break;
            case 1:
                this.f25202Z += (long) bArr.length;
                break;
            case 2:
                this.f25202Z += (long) bArr.length;
                break;
            case 3:
                this.f25202Z += (long) bArr.length;
                break;
            default:
                this.f25202Z += (long) bArr.length;
                break;
        }
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i10, int i11) {
        int length;
        int i12;
        int length2;
        int i13;
        int length3;
        int i14;
        int length4;
        int i15;
        int i16;
        switch (this.f25201Y) {
            case 0:
                if (i10 >= 0 && i10 <= (length = bArr.length) && i11 >= 0 && (i12 = i10 + i11) <= length && i12 >= 0) {
                    this.f25202Z += (long) i11;
                    return;
                }
                throw new IndexOutOfBoundsException();
            case 1:
                if (i10 >= 0 && i10 <= (length2 = bArr.length) && i11 >= 0 && (i13 = i10 + i11) <= length2 && i13 >= 0) {
                    this.f25202Z += (long) i11;
                    return;
                }
                throw new IndexOutOfBoundsException();
            case 2:
                if (i10 >= 0 && i10 <= (length3 = bArr.length) && i11 >= 0 && (i14 = i10 + i11) <= length3 && i14 >= 0) {
                    this.f25202Z += (long) i11;
                    return;
                }
                throw new IndexOutOfBoundsException();
            case 3:
                if (i10 >= 0 && i10 <= (length4 = bArr.length) && i11 >= 0 && (i15 = i10 + i11) <= length4 && i15 >= 0) {
                    this.f25202Z += (long) i11;
                    return;
                }
                throw new IndexOutOfBoundsException();
            default:
                if (i10 >= 0 && i10 <= bArr.length && i11 >= 0 && (i16 = i10 + i11) <= bArr.length && i16 >= 0) {
                    this.f25202Z += (long) i11;
                    return;
                }
                throw new IndexOutOfBoundsException();
        }
    }
}
