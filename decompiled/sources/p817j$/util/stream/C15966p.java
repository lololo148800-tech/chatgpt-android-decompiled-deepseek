package p817j$.util.stream;

import java.util.function.DoubleConsumer;
import p817j$.com.android.tools.p818r8.AbstractC15529a;

/* JADX INFO: renamed from: j$.util.stream.p */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C15966p implements DoubleConsumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC15963o2 f49373a;

    @Override // java.util.function.DoubleConsumer
    public final void accept(double d10) {
        this.f49373a.accept(d10);
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return AbstractC15529a.m16737a(this, doubleConsumer);
    }
}
