package p032B4;

import android.content.res.AssetManager;
import android.os.Build;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.AbstractC16544l;
import p001A.RunnableC0078o;
import p003A1.C0295v;
import p060C6.AbstractC1604a;
import p349O0.C5997d;
import p909nm.C17690x;
import p917o6.C17853f;
import p917o6.C17870w;
import p917o6.InterfaceC17835C;
import p917o6.InterfaceC17841I;
import p917o6.InterfaceC17842J;
import p953q0.C18561T;

/* JADX INFO: renamed from: B4.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0806a {

    /* JADX INFO: renamed from: a */
    public boolean f2235a;

    /* JADX INFO: renamed from: b */
    public final Object f2236b;

    /* JADX INFO: renamed from: c */
    public Object f2237c;

    /* JADX INFO: renamed from: d */
    public final Object f2238d;

    /* JADX INFO: renamed from: e */
    public Object f2239e;

    /* JADX INFO: renamed from: f */
    public final Object f2240f;

    /* JADX INFO: renamed from: g */
    public Object f2241g;

    /* JADX INFO: renamed from: h */
    public Object f2242h;

    public C0806a(int[] iArr, int[] iArr2, C0295v c0295v) {
        Integer numValueOf;
        this.f2236b = c0295v;
        this.f2237c = iArr;
        this.f2238d = C5997d.m6429P(m1840c(iArr));
        this.f2239e = iArr2;
        this.f2240f = C5997d.m6429P(m1841d(iArr, iArr2));
        if (iArr.length == 0) {
            numValueOf = null;
        } else {
            int i10 = iArr[0];
            int i11 = 1;
            int length = iArr.length - 1;
            if (1 <= length) {
                while (true) {
                    int i12 = iArr[i11];
                    i10 = i10 > i12 ? i12 : i10;
                    if (i11 == length) {
                        break;
                    } else {
                        i11++;
                    }
                }
            }
            numValueOf = Integer.valueOf(i10);
        }
        this.f2242h = new C18561T(numValueOf != null ? numValueOf.intValue() : 0, 90, RCHTTPStatusCodes.SUCCESS);
    }

    /* JADX INFO: renamed from: c */
    public static int m1840c(int[] iArr) {
        int i10 = Integer.MAX_VALUE;
        for (int i11 : iArr) {
            if (i11 <= 0) {
                return 0;
            }
            if (i10 > i11) {
                i10 = i11;
            }
        }
        if (i10 == Integer.MAX_VALUE) {
            return 0;
        }
        return i10;
    }

    /* JADX INFO: renamed from: d */
    public static int m1841d(int[] iArr, int[] iArr2) {
        int iM1840c = m1840c(iArr);
        int length = iArr2.length;
        int iMin = Integer.MAX_VALUE;
        for (int i10 = 0; i10 < length; i10++) {
            if (iArr[i10] == iM1840c) {
                iMin = Math.min(iMin, iArr2[i10]);
            }
        }
        if (iMin == Integer.MAX_VALUE) {
            return 0;
        }
        return iMin;
    }

    /* JADX INFO: renamed from: a */
    public void m1842a(InterfaceC17835C executionContext) {
        AbstractC16544l.m18094g(executionContext, "executionContext");
        this.f2242h = ((InterfaceC17835C) this.f2242h).mo4139b(executionContext);
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, java.util.List] */
    /* JADX INFO: renamed from: b */
    public C17853f m1843b() {
        UUID uuid = (UUID) this.f2237c;
        InterfaceC17841I interfaceC17841I = (InterfaceC17841I) this.f2238d;
        InterfaceC17835C interfaceC17835C = (InterfaceC17835C) this.f2242h;
        Map map = (Map) this.f2240f;
        if (map == null) {
            map = C17690x.f56481Y;
        }
        Map map2 = map;
        return new C17853f(uuid, (InterfaceC17842J) this.f2236b, interfaceC17841I, this.f2239e, (AbstractC1604a) this.f2241g, map2, interfaceC17835C, this.f2235a);
    }

    /* JADX INFO: renamed from: e */
    public FileInputStream m1844e(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e10) {
            String message = e10.getMessage();
            if (message != null && message.contains("compressed")) {
                ((InterfaceC0808c) this.f2237c).mo1847n();
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: f */
    public void m1845f(Serializable serializable, int i10) {
        ((Executor) this.f2236b).execute(new RunnableC0078o(this, i10, serializable, 4));
    }

    public C0806a(AssetManager assetManager, Executor executor, InterfaceC0808c interfaceC0808c, String str, File file) {
        this.f2235a = false;
        this.f2236b = executor;
        this.f2237c = interfaceC0808c;
        this.f2241g = str;
        this.f2240f = file;
        int i10 = Build.VERSION.SDK_INT;
        byte[] bArr = null;
        if (i10 >= 24) {
            if (i10 >= 31) {
                bArr = AbstractC0809d.f2255d;
            } else {
                switch (i10) {
                    case 24:
                    case 25:
                        bArr = AbstractC0809d.f2259h;
                        break;
                    case 26:
                        bArr = AbstractC0809d.f2258g;
                        break;
                    case 27:
                        bArr = AbstractC0809d.f2257f;
                        break;
                    case 28:
                    case 29:
                    case 30:
                        bArr = AbstractC0809d.f2256e;
                        break;
                }
            }
        }
        this.f2238d = bArr;
    }

    public C0806a(InterfaceC17842J operation, UUID requestUuid, InterfaceC17841I interfaceC17841I, List list, Map map, AbstractC1604a abstractC1604a) {
        AbstractC16544l.m18094g(operation, "operation");
        AbstractC16544l.m18094g(requestUuid, "requestUuid");
        this.f2236b = operation;
        this.f2237c = requestUuid;
        this.f2238d = interfaceC17841I;
        this.f2239e = list;
        this.f2240f = map;
        this.f2241g = abstractC1604a;
        this.f2242h = C17870w.f56967a;
    }
}
