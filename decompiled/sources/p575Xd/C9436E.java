package p575Xd;

import ao.C11131E;
import ao.C11158d;
import ao.C11164g;
import ao.C11181o0;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import p559Wn.InterfaceC8975g;
import p909nm.C17690x;
import p909nm.C17691y;

/* JADX INFO: renamed from: Xd.E */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C9436E {
    public static final C9435D Companion = new C9435D();

    /* JADX INFO: renamed from: c */
    public static final KSerializer[] f28419c;

    /* JADX INFO: renamed from: a */
    public final Set f28420a;

    /* JADX INFO: renamed from: b */
    public final Map f28421b;

    static {
        C11181o0 c11181o0 = C11181o0.f33827a;
        f28419c = new KSerializer[]{new C11158d(c11181o0, 2), new C11131E(c11181o0, C11164g.f33804a, 1)};
    }

    public /* synthetic */ C9436E(int i10, Set set, Map map) {
        this.f28420a = (i10 & 1) == 0 ? C17691y.f56482Y : set;
        if ((i10 & 2) == 0) {
            this.f28421b = C17690x.f56481Y;
        } else {
            this.f28421b = map;
        }
    }

    /* JADX INFO: renamed from: a */
    public final boolean m10001a(String url) {
        AbstractC16544l.m18094g(url, "url");
        if (this.f28420a.contains(url)) {
            return true;
        }
        Boolean bool = (Boolean) this.f28421b.get(url);
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9436E)) {
            return false;
        }
        C9436E c9436e = (C9436E) obj;
        return AbstractC16544l.m18089b(this.f28420a, c9436e.f28420a) && AbstractC16544l.m18089b(this.f28421b, c9436e.f28421b);
    }

    public final int hashCode() {
        return this.f28421b.hashCode() + (this.f28420a.hashCode() * 31);
    }

    public final String toString() {
        return "█";
    }

    public C9436E(Set conversationSafeUrls, Map streamModerationUrls) {
        AbstractC16544l.m18094g(conversationSafeUrls, "conversationSafeUrls");
        AbstractC16544l.m18094g(streamModerationUrls, "streamModerationUrls");
        this.f28420a = conversationSafeUrls;
        this.f28421b = streamModerationUrls;
    }

    public /* synthetic */ C9436E(int i10, Set set) {
        this((i10 & 1) != 0 ? C17691y.f56482Y : set, C17690x.f56481Y);
    }
}
