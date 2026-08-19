package p015Ad;

import gd.C13969n2;
import gd.InterfaceC13849E;
import kotlin.jvm.internal.AbstractC16544l;
import p016Ae.C0452n;
import p041Be.C1219L;
import p092Dc.C1991h;
import p094De.C2029l;
import p248Jk.InterfaceC4473d;
import p876lm.InterfaceC17068a;
import p925oe.C18077B;

/* JADX INFO: renamed from: Ad.g */
/* JADX INFO: loaded from: classes3.dex */
public final class C0432g implements InterfaceC4473d {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1412a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC17068a f1413b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC17068a f1414c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC17068a f1415d;

    public C0432g(InterfaceC17068a apiService, InterfaceC17068a conversationsApi, InterfaceC17068a cache, int i10) {
        this.f1412a = i10;
        switch (i10) {
            case 1:
                AbstractC16544l.m18094g(apiService, "apiService");
                AbstractC16544l.m18094g(conversationsApi, "conversationsApi");
                AbstractC16544l.m18094g(cache, "cache");
                this.f1413b = apiService;
                this.f1414c = conversationsApi;
                this.f1415d = cache;
                break;
            default:
                AbstractC16544l.m18094g(apiService, "configurationManager");
                AbstractC16544l.m18094g(conversationsApi, "experimentManager");
                AbstractC16544l.m18094g(cache, "stringResolver");
                this.f1413b = apiService;
                this.f1414c = conversationsApi;
                this.f1415d = cache;
                break;
        }
    }

    @Override // p876lm.InterfaceC17068a
    public final Object get() {
        switch (this.f1412a) {
            case 0:
                Object obj = this.f1413b.get();
                AbstractC16544l.m18093f(obj, "get(...)");
                Object obj2 = this.f1414c.get();
                AbstractC16544l.m18093f(obj2, "get(...)");
                Object obj3 = this.f1415d.get();
                AbstractC16544l.m18093f(obj3, "get(...)");
                return new C0431f((C13969n2) obj, (InterfaceC13849E) obj2, (C1991h) obj3);
            default:
                Object obj4 = this.f1413b.get();
                AbstractC16544l.m18093f(obj4, "get(...)");
                Object obj5 = this.f1414c.get();
                AbstractC16544l.m18093f(obj5, "get(...)");
                Object obj6 = this.f1415d.get();
                AbstractC16544l.m18093f(obj6, "get(...)");
                return new C18077B((C0452n) obj4, (C1219L) obj5, (C2029l) obj6);
        }
    }
}
