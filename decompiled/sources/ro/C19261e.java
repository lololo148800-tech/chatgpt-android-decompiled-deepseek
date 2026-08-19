package ro;

import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC16544l;
import mo.C17327D;
import mo.C17358y;
import mo.InterfaceC17350q;
import mo.InterfaceC17351r;
import p005A3.C0326m;
import p974qo.C18788d;
import p974qo.C18792h;

/* JADX INFO: renamed from: ro.e */
/* JADX INFO: loaded from: classes2.dex */
public final class C19261e implements InterfaceC17350q {

    /* JADX INFO: renamed from: a */
    public final C18792h f61053a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f61054b;

    /* JADX INFO: renamed from: c */
    public final int f61055c;

    /* JADX INFO: renamed from: d */
    public final C0326m f61056d;

    /* JADX INFO: renamed from: e */
    public final C17358y f61057e;

    /* JADX INFO: renamed from: f */
    public final int f61058f;

    /* JADX INFO: renamed from: g */
    public final int f61059g;

    /* JADX INFO: renamed from: h */
    public final int f61060h;

    /* JADX INFO: renamed from: i */
    public int f61061i;

    public C19261e(C18792h call, ArrayList arrayList, int i10, C0326m c0326m, C17358y request, int i11, int i12, int i13) {
        AbstractC16544l.m18094g(call, "call");
        AbstractC16544l.m18094g(request, "request");
        this.f61053a = call;
        this.f61054b = arrayList;
        this.f61055c = i10;
        this.f61056d = c0326m;
        this.f61057e = request;
        this.f61058f = i11;
        this.f61059g = i12;
        this.f61060h = i13;
    }

    /* JADX INFO: renamed from: a */
    public static C19261e m20334a(C19261e c19261e, int i10, C0326m c0326m, C17358y c17358y, int i11) {
        if ((i11 & 1) != 0) {
            i10 = c19261e.f61055c;
        }
        int i12 = i10;
        if ((i11 & 2) != 0) {
            c0326m = c19261e.f61056d;
        }
        C0326m c0326m2 = c0326m;
        if ((i11 & 4) != 0) {
            c17358y = c19261e.f61057e;
        }
        C17358y request = c17358y;
        int i13 = c19261e.f61058f;
        int i14 = c19261e.f61059g;
        int i15 = c19261e.f61060h;
        c19261e.getClass();
        AbstractC16544l.m18094g(request, "request");
        return new C19261e(c19261e.f61053a, c19261e.f61054b, i12, c0326m2, request, i13, i14, i15);
    }

    /* JADX INFO: renamed from: b */
    public final C17327D m20335b(C17358y request) {
        AbstractC16544l.m18094g(request, "request");
        ArrayList arrayList = this.f61054b;
        int size = arrayList.size();
        int i10 = this.f61055c;
        if (i10 >= size) {
            throw new IllegalStateException("Check failed.");
        }
        this.f61061i++;
        C0326m c0326m = this.f61056d;
        if (c0326m != null) {
            if (!((C18788d) c0326m.f1141c).m20057b(request.f55379a)) {
                throw new IllegalStateException(("network interceptor " + arrayList.get(i10 - 1) + " must retain the same host and port").toString());
            }
            if (this.f61061i != 1) {
                throw new IllegalStateException(("network interceptor " + arrayList.get(i10 - 1) + " must call proceed() exactly once").toString());
            }
        }
        int i11 = i10 + 1;
        C19261e c19261eM20334a = m20334a(this, i11, null, request, 58);
        InterfaceC17351r interfaceC17351r = (InterfaceC17351r) arrayList.get(i10);
        C17327D c17327dIntercept = interfaceC17351r.intercept(c19261eM20334a);
        if (c17327dIntercept == null) {
            throw new NullPointerException("interceptor " + interfaceC17351r + " returned null");
        }
        if (c0326m != null && i11 < arrayList.size() && c19261eM20334a.f61061i != 1) {
            throw new IllegalStateException(("network interceptor " + interfaceC17351r + " must call proceed() exactly once").toString());
        }
        if (c17327dIntercept.f55179s0 != null) {
            return c17327dIntercept;
        }
        throw new IllegalStateException(("interceptor " + interfaceC17351r + " returned a response with no body").toString());
    }
}
