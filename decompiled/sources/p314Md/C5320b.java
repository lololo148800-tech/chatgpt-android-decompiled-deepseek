package p314Md;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.internal.AbstractC16544l;
import p1071w0.AbstractC20734X;
import p1155zi.C21984a1;
import p216Id.EnumC3703k;
import p381Pe.C6394e;
import p479Td.C7351f0;
import p479Td.EnumC7359j0;
import p775h2.AbstractC14376f;
import p909nm.AbstractC17680n;

/* JADX INFO: renamed from: Md.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C5320b {

    /* JADX INFO: renamed from: a */
    public final C7351f0 f17505a;

    /* JADX INFO: renamed from: b */
    public final List f17506b;

    /* JADX INFO: renamed from: c */
    public final String f17507c;

    /* JADX INFO: renamed from: d */
    public final C6394e f17508d;

    /* JADX INFO: renamed from: e */
    public final EnumC3703k f17509e;

    public C5320b(C7351f0 c7351f0, List list, String str, C6394e messageTree, EnumC3703k enumC3703k) {
        AbstractC16544l.m18094g(messageTree, "messageTree");
        this.f17505a = c7351f0;
        this.f17506b = list;
        this.f17507c = str;
        this.f17508d = messageTree;
        this.f17509e = enumC3703k;
    }

    /* JADX INFO: renamed from: a */
    public static C5320b m5878a(C5320b c5320b, String text, boolean z6, int i10) {
        EnumC7359j0 enumC7359j0 = EnumC7359j0.f23346q0;
        boolean z10 = (i10 & 4) != 0 ? false : z6;
        c5320b.getClass();
        AbstractC16544l.m18094g(text, "text");
        C21984a1.Companion.getClass();
        String string = UUID.randomUUID().toString();
        AbstractC16544l.m18093f(string, "toString(...)");
        C7351f0 c7351f0 = c5320b.f17505a;
        ArrayList arrayListM19362l0 = AbstractC17680n.m19362l0(c5320b.f17506b, new C7351f0(string, c7351f0.f23288c, text, c7351f0.f23292g, c7351f0.f23301p, null, null, null, enumC7359j0, null, z10, null, false, 27616));
        C6394e messageTree = c5320b.f17508d;
        AbstractC16544l.m18094g(messageTree, "messageTree");
        return new C5320b(c7351f0, arrayListM19362l0, c5320b.f17507c, messageTree, c5320b.f17509e);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x002c  */
    public final boolean equals(Object obj) {
        boolean zM18089b;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5320b)) {
            return false;
        }
        C5320b c5320b = (C5320b) obj;
        if (!AbstractC16544l.m18089b(this.f17505a, c5320b.f17505a) || !AbstractC16544l.m18089b(this.f17506b, c5320b.f17506b)) {
            return false;
        }
        String str = this.f17507c;
        String str2 = c5320b.f17507c;
        if (str == null) {
            if (str2 == null) {
                zM18089b = true;
            } else {
                zM18089b = false;
            }
        } else if (str2 == null) {
            zM18089b = false;
        } else {
            zM18089b = AbstractC16544l.m18089b(str, str2);
        }
        return zM18089b && AbstractC16544l.m18089b(this.f17508d, c5320b.f17508d) && this.f17509e == c5320b.f17509e;
    }

    public final int hashCode() {
        int iM15858x = AbstractC14376f.m15858x(this.f17506b, this.f17505a.hashCode() * 31, 31);
        String str = this.f17507c;
        return this.f17509e.hashCode() + AbstractC20734X.m21250u((iM15858x + (str == null ? 0 : str.hashCode())) * 31, 31, this.f17508d.f20814b);
    }

    public final String toString() {
        return "█";
    }
}
