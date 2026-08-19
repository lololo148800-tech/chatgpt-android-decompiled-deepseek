package p619Zb;

import android.content.Context;
import p005A3.C0326m;
import p1009s9.C19503f;
import p165G9.C3020f;
import p228J.AbstractC3812N;
import p501Ub.C7604f;
import p523V9.AbstractC7855B6;
import p523V9.C7896H;
import p523V9.C8049b;
import p523V9.C8232x6;
import p546Wb.C8756b;

/* JADX INFO: renamed from: Zb.e */
/* JADX INFO: loaded from: classes.dex */
public final class C10272e extends AbstractC3812N {

    /* JADX INFO: renamed from: o0 */
    public final C7604f f30509o0;

    public C10272e(C7604f c7604f) {
        super(4, (byte) 0);
        this.f30509o0 = c7604f;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0031  */
    @Override // p228J.AbstractC3812N
    /* JADX INFO: renamed from: s */
    public final Object mo4535s(Object obj) {
        InterfaceC10274g c10275h;
        C8756b c8756b = (C8756b) obj;
        C7604f c7604f = this.f30509o0;
        Context contextM7952b = c7604f.m7952b();
        C8232x6 c8232x6M8128h = AbstractC7855B6.m8128h(true != AbstractC10269b.m10868c() ? "play-services-mlkit-barcode-scanning" : "barcode-scanning");
        C7896H c7896h = C10275h.f30517h;
        if (C3020f.m3865a(contextM7952b, "com.google.mlkit.dynamite.barcode") > 0) {
            c10275h = new C10275h(contextM7952b, c8756b, c8232x6M8128h);
        } else {
            C19503f.f61952b.getClass();
            if (C19503f.m20600a(contextM7952b) >= 204500000) {
                c10275h = new C10275h(contextM7952b, c8756b, c8232x6M8128h);
            } else {
                C0326m c0326m = new C0326m();
                C8049b c8049b = new C8049b();
                c0326m.f1141c = c8049b;
                c0326m.f1140b = contextM7952b;
                c8049b.f25356Y = c8756b.f26676a;
                c0326m.f1142d = c8232x6M8128h;
                c10275h = c0326m;
            }
        }
        return new C10273f(c7604f, c8756b, c10275h, c8232x6M8128h);
    }
}
