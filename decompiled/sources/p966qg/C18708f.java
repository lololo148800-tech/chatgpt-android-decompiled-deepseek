package p966qg;

import ao.C11158d;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import p559Wn.InterfaceC8975g;
import p909nm.C17689w;

/* JADX INFO: renamed from: qg.f */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C18708f {
    public static final C18707e Companion = new C18707e();

    /* JADX INFO: renamed from: b */
    public static final KSerializer[] f59537b = {new C11158d(C18703a.f59528a, 0)};

    /* JADX INFO: renamed from: a */
    public final List f59538a;

    public /* synthetic */ C18708f(int i10, List list) {
        if ((i10 & 1) == 0) {
            this.f59538a = C17689w.f56480Y;
        } else {
            this.f59538a = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C18708f) && AbstractC16544l.m18089b(this.f59538a, ((C18708f) obj).f59538a);
    }

    public final int hashCode() {
        return this.f59538a.hashCode();
    }

    public final String toString() {
        return "█";
    }
}
