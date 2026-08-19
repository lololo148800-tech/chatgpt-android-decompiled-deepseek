package p662b8;

import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1426a;

/* JADX INFO: renamed from: b8.b */
/* JADX INFO: loaded from: classes.dex */
public final class C11258b extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Z */
    public static final C11258b f34104Z = new C11258b(0, 0);

    /* JADX INFO: renamed from: o0 */
    public static final C11258b f34105o0 = new C11258b(0, 1);

    /* JADX INFO: renamed from: p0 */
    public static final C11258b f34106p0 = new C11258b(0, 2);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f34107Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C11258b(int i10, int i11) {
        super(i10);
        this.f34107Y = i11;
    }

    @Override // p049Bm.InterfaceC1426a
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f34107Y) {
            case 0:
                return "Failed to get all stack traces.";
            case 1:
                return "Parsing tracing information for the exit reason wasn't successful, no thread dumps were parsed.";
            default:
                return "Failed to read crash trace stream.";
        }
    }
}
