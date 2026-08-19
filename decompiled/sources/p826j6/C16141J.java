package p826j6;

import java.util.function.Consumer;
import p817j$.util.function.Consumer$CC;

/* JADX INFO: renamed from: j6.J */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C16141J implements Consumer {
    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        if (((C16153g) obj) == null) {
            throw new IllegalArgumentException("ProductDetailsParams cannot be null.");
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }
}
