package p817j$.util.stream;

import java.util.function.IntConsumer;
import p817j$.com.android.tools.p818r8.AbstractC15529a;

/* JADX INFO: renamed from: j$.util.stream.U */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C15846U implements IntConsumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC15963o2 f49193a;

    @Override // java.util.function.IntConsumer
    public final void accept(int i10) {
        this.f49193a.accept(i10);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return AbstractC15529a.m16738b(this, intConsumer);
    }
}
