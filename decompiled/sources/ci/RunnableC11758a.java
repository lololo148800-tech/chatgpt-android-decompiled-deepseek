package ci;

import android.widget.Toast;

/* JADX INFO: renamed from: ci.a */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC11758a implements Runnable {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f35657Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C11759b f35658Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ String f35659o0;

    public /* synthetic */ RunnableC11758a(C11759b c11759b, String str, int i10) {
        this.f35657Y = i10;
        this.f35658Z = c11759b;
        this.f35659o0 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f35657Y) {
            case 0:
                Toast.makeText(this.f35658Z.f35660a, this.f35659o0, 1).show();
                break;
            default:
                Toast.makeText(this.f35658Z.f35660a, this.f35659o0, 1).show();
                break;
        }
    }
}
