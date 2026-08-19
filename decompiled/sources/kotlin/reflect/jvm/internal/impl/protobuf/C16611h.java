package kotlin.reflect.jvm.internal.impl.protobuf;

import p690cp.C12936v;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.protobuf.h */
/* JADX INFO: loaded from: classes2.dex */
public final class C16611h implements ByteString.ByteIterator {

    /* JADX INFO: renamed from: Y */
    public final C12936v f52770Y;

    /* JADX INFO: renamed from: Z */
    public C16609f f52771Z;

    /* JADX INFO: renamed from: o0 */
    public int f52772o0;

    public C16611h(C16612i c16612i) {
        C12936v c12936v = new C12936v(c16612i);
        this.f52770Y = c12936v;
        this.f52771Z = new C16609f(c12936v.m14599a());
        this.f52772o0 = c16612i.f52774Y;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f52772o0 > 0;
    }

    @Override // java.util.Iterator
    public final Byte next() {
        return Byte.valueOf(nextByte());
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString.ByteIterator
    public final byte nextByte() {
        if (!this.f52771Z.hasNext()) {
            this.f52771Z = new C16609f(this.f52770Y.m14599a());
        }
        this.f52772o0--;
        return this.f52771Z.nextByte();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
