package p001A;

import kotlin.jvm.internal.AbstractC16544l;
import p326N.C5567i;
import p523V9.AbstractC8072d6;
import p610Z1.C10142i;

/* JADX INFO: renamed from: A.b0 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0053b0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f249a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f250b;

    public /* synthetic */ C0053b0(Object obj, int i10) {
        this.f249a = i10;
        this.f250b = obj;
    }

    /* JADX INFO: renamed from: a */
    public final void m235a() {
        switch (this.f249a) {
            case 0:
                AbstractC8072d6.m8486c("Camera2CapturePipeline", "ScreenFlashTask#preCapture: UI change applied");
                ((C10142i) this.f250b).m10747a(null);
                return;
            default:
                C5567i this$0 = (C5567i) this.f250b;
                AbstractC16544l.m18094g(this$0, "this$0");
                synchronized (this$0.f18057b) {
                    try {
                        if (this$0.f18059d == null) {
                            AbstractC8072d6.m8492i("ScreenFlashWrapper", "apply: pendingListener is null!");
                        }
                        this$0.m5976c();
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return;
        }
    }
}
