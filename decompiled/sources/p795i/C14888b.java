package p795i;

import java.util.UUID;
import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1426a;

/* JADX INFO: renamed from: i.b */
/* JADX INFO: loaded from: classes.dex */
public final class C14888b extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Z */
    public static final C14888b f46374Z = new C14888b(0, 0);

    /* JADX INFO: renamed from: o0 */
    public static final C14888b f46375o0 = new C14888b(0, 1);

    /* JADX INFO: renamed from: p0 */
    public static final C14888b f46376p0 = new C14888b(0, 2);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f46377Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C14888b(int i10, int i11) {
        super(i10);
        this.f46377Y = i11;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        switch (this.f46377Y) {
            case 0:
                return UUID.randomUUID().toString();
            case 1:
                return null;
            default:
                return null;
        }
    }
}
