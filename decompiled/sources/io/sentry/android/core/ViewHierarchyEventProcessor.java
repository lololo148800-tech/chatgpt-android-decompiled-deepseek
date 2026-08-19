package io.sentry.android.core;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.compose.p650ui.node.Owner;
import io.sentry.C15108A1;
import io.sentry.C15180a;
import io.sentry.C15347d1;
import io.sentry.C15516w;
import io.sentry.EnumC15375i1;
import io.sentry.InterfaceC15127H;
import io.sentry.InterfaceC15472s;
import io.sentry.android.core.internal.util.C15232d;
import io.sentry.compose.viewhierarchy.ComposeViewHierarchyExporter;
import io.sentry.protocol.C15421A;
import io.sentry.protocol.C15426F;
import io.sentry.protocol.C15427G;
import io.sentry.util.thread.InterfaceC15505a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p109E3.RunnableC2301y;
import p544W9.AbstractC8465D3;
import p544W9.AbstractC8471E3;
import p544W9.AbstractC8483G3;
import p544W9.AbstractC8686o3;
import p544W9.AbstractC8692p3;
import p658b5.C11234e;

/* JADX INFO: loaded from: classes3.dex */
public final class ViewHierarchyEventProcessor implements InterfaceC15472s {

    /* JADX INFO: renamed from: Y */
    public final SentryAndroidOptions f47416Y;

    /* JADX INFO: renamed from: Z */
    public final C15232d f47417Z;

    public ViewHierarchyEventProcessor(SentryAndroidOptions sentryAndroidOptions) {
        AbstractC8483G3.m9133c(sentryAndroidOptions, "SentryAndroidOptions is required");
        this.f47416Y = sentryAndroidOptions;
        this.f47417Z = new C15232d(2000L, 3);
        if (sentryAndroidOptions.isAttachViewHierarchy()) {
            AbstractC8471E3.m9104b("ViewHierarchy");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static void m16414b(View view, C15427G c15427g, List list) {
        if (view instanceof ViewGroup) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ComposeViewHierarchyExporter composeViewHierarchyExporter = (ComposeViewHierarchyExporter) it.next();
                composeViewHierarchyExporter.getClass();
                if (view instanceof Owner) {
                    if (composeViewHierarchyExporter.f47899b == null) {
                        synchronized (composeViewHierarchyExporter) {
                            try {
                                if (composeViewHierarchyExporter.f47899b == null) {
                                    composeViewHierarchyExporter.f47899b = new C11234e(composeViewHierarchyExporter.f47898a);
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    }
                    ComposeViewHierarchyExporter.m16567a(composeViewHierarchyExporter.f47899b, c15427g, null, ((Owner) view).getRoot());
                    return;
                }
            }
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            if (childCount == 0) {
                return;
            }
            ArrayList arrayList = new ArrayList(childCount);
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = viewGroup.getChildAt(i10);
                if (childAt != null) {
                    C15427G c15427gM16415c = m16415c(childAt);
                    arrayList.add(c15427gM16415c);
                    m16414b(childAt, c15427gM16415c, list);
                }
            }
            c15427g.f48084w0 = arrayList;
        }
    }

    /* JADX INFO: renamed from: c */
    public static C15427G m16415c(View view) {
        C15427G c15427g = new C15427G();
        c15427g.f48075Z = AbstractC8692p3.m9388a(view);
        try {
            c15427g.f48076o0 = AbstractC8686o3.m9384c(view);
        } catch (Throwable unused) {
        }
        c15427g.f48080s0 = Double.valueOf(view.getX());
        c15427g.f48081t0 = Double.valueOf(view.getY());
        c15427g.f48078q0 = Double.valueOf(view.getWidth());
        c15427g.f48079r0 = Double.valueOf(view.getHeight());
        c15427g.f48083v0 = Double.valueOf(view.getAlpha());
        int visibility = view.getVisibility();
        if (visibility == 0) {
            c15427g.f48082u0 = "visible";
        } else if (visibility == 4) {
            c15427g.f48082u0 = "invisible";
        } else if (visibility == 8) {
            c15427g.f48082u0 = "gone";
        }
        return c15427g;
    }

    @Override // io.sentry.InterfaceC15472s
    /* JADX INFO: renamed from: a */
    public final C15108A1 mo16376a(C15108A1 c15108a1, C15516w c15516w) {
        return c15108a1;
    }

    @Override // io.sentry.InterfaceC15472s
    /* JADX INFO: renamed from: e */
    public final C15347d1 mo16380e(C15347d1 c15347d1, C15516w c15516w) {
        if (!c15347d1.m16576e()) {
            return c15347d1;
        }
        SentryAndroidOptions sentryAndroidOptions = this.f47416Y;
        if (!sentryAndroidOptions.isAttachViewHierarchy()) {
            sentryAndroidOptions.getLogger().mo16298o(EnumC15375i1.DEBUG, "attachViewHierarchy is disabled.", new Object[0]);
            return c15347d1;
        }
        if (AbstractC8465D3.m9091e(c15516w)) {
            return c15347d1;
        }
        boolean zM16440a = this.f47417Z.m16440a();
        sentryAndroidOptions.getBeforeViewHierarchyCaptureCallback();
        if (zM16440a) {
            return c15347d1;
        }
        WeakReference weakReference = (WeakReference) C15184B.f47304b.f47305a;
        C15426F c15426f = null;
        Activity activity = weakReference != null ? (Activity) weakReference.get() : null;
        List<ComposeViewHierarchyExporter> viewHierarchyExporters = sentryAndroidOptions.getViewHierarchyExporters();
        InterfaceC15505a mainThreadChecker = sentryAndroidOptions.getMainThreadChecker();
        InterfaceC15127H logger = sentryAndroidOptions.getLogger();
        if (activity == null) {
            logger.mo16298o(EnumC15375i1.INFO, "Missing activity for view hierarchy snapshot.", new Object[0]);
        } else {
            Window window = activity.getWindow();
            if (window == null) {
                logger.mo16298o(EnumC15375i1.INFO, "Missing window for view hierarchy snapshot.", new Object[0]);
            } else {
                View viewPeekDecorView = window.peekDecorView();
                if (viewPeekDecorView == null) {
                    logger.mo16298o(EnumC15375i1.INFO, "Missing decor view for view hierarchy snapshot.", new Object[0]);
                } else {
                    try {
                        if (mainThreadChecker.mo16438a()) {
                            ArrayList arrayList = new ArrayList(1);
                            C15426F c15426f2 = new C15426F("android_view_system", arrayList);
                            C15427G c15427gM16415c = m16415c(viewPeekDecorView);
                            arrayList.add(c15427gM16415c);
                            m16414b(viewPeekDecorView, c15427gM16415c, viewHierarchyExporters);
                            c15426f = c15426f2;
                        } else {
                            CountDownLatch countDownLatch = new CountDownLatch(1);
                            AtomicReference atomicReference = new AtomicReference(null);
                            activity.runOnUiThread(new RunnableC2301y(atomicReference, viewPeekDecorView, viewHierarchyExporters, countDownLatch, logger, 2));
                            if (countDownLatch.await(1000L, TimeUnit.MILLISECONDS)) {
                                c15426f = (C15426F) atomicReference.get();
                            }
                        }
                    } catch (Throwable th2) {
                        logger.mo16297h(EnumC15375i1.ERROR, "Failed to process view hierarchy.", th2);
                    }
                }
            }
        }
        if (c15426f != null) {
            c15516w.f48469d = new C15180a(c15426f);
        }
        return c15347d1;
    }

    @Override // io.sentry.InterfaceC15472s
    /* JADX INFO: renamed from: k */
    public final C15421A mo16381k(C15421A c15421a, C15516w c15516w) {
        return c15421a;
    }
}
