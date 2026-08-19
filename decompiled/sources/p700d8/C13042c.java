package p700d8;

import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1426a;

/* JADX INFO: renamed from: d8.c */
/* JADX INFO: loaded from: classes.dex */
public final class C13042c extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Z */
    public static final C13042c f41443Z = new C13042c(0, 0);

    /* JADX INFO: renamed from: o0 */
    public static final C13042c f41444o0 = new C13042c(0, 1);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f41445Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C13042c(int i10, int i11) {
        super(i10);
        this.f41445Y = i11;
    }

    @Override // p049Bm.InterfaceC1426a
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f41445Y) {
            case 0:
                return "RumEventMapper: the return from the ErrorEvent mapper was null for a crash. Dropping crashes in from the event mapper is not supported. The original event object will be used instead.";
            default:
                return "Failed to deserialize RUM event meta";
        }
    }
}
