package p817j$.util;

import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import p817j$.com.android.tools.p818r8.AbstractC15529a;

/* JADX INFO: renamed from: j$.util.C */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C15652C implements DoubleConsumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Consumer f48845a;

    public /* synthetic */ C15652C(Consumer consumer) {
        this.f48845a = consumer;
    }

    @Override // java.util.function.DoubleConsumer
    public final void accept(double d10) {
        this.f48845a.accept(Double.valueOf(d10));
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return AbstractC15529a.m16737a(this, doubleConsumer);
    }
}
