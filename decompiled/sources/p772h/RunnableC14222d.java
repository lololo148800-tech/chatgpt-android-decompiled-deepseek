package p772h;

import androidx.activity.AbstractActivityC10817a;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: h.d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC14222d implements Runnable {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f44660Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ AbstractActivityC10817a f44661Z;

    public /* synthetic */ RunnableC14222d(AbstractActivityC10817a abstractActivityC10817a, int i10) {
        this.f44660Y = i10;
        this.f44661Z = abstractActivityC10817a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f44660Y) {
            case 0:
                AbstractActivityC10817a this$0 = this.f44661Z;
                AbstractC16544l.m18094g(this$0, "this$0");
                this$0.invalidateOptionsMenu();
                return;
            default:
                try {
                    super/*android.app.Activity*/.onBackPressed();
                    return;
                } catch (IllegalStateException e10) {
                    if (!AbstractC16544l.m18089b(e10.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                        throw e10;
                    }
                    return;
                } catch (NullPointerException e11) {
                    if (!AbstractC16544l.m18089b(e11.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                        throw e11;
                    }
                    return;
                }
        }
    }
}
