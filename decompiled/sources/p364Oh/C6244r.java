package p364Oh;

import ao.C11158d;
import ao.C11181o0;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import p559Wn.InterfaceC8975g;
import p909nm.C17689w;

/* JADX INFO: renamed from: Oh.r */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C6244r {
    public static final C6243q Companion = new C6243q();

    /* JADX INFO: renamed from: b */
    public static final KSerializer[] f20325b = {new C11158d(C11181o0.f33827a, 0)};

    /* JADX INFO: renamed from: a */
    public final List f20326a;

    public /* synthetic */ C6244r(int i10, List list) {
        if ((i10 & 1) == 0) {
            this.f20326a = C17689w.f56480Y;
        } else {
            this.f20326a = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C6244r) && AbstractC16544l.m18089b(this.f20326a, ((C6244r) obj).f20326a);
    }

    public final int hashCode() {
        return this.f20326a.hashCode();
    }

    public final String toString() {
        return "█";
    }

    public C6244r(List cookieHeaders) {
        AbstractC16544l.m18094g(cookieHeaders, "cookieHeaders");
        this.f20326a = cookieHeaders;
    }
}
