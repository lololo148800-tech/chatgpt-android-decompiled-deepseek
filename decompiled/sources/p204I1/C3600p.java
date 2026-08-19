package p204I1;

import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1426a;
import p117Eb.C2392v;
import p909nm.AbstractC17681o;

/* JADX INFO: renamed from: I1.p */
/* JADX INFO: loaded from: classes.dex */
public final class C3600p extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f10966Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C2392v f10967Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3600p(C2392v c2392v, int i10) {
        super(0);
        this.f10966Y = i10;
        this.f10967Z = c2392v;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        Object obj;
        Object obj2;
        switch (this.f10966Y) {
            case 0:
                ArrayList arrayList = (ArrayList) this.f10967Z.f7440r0;
                if (arrayList.isEmpty()) {
                    obj = null;
                } else {
                    Object obj3 = arrayList.get(0);
                    float fM4882b = ((C3602r) obj3).f10975a.f21205u0.m4882b();
                    int iM19381j = AbstractC17681o.m19381j(arrayList);
                    int i10 = 1;
                    if (1 <= iM19381j) {
                        while (true) {
                            Object obj4 = arrayList.get(i10);
                            float fM4882b2 = ((C3602r) obj4).f10975a.f21205u0.m4882b();
                            if (Float.compare(fM4882b, fM4882b2) < 0) {
                                obj3 = obj4;
                                fM4882b = fM4882b2;
                            }
                            if (i10 != iM19381j) {
                                i10++;
                            }
                        }
                    }
                    obj = obj3;
                }
                C3602r c3602r = (C3602r) obj;
                return Float.valueOf(c3602r != null ? c3602r.f10975a.f21205u0.m4882b() : 0.0f);
            default:
                ArrayList arrayList2 = (ArrayList) this.f10967Z.f7440r0;
                if (arrayList2.isEmpty()) {
                    obj2 = null;
                } else {
                    Object obj5 = arrayList2.get(0);
                    float fMo3546c = ((C3602r) obj5).f10975a.mo3546c();
                    int iM19381j2 = AbstractC17681o.m19381j(arrayList2);
                    int i11 = 1;
                    if (1 <= iM19381j2) {
                        while (true) {
                            Object obj6 = arrayList2.get(i11);
                            float fMo3546c2 = ((C3602r) obj6).f10975a.mo3546c();
                            if (Float.compare(fMo3546c, fMo3546c2) < 0) {
                                obj5 = obj6;
                                fMo3546c = fMo3546c2;
                            }
                            if (i11 != iM19381j2) {
                                i11++;
                            }
                        }
                    }
                    obj2 = obj5;
                }
                C3602r c3602r2 = (C3602r) obj2;
                return Float.valueOf(c3602r2 != null ? c3602r2.f10975a.mo3546c() : 0.0f);
        }
    }
}
