package p817j$.util;

import java.util.function.Consumer;
import java.util.function.IntConsumer;
import p817j$.com.android.tools.p818r8.AbstractC15529a;

/* JADX INFO: renamed from: j$.util.G */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C15656G implements IntConsumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Consumer f48848a;

    public /* synthetic */ C15656G(Consumer consumer) {
        this.f48848a = consumer;
    }

    @Override // java.util.function.IntConsumer
    public final void accept(int i10) {
        this.f48848a.accept(Integer.valueOf(i10));
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return AbstractC15529a.m16738b(this, intConsumer);
    }
}
