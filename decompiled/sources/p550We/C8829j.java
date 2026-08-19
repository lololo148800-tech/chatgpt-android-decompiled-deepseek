package p550We;

import ao.AbstractC11153a0;
import ao.C11131E;
import ao.C11181o0;
import java.lang.annotation.Annotation;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import p559Wn.C8969a;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: We.j */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C8829j {
    public static final C8828i Companion = new C8828i();

    /* JADX INFO: renamed from: e */
    public static final KSerializer[] f27014e;

    /* JADX INFO: renamed from: a */
    public final String f27015a;

    /* JADX INFO: renamed from: b */
    public final EnumC8820a f27016b;

    /* JADX INFO: renamed from: c */
    public final Map f27017c;

    /* JADX INFO: renamed from: d */
    public final Map f27018d;

    static {
        C8969a c8969aM12382e = AbstractC11153a0.m12382e("com.openai.feature.gizmos.api.GizmoActionAuthStatus", EnumC8820a.values(), new String[]{"valid", "expired", "missing"}, new Annotation[][]{null, null, null});
        C11181o0 c11181o0 = C11181o0.f33827a;
        f27014e = new KSerializer[]{null, c8969aM12382e, new C11131E(c11181o0, AbstractC11153a0.m12382e("com.openai.feature.gizmos.api.GizmoActionStatus", EnumC8830k.values(), new String[]{"always_allow", "unset"}, new Annotation[][]{null, null}), 1), new C11131E(c11181o0, C8821b.f27007a, 1)};
    }

    public /* synthetic */ C8829j(int i10, String str, EnumC8820a enumC8820a, Map map, Map map2) {
        if (13 != (i10 & 13)) {
            AbstractC11153a0.m12389l(i10, 13, C8827h.f27013a.getDescriptor());
            throw null;
        }
        this.f27015a = str;
        if ((i10 & 2) == 0) {
            this.f27016b = null;
        } else {
            this.f27016b = enumC8820a;
        }
        this.f27017c = map;
        this.f27018d = map2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8829j)) {
            return false;
        }
        C8829j c8829j = (C8829j) obj;
        return AbstractC16544l.m18089b(this.f27015a, c8829j.f27015a) && this.f27016b == c8829j.f27016b && AbstractC16544l.m18089b(this.f27017c, c8829j.f27017c) && AbstractC16544l.m18089b(this.f27018d, c8829j.f27018d);
    }

    public final int hashCode() {
        int iHashCode = this.f27015a.hashCode() * 31;
        EnumC8820a enumC8820a = this.f27016b;
        int iHashCode2 = (iHashCode + (enumC8820a == null ? 0 : enumC8820a.hashCode())) * 31;
        Map map = this.f27017c;
        int iHashCode3 = (iHashCode2 + (map == null ? 0 : map.hashCode())) * 31;
        Map map2 = this.f27018d;
        return iHashCode3 + (map2 != null ? map2.hashCode() : 0);
    }

    public final String toString() {
        return "█";
    }

    public C8829j(String actionId, EnumC8820a enumC8820a, Map map, Map map2) {
        AbstractC16544l.m18094g(actionId, "actionId");
        this.f27015a = actionId;
        this.f27016b = enumC8820a;
        this.f27017c = map;
        this.f27018d = map2;
    }
}
