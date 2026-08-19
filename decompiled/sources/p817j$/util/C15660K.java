package p817j$.util;

import java.util.function.Consumer;
import java.util.function.LongConsumer;
import p817j$.com.android.tools.p818r8.AbstractC15529a;

/* JADX INFO: renamed from: j$.util.K */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C15660K implements LongConsumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Consumer f48851a;

    public /* synthetic */ C15660K(Consumer consumer) {
        this.f48851a = consumer;
    }

    @Override // java.util.function.LongConsumer
    public final void accept(long j10) {
        this.f48851a.accept(Long.valueOf(j10));
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return AbstractC15529a.m16739c(this, longConsumer);
    }
}
