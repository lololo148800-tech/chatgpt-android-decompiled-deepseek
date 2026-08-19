package p1126yd;

import ao.AbstractC11153a0;
import ao.C11131E;
import ao.C11158d;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import p003A1.AbstractC0168G;
import p067Cd.C1630d;
import p1071w0.AbstractC20734X;
import p1155zi.C21977Y0;
import p324Mn.C5551u;
import p559Wn.InterfaceC8975g;
import p597Yd.C10012a;
import p775h2.AbstractC14376f;
import p909nm.C17689w;

/* JADX INFO: renamed from: yd.c */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C21462c {
    public static final C21459b Companion = new C21459b();

    /* JADX INFO: renamed from: l */
    public static final KSerializer[] f68050l = {null, null, null, null, null, null, new C11131E(C21977Y0.f69577a, C21490p.f68101a, 1), new C11158d(C1630d.f4620a, 0), new C11158d(C10012a.f29697a, 0), null, null};

    /* JADX INFO: renamed from: a */
    public final String f68051a;

    /* JADX INFO: renamed from: b */
    public final Boolean f68052b;

    /* JADX INFO: renamed from: c */
    public final String f68053c;

    /* JADX INFO: renamed from: d */
    public final String f68054d;

    /* JADX INFO: renamed from: e */
    public final C5551u f68055e;

    /* JADX INFO: renamed from: f */
    public final C5551u f68056f;

    /* JADX INFO: renamed from: g */
    public final Map f68057g;

    /* JADX INFO: renamed from: h */
    public final List f68058h;

    /* JADX INFO: renamed from: i */
    public final List f68059i;

    /* JADX INFO: renamed from: j */
    public final String f68060j;

    /* JADX INFO: renamed from: k */
    public final String f68061k;

    public C21462c(int i10, String str, Boolean bool, String str2, String str3, C5551u c5551u, C5551u c5551u2, Map map, List list, List list2, String str4, String str5) {
        if (127 != (i10 & 127)) {
            AbstractC11153a0.m12389l(i10, 127, C21456a.f68046a.getDescriptor());
            throw null;
        }
        this.f68051a = str;
        this.f68052b = bool;
        this.f68053c = str2;
        this.f68054d = str3;
        this.f68055e = c5551u;
        this.f68056f = c5551u2;
        this.f68057g = map;
        if ((i10 & 128) == 0) {
            this.f68058h = C17689w.f56480Y;
        } else {
            this.f68058h = list;
        }
        if ((i10 & 256) == 0) {
            this.f68059i = null;
        } else {
            this.f68059i = list2;
        }
        if ((i10 & 512) == 0) {
            this.f68060j = null;
        } else {
            this.f68060j = str4;
        }
        if ((i10 & 1024) == 0) {
            this.f68061k = null;
        } else {
            this.f68061k = str5;
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0079  */
    public final boolean equals(Object obj) {
        boolean zM18089b;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C21462c)) {
            return false;
        }
        C21462c c21462c = (C21462c) obj;
        if (!AbstractC16544l.m18089b(this.f68051a, c21462c.f68051a) || !AbstractC16544l.m18089b(this.f68052b, c21462c.f68052b) || !AbstractC16544l.m18089b(this.f68053c, c21462c.f68053c) || !AbstractC16544l.m18089b(this.f68054d, c21462c.f68054d) || !AbstractC16544l.m18089b(this.f68055e, c21462c.f68055e) || !AbstractC16544l.m18089b(this.f68056f, c21462c.f68056f) || !AbstractC16544l.m18089b(this.f68057g, c21462c.f68057g) || !AbstractC16544l.m18089b(this.f68058h, c21462c.f68058h) || !AbstractC16544l.m18089b(this.f68059i, c21462c.f68059i)) {
            return false;
        }
        String str = this.f68060j;
        String str2 = c21462c.f68060j;
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
        return zM18089b && AbstractC16544l.m18089b(this.f68061k, c21462c.f68061k);
    }

    public final int hashCode() {
        String str = this.f68051a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.f68052b;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.f68053c;
        int iM15858x = AbstractC14376f.m15858x(this.f68058h, AbstractC20734X.m21250u((this.f68056f.f18004Y.hashCode() + ((this.f68055e.f18004Y.hashCode() + AbstractC0168G.m527p((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f68054d)) * 31)) * 31, 31, this.f68057g), 31);
        List list = this.f68059i;
        int iHashCode3 = (iM15858x + (list == null ? 0 : list.hashCode())) * 31;
        String str3 = this.f68060j;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f68061k;
        return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        return "█";
    }
}
