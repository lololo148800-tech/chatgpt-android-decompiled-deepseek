package p101Dl;

import android.media.AudioManager;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p855kj.C16429h;
import p855kj.C16432k;

/* JADX INFO: renamed from: Dl.e */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC2104e implements Runnable {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f6453Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C2109j f6454Z;

    public /* synthetic */ RunnableC2104e(C2109j c2109j, int i10) {
        this.f6453Y = i10;
        this.f6454Z = c2109j;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, mm.i] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, mm.i] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, mm.i] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6453Y) {
            case 0:
                C2109j this$0 = this.f6454Z;
                AbstractC16544l.m18094g(this$0, "this$0");
                C2109j.Companion.getClass();
                C16432k c16432k = new C16432k(this$0.f6462a, false, (AudioManager.OnAudioFocusChangeListener) C2109j.f6459h.getValue(), (List) C2109j.f6461j.getValue());
                c16432k.f50979h = true;
                int i10 = this$0.f6463b;
                C16429h c16429h = c16432k.f50982k;
                c16429h.f50961e = i10;
                c16429h.f50962f = 1;
                c16429h.f50963g = this$0.f6464c;
                c16429h.f50964h = this$0.f6465d;
                c16429h.f50965i = this$0.f6466e;
                c16432k.f50980i = false;
                this$0.f6467f = c16432k;
                c16432k.m18017f((C2105f) C2109j.f6460i.getValue());
                c16432k.m18013a();
                break;
            default:
                C2109j this$1 = this.f6454Z;
                AbstractC16544l.m18094g(this$1, "this$0");
                C16432k c16432k2 = this$1.f6467f;
                if (c16432k2 != null) {
                    c16432k2.m18018g();
                }
                this$1.f6467f = null;
                break;
        }
    }
}
