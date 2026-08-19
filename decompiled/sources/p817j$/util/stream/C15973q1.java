package p817j$.util.stream;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.LongConsumer;
import p817j$.com.android.tools.p818r8.AbstractC15529a;
import p817j$.util.function.Consumer$CC;

/* JADX INFO: renamed from: j$.util.stream.q1 */
/* JADX INFO: loaded from: classes4.dex */
final class C15973q1 extends C15968p1 implements InterfaceC15753B0 {
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

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final /* bridge */ /* synthetic */ void m17405p(Object obj) {
        mo17362j((Long) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return AbstractC15529a.m16739c(this, longConsumer);
    }

    @Override // p817j$.util.stream.InterfaceC15957n2
    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void mo17362j(Long l4) {
        AbstractC16012y0.m17559i(this, l4);
    }

    @Override // p817j$.util.stream.InterfaceC15963o2
    /* JADX INFO: renamed from: n */
    public final /* synthetic */ boolean mo17358n() {
        return false;
    }

    @Override // p817j$.util.stream.InterfaceC15758C0
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ InterfaceC15798K0 mo17356a() {
        mo17356a();
        return this;
    }

    @Override // p817j$.util.stream.InterfaceC15753B0, p817j$.util.stream.InterfaceC15758C0
    /* JADX INFO: renamed from: a */
    public final InterfaceC15788I0 mo17356a() {
        int i10 = this.f49377b;
        long[] jArr = this.f49376a;
        if (i10 >= jArr.length) {
            return this;
        }
        throw new IllegalStateException(String.format("Current size %d is less than fixed size %d", Integer.valueOf(this.f49377b), Integer.valueOf(jArr.length)));
    }

    @Override // p817j$.util.stream.InterfaceC15963o2
    /* JADX INFO: renamed from: l */
    public final void mo17364l(long j10) {
        long[] jArr = this.f49376a;
        if (j10 != jArr.length) {
            throw new IllegalStateException(String.format("Begin size %d is not equal to fixed size %d", Long.valueOf(j10), Integer.valueOf(jArr.length)));
        }
        this.f49377b = 0;
    }

    @Override // p817j$.util.stream.InterfaceC15963o2, p817j$.util.stream.InterfaceC15957n2, java.util.function.LongConsumer
    public final void accept(long j10) {
        int i10 = this.f49377b;
        long[] jArr = this.f49376a;
        if (i10 < jArr.length) {
            this.f49377b = 1 + i10;
            jArr[i10] = j10;
            return;
        }
        throw new IllegalStateException(String.format("Accept exceeded fixed size of %d", Integer.valueOf(jArr.length)));
    }

    @Override // p817j$.util.stream.InterfaceC15963o2
    /* JADX INFO: renamed from: k */
    public final void mo17363k() {
        int i10 = this.f49377b;
        long[] jArr = this.f49376a;
        if (i10 < jArr.length) {
            throw new IllegalStateException(String.format("End size %d is less than fixed size %d", Integer.valueOf(this.f49377b), Integer.valueOf(jArr.length)));
        }
    }

    @Override // p817j$.util.stream.C15968p1
    public final String toString() {
        long[] jArr = this.f49376a;
        return String.format("LongFixedNodeBuilder[%d][%s]", Integer.valueOf(jArr.length - this.f49377b), Arrays.toString(jArr));
    }
}
