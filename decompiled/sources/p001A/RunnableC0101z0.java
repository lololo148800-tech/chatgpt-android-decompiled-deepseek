package p001A;

import android.app.NotificationManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Binder;
import android.view.ViewGroup;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import io.sentry.android.core.AbstractC15256t;
import java.util.HashSet;
import kotlin.jvm.internal.AbstractC16544l;
import p025An.AbstractC0575H;
import p1066vk.C20638f;
import p109E3.C2292p;
import p110E4.C2307e;
import p379Pb.LVf.efyhmdM;
import p408Qj.C6736b;
import p523V9.AbstractC7861C4;
import p523V9.AbstractC8012V5;
import p523V9.AbstractC8072d6;
import p523V9.AbstractC8226x0;
import p610Z1.C10142i;
import p746fa.C13599h;
import p893n.AbstractActivityC17375g;

/* JADX INFO: renamed from: A.z0 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0101z0 implements Runnable {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f431Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ Object f432Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ boolean f433o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ Object f434p0;

    public /* synthetic */ RunnableC0101z0(C0036S0 c0036s0, C10142i c10142i, boolean z6) {
        this.f431Y = 1;
        this.f434p0 = c0036s0;
        this.f432Z = c10142i;
        this.f433o0 = z6;
    }

    public /* synthetic */ RunnableC0101z0(Object obj, boolean z6, Object obj2, int i10) {
        this.f431Y = i10;
        this.f434p0 = obj;
        this.f433o0 = z6;
        this.f432Z = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [A.A0, A.s] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f431Y) {
            case 0:
                final C0007D0 c0007d0 = (C0007D0) this.f434p0;
                boolean z6 = this.f433o0;
                final C10142i c10142i = (C10142i) this.f432Z;
                ((HashSet) c0007d0.f23a.f368Y.f335b).remove(c0007d0.f42t);
                c0007d0.f41s = z6;
                if (!c0007d0.f26d) {
                    c10142i.m10748b(new C2292p("Camera is not active."));
                    return;
                }
                final long jM313t = c0007d0.f23a.m313t();
                ?? r6 = new InterfaceC0086s() { // from class: A.A0
                    @Override // p001A.InterfaceC0086s
                    /* JADX INFO: renamed from: b */
                    public final boolean mo3b(TotalCaptureResult totalCaptureResult) {
                        C0007D0 c0007d1 = c0007d0;
                        c0007d1.getClass();
                        boolean z10 = ((Integer) totalCaptureResult.get(CaptureResult.CONTROL_AE_MODE)).intValue() == 5;
                        AbstractC8072d6.m8486c("FocusMeteringControl", "enableExternalFlashAeMode: isAeModeExternalFlash = " + z10);
                        if (z10 != c0007d1.f41s || !C0088t.m294n(totalCaptureResult, jM313t)) {
                            return false;
                        }
                        AbstractC8072d6.m8486c("FocusMeteringControl", "enableExternalFlashAeMode: session updated with isAeModeExternalFlash = " + z10);
                        c10142i.m10747a(null);
                        return true;
                    }
                };
                c0007d0.f42t = r6;
                c0007d0.f23a.m297a(r6);
                return;
            case 1:
                ((C0036S0) this.f434p0).m192d((C10142i) this.f432Z, this.f433o0);
                return;
            case 2:
                Context context = (Context) this.f434p0;
                C13599h c13599h = (C13599h) this.f432Z;
                try {
                    if (Binder.getCallingUid() == context.getApplicationInfo().uid) {
                        SharedPreferences.Editor editorEdit = AbstractC7861C4.m8134b(context).edit();
                        editorEdit.putBoolean("proxy_notification_initialized", true);
                        editorEdit.apply();
                        NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
                        if (this.f433o0) {
                            notificationManager.setNotificationDelegate("com.google.android.gms");
                        } else if ("com.google.android.gms".equals(notificationManager.getNotificationDelegate())) {
                            notificationManager.setNotificationDelegate(null);
                        }
                    } else {
                        AbstractC15256t.m16465c(efyhmdM.gzEHOJqYBbv, "error configuring notification delegate for package " + context.getPackageName());
                    }
                    return;
                } finally {
                    c13599h.m15116d(null);
                }
            default:
                C2307e this$0 = (C2307e) this.f434p0;
                AbstractC16544l.m18094g(this$0, "this$0");
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f432Z;
                if (!this.f433o0) {
                    bottomSheetBehavior.m13586A(3);
                    return;
                }
                C6736b c6736b = new C6736b(bottomSheetBehavior, 2);
                Context context2 = ((ViewGroup) this$0.f7159o0).getContext();
                AbstractC16544l.m18091d(context2);
                AbstractActivityC17375g abstractActivityC17375gM8328a = AbstractC8012V5.m8328a(context2);
                if (abstractActivityC17375gM8328a == null) {
                    return;
                }
                AbstractC0575H.m1156D(AbstractC8226x0.m8861b(abstractActivityC17375gM8328a), null, null, new C20638f(this$0, c6736b, null), 3);
                return;
        }
    }

    public /* synthetic */ RunnableC0101z0(boolean z6, C2307e c2307e, BottomSheetBehavior bottomSheetBehavior) {
        this.f431Y = 3;
        this.f433o0 = z6;
        this.f434p0 = c2307e;
        this.f432Z = bottomSheetBehavior;
    }
}
