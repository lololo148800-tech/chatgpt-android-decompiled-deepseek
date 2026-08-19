package p587Y1;

import java.util.UUID;
import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1426a;

/* JADX INFO: renamed from: Y1.c */
/* JADX INFO: loaded from: classes.dex */
public final class C9577c extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Z */
    public static final C9577c f28827Z = new C9577c(0, 0);

    /* JADX INFO: renamed from: o0 */
    public static final C9577c f28828o0 = new C9577c(0, 1);

    /* JADX INFO: renamed from: p0 */
    public static final C9577c f28829p0 = new C9577c(0, 2);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f28830Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C9577c(int i10, int i11) {
        super(i10);
        this.f28830Y = i11;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        switch (this.f28830Y) {
            case 0:
                return UUID.randomUUID();
            case 1:
                return "DEFAULT_TEST_TAG";
            default:
                return UUID.randomUUID();
        }
    }
}
