package eg;

import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import p559Wn.InterfaceC8975g;
import p872lg.EnumC16949i;

/* JADX INFO: renamed from: eg.i */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C13386i {
    public static final C13385h Companion = new C13385h();

    /* JADX INFO: renamed from: g */
    public static final KSerializer[] f42426g = {null, null, null, null, null, EnumC16949i.Companion.serializer()};

    /* JADX INFO: renamed from: a */
    public final String f42427a;

    /* JADX INFO: renamed from: b */
    public final String f42428b;

    /* JADX INFO: renamed from: c */
    public final String f42429c;

    /* JADX INFO: renamed from: d */
    public final boolean f42430d;

    /* JADX INFO: renamed from: e */
    public final String f42431e;

    /* JADX INFO: renamed from: f */
    public final EnumC16949i f42432f;

    public /* synthetic */ C13386i(int i10, String str, String str2, String str3, boolean z6, String str4, EnumC16949i enumC16949i) {
        if ((i10 & 1) == 0) {
            this.f42427a = null;
        } else {
            this.f42427a = str;
        }
        if ((i10 & 2) == 0) {
            this.f42428b = null;
        } else {
            this.f42428b = str2;
        }
        if ((i10 & 4) == 0) {
            this.f42429c = null;
        } else {
            this.f42429c = str3;
        }
        if ((i10 & 8) == 0) {
            this.f42430d = false;
        } else {
            this.f42430d = z6;
        }
        if ((i10 & 16) == 0) {
            this.f42431e = null;
        } else {
            this.f42431e = str4;
        }
        if ((i10 & 32) == 0) {
            this.f42432f = EnumC16949i.f54400Z;
        } else {
            this.f42432f = enumC16949i;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13386i)) {
            return false;
        }
        C13386i c13386i = (C13386i) obj;
        return AbstractC16544l.m18089b(this.f42427a, c13386i.f42427a) && AbstractC16544l.m18089b(this.f42428b, c13386i.f42428b) && AbstractC16544l.m18089b(this.f42429c, c13386i.f42429c) && this.f42430d == c13386i.f42430d && AbstractC16544l.m18089b(this.f42431e, c13386i.f42431e) && this.f42432f == c13386i.f42432f;
    }

    public final int hashCode() {
        String str = this.f42427a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f42428b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f42429c;
        int iHashCode3 = (((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + (this.f42430d ? 1231 : 1237)) * 31;
        String str4 = this.f42431e;
        return this.f42432f.hashCode() + ((iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "█";
    }
}
