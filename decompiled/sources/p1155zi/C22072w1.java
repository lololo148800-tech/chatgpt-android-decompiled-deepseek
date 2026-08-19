package p1155zi;

import ao.AbstractC11153a0;
import ao.C11158d;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import p003A1.AbstractC0168G;
import p559Wn.InterfaceC8975g;
import p909nm.AbstractC17681o;

/* JADX INFO: renamed from: zi.w1 */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C22072w1 {
    public static final C22044p1 Companion = new C22044p1();

    /* JADX INFO: renamed from: e */
    public static final KSerializer[] f69782e = {null, EnumC22040o1.Companion.serializer(), null, new C11158d(C22048q1.f69737a, 0)};

    /* JADX INFO: renamed from: f */
    public static final List f69783f;

    /* JADX INFO: renamed from: a */
    public final String f69784a;

    /* JADX INFO: renamed from: b */
    public final EnumC22040o1 f69785b;

    /* JADX INFO: renamed from: c */
    public final String f69786c;

    /* JADX INFO: renamed from: d */
    public final List f69787d;

    static {
        EnumC22060t1 enumC22060t1 = EnumC22060t1.Push;
        C22068v1 c22068v1 = new C22068v1("Push", enumC22060t1, true);
        EnumC22060t1 enumC22060t2 = EnumC22060t1.Email;
        f69783f = AbstractC17681o.m19382k(new C22072w1("Limit Resets", EnumC22040o1.LimitResets, "Get notified when your limits reset", AbstractC17681o.m19382k(c22068v1, new C22068v1("Email", enumC22060t2, false))), new C22072w1("Tasks", EnumC22040o1.Tasks, "Get notified when tasks are available", AbstractC17681o.m19382k(new C22068v1("Push", enumC22060t1, true), new C22068v1("Email", enumC22060t2, true))), new C22072w1("Recommendations", EnumC22040o1.Recommendations, "Get notified when recommendations are available", AbstractC17681o.m19382k(new C22068v1("Push", enumC22060t1, false), new C22068v1("Email", enumC22060t2, false))));
    }

    public /* synthetic */ C22072w1(int i10, String str, EnumC22040o1 enumC22040o1, String str2, List list) {
        if (15 != (i10 & 15)) {
            AbstractC11153a0.m12389l(i10, 15, C22028l1.f69689a.getDescriptor());
            throw null;
        }
        this.f69784a = str;
        this.f69785b = enumC22040o1;
        this.f69786c = str2;
        this.f69787d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C22072w1)) {
            return false;
        }
        C22072w1 c22072w1 = (C22072w1) obj;
        return AbstractC16544l.m18089b(this.f69784a, c22072w1.f69784a) && this.f69785b == c22072w1.f69785b && AbstractC16544l.m18089b(this.f69786c, c22072w1.f69786c) && AbstractC16544l.m18089b(this.f69787d, c22072w1.f69787d);
    }

    public final int hashCode() {
        return this.f69787d.hashCode() + AbstractC0168G.m527p((this.f69785b.hashCode() + (this.f69784a.hashCode() * 31)) * 31, 31, this.f69786c);
    }

    public final String toString() {
        return "█";
    }

    public C22072w1(String str, EnumC22040o1 enumC22040o1, String str2, List list) {
        this.f69784a = str;
        this.f69785b = enumC22040o1;
        this.f69786c = str2;
        this.f69787d = list;
    }
}
