package com.revenuecat.purchases;

import java.io.File;
import kotlin.jvm.internal.AbstractC16544l;
import p049Bm.InterfaceC1436k;
import p1007s7.C19465d;
import p1007s7.C19467f;
import p1007s7.C19468g;
import p1020t7.C19807e;
import p1020t7.C19809g;
import p1020t7.InterfaceC19806d;
import p1058v7.C20476h;
import p178H.C3179x;
import p661b7.InterfaceC11256c;
import p758g0.C13775m0;

/* JADX INFO: renamed from: com.revenuecat.purchases.b */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC12675b implements Runnable {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f40408Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ boolean f40409Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ Object f40410o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ Object f40411p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ InterfaceC1436k f40412q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ Object f40413r0;

    public /* synthetic */ RunnableC12675b(Object obj, Object obj2, boolean z6, InterfaceC1436k interfaceC1436k, Object obj3, int i10) {
        this.f40408Y = i10;
        this.f40410o0 = obj;
        this.f40411p0 = obj2;
        this.f40409Z = z6;
        this.f40412q0 = interfaceC1436k;
        this.f40413r0 = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        File fileMo12596o;
        switch (this.f40408Y) {
            case 0:
                PostPendingTransactionsHelper.syncPendingPurchaseQueue$lambda$0((PostPendingTransactionsHelper) this.f40410o0, (String) this.f40411p0, this.f40409Z, this.f40412q0, (InterfaceC1436k) this.f40413r0);
                return;
            default:
                C19465d this$0 = (C19465d) this.f40410o0;
                InterfaceC19806d interfaceC19806d = (InterfaceC19806d) this.f40411p0;
                boolean z6 = this.f40409Z;
                C13775m0 c13775m0 = (C13775m0) this.f40412q0;
                C3179x c3179x = (C3179x) this.f40413r0;
                AbstractC16544l.m18094g(this$0, "this$0");
                synchronized (this$0.f61778w0) {
                    if (interfaceC19806d != null) {
                        try {
                            fileMo12596o = interfaceC19806d.mo12596o(z6);
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    } else {
                        fileMo12596o = null;
                    }
                    Object c19468g = (interfaceC19806d == null || fileMo12596o == null) ? new C19468g() : new C19467f(fileMo12596o, fileMo12596o != null ? interfaceC19806d.mo12595n(fileMo12596o) : null, (C20476h) this$0.f61771p0, (C19809g) this$0.f61772q0, (C19807e) this$0.f61775t0, (InterfaceC11256c) this$0.f61774s0);
                    c13775m0.invoke(c19468g);
                    if (c3179x != null) {
                        c3179x.m4026d(!(c19468g instanceof C19468g));
                    }
                    break;
                }
                return;
        }
    }
}
