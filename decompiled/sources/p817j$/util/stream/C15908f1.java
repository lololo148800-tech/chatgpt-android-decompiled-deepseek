package p817j$.util.stream;

import java.util.Arrays;
import java.util.function.Consumer;
import p817j$.util.function.Consumer$CC;

/* JADX INFO: renamed from: j$.util.stream.f1 */
/* JADX INFO: loaded from: classes4.dex */
final class C15908f1 extends C15813N0 implements InterfaceC15758C0 {
    @Override // p817j$.util.stream.InterfaceC15963o2
    public final /* synthetic */ void accept(double d10) {
        AbstractC16012y0.m17549a();
        throw null;
    }

    @Override // p817j$.util.stream.InterfaceC15963o2
    public final /* synthetic */ void accept(int i10) {
        AbstractC16012y0.m17561k();
        throw null;
    }

    @Override // p817j$.util.stream.InterfaceC15963o2, p817j$.util.stream.InterfaceC15957n2, java.util.function.LongConsumer
    public final /* synthetic */ void accept(long j10) {
        AbstractC16012y0.m17562l();
        throw null;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // p817j$.util.stream.InterfaceC15963o2
    /* JADX INFO: renamed from: n */
    public final /* synthetic */ boolean mo17358n() {
        return false;
    }

    @Override // p817j$.util.stream.InterfaceC15758C0
    /* JADX INFO: renamed from: a */
    public final InterfaceC15798K0 mo17356a() {
        int i10 = this.f49128b;
        Object[] objArr = this.f49127a;
        if (i10 >= objArr.length) {
            return this;
        }
        throw new IllegalStateException(String.format("Current size %d is less than fixed size %d", Integer.valueOf(this.f49128b), Integer.valueOf(objArr.length)));
    }

    @Override // p817j$.util.stream.InterfaceC15963o2
    /* JADX INFO: renamed from: l */
    public final void mo17364l(long j10) {
        Object[] objArr = this.f49127a;
        if (j10 != objArr.length) {
            throw new IllegalStateException(String.format("Begin size %d is not equal to fixed size %d", Long.valueOf(j10), Integer.valueOf(objArr.length)));
        }
        this.f49128b = 0;
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void m17405p(Object obj) {
        int i10 = this.f49128b;
        Object[] objArr = this.f49127a;
        if (i10 < objArr.length) {
            this.f49128b = 1 + i10;
            objArr[i10] = obj;
            return;
        }
        throw new IllegalStateException(String.format("Accept exceeded fixed size of %d", Integer.valueOf(objArr.length)));
    }

    @Override // p817j$.util.stream.InterfaceC15963o2
    /* JADX INFO: renamed from: k */
    public final void mo17363k() {
        int i10 = this.f49128b;
        Object[] objArr = this.f49127a;
        if (i10 < objArr.length) {
            throw new IllegalStateException(String.format("End size %d is less than fixed size %d", Integer.valueOf(this.f49128b), Integer.valueOf(objArr.length)));
        }
    }

    @Override // p817j$.util.stream.C15813N0
    public final String toString() {
        Object[] objArr = this.f49127a;
        return String.format("FixedNodeBuilder[%d][%s]", Integer.valueOf(objArr.length - this.f49128b), Arrays.toString(objArr));
    }
}
