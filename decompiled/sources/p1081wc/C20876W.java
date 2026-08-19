package p1081wc;

import kotlin.jvm.internal.AbstractC16544l;
import p248Jk.InterfaceC4473d;
import p876lm.InterfaceC17068a;

/* JADX INFO: renamed from: wc.W */
/* JADX INFO: loaded from: classes3.dex */
public final class C20876W implements InterfaceC4473d {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f66458a;

    /* JADX INFO: renamed from: b */
    public final C20884c f66459b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC17068a f66460c;

    public C20876W(C20884c c20884c, InterfaceC17068a segmentAnalyticsService, int i10) {
        this.f66458a = i10;
        switch (i10) {
            case 1:
                AbstractC16544l.m18094g(segmentAnalyticsService, "segmentAnalyticsService");
                this.f66459b = c20884c;
                this.f66460c = segmentAnalyticsService;
                break;
            case 2:
                AbstractC16544l.m18094g(segmentAnalyticsService, "statsigAnalyticsService");
                this.f66459b = c20884c;
                this.f66460c = segmentAnalyticsService;
                break;
            default:
                AbstractC16544l.m18094g(segmentAnalyticsService, "analyticsService");
                this.f66459b = c20884c;
                this.f66460c = segmentAnalyticsService;
                break;
        }
    }

    @Override // p876lm.InterfaceC17068a
    public final Object get() {
        switch (this.f66458a) {
            case 0:
                Object obj = this.f66460c.get();
                AbstractC16544l.m18093f(obj, "get(...)");
                InterfaceC20904w interfaceC20904w = (InterfaceC20904w) obj;
                C20884c module = this.f66459b;
                AbstractC16544l.m18094g(module, "module");
                return interfaceC20904w;
            case 1:
                Object obj2 = this.f66460c.get();
                AbstractC16544l.m18093f(obj2, "get(...)");
                C20879Z c20879z = (C20879Z) obj2;
                C20884c module2 = this.f66459b;
                AbstractC16544l.m18094g(module2, "module");
                return c20879z;
            default:
                Object obj3 = this.f66460c.get();
                AbstractC16544l.m18093f(obj3, "get(...)");
                C20881a0 c20881a0 = (C20881a0) obj3;
                C20884c module3 = this.f66459b;
                AbstractC16544l.m18094g(module3, "module");
                return c20881a0;
        }
    }
}
