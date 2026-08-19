package p675c6;

import java.util.HashSet;
import p520V5.C7781j;
import p520V5.C7794w;
import p520V5.EnumC7795x;
import p567X5.C9062l;
import p567X5.InterfaceC9053c;
import p698d6.AbstractC13029b;
import p779h6.AbstractC14413b;

/* JADX INFO: renamed from: c6.g */
/* JADX INFO: loaded from: classes.dex */
public final class C11672g implements InterfaceC11667b {

    /* JADX INFO: renamed from: a */
    public final int f35358a;

    /* JADX INFO: renamed from: b */
    public final boolean f35359b;

    public C11672g(String str, int i10, boolean z6) {
        this.f35358a = i10;
        this.f35359b = z6;
    }

    @Override // p675c6.InterfaceC11667b
    /* JADX INFO: renamed from: a */
    public final InterfaceC9053c mo12679a(C7794w c7794w, C7781j c7781j, AbstractC13029b abstractC13029b) {
        if (((HashSet) c7794w.f24674x0.f59414Z).contains(EnumC7795x.f24677Y)) {
            return new C9062l(this);
        }
        AbstractC14413b.m15913b("Animation contains merge paths but they are disabled.");
        return null;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("MergePaths{mode=");
        int i10 = this.f35358a;
        if (i10 == 1) {
            str = "MERGE";
        } else if (i10 == 2) {
            str = "ADD";
        } else if (i10 == 3) {
            str = "SUBTRACT";
        } else if (i10 != 4) {
            str = i10 != 5 ? "null" : "EXCLUDE_INTERSECTIONS";
        } else {
            str = "INTERSECT";
        }
        sb2.append(str);
        sb2.append('}');
        return sb2.toString();
    }
}
