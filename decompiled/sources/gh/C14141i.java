package gh;

import ao.AbstractC11153a0;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import p072Ci.EnumC1711p;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: gh.i */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C14141i {
    public static final C14140h Companion = new C14140h();

    /* JADX INFO: renamed from: j */
    public static final KSerializer[] f44483j = {null, null, null, null, null, null, null, null, EnumC1711p.Companion.serializer()};

    /* JADX INFO: renamed from: a */
    public final Boolean f44484a;

    /* JADX INFO: renamed from: b */
    public final Boolean f44485b;

    /* JADX INFO: renamed from: c */
    public final Boolean f44486c;

    /* JADX INFO: renamed from: d */
    public final Boolean f44487d;

    /* JADX INFO: renamed from: e */
    public final Boolean f44488e;

    /* JADX INFO: renamed from: f */
    public final String f44489f;

    /* JADX INFO: renamed from: g */
    public final String f44490g;

    /* JADX INFO: renamed from: h */
    public final Boolean f44491h;

    /* JADX INFO: renamed from: i */
    public final EnumC1711p f44492i;

    public /* synthetic */ C14141i(int i10, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, String str, String str2, Boolean bool6, EnumC1711p enumC1711p) {
        if (256 != (i10 & 256)) {
            AbstractC11153a0.m12389l(i10, 256, C14139g.f44482a.getDescriptor());
            throw null;
        }
        if ((i10 & 1) == 0) {
            this.f44484a = null;
        } else {
            this.f44484a = bool;
        }
        if ((i10 & 2) == 0) {
            this.f44485b = null;
        } else {
            this.f44485b = bool2;
        }
        if ((i10 & 4) == 0) {
            this.f44486c = null;
        } else {
            this.f44486c = bool3;
        }
        if ((i10 & 8) == 0) {
            this.f44487d = null;
        } else {
            this.f44487d = bool4;
        }
        if ((i10 & 16) == 0) {
            this.f44488e = null;
        } else {
            this.f44488e = bool5;
        }
        if ((i10 & 32) == 0) {
            this.f44489f = null;
        } else {
            this.f44489f = str;
        }
        if ((i10 & 64) == 0) {
            this.f44490g = null;
        } else {
            this.f44490g = str2;
        }
        if ((i10 & 128) == 0) {
            this.f44491h = null;
        } else {
            this.f44491h = bool6;
        }
        this.f44492i = enumC1711p;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14141i)) {
            return false;
        }
        C14141i c14141i = (C14141i) obj;
        return AbstractC16544l.m18089b(this.f44484a, c14141i.f44484a) && AbstractC16544l.m18089b(this.f44485b, c14141i.f44485b) && AbstractC16544l.m18089b(this.f44486c, c14141i.f44486c) && AbstractC16544l.m18089b(this.f44487d, c14141i.f44487d) && AbstractC16544l.m18089b(this.f44488e, c14141i.f44488e) && AbstractC16544l.m18089b(this.f44489f, c14141i.f44489f) && AbstractC16544l.m18089b(this.f44490g, c14141i.f44490g) && AbstractC16544l.m18089b(this.f44491h, c14141i.f44491h) && this.f44492i == c14141i.f44492i;
    }

    public final int hashCode() {
        Boolean bool = this.f44484a;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.f44485b;
        int iHashCode2 = (iHashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.f44486c;
        int iHashCode3 = (iHashCode2 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.f44487d;
        int iHashCode4 = (iHashCode3 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.f44488e;
        int iHashCode5 = (iHashCode4 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        String str = this.f44489f;
        int iHashCode6 = (iHashCode5 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f44490g;
        int iHashCode7 = (iHashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool6 = this.f44491h;
        int iHashCode8 = (iHashCode7 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        EnumC1711p enumC1711p = this.f44492i;
        return iHashCode8 + (enumC1711p != null ? enumC1711p.hashCode() : 0);
    }

    public final String toString() {
        return "█";
    }
}
