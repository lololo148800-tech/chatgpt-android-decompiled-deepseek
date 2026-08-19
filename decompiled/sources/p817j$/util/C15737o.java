package p817j$.util;

import java.util.Map;
import java.util.function.Consumer;
import p817j$.util.function.Consumer$CC;

/* JADX INFO: renamed from: j$.util.o */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C15737o implements Consumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Consumer f49005a;

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.f49005a.accept(new C15739p((Map.Entry) obj));
    }
}
