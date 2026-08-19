package p1036u9;

import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import java.util.concurrent.atomic.AtomicReference;
import p1009s9.C19499b;
import p1009s9.C19502e;
import p1009s9.C19503f;
import p377P9.HandlerC6378d;
import p692d0.C12967f;

/* JADX INFO: renamed from: u9.o */
/* JADX INFO: loaded from: classes.dex */
public final class DialogInterfaceOnCancelListenerC20169o extends LifecycleCallback implements DialogInterface.OnCancelListener {

    /* JADX INFO: renamed from: Z */
    public volatile boolean f63877Z;

    /* JADX INFO: renamed from: o0 */
    public final AtomicReference f63878o0;

    /* JADX INFO: renamed from: p0 */
    public final HandlerC6378d f63879p0;

    /* JADX INFO: renamed from: q0 */
    public final C19502e f63880q0;

    /* JADX INFO: renamed from: r0 */
    public final C12967f f63881r0;

    /* JADX INFO: renamed from: s0 */
    public final C20159e f63882s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogInterfaceOnCancelListenerC20169o(InterfaceC20162h interfaceC20162h, C20159e c20159e) {
        super(interfaceC20162h);
        C19502e c19502e = C19502e.f61950d;
        this.f63878o0 = new AtomicReference(null);
        this.f63879p0 = new HandlerC6378d(Looper.getMainLooper(), 0);
        this.f63880q0 = c19502e;
        this.f63881r0 = new C12967f(0);
        this.f63882s0 = c20159e;
        interfaceC20162h.mo20973g(this);
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    /* JADX INFO: renamed from: b */
    public final void mo13189b(int i10, int i11, Intent intent) {
        AtomicReference atomicReference = this.f63878o0;
        C20152D c20152d = (C20152D) atomicReference.get();
        C20159e c20159e = this.f63882s0;
        if (i10 != 1) {
            if (i10 == 2) {
                int iM20602c = this.f63880q0.m20602c(m13188a(), C19503f.f61951a);
                if (iM20602c == 0) {
                    atomicReference.set(null);
                    HandlerC6378d handlerC6378d = c20159e.f63870z0;
                    handlerC6378d.sendMessage(handlerC6378d.obtainMessage(3));
                    return;
                } else {
                    if (c20152d == null) {
                        return;
                    }
                    if (c20152d.f63834b.f61940Z == 18 && iM20602c == 18) {
                        return;
                    }
                }
            }
        } else if (i11 == -1) {
            atomicReference.set(null);
            HandlerC6378d handlerC6378d2 = c20159e.f63870z0;
            handlerC6378d2.sendMessage(handlerC6378d2.obtainMessage(3));
            return;
        } else if (i11 == 0) {
            if (c20152d != null) {
                C19499b c19499b = new C19499b(1, intent != null ? intent.getIntExtra("<<ResolutionFailureErrorDetail>>", 13) : 13, null, c20152d.f63834b.toString());
                atomicReference.set(null);
                c20159e.m20984h(c19499b, c20152d.f63833a);
                return;
            }
            return;
        }
        if (c20152d != null) {
            atomicReference.set(null);
            c20159e.m20984h(c20152d.f63834b, c20152d.f63833a);
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    /* JADX INFO: renamed from: c */
    public final void mo13190c(Bundle bundle) {
        if (bundle != null) {
            this.f63878o0.set(bundle.getBoolean("resolving_error", false) ? new C20152D(new C19499b(bundle.getInt("failed_status"), (PendingIntent) bundle.getParcelable("failed_resolution")), bundle.getInt("failed_client_id", -1)) : null);
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    /* JADX INFO: renamed from: d */
    public final void mo13191d() {
        if (this.f63881r0.isEmpty()) {
            return;
        }
        this.f63882s0.m20980b(this);
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    /* JADX INFO: renamed from: e */
    public final void mo13192e(Bundle bundle) {
        C20152D c20152d = (C20152D) this.f63878o0.get();
        if (c20152d == null) {
            return;
        }
        bundle.putBoolean("resolving_error", true);
        bundle.putInt("failed_client_id", c20152d.f63833a);
        C19499b c19499b = c20152d.f63834b;
        bundle.putInt("failed_status", c19499b.f61940Z);
        bundle.putParcelable("failed_resolution", c19499b.f61941o0);
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    /* JADX INFO: renamed from: f */
    public final void mo13193f() {
        this.f63877Z = true;
        if (this.f63881r0.isEmpty()) {
            return;
        }
        this.f63882s0.m20980b(this);
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    /* JADX INFO: renamed from: g */
    public final void mo13194g() {
        this.f63877Z = false;
        C20159e c20159e = this.f63882s0;
        c20159e.getClass();
        synchronized (C20159e.f63854D0) {
            try {
                if (c20159e.f63867w0 == this) {
                    c20159e.f63867w0 = null;
                    c20159e.f63868x0.clear();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        C19499b c19499b = new C19499b(13, null);
        AtomicReference atomicReference = this.f63878o0;
        C20152D c20152d = (C20152D) atomicReference.get();
        int i10 = c20152d == null ? -1 : c20152d.f63833a;
        atomicReference.set(null);
        this.f63882s0.m20984h(c19499b, i10);
    }
}
