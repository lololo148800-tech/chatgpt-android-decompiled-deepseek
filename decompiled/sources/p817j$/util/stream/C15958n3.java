package p817j$.util.stream;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import p817j$.util.concurrent.ConcurrentHashMap;
import p817j$.util.function.Consumer$CC;

/* JADX INFO: renamed from: j$.util.stream.n3 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C15958n3 implements Consumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f49353a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f49354b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f49355c;

    public /* synthetic */ C15958n3(int i10, Object obj, Object obj2) {
        this.f49353a = i10;
        this.f49354b = obj;
        this.f49355c = obj2;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.f49353a) {
            case 0:
                break;
            case 1:
                break;
        }
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.f49353a) {
            case 0:
                ((C15964o3) this.f49354b).m17506b((Consumer) this.f49355c, obj);
                break;
            case 1:
                if (obj != null) {
                    ((ConcurrentHashMap) this.f49355c).putIfAbsent(obj, Boolean.TRUE);
                } else {
                    ((AtomicBoolean) this.f49354b).set(true);
                }
                break;
            default:
                ((BiConsumer) this.f49354b).accept(this.f49355c, obj);
                break;
        }
    }
}
