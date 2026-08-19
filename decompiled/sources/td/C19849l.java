package td;

import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p098Di.InterfaceC2062k;
import p775h2.AbstractC14376f;

/* JADX INFO: renamed from: td.l */
/* JADX INFO: loaded from: classes3.dex */
public final class C19849l implements InterfaceC2062k {

    /* JADX INFO: renamed from: a */
    public final boolean f62937a;

    /* JADX INFO: renamed from: b */
    public final List f62938b;

    /* JADX INFO: renamed from: c */
    public final String f62939c;

    /* JADX INFO: renamed from: d */
    public final boolean f62940d;

    public C19849l(String str, List list, boolean z6, boolean z10) {
        this.f62937a = z6;
        this.f62938b = list;
        this.f62939c = str;
        this.f62940d = z10;
    }

    /* JADX INFO: renamed from: e */
    public static C19849l m20779e(C19849l c19849l, List projects, String str, boolean z6, int i10) {
        boolean z10 = c19849l.f62937a;
        if ((i10 & 2) != 0) {
            projects = c19849l.f62938b;
        }
        if ((i10 & 4) != 0) {
            str = c19849l.f62939c;
        }
        if ((i10 & 8) != 0) {
            z6 = c19849l.f62940d;
        }
        c19849l.getClass();
        AbstractC16544l.m18094g(projects, "projects");
        return new C19849l(str, projects, z10, z6);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19849l)) {
            return false;
        }
        C19849l c19849l = (C19849l) obj;
        return this.f62937a == c19849l.f62937a && AbstractC16544l.m18089b(this.f62938b, c19849l.f62938b) && AbstractC16544l.m18089b(this.f62939c, c19849l.f62939c) && this.f62940d == c19849l.f62940d;
    }

    public final int hashCode() {
        int iM15858x = AbstractC14376f.m15858x(this.f62938b, (this.f62937a ? 1231 : 1237) * 31, 31);
        String str = this.f62939c;
        return ((iM15858x + (str == null ? 0 : str.hashCode())) * 31) + (this.f62940d ? 1231 : 1237);
    }

    public final String toString() {
        return "█";
    }
}
