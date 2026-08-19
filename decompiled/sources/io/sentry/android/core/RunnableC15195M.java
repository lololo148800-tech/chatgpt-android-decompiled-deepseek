package io.sentry.android.core;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Application;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.os.SystemClock;
import android.widget.ProgressBar;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.internal.play_billing.AbstractC11857B;
import com.google.android.gms.internal.play_billing.AbstractC11988o0;
import com.google.android.gms.internal.play_billing.C11907S;
import com.google.android.gms.internal.play_billing.C12027y;
import com.revenuecat.purchases.google.usecase.C12746a;
import com.revenuecat.purchases.google.usecase.C12747b;
import com.revenuecat.purchases.google.usecase.C12748c;
import com.revenuecat.purchases.google.usecase.C12749d;
import io.sentry.C15524y1;
import io.sentry.EnumC15375i1;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import p001A.C0042V0;
import p1003s3.RunnableC19440a;
import p1009s9.AbstractC19505h;
import p1009s9.C19499b;
import p1009s9.C19502e;
import p1022t9.InterfaceC19818c;
import p1027tp.C20074r;
import p1036u9.BinderC20179y;
import p1036u9.C20152D;
import p1036u9.C20154F;
import p1036u9.C20155a;
import p1036u9.C20159e;
import p1036u9.C20171q;
import p1036u9.DialogInterfaceOnCancelListenerC20169o;
import p1036u9.FragmentC20153E;
import p1060v9.AbstractBinderC20483a;
import p1060v9.AbstractC20495m;
import p1060v9.AbstractC20502t;
import p1060v9.C20482E;
import p1060v9.C20498p;
import p1060v9.InterfaceC20488f;
import p109E3.C2292p;
import p377P9.HandlerC6378d;
import p414R.C6772f;
import p523V9.AbstractC8154o0;
import p544W9.AbstractC8471E3;
import p571X9.AbstractC9233X;
import p658b5.C11232c;
import p658b5.C11238i;
import p702da.C13055g;
import p784hb.C14438g;
import p826j6.AbstractC16144M;
import p826j6.C16149c;
import p826j6.C16155i;
import p826j6.InterfaceC16165s;
import p835jg.C16206a;
import p896n2.AbstractC17451d;
import p896n2.C17450c;
import p904nb.ExecutorC17552i;
import p955q2.AbstractC18610b;
import p960q9.C18650d;
import p980r3.C18871a;
import p985r9.C18902l;
import p985r9.RunnableC18900j;
import p985r9.ServiceConnectionC18901k;
import sk.C19665d;

/* JADX INFO: renamed from: io.sentry.android.core.M */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC15195M implements Runnable {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f47347Y;

    /* JADX INFO: renamed from: Z */
    public Object f47348Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ Object f47349o0;

    public /* synthetic */ RunnableC15195M(Object obj, int i10, Object obj2) {
        this.f47347Y = i10;
        this.f47349o0 = obj;
        this.f47348Z = obj2;
    }

    /* JADX INFO: renamed from: a */
    private final void m16396a() {
        try {
            m16400e();
        } catch (Error e10) {
            synchronized (((ExecutorC17552i) this.f47349o0).f56152Z) {
                ((ExecutorC17552i) this.f47349o0).f56153o0 = 1;
                throw e10;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    private final void m16397b() {
        ServiceConnectionC18901k serviceConnectionC18901k = (ServiceConnectionC18901k) this.f47348Z;
        IBinder iBinder = (IBinder) this.f47349o0;
        synchronized (serviceConnectionC18901k) {
            if (iBinder == null) {
                serviceConnectionC18901k.m20209a(0, "Null service connection");
                return;
            }
            try {
                serviceConnectionC18901k.f60257c = new C11232c(iBinder);
                serviceConnectionC18901k.f60255a = 2;
                ((ScheduledExecutorService) serviceConnectionC18901k.f60260f.f60269c).execute(new RunnableC18900j(serviceConnectionC18901k, 0));
            } catch (RemoteException e10) {
                serviceConnectionC18901k.m20209a(0, e10.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: c */
    private final void m16398c() {
        ServiceConnectionC18901k serviceConnectionC18901k = (ServiceConnectionC18901k) this.f47348Z;
        int i10 = ((C18902l) this.f47349o0).f60261a;
        synchronized (serviceConnectionC18901k) {
            C18902l c18902l = (C18902l) serviceConnectionC18901k.f60259e.get(i10);
            if (c18902l != null) {
                AbstractC15256t.m16482t("MessengerIpcClient", "Timing out request: " + i10);
                serviceConnectionC18901k.f60259e.remove(i10);
                c18902l.m20214b(new C2292p("Timed out waiting for response", null));
                serviceConnectionC18901k.m20211c();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v17, types: [java.lang.Object, u9.h] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, u9.h] */
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
    /* JADX INFO: renamed from: d */
    private final void m16399d() {
        int i10 = 2;
        if (((DialogInterfaceOnCancelListenerC20169o) this.f47349o0).f63877Z) {
            C19499b c19499b = ((C20152D) this.f47348Z).f63834b;
            if ((c19499b.f61940Z == 0 || c19499b.f61941o0 == null) ? false : true) {
                DialogInterfaceOnCancelListenerC20169o dialogInterfaceOnCancelListenerC20169o = (DialogInterfaceOnCancelListenerC20169o) this.f47349o0;
                ?? r6 = dialogInterfaceOnCancelListenerC20169o.f36066Y;
                Activity activityM13188a = dialogInterfaceOnCancelListenerC20169o.m13188a();
                PendingIntent pendingIntent = c19499b.f61941o0;
                AbstractC20502t.m21157h(pendingIntent);
                int i11 = ((C20152D) this.f47348Z).f63833a;
                int i12 = GoogleApiActivity.f36043Z;
                Intent intent = new Intent(activityM13188a, (Class<?>) GoogleApiActivity.class);
                intent.putExtra("pending_intent", pendingIntent);
                intent.putExtra("failing_client_id", i11);
                intent.putExtra("notify_manager", false);
                r6.startActivityForResult(intent, 1);
                return;
            }
            DialogInterfaceOnCancelListenerC20169o dialogInterfaceOnCancelListenerC20169o2 = (DialogInterfaceOnCancelListenerC20169o) this.f47349o0;
            if (dialogInterfaceOnCancelListenerC20169o2.f63880q0.m20601b(c19499b.f61940Z, dialogInterfaceOnCancelListenerC20169o2.m13188a(), null) != null) {
                DialogInterfaceOnCancelListenerC20169o dialogInterfaceOnCancelListenerC20169o3 = (DialogInterfaceOnCancelListenerC20169o) this.f47349o0;
                dialogInterfaceOnCancelListenerC20169o3.f63880q0.m20599h(dialogInterfaceOnCancelListenerC20169o3.m13188a(), dialogInterfaceOnCancelListenerC20169o3.f36066Y, c19499b.f61940Z, (DialogInterfaceOnCancelListenerC20169o) this.f47349o0);
                return;
            }
            if (c19499b.f61940Z != 18) {
                DialogInterfaceOnCancelListenerC20169o dialogInterfaceOnCancelListenerC20169o4 = (DialogInterfaceOnCancelListenerC20169o) this.f47349o0;
                int i13 = ((C20152D) this.f47348Z).f63833a;
                dialogInterfaceOnCancelListenerC20169o4.f63878o0.set(null);
                dialogInterfaceOnCancelListenerC20169o4.f63882s0.m20984h(c19499b, i13);
                return;
            }
            DialogInterfaceOnCancelListenerC20169o dialogInterfaceOnCancelListenerC20169o5 = (DialogInterfaceOnCancelListenerC20169o) this.f47349o0;
            C19502e c19502e = dialogInterfaceOnCancelListenerC20169o5.f63880q0;
            Activity activityM13188a2 = dialogInterfaceOnCancelListenerC20169o5.m13188a();
            c19502e.getClass();
            ProgressBar progressBar = new ProgressBar(activityM13188a2, null, R.attr.progressBarStyleLarge);
            progressBar.setIndeterminate(true);
            progressBar.setVisibility(0);
            AlertDialog.Builder builder = new AlertDialog.Builder(activityM13188a2);
            builder.setView(progressBar);
            builder.setMessage(AbstractC20495m.m21140b(activityM13188a2, 18));
            builder.setPositiveButton("", (DialogInterface.OnClickListener) null);
            AlertDialog alertDialogCreate = builder.create();
            C19502e.m20596f(activityM13188a2, alertDialogCreate, "GooglePlayServicesUpdatingDialog", dialogInterfaceOnCancelListenerC20169o5);
            DialogInterfaceOnCancelListenerC20169o dialogInterfaceOnCancelListenerC20169o6 = (DialogInterfaceOnCancelListenerC20169o) this.f47349o0;
            Context applicationContext = dialogInterfaceOnCancelListenerC20169o6.m13188a().getApplicationContext();
            C19665d c19665d = new C19665d(this, i10, alertDialogCreate);
            dialogInterfaceOnCancelListenerC20169o6.f63880q0.getClass();
            IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
            intentFilter.addDataScheme("package");
            C16206a c16206a = new C16206a(c19665d);
            int i14 = Build.VERSION.SDK_INT;
            if (i14 >= 33) {
                applicationContext.registerReceiver(c16206a, intentFilter, i14 < 33 ? 0 : 2);
            } else {
                applicationContext.registerReceiver(c16206a, intentFilter);
            }
            c16206a.f50285b = applicationContext;
            if (AbstractC19505h.m20603a(applicationContext)) {
                return;
            }
            DialogInterfaceOnCancelListenerC20169o dialogInterfaceOnCancelListenerC20169o7 = (DialogInterfaceOnCancelListenerC20169o) this.f47349o0;
            dialogInterfaceOnCancelListenerC20169o7.f63878o0.set(null);
            HandlerC6378d handlerC6378d = dialogInterfaceOnCancelListenerC20169o7.f63882s0.f63870z0;
            handlerC6378d.sendMessage(handlerC6378d.obtainMessage(3));
            if (alertDialogCreate.isShowing()) {
                alertDialogCreate.dismiss();
            }
            synchronized (c16206a) {
                try {
                    Context context = (Context) c16206a.f50285b;
                    if (context != null) {
                        context.unregisterReceiver(c16206a);
                    }
                    c16206a.f50285b = null;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0043, code lost:
    
        if (r1 == false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0045, code lost:
    
        java.lang.Thread.currentThread().interrupt();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004c, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0052, code lost:
    
        r1 = r1 | java.lang.Thread.interrupted();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0054, code lost:
    
        ((java.lang.Runnable) r10.f47348Z).run();
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0060, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0062, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0063, code lost:
    
        p904nb.ExecutorC17552i.f56150r0.log(java.util.logging.Level.SEVERE, "Exception while executing runnable " + ((java.lang.Runnable) r10.f47348Z), (java.lang.Throwable) r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0080, code lost:
    
        r10.f47348Z = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0082, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:?, code lost:
    
        return;
     */
    /* JADX INFO: renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m16400e() {
        boolean z6 = false;
        boolean zInterrupted = false;
        while (true) {
            try {
                synchronized (((ExecutorC17552i) this.f47349o0).f56152Z) {
                    if (!z6) {
                        ExecutorC17552i executorC17552i = (ExecutorC17552i) this.f47349o0;
                        if (executorC17552i.f56153o0 != 4) {
                            executorC17552i.f56154p0++;
                            executorC17552i.f56153o0 = 4;
                            z6 = true;
                        }
                    }
                    Runnable runnable = (Runnable) ((ExecutorC17552i) this.f47349o0).f56152Z.poll();
                    this.f47348Z = runnable;
                    if (runnable == null) {
                        ((ExecutorC17552i) this.f47349o0).f56153o0 = 1;
                    }
                }
                if (zInterrupted) {
                    Thread.currentThread().interrupt();
                    return;
                }
                return;
                this.f47348Z = null;
            } catch (Throwable th2) {
                if (zInterrupted) {
                    Thread.currentThread().interrupt();
                }
                throw th2;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC20488f interfaceC20488f;
        Set set;
        InterfaceC20488f c20482e = null;
        switch (this.f47347Y) {
            case 0:
                if (((NetworkBreadcrumbsIntegration) this.f47349o0).f47362q0) {
                    return;
                }
                synchronized (((NetworkBreadcrumbsIntegration) this.f47349o0).f47361p0) {
                    try {
                        ((NetworkBreadcrumbsIntegration) this.f47349o0).f47364s0 = new C15197O(((NetworkBreadcrumbsIntegration) this.f47349o0).f47359Z, ((C15524y1) this.f47348Z).getDateProvider());
                        NetworkBreadcrumbsIntegration networkBreadcrumbsIntegration = (NetworkBreadcrumbsIntegration) this.f47349o0;
                        if (C11238i.m12527A0(networkBreadcrumbsIntegration.f47358Y, networkBreadcrumbsIntegration.f47360o0, networkBreadcrumbsIntegration.f47359Z, networkBreadcrumbsIntegration.f47364s0)) {
                            ((NetworkBreadcrumbsIntegration) this.f47349o0).f47360o0.mo16298o(EnumC15375i1.DEBUG, "NetworkBreadcrumbsIntegration installed.", new Object[0]);
                            AbstractC8471E3.m9104b("NetworkBreadcrumbs");
                        } else {
                            ((NetworkBreadcrumbsIntegration) this.f47349o0).f47360o0.mo16298o(EnumC15375i1.DEBUG, "NetworkBreadcrumbsIntegration not installed.", new Object[0]);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                    break;
                }
                return;
            case 1:
                C16149c c16149c = (C16149c) this.f47348Z;
                c16149c.getClass();
                C16155i c16155i = AbstractC16144M.f50089l;
                c16149c.m17756D(24, 9, c16155i);
                C12027y c12027y = AbstractC11857B.f36097Z;
                ((C12748c) this.f47349o0).mo14486a(c16155i, C11907S.f36188q0);
                return;
            case 2:
                Future future = (Future) this.f47348Z;
                if (future.isDone() || future.isCancelled()) {
                    return;
                }
                future.cancel(true);
                AbstractC11988o0.m13512g("BillingClient", "Async task is taking too long, cancel it!");
                Runnable runnable = (Runnable) this.f47349o0;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 3:
                C16149c c16149c2 = (C16149c) this.f47348Z;
                c16149c2.getClass();
                C16155i c16155i2 = AbstractC16144M.f50089l;
                c16149c2.m17756D(24, 11, c16155i2);
                ((C12749d) this.f47349o0).m14491a(c16155i2, null);
                return;
            case 4:
                C16149c c16149c3 = (C16149c) this.f47348Z;
                c16149c3.getClass();
                C16155i c16155i3 = AbstractC16144M.f50089l;
                c16149c3.m17756D(24, 7, c16155i3);
                ((C12748c) this.f47349o0).mo14487b(c16155i3, new ArrayList());
                return;
            case 5:
                C16149c c16149c4 = (C16149c) this.f47348Z;
                C16155i c16155i4 = (C16155i) this.f47349o0;
                if (((InterfaceC16165s) c16149c4.f50116e.f206o0) != null) {
                    ((InterfaceC16165s) c16149c4.f50116e.f206o0).onPurchasesUpdated(c16155i4, null);
                    return;
                } else {
                    AbstractC11988o0.m13512g("BillingClient", "No valid listener is set in BroadcastManager");
                    return;
                }
            case 6:
                C16149c c16149c5 = (C16149c) this.f47348Z;
                c16149c5.getClass();
                C16155i c16155i5 = AbstractC16144M.f50089l;
                c16149c5.m17756D(24, 3, c16155i5);
                ((C12746a) this.f47349o0).m14488c(c16155i5);
                return;
            case 7:
                C16149c c16149c6 = (C16149c) this.f47348Z;
                c16149c6.getClass();
                C16155i c16155i6 = AbstractC16144M.f50089l;
                c16149c6.m17756D(24, 13, c16155i6);
                ((C12747b) this.f47349o0).m14490a(c16155i6, null);
                return;
            case 8:
                ((C17450c) this.f47348Z).f55787Y = this.f47349o0;
                return;
            case 9:
                ((Application) this.f47348Z).unregisterActivityLifecycleCallbacks((C17450c) this.f47349o0);
                return;
            case 10:
                try {
                    Method method = AbstractC17451d.f55796d;
                    Object obj = this.f47349o0;
                    Object obj2 = this.f47348Z;
                    if (method != null) {
                        method.invoke(obj2, obj, Boolean.FALSE, "AppCompat recreation");
                    } else {
                        AbstractC17451d.f55797e.invoke(obj2, obj, Boolean.FALSE);
                    }
                    return;
                } catch (RuntimeException e10) {
                    if (e10.getClass() == RuntimeException.class && e10.getMessage() != null && e10.getMessage().startsWith("Unable to stop")) {
                        throw e10;
                    }
                    return;
                } catch (Throwable th3) {
                    AbstractC15256t.m16466d("ActivityRecreator", "Exception while invoking performStopActivity", th3);
                    return;
                }
            case 11:
                m16396a();
                return;
            case 12:
                m16397b();
                return;
            case 13:
                m16398c();
                return;
            case 14:
                RunnableC19440a runnableC19440a = (RunnableC19440a) this.f47349o0;
                Object obj3 = this.f47348Z;
                if (runnableC19440a.f61643o0.get()) {
                    C18650d c18650d = runnableC19440a.f61645q0;
                    if (c18650d.f59404h == runnableC19440a) {
                        SystemClock.uptimeMillis();
                        c18650d.f59404h = null;
                        c18650d.m20013b();
                    }
                } else {
                    C18650d c18650d2 = runnableC19440a.f61645q0;
                    if (c18650d2.f59403g != runnableC19440a) {
                        if (c18650d2.f59404h == runnableC19440a) {
                            SystemClock.uptimeMillis();
                            c18650d2.f59404h = null;
                            c18650d2.m20013b();
                        }
                    } else if (!c18650d2.f59399c) {
                        SystemClock.uptimeMillis();
                        c18650d2.f59403g = null;
                        C18871a c18871a = c18650d2.f59397a;
                        if (c18871a != null) {
                            if (Looper.myLooper() == Looper.getMainLooper()) {
                                c18871a.mo12122j(obj3);
                            } else {
                                c18871a.m12124k(obj3);
                            }
                        }
                    }
                }
                runnableC19440a.f61642Z = 3;
                return;
            case 15:
                AbstractC8154o0.m8714e((C20074r) this.f47348Z).resumeWith(AbstractC9233X.m9806b((Exception) this.f47349o0));
                return;
            case 16:
                C0042V0 c0042v0 = (C0042V0) this.f47349o0;
                C20171q c20171q = (C20171q) ((C20159e) c0042v0.f209r0).f63866v0.get((C20155a) c0042v0.f206o0);
                if (c20171q == null) {
                    return;
                }
                C19499b c19499b = (C19499b) this.f47348Z;
                if (!(c19499b.f61940Z == 0)) {
                    c20171q.m21004n(c19499b, null);
                    return;
                }
                c0042v0.f204Y = true;
                InterfaceC19818c interfaceC19818c = (InterfaceC19818c) c0042v0.f205Z;
                if (interfaceC19818c.mo13208m()) {
                    if (!c0042v0.f204Y || (interfaceC20488f = (InterfaceC20488f) c0042v0.f207p0) == null) {
                        return;
                    }
                    interfaceC19818c.mo13202f(interfaceC20488f, (Set) c0042v0.f208q0);
                    return;
                }
                try {
                    interfaceC19818c.mo13202f(null, interfaceC19818c.mo13198b());
                    return;
                } catch (SecurityException e11) {
                    AbstractC15256t.m16466d("GoogleApiManager", "Failed to get service from broker. ", e11);
                    interfaceC19818c.mo13199c("Failed to get service from broker.");
                    c20171q.m21004n(new C19499b(10), null);
                    return;
                }
            case 17:
                C13055g c13055g = (C13055g) this.f47348Z;
                C19499b c19499b2 = c13055g.f41483Z;
                boolean z6 = c19499b2.f61940Z == 0;
                BinderC20179y binderC20179y = (BinderC20179y) this.f47349o0;
                if (z6) {
                    C20498p c20498p = c13055g.f41484o0;
                    AbstractC20502t.m21157h(c20498p);
                    C19499b c19499b3 = c20498p.f65089o0;
                    if (c19499b3.f61940Z != 0) {
                        AbstractC15256t.m16485w("SignInCoordinator", "Sign-in succeeded with resolve account failure: ".concat(String.valueOf(c19499b3)), new Exception());
                        binderC20179y.f63919h.m222p(c19499b3);
                        binderC20179y.f63918g.mo13203g();
                        return;
                    }
                    C0042V0 c0042v1 = binderC20179y.f63919h;
                    IBinder iBinder = c20498p.f65088Z;
                    if (iBinder != null) {
                        int i10 = AbstractBinderC20483a.f65028b;
                        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                        c20482e = iInterfaceQueryLocalInterface instanceof InterfaceC20488f ? (InterfaceC20488f) iInterfaceQueryLocalInterface : new C20482E(iBinder, "com.google.android.gms.common.internal.IAccountAccessor", 2);
                    }
                    c0042v1.getClass();
                    if (c20482e == null || (set = binderC20179y.f63916e) == null) {
                        AbstractC15256t.m16485w("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
                        c0042v1.m222p(new C19499b(4));
                    } else {
                        c0042v1.f207p0 = c20482e;
                        c0042v1.f208q0 = set;
                        if (c0042v1.f204Y) {
                            ((InterfaceC19818c) c0042v1.f205Z).mo13202f(c20482e, set);
                        }
                    }
                } else {
                    binderC20179y.f63919h.m222p(c19499b2);
                }
                binderC20179y.f63918g.mo13203g();
                return;
            case 18:
                m16399d();
                return;
            case 19:
                FragmentC20153E fragmentC20153E = (FragmentC20153E) this.f47349o0;
                int i11 = fragmentC20153E.f63837Z;
                DialogInterfaceOnCancelListenerC20169o dialogInterfaceOnCancelListenerC20169o = (DialogInterfaceOnCancelListenerC20169o) this.f47348Z;
                if (i11 > 0) {
                    Bundle bundle = fragmentC20153E.f63838o0;
                    dialogInterfaceOnCancelListenerC20169o.mo13190c(bundle != null ? bundle.getBundle("ConnectionlessLifecycleHelper") : null);
                }
                if (fragmentC20153E.f63837Z >= 2) {
                    dialogInterfaceOnCancelListenerC20169o.mo13193f();
                }
                if (fragmentC20153E.f63837Z >= 3) {
                    dialogInterfaceOnCancelListenerC20169o.mo13191d();
                }
                if (fragmentC20153E.f63837Z >= 4) {
                    dialogInterfaceOnCancelListenerC20169o.mo13194g();
                    return;
                }
                return;
            case 20:
                C20154F c20154f = (C20154F) this.f47349o0;
                int i12 = c20154f.f63841i1;
                DialogInterfaceOnCancelListenerC20169o dialogInterfaceOnCancelListenerC20169o2 = (DialogInterfaceOnCancelListenerC20169o) this.f47348Z;
                if (i12 > 0) {
                    Bundle bundle2 = c20154f.f63842j1;
                    dialogInterfaceOnCancelListenerC20169o2.mo13190c(bundle2 != null ? bundle2.getBundle("ConnectionlessLifecycleHelper") : null);
                }
                if (c20154f.f63841i1 >= 2) {
                    dialogInterfaceOnCancelListenerC20169o2.mo13193f();
                }
                if (c20154f.f63841i1 >= 3) {
                    dialogInterfaceOnCancelListenerC20169o2.mo13191d();
                }
                if (c20154f.f63841i1 >= 4) {
                    dialogInterfaceOnCancelListenerC20169o2.mo13194g();
                    return;
                }
                return;
            case 21:
                AbstractC18610b abstractC18610b = (AbstractC18610b) ((C14438g) this.f47348Z).f45414Y;
                if (abstractC18610b != null) {
                    abstractC18610b.mo2478j((Typeface) this.f47349o0);
                    return;
                }
                return;
            default:
                ((C6772f) this.f47348Z).accept(this.f47349o0);
                return;
        }
    }

    public String toString() {
        String str;
        switch (this.f47347Y) {
            case 11:
                Runnable runnable = (Runnable) this.f47348Z;
                if (runnable != null) {
                    return "SequentialExecutorWorker{running=" + runnable + "}";
                }
                StringBuilder sb2 = new StringBuilder("SequentialExecutorWorker{state=");
                int i10 = ((ExecutorC17552i) this.f47349o0).f56153o0;
                if (i10 == 1) {
                    str = "IDLE";
                } else if (i10 == 2) {
                    str = "QUEUING";
                } else if (i10 != 3) {
                    str = i10 != 4 ? "null" : "RUNNING";
                } else {
                    str = "QUEUED";
                }
                sb2.append(str);
                sb2.append("}");
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ RunnableC15195M(Object obj, Object obj2, boolean z6, int i10) {
        this.f47347Y = i10;
        this.f47348Z = obj;
        this.f47349o0 = obj2;
    }

    public RunnableC15195M(ExecutorC17552i executorC17552i) {
        this.f47347Y = 11;
        this.f47349o0 = executorC17552i;
    }
}
