package p999s;

/* JADX INFO: renamed from: s.x0 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC19387x0 implements Runnable {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f61401Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C19285B0 f61402Z;

    public /* synthetic */ RunnableC19387x0(C19285B0 c19285b0, int i10) {
        this.f61401Y = i10;
        this.f61402Z = c19285b0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f61401Y) {
            case 0:
                C19369o0 c19369o0 = this.f61402Z.f61109o0;
                if (c19369o0 != null) {
                    c19369o0.setListSelectionHidden(true);
                    c19369o0.requestLayout();
                }
                break;
            default:
                C19285B0 c19285b0 = this.f61402Z;
                C19369o0 c19369o1 = c19285b0.f61109o0;
                if (c19369o1 != null && c19369o1.isAttachedToWindow() && c19285b0.f61109o0.getCount() > c19285b0.f61109o0.getChildCount() && c19285b0.f61109o0.getChildCount() <= c19285b0.f61119y0) {
                    c19285b0.f61106L0.setInputMethodMode(2);
                    c19285b0.mo20083f();
                    break;
                }
                break;
        }
    }
}
