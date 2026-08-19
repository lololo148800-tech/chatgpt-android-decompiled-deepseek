package p817j$.util.stream;

import java.util.function.Supplier;
import p817j$.util.Spliterator;

/* JADX INFO: renamed from: j$.util.stream.a */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C15876a implements Supplier {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f49222a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f49223b;

    public /* synthetic */ C15876a(int i10, Object obj) {
        this.f49222a = i10;
        this.f49223b = obj;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        switch (this.f49222a) {
            case 0:
                return ((AbstractC15882b) this.f49223b).m17451L();
            default:
                return (Spliterator) this.f49223b;
        }
    }
}
