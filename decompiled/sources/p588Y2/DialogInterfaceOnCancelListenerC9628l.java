package p588Y2;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.AbstractActivityC11001b;
import androidx.fragment.app.AbstractC11002c;
import androidx.fragment.app.AbstractComponentCallbacksC11000a;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import p003A1.RunnableC0153B;
import p477Tb.C7296c;
import p523V9.AbstractC7841A0;
import p523V9.AbstractC8104h6;
import p772h.DialogC14229k;

/* JADX INFO: renamed from: Y2.l */
/* JADX INFO: loaded from: classes.dex */
public class DialogInterfaceOnCancelListenerC9628l extends AbstractComponentCallbacksC11000a implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {

    /* JADX INFO: renamed from: h1 */
    public final DialogInterfaceOnCancelListenerC9625i f29012h1;

    /* JADX INFO: renamed from: i1 */
    public final DialogInterfaceOnDismissListenerC9626j f29013i1;

    /* JADX INFO: renamed from: j1 */
    public int f29014j1;

    /* JADX INFO: renamed from: k1 */
    public int f29015k1;

    /* JADX INFO: renamed from: l1 */
    public boolean f29016l1;

    /* JADX INFO: renamed from: m1 */
    public boolean f29017m1;

    /* JADX INFO: renamed from: n1 */
    public int f29018n1;

    /* JADX INFO: renamed from: o1 */
    public boolean f29019o1;

    /* JADX INFO: renamed from: p1 */
    public final C7296c f29020p1;

    /* JADX INFO: renamed from: q1 */
    public Dialog f29021q1;

    /* JADX INFO: renamed from: r1 */
    public boolean f29022r1;

    /* JADX INFO: renamed from: s1 */
    public boolean f29023s1;

    /* JADX INFO: renamed from: t1 */
    public boolean f29024t1;

    /* JADX INFO: renamed from: u1 */
    public boolean f29025u1;

    public DialogInterfaceOnCancelListenerC9628l() {
        new RunnableC0153B(this, 13);
        this.f29012h1 = new DialogInterfaceOnCancelListenerC9625i(this);
        this.f29013i1 = new DialogInterfaceOnDismissListenerC9626j(this);
        this.f29014j1 = 0;
        this.f29015k1 = 0;
        this.f29016l1 = true;
        this.f29017m1 = true;
        this.f29018n1 = -1;
        this.f29020p1 = new C7296c(this, 29);
        this.f29025u1 = false;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC11000a
    /* JADX INFO: renamed from: C */
    public final void mo10175C() {
        this.f33133O0 = true;
        Dialog dialog = this.f29021q1;
        if (dialog != null) {
            this.f29022r1 = true;
            dialog.setOnDismissListener(null);
            this.f29021q1.dismiss();
            if (!this.f29023s1) {
                onDismiss(this.f29021q1);
            }
            this.f29021q1 = null;
            this.f29025u1 = false;
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC11000a
    /* JADX INFO: renamed from: D */
    public final void mo10176D() {
        this.f33133O0 = true;
        if (!this.f29024t1 && !this.f29023s1) {
            this.f29023s1 = true;
        }
        this.f33147a1.mo12121i(this.f29020p1);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC11000a
    /* JADX INFO: renamed from: E */
    public final LayoutInflater mo10177E(Bundle bundle) {
        LayoutInflater layoutInflaterMo10177E = super.mo10177E(bundle);
        boolean z6 = this.f29017m1;
        if (!z6 || this.f29019o1) {
            if (Log.isLoggable("FragmentManager", 2)) {
                String str = "getting layout inflater for DialogFragment " + this;
                if (this.f29017m1) {
                    Log.d("FragmentManager", "mCreatingDialog = true: " + str);
                } else {
                    Log.d("FragmentManager", "mShowsDialog = false: " + str);
                }
            }
            return layoutInflaterMo10177E;
        }
        if (z6 && !this.f29025u1) {
            try {
                this.f29019o1 = true;
                Dialog dialogMo10183Q = mo10183Q();
                this.f29021q1 = dialogMo10183Q;
                if (this.f29017m1) {
                    int i10 = this.f29014j1;
                    if (i10 == 1 || i10 == 2) {
                        dialogMo10183Q.requestWindowFeature(1);
                    } else if (i10 == 3) {
                        Window window = dialogMo10183Q.getWindow();
                        if (window != null) {
                            window.addFlags(24);
                        }
                        dialogMo10183Q.requestWindowFeature(1);
                    }
                    Context contextM11752o = m11752o();
                    if (contextM11752o instanceof Activity) {
                        this.f29021q1.setOwnerActivity((Activity) contextM11752o);
                    }
                    this.f29021q1.setCancelable(this.f29016l1);
                    this.f29021q1.setOnCancelListener(this.f29012h1);
                    this.f29021q1.setOnDismissListener(this.f29013i1);
                    this.f29025u1 = true;
                } else {
                    this.f29021q1 = null;
                }
                this.f29019o1 = false;
            } catch (Throwable th2) {
                this.f29019o1 = false;
                throw th2;
            }
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.d("FragmentManager", "get layout inflater for DialogFragment " + this + " from dialog context");
        }
        Dialog dialog = this.f29021q1;
        return dialog != null ? layoutInflaterMo10177E.cloneInContext(dialog.getContext()) : layoutInflaterMo10177E;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC11000a
    /* JADX INFO: renamed from: G */
    public void mo10178G(Bundle bundle) {
        Dialog dialog = this.f29021q1;
        if (dialog != null) {
            Bundle bundleOnSaveInstanceState = dialog.onSaveInstanceState();
            bundleOnSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", bundleOnSaveInstanceState);
        }
        int i10 = this.f29014j1;
        if (i10 != 0) {
            bundle.putInt("android:style", i10);
        }
        int i11 = this.f29015k1;
        if (i11 != 0) {
            bundle.putInt("android:theme", i11);
        }
        boolean z6 = this.f29016l1;
        if (!z6) {
            bundle.putBoolean("android:cancelable", z6);
        }
        boolean z10 = this.f29017m1;
        if (!z10) {
            bundle.putBoolean("android:showsDialog", z10);
        }
        int i12 = this.f29018n1;
        if (i12 != -1) {
            bundle.putInt("android:backStackId", i12);
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC11000a
    /* JADX INFO: renamed from: H */
    public void mo10179H() {
        this.f33133O0 = true;
        Dialog dialog = this.f29021q1;
        if (dialog != null) {
            this.f29022r1 = false;
            dialog.show();
            View decorView = this.f29021q1.getWindow().getDecorView();
            AbstractC7841A0.m8092d(decorView, this);
            ViewTreeViewModelStoreOwner.m12148b(decorView, this);
            AbstractC8104h6.m8585d(decorView, this);
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC11000a
    /* JADX INFO: renamed from: I */
    public void mo10180I() {
        this.f33133O0 = true;
        Dialog dialog = this.f29021q1;
        if (dialog != null) {
            dialog.hide();
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC11000a
    /* JADX INFO: renamed from: J */
    public final void mo10181J(Bundle bundle) {
        Bundle bundle2;
        this.f33133O0 = true;
        if (this.f29021q1 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.f29021q1.onRestoreInstanceState(bundle2);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC11000a
    /* JADX INFO: renamed from: K */
    public final void mo10182K(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.mo10182K(layoutInflater, viewGroup, bundle);
        if (this.f33135Q0 != null || this.f29021q1 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.f29021q1.onRestoreInstanceState(bundle2);
    }

    /* JADX INFO: renamed from: Q */
    public Dialog mo10183Q() {
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "onCreateDialog called for DialogFragment " + this);
        }
        return new DialogC14229k(m11743M(), this.f29015k1);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC11000a
    /* JADX INFO: renamed from: j */
    public final AbstractC9639w mo10184j() {
        return new C9627k(this, new C9631o(this));
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        if (this.f29022r1) {
            return;
        }
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "onDismiss called for DialogFragment " + this);
        }
        if (this.f29023s1) {
            return;
        }
        this.f29023s1 = true;
        this.f29024t1 = false;
        Dialog dialog = this.f29021q1;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.f29021q1.dismiss();
        }
        this.f29022r1 = true;
        if (this.f29018n1 >= 0) {
            AbstractC11002c abstractC11002cM11754q = m11754q();
            int i10 = this.f29018n1;
            if (i10 < 0) {
                throw new IllegalArgumentException(AbstractC10763a.m11048f(i10, "Bad id: "));
            }
            abstractC11002cM11754q.m11813w(new C9605I(abstractC11002cM11754q, i10, 1), true);
            this.f29018n1 = -1;
            return;
        }
        C9617a c9617a = new C9617a(m11754q());
        c9617a.f28971o = true;
        AbstractC11002c abstractC11002c = this.f33122D0;
        if (abstractC11002c == null || abstractC11002c == c9617a.f28972p) {
            c9617a.m10159b(new C9610N(3, this));
            c9617a.m10161d(true);
        } else {
            throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + toString() + " is already attached to a FragmentManager.");
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC11000a
    /* JADX INFO: renamed from: w */
    public final void mo10185w() {
        this.f33133O0 = true;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC11000a
    /* JADX INFO: renamed from: y */
    public final void mo10186y(AbstractActivityC11001b abstractActivityC11001b) {
        super.mo10186y(abstractActivityC11001b);
        this.f33147a1.m12120f(this.f29020p1);
        if (this.f29024t1) {
            return;
        }
        this.f29023s1 = false;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC11000a
    /* JADX INFO: renamed from: z */
    public void mo5187z(Bundle bundle) {
        super.mo5187z(bundle);
        new Handler();
        this.f29017m1 = this.f33127I0 == 0;
        if (bundle != null) {
            this.f29014j1 = bundle.getInt("android:style", 0);
            this.f29015k1 = bundle.getInt("android:theme", 0);
            this.f29016l1 = bundle.getBoolean("android:cancelable", true);
            this.f29017m1 = bundle.getBoolean("android:showsDialog", this.f29017m1);
            this.f29018n1 = bundle.getInt("android:backStackId", -1);
        }
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
    }
}
