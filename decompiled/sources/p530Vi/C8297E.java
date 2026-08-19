package p530Vi;

import com.segment.analytics.kotlin.core.C12777d;
import com.segment.analytics.kotlin.core.Settings;
import java.util.Set;
import kotlin.jvm.internal.AbstractC16544l;
import p1114xp.InterfaceC21331b;
import p228J.AbstractC3794B0;

/* JADX INFO: renamed from: Vi.E */
/* JADX INFO: loaded from: classes3.dex */
public final class C8297E implements InterfaceC21331b {
    public static final C12777d Companion = new C12777d();

    /* JADX INFO: renamed from: a */
    public final C8317m f25853a;

    /* JADX INFO: renamed from: b */
    public final Settings f25854b;

    /* JADX INFO: renamed from: c */
    public final boolean f25855c;

    /* JADX INFO: renamed from: d */
    public final Object f25856d;

    /* JADX INFO: renamed from: e */
    public final boolean f25857e;

    public C8297E(C8317m configuration, Settings settings, boolean z6, Set set, boolean z10) {
        AbstractC16544l.m18094g(configuration, "configuration");
        this.f25853a = configuration;
        this.f25854b = settings;
        this.f25855c = z6;
        this.f25856d = set;
        this.f25857e = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8297E)) {
            return false;
        }
        C8297E c8297e = (C8297E) obj;
        return AbstractC16544l.m18089b(this.f25853a, c8297e.f25853a) && AbstractC16544l.m18089b(this.f25854b, c8297e.f25854b) && this.f25855c == c8297e.f25855c && this.f25856d.equals(c8297e.f25856d) && this.f25857e == c8297e.f25857e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v4, types: [int] */
    /* JADX WARN: Type inference failed for: r1v9, types: [int] */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2 */
    public final int hashCode() {
        int iHashCode = this.f25853a.hashCode() * 31;
        Settings settings = this.f25854b;
        int iHashCode2 = (iHashCode + (settings == null ? 0 : settings.hashCode())) * 31;
        boolean z6 = this.f25855c;
        ?? r6 = z6;
        if (z6) {
            r6 = 1;
        }
        int iHashCode3 = (this.f25856d.hashCode() + ((iHashCode2 + r6) * 31)) * 31;
        boolean z10 = this.f25857e;
        return iHashCode3 + (z10 ? 1 : z10);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("System(configuration=");
        sb2.append(this.f25853a);
        sb2.append(", settings=");
        sb2.append(this.f25854b);
        sb2.append(", running=");
        sb2.append(this.f25855c);
        sb2.append(", initializedPlugins=");
        sb2.append(this.f25856d);
        sb2.append(", enabled=");
        return AbstractC3794B0.m4499x(sb2, this.f25857e, ')');
    }
}
