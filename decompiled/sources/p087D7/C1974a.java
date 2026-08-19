package p087D7;

import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1426a;

/* JADX INFO: renamed from: D7.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1974a extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Z */
    public static final C1974a f5839Z = new C1974a(0, 0);

    /* JADX INFO: renamed from: o0 */
    public static final C1974a f5840o0 = new C1974a(0, 1);

    /* JADX INFO: renamed from: p0 */
    public static final C1974a f5841p0 = new C1974a(0, 2);

    /* JADX INFO: renamed from: q0 */
    public static final C1974a f5842q0 = new C1974a(0, 3);

    /* JADX INFO: renamed from: r0 */
    public static final C1974a f5843r0 = new C1974a(0, 4);

    /* JADX INFO: renamed from: s0 */
    public static final C1974a f5844s0 = new C1974a(0, 5);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f5845Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1974a(int i10, int i11) {
        super(i10);
        this.f5845Y = i11;
    }

    @Override // p049Bm.InterfaceC1426a
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f5845Y) {
            case 0:
                return "Cannot copy ByteArray, dest doesn't have enough space";
            case 1:
                return "Cannot copy ByteArray, src doesn't have enough data";
            case 2:
                return "Internal I/O operation failed";
            case 3:
                return "Error cancelling the UploadWorker";
            case 4:
                return "UploadWorker was scheduled.";
            default:
                return "Error while trying to setup the UploadWorker";
        }
    }
}
