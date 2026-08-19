package p817j$.util.stream;

import java.util.function.LongConsumer;
import p817j$.com.android.tools.p818r8.AbstractC15529a;

/* JADX INFO: renamed from: j$.util.stream.d0 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C15895d0 implements LongConsumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC15963o2 f49252a;

    @Override // java.util.function.LongConsumer
    public final void accept(long j10) {
        this.f49252a.accept(j10);
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return AbstractC15529a.m16739c(this, longConsumer);
    }
}
