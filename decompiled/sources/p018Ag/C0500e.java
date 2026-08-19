package p018Ag;

import java.util.function.BiConsumer;
import kotlin.jvm.internal.AbstractC16546n;
import p817j$.util.function.BiConsumer$CC;

/* JADX INFO: renamed from: Ag.e */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C0500e implements BiConsumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1628a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AbstractC16546n f1629b;

    public /* synthetic */ C0500e(AbstractC16546n abstractC16546n, int i10) {
        this.f1628a = i10;
        this.f1629b = abstractC16546n;
    }

    @Override // java.util.function.BiConsumer
    public final /* synthetic */ void accept(Object obj, Object obj2) {
        switch (this.f1628a) {
            case 0:
                ((C0501f) this.f1629b).invoke(obj, obj2);
                break;
            case 1:
                ((C0501f) this.f1629b).invoke(obj, obj2);
                break;
            case 2:
                ((C0501f) this.f1629b).invoke(obj, obj2);
                break;
            default:
                ((C0501f) this.f1629b).invoke(obj, obj2);
                break;
        }
    }

    public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        int i10 = this.f1628a;
        return BiConsumer$CC.$default$andThen(this, biConsumer);
    }
}
