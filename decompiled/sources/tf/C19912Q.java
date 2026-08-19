package tf;

import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1436k;

/* JADX INFO: renamed from: tf.Q */
/* JADX INFO: loaded from: classes3.dex */
public final class C19912Q extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Z */
    public static final C19912Q f63114Z = new C19912Q(1, 0);

    /* JADX INFO: renamed from: o0 */
    public static final C19912Q f63115o0 = new C19912Q(1, 1);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f63116Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C19912Q(int i10, int i11) {
        super(i10);
        this.f63116Y = i11;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        switch (this.f63116Y) {
            case 0:
                break;
        }
        return Integer.valueOf(((Number) obj).intValue() / 2);
    }
}
