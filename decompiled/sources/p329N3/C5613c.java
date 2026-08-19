package p329N3;

import p1016t3.C19771V;
import p1016t3.InterfaceC19772W;

/* JADX INFO: renamed from: N3.c */
/* JADX INFO: loaded from: classes.dex */
public final class C5613c {

    /* JADX INFO: renamed from: a */
    public final C5612b f18164a;

    public C5613c(C5612b c5612b) {
        this.f18164a = c5612b;
    }

    /* JADX INFO: renamed from: a */
    public final void m5999a() throws C19771V {
        try {
            ((C5613c) Class.forName("androidx.media3.effect.PreviewingSingleInputVideoGraph$Factory").getConstructor(InterfaceC19772W.class).newInstance(this.f18164a)).m5999a();
        } catch (Exception e10) {
            int i10 = C19771V.f62649Y;
            if (!(e10 instanceof C19771V)) {
                throw new C19771V(e10);
            }
        }
    }
}
