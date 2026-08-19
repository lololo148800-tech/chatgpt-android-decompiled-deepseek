package p860l0;

/* JADX INFO: renamed from: l0.M */
/* JADX INFO: loaded from: classes.dex */
public final class C16693M implements InterfaceC16694M0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C16696N f53491a;

    public C16693M(C16696N c16696n) {
        this.f53491a = c16696n;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [Bm.k, kotlin.jvm.internal.n] */
    @Override // p860l0.InterfaceC16694M0
    /* JADX INFO: renamed from: a */
    public final float mo18510a(float f10) {
        if (Float.isNaN(f10)) {
            return 0.0f;
        }
        C16696N c16696n = this.f53491a;
        float fFloatValue = ((Number) c16696n.f53499a.invoke(Float.valueOf(f10))).floatValue();
        c16696n.f53503e.setValue(Boolean.valueOf(fFloatValue > 0.0f));
        c16696n.f53504f.setValue(Boolean.valueOf(fFloatValue < 0.0f));
        return fFloatValue;
    }
}
