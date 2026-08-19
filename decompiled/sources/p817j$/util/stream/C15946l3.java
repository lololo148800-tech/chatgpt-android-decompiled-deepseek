package p817j$.util.stream;

import java.util.function.Consumer;
import p817j$.util.function.Consumer$CC;

/* JADX INFO: renamed from: j$.util.stream.l3 */
/* JADX INFO: loaded from: classes4.dex */
final class C15946l3 extends AbstractC15952m3 implements Consumer {

    /* JADX INFO: renamed from: b */
    final Object[] f49340b;

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    C15946l3(int i10) {
        this.f49340b = new Object[i10];
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        int i10 = this.f49347a;
        this.f49347a = i10 + 1;
        this.f49340b[i10] = obj;
    }
}
