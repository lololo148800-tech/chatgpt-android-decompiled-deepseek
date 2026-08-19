package p284L7;

import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1426a;

/* JADX INFO: renamed from: L7.a */
/* JADX INFO: loaded from: classes.dex */
public final class C4956a extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Z */
    public static final C4956a f16167Z = new C4956a(0, 0);

    /* JADX INFO: renamed from: o0 */
    public static final C4956a f16168o0 = new C4956a(0, 1);

    /* JADX INFO: renamed from: p0 */
    public static final C4956a f16169p0 = new C4956a(0, 2);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f16170Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4956a(int i10, int i11) {
        super(i10);
        this.f16170Y = i11;
    }

    @Override // p049Bm.InterfaceC1426a
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f16170Y) {
            case 0:
                return "Log event write operation wait was interrupted.";
            case 1:
                return "Logs feature received a NDK crash event where one or more mandatory (loggerName, message, timestamp, attributes) fields are either missing or have wrong type.";
            default:
                return "Logs feature received a Span log event where one or more mandatory (loggerName, message, timestamp, attributes) fields are either missing or have wrong type.";
        }
    }
}
