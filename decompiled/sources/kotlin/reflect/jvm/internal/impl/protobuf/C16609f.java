package kotlin.reflect.jvm.internal.impl.protobuf;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.protobuf.f */
/* JADX INFO: loaded from: classes2.dex */
public final class C16609f implements ByteString.ByteIterator {

    /* JADX INFO: renamed from: Y */
    public int f52765Y = 0;

    /* JADX INFO: renamed from: Z */
    public final int f52766Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C16610g f52767o0;

    public C16609f(C16610g c16610g) {
        this.f52767o0 = c16610g;
        this.f52766Z = c16610g.f52768Y.length;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f52765Y < this.f52766Z;
    }

    @Override // java.util.Iterator
    public final Byte next() {
        return Byte.valueOf(nextByte());
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString.ByteIterator
    public final byte nextByte() {
        try {
            byte[] bArr = this.f52767o0.f52768Y;
            int i10 = this.f52765Y;
            this.f52765Y = i10 + 1;
            return bArr[i10];
        } catch (ArrayIndexOutOfBoundsException e10) {
            throw new NoSuchElementException(e10.getMessage());
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
