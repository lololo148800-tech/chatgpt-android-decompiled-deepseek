package p969qj;

import cc.C11699d;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1426a;
import p501Ub.C7604f;
import p523V9.AbstractC7855B6;
import p523V9.AbstractC8151n5;
import p523V9.AbstractC8166p4;
import p546Wb.C8756b;
import p619Zb.AbstractC10269b;
import p619Zb.C10268a;
import p619Zb.C10271d;
import p619Zb.C10273f;
import p768gc.C13836a;

/* JADX INFO: renamed from: qj.i */
/* JADX INFO: loaded from: classes3.dex */
public final class C18751i extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Z */
    public static final C18751i f59624Z = new C18751i(0, 0);

    /* JADX INFO: renamed from: o0 */
    public static final C18751i f59625o0 = new C18751i(0, 1);

    /* JADX INFO: renamed from: p0 */
    public static final C18751i f59626p0 = new C18751i(0, 2);

    /* JADX INFO: renamed from: q0 */
    public static final C18751i f59627q0 = new C18751i(0, 3);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f59628Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C18751i(int i10, int i11) {
        super(i10);
        this.f59628Y = i11;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        switch (this.f59628Y) {
            case 0:
                C8756b c8756b = new C8756b(2048);
                C10271d c10271d = (C10271d) C7604f.m7950c().m7951a(C10271d.class);
                c10271d.getClass();
                return new C10268a(c8756b, (C10273f) c10271d.f30507a.m4539y(c8756b), (Executor) c10271d.f30508b.f24036a.get(), AbstractC7855B6.m8128h(true != AbstractC10269b.m10868c() ? "play-services-mlkit-barcode-scanning" : "barcode-scanning"));
            case 1:
                return AbstractC8166p4.m8733a(new C11699d(1, 0.1f));
            case 2:
                return AbstractC8151n5.m8694b(C13836a.f43872b);
            default:
                return AbstractC8151n5.m8694b(C13836a.f43872b);
        }
    }
}
