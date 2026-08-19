package p1042uh;

import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC16544l;
import p003A1.AbstractC0168G;
import p1107xh.EnumC21216F;
import p324Mn.C5551u;
import p917o6.InterfaceC17873z;

/* JADX INFO: renamed from: uh.E */
/* JADX INFO: loaded from: classes3.dex */
public final class C20241E implements InterfaceC17873z {

    /* JADX INFO: renamed from: a */
    public final String f64036a;

    /* JADX INFO: renamed from: b */
    public final String f64037b;

    /* JADX INFO: renamed from: c */
    public final C20280p f64038c;

    /* JADX INFO: renamed from: d */
    public final C20279o f64039d;

    /* JADX INFO: renamed from: e */
    public final String f64040e;

    /* JADX INFO: renamed from: f */
    public final ArrayList f64041f;

    /* JADX INFO: renamed from: g */
    public final C5551u f64042g;

    /* JADX INFO: renamed from: h */
    public final String f64043h;

    /* JADX INFO: renamed from: i */
    public final C20239C f64044i;

    /* JADX INFO: renamed from: j */
    public final C20238B f64045j;

    /* JADX INFO: renamed from: k */
    public final String f64046k;

    /* JADX INFO: renamed from: l */
    public final ArrayList f64047l;

    /* JADX INFO: renamed from: m */
    public final C20237A f64048m;

    /* JADX INFO: renamed from: n */
    public final EnumC21216F f64049n;

    public C20241E(String str, String str2, C20280p c20280p, C20279o c20279o, String str3, ArrayList arrayList, C5551u c5551u, String str4, C20239C c20239c, C20238B c20238b, String str5, ArrayList arrayList2, C20237A c20237a, EnumC21216F enumC21216F) {
        this.f64036a = str;
        this.f64037b = str2;
        this.f64038c = c20280p;
        this.f64039d = c20279o;
        this.f64040e = str3;
        this.f64041f = arrayList;
        this.f64042g = c5551u;
        this.f64043h = str4;
        this.f64044i = c20239c;
        this.f64045j = c20238b;
        this.f64046k = str5;
        this.f64047l = arrayList2;
        this.f64048m = c20237a;
        this.f64049n = enumC21216F;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20241E)) {
            return false;
        }
        C20241E c20241e = (C20241E) obj;
        return this.f64036a.equals(c20241e.f64036a) && this.f64037b.equals(c20241e.f64037b) && this.f64038c.equals(c20241e.f64038c) && this.f64039d.equals(c20241e.f64039d) && AbstractC16544l.m18089b(this.f64040e, c20241e.f64040e) && this.f64041f.equals(c20241e.f64041f) && AbstractC16544l.m18089b(this.f64042g, c20241e.f64042g) && AbstractC16544l.m18089b(this.f64043h, c20241e.f64043h) && AbstractC16544l.m18089b(this.f64044i, c20241e.f64044i) && AbstractC16544l.m18089b(this.f64045j, c20241e.f64045j) && AbstractC16544l.m18089b(this.f64046k, c20241e.f64046k) && this.f64047l.equals(c20241e.f64047l) && AbstractC16544l.m18089b(this.f64048m, c20241e.f64048m) && this.f64049n == c20241e.f64049n;
    }

    public final int hashCode() {
        int iHashCode = (this.f64039d.hashCode() + ((this.f64038c.hashCode() + AbstractC0168G.m527p(this.f64036a.hashCode() * 31, 31, this.f64037b)) * 31)) * 31;
        String str = this.f64040e;
        int iHashCode2 = (this.f64041f.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        C5551u c5551u = this.f64042g;
        int iHashCode3 = (iHashCode2 + (c5551u == null ? 0 : c5551u.f18004Y.hashCode())) * 31;
        String str2 = this.f64043h;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        C20239C c20239c = this.f64044i;
        int iHashCode5 = (iHashCode4 + (c20239c == null ? 0 : c20239c.hashCode())) * 31;
        C20238B c20238b = this.f64045j;
        int iHashCode6 = (iHashCode5 + (c20238b == null ? 0 : c20238b.hashCode())) * 31;
        String str3 = this.f64046k;
        int iHashCode7 = (this.f64047l.hashCode() + ((iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31)) * 31;
        C20237A c20237a = this.f64048m;
        return this.f64049n.hashCode() + ((iHashCode7 + (c20237a != null ? c20237a.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "█";
    }
}
