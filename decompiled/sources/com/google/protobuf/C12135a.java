package com.google.protobuf;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: com.google.protobuf.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C12135a extends FilterInputStream {

    /* JADX INFO: renamed from: Y */
    public int f37009Y;

    public C12135a(InputStream inputStream, int i10) {
        super(inputStream);
        this.f37009Y = i10;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        return Math.min(super.available(), this.f37009Y);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        if (this.f37009Y <= 0) {
            return -1;
        }
        int i10 = super.read();
        if (i10 >= 0) {
            this.f37009Y--;
        }
        return i10;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j10) {
        int iSkip = (int) super.skip(Math.min(j10, this.f37009Y));
        if (iSkip >= 0) {
            this.f37009Y -= iSkip;
        }
        return iSkip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        int i12 = this.f37009Y;
        if (i12 <= 0) {
            return -1;
        }
        int i13 = super.read(bArr, i10, Math.min(i11, i12));
        if (i13 >= 0) {
            this.f37009Y -= i13;
        }
        return i13;
    }
}
