package p1057v6;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17314q;
import p001A.C0017I0;
import p049Bm.InterfaceC1426a;
import p1076w6.C20848f;
import p228J.AbstractC3812N;
import p909nm.AbstractC17660E;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17682p;
import p909nm.C17689w;

/* JADX INFO: renamed from: v6.d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C20464d implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f64959Y = 1;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ Collection f64960Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C20461a f64961o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ Object f64962p0;

    public /* synthetic */ C20464d(C0017I0 c0017i0, Collection collection, C20461a c20461a) {
        this.f64962p0 = c0017i0;
        this.f64960Z = collection;
        this.f64961o0 = c20461a;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        switch (this.f64959Y) {
            case 0:
                Collection keys = this.f64960Z;
                AbstractC16544l.m18094g(keys, "$keys");
                C20466f this$0 = (C20466f) this.f64962p0;
                AbstractC16544l.m18094g(this$0, "this$0");
                C20461a cacheHeaders = this.f64961o0;
                AbstractC16544l.m18094g(cacheHeaders, "$cacheHeaders");
                Collection collection = keys;
                int iM19257b = AbstractC17660E.m19257b(AbstractC17682p.m19389r(collection, 10));
                if (iM19257b < 16) {
                    iM19257b = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iM19257b);
                for (Object obj : collection) {
                    linkedHashMap.put(obj, this$0.m21111Q((String) obj, cacheHeaders));
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    if (((C20468h) entry.getValue()) == null) {
                        linkedHashMap2.put(entry.getKey(), entry.getValue());
                    }
                }
                Set setKeySet = linkedHashMap2.keySet();
                AbstractC3812N abstractC3812N = (AbstractC3812N) this$0.f11539Z;
                Collection<C20468h> collectionMo4517H = abstractC3812N != null ? abstractC3812N.mo4517H(setKeySet, cacheHeaders) : null;
                if (collectionMo4517H == null) {
                    collectionMo4517H = C17689w.f56480Y;
                }
                for (C20468h c20468h : collectionMo4517H) {
                    this$0.f64969q0.m21444b(c20468h.f64972Y, new C20465e(c20468h, this$0.f64967o0));
                }
                return AbstractC17680n.m19361k0(collectionMo4517H, AbstractC17680n.m19339O(linkedHashMap.values()));
            default:
                C0017I0 this$1 = (C0017I0) this.f64962p0;
                AbstractC16544l.m18094g(this$1, "this$0");
                Collection records = this.f64960Z;
                AbstractC16544l.m18094g(records, "$records");
                C20461a cacheHeaders2 = this.f64961o0;
                AbstractC16544l.m18094g(cacheHeaders2, "$cacheHeaders");
                return ((C20848f) ((C17314q) this$1.f68q0).getValue()).mo4518I(records, cacheHeaders2);
        }
    }

    public /* synthetic */ C20464d(Collection collection, C20466f c20466f, C20461a c20461a) {
        this.f64960Z = collection;
        this.f64962p0 = c20466f;
        this.f64961o0 = c20461a;
    }
}
