package p530Vi;

import android.content.Context;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import p025An.C0611f0;
import p049Bm.InterfaceC1426a;
import p1114xp.C21346q;
import p117Eb.C2392v;
import p458Si.C7141c;
import p458Si.C7142d;
import p554Wi.C8884k;

/* JADX INFO: renamed from: Vi.g */
/* JADX INFO: loaded from: classes3.dex */
public final class C8311g extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f25898Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C8312h f25899Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8311g(C8312h c8312h, int i10) {
        super(0);
        this.f25898Y = i10;
        this.f25899Z = c8312h;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        switch (this.f25898Y) {
            case 0:
                C8312h c8312h = this.f25899Z;
                C8317m c8317m = c8312h.f25902Y;
                C7142d c7142d = c8317m.f25917c;
                C2392v c2392v = c8312h.f25903Z;
                C0611f0 ioDispatcher = (C0611f0) c2392v.f7440r0;
                Object application = c8317m.f25916b;
                AbstractC16544l.m18091d(application);
                C8312h analytics = this.f25899Z;
                String writeKey = c8317m.f25915a;
                C21346q store = (C21346q) c2392v.f7436Z;
                c7142d.getClass();
                AbstractC16544l.m18094g(analytics, "analytics");
                AbstractC16544l.m18094g(store, "store");
                AbstractC16544l.m18094g(writeKey, "writeKey");
                AbstractC16544l.m18094g(ioDispatcher, "ioDispatcher");
                AbstractC16544l.m18094g(application, "application");
                return new C7141c((Context) application, store, writeKey, ioDispatcher);
            default:
                C8884k c8884k = new C8884k();
                C8312h c8312h2 = this.f25899Z;
                AbstractC16544l.m18094g(c8312h2, "<set-?>");
                c8884k.f27193b = c8312h2;
                return c8884k;
        }
    }
}
