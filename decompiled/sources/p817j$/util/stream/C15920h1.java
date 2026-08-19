package p817j$.util.stream;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import p817j$.com.android.tools.p818r8.AbstractC15529a;
import p817j$.util.function.Consumer$CC;

/* JADX INFO: renamed from: j$.util.stream.h1 */
/* JADX INFO: loaded from: classes4.dex */
final class C15920h1 extends C15914g1 implements InterfaceC15748A0 {
    @Override // p817j$.util.stream.InterfaceC15963o2
    public final /* synthetic */ void accept(double d10) {
        AbstractC16012y0.m17549a();
        throw null;
    }

    @Override // p817j$.util.stream.InterfaceC15963o2, p817j$.util.stream.InterfaceC15957n2, java.util.function.LongConsumer
    public final /* synthetic */ void accept(long j10) {
        AbstractC16012y0.m17562l();
        throw null;
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final /* bridge */ /* synthetic */ void m17405p(Object obj) {
        mo17413m((Integer) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return AbstractC15529a.m16738b(this, intConsumer);
    }

    @Override // p817j$.util.stream.InterfaceC15951m2
    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void mo17413m(Integer num) {
        AbstractC16012y0.m17557g(this, num);
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

    @Override // p817j$.util.stream.InterfaceC15748A0, p817j$.util.stream.InterfaceC15758C0
    /* JADX INFO: renamed from: a */
    public final InterfaceC15778G0 mo17356a() {
        int i10 = this.f49295b;
        int[] iArr = this.f49294a;
        if (i10 >= iArr.length) {
            return this;
        }
        throw new IllegalStateException(String.format("Current size %d is less than fixed size %d", Integer.valueOf(this.f49295b), Integer.valueOf(iArr.length)));
    }

    @Override // p817j$.util.stream.InterfaceC15963o2
    /* JADX INFO: renamed from: l */
    public final void mo17364l(long j10) {
        int[] iArr = this.f49294a;
        if (j10 != iArr.length) {
            throw new IllegalStateException(String.format("Begin size %d is not equal to fixed size %d", Long.valueOf(j10), Integer.valueOf(iArr.length)));
        }
        this.f49295b = 0;
    }

    @Override // p817j$.util.stream.InterfaceC15963o2
    public final void accept(int i10) {
        int i11 = this.f49295b;
        int[] iArr = this.f49294a;
        if (i11 < iArr.length) {
            this.f49295b = 1 + i11;
            iArr[i11] = i10;
            return;
        }
        throw new IllegalStateException(String.format("Accept exceeded fixed size of %d", Integer.valueOf(iArr.length)));
    }

    @Override // p817j$.util.stream.InterfaceC15963o2
    /* JADX INFO: renamed from: k */
    public final void mo17363k() {
        int i10 = this.f49295b;
        int[] iArr = this.f49294a;
        if (i10 < iArr.length) {
            throw new IllegalStateException(String.format("End size %d is less than fixed size %d", Integer.valueOf(this.f49295b), Integer.valueOf(iArr.length)));
        }
    }

    @Override // p817j$.util.stream.C15914g1
    public final String toString() {
        int[] iArr = this.f49294a;
        return String.format("IntFixedNodeBuilder[%d][%s]", Integer.valueOf(iArr.length - this.f49295b), Arrays.toString(iArr));
    }
}
