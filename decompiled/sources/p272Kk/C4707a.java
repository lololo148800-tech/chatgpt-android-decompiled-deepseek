package p272Kk;

import java.net.URLEncoder;
import p078Co.InterfaceC1760b;
import p1113xn.C21307a;
import p523V9.AbstractC8168p6;

/* JADX INFO: renamed from: Kk.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C4707a implements InterfaceC1760b {

    /* JADX INFO: renamed from: a */
    public static final C4707a f15303a = new C4707a();

    @Override // p078Co.InterfaceC1760b
    /* JADX INFO: renamed from: d */
    public final Object mo2570d(Object obj, Object obj2) {
        String strM8750c = AbstractC8168p6.m8750c(obj);
        if (strM8750c != null) {
            return URLEncoder.encode(strM8750c, C21307a.f67720a.name());
        }
        return null;
    }
}
